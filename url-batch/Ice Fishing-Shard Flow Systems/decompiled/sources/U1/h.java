package U1;

import P.InterfaceC0144i;
import android.content.Context;
import k6.InterfaceC0618m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC0639d;
import kotlin.jvm.internal.E;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.z;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC0618m[] f2730d;

    /* renamed from: a, reason: collision with root package name */
    public final String f2731a;

    /* renamed from: b, reason: collision with root package name */
    public final ThreadLocal f2732b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0144i f2733c;

    static {
        z zVar = new z(AbstractC0639d.NO_RECEIVER, h.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0);
        E.f6153a.getClass();
        f2730d = new InterfaceC0618m[]{zVar};
    }

    public h(Context context, String name) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f2731a = name;
        this.f2732b = new ThreadLocal();
        this.f2733c = d4.c.C(name, new l2.c(new a(this, 0)), new a(this, 1), 8).a(context, f2730d[0]);
    }

    public final void a(Function1 transform) {
        Intrinsics.checkNotNullParameter(transform, "transform");
    }
}
