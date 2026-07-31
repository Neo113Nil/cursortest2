package s2;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.ads.ca0;
import r3.o;

/* loaded from: classes.dex */
public abstract class c extends b3.a {
    public static void g(@RecentlyNonNull Context context, @RecentlyNonNull String str, @RecentlyNonNull a aVar, @RecentlyNonNull d dVar) {
        o.j(context, "Context cannot be null.");
        o.j(str, "AdUnitId cannot be null.");
        o.j(aVar, "AdManagerAdRequest cannot be null.");
        o.j(dVar, "LoadCallback cannot be null.");
        new ca0(context, str).i(aVar.a(), dVar);
    }

    public abstract void h(e eVar);
}
