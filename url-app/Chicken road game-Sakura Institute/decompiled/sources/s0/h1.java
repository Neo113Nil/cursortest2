package s0;

import W2.AbstractC0275a;
import W2.AbstractC0296s;
import W2.EnumC0303z;
import Z.C0311h;
import Z2.InterfaceC0330f;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import com.chicken.road.kedro.laqer.R;
import java.util.LinkedHashMap;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public abstract class h1 {

    /* renamed from: a, reason: collision with root package name */
    public static final LinkedHashMap f10236a = new LinkedHashMap();

    public static final Z2.P a(Context context) {
        Z2.P p4;
        LinkedHashMap linkedHashMap = f10236a;
        synchronized (linkedHashMap) {
            try {
                Object obj = linkedHashMap.get(context);
                if (obj == null) {
                    ContentResolver contentResolver = context.getContentResolver();
                    Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                    Y2.e a4 = Y2.l.a(-1, 6, null);
                    Z2.C c4 = new Z2.C(new f1(contentResolver, uriFor, new g1(a4, j0.c.t(Looper.getMainLooper())), a4, context, null));
                    W2.s0 s0Var = new W2.s0(null);
                    d3.e eVar = W2.J.f4225a;
                    CoroutineContext c5 = kotlin.coroutines.f.c(b3.m.f5679a, s0Var);
                    Z2.O o4 = new Z2.O(0L, Long.MAX_VALUE);
                    Float valueOf = Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f));
                    C0311h g4 = Z2.H.g(c4, 1);
                    Z2.S c6 = Z2.H.c(valueOf);
                    CoroutineContext coroutineContext = (CoroutineContext) g4.f4527d;
                    InterfaceC0330f interfaceC0330f = (InterfaceC0330f) g4.f4525b;
                    EnumC0303z enumC0303z = o4.equals(Z2.K.f4641a) ? EnumC0303z.f4304d : EnumC0303z.f4307j;
                    Z2.x xVar = new Z2.x(o4, interfaceC0330f, c6, valueOf, null);
                    CoroutineContext a5 = AbstractC0296s.a(c5, coroutineContext, true);
                    d3.e eVar2 = W2.J.f4225a;
                    if (a5 != eVar2 && a5.k(kotlin.coroutines.e.f7496f) == null) {
                        a5 = a5.s(eVar2);
                    }
                    AbstractC0275a l0Var = enumC0303z == EnumC0303z.f4305e ? new W2.l0(a5, xVar) : new W2.r0(a5, true);
                    l0Var.j0(enumC0303z, l0Var, xVar);
                    obj = new Z2.B(c6);
                    linkedHashMap.put(context, obj);
                }
                p4 = (Z2.P) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        return p4;
    }

    public static final G.r b(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof G.r) {
            return (G.r) tag;
        }
        return null;
    }
}
