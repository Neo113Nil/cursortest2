package l1;

import android.os.Build;
import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import java.util.ArrayList;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public long f5796a;

    /* renamed from: b, reason: collision with root package name */
    public final SparseLongArray f5797b = new SparseLongArray();

    /* renamed from: c, reason: collision with root package name */
    public final SparseBooleanArray f5798c = new SparseBooleanArray();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f5799d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public int f5800e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f5801f = -1;

    /* JADX WARN: Removed duplicated region for block: B:50:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final androidx.room.c a(MotionEvent motionEvent, s1.r rVar) {
        long j8;
        int i7;
        int i8;
        boolean z8;
        boolean z9;
        long j9;
        long j10;
        long p6;
        long a3;
        long D;
        int toolType;
        int i9;
        int historySize;
        int i10;
        int actionMasked = motionEvent.getActionMasked();
        SparseLongArray sparseLongArray = this.f5797b;
        SparseBooleanArray sparseBooleanArray = this.f5798c;
        int i11 = 3;
        if (actionMasked == 3 || actionMasked == 4) {
            sparseLongArray.clear();
            sparseBooleanArray.clear();
            return null;
        }
        if (motionEvent.getPointerCount() == 1) {
            int toolType2 = motionEvent.getToolType(0);
            int source = motionEvent.getSource();
            if (toolType2 != this.f5800e || source != this.f5801f) {
                this.f5800e = toolType2;
                this.f5801f = source;
                sparseBooleanArray.clear();
                sparseLongArray.clear();
            }
        }
        int actionMasked2 = motionEvent.getActionMasked();
        if (actionMasked2 == 0 || actionMasked2 == 5) {
            j8 = 1;
            int actionIndex = motionEvent.getActionIndex();
            int pointerId = motionEvent.getPointerId(actionIndex);
            if (sparseLongArray.indexOfKey(pointerId) < 0) {
                long j11 = this.f5796a;
                this.f5796a = j11 + 1;
                sparseLongArray.put(pointerId, j11);
                if (motionEvent.getToolType(actionIndex) == 3) {
                    sparseBooleanArray.put(pointerId, true);
                }
            }
        } else {
            if (actionMasked2 == 9) {
                int pointerId2 = motionEvent.getPointerId(0);
                if (sparseLongArray.indexOfKey(pointerId2) < 0) {
                    long j12 = this.f5796a;
                    j8 = 1;
                    this.f5796a = j12 + 1;
                    sparseLongArray.put(pointerId2, j12);
                }
            }
            j8 = 1;
        }
        boolean z10 = actionMasked == 9 || actionMasked == 7 || actionMasked == 10;
        boolean z11 = actionMasked == 8;
        if (z10) {
            i7 = 1;
            sparseBooleanArray.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
        } else {
            i7 = 1;
        }
        int actionIndex2 = actionMasked != i7 ? actionMasked != 6 ? -1 : motionEvent.getActionIndex() : 0;
        ArrayList arrayList = this.f5799d;
        arrayList.clear();
        int pointerCount = motionEvent.getPointerCount();
        int i12 = 0;
        while (i12 < pointerCount) {
            boolean z12 = (z10 || i12 == actionIndex2 || (z11 && motionEvent.getButtonState() == 0)) ? false : true;
            int pointerId3 = motionEvent.getPointerId(i12);
            int indexOfKey = sparseLongArray.indexOfKey(pointerId3);
            if (indexOfKey >= 0) {
                z9 = z10;
                z8 = z11;
                j9 = sparseLongArray.valueAt(indexOfKey);
            } else {
                z8 = z11;
                long j13 = this.f5796a;
                z9 = z10;
                this.f5796a = j13 + j8;
                sparseLongArray.put(pointerId3, j13);
                j9 = j13;
            }
            float pressure = motionEvent.getPressure(i12);
            long a9 = u3.r.a(motionEvent.getX(i12), motionEvent.getY(i12));
            long a10 = y0.c.a(a9, 0.0f, i11);
            if (i12 == 0) {
                a3 = u3.r.a(motionEvent.getRawX(), motionEvent.getRawY());
                D = rVar.D(a3);
            } else if (Build.VERSION.SDK_INT >= 29) {
                a3 = g.f5802a.a(motionEvent, i12);
                D = rVar.D(a3);
            } else {
                j10 = a9;
                p6 = rVar.p(a9);
                toolType = motionEvent.getToolType(i12);
                if (toolType != 0) {
                    if (toolType == 1) {
                        i9 = 1;
                    } else if (toolType == 2) {
                        i9 = i11;
                    } else if (toolType == i11) {
                        i9 = 2;
                    } else if (toolType == 4) {
                        i9 = 4;
                    }
                    ArrayList arrayList2 = new ArrayList(motionEvent.getHistorySize());
                    historySize = motionEvent.getHistorySize();
                    for (i10 = 0; i10 < historySize; i10++) {
                        float historicalX = motionEvent.getHistoricalX(i12, i10);
                        float historicalY = motionEvent.getHistoricalY(i12, i10);
                        if (!Float.isInfinite(historicalX) && !Float.isNaN(historicalX) && !Float.isInfinite(historicalY) && !Float.isNaN(historicalY)) {
                            long a11 = u3.r.a(historicalX, historicalY);
                            arrayList2.add(new d(motionEvent.getHistoricalEventTime(i10), a11, a11));
                        }
                    }
                    arrayList.add(new y(j9, motionEvent.getEventTime(), p6, j10, z12, pressure, i9, sparseBooleanArray.get(motionEvent.getPointerId(i12), false), arrayList2, motionEvent.getActionMasked() == 8 ? u3.r.a(motionEvent.getAxisValue(10), (-motionEvent.getAxisValue(9)) + 0.0f) : 0L, a10));
                    i12++;
                    z11 = z8;
                    z10 = z9;
                    i11 = 3;
                }
                i9 = 0;
                ArrayList arrayList22 = new ArrayList(motionEvent.getHistorySize());
                historySize = motionEvent.getHistorySize();
                while (i10 < historySize) {
                }
                arrayList.add(new y(j9, motionEvent.getEventTime(), p6, j10, z12, pressure, i9, sparseBooleanArray.get(motionEvent.getPointerId(i12), false), arrayList22, motionEvent.getActionMasked() == 8 ? u3.r.a(motionEvent.getAxisValue(10), (-motionEvent.getAxisValue(9)) + 0.0f) : 0L, a10));
                i12++;
                z11 = z8;
                z10 = z9;
                i11 = 3;
            }
            p6 = a3;
            j10 = D;
            toolType = motionEvent.getToolType(i12);
            if (toolType != 0) {
            }
            i9 = 0;
            ArrayList arrayList222 = new ArrayList(motionEvent.getHistorySize());
            historySize = motionEvent.getHistorySize();
            while (i10 < historySize) {
            }
            arrayList.add(new y(j9, motionEvent.getEventTime(), p6, j10, z12, pressure, i9, sparseBooleanArray.get(motionEvent.getPointerId(i12), false), arrayList222, motionEvent.getActionMasked() == 8 ? u3.r.a(motionEvent.getAxisValue(10), (-motionEvent.getAxisValue(9)) + 0.0f) : 0L, a10));
            i12++;
            z11 = z8;
            z10 = z9;
            i11 = 3;
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
                int i13 = i8;
                while (true) {
                    if (i13 >= pointerCount2) {
                        sparseLongArray.removeAt(size);
                        sparseBooleanArray.delete(keyAt);
                        break;
                    }
                    if (motionEvent.getPointerId(i13) == keyAt) {
                        break;
                    }
                    i13++;
                }
            }
        }
        motionEvent.getEventTime();
        return new androidx.room.c(arrayList, 13, motionEvent);
    }
}
