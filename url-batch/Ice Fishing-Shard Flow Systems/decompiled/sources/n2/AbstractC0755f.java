package n2;

import N2.j;
import R5.i;
import R5.q;
import android.content.Context;
import h3.n;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: n2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0755f {

    /* renamed from: a, reason: collision with root package name */
    public static final q f6978a = i.b(C0754e.f6977d);

    public static final j a() {
        return c().getInAppMessages();
    }

    public static final n b() {
        return c().getNotifications();
    }

    public static InterfaceC0751b c() {
        return (InterfaceC0751b) f6978a.getValue();
    }

    public static t2.b d() {
        InterfaceC0751b c7 = c();
        Intrinsics.c(c7, "null cannot be cast to non-null type com.onesignal.common.services.IServiceProvider");
        return (t2.b) c7;
    }

    public static final O3.a e() {
        return c().getUser();
    }

    public static final Object f(Context context, X5.c cVar) {
        return c().initWithContext(context, cVar);
    }
}
