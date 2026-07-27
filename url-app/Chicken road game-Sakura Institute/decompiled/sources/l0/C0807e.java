package l0;

import a.AbstractC0345a;
import android.os.Build;
import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import java.util.ArrayList;
import s0.C1166s;

/* renamed from: l0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0807e {

    /* renamed from: a, reason: collision with root package name */
    public long f7891a;

    /* renamed from: b, reason: collision with root package name */
    public final SparseLongArray f7892b = new SparseLongArray();

    /* renamed from: c, reason: collision with root package name */
    public final SparseBooleanArray f7893c = new SparseBooleanArray();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f7894d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public int f7895e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f7896f = -1;

    /* JADX WARN: Removed duplicated region for block: B:52:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x015b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final y.t a(MotionEvent motionEvent, C1166s c1166s) {
        int i2;
        int i4;
        boolean z4;
        boolean z5;
        long j4;
        long j5;
        long q2;
        long a4;
        long D3;
        int toolType;
        int i5;
        int historySize;
        int i6;
        char c4;
        long j6;
        int actionMasked = motionEvent.getActionMasked();
        SparseLongArray sparseLongArray = this.f7892b;
        SparseBooleanArray sparseBooleanArray = this.f7893c;
        if (actionMasked == 3 || actionMasked == 4) {
            sparseLongArray.clear();
            sparseBooleanArray.clear();
            return null;
        }
        if (motionEvent.getPointerCount() == 1) {
            int toolType2 = motionEvent.getToolType(0);
            int source = motionEvent.getSource();
            if (toolType2 != this.f7895e || source != this.f7896f) {
                this.f7895e = toolType2;
                this.f7896f = source;
                sparseBooleanArray.clear();
                sparseLongArray.clear();
            }
        }
        int actionMasked2 = motionEvent.getActionMasked();
        long j7 = 1;
        if (actionMasked2 == 0 || actionMasked2 == 5) {
            int actionIndex = motionEvent.getActionIndex();
            int pointerId = motionEvent.getPointerId(actionIndex);
            if (sparseLongArray.indexOfKey(pointerId) < 0) {
                long j8 = this.f7891a;
                this.f7891a = j8 + 1;
                sparseLongArray.put(pointerId, j8);
                if (motionEvent.getToolType(actionIndex) == 3) {
                    sparseBooleanArray.put(pointerId, true);
                }
            }
        } else if (actionMasked2 == 9) {
            int pointerId2 = motionEvent.getPointerId(0);
            if (sparseLongArray.indexOfKey(pointerId2) < 0) {
                long j9 = this.f7891a;
                this.f7891a = j9 + 1;
                sparseLongArray.put(pointerId2, j9);
            }
        }
        boolean z6 = actionMasked == 9 || actionMasked == 7 || actionMasked == 10;
        boolean z7 = actionMasked == 8;
        if (z6) {
            i2 = 1;
            sparseBooleanArray.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
        } else {
            i2 = 1;
        }
        int actionIndex2 = actionMasked != i2 ? actionMasked != 6 ? -1 : motionEvent.getActionIndex() : 0;
        ArrayList arrayList = this.f7894d;
        arrayList.clear();
        int pointerCount = motionEvent.getPointerCount();
        int i7 = 0;
        while (i7 < pointerCount) {
            boolean z8 = (z6 || i7 == actionIndex2 || (z7 && motionEvent.getButtonState() == 0)) ? false : true;
            int pointerId3 = motionEvent.getPointerId(i7);
            int indexOfKey = sparseLongArray.indexOfKey(pointerId3);
            if (indexOfKey >= 0) {
                z5 = z6;
                z4 = z7;
                j4 = sparseLongArray.valueAt(indexOfKey);
            } else {
                z4 = z7;
                long j10 = this.f7891a;
                z5 = z6;
                this.f7891a = j10 + j7;
                sparseLongArray.put(pointerId3, j10);
                j4 = j10;
            }
            float pressure = motionEvent.getPressure(i7);
            long c5 = AbstractC0345a.c(motionEvent.getX(i7), motionEvent.getY(i7));
            long a5 = Y.c.a(c5, 0.0f, 3);
            if (i7 == 0) {
                a4 = AbstractC0345a.c(motionEvent.getRawX(), motionEvent.getRawY());
                D3 = c1166s.D(a4);
            } else if (Build.VERSION.SDK_INT >= 29) {
                a4 = C0808f.f7897a.a(motionEvent, i7);
                D3 = c1166s.D(a4);
            } else {
                j5 = c5;
                q2 = c1166s.q(c5);
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
                            long c6 = AbstractC0345a.c(historicalX, historicalY);
                            arrayList2.add(new C0806d(motionEvent.getHistoricalEventTime(i6), c6, c6));
                        }
                    }
                    if (motionEvent.getActionMasked() == 8) {
                        c4 = '\t';
                        j6 = AbstractC0345a.c(motionEvent.getAxisValue(10), (-motionEvent.getAxisValue(9)) + 0.0f);
                    } else {
                        c4 = '\t';
                        j6 = 0;
                    }
                    arrayList.add(new u(j4, motionEvent.getEventTime(), q2, j5, z8, pressure, i5, sparseBooleanArray.get(motionEvent.getPointerId(i7), false), arrayList2, j6, a5));
                    i7++;
                    z7 = z4;
                    z6 = z5;
                    j7 = 1;
                }
                i5 = 0;
                ArrayList arrayList22 = new ArrayList(motionEvent.getHistorySize());
                historySize = motionEvent.getHistorySize();
                while (i6 < historySize) {
                }
                if (motionEvent.getActionMasked() == 8) {
                }
                arrayList.add(new u(j4, motionEvent.getEventTime(), q2, j5, z8, pressure, i5, sparseBooleanArray.get(motionEvent.getPointerId(i7), false), arrayList22, j6, a5));
                i7++;
                z7 = z4;
                z6 = z5;
                j7 = 1;
            }
            q2 = a4;
            j5 = D3;
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
            arrayList.add(new u(j4, motionEvent.getEventTime(), q2, j5, z8, pressure, i5, sparseBooleanArray.get(motionEvent.getPointerId(i7), false), arrayList222, j6, a5));
            i7++;
            z7 = z4;
            z6 = z5;
            j7 = 1;
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
        return new y.t(arrayList, 28, motionEvent);
    }
}
