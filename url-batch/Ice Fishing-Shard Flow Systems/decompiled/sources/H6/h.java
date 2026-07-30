package H6;

import D6.B;
import D6.C;
import android.content.Context;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1050a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1051b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1052c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f1053d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f1054e;

    public h(q call, i finder, I6.g codec) {
        D6.l eventListener = D6.l.f538e;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        Intrinsics.checkNotNullParameter(finder, "finder");
        Intrinsics.checkNotNullParameter(codec, "codec");
        this.f1052c = call;
        this.f1053d = finder;
        this.f1054e = codec;
    }

    public static IOException a(h hVar, IOException ioe, int i2) {
        boolean z7 = (i2 & 2) == 0;
        boolean z8 = (i2 & 4) == 0;
        hVar.getClass();
        q call = (q) hVar.f1052c;
        if (ioe != null) {
            hVar.e(ioe);
        }
        if (z8) {
            if (ioe != null) {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(ioe, "ioe");
            } else {
                Intrinsics.checkNotNullParameter(call, "call");
            }
        }
        if (z7) {
            if (ioe != null) {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(ioe, "ioe");
            } else {
                Intrinsics.checkNotNullParameter(call, "call");
            }
        }
        return call.f(hVar, z8, z7, ioe);
    }

    public r b() {
        I6.f e7 = ((I6.g) this.f1054e).e();
        r rVar = e7 instanceof r ? (r) e7 : null;
        if (rVar != null) {
            return rVar;
        }
        throw new IllegalStateException("no connection for CONNECT tunnels");
    }

    public I6.j c(C response) {
        I6.g gVar = (I6.g) this.f1054e;
        Intrinsics.checkNotNullParameter(response, "response");
        try {
            String a7 = C.a(response, "Content-Type");
            long j = gVar.j(response);
            return new I6.j(a7, j, T6.b.b(new g(this, gVar.h(response), j)));
        } catch (IOException ioe) {
            q call = (q) this.f1052c;
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(ioe, "ioe");
            e(ioe);
            throw ioe;
        }
    }

    public B d(boolean z7) {
        try {
            B i2 = ((I6.g) this.f1054e).i(z7);
            if (i2 != null) {
                Intrinsics.checkNotNullParameter(this, "exchange");
                i2.f424n = this;
            }
            return i2;
        } catch (IOException ioe) {
            q call = (q) this.f1052c;
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(ioe, "ioe");
            e(ioe);
            throw ioe;
        }
    }

    public void e(IOException iOException) {
        this.f1051b = true;
        ((I6.g) this.f1054e).e().d((q) this.f1052c, iOException);
    }

    public h(Context context, String str, B6.o callback, boolean z7, boolean z8) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f1052c = context;
        this.f1053d = str;
        this.f1054e = callback;
        this.f1050a = z7;
        this.f1051b = z8;
    }
}
