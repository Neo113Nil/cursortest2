package f8;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class u extends g0 implements Runnable {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f4182y = 0;

    /* renamed from: w, reason: collision with root package name */
    public ListenableFuture f4183w;

    /* renamed from: x, reason: collision with root package name */
    public Object f4184x;

    public u(ListenableFuture listenableFuture, Object obj) {
        listenableFuture.getClass();
        this.f4183w = listenableFuture;
        obj.getClass();
        this.f4184x = obj;
    }

    @Override // f8.r
    public final void c() {
        ListenableFuture listenableFuture = this.f4183w;
        if ((listenableFuture != null) & (this.f4174d instanceof d)) {
            listenableFuture.cancel(p());
        }
        this.f4183w = null;
        this.f4184x = null;
    }

    @Override // f8.r
    public final String j() {
        String str;
        ListenableFuture listenableFuture = this.f4183w;
        Object obj = this.f4184x;
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
        if (obj == null) {
            if (j != null) {
                return j.length() != 0 ? str.concat(j) : new String(str);
            }
            return null;
        }
        String valueOf2 = String.valueOf(obj);
        StringBuilder sb3 = new StringBuilder(valueOf2.length() + str.length() + 11);
        sb3.append(str);
        sb3.append("function=[");
        sb3.append(valueOf2);
        sb3.append("]");
        return sb3.toString();
    }

    public abstract Object q(Object obj, Object obj2);

    public abstract void r(Object obj);

    @Override // java.lang.Runnable
    public final void run() {
        ListenableFuture listenableFuture = this.f4183w;
        Object obj = this.f4184x;
        if (((this.f4174d instanceof d) | (listenableFuture == null)) || (obj == null)) {
            return;
        }
        this.f4183w = null;
        if (listenableFuture.isCancelled()) {
            n(listenableFuture);
            return;
        }
        try {
            try {
                Object q3 = q(obj, l0.b(listenableFuture));
                this.f4184x = null;
                r(q3);
            } catch (Throwable th) {
                try {
                    m(th);
                } finally {
                    this.f4184x = null;
                }
            }
        } catch (Error e2) {
            m(e2);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (RuntimeException e9) {
            m(e9);
        } catch (ExecutionException e10) {
            m(e10.getCause());
        }
    }
}
