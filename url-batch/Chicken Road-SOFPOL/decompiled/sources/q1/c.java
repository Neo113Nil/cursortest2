package q1;

import a0.a0;
import android.os.Build;
import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import java.util.ArrayList;
import x1.t;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public long f5971a;

    /* renamed from: b, reason: collision with root package name */
    public final SparseLongArray f5972b = new SparseLongArray();

    /* renamed from: c, reason: collision with root package name */
    public final SparseBooleanArray f5973c = new SparseBooleanArray();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f5974d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public int f5975e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f5976f = -1;

    /* JADX WARN: Removed duplicated region for block: B:50:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x020b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final a0 a(MotionEvent motionEvent, t tVar) {
        long j7;
        int i;
        int i8;
        boolean z3;
        boolean z7;
        long j8;
        long j9;
        long r7;
        float rawX;
        float rawY;
        long floatToRawIntBits;
        long E;
        int toolType;
        int i9;
        int historySize;
        int i10;
        char c8;
        long j10;
        char c9;
        int i11;
        int actionMasked = motionEvent.getActionMasked();
        SparseLongArray sparseLongArray = this.f5972b;
        SparseBooleanArray sparseBooleanArray = this.f5973c;
        int i12 = 3;
        if (actionMasked != 3) {
            int i13 = 4;
            if (actionMasked != 4) {
                if (motionEvent.getPointerCount() == 1) {
                    int toolType2 = motionEvent.getToolType(0);
                    int source = motionEvent.getSource();
                    if (toolType2 != this.f5975e || source != this.f5976f) {
                        this.f5975e = toolType2;
                        this.f5976f = source;
                        sparseBooleanArray.clear();
                        sparseLongArray.clear();
                    }
                }
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 == 0 || actionMasked2 == 5) {
                    j7 = 1;
                    int actionIndex = motionEvent.getActionIndex();
                    int pointerId = motionEvent.getPointerId(actionIndex);
                    if (sparseLongArray.indexOfKey(pointerId) < 0) {
                        long j11 = this.f5971a;
                        this.f5971a = j11 + 1;
                        sparseLongArray.put(pointerId, j11);
                        if (motionEvent.getToolType(actionIndex) == 3) {
                            sparseBooleanArray.put(pointerId, true);
                        }
                    }
                } else {
                    if (actionMasked2 == 9) {
                        int pointerId2 = motionEvent.getPointerId(0);
                        if (sparseLongArray.indexOfKey(pointerId2) < 0) {
                            long j12 = this.f5971a;
                            j7 = 1;
                            this.f5971a = j12 + 1;
                            sparseLongArray.put(pointerId2, j12);
                        }
                    }
                    j7 = 1;
                }
                boolean z8 = actionMasked == 9 || actionMasked == 7 || actionMasked == 10;
                boolean z9 = actionMasked == 8;
                if (z8) {
                    i = 1;
                    sparseBooleanArray.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
                } else {
                    i = 1;
                }
                int actionIndex2 = actionMasked != i ? actionMasked != 6 ? -1 : motionEvent.getActionIndex() : 0;
                ArrayList arrayList = this.f5974d;
                arrayList.clear();
                int pointerCount = motionEvent.getPointerCount();
                int i14 = 0;
                while (i14 < pointerCount) {
                    boolean z10 = (z8 || i14 == actionIndex2 || (z9 && motionEvent.getButtonState() == 0)) ? false : true;
                    int pointerId3 = motionEvent.getPointerId(i14);
                    int indexOfKey = sparseLongArray.indexOfKey(pointerId3);
                    if (indexOfKey >= 0) {
                        z7 = z8;
                        z3 = z9;
                        j8 = sparseLongArray.valueAt(indexOfKey);
                    } else {
                        z3 = z9;
                        long j13 = this.f5971a;
                        z7 = z8;
                        this.f5971a = j13 + j7;
                        sparseLongArray.put(pointerId3, j13);
                        j8 = j13;
                    }
                    float pressure = motionEvent.getPressure(i14);
                    char c10 = ' ';
                    long floatToRawIntBits2 = (Float.floatToRawIntBits(motionEvent.getY(i14)) & 4294967295L) | (Float.floatToRawIntBits(motionEvent.getX(i14)) << 32);
                    long a8 = e1.b.a(i12, floatToRawIntBits2);
                    if (i14 == 0) {
                        floatToRawIntBits = (Float.floatToRawIntBits(motionEvent.getRawY()) & 4294967295L) | (Float.floatToRawIntBits(motionEvent.getRawX()) << 32);
                        E = tVar.E(floatToRawIntBits);
                    } else if (Build.VERSION.SDK_INT >= 29) {
                        rawX = motionEvent.getRawX(i14);
                        rawY = motionEvent.getRawY(i14);
                        floatToRawIntBits = (Float.floatToRawIntBits(rawY) & 4294967295L) | (Float.floatToRawIntBits(rawX) << 32);
                        E = tVar.E(floatToRawIntBits);
                    } else {
                        j9 = floatToRawIntBits2;
                        r7 = tVar.r(floatToRawIntBits2);
                        toolType = motionEvent.getToolType(i14);
                        if (toolType != 0) {
                            if (toolType == 1) {
                                i9 = 1;
                            } else if (toolType == 2) {
                                i9 = i12;
                            } else if (toolType == i12) {
                                i9 = 2;
                            } else if (toolType == i13) {
                                i9 = i13;
                            }
                            ArrayList arrayList2 = new ArrayList(motionEvent.getHistorySize());
                            historySize = motionEvent.getHistorySize();
                            i10 = 0;
                            while (i10 < historySize) {
                                float historicalX = motionEvent.getHistoricalX(i14, i10);
                                float historicalY = motionEvent.getHistoricalY(i14, i10);
                                if ((Float.floatToRawIntBits(historicalX) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(historicalY) & Integer.MAX_VALUE) >= 2139095040) {
                                    c9 = c10;
                                    i11 = pointerCount;
                                } else {
                                    long floatToRawIntBits3 = Float.floatToRawIntBits(historicalX);
                                    int floatToRawIntBits4 = Float.floatToRawIntBits(historicalY);
                                    c9 = c10;
                                    i11 = pointerCount;
                                    long j14 = (floatToRawIntBits3 << c9) | (floatToRawIntBits4 & 4294967295L);
                                    arrayList2.add(new a(motionEvent.getHistoricalEventTime(i10), j14, j14));
                                }
                                i10++;
                                c10 = c9;
                                pointerCount = i11;
                            }
                            char c11 = c10;
                            int i15 = pointerCount;
                            if (motionEvent.getActionMasked() == 8) {
                                c8 = '\t';
                                j10 = (Float.floatToRawIntBits((-motionEvent.getAxisValue(9)) + 0.0f) & 4294967295L) | (Float.floatToRawIntBits(motionEvent.getAxisValue(10)) << c11);
                            } else {
                                c8 = '\t';
                                j10 = 0;
                            }
                            arrayList.add(new m(j8, motionEvent.getEventTime(), r7, j9, z10, pressure, i9, sparseBooleanArray.get(motionEvent.getPointerId(i14), false), arrayList2, j10, a8));
                            i14++;
                            z9 = z3;
                            z8 = z7;
                            pointerCount = i15;
                            i12 = 3;
                            i13 = 4;
                        }
                        i9 = 0;
                        ArrayList arrayList22 = new ArrayList(motionEvent.getHistorySize());
                        historySize = motionEvent.getHistorySize();
                        i10 = 0;
                        while (i10 < historySize) {
                        }
                        char c112 = c10;
                        int i152 = pointerCount;
                        if (motionEvent.getActionMasked() == 8) {
                        }
                        arrayList.add(new m(j8, motionEvent.getEventTime(), r7, j9, z10, pressure, i9, sparseBooleanArray.get(motionEvent.getPointerId(i14), false), arrayList22, j10, a8));
                        i14++;
                        z9 = z3;
                        z8 = z7;
                        pointerCount = i152;
                        i12 = 3;
                        i13 = 4;
                    }
                    r7 = floatToRawIntBits;
                    j9 = E;
                    toolType = motionEvent.getToolType(i14);
                    if (toolType != 0) {
                    }
                    i9 = 0;
                    ArrayList arrayList222 = new ArrayList(motionEvent.getHistorySize());
                    historySize = motionEvent.getHistorySize();
                    i10 = 0;
                    while (i10 < historySize) {
                    }
                    char c1122 = c10;
                    int i1522 = pointerCount;
                    if (motionEvent.getActionMasked() == 8) {
                    }
                    arrayList.add(new m(j8, motionEvent.getEventTime(), r7, j9, z10, pressure, i9, sparseBooleanArray.get(motionEvent.getPointerId(i14), false), arrayList222, j10, a8));
                    i14++;
                    z9 = z3;
                    z8 = z7;
                    pointerCount = i1522;
                    i12 = 3;
                    i13 = 4;
                }
                int actionMasked3 = motionEvent.getActionMasked();
                if (actionMasked3 == 1 || actionMasked3 == 6) {
                    int pointerId4 = motionEvent.getPointerId(motionEvent.getActionIndex());
                    i8 = 0;
                    if (!sparseBooleanArray.get(pointerId4, false)) {
                        sparseLongArray.delete(pointerId4);
                        sparseBooleanArray.delete(pointerId4);
                    }
                } else {
                    i8 = 0;
                }
                if (sparseLongArray.size() > motionEvent.getPointerCount()) {
                    for (int size = sparseLongArray.size() - 1; -1 < size; size--) {
                        int keyAt = sparseLongArray.keyAt(size);
                        int pointerCount2 = motionEvent.getPointerCount();
                        int i16 = i8;
                        while (true) {
                            if (i16 >= pointerCount2) {
                                sparseLongArray.removeAt(size);
                                sparseBooleanArray.delete(keyAt);
                                break;
                            }
                            if (motionEvent.getPointerId(i16) == keyAt) {
                                break;
                            }
                            i16++;
                        }
                    }
                }
                motionEvent.getEventTime();
                return new a0(16, arrayList, motionEvent);
            }
        }
        sparseLongArray.clear();
        sparseBooleanArray.clear();
        return null;
    }
}
