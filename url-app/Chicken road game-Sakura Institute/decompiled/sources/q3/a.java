package q3;

import C.F;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import m3.n;
import m3.r;
import m3.w;

/* loaded from: classes.dex */
public final class a implements n {

    /* renamed from: a, reason: collision with root package name */
    public static final a f9363a = new a();

    @Override // m3.n
    public final w a(r3.f chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        g call = chain.f9865a;
        call.getClass();
        Intrinsics.checkNotNullParameter(chain, "chain");
        synchronized (call) {
            if (!call.f9399r) {
                throw new IllegalStateException("released");
            }
            if (call.f9398q) {
                throw new IllegalStateException("Check failed.");
            }
            if (call.f9397p) {
                throw new IllegalStateException("Check failed.");
            }
            Unit unit = Unit.f7487a;
        }
        d finder = call.f9394m;
        Intrinsics.c(finder);
        r client = call.f9388d;
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(chain, "chain");
        try {
            int i2 = chain.f9870f;
            int i4 = chain.f9871g;
            int i5 = chain.f9872h;
            client.getClass();
            r3.d codec = finder.a(i2, i4, i5, client.f8437l, !Intrinsics.a((String) chain.f9869e.f363d, "GET")).j(client, chain);
            m3.j eventListener = m3.j.f8386d;
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(eventListener, "eventListener");
            Intrinsics.checkNotNullParameter(finder, "finder");
            Intrinsics.checkNotNullParameter(codec, "codec");
            F f4 = new F();
            f4.f1052b = call;
            f4.f1053c = finder;
            f4.f1054d = codec;
            f4.f1055e = codec.h();
            call.f9396o = f4;
            call.f9401t = f4;
            synchronized (call) {
                call.f9397p = true;
                call.f9398q = true;
            }
            if (call.f9400s) {
                throw new IOException("Canceled");
            }
            return r3.f.a(chain, 0, f4, null, 61).b(chain.f9869e);
        } catch (IOException e4) {
            finder.c(e4);
            throw new k(e4);
        } catch (k e5) {
            finder.c(e5.f9425e);
            throw e5;
        }
    }
}
