package defpackage;

import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import java.util.ArrayList;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class lm0 {
    public long a;
    public final SparseLongArray b = new SparseLongArray();
    public final SparseBooleanArray c = new SparseBooleanArray();
    public final ArrayList d = new ArrayList();
    public final aj0 e = new aj0();
    public int f = -1;
    public int g = -1;

    public final void a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        SparseLongArray sparseLongArray = this.b;
        if (actionMasked != 0 && actionMasked != 5) {
            if (actionMasked != 9) {
                return;
            }
            int pointerId = motionEvent.getPointerId(0);
            if (sparseLongArray.indexOfKey(pointerId) < 0) {
                long j = this.a;
                this.a = 1 + j;
                sparseLongArray.put(pointerId, j);
                return;
            }
            return;
        }
        int actionIndex = motionEvent.getActionIndex();
        int pointerId2 = motionEvent.getPointerId(actionIndex);
        if (sparseLongArray.indexOfKey(pointerId2) < 0) {
            long j2 = this.a;
            this.a = 1 + j2;
            sparseLongArray.put(pointerId2, j2);
            if (motionEvent.getToolType(actionIndex) == 3) {
                this.c.put(pointerId2, true);
            }
        }
    }

    public final void b(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != 1) {
            return;
        }
        int toolType = motionEvent.getToolType(0);
        int source = motionEvent.getSource();
        if (toolType == this.f && source == this.g) {
            return;
        }
        this.f = toolType;
        this.g = source;
        this.c.clear();
        this.b.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final yw c(d4 d4Var, MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        long j;
        long floatToRawIntBits;
        long F;
        int i;
        int historySize;
        int i2;
        ArrayList arrayList;
        long j2;
        int i3;
        char c;
        int actionMasked = motionEvent.getActionMasked();
        SparseLongArray sparseLongArray = this.b;
        SparseBooleanArray sparseBooleanArray = this.c;
        int i4 = 3;
        if (actionMasked == 3 || actionMasked == 4) {
            sparseLongArray.clear();
            sparseBooleanArray.clear();
            return null;
        }
        b(motionEvent);
        a(motionEvent);
        boolean z3 = true;
        boolean z4 = actionMasked == 9 || actionMasked == 7 || actionMasked == 10;
        boolean z5 = actionMasked == 8;
        if (z4) {
            sparseBooleanArray.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
        }
        int actionIndex = actionMasked != 1 ? actionMasked != 6 ? -1 : motionEvent.getActionIndex() : 0;
        ArrayList arrayList2 = this.d;
        arrayList2.clear();
        int pointerCount = motionEvent.getPointerCount();
        int i5 = 0;
        while (i5 < pointerCount) {
            boolean z6 = (z4 || i5 == actionIndex || (z5 && motionEvent.getButtonState() == 0)) ? false : z3;
            int pointerId = motionEvent.getPointerId(i5);
            int indexOfKey = sparseLongArray.indexOfKey(pointerId);
            if (indexOfKey >= 0) {
                j = sparseLongArray.valueAt(indexOfKey);
                z = z4;
                z2 = z5;
            } else {
                z = z4;
                long j3 = this.a;
                z2 = z5;
                this.a = j3 + 1;
                sparseLongArray.put(pointerId, j3);
                j = j3;
            }
            float pressure = motionEvent.getPressure(i5);
            char c2 = ' ';
            long a = wq0.a(i4, (Float.floatToRawIntBits(motionEvent.getY(i5)) & 4294967295L) | (Float.floatToRawIntBits(motionEvent.getX(i5)) << 32));
            if (i5 == 0) {
                floatToRawIntBits = (Float.floatToRawIntBits(motionEvent.getRawY()) & 4294967295L) | (Float.floatToRawIntBits(motionEvent.getRawX()) << 32);
                F = d4Var.F(floatToRawIntBits);
            } else {
                floatToRawIntBits = (Float.floatToRawIntBits(motionEvent.getRawY(i5)) & 4294967295L) | (Float.floatToRawIntBits(motionEvent.getRawX(i5)) << 32);
                F = d4Var.F(floatToRawIntBits);
            }
            long j4 = floatToRawIntBits;
            long j5 = F;
            int toolType = motionEvent.getToolType(i5);
            if (toolType != 0) {
                if (toolType == 1) {
                    i = 1;
                } else if (toolType == 2) {
                    i = i4;
                } else if (toolType == i4) {
                    i = 2;
                } else if (toolType == 4) {
                    i = 4;
                }
                ArrayList arrayList3 = new ArrayList(motionEvent.getHistorySize());
                historySize = motionEvent.getHistorySize();
                i2 = 0;
                while (i2 < historySize) {
                    float historicalX = motionEvent.getHistoricalX(i5, i2);
                    float historicalY = motionEvent.getHistoricalY(i5, i2);
                    if ((Float.floatToRawIntBits(historicalX) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(historicalY) & Integer.MAX_VALUE) >= 2139095040) {
                        i3 = i2;
                        c = c2;
                    } else {
                        long floatToRawIntBits2 = Float.floatToRawIntBits(historicalX);
                        int floatToRawIntBits3 = Float.floatToRawIntBits(historicalY);
                        c = c2;
                        long j6 = (floatToRawIntBits2 << c) | (floatToRawIntBits3 & 4294967295L);
                        i3 = i2;
                        arrayList3.add(new e60(motionEvent.getHistoricalEventTime(i3), j6, j6));
                    }
                    i2 = i3 + 1;
                    c2 = c;
                }
                char c3 = c2;
                if (motionEvent.getActionMasked() != 8) {
                    arrayList = arrayList3;
                    j2 = (Float.floatToRawIntBits(motionEvent.getAxisValue(10)) << c3) | (Float.floatToRawIntBits((-motionEvent.getAxisValue(9)) + 0.0f) & 4294967295L);
                } else {
                    arrayList = arrayList3;
                    j2 = 0;
                }
                arrayList2.add(new sx0(j, motionEvent.getEventTime(), j4, j5, z6, pressure, i, sparseBooleanArray.get(motionEvent.getPointerId(i5), false), arrayList, j2, a));
                i5++;
                z4 = z;
                z5 = z2;
                i4 = 3;
                z3 = true;
            }
            i = 0;
            ArrayList arrayList32 = new ArrayList(motionEvent.getHistorySize());
            historySize = motionEvent.getHistorySize();
            i2 = 0;
            while (i2 < historySize) {
            }
            char c32 = c2;
            if (motionEvent.getActionMasked() != 8) {
            }
            arrayList2.add(new sx0(j, motionEvent.getEventTime(), j4, j5, z6, pressure, i, sparseBooleanArray.get(motionEvent.getPointerId(i5), false), arrayList, j2, a));
            i5++;
            z4 = z;
            z5 = z2;
            i4 = 3;
            z3 = true;
        }
        d(motionEvent);
        motionEvent.getEventTime();
        return new yw(arrayList2, 27, motionEvent);
    }

    public final void d(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        SparseBooleanArray sparseBooleanArray = this.c;
        SparseLongArray sparseLongArray = this.b;
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
}
