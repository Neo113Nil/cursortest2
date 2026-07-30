package B2;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import com.anythink.core.api.ATAdConst;
import com.google.android.gms.internal.ads.AbstractC2734Qa;
import com.google.android.gms.internal.ads.AbstractC3212fg;
import com.google.android.gms.internal.ads.AbstractC3368ia;
import com.google.android.gms.internal.ads.C3157eg;
import com.google.android.gms.internal.ads.C3381io;
import com.google.android.gms.internal.ads.SD;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import k2.C4635f;
import k2.C4636g;
import k2.EnumC4631b;

/* loaded from: classes.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f156a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f157b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final Context f158c;

    /* renamed from: d, reason: collision with root package name */
    public final C3381io f159d;

    /* renamed from: e, reason: collision with root package name */
    public final SD f160e;

    public E(Context context, C3381io c3381io, SD sd) {
        this.f158c = context;
        this.f159d = c3381io;
        this.f160e = sd;
    }

    public final synchronized void a(Object obj, E2.b bVar) {
        p2.j.f39798C.f39810k.getClass();
        AbstractC3212fg.f30743f.execute(new z(this, obj, new Pair(bVar, Long.valueOf(System.currentTimeMillis())), 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
    
        if (r11.f167a == null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void b(boolean z8, G g9) {
        try {
            HashMap hashMap = this.f156a;
            Boolean valueOf = Boolean.valueOf(z8);
            G g10 = (G) hashMap.get(valueOf);
            boolean z9 = true;
            if (g10 != null) {
                p2.j.f39798C.f39810k.getClass();
                if (!(g10.f169c <= System.currentTimeMillis())) {
                    if (g10.f167a != null) {
                    }
                }
            }
            hashMap.put(valueOf, g9);
            long longValue = (g9.f167a != null ? (Long) AbstractC2734Qa.f27168f.r() : (Long) AbstractC2734Qa.f27169g.r()).longValue();
            if (g9.f167a != null) {
                z9 = false;
            }
            AbstractC3212fg.f30741d.schedule(new C(this, z8, z9, 0), longValue, TimeUnit.SECONDS);
            HashMap hashMap2 = this.f157b;
            List list = (List) hashMap2.get(valueOf);
            hashMap2.put(valueOf, new ArrayList());
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    e(g9, (Pair) it.next(), false);
                }
            }
        } finally {
        }
    }

    public final void c(boolean z8) {
        HashMap hashMap = this.f157b;
        Boolean valueOf = Boolean.valueOf(z8);
        if (hashMap.containsKey(valueOf)) {
            return;
        }
        hashMap.put(valueOf, new ArrayList());
        ((C3157eg) this.f160e).submit(new D(0, this, z8));
    }

    public final synchronized void d(boolean z8, boolean z9) {
        Throwable th;
        try {
            try {
                Bundle bundle = new Bundle();
                bundle.putString("query_info_type", "requester_type_6");
                bundle.putBoolean("accept_3p_cookie", z8);
                HashMap hashMap = this.f156a;
                Boolean valueOf = Boolean.valueOf(z8);
                G g9 = (G) hashMap.get(valueOf);
                int i = 0;
                if (z9 && g9 != null) {
                    try {
                        i = g9.f170d + 1;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                G g10 = (G) hashMap.get(valueOf);
                F f6 = new F(this, z8, i, g10 == null ? null : Boolean.valueOf(g10.f171e.get()), this.f159d);
                C4636g c4636g = new C4636g((C4635f) new C4635f(1).e(bundle));
                if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.xc)).booleanValue()) {
                    ((C3157eg) this.f160e).submit(new CallableC0271e(this, c4636g, f6, 3));
                } else {
                    E2.a.a(this.f158c, EnumC4631b.BANNER, c4636g, f6);
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public final void e(G g9, Pair pair, boolean z8) {
        g9.f171e.set(true);
        E2.a aVar = g9.f167a;
        if (aVar != null) {
            ((E2.b) pair.first).onSuccess(aVar);
        } else {
            ((E2.b) pair.first).onFailure(g9.f168b);
        }
        Pair pair2 = new Pair("se", "query_g");
        Pair pair3 = new Pair(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.FORMAT, "BANNER");
        Pair pair4 = new Pair("rtype", Integer.toString(6));
        Pair pair5 = new Pair("scar", "true");
        p2.j.f39798C.f39810k.getClass();
        K3.b.L(this.f159d, "sgpcr", pair2, pair3, pair4, pair5, new Pair("lat_ms", Long.toString(System.currentTimeMillis() - ((Long) pair.second).longValue())), new Pair("sgpc_h", Boolean.toString(z8)), new Pair("sgpc_rs", Boolean.toString(aVar != null)));
    }
}
