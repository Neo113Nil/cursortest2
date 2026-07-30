package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import com.feathherdashh.dashgame.R;
import java.util.LinkedHashMap;
import kotlin.coroutines.e;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class vp1 {
    public static final LinkedHashMap a = new LinkedHashMap();

    public static final zd1 a(Context context) {
        zd1 zd1Var;
        LinkedHashMap linkedHashMap = a;
        synchronized (linkedHashMap) {
            try {
                Object obj = linkedHashMap.get(context);
                if (obj == null) {
                    ContentResolver contentResolver = context.getContentResolver();
                    Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                    we i = yr1.i(-1, 6, null);
                    nq0 nq0Var = new nq0(9, new yb1(contentResolver, uriFor, new up1(i, Handler.createAsync(Looper.getMainLooper())), i, context, null));
                    kf1 c = ca0.c();
                    nq nqVar = ls.a;
                    obj = p4.b0(nq0Var, new cn(e.c(c, pj0.a)), new vc1(), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                    linkedHashMap.put(context, obj);
                }
                zd1Var = (zd1) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zd1Var;
    }

    public static final ml b(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof ml) {
            return (ml) tag;
        }
        return null;
    }
}
