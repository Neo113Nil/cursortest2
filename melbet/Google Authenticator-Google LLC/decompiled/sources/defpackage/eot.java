package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.ArrayMap;
import android.view.FrameMetrics;
import android.view.Window;
import android.view.Window$OnFrameMetricsAvailableListener;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eot implements Window$OnFrameMetricsAvailableListener {
    public static final /* synthetic */ int a = 0;
    private boolean b;
    private long c;
    private epc d;
    private final ArrayMap e;
    private final hac f;
    private final koe g;

    public eot(Context context, ArrayMap arrayMap, koe koeVar) {
        this.f = hoq.v(new eks(context, 7));
        this.e = arrayMap;
        this.g = koeVar;
    }

    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v23 */
    public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
        long metric;
        long metric2;
        long metric3;
        boolean z;
        long j;
        ?? r4 = 1;
        if (!this.b) {
            this.b = true;
            this.d = Build.VERSION.SDK_INT <= 30 ? new epc() : null;
            koe koeVar = this.g;
            if (koeVar.b() == null || !((Boolean) koeVar.b()).booleanValue()) {
                this.c = ((Long) this.f.bB()).longValue();
            } else {
                this.c = (long) (1.0E9f / window.getWindowManager().getDefaultDisplay().getRefreshRate());
            }
        }
        metric = frameMetrics.getMetric(9);
        if (metric == 1) {
            epc epcVar = this.d;
            if (epcVar != null) {
                epcVar.a(frameMetrics, this.c);
                return;
            }
            return;
        }
        metric2 = frameMetrics.getMetric(8);
        epc epcVar2 = this.d;
        long j2 = this.c;
        if (epcVar2 != null) {
            j2 = epcVar2.a(frameMetrics, j2);
        }
        metric3 = frameMetrics.getMetric(13);
        ArrayMap arrayMap = this.e;
        synchronized (arrayMap) {
            int size = arrayMap.size();
            int i2 = 0;
            while (i2 < size) {
                eov eovVar = (eov) arrayMap.valueAt(i2);
                long j3 = j2;
                int i3 = (int) (metric2 / 1000000);
                if (i3 < 0) {
                    ((hkf) ((hkf) eiu.a.d()).i("com/google/android/libraries/performance/primes/metrics/jank/FrameTimeHistogram", "addFrame", 92, "FrameTimeHistogram.java")).I(metric2);
                    eovVar.i += r4;
                    z = r4;
                    j = metric3;
                } else {
                    eovVar.h += r4;
                    if (eovVar.o && metric2 > metric3) {
                        if (metric3 >= 0 && metric2 >= 0) {
                            eovVar.q += metric2 - metric3;
                        }
                        eovVar.p = r4;
                    }
                    z = r4;
                    if (metric3 > 0) {
                        j = metric3;
                        int i4 = (int) ((metric2 - metric3) / 1000000);
                        if (eovVar.n < i4) {
                            eovVar.n = i4;
                        }
                        int[] iArr = eovVar.e;
                        int i5 = i4 < 20 ? i4 >= -20 ? ((i4 + 20) >> 1) + 12 : i4 >= -30 ? ((i4 + 30) / 5) + 10 : i4 >= -100 ? ((i4 + 100) / 10) + 3 : i4 >= -200 ? ((i4 + 200) / 50) + 1 : 0 : i4 < 30 ? ((i4 - 20) / 5) + 32 : i4 < 100 ? ((i4 - 30) / 10) + 34 : i4 < 200 ? ((i4 - 50) / 100) + 41 : i4 < 1000 ? ((i4 - 200) / 100) + 43 : 51;
                        iArr[i5] = iArr[i5] + 1;
                        if (metric2 > j) {
                            eovVar.f++;
                            eovVar.k += i3;
                        }
                        if (metric2 > j3) {
                            eovVar.g++;
                            eovVar.l += i3;
                        }
                    } else {
                        j = metric3;
                        if (metric2 > j3) {
                            eovVar.f++;
                            eovVar.k += i3;
                        }
                    }
                    int[] iArr2 = eovVar.d;
                    int i6 = i3 <= 20 ? i3 >= 8 ? (i3 >> 1) - 2 : i3 / 4 : i3 <= 30 ? (i3 / 5) + 4 : i3 <= 100 ? (i3 / 10) + 7 : i3 <= 200 ? (i3 / 50) + 15 : i3 <= 1000 ? (i3 / 100) + 17 : i3 < 5000 ? 27 : 28;
                    iArr2[i6] = iArr2[i6] + 1;
                    eovVar.i += i;
                    if (eovVar.j < i3) {
                        eovVar.j = i3;
                    }
                    eovVar.m += i3;
                }
                i2++;
                j2 = j3;
                r4 = z;
                metric3 = j;
            }
        }
    }
}
