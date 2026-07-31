package t2;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.ads.dq;
import r2.e;
import r2.g;
import r2.m;
import r2.r;
import r2.v;
import r3.o;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: t2.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0140a extends e<a> {
    }

    public static void b(@RecentlyNonNull Context context, @RecentlyNonNull String str, @RecentlyNonNull g gVar, int i7, @RecentlyNonNull AbstractC0140a abstractC0140a) {
        o.j(context, "Context cannot be null.");
        o.j(str, "adUnitId cannot be null.");
        o.j(gVar, "AdRequest cannot be null.");
        new dq(context, str, gVar.a(), i7, abstractC0140a).a();
    }

    public static void c(@RecentlyNonNull Context context, @RecentlyNonNull String str, @RecentlyNonNull s2.a aVar, int i7, @RecentlyNonNull AbstractC0140a abstractC0140a) {
        o.j(context, "Context cannot be null.");
        o.j(str, "adUnitId cannot be null.");
        o.j(aVar, "AdManagerAdRequest cannot be null.");
        new dq(context, str, aVar.a(), i7, abstractC0140a).a();
    }

    public abstract v a();

    public abstract void d(m mVar);

    public abstract void e(boolean z6);

    public abstract void f(r rVar);

    public abstract void g(@RecentlyNonNull Activity activity);
}
