package k6;

import android.content.Context;
import androidx.lifecycle.d0;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.collections.i0;
import s7.c0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: e, reason: collision with root package name */
    public static volatile j f5480e;

    /* renamed from: a, reason: collision with root package name */
    public final c0 f5481a;

    /* renamed from: b, reason: collision with root package name */
    public final c0 f5482b;

    /* renamed from: c, reason: collision with root package name */
    public final p6.b f5483c;

    /* renamed from: d, reason: collision with root package name */
    public final q6.i f5484d;

    public o(c0 c0Var, c0 c0Var2, p6.b bVar, q6.i iVar, c6.i iVar2) {
        this.f5481a = c0Var;
        this.f5482b = c0Var2;
        this.f5483c = bVar;
        this.f5484d = iVar;
        ((Executor) iVar2.f1820a).execute(new d0(16, iVar2));
    }

    public static o a() {
        j jVar = f5480e;
        if (jVar != null) {
            return (o) jVar.f5472t.get();
        }
        i0.l("Not initialized!");
        return null;
    }

    public static void b(Context context) {
        if (f5480e == null) {
            synchronized (o.class) {
                try {
                    if (f5480e == null) {
                        c4.o oVar = new c4.o();
                        context.getClass();
                        oVar.f1772d = context;
                        f5480e = oVar.c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final n c(i6.a aVar) {
        Set unmodifiableSet = aVar instanceof i6.a ? Collections.unmodifiableSet(i6.a.f4648d) : Collections.singleton(new h6.c("proto"));
        a1.n a9 = i.a();
        aVar.getClass();
        a9.f40e = "cct";
        String str = aVar.f4651a;
        String str2 = aVar.f4652b;
        if (str2 == null) {
            str2 = "";
        }
        a9.f41i = ("1$" + str + "\\" + str2).getBytes(Charset.forName("UTF-8"));
        return new n(unmodifiableSet, a9.k(), this);
    }
}
