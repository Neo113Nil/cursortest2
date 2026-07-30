package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import com.majelw.libystne.R;
import java.util.LinkedHashMap;
import kotlin.coroutines.f;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class s83 {
    public static final LinkedHashMap a = new LinkedHashMap();

    public static final to2 a(Context context) {
        to2 to2Var;
        LinkedHashMap linkedHashMap = a;
        synchronized (linkedHashMap) {
            try {
                Object obj = linkedHashMap.get(context);
                if (obj == null) {
                    ContentResolver contentResolver = context.getContentResolver();
                    Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                    lq g = s93.g(-1, 6, null);
                    x60 x60Var = new x60(2, new oh0(contentResolver, uriFor, new r83(g, j8.u(Looper.getMainLooper())), g, context, null));
                    oq2 a2 = gk2.a();
                    t80 t80Var = vb0.a;
                    obj = iv1.U(x60Var, new m30(f.c(a2, qh1.a)), new po2(0L, Long.MAX_VALUE), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                    linkedHashMap.put(context, obj);
                }
                to2Var = (to2) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        return to2Var;
    }

    public static final d00 b(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof d00) {
            return (d00) tag;
        }
        return null;
    }
}
