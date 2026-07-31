package D0;

import H1.RunnableC0139m;
import android.content.Context;
import j5.InterfaceC0438a;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import q4.C0603d;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: e, reason: collision with root package name */
    public static volatile C0603d f357e;

    /* renamed from: a, reason: collision with root package name */
    public final M0.a f358a;

    /* renamed from: b, reason: collision with root package name */
    public final M0.a f359b;

    /* renamed from: c, reason: collision with root package name */
    public final I0.b f360c;

    /* renamed from: d, reason: collision with root package name */
    public final J0.k f361d;

    public s(M0.a aVar, M0.a aVar2, I0.b bVar, J0.k kVar, J0.l lVar) {
        this.f358a = aVar;
        this.f359b = aVar2;
        this.f360c = bVar;
        this.f361d = kVar;
        lVar.f1278a.execute(new RunnableC0139m(4, lVar));
    }

    public static s a() {
        C0603d c0603d = f357e;
        if (c0603d != null) {
            return (s) ((InterfaceC0438a) c0603d.f5806l).get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (f357e == null) {
            synchronized (s.class) {
                try {
                    if (f357e == null) {
                        k kVar = new k();
                        context.getClass();
                        kVar.f345a = context;
                        f357e = kVar.a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final r c(l lVar) {
        byte[] bytes;
        Set unmodifiableSet = lVar != null ? Collections.unmodifiableSet(B0.a.f63d) : Collections.singleton(new A0.c("proto"));
        B0.c a7 = j.a();
        lVar.getClass();
        a7.f71g = "cct";
        B0.a aVar = (B0.a) lVar;
        String str = aVar.f66a;
        String str2 = aVar.f67b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = ("1$" + str + "\\" + str2).getBytes(Charset.forName("UTF-8"));
        }
        a7.f72h = bytes;
        return new r(unmodifiableSet, a7.e(), this);
    }
}
