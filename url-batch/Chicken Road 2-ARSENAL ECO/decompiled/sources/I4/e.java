package I4;

import D.H;
import D.InterfaceC0100m;
import D.InterfaceC0101n;
import X5.k;
import X5.q;
import X5.r;
import X5.s;
import android.util.Log;
import android.view.ViewParent;
import androidx.core.widget.NestedScrollView;
import java.time.Duration;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLContext;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1209a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1210b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1211c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f1212d;

    /* renamed from: e, reason: collision with root package name */
    public Object f1213e;

    public e(String str, String str2, String str3, String str4, boolean z5) {
        this.f1210b = str == null ? "libapp.so" : str;
        this.f1211c = str2 == null ? "flutter_assets" : str2;
        this.f1213e = str4;
        this.f1212d = str3 == null ? "" : str3;
        this.f1209a = z5;
    }

    public boolean a(float f7, float f8) {
        ViewParent d7;
        if (this.f1209a && (d7 = d(0)) != null) {
            try {
                return H.b(d7, (NestedScrollView) this.f1212d, f7, f8);
            } catch (AbstractMethodError e4) {
                Log.e("ViewParentCompat", "ViewParent " + d7 + " does not implement interface method onNestedPreFling", e4);
            }
        }
        return false;
    }

    public boolean b(int i7, int i8, int[] iArr, int[] iArr2, int i9) {
        ViewParent d7;
        int i10;
        int i11;
        NestedScrollView nestedScrollView = (NestedScrollView) this.f1212d;
        if (!this.f1209a || (d7 = d(i9)) == null) {
            return false;
        }
        if (i7 == 0 && i8 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        if (iArr2 != null) {
            nestedScrollView.getLocationInWindow(iArr2);
            i10 = iArr2[0];
            i11 = iArr2[1];
        } else {
            i10 = 0;
            i11 = 0;
        }
        if (iArr == null) {
            if (((int[]) this.f1213e) == null) {
                this.f1213e = new int[2];
            }
            iArr = (int[]) this.f1213e;
        }
        iArr[0] = 0;
        iArr[1] = 0;
        if (d7 instanceof InterfaceC0100m) {
            ((InterfaceC0100m) d7).d(i7, i8, iArr, i9);
        } else if (i9 == 0) {
            try {
                H.c(d7, nestedScrollView, i7, i8, iArr);
            } catch (AbstractMethodError e4) {
                Log.e("ViewParentCompat", "ViewParent " + d7 + " does not implement interface method onNestedPreScroll", e4);
            }
        }
        if (iArr2 != null) {
            nestedScrollView.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i10;
            iArr2[1] = iArr2[1] - i11;
        }
        return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
    }

    public boolean c(int i7, int i8, int i9, int i10, int[] iArr, int i11, int[] iArr2) {
        ViewParent d7;
        int i12;
        int i13;
        int[] iArr3;
        NestedScrollView nestedScrollView = (NestedScrollView) this.f1212d;
        if (this.f1209a && (d7 = d(i11)) != null) {
            if (i7 != 0 || i8 != 0 || i9 != 0 || i10 != 0) {
                if (iArr != null) {
                    nestedScrollView.getLocationInWindow(iArr);
                    i12 = iArr[0];
                    i13 = iArr[1];
                } else {
                    i12 = 0;
                    i13 = 0;
                }
                if (iArr2 == null) {
                    if (((int[]) this.f1213e) == null) {
                        this.f1213e = new int[2];
                    }
                    int[] iArr4 = (int[]) this.f1213e;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    iArr3 = iArr4;
                } else {
                    iArr3 = iArr2;
                }
                if (d7 instanceof InterfaceC0101n) {
                    ((InterfaceC0101n) d7).c(nestedScrollView, i7, i8, i9, i10, i11, iArr3);
                } else {
                    iArr3[0] = iArr3[0] + i9;
                    iArr3[1] = iArr3[1] + i10;
                    if (d7 instanceof InterfaceC0100m) {
                        ((InterfaceC0100m) d7).e(nestedScrollView, i7, i8, i9, i10, i11);
                    } else if (i11 == 0) {
                        try {
                            H.d(d7, nestedScrollView, i7, i8, i9, i10);
                        } catch (AbstractMethodError e4) {
                            Log.e("ViewParentCompat", "ViewParent " + d7 + " does not implement interface method onNestedScroll", e4);
                        }
                    }
                }
                if (iArr != null) {
                    nestedScrollView.getLocationInWindow(iArr);
                    iArr[0] = iArr[0] - i12;
                    iArr[1] = iArr[1] - i13;
                }
                return true;
            }
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                return false;
            }
        }
        return false;
    }

    public ViewParent d(int i7) {
        if (i7 == 0) {
            return (ViewParent) this.f1210b;
        }
        if (i7 != 1) {
            return null;
        }
        return (ViewParent) this.f1211c;
    }

    public e(NestedScrollView nestedScrollView) {
        this.f1212d = nestedScrollView;
    }

    public e(String str, long j4, long j7, C4.e eVar, P4.a aVar, SSLContext sSLContext) {
        Duration ofNanos;
        long millis;
        Duration ofNanos2;
        long millis2;
        Duration duration;
        long millis3;
        Duration duration2;
        long millis4;
        ofNanos = Duration.ofNanos(j4);
        millis = ofNanos.toMillis();
        int min = (int) Math.min(millis, 2147483647L);
        ofNanos2 = Duration.ofNanos(j7);
        millis2 = ofNanos2.toMillis();
        int min2 = (int) Math.min(millis2, 2147483647L);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new Q4.e(0));
        k kVar = new k();
        kVar.f2962c = threadPoolExecutor;
        this.f1209a = true;
        r rVar = new r();
        rVar.f2985a = kVar;
        duration = Duration.ofMillis(min2);
        i.e(duration, "duration");
        millis3 = duration.toMillis();
        TimeUnit unit = TimeUnit.MILLISECONDS;
        i.e(unit, "unit");
        rVar.f3004t = Y5.e.b(millis3);
        duration2 = Duration.ofMillis(min);
        i.e(duration2, "duration");
        millis4 = duration2.toMillis();
        rVar.f3003s = Y5.e.b(millis4);
        if (aVar != null) {
            rVar.f2987c.add(new h(aVar, new A4.b(14)));
        }
        if (str.startsWith("http://")) {
            List connectionSpecs = Collections.singletonList(X5.i.f2941f);
            i.e(connectionSpecs, "connectionSpecs");
            connectionSpecs.equals(rVar.f2999o);
            rVar.f2999o = Y5.e.i(connectionSpecs);
        }
        this.f1210b = new s(rVar);
        F3.g gVar = new F3.g(2);
        q qVar = null;
        gVar.q(null, str);
        this.f1211c = gVar.a();
        F5.i iVar = q.f2982b;
        try {
            qVar = A3.c.P("application/x-protobuf");
        } catch (IllegalArgumentException unused) {
        }
        this.f1213e = qVar;
        this.f1212d = eVar;
    }
}
