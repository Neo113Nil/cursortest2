package u0;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import com.gatesof.olympus.martu.marku.R;
import h2.AbstractC0508a;
import java.util.LinkedHashMap;
import q2.AbstractC0837y;
import t2.AbstractC1035F;
import t2.C1038I;
import t2.InterfaceC1043N;

/* loaded from: classes.dex */
public abstract class g1 {

    /* renamed from: a, reason: collision with root package name */
    public static final LinkedHashMap f9369a = new LinkedHashMap();

    public static final InterfaceC1043N a(Context context) {
        InterfaceC1043N interfaceC1043N;
        LinkedHashMap linkedHashMap = f9369a;
        synchronized (linkedHashMap) {
            try {
                Object obj = linkedHashMap.get(context);
                if (obj == null) {
                    ContentResolver contentResolver = context.getContentResolver();
                    Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                    s2.g a3 = n.r.a(-1, 6, null);
                    H1.c cVar = new H1.c(new e1(contentResolver, uriFor, new f1(a3, O2.d.G(Looper.getMainLooper())), a3, context, null));
                    q2.n0 b3 = AbstractC0837y.b();
                    x2.e eVar = q2.E.f7851a;
                    obj = AbstractC1035F.m(cVar, new v2.c(AbstractC0508a.L(b3, v2.m.f9819a)), C1038I.a(0L, 3), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                    linkedHashMap.put(context, obj);
                }
                interfaceC1043N = (InterfaceC1043N) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC1043N;
    }

    public static final I.r b(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof I.r) {
            return (I.r) tag;
        }
        return null;
    }
}
