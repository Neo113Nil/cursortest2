package com.tapjoy.internal;

import android.content.Context;
import com.mopub.common.AdType;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyConstants;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class ik extends ij {

    /* renamed from: c, reason: collision with root package name */
    public final String f8382c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f8383d = false;
    private final ha e;
    private final fb f;
    private final ev g;
    private final fi h;
    private Context i;

    @Override // com.tapjoy.internal.ca
    public final String c() {
        return "placement";
    }

    public ik(ha haVar, fb fbVar, ev evVar, fi fiVar, String str, Context context) {
        this.e = haVar;
        this.f = fbVar;
        this.g = evVar;
        this.h = fiVar;
        this.f8382c = str;
        this.i = context;
    }

    @Override // com.tapjoy.internal.ij, com.tapjoy.internal.ca
    public final Map e() {
        Map e = super.e();
        e.put(TJAdUnitConstants.String.VIDEO_INFO, new bm(hq.a(this.f)));
        e.put(TapjoyConstants.TJC_APP_PLACEMENT, new bm(hq.a(this.g)));
        e.put("user", new bm(hq.a(this.h)));
        e.put("placement", this.f8382c);
        return e;
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public hh f8384a;

        /* renamed from: b, reason: collision with root package name */
        public final List f8385b;

        public a(hh hhVar, List list) {
            this.f8384a = hhVar;
            this.f8385b = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tapjoy.internal.ij, com.tapjoy.internal.bz
    public final /* synthetic */ Object a(bn bnVar) {
        bnVar.h();
        hv hvVar = null;
        hs hsVar = null;
        List list = null;
        while (bnVar.j()) {
            String l = bnVar.l();
            if (AdType.INTERSTITIAL.equals(l)) {
                hvVar = (hv) bnVar.a(hv.n);
            } else if ("contextual_button".equals(l)) {
                hsVar = (hs) bnVar.a(hs.f8312d);
            } else if ("enabled_placements".equals(l)) {
                list = bnVar.c();
            } else {
                bnVar.s();
            }
        }
        bnVar.i();
        if (hvVar != null && (hvVar.a() || hvVar.b())) {
            return new a(new hf(this.e, this.f8382c, hvVar, this.i), list);
        }
        if (hsVar != null) {
            return new a(new gw(this.e, this.f8382c, hsVar, this.i), list);
        }
        return new a(new hg(), list);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tapjoy.internal.ij, com.tapjoy.internal.ca
    public final /* synthetic */ Object f() {
        a aVar = (a) super.f();
        if (!(aVar.f8384a instanceof hg)) {
            aVar.f8384a.b();
            if (!aVar.f8384a.c()) {
                new Object[1][0] = this.f8382c;
                aVar.f8384a = new hg();
            }
        }
        return aVar;
    }
}
