package i3;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.ads.pk0;
import r2.g;
import r2.m;
import r2.r;
import r2.s;
import r2.v;
import r3.o;

/* loaded from: classes.dex */
public abstract class c {
    public static void b(@RecentlyNonNull Context context, @RecentlyNonNull String str, @RecentlyNonNull g gVar, @RecentlyNonNull d dVar) {
        o.j(context, "Context cannot be null.");
        o.j(str, "AdUnitId cannot be null.");
        o.j(gVar, "AdRequest cannot be null.");
        o.j(dVar, "LoadCallback cannot be null.");
        new pk0(context, str).j(gVar.a(), dVar);
    }

    public static void c(@RecentlyNonNull Context context, @RecentlyNonNull String str, @RecentlyNonNull s2.a aVar, @RecentlyNonNull d dVar) {
        o.j(context, "Context cannot be null.");
        o.j(str, "AdUnitId cannot be null.");
        o.j(aVar, "AdManagerAdRequest cannot be null.");
        o.j(dVar, "LoadCallback cannot be null.");
        new pk0(context, str).j(aVar.a(), dVar);
    }

    public abstract v a();

    public abstract void d(m mVar);

    public abstract void e(boolean z6);

    public abstract void f(a aVar);

    public abstract void g(r rVar);

    public abstract void h(e eVar);

    public abstract void i(@RecentlyNonNull Activity activity, @RecentlyNonNull s sVar);
}
