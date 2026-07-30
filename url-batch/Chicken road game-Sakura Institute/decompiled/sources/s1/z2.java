package s1;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import com.android.installreferrer.R;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class z2 {

    /* renamed from: a, reason: collision with root package name */
    public static final LinkedHashMap f8493a = new LinkedHashMap();

    public static final f7.o0 a(Context context) {
        f7.o0 o0Var;
        LinkedHashMap linkedHashMap = f8493a;
        synchronized (linkedHashMap) {
            try {
                Object obj = linkedHashMap.get(context);
                if (obj == null) {
                    ContentResolver contentResolver = context.getContentResolver();
                    Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                    e7.e C = j1.c.C(-1, 6, null);
                    f7.a0 a0Var = new f7.a0(new g0.k2(contentResolver, uriFor, new y2(C, u3.z.f(Looper.getMainLooper())), C, context, null));
                    c7.n1 b9 = c7.a0.b();
                    j7.e eVar = c7.g0.f1696a;
                    obj = f7.f0.m(a0Var, new h7.c(t6.a.I(b9, h7.m.f4700a)), f7.j0.a(3), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                    linkedHashMap.put(context, obj);
                }
                o0Var = (f7.o0) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        return o0Var;
    }

    public static final g0.r b(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof g0.r) {
            return (g0.r) tag;
        }
        return null;
    }
}
