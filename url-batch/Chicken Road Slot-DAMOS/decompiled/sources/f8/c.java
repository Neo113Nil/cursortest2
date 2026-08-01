package f8;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class c extends g0 implements Runnable {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f4119z = 0;

    /* renamed from: w, reason: collision with root package name */
    public ListenableFuture f4120w;

    /* renamed from: x, reason: collision with root package name */
    public Class f4121x;

    /* renamed from: y, reason: collision with root package name */
    public Object f4122y;

    public c(ListenableFuture listenableFuture, Class cls, Object obj) {
        this.f4120w = listenableFuture;
        this.f4121x = cls;
        this.f4122y = obj;
    }

    @Override // f8.r
    public final void c() {
        ListenableFuture listenableFuture = this.f4120w;
        if ((listenableFuture != null) & (this.f4174d instanceof d)) {
            listenableFuture.cancel(p());
        }
        this.f4120w = null;
        this.f4121x = null;
        this.f4122y = null;
    }

    @Override // f8.r
    public final String j() {
        String str;
        ListenableFuture listenableFuture = this.f4120w;
        Class cls = this.f4121x;
        Object obj = this.f4122y;
        String j = super.j();
        if (listenableFuture != null) {
            String valueOf = String.valueOf(listenableFuture);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 16);
            sb2.append("inputFuture=[");
            sb2.append(valueOf);
            sb2.append("], ");
            str = sb2.toString();
        } else {
            str = "";
        }
        if (cls == null || obj == null) {
            if (j != null) {
                return j.length() != 0 ? str.concat(j) : new String(str);
            }
            return null;
        }
        String valueOf2 = String.valueOf(cls);
        String valueOf3 = String.valueOf(obj);
        StringBuilder sb3 = new StringBuilder(valueOf3.length() + valueOf2.length() + str.length() + 29);
        sb3.append(str);
        sb3.append("exceptionType=[");
        sb3.append(valueOf2);
        sb3.append("], fallback=[");
        return v4.a.o(sb3, valueOf3, "]");
    }

    public abstract Object q(Object obj, Throwable th);

    public abstract void r(Object obj);

    /* JADX WARN: Removed duplicated region for block: B:21:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008a  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Object obj;
        ListenableFuture listenableFuture = this.f4120w;
        Class cls = this.f4121x;
        Object obj2 = this.f4122y;
        if (((obj2 == null) || ((listenableFuture == null) | (cls == null))) || (this.f4174d instanceof d)) {
            return;
        }
        this.f4120w = null;
        try {
            th = listenableFuture instanceof r ? ((r) listenableFuture).o() : null;
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause == null) {
                String valueOf = String.valueOf(listenableFuture.getClass());
                String valueOf2 = String.valueOf(e2.getClass());
                StringBuilder sb2 = new StringBuilder(valueOf2.length() + valueOf.length() + 35);
                sb2.append("Future type ");
                sb2.append(valueOf);
                sb2.append(" threw ");
                sb2.append(valueOf2);
                sb2.append(" without a cause");
                cause = new NullPointerException(sb2.toString());
            }
            th = cause;
        } catch (Throwable th) {
            th = th;
        }
        if (th == null) {
            obj = l0.b(listenableFuture);
            if (th != null) {
                l(obj);
                return;
            }
            if (!cls.isInstance(th)) {
                n(listenableFuture);
                return;
            }
            try {
                Object q3 = q(obj2, th);
                this.f4121x = null;
                this.f4122y = null;
                r(q3);
                return;
            } catch (Throwable th2) {
                try {
                    m(th2);
                    return;
                } finally {
                    this.f4121x = null;
                    this.f4122y = null;
                }
            }
        }
        obj = null;
        if (th != null) {
        }
    }
}
