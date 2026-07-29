package com.facebook.ads.internal;

import android.content.Context;
import android.os.Handler;
import com.facebook.ads.AdSettings;
import com.facebook.ads.AdSize;
import com.facebook.ads.NativeAd;
import com.facebook.ads.internal.adapters.AdAdapter;
import com.facebook.ads.internal.adapters.ab;
import com.facebook.ads.internal.adapters.ac;
import com.facebook.ads.internal.o.c;
import com.facebook.ads.internal.o.g;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.facebook.ads.internal.protocol.d;
import com.facebook.ads.internal.protocol.f;
import com.facebook.ads.internal.protocol.h;
import com.facebook.ads.internal.q.a.k;
import com.facebook.ads.internal.q.a.n;
import com.facebook.ads.internal.q.a.w;
import com.tapjoy.TapjoyConstants;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public class a implements c.a {

    /* renamed from: a, reason: collision with root package name */
    private final Context f4870a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4871b;

    /* renamed from: c, reason: collision with root package name */
    private final c f4872c;

    /* renamed from: d, reason: collision with root package name */
    private final f f4873d;
    private final d e;
    private final AdSize f;
    private final int g;
    private boolean h;
    private final Handler i;
    private final Runnable j;
    private final com.facebook.ads.internal.m.c k;
    private InterfaceC0341a l;
    private com.facebook.ads.internal.h.c m;

    /* renamed from: com.facebook.ads.internal.a$a, reason: collision with other inner class name */
    public interface InterfaceC0341a {
        void a(com.facebook.ads.internal.protocol.a aVar);

        void a(List<ab> list);
    }

    private static final class b extends w<a> {
        public b(a aVar) {
            super(aVar);
        }

        @Override // java.lang.Runnable
        public void run() {
            a a2 = a();
            if (a2 == null) {
                return;
            }
            if (com.facebook.ads.internal.q.e.a.a(a2.f4870a)) {
                a2.a();
            } else {
                a2.i.postDelayed(a2.j, 5000L);
            }
        }
    }

    static {
        com.facebook.ads.internal.q.a.d.a();
    }

    public a(Context context, String str, f fVar, AdSize adSize, d dVar, int i, EnumSet<NativeAd.MediaCacheFlag> enumSet) {
        this.f4870a = context;
        this.f4871b = str;
        this.f4873d = fVar;
        this.f = adSize;
        this.e = dVar;
        this.g = i;
        this.f4872c = new c(context);
        this.f4872c.a(this);
        this.h = true;
        this.i = new Handler();
        this.j = new b(this);
        this.k = com.facebook.ads.internal.m.d.a(context);
        com.facebook.ads.internal.i.a.a(context).a();
    }

    private List<ab> d() {
        com.facebook.ads.internal.h.c cVar = this.m;
        final ArrayList arrayList = new ArrayList(cVar.c());
        for (com.facebook.ads.internal.h.a d2 = cVar.d(); d2 != null; d2 = cVar.d()) {
            AdAdapter a2 = com.facebook.ads.internal.adapters.f.a(d2.a(), AdPlacementType.NATIVE);
            if (a2 != null && a2.getPlacementType() == AdPlacementType.NATIVE) {
                HashMap hashMap = new HashMap();
                hashMap.put("data", d2.b());
                hashMap.put("definition", cVar.a());
                ((ab) a2).a(this.f4870a, new ac() { // from class: com.facebook.ads.internal.a.1
                    @Override // com.facebook.ads.internal.adapters.ac
                    public void a(ab abVar) {
                        arrayList.add(abVar);
                    }

                    @Override // com.facebook.ads.internal.adapters.ac
                    public void a(ab abVar, com.facebook.ads.internal.protocol.a aVar) {
                    }

                    @Override // com.facebook.ads.internal.adapters.ac
                    public void b(ab abVar) {
                    }

                    @Override // com.facebook.ads.internal.adapters.ac
                    public void c(ab abVar) {
                    }
                }, this.k, hashMap, NativeAd.getViewTraversalPredicate());
            }
        }
        return arrayList;
    }

    public void a() {
        try {
            this.f4872c.a(new com.facebook.ads.internal.o.b(this.f4870a, new com.facebook.ads.internal.i.c(this.f4870a, false), this.f4871b, this.f != null ? new k(this.f.getHeight(), this.f.getWidth()) : null, this.f4873d, this.e, null, com.facebook.ads.internal.adapters.f.a(com.facebook.ads.internal.protocol.c.a(this.f4873d).a()), this.g, AdSettings.isTestMode(this.f4870a), AdSettings.isChildDirected(), new h(this.f4870a, null, null, null), n.a(com.facebook.ads.internal.l.a.m(this.f4870a))));
        } catch (com.facebook.ads.internal.protocol.b e) {
            a(com.facebook.ads.internal.protocol.a.a(e));
        }
    }

    public void a(InterfaceC0341a interfaceC0341a) {
        this.l = interfaceC0341a;
    }

    @Override // com.facebook.ads.internal.o.c.a
    public void a(g gVar) {
        com.facebook.ads.internal.h.c a2 = gVar.a();
        if (a2 == null) {
            throw new IllegalStateException("no placement in response");
        }
        if (this.h) {
            long c2 = a2.a().c();
            if (c2 == 0) {
                c2 = TapjoyConstants.SESSION_ID_INACTIVITY_TIME;
            }
            this.i.postDelayed(this.j, c2);
        }
        this.m = a2;
        List<ab> d2 = d();
        if (this.l != null) {
            if (d2.isEmpty()) {
                this.l.a(com.facebook.ads.internal.protocol.a.a(AdErrorType.NO_FILL, ""));
            } else {
                this.l.a(d2);
            }
        }
    }

    @Override // com.facebook.ads.internal.o.c.a
    public void a(com.facebook.ads.internal.protocol.a aVar) {
        if (this.h) {
            this.i.postDelayed(this.j, TapjoyConstants.SESSION_ID_INACTIVITY_TIME);
        }
        if (this.l != null) {
            this.l.a(aVar);
        }
    }

    public void b() {
    }

    public void c() {
        this.h = false;
        this.i.removeCallbacks(this.j);
    }
}
