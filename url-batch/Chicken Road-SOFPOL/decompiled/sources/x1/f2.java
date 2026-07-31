package x1;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import com.snovikpovik.vuevnxsj.R;
import java.util.LinkedHashMap;
import m0.r2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class f2 {

    /* renamed from: a, reason: collision with root package name */
    public static final LinkedHashMap f8412a = new LinkedHashMap();

    public static final d7.l0 a(Context context) {
        d7.l0 l0Var;
        LinkedHashMap linkedHashMap = f8412a;
        synchronized (linkedHashMap) {
            try {
                Object obj = linkedHashMap.get(context);
                if (obj == null) {
                    ContentResolver contentResolver = context.getContentResolver();
                    Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                    c7.c a8 = c7.j.a(-1, null, 6);
                    d7.z zVar = new d7.z(new r2(contentResolver, uriFor, new e2(a8, m.a.n(Looper.getMainLooper())), a8, context, null));
                    a7.j1 j1Var = new a7.j1(null);
                    h7.e eVar = a7.d0.f249a;
                    obj = d7.e0.j(zVar, new f7.c(a.a.v(j1Var, f7.n.f2795a)), new d7.k0(), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                    linkedHashMap.put(context, obj);
                }
                l0Var = (d7.l0) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        return l0Var;
    }

    public static final m0.v b(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof m0.v) {
            return (m0.v) tag;
        }
        return null;
    }
}
