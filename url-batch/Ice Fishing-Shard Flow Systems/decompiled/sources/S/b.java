package S;

import android.content.Context;
import java.util.List;
import k6.InterfaceC0618m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f2445a;

    /* renamed from: b, reason: collision with root package name */
    public final l2.c f2446b;

    /* renamed from: c, reason: collision with root package name */
    public final Function1 f2447c;

    /* renamed from: d, reason: collision with root package name */
    public final s6.c f2448d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f2449e;

    /* renamed from: f, reason: collision with root package name */
    public volatile l2.c f2450f;

    public b(String name, l2.c cVar, Function1 produceMigrations, s6.c scope) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(produceMigrations, "produceMigrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f2445a = name;
        this.f2446b = cVar;
        this.f2447c = produceMigrations;
        this.f2448d = scope;
        this.f2449e = new Object();
    }

    public final l2.c a(Context thisRef, InterfaceC0618m property) {
        l2.c cVar;
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        l2.c cVar2 = this.f2450f;
        if (cVar2 != null) {
            return cVar2;
        }
        synchronized (this.f2449e) {
            try {
                if (this.f2450f == null) {
                    Context applicationContext = thisRef.getApplicationContext();
                    l2.c cVar3 = this.f2446b;
                    Function1 function1 = this.f2447c;
                    Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
                    this.f2450f = V6.b.m(cVar3, (List) function1.invoke(applicationContext), this.f2448d, new A0.j(applicationContext, 3, this));
                }
                cVar = this.f2450f;
                Intrinsics.b(cVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }
}
