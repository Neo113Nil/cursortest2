package androidx.recyclerview.widget;

import androidx.recyclerview.widget.AdapterHelper;
import java.util.List;

/* loaded from: classes.dex */
class OpReorderer {
    final Callback mCallback;

    interface Callback {
        AdapterHelper.UpdateOp obtainUpdateOp(int i8, int i9, int i10, Object obj);

        void recycleUpdateOp(AdapterHelper.UpdateOp updateOp);
    }

    OpReorderer(Callback callback) {
        this.mCallback = callback;
    }

    private int getLastMoveOutOfOrder(List<AdapterHelper.UpdateOp> list) {
        boolean z7 = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (list.get(size).cmd != 8) {
                z7 = true;
            } else if (z7) {
                return size;
            }
        }
        return -1;
    }

    private void swapMoveAdd(List<AdapterHelper.UpdateOp> list, int i8, AdapterHelper.UpdateOp updateOp, int i9, AdapterHelper.UpdateOp updateOp2) {
        int i10 = updateOp.itemCount;
        int i11 = updateOp2.positionStart;
        int i12 = i10 < i11 ? -1 : 0;
        int i13 = updateOp.positionStart;
        if (i13 < i11) {
            i12++;
        }
        if (i11 <= i13) {
            updateOp.positionStart = i13 + updateOp2.itemCount;
        }
        int i14 = updateOp2.positionStart;
        if (i14 <= i10) {
            updateOp.itemCount = i10 + updateOp2.itemCount;
        }
        updateOp2.positionStart = i14 + i12;
        list.set(i8, updateOp2);
        list.set(i9, updateOp);
    }

    private void swapMoveOp(List<AdapterHelper.UpdateOp> list, int i8, int i9) {
        AdapterHelper.UpdateOp updateOp = list.get(i8);
        AdapterHelper.UpdateOp updateOp2 = list.get(i9);
        int i10 = updateOp2.cmd;
        if (i10 == 1) {
            swapMoveAdd(list, i8, updateOp, i9, updateOp2);
        } else if (i10 == 2) {
            swapMoveRemove(list, i8, updateOp, i9, updateOp2);
        } else {
            if (i10 != 4) {
                return;
            }
            swapMoveUpdate(list, i8, updateOp, i9, updateOp2);
        }
    }

    void reorderOps(List<AdapterHelper.UpdateOp> list) {
        while (true) {
            int lastMoveOutOfOrder = getLastMoveOutOfOrder(list);
            if (lastMoveOutOfOrder == -1) {
                return;
            } else {
                swapMoveOp(list, lastMoveOutOfOrder, lastMoveOutOfOrder + 1);
            }
        }
    }

    void swapMoveRemove(List<AdapterHelper.UpdateOp> list, int i8, AdapterHelper.UpdateOp updateOp, int i9, AdapterHelper.UpdateOp updateOp2) {
        boolean z7;
        int i10 = updateOp.positionStart;
        int i11 = updateOp.itemCount;
        boolean z8 = false;
        if (i10 < i11) {
            if (updateOp2.positionStart == i10 && updateOp2.itemCount == i11 - i10) {
                z7 = false;
                z8 = true;
            } else {
                z7 = false;
            }
        } else if (updateOp2.positionStart == i11 + 1 && updateOp2.itemCount == i10 - i11) {
            z7 = true;
            z8 = true;
        } else {
            z7 = true;
        }
        int i12 = updateOp2.positionStart;
        if (i11 < i12) {
            updateOp2.positionStart = i12 - 1;
        } else {
            int i13 = updateOp2.itemCount;
            if (i11 < i12 + i13) {
                updateOp2.itemCount = i13 - 1;
                updateOp.cmd = 2;
                updateOp.itemCount = 1;
                if (updateOp2.itemCount == 0) {
                    list.remove(i9);
                    this.mCallback.recycleUpdateOp(updateOp2);
                    return;
                }
                return;
            }
        }
        int i14 = updateOp.positionStart;
        int i15 = updateOp2.positionStart;
        AdapterHelper.UpdateOp updateOp3 = null;
        if (i14 <= i15) {
            updateOp2.positionStart = i15 + 1;
        } else {
            int i16 = updateOp2.itemCount;
            if (i14 < i15 + i16) {
                updateOp3 = this.mCallback.obtainUpdateOp(2, i14 + 1, (i15 + i16) - i14, null);
                updateOp2.itemCount = updateOp.positionStart - updateOp2.positionStart;
            }
        }
        if (z8) {
            list.set(i8, updateOp2);
            list.remove(i9);
            this.mCallback.recycleUpdateOp(updateOp);
            return;
        }
        if (z7) {
            if (updateOp3 != null) {
                int i17 = updateOp.positionStart;
                if (i17 > updateOp3.positionStart) {
                    updateOp.positionStart = i17 - updateOp3.itemCount;
                }
                int i18 = updateOp.itemCount;
                if (i18 > updateOp3.positionStart) {
                    updateOp.itemCount = i18 - updateOp3.itemCount;
                }
            }
            int i19 = updateOp.positionStart;
            if (i19 > updateOp2.positionStart) {
                updateOp.positionStart = i19 - updateOp2.itemCount;
            }
            int i20 = updateOp.itemCount;
            if (i20 > updateOp2.positionStart) {
                updateOp.itemCount = i20 - updateOp2.itemCount;
            }
        } else {
            if (updateOp3 != null) {
                int i21 = updateOp.positionStart;
                if (i21 >= updateOp3.positionStart) {
                    updateOp.positionStart = i21 - updateOp3.itemCount;
                }
                int i22 = updateOp.itemCount;
                if (i22 >= updateOp3.positionStart) {
                    updateOp.itemCount = i22 - updateOp3.itemCount;
                }
            }
            int i23 = updateOp.positionStart;
            if (i23 >= updateOp2.positionStart) {
                updateOp.positionStart = i23 - updateOp2.itemCount;
            }
            int i24 = updateOp.itemCount;
            if (i24 >= updateOp2.positionStart) {
                updateOp.itemCount = i24 - updateOp2.itemCount;
            }
        }
        list.set(i8, updateOp2);
        if (updateOp.positionStart != updateOp.itemCount) {
            list.set(i9, updateOp);
        } else {
            list.remove(i9);
        }
        if (updateOp3 != null) {
            list.add(i8, updateOp3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void swapMoveUpdate(List<AdapterHelper.UpdateOp> list, int i8, AdapterHelper.UpdateOp updateOp, int i9, AdapterHelper.UpdateOp updateOp2) {
        AdapterHelper.UpdateOp obtainUpdateOp;
        int i10;
        int i11;
        int i12 = updateOp.itemCount;
        int i13 = updateOp2.positionStart;
        AdapterHelper.UpdateOp updateOp3 = null;
        if (i12 < i13) {
            updateOp2.positionStart = i13 - 1;
        } else {
            int i14 = updateOp2.itemCount;
            if (i12 < i13 + i14) {
                updateOp2.itemCount = i14 - 1;
                obtainUpdateOp = this.mCallback.obtainUpdateOp(4, updateOp.positionStart, 1, updateOp2.payload);
                i10 = updateOp.positionStart;
                i11 = updateOp2.positionStart;
                if (i10 > i11) {
                    updateOp2.positionStart = i11 + 1;
                } else {
                    int i15 = updateOp2.itemCount;
                    if (i10 < i11 + i15) {
                        int i16 = (i11 + i15) - i10;
                        updateOp3 = this.mCallback.obtainUpdateOp(4, i10 + 1, i16, updateOp2.payload);
                        updateOp2.itemCount -= i16;
                    }
                }
                list.set(i9, updateOp);
                if (updateOp2.itemCount <= 0) {
                    list.set(i8, updateOp2);
                } else {
                    list.remove(i8);
                    this.mCallback.recycleUpdateOp(updateOp2);
                }
                if (obtainUpdateOp != null) {
                    list.add(i8, obtainUpdateOp);
                }
                if (updateOp3 == null) {
                    list.add(i8, updateOp3);
                    return;
                }
                return;
            }
        }
        obtainUpdateOp = null;
        i10 = updateOp.positionStart;
        i11 = updateOp2.positionStart;
        if (i10 > i11) {
        }
        list.set(i9, updateOp);
        if (updateOp2.itemCount <= 0) {
        }
        if (obtainUpdateOp != null) {
        }
        if (updateOp3 == null) {
        }
    }
}
