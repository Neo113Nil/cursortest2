package L1;

import F2.n;
import android.content.Context;
import k5.C0481k;
import kotlin.jvm.internal.i;
import l2.j;
import m1.AbstractC0521b;
import q5.AbstractC0607c;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final C0481k f1441a = AbstractC0521b.x(e.f1440f);

    public static final j a() {
        return c().getInAppMessages();
    }

    public static final n b() {
        return c().getNotifications();
    }

    public static b c() {
        return (b) f1441a.getValue();
    }

    public static R1.b d() {
        b c7 = c();
        i.c(c7, "null cannot be cast to non-null type com.onesignal.common.services.IServiceProvider");
        return (R1.b) c7;
    }

    public static final m3.a e() {
        return c().getUser();
    }

    public static final Object f(Context context, AbstractC0607c abstractC0607c) {
        return c().initWithContext(context, abstractC0607c);
    }
}
