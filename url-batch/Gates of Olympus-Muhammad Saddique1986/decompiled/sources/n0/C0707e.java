package n0;

import a0.C0238c;
import android.os.Build;
import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import java.util.ArrayList;
import u0.C1123s;
import z.C1256t;

/* renamed from: n0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0707e {

    /* renamed from: a, reason: collision with root package name */
    public long f7276a;

    /* renamed from: b, reason: collision with root package name */
    public final SparseLongArray f7277b = new SparseLongArray();

    /* renamed from: c, reason: collision with root package name */
    public final SparseBooleanArray f7278c = new SparseBooleanArray();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f7279d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public int f7280e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f7281f = -1;

    /* JADX WARN: Removed duplicated region for block: B:52:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x015b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C1256t a(MotionEvent motionEvent, C1123s c1123s) {
        int i3;
        int i4;
        boolean z3;
        boolean z4;
        long j3;
        long j4;
        long r3;
        long a3;
        long E3;
        int toolType;
        int i5;
        int historySize;
        int i6;
        char c2;
        long j5;
        int actionMasked = motionEvent.getActionMasked();
        SparseLongArray sparseLongArray = this.f7277b;
        SparseBooleanArray sparseBooleanArray = this.f7278c;
        if (actionMasked == 3 || actionMasked == 4) {
            sparseLongArray.clear();
            sparseBooleanArray.clear();
            return null;
        }
        if (motionEvent.getPointerCount() == 1) {
            int toolType2 = motionEvent.getToolType(0);
            int source = motionEvent.getSource();
            if (toolType2 != this.f7280e || source != this.f7281f) {
                this.f7280e = toolType2;
                this.f7281f = source;
                sparseBooleanArray.clear();
                sparseLongArray.clear();
            }
        }
        int actionMasked2 = motionEvent.getActionMasked();
        long j6 = 1;
        if (actionMasked2 == 0 || actionMasked2 == 5) {
            int actionIndex = motionEvent.getActionIndex();
            int pointerId = motionEvent.getPointerId(actionIndex);
            if (sparseLongArray.indexOfKey(pointerId) < 0) {
                long j7 = this.f7276a;
                this.f7276a = j7 + 1;
                sparseLongArray.put(pointerId, j7);
                if (motionEvent.getToolType(actionIndex) == 3) {
                    sparseBooleanArray.put(pointerId, true);
                }
            }
        } else if (actionMasked2 == 9) {
            int pointerId2 = motionEvent.getPointerId(0);
            if (sparseLongArray.indexOfKey(pointerId2) < 0) {
                long j8 = this.f7276a;
                this.f7276a = j8 + 1;
                sparseLongArray.put(pointerId2, j8);
            }
        }
        boolean z5 = actionMasked == 9 || actionMasked == 7 || actionMasked == 10;
        boolean z6 = actionMasked == 8;
        if (z5) {
            i3 = 1;
            sparseBooleanArray.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
        } else {
            i3 = 1;
        }
        int actionIndex2 = actionMasked != i3 ? actionMasked != 6 ? -1 : motionEvent.getActionIndex() : 0;
        ArrayList arrayList = this.f7279d;
        arrayList.clear();
        int pointerCount = motionEvent.getPointerCount();
        int i7 = 0;
        while (i7 < pointerCount) {
            boolean z7 = (z5 || i7 == actionIndex2 || (z6 && motionEvent.getButtonState() == 0)) ? false : true;
            int pointerId3 = motionEvent.getPointerId(i7);
            int indexOfKey = sparseLongArray.indexOfKey(pointerId3);
            if (indexOfKey >= 0) {
                z4 = z5;
                z3 = z6;
                j3 = sparseLongArray.valueAt(indexOfKey);
            } else {
                z3 = z6;
                long j9 = this.f7276a;
                z4 = z5;
                this.f7276a = j9 + j6;
                sparseLongArray.put(pointerId3, j9);
                j3 = j9;
            }
            float pressure = motionEvent.getPressure(i7);
            long e3 = l0.c.e(motionEvent.getX(i7), motionEvent.getY(i7));
            long a4 = C0238c.a(e3, 0.0f, 3);
            if (i7 == 0) {
                a3 = l0.c.e(motionEvent.getRawX(), motionEvent.getRawY());
                E3 = c1123s.E(a3);
            } else if (Build.VERSION.SDK_INT >= 29) {
                a3 = C0708f.f7282a.a(motionEvent, i7);
                E3 = c1123s.E(a3);
            } else {
                j4 = e3;
                r3 = c1123s.r(e3);
                toolType = motionEvent.getToolType(i7);
                if (toolType != 0) {
                    if (toolType == 1) {
                        i5 = 1;
                    } else if (toolType == 2) {
                        i5 = 3;
                    } else if (toolType == 3) {
                        i5 = 2;
                    } else if (toolType == 4) {
                        i5 = 4;
                    }
                    ArrayList arrayList2 = new ArrayList(motionEvent.getHistorySize());
                    historySize = motionEvent.getHistorySize();
                    for (i6 = 0; i6 < historySize; i6++) {
                        float historicalX = motionEvent.getHistoricalX(i7, i6);
                        float historicalY = motionEvent.getHistoricalY(i7, i6);
                        if (!Float.isInfinite(historicalX) && !Float.isNaN(historicalX) && !Float.isInfinite(historicalY) && !Float.isNaN(historicalY)) {
                            long e4 = l0.c.e(historicalX, historicalY);
                            arrayList2.add(new C0706d(motionEvent.getHistoricalEventTime(i6), e4, e4));
                        }
                    }
                    if (motionEvent.getActionMasked() == 8) {
                        c2 = '\t';
                        j5 = l0.c.e(motionEvent.getAxisValue(10), (-motionEvent.getAxisValue(9)) + 0.0f);
                    } else {
                        c2 = '\t';
                        j5 = 0;
                    }
                    arrayList.add(new u(j3, motionEvent.getEventTime(), r3, j4, z7, pressure, i5, sparseBooleanArray.get(motionEvent.getPointerId(i7), false), arrayList2, j5, a4));
                    i7++;
                    z6 = z3;
                    z5 = z4;
                    j6 = 1;
                }
                i5 = 0;
                ArrayList arrayList22 = new ArrayList(motionEvent.getHistorySize());
                historySize = motionEvent.getHistorySize();
                while (i6 < historySize) {
                }
                if (motionEvent.getActionMasked() == 8) {
                }
                arrayList.add(new u(j3, motionEvent.getEventTime(), r3, j4, z7, pressure, i5, sparseBooleanArray.get(motionEvent.getPointerId(i7), false), arrayList22, j5, a4));
                i7++;
                z6 = z3;
                z5 = z4;
                j6 = 1;
            }
            r3 = a3;
            j4 = E3;
            toolType = motionEvent.getToolType(i7);
            if (toolType != 0) {
            }
            i5 = 0;
            ArrayList arrayList222 = new ArrayList(motionEvent.getHistorySize());
            historySize = motionEvent.getHistorySize();
            while (i6 < historySize) {
            }
            if (motionEvent.getActionMasked() == 8) {
            }
            arrayList.add(new u(j3, motionEvent.getEventTime(), r3, j4, z7, pressure, i5, sparseBooleanArray.get(motionEvent.getPointerId(i7), false), arrayList222, j5, a4));
            i7++;
            z6 = z3;
            z5 = z4;
            j6 = 1;
        }
        int actionMasked3 = motionEvent.getActionMasked();
        if (actionMasked3 == 1 || actionMasked3 == 6) {
            int pointerId4 = motionEvent.getPointerId(motionEvent.getActionIndex());
            i4 = 0;
            if (!sparseBooleanArray.get(pointerId4, false)) {
                sparseLongArray.delete(pointerId4);
                sparseBooleanArray.delete(pointerId4);
            }
        } else {
            i4 = 0;
        }
        if (sparseLongArray.size() > motionEvent.getPointerCount()) {
            for (int size = sparseLongArray.size() - 1; -1 < size; size--) {
                int keyAt = sparseLongArray.keyAt(size);
                int pointerCount2 = motionEvent.getPointerCount();
                int i8 = i4;
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
        return new C1256t(arrayList, 10, motionEvent);
    }
}
