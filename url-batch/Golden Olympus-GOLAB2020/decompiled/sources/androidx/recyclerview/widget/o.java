package androidx.recyclerview.widget;

import androidx.recyclerview.widget.a;
import java.util.List;

/* loaded from: classes.dex */
class o {

    /* renamed from: a, reason: collision with root package name */
    final a f13170a;

    interface a {
        void a(a.b bVar);

        a.b b(int i4, int i5, int i6, Object obj);
    }

    o(a aVar) {
        this.f13170a = aVar;
    }

    private int a(List list) {
        boolean z4 = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (((a.b) list.get(size)).f12991a != 8) {
                z4 = true;
            } else if (z4) {
                return size;
            }
        }
        return -1;
    }

    private void c(List list, int i4, a.b bVar, int i5, a.b bVar2) {
        int i6 = bVar.f12994d;
        int i7 = bVar2.f12992b;
        int i8 = i6 < i7 ? -1 : 0;
        int i9 = bVar.f12992b;
        if (i9 < i7) {
            i8++;
        }
        if (i7 <= i9) {
            bVar.f12992b = i9 + bVar2.f12994d;
        }
        int i10 = bVar2.f12992b;
        if (i10 <= i6) {
            bVar.f12994d = i6 + bVar2.f12994d;
        }
        bVar2.f12992b = i10 + i8;
        list.set(i4, bVar2);
        list.set(i5, bVar);
    }

    private void d(List list, int i4, int i5) {
        a.b bVar = (a.b) list.get(i4);
        a.b bVar2 = (a.b) list.get(i5);
        int i6 = bVar2.f12991a;
        if (i6 == 1) {
            c(list, i4, bVar, i5, bVar2);
        } else if (i6 == 2) {
            e(list, i4, bVar, i5, bVar2);
        } else {
            if (i6 != 4) {
                return;
            }
            f(list, i4, bVar, i5, bVar2);
        }
    }

    void b(List list) {
        while (true) {
            int a4 = a(list);
            if (a4 == -1) {
                return;
            } else {
                d(list, a4, a4 + 1);
            }
        }
    }

    void e(List list, int i4, a.b bVar, int i5, a.b bVar2) {
        boolean z4;
        int i6 = bVar.f12992b;
        int i7 = bVar.f12994d;
        boolean z5 = false;
        if (i6 < i7) {
            if (bVar2.f12992b == i6 && bVar2.f12994d == i7 - i6) {
                z4 = false;
                z5 = true;
            } else {
                z4 = false;
            }
        } else if (bVar2.f12992b == i7 + 1 && bVar2.f12994d == i6 - i7) {
            z4 = true;
            z5 = true;
        } else {
            z4 = true;
        }
        int i8 = bVar2.f12992b;
        if (i7 < i8) {
            bVar2.f12992b = i8 - 1;
        } else {
            int i9 = bVar2.f12994d;
            if (i7 < i8 + i9) {
                bVar2.f12994d = i9 - 1;
                bVar.f12991a = 2;
                bVar.f12994d = 1;
                if (bVar2.f12994d == 0) {
                    list.remove(i5);
                    this.f13170a.a(bVar2);
                    return;
                }
                return;
            }
        }
        int i10 = bVar.f12992b;
        int i11 = bVar2.f12992b;
        a.b bVar3 = null;
        if (i10 <= i11) {
            bVar2.f12992b = i11 + 1;
        } else {
            int i12 = bVar2.f12994d;
            if (i10 < i11 + i12) {
                bVar3 = this.f13170a.b(2, i10 + 1, (i11 + i12) - i10, null);
                bVar2.f12994d = bVar.f12992b - bVar2.f12992b;
            }
        }
        if (z5) {
            list.set(i4, bVar2);
            list.remove(i5);
            this.f13170a.a(bVar);
            return;
        }
        if (z4) {
            if (bVar3 != null) {
                int i13 = bVar.f12992b;
                if (i13 > bVar3.f12992b) {
                    bVar.f12992b = i13 - bVar3.f12994d;
                }
                int i14 = bVar.f12994d;
                if (i14 > bVar3.f12992b) {
                    bVar.f12994d = i14 - bVar3.f12994d;
                }
            }
            int i15 = bVar.f12992b;
            if (i15 > bVar2.f12992b) {
                bVar.f12992b = i15 - bVar2.f12994d;
            }
            int i16 = bVar.f12994d;
            if (i16 > bVar2.f12992b) {
                bVar.f12994d = i16 - bVar2.f12994d;
            }
        } else {
            if (bVar3 != null) {
                int i17 = bVar.f12992b;
                if (i17 >= bVar3.f12992b) {
                    bVar.f12992b = i17 - bVar3.f12994d;
                }
                int i18 = bVar.f12994d;
                if (i18 >= bVar3.f12992b) {
                    bVar.f12994d = i18 - bVar3.f12994d;
                }
            }
            int i19 = bVar.f12992b;
            if (i19 >= bVar2.f12992b) {
                bVar.f12992b = i19 - bVar2.f12994d;
            }
            int i20 = bVar.f12994d;
            if (i20 >= bVar2.f12992b) {
                bVar.f12994d = i20 - bVar2.f12994d;
            }
        }
        list.set(i4, bVar2);
        if (bVar.f12992b != bVar.f12994d) {
            list.set(i5, bVar);
        } else {
            list.remove(i5);
        }
        if (bVar3 != null) {
            list.add(i4, bVar3);
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
    void f(List list, int i4, a.b bVar, int i5, a.b bVar2) {
        a.b b4;
        int i6;
        int i7;
        int i8 = bVar.f12994d;
        int i9 = bVar2.f12992b;
        a.b bVar3 = null;
        if (i8 < i9) {
            bVar2.f12992b = i9 - 1;
        } else {
            int i10 = bVar2.f12994d;
            if (i8 < i9 + i10) {
                bVar2.f12994d = i10 - 1;
                b4 = this.f13170a.b(4, bVar.f12992b, 1, bVar2.f12993c);
                i6 = bVar.f12992b;
                i7 = bVar2.f12992b;
                if (i6 > i7) {
                    bVar2.f12992b = i7 + 1;
                } else {
                    int i11 = bVar2.f12994d;
                    if (i6 < i7 + i11) {
                        int i12 = (i7 + i11) - i6;
                        bVar3 = this.f13170a.b(4, i6 + 1, i12, bVar2.f12993c);
                        bVar2.f12994d -= i12;
                    }
                }
                list.set(i5, bVar);
                if (bVar2.f12994d <= 0) {
                    list.set(i4, bVar2);
                } else {
                    list.remove(i4);
                    this.f13170a.a(bVar2);
                }
                if (b4 != null) {
                    list.add(i4, b4);
                }
                if (bVar3 == null) {
                    list.add(i4, bVar3);
                    return;
                }
                return;
            }
        }
        b4 = null;
        i6 = bVar.f12992b;
        i7 = bVar2.f12992b;
        if (i6 > i7) {
        }
        list.set(i5, bVar);
        if (bVar2.f12994d <= 0) {
        }
        if (b4 != null) {
        }
        if (bVar3 == null) {
        }
    }
}
