package defpackage;

import android.os.Build;
import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import java.util.ArrayList;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class hm1 {
    public long a;
    public final SparseLongArray b = new SparseLongArray();
    public final SparseBooleanArray c = new SparseBooleanArray();
    public final ArrayList d = new ArrayList();
    public int e = -1;
    public int f = -1;

    /* JADX WARN: Removed duplicated region for block: B:50:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final tt1 a(t7 t7Var, MotionEvent motionEvent) {
        long j;
        int i;
        int i2;
        boolean z;
        boolean z2;
        long j2;
        float f;
        long j3;
        long u;
        long G;
        int toolType;
        int i3;
        int historySize;
        int i4;
        long j4;
        long j5;
        hm1 hm1Var = this;
        t7 t7Var2 = t7Var;
        int actionMasked = motionEvent.getActionMasked();
        SparseLongArray sparseLongArray = hm1Var.b;
        SparseBooleanArray sparseBooleanArray = hm1Var.c;
        int i5 = 3;
        if (actionMasked != 3) {
            int i6 = 4;
            if (actionMasked != 4) {
                if (motionEvent.getPointerCount() == 1) {
                    int toolType2 = motionEvent.getToolType(0);
                    int source = motionEvent.getSource();
                    if (toolType2 != hm1Var.e || source != hm1Var.f) {
                        hm1Var.e = toolType2;
                        hm1Var.f = source;
                        sparseBooleanArray.clear();
                        sparseLongArray.clear();
                    }
                }
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 == 0 || actionMasked2 == 5) {
                    j = 1;
                    int actionIndex = motionEvent.getActionIndex();
                    int pointerId = motionEvent.getPointerId(actionIndex);
                    if (sparseLongArray.indexOfKey(pointerId) < 0) {
                        long j6 = hm1Var.a;
                        hm1Var.a = j6 + 1;
                        sparseLongArray.put(pointerId, j6);
                        if (motionEvent.getToolType(actionIndex) == 3) {
                            sparseBooleanArray.put(pointerId, true);
                        }
                    }
                } else {
                    if (actionMasked2 == 9) {
                        int pointerId2 = motionEvent.getPointerId(0);
                        if (sparseLongArray.indexOfKey(pointerId2) < 0) {
                            long j7 = hm1Var.a;
                            j = 1;
                            hm1Var.a = j7 + 1;
                            sparseLongArray.put(pointerId2, j7);
                        }
                    }
                    j = 1;
                }
                boolean z3 = actionMasked == 9 || actionMasked == 7 || actionMasked == 10;
                boolean z4 = actionMasked == 8;
                if (z3) {
                    i = 1;
                    sparseBooleanArray.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
                } else {
                    i = 1;
                }
                int actionIndex2 = actionMasked != i ? actionMasked != 6 ? -1 : motionEvent.getActionIndex() : 0;
                ArrayList arrayList = hm1Var.d;
                arrayList.clear();
                int pointerCount = motionEvent.getPointerCount();
                int i7 = 0;
                while (i7 < pointerCount) {
                    boolean z5 = (z3 || i7 == actionIndex2 || (z4 && motionEvent.getButtonState() == 0)) ? false : true;
                    int pointerId3 = motionEvent.getPointerId(i7);
                    int indexOfKey = sparseLongArray.indexOfKey(pointerId3);
                    if (indexOfKey >= 0) {
                        z2 = z3;
                        z = z4;
                        j2 = sparseLongArray.valueAt(indexOfKey);
                    } else {
                        z = z4;
                        long j8 = hm1Var.a;
                        z2 = z3;
                        hm1Var.a = j8 + j;
                        sparseLongArray.put(pointerId3, j8);
                        j2 = j8;
                    }
                    float pressure = motionEvent.getPressure(i7);
                    char c = ' ';
                    long floatToRawIntBits = (Float.floatToRawIntBits(motionEvent.getY(i7)) & 4294967295L) | (Float.floatToRawIntBits(motionEvent.getX(i7)) << 32);
                    long a = au1.a(floatToRawIntBits, 0.0f, i5);
                    if (i7 == 0) {
                        f = 0.0f;
                        u = (Float.floatToRawIntBits(motionEvent.getRawY()) & 4294967295L) | (Float.floatToRawIntBits(motionEvent.getRawX()) << 32);
                        G = t7Var2.G(u);
                    } else {
                        f = 0.0f;
                        if (Build.VERSION.SDK_INT >= 29) {
                            u = x6.x(motionEvent, i7);
                            G = t7Var2.G(u);
                        } else {
                            j3 = floatToRawIntBits;
                            u = t7Var2.u(floatToRawIntBits);
                            toolType = motionEvent.getToolType(i7);
                            if (toolType != 0) {
                                if (toolType == 1) {
                                    i3 = 1;
                                } else if (toolType == 2) {
                                    i3 = i5;
                                } else if (toolType == i5) {
                                    i3 = 2;
                                } else if (toolType == i6) {
                                    i3 = i6;
                                }
                                ArrayList arrayList2 = new ArrayList(motionEvent.getHistorySize());
                                historySize = motionEvent.getHistorySize();
                                i4 = 0;
                                while (i4 < historySize) {
                                    float historicalX = motionEvent.getHistoricalX(i7, i4);
                                    float historicalY = motionEvent.getHistoricalY(i7, i4);
                                    char c2 = c;
                                    if ((Float.floatToRawIntBits(historicalX) & Integer.MAX_VALUE) < 2139095040 && (Float.floatToRawIntBits(historicalY) & Integer.MAX_VALUE) < 2139095040) {
                                        long floatToRawIntBits2 = (Float.floatToRawIntBits(historicalX) << c2) | (Float.floatToRawIntBits(historicalY) & 4294967295L);
                                        arrayList2.add(new qx0(motionEvent.getHistoricalEventTime(i4), floatToRawIntBits2, floatToRawIntBits2));
                                    }
                                    i4++;
                                    c = c2;
                                }
                                char c3 = c;
                                if (motionEvent.getActionMasked() == 8) {
                                    float axisValue = motionEvent.getAxisValue(10);
                                    float f2 = (-motionEvent.getAxisValue(9)) + f;
                                    j4 = u;
                                    j5 = (Float.floatToRawIntBits(axisValue) << c3) | (Float.floatToRawIntBits(f2) & 4294967295L);
                                } else {
                                    j4 = u;
                                    j5 = 0;
                                }
                                arrayList.add(new v22(j2, motionEvent.getEventTime(), j4, j3, z5, pressure, i3, sparseBooleanArray.get(motionEvent.getPointerId(i7), false), arrayList2, j5, a));
                                i7++;
                                hm1Var = this;
                                t7Var2 = t7Var;
                                z4 = z;
                                z3 = z2;
                                i5 = 3;
                                i6 = 4;
                            }
                            i3 = 0;
                            ArrayList arrayList22 = new ArrayList(motionEvent.getHistorySize());
                            historySize = motionEvent.getHistorySize();
                            i4 = 0;
                            while (i4 < historySize) {
                            }
                            char c32 = c;
                            if (motionEvent.getActionMasked() == 8) {
                            }
                            arrayList.add(new v22(j2, motionEvent.getEventTime(), j4, j3, z5, pressure, i3, sparseBooleanArray.get(motionEvent.getPointerId(i7), false), arrayList22, j5, a));
                            i7++;
                            hm1Var = this;
                            t7Var2 = t7Var;
                            z4 = z;
                            z3 = z2;
                            i5 = 3;
                            i6 = 4;
                        }
                    }
                    j3 = G;
                    toolType = motionEvent.getToolType(i7);
                    if (toolType != 0) {
                    }
                    i3 = 0;
                    ArrayList arrayList222 = new ArrayList(motionEvent.getHistorySize());
                    historySize = motionEvent.getHistorySize();
                    i4 = 0;
                    while (i4 < historySize) {
                    }
                    char c322 = c;
                    if (motionEvent.getActionMasked() == 8) {
                    }
                    arrayList.add(new v22(j2, motionEvent.getEventTime(), j4, j3, z5, pressure, i3, sparseBooleanArray.get(motionEvent.getPointerId(i7), false), arrayList222, j5, a));
                    i7++;
                    hm1Var = this;
                    t7Var2 = t7Var;
                    z4 = z;
                    z3 = z2;
                    i5 = 3;
                    i6 = 4;
                }
                int actionMasked3 = motionEvent.getActionMasked();
                if (actionMasked3 == 1 || actionMasked3 == 6) {
                    int pointerId4 = motionEvent.getPointerId(motionEvent.getActionIndex());
                    i2 = 0;
                    if (!sparseBooleanArray.get(pointerId4, false)) {
                        sparseLongArray.delete(pointerId4);
                        sparseBooleanArray.delete(pointerId4);
                    }
                } else {
                    i2 = 0;
                }
                if (sparseLongArray.size() > motionEvent.getPointerCount()) {
                    for (int size = sparseLongArray.size() - 1; -1 < size; size--) {
                        int keyAt = sparseLongArray.keyAt(size);
                        int pointerCount2 = motionEvent.getPointerCount();
                        int i8 = i2;
                        while (true) {
                            if (i8 >= pointerCount2) {
                                sparseLongArray.removeAt(size);
                                sparseBooleanArray.delete(keyAt);
                                break;
                            }
                            if (motionEvent.getPointerId(i8) == keyAt) {
                                break;
                            }
                            i8++;
                        }
                    }
                }
                motionEvent.getEventTime();
                return new tt1(4, arrayList, motionEvent);
            }
        }
        sparseLongArray.clear();
        sparseBooleanArray.clear();
        return null;
    }
}
