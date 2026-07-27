package X4;

import android.content.Context;
import java.io.IOException;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3569a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3570b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3571c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f3572d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f3573e;

    public i(r call, j finder, Y4.g gVar) {
        kotlin.jvm.internal.i.e(call, "call");
        kotlin.jvm.internal.i.e(finder, "finder");
        this.f3571c = call;
        this.f3572d = finder;
        this.f3573e = gVar;
    }

    public static IOException a(i iVar, boolean z, boolean z5, IOException iOException, int i2) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            z5 = false;
        }
        if (iOException != null) {
            iVar.e(iOException);
        }
        iVar.getClass();
        r call = (r) iVar.f3571c;
        if (z5) {
            if (iOException != null) {
                kotlin.jvm.internal.i.e(call, "call");
            } else {
                kotlin.jvm.internal.i.e(call, "call");
            }
        }
        if (z) {
            if (iOException != null) {
                kotlin.jvm.internal.i.e(call, "call");
            } else {
                kotlin.jvm.internal.i.e(call, "call");
            }
        }
        return call.g(iVar, z5, z, iOException);
    }

    public s b() {
        Y4.f g6 = ((Y4.g) this.f3573e).g();
        s sVar = g6 instanceof s ? (s) g6 : null;
        if (sVar != null) {
            return sVar;
        }
        throw new IllegalStateException("no connection for CONNECT tunnels");
    }

    public Y4.j c(T4.z zVar) {
        Y4.g gVar = (Y4.g) this.f3573e;
        try {
            String c2 = zVar.f3020f.c("Content-Type");
            if (c2 == null) {
                c2 = null;
            }
            long f3 = gVar.f(zVar);
            return new Y4.j(c2, f3, j5.b.b(new h(this, gVar.h(zVar), f3)));
        } catch (IOException e3) {
            r call = (r) this.f3571c;
            kotlin.jvm.internal.i.e(call, "call");
            e(e3);
            throw e3;
        }
    }

    public T4.y d(boolean z) {
        try {
            T4.y j2 = ((Y4.g) this.f3573e).j(z);
            if (j2 != null) {
                j2.f3013n = this;
            }
            return j2;
        } catch (IOException e3) {
            r call = (r) this.f3571c;
            kotlin.jvm.internal.i.e(call, "call");
            e(e3);
            throw e3;
        }
    }

    public void e(IOException iOException) {
        this.f3570b = true;
        ((Y4.g) this.f3573e).g().d((r) this.f3571c, iOException);
    }

    public i(Context context, String str, B3.d callback, boolean z, boolean z5) {
        kotlin.jvm.internal.i.e(callback, "callback");
        this.f3571c = context;
        this.f3572d = str;
        this.f3573e = callback;
        this.f3569a = z;
        this.f3570b = z5;
    }
}
