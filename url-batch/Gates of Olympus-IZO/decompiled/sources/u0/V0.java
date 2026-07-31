package u0;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import b0.C0276i;
import com.gates.olympus.miruv.R;
import java.util.LinkedHashMap;
import k2.AbstractC0529a;
import k2.AbstractC0552y;
import k2.EnumC0551x;
import n2.AbstractC0682G;
import n2.C0676A;
import n2.C0677B;
import n2.C0685J;
import n2.C0689N;
import n2.C0692Q;
import n2.C0717w;
import n2.InterfaceC0690O;
import n2.InterfaceC0700f;

/* loaded from: classes.dex */
public abstract class V0 {

    /* renamed from: a, reason: collision with root package name */
    public static final LinkedHashMap f8262a = new LinkedHashMap();

    public static final InterfaceC0690O a(Context context) {
        InterfaceC0690O interfaceC0690O;
        LinkedHashMap linkedHashMap = f8262a;
        synchronized (linkedHashMap) {
            try {
                Object obj = linkedHashMap.get(context);
                if (obj == null) {
                    ContentResolver contentResolver = context.getContentResolver();
                    Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                    m2.e a3 = m2.l.a(-1, 6, null);
                    C0677B c0677b = new C0677B(new T0(contentResolver, uriFor, new U0(a3, M1.B.v(Looper.getMainLooper())), a3, context, null));
                    k2.n0 b2 = AbstractC0552y.b();
                    r2.e eVar = k2.E.f5312a;
                    P1.i M3 = I2.l.M(b2, p2.n.f6799a);
                    C0689N c0689n = new C0689N(0L, Long.MAX_VALUE);
                    Float valueOf = Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f));
                    C0276i f3 = AbstractC0682G.f(c0677b, 1);
                    C0692Q b3 = AbstractC0682G.b(valueOf);
                    P1.i iVar = (P1.i) f3.f4275d;
                    InterfaceC0700f interfaceC0700f = (InterfaceC0700f) f3.f4273b;
                    EnumC0551x enumC0551x = c0689n.equals(C0685J.f6302a) ? EnumC0551x.f5395d : EnumC0551x.f5398g;
                    C0717w c0717w = new C0717w(c0689n, interfaceC0700f, b3, valueOf, null);
                    P1.i g3 = AbstractC0552y.g(M3, iVar, true);
                    r2.e eVar2 = k2.E.f5312a;
                    if (g3 != eVar2 && g3.k(P1.e.f3072d) == null) {
                        g3 = g3.o(eVar2);
                    }
                    AbstractC0529a g0Var = enumC0551x == EnumC0551x.f5396e ? new k2.g0(g3, c0717w) : new k2.m0(g3, true);
                    g0Var.g0(enumC0551x, g0Var, c0717w);
                    obj = new C0676A(b3);
                    linkedHashMap.put(context, obj);
                }
                interfaceC0690O = (InterfaceC0690O) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC0690O;
    }

    public static final I.r b(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof I.r) {
            return (I.r) tag;
        }
        return null;
    }
}
