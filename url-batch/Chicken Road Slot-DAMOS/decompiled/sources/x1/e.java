package x1;

import android.os.Build;
import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import d2.v;
import java.util.ArrayList;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public long f10254a;

    /* renamed from: b, reason: collision with root package name */
    public final SparseLongArray f10255b = new SparseLongArray();

    /* renamed from: c, reason: collision with root package name */
    public final SparseBooleanArray f10256c = new SparseBooleanArray();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f10257d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final s.p f10258e = new s.p((Object) null);

    /* renamed from: f, reason: collision with root package name */
    public int f10259f = -1;
    public int g = -1;

    /* renamed from: h, reason: collision with root package name */
    public boolean f10260h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f10261i;
    public j1.b j;

    public final void a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        SparseLongArray sparseLongArray = this.f10255b;
        if (actionMasked != 0 && actionMasked != 5) {
            if (actionMasked != 9) {
                return;
            }
            int pointerId = motionEvent.getPointerId(0);
            if (sparseLongArray.indexOfKey(pointerId) < 0) {
                long j = this.f10254a;
                this.f10254a = 1 + j;
                sparseLongArray.put(pointerId, j);
                return;
            }
            return;
        }
        int actionIndex = motionEvent.getActionIndex();
        int pointerId2 = motionEvent.getPointerId(actionIndex);
        if (sparseLongArray.indexOfKey(pointerId2) < 0) {
            long j3 = this.f10254a;
            this.f10254a = 1 + j3;
            sparseLongArray.put(pointerId2, j3);
            if (motionEvent.getToolType(actionIndex) == 3) {
                this.f10256c.put(pointerId2, true);
            }
        }
    }

    public final void b(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != 1) {
            return;
        }
        int toolType = motionEvent.getToolType(0);
        int source = motionEvent.getSource();
        if (toolType == this.f10259f && source == this.g) {
            return;
        }
        this.f10259f = toolType;
        this.g = source;
        this.f10256c.clear();
        this.f10255b.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
    
        if (r0 == 5) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final c6.c c(MotionEvent motionEvent, v vVar) {
        int i3;
        int classification;
        float rawX;
        float rawY;
        boolean z10;
        int classification2;
        int classification3;
        int actionMasked = motionEvent.getActionMasked();
        SparseBooleanArray sparseBooleanArray = this.f10256c;
        if (actionMasked == 3 || actionMasked == 4) {
            this.f10255b.clear();
            sparseBooleanArray.clear();
            this.f10260h = false;
            this.f10261i = false;
            this.j = null;
            return null;
        }
        b(motionEvent);
        a(motionEvent);
        boolean z11 = actionMasked == 9 || actionMasked == 7 || actionMasked == 10;
        boolean z12 = actionMasked == 8;
        if (z11) {
            sparseBooleanArray.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
        }
        if (actionMasked != 1) {
            i3 = actionMasked != 6 ? -1 : motionEvent.getActionIndex();
        } else {
            i3 = 0;
        }
        ArrayList arrayList = this.f10257d;
        arrayList.clear();
        if (motionEvent.getActionMasked() == 0) {
            if (Build.VERSION.SDK_INT >= 34) {
                classification2 = motionEvent.getClassification();
                if (classification2 != 3) {
                    classification3 = motionEvent.getClassification();
                }
                z10 = true;
                boolean z13 = motionEvent.getButtonState() != 0 && (motionEvent.isFromSource(8194) || motionEvent.isFromSource(1048584));
                if (!z10 || z13) {
                    this.f10260h = true;
                }
            }
            z10 = false;
            if (motionEvent.getButtonState() != 0) {
            }
            if (!z10) {
            }
            this.f10260h = true;
        }
        if (Build.VERSION.SDK_INT >= 34) {
            classification = motionEvent.getClassification();
            if (classification == 3) {
                this.f10261i = true;
                if (motionEvent.getActionMasked() == 0) {
                    rawX = motionEvent.getRawX(0);
                    rawY = motionEvent.getRawY(0);
                    this.j = new j1.b((Float.floatToRawIntBits(rawY) & 4294967295L) | (Float.floatToRawIntBits(rawX) << 32));
                }
                arrayList.add(d(vVar, motionEvent, this.j, 0, false));
                if (motionEvent.getActionMasked() == 1) {
                    this.f10260h = false;
                    this.f10261i = false;
                    this.j = null;
                }
                e(motionEvent);
                motionEvent.getEventTime();
                return new c6.c(14, arrayList, motionEvent);
            }
        }
        this.f10261i = false;
        int pointerCount = motionEvent.getPointerCount();
        int i10 = 0;
        while (i10 < pointerCount) {
            arrayList.add(d(vVar, motionEvent, null, i10, (z11 || i10 == i3 || (z12 && motionEvent.getButtonState() == 0)) ? false : true));
            i10++;
        }
        if (motionEvent.getActionMasked() == 1) {
        }
        e(motionEvent);
        motionEvent.getEventTime();
        return new c6.c(14, arrayList, motionEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00b3, code lost:
    
        if (r1 != 4) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0182 A[EDGE_INSN: B:41:0x0182->B:42:0x0182 BREAK  A[LOOP:0: B:20:0x00ea->B:38:0x0179], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final n d(v vVar, MotionEvent motionEvent, j1.b bVar, int i3, boolean z10) {
        long j;
        long j3;
        long v10;
        long j10;
        float rawX;
        float rawY;
        long floatToRawIntBits;
        long H;
        boolean z11;
        int toolType;
        int i10;
        int historySize;
        int i11;
        long j11;
        float f3;
        int i12;
        long j12;
        int classification;
        int classification2;
        Float valueOf;
        int i13;
        int classification3;
        boolean z12;
        boolean z13;
        int pointerId = motionEvent.getPointerId(i3);
        SparseLongArray sparseLongArray = this.f10255b;
        int indexOfKey = sparseLongArray.indexOfKey(pointerId);
        if (indexOfKey >= 0) {
            j = sparseLongArray.valueAt(indexOfKey);
        } else {
            long j13 = this.f10254a;
            this.f10254a = 1 + j13;
            sparseLongArray.put(pointerId, j13);
            j = j13;
        }
        float pressure = motionEvent.getPressure(i3);
        long floatToRawIntBits2 = (Float.floatToRawIntBits(motionEvent.getY(i3)) & 4294967295L) | (Float.floatToRawIntBits(motionEvent.getX(i3)) << 32);
        if (i3 == 0) {
            if (bVar != null) {
                v10 = bVar.f4914a;
                z13 = 32;
                j3 = 4294967295L;
            } else {
                float rawX2 = motionEvent.getRawX();
                float rawY2 = motionEvent.getRawY();
                long floatToRawIntBits3 = Float.floatToRawIntBits(rawX2);
                int floatToRawIntBits4 = Float.floatToRawIntBits(rawY2);
                z13 = 32;
                j3 = 4294967295L;
                v10 = (floatToRawIntBits3 << 32) | (floatToRawIntBits4 & 4294967295L);
            }
            H = vVar.H(v10);
            z12 = z13;
        } else {
            boolean z14 = 32;
            j3 = 4294967295L;
            if (Build.VERSION.SDK_INT < 29) {
                v10 = vVar.v(floatToRawIntBits2);
                j10 = floatToRawIntBits2;
                z11 = z14;
                toolType = motionEvent.getToolType(i3);
                if (toolType != 0) {
                    int i14 = 2;
                    if (toolType == 1) {
                        if ((!motionEvent.isFromSource(8194) && !motionEvent.isFromSource(1048584)) || (this.f10260h && !this.f10261i)) {
                            i10 = 1;
                        }
                        i10 = i14;
                    } else if (toolType != 2) {
                        if (toolType != 3) {
                            i14 = 4;
                        }
                        i10 = i14;
                    } else {
                        i10 = 3;
                    }
                    ArrayList arrayList = new ArrayList(motionEvent.getHistorySize());
                    historySize = motionEvent.getHistorySize();
                    boolean z15 = z11;
                    i11 = 0;
                    while (true) {
                        j11 = 0;
                        if (i11 >= historySize) {
                            break;
                        }
                        float historicalX = motionEvent.getHistoricalX(i3, i11);
                        float historicalY = motionEvent.getHistoricalY(i3, i11);
                        if ((Float.floatToRawIntBits(historicalX) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(historicalY) & Integer.MAX_VALUE) >= 2139095040) {
                            i13 = historySize;
                        } else {
                            long floatToRawIntBits5 = Float.floatToRawIntBits(historicalX);
                            int floatToRawIntBits6 = Float.floatToRawIntBits(historicalY);
                            i13 = historySize;
                            long j14 = (floatToRawIntBits5 << (z15 ? 1L : 0L)) | (floatToRawIntBits6 & j3);
                            long historicalEventTime = motionEvent.getHistoricalEventTime(i11);
                            float historicalAxisValue = motionEvent.getHistoricalAxisValue(52, i3, i11);
                            valueOf = historicalAxisValue > 0.0f ? Float.valueOf(historicalAxisValue) : null;
                            float floatValue = valueOf != null ? valueOf.floatValue() : 1.0f;
                            if (Build.VERSION.SDK_INT >= 29) {
                                classification3 = motionEvent.getClassification();
                                if (classification3 == 3) {
                                    j11 = (Float.floatToRawIntBits(motionEvent.getHistoricalAxisValue(50, i3, i11)) << (z15 ? 1L : 0L)) | (Float.floatToRawIntBits(motionEvent.getHistoricalAxisValue(51, i3, i11)) & j3);
                                }
                            }
                            arrayList.add(new a(historicalEventTime, j14, floatValue, j11, j14));
                        }
                        i11++;
                        historySize = i13;
                    }
                    long floatToRawIntBits7 = motionEvent.getActionMasked() == 8 ? (Float.floatToRawIntBits(motionEvent.getAxisValue(10)) << (z15 ? 1L : 0L)) | (Float.floatToRawIntBits((-motionEvent.getAxisValue(9)) + 0.0f) & j3) : 0L;
                    i12 = Build.VERSION.SDK_INT;
                    if (i12 >= 29) {
                        classification2 = motionEvent.getClassification();
                        if (classification2 == 5) {
                            float axisValue = motionEvent.getAxisValue(52, i3);
                            valueOf = axisValue > 0.0f ? Float.valueOf(axisValue) : null;
                            if (valueOf != null) {
                                f3 = valueOf.floatValue();
                            }
                        }
                    }
                    float f10 = f3;
                    if (i12 >= 29) {
                        classification = motionEvent.getClassification();
                        if (classification == 3) {
                            j12 = floatToRawIntBits2;
                            j11 = (Float.floatToRawIntBits(motionEvent.getAxisValue(50, i3)) << (z15 ? 1L : 0L)) | (Float.floatToRawIntBits(motionEvent.getAxisValue(51, i3)) & j3);
                            return new n(j, motionEvent.getEventTime(), v10, j10, z10, pressure, i10, this.f10256c.get(motionEvent.getPointerId(i3), false), arrayList, floatToRawIntBits7, f10, j11, j12);
                        }
                    }
                    j12 = floatToRawIntBits2;
                    return new n(j, motionEvent.getEventTime(), v10, j10, z10, pressure, i10, this.f10256c.get(motionEvent.getPointerId(i3), false), arrayList, floatToRawIntBits7, f10, j11, j12);
                }
                i10 = 0;
                ArrayList arrayList2 = new ArrayList(motionEvent.getHistorySize());
                historySize = motionEvent.getHistorySize();
                boolean z152 = z11;
                i11 = 0;
                while (true) {
                    j11 = 0;
                    if (i11 >= historySize) {
                    }
                    i11++;
                    historySize = i13;
                }
                if (motionEvent.getActionMasked() == 8) {
                }
                i12 = Build.VERSION.SDK_INT;
                if (i12 >= 29) {
                }
                float f102 = f3;
                if (i12 >= 29) {
                }
                j12 = floatToRawIntBits2;
                return new n(j, motionEvent.getEventTime(), v10, j10, z10, pressure, i10, this.f10256c.get(motionEvent.getPointerId(i3), false), arrayList2, floatToRawIntBits7, f102, j11, j12);
            }
            if (bVar != null) {
                floatToRawIntBits = bVar.f4914a;
            } else {
                rawX = motionEvent.getRawX(i3);
                rawY = motionEvent.getRawY(i3);
                floatToRawIntBits = (Float.floatToRawIntBits(rawX) << 32) | (Float.floatToRawIntBits(rawY) & 4294967295L);
            }
            v10 = floatToRawIntBits;
            H = vVar.H(v10);
            z12 = z14;
        }
        j10 = H;
        z11 = z12;
        toolType = motionEvent.getToolType(i3);
        if (toolType != 0) {
        }
        i10 = 0;
        ArrayList arrayList22 = new ArrayList(motionEvent.getHistorySize());
        historySize = motionEvent.getHistorySize();
        boolean z1522 = z11;
        i11 = 0;
        while (true) {
            j11 = 0;
            if (i11 >= historySize) {
            }
            i11++;
            historySize = i13;
        }
        if (motionEvent.getActionMasked() == 8) {
        }
        i12 = Build.VERSION.SDK_INT;
        if (i12 >= 29) {
        }
        float f1022 = f3;
        if (i12 >= 29) {
        }
        j12 = floatToRawIntBits2;
        return new n(j, motionEvent.getEventTime(), v10, j10, z10, pressure, i10, this.f10256c.get(motionEvent.getPointerId(i3), false), arrayList22, floatToRawIntBits7, f1022, j11, j12);
    }

    public final void e(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        SparseBooleanArray sparseBooleanArray = this.f10256c;
        SparseLongArray sparseLongArray = this.f10255b;
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
                int i3 = 0;
                while (true) {
                    if (i3 >= pointerCount) {
                        sparseLongArray.removeAt(size);
                        sparseBooleanArray.delete(keyAt);
                        break;
                    } else if (motionEvent.getPointerId(i3) == keyAt) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
    }
}
