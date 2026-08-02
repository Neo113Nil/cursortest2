package v0;

import B0.o;
import android.content.Context;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import s0.C1185b;
import t0.C1189a;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: e, reason: collision with root package name */
    public static volatile j f10566e;

    /* renamed from: a, reason: collision with root package name */
    public final K0.j f10567a;

    /* renamed from: b, reason: collision with root package name */
    public final K0.j f10568b;

    /* renamed from: c, reason: collision with root package name */
    public final A0.e f10569c;

    /* renamed from: d, reason: collision with root package name */
    public final B0.m f10570d;

    public n(K0.j jVar, K0.j jVar2, A0.e eVar, B0.m mVar, o oVar) {
        this.f10567a = jVar;
        this.f10568b = jVar2;
        this.f10569c = eVar;
        this.f10570d = mVar;
        oVar.getClass();
        oVar.f158a.execute(new B0.n(0, oVar));
    }

    public static n a() {
        j jVar = f10566e;
        if (jVar != null) {
            return (n) jVar.f.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (f10566e == null) {
            synchronized (n.class) {
                try {
                    if (f10566e == null) {
                        S0.b bVar = new S0.b();
                        context.getClass();
                        bVar.f1334a = context;
                        f10566e = bVar.a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final A0.f c(C1189a c1189a) {
        byte[] bytes;
        Set unmodifiableSet = c1189a != null ? Collections.unmodifiableSet(C1189a.f10357d) : Collections.singleton(new C1185b("proto"));
        A0.f a3 = i.a();
        c1189a.getClass();
        a3.f23b = "cct";
        String str = c1189a.f10359a;
        String str2 = c1189a.f10360b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = ("1$" + str + "\\" + str2).getBytes(Charset.forName(CharEncoding.UTF_8));
        }
        a3.f24c = bytes;
        return new A0.f(unmodifiableSet, a3.t(), this, 24);
    }
}
