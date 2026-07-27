package B1;

import A.f0;
import W2.s0;
import android.content.Context;
import f1.C0607a;
import i1.C0678a;
import i1.C0679b;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class J {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ S2.e[] f969a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0679b f970b;

    static {
        M2.y yVar = new M2.y(J.class, "villageStore", "getVillageStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;");
        M2.F.f3581a.getClass();
        f969a = new S2.e[]{yVar};
        C0678a produceMigrations = C0678a.f7002d;
        d3.e eVar = W2.J.f4225a;
        d3.d dVar = d3.d.f6116i;
        s0 s0Var = new s0(null);
        dVar.getClass();
        b3.c scope = W2.B.a(kotlin.coroutines.f.c(s0Var, dVar));
        Intrinsics.checkNotNullParameter("app_state", "name");
        Intrinsics.checkNotNullParameter(produceMigrations, "produceMigrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        f970b = new C0679b(produceMigrations, scope);
    }

    public static final C0607a a(Context thisRef) {
        C0607a c0607a;
        C0679b c0679b = f970b;
        S2.e property = f969a[0];
        c0679b.getClass();
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        C0607a c0607a2 = c0679b.f7006d;
        if (c0607a2 != null) {
            return c0607a2;
        }
        synchronized (c0679b.f7005c) {
            try {
                if (c0679b.f7006d == null) {
                    Context applicationContext = thisRef.getApplicationContext();
                    Function1 function1 = c0679b.f7003a;
                    Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
                    c0679b.f7006d = u3.l.W((List) function1.invoke(applicationContext), c0679b.f7004b, new f0(applicationContext, 4, c0679b));
                }
                c0607a = c0679b.f7006d;
                Intrinsics.c(c0607a);
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0607a;
    }
}
