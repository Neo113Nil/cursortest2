package defpackage;

import android.os.Build;
import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import java.util.ArrayList;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class y61 {
    public boolean OPXfSBeufaJ8;
    public long PxuCJdSBwIXG;
    public boolean rtx2ld2ELZv4;
    public bf1 wdg6QnbFHrFF;
    public final SparseLongArray lS5Rgt96tfkO = new SparseLongArray();
    public final SparseBooleanArray TSizfFm2Yiuu = new SparseBooleanArray();
    public final ArrayList Y1f8riQaR6yg = new ArrayList();
    public final p31 e9gEMXR7LXtO = new p31();
    public int a92UlCVFR9N8 = -1;
    public int RAsUl2FVSrh6 = -1;

    public final void PxuCJdSBwIXG(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        SparseLongArray sparseLongArray = this.lS5Rgt96tfkO;
        if (actionMasked != 0 && actionMasked != 5) {
            if (actionMasked != 9) {
                return;
            }
            int pointerId = motionEvent.getPointerId(0);
            if (sparseLongArray.indexOfKey(pointerId) < 0) {
                long j = this.PxuCJdSBwIXG;
                this.PxuCJdSBwIXG = 1 + j;
                sparseLongArray.put(pointerId, j);
                return;
            }
            return;
        }
        int actionIndex = motionEvent.getActionIndex();
        int pointerId2 = motionEvent.getPointerId(actionIndex);
        if (sparseLongArray.indexOfKey(pointerId2) < 0) {
            long j2 = this.PxuCJdSBwIXG;
            this.PxuCJdSBwIXG = 1 + j2;
            sparseLongArray.put(pointerId2, j2);
            if (motionEvent.getToolType(actionIndex) == 3) {
                this.TSizfFm2Yiuu.put(pointerId2, true);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
    
        if (r0 == 5) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final op0 TSizfFm2Yiuu(MotionEvent motionEvent, r1 r1Var) {
        int i;
        int classification;
        float rawX;
        float rawY;
        boolean z;
        int classification2;
        int classification3;
        int actionMasked = motionEvent.getActionMasked();
        SparseBooleanArray sparseBooleanArray = this.TSizfFm2Yiuu;
        if (actionMasked == 3 || actionMasked == 4) {
            this.lS5Rgt96tfkO.clear();
            sparseBooleanArray.clear();
            this.rtx2ld2ELZv4 = false;
            this.OPXfSBeufaJ8 = false;
            this.wdg6QnbFHrFF = null;
            return null;
        }
        lS5Rgt96tfkO(motionEvent);
        PxuCJdSBwIXG(motionEvent);
        boolean z2 = actionMasked == 9 || actionMasked == 7 || actionMasked == 10;
        boolean z3 = actionMasked == 8;
        if (z2) {
            sparseBooleanArray.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
        }
        if (actionMasked != 1) {
            i = actionMasked != 6 ? -1 : motionEvent.getActionIndex();
        } else {
            i = 0;
        }
        ArrayList arrayList = this.Y1f8riQaR6yg;
        arrayList.clear();
        if (motionEvent.getActionMasked() == 0) {
            if (Build.VERSION.SDK_INT >= 34) {
                classification2 = motionEvent.getClassification();
                if (classification2 != 3) {
                    classification3 = motionEvent.getClassification();
                }
                z = true;
                boolean z4 = motionEvent.getButtonState() != 0 && (motionEvent.isFromSource(8194) || motionEvent.isFromSource(1048584));
                if (!z || z4) {
                    this.rtx2ld2ELZv4 = true;
                }
            }
            z = false;
            if (motionEvent.getButtonState() != 0) {
            }
            if (!z) {
            }
            this.rtx2ld2ELZv4 = true;
        }
        if (Build.VERSION.SDK_INT >= 34) {
            classification = motionEvent.getClassification();
            if (classification == 3) {
                this.OPXfSBeufaJ8 = true;
                if (motionEvent.getActionMasked() == 0) {
                    rawX = motionEvent.getRawX(0);
                    rawY = motionEvent.getRawY(0);
                    this.wdg6QnbFHrFF = new bf1((Float.floatToRawIntBits(rawY) & 4294967295L) | (Float.floatToRawIntBits(rawX) << 32));
                }
                arrayList.add(Y1f8riQaR6yg(r1Var, motionEvent, this.wdg6QnbFHrFF, 0, false));
                if (motionEvent.getActionMasked() == 1) {
                    this.rtx2ld2ELZv4 = false;
                    this.OPXfSBeufaJ8 = false;
                    this.wdg6QnbFHrFF = null;
                }
                e9gEMXR7LXtO(motionEvent);
                motionEvent.getEventTime();
                return new op0(29, arrayList, motionEvent);
            }
        }
        this.OPXfSBeufaJ8 = false;
        int pointerCount = motionEvent.getPointerCount();
        int i2 = 0;
        while (i2 < pointerCount) {
            arrayList.add(Y1f8riQaR6yg(r1Var, motionEvent, null, i2, (z2 || i2 == i || (z3 && motionEvent.getButtonState() == 0)) ? false : true));
            i2++;
        }
        if (motionEvent.getActionMasked() == 1) {
        }
        e9gEMXR7LXtO(motionEvent);
        motionEvent.getEventTime();
        return new op0(29, arrayList, motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01b0 A[EDGE_INSN: B:44:0x01b0->B:45:0x01b0 BREAK  A[LOOP:0: B:21:0x0111->B:40:0x01a7], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final co1 Y1f8riQaR6yg(r1 r1Var, MotionEvent motionEvent, bf1 bf1Var, int i, boolean z) {
        long j;
        long j2;
        long VhhvGxCb8gfr;
        long j3;
        float rawX;
        float rawY;
        long floatToRawIntBits;
        long tmVwIGCQF4zR;
        boolean z2;
        int toolType;
        int i2;
        int historySize;
        int i3;
        long j4;
        float f;
        long j5;
        int i4;
        long j6;
        int classification;
        int classification2;
        Float valueOf;
        int i5;
        int classification3;
        boolean z3;
        boolean z4;
        int pointerId = motionEvent.getPointerId(i);
        SparseLongArray sparseLongArray = this.lS5Rgt96tfkO;
        int indexOfKey = sparseLongArray.indexOfKey(pointerId);
        if (indexOfKey >= 0) {
            j = sparseLongArray.valueAt(indexOfKey);
        } else {
            long j7 = this.PxuCJdSBwIXG;
            this.PxuCJdSBwIXG = 1 + j7;
            sparseLongArray.put(pointerId, j7);
            j = j7;
        }
        float pressure = motionEvent.getPressure(i);
        long floatToRawIntBits2 = (Float.floatToRawIntBits(motionEvent.getY(i)) & 4294967295L) | (Float.floatToRawIntBits(motionEvent.getX(i)) << 32);
        if (i == 0) {
            if (bf1Var != null) {
                VhhvGxCb8gfr = bf1Var.PxuCJdSBwIXG;
                z4 = 32;
                j2 = 4294967295L;
            } else {
                float rawX2 = motionEvent.getRawX();
                float rawY2 = motionEvent.getRawY();
                long floatToRawIntBits3 = Float.floatToRawIntBits(rawX2);
                int floatToRawIntBits4 = Float.floatToRawIntBits(rawY2);
                z4 = 32;
                j2 = 4294967295L;
                VhhvGxCb8gfr = (floatToRawIntBits3 << 32) | (floatToRawIntBits4 & 4294967295L);
            }
            tmVwIGCQF4zR = r1Var.tmVwIGCQF4zR(VhhvGxCb8gfr);
            z3 = z4;
        } else {
            boolean z5 = 32;
            j2 = 4294967295L;
            if (Build.VERSION.SDK_INT < 29) {
                VhhvGxCb8gfr = r1Var.VhhvGxCb8gfr(floatToRawIntBits2);
                j3 = floatToRawIntBits2;
                z2 = z5;
                toolType = motionEvent.getToolType(i);
                if (toolType == 0) {
                    int i6 = 2;
                    if (toolType != 1) {
                        if (toolType != 2) {
                            if (toolType != 3) {
                                i6 = 4;
                                if (toolType != 4) {
                                    ho1.Companion.getClass();
                                } else {
                                    ho1.Companion.getClass();
                                }
                            } else {
                                ho1.Companion.getClass();
                            }
                            i2 = i6;
                        } else {
                            ho1.Companion.getClass();
                            i2 = 3;
                        }
                    } else if ((motionEvent.isFromSource(8194) || motionEvent.isFromSource(1048584)) && (!this.rtx2ld2ELZv4 || this.OPXfSBeufaJ8)) {
                        ho1.Companion.getClass();
                        i2 = i6;
                    } else {
                        ho1.Companion.getClass();
                        i2 = 1;
                    }
                    ArrayList arrayList = new ArrayList(motionEvent.getHistorySize());
                    historySize = motionEvent.getHistorySize();
                    boolean z6 = z2;
                    i3 = 0;
                    while (true) {
                        j4 = 0;
                        if (i3 >= historySize) {
                            break;
                        }
                        float historicalX = motionEvent.getHistoricalX(i, i3);
                        float historicalY = motionEvent.getHistoricalY(i, i3);
                        if ((Float.floatToRawIntBits(historicalX) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(historicalY) & Integer.MAX_VALUE) >= 2139095040) {
                            i5 = historySize;
                        } else {
                            long floatToRawIntBits5 = Float.floatToRawIntBits(historicalX);
                            int floatToRawIntBits6 = Float.floatToRawIntBits(historicalY);
                            i5 = historySize;
                            long j8 = (floatToRawIntBits5 << (z6 ? 1L : 0L)) | (floatToRawIntBits6 & j2);
                            long historicalEventTime = motionEvent.getHistoricalEventTime(i3);
                            float historicalAxisValue = motionEvent.getHistoricalAxisValue(52, i, i3);
                            valueOf = historicalAxisValue > 0.0f ? Float.valueOf(historicalAxisValue) : null;
                            float floatValue = valueOf != null ? valueOf.floatValue() : 1.0f;
                            if (Build.VERSION.SDK_INT >= 29) {
                                classification3 = motionEvent.getClassification();
                                if (classification3 == 3) {
                                    j4 = (Float.floatToRawIntBits(motionEvent.getHistoricalAxisValue(50, i, i3)) << (z6 ? 1L : 0L)) | (Float.floatToRawIntBits(motionEvent.getHistoricalAxisValue(51, i, i3)) & j2);
                                    arrayList.add(new vj0(historicalEventTime, j8, floatValue, j4, j8));
                                }
                            }
                            bf1.Companion.getClass();
                            arrayList.add(new vj0(historicalEventTime, j8, floatValue, j4, j8));
                        }
                        i3++;
                        historySize = i5;
                    }
                    if (motionEvent.getActionMasked() == 8) {
                        j5 = (Float.floatToRawIntBits(motionEvent.getAxisValue(10)) << (z6 ? 1L : 0L)) | (Float.floatToRawIntBits((-motionEvent.getAxisValue(9)) + 0.0f) & j2);
                    } else {
                        bf1.Companion.getClass();
                        j5 = 0;
                    }
                    i4 = Build.VERSION.SDK_INT;
                    if (i4 >= 29) {
                        classification2 = motionEvent.getClassification();
                        if (classification2 == 5) {
                            float axisValue = motionEvent.getAxisValue(52, i);
                            valueOf = axisValue > 0.0f ? Float.valueOf(axisValue) : null;
                            if (valueOf != null) {
                                f = valueOf.floatValue();
                            }
                        }
                    }
                    float f2 = f;
                    if (i4 >= 29) {
                        classification = motionEvent.getClassification();
                        if (classification == 3) {
                            j6 = floatToRawIntBits2;
                            j4 = (Float.floatToRawIntBits(motionEvent.getAxisValue(50, i)) << (z6 ? 1L : 0L)) | (Float.floatToRawIntBits(motionEvent.getAxisValue(51, i)) & j2);
                            return new co1(j, motionEvent.getEventTime(), VhhvGxCb8gfr, j3, z, pressure, i2, this.TSizfFm2Yiuu.get(motionEvent.getPointerId(i), false), arrayList, j5, f2, j4, j6);
                        }
                    }
                    j6 = floatToRawIntBits2;
                    bf1.Companion.getClass();
                    return new co1(j, motionEvent.getEventTime(), VhhvGxCb8gfr, j3, z, pressure, i2, this.TSizfFm2Yiuu.get(motionEvent.getPointerId(i), false), arrayList, j5, f2, j4, j6);
                }
                ho1.Companion.getClass();
                i2 = 0;
                ArrayList arrayList2 = new ArrayList(motionEvent.getHistorySize());
                historySize = motionEvent.getHistorySize();
                boolean z62 = z2;
                i3 = 0;
                while (true) {
                    j4 = 0;
                    if (i3 >= historySize) {
                    }
                    i3++;
                    historySize = i5;
                }
                if (motionEvent.getActionMasked() == 8) {
                }
                i4 = Build.VERSION.SDK_INT;
                if (i4 >= 29) {
                }
                float f22 = f;
                if (i4 >= 29) {
                }
                j6 = floatToRawIntBits2;
                bf1.Companion.getClass();
                return new co1(j, motionEvent.getEventTime(), VhhvGxCb8gfr, j3, z, pressure, i2, this.TSizfFm2Yiuu.get(motionEvent.getPointerId(i), false), arrayList2, j5, f22, j4, j6);
            }
            if (bf1Var != null) {
                floatToRawIntBits = bf1Var.PxuCJdSBwIXG;
            } else {
                rawX = motionEvent.getRawX(i);
                rawY = motionEvent.getRawY(i);
                floatToRawIntBits = (Float.floatToRawIntBits(rawX) << 32) | (Float.floatToRawIntBits(rawY) & 4294967295L);
            }
            VhhvGxCb8gfr = floatToRawIntBits;
            tmVwIGCQF4zR = r1Var.tmVwIGCQF4zR(VhhvGxCb8gfr);
            z3 = z5;
        }
        j3 = tmVwIGCQF4zR;
        z2 = z3;
        toolType = motionEvent.getToolType(i);
        if (toolType == 0) {
        }
        i2 = 0;
        ArrayList arrayList22 = new ArrayList(motionEvent.getHistorySize());
        historySize = motionEvent.getHistorySize();
        boolean z622 = z2;
        i3 = 0;
        while (true) {
            j4 = 0;
            if (i3 >= historySize) {
            }
            i3++;
            historySize = i5;
        }
        if (motionEvent.getActionMasked() == 8) {
        }
        i4 = Build.VERSION.SDK_INT;
        if (i4 >= 29) {
        }
        float f222 = f;
        if (i4 >= 29) {
        }
        j6 = floatToRawIntBits2;
        bf1.Companion.getClass();
        return new co1(j, motionEvent.getEventTime(), VhhvGxCb8gfr, j3, z, pressure, i2, this.TSizfFm2Yiuu.get(motionEvent.getPointerId(i), false), arrayList22, j5, f222, j4, j6);
    }

    public final void e9gEMXR7LXtO(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        SparseBooleanArray sparseBooleanArray = this.TSizfFm2Yiuu;
        SparseLongArray sparseLongArray = this.lS5Rgt96tfkO;
        if (actionMasked == 1 || actionMasked == 6) {
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            if (!sparseBooleanArray.get(pointerId, false)) {
                sparseLongArray.delete(pointerId);
                sparseBooleanArray.delete(pointerId);
            }
        }
        if (sparseLongArray.size() > motionEvent.getPointerCount()) {
            for (int size = sparseLongArray.size() - 1; -1 < size; size--) {
                int keyAt = sparseLongArray.keyAt(size);
                int pointerCount = motionEvent.getPointerCount();
                int i = 0;
                while (true) {
                    if (i >= pointerCount) {
                        sparseLongArray.removeAt(size);
                        sparseBooleanArray.delete(keyAt);
                        break;
                    } else if (motionEvent.getPointerId(i) == keyAt) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
    }

    public final void lS5Rgt96tfkO(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != 1) {
            return;
        }
        int toolType = motionEvent.getToolType(0);
        int source = motionEvent.getSource();
        if (toolType == this.a92UlCVFR9N8 && source == this.RAsUl2FVSrh6) {
            return;
        }
        this.a92UlCVFR9N8 = toolType;
        this.RAsUl2FVSrh6 = source;
        this.TSizfFm2Yiuu.clear();
        this.lS5Rgt96tfkO.clear();
    }
}
