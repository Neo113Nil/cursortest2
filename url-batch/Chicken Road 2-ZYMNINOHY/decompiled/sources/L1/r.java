package L1;

import android.content.Context;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: e, reason: collision with root package name */
    public static volatile l f1661e;

    /* renamed from: a, reason: collision with root package name */
    public final a2.i f1662a;

    /* renamed from: b, reason: collision with root package name */
    public final a2.i f1663b;

    /* renamed from: c, reason: collision with root package name */
    public final Q1.d f1664c;

    /* renamed from: d, reason: collision with root package name */
    public final R1.m f1665d;

    public r(a2.i iVar, a2.i iVar2, Q1.d dVar, R1.m mVar, R1.o oVar) {
        this.f1662a = iVar;
        this.f1663b = iVar2;
        this.f1664c = dVar;
        this.f1665d = mVar;
        oVar.f2373a.execute(new R1.n(0, oVar));
    }

    public static r a() {
        l lVar = f1661e;
        if (lVar != null) {
            return (r) lVar.f1654f.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (f1661e == null) {
            synchronized (r.class) {
                try {
                    if (f1661e == null) {
                        k kVar = new k();
                        context.getClass();
                        kVar.f1648a = context;
                        f1661e = kVar.a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final B1.j c(m mVar) {
        byte[] bytes;
        Set unmodifiableSet = mVar != null ? Collections.unmodifiableSet(J1.a.f1152d) : Collections.singleton(new I1.b("proto"));
        B1.j a3 = j.a();
        mVar.getClass();
        a3.f201b = "cct";
        J1.a aVar = (J1.a) mVar;
        String str = aVar.f1154a;
        String str2 = aVar.f1155b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = ("1$" + str + "\\" + str2).getBytes(Charset.forName(CharEncoding.UTF_8));
        }
        a3.f202c = bytes;
        return new B1.j(unmodifiableSet, a3.h(), this, 4);
    }
}
