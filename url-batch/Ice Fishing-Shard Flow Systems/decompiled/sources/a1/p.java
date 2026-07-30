package a1;

import android.content.Context;
import j1.InterfaceC0568a;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: e, reason: collision with root package name */
    public static volatile X4.d f3078e;

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0568a f3079a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0568a f3080b;

    /* renamed from: c, reason: collision with root package name */
    public final f1.c f3081c;

    /* renamed from: d, reason: collision with root package name */
    public final g1.i f3082d;

    public p(InterfaceC0568a interfaceC0568a, InterfaceC0568a interfaceC0568a2, f1.c cVar, g1.i iVar, g1.j jVar) {
        this.f3079a = interfaceC0568a;
        this.f3080b = interfaceC0568a2;
        this.f3081c = cVar;
        this.f3082d = iVar;
        jVar.f5007a.execute(new A.k(17, jVar));
    }

    public static p a() {
        X4.d dVar = f3078e;
        if (dVar != null) {
            return (p) ((Q5.a) dVar.f2879o).get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (f3078e == null) {
            synchronized (p.class) {
                try {
                    if (f3078e == null) {
                        j jVar = new j();
                        context.getClass();
                        jVar.f3070a = context;
                        f3078e = jVar.a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final o c(k kVar) {
        byte[] bytes;
        Set unmodifiableSet = kVar != null ? Collections.unmodifiableSet(Y0.a.f2896d) : Collections.singleton(new X0.c("proto"));
        D0.j a7 = i.a();
        kVar.getClass();
        a7.f330e = "cct";
        Y0.a aVar = (Y0.a) kVar;
        String str = aVar.f2899a;
        String str2 = aVar.f2900b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = ("1$" + str + "\\" + str2).getBytes(Charset.forName("UTF-8"));
        }
        a7.f331i = bytes;
        return new o(unmodifiableSet, a7.A(), this);
    }
}
