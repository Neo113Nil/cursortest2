package U;

import X5.v;
import android.content.Context;
import b6.i;
import b6.q;
import b6.r;
import c6.f;
import java.io.IOException;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2481a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2482b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2483c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f2484d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f2485e;

    public a(q qVar, i finder, f fVar) {
        kotlin.jvm.internal.i.e(finder, "finder");
        this.f2483c = qVar;
        this.f2484d = finder;
        this.f2485e = fVar;
    }

    public static IOException a(a aVar, IOException iOException, int i7) {
        boolean z5 = (i7 & 2) == 0;
        boolean z6 = (i7 & 4) == 0;
        aVar.getClass();
        q qVar = (q) aVar.f2483c;
        if (iOException != null) {
            aVar.d(iOException);
        }
        return qVar.f(aVar, z6, z5, iOException);
    }

    public r b() {
        c6.e g7 = ((f) this.f2485e).g();
        r rVar = g7 instanceof r ? (r) g7 : null;
        if (rVar != null) {
            return rVar;
        }
        throw new IllegalStateException("no connection for CONNECT tunnels");
    }

    public v c(boolean z5) {
        try {
            v j4 = ((f) this.f2485e).j(z5);
            if (j4 == null) {
                return j4;
            }
            j4.f3059n = this;
            return j4;
        } catch (IOException e4) {
            d(e4);
            throw e4;
        }
    }

    public void d(IOException iOException) {
        this.f2482b = true;
        ((f) this.f2485e).g().b((q) this.f2483c, iOException);
    }

    public a(Context context, String str, D1.b callback, boolean z5, boolean z6) {
        kotlin.jvm.internal.i.e(callback, "callback");
        this.f2483c = context;
        this.f2484d = str;
        this.f2485e = callback;
        this.f2481a = z5;
        this.f2482b = z6;
    }
}
