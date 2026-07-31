package b3;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.ads.ca0;
import r2.g;
import r2.m;
import r2.r;
import r2.v;
import r3.o;

/* loaded from: classes.dex */
public abstract class a {
    public static void b(@RecentlyNonNull Context context, @RecentlyNonNull String str, @RecentlyNonNull g gVar, @RecentlyNonNull b bVar) {
        o.j(context, "Context cannot be null.");
        o.j(str, "AdUnitId cannot be null.");
        o.j(gVar, "AdRequest cannot be null.");
        o.j(bVar, "LoadCallback cannot be null.");
        new ca0(context, str).i(gVar.a(), bVar);
    }

    public abstract v a();

    public abstract void c(m mVar);

    public abstract void d(boolean z6);

    public abstract void e(r rVar);

    public abstract void f(@RecentlyNonNull Activity activity);
}
