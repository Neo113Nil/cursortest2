package com.anythink.basead.h;

import android.app.Activity;
import android.content.Context;
import com.anythink.basead.g.b;
import com.anythink.basead.g.j;
import com.anythink.basead.g.k;
import com.anythink.basead.ui.BaseATActivity;
import com.anythink.core.common.h.x;
import java.util.Map;

/* loaded from: classes.dex */
public class d extends c {

    /* renamed from: a, reason: collision with root package name */
    public static final String f9167a = "d";

    /* renamed from: k, reason: collision with root package name */
    private k f9168k;

    public d(Context context, x xVar, String str, boolean z8) {
        super(context, xVar, str, z8);
    }

    public final void a(k kVar) {
        this.f9168k = kVar;
    }

    @Override // com.anythink.basead.h.a
    public final void a(Activity activity, Map<String, Object> map) {
        try {
            if (this.f9160c == null) {
                k kVar = this.f9168k;
                if (kVar != null) {
                    kVar.onShowFailed(com.anythink.basead.d.g.a(com.anythink.basead.d.g.i, com.anythink.basead.d.g.f6310H));
                    return;
                }
                return;
            }
            String str = "";
            try {
                Object obj = map.get("extra_scenario");
                if (obj != null) {
                    str = obj.toString();
                }
            } catch (Throwable unused) {
            }
            map.get(c.f9157h);
            int intValue = ((Integer) map.get(c.f9158j)).intValue();
            final String str2 = this.f9161d.f14313b + this.f9162e + System.currentTimeMillis();
            com.anythink.basead.g.b.a().a(str2, new b.AbstractC0041b() { // from class: com.anythink.basead.h.d.1
                @Override // com.anythink.basead.g.b.AbstractC0041b
                public final void a(j jVar) {
                    if (d.this.f9168k != null) {
                        d.this.f9168k.onAdShow(jVar);
                    }
                }

                @Override // com.anythink.basead.g.b.AbstractC0041b
                public final void b() {
                    if (d.this.f9168k != null) {
                        d.this.f9168k.onVideoAdPlayEnd();
                    }
                }

                @Override // com.anythink.basead.g.b.AbstractC0041b
                public final void c() {
                }

                @Override // com.anythink.basead.g.b.AbstractC0041b
                public final void d() {
                    if (d.this.f9168k != null) {
                        d.this.f9168k.onAdClosed();
                    }
                    com.anythink.basead.g.b.a().b(str2);
                }

                @Override // com.anythink.basead.g.b.AbstractC0041b
                public final void a(com.anythink.basead.d.f fVar) {
                    fVar.c();
                    if (d.this.f9168k != null) {
                        d.this.f9168k.onShowFailed(fVar);
                    }
                }

                @Override // com.anythink.basead.g.b.AbstractC0041b
                public final void b(j jVar) {
                    if (d.this.f9168k != null) {
                        d.this.f9168k.onAdClick(jVar);
                    }
                }

                @Override // com.anythink.basead.g.b.AbstractC0041b
                public final void a() {
                    if (d.this.f9168k != null) {
                        d.this.f9168k.onVideoAdPlayStart();
                    }
                }

                @Override // com.anythink.basead.g.b.AbstractC0041b
                public final void a(boolean z8) {
                    if (d.this.f9168k != null) {
                        d.this.f9168k.onDeeplinkCallback(z8);
                    }
                }
            });
            com.anythink.core.basead.b.c cVar = new com.anythink.core.basead.b.c();
            cVar.f12076c = this.f9164g;
            cVar.f12077d = str2;
            cVar.f12074a = 3;
            cVar.f12081h = this.f9161d;
            cVar.f12078e = intValue;
            cVar.f12075b = str;
            BaseATActivity.a(activity, cVar);
        } catch (Exception e6) {
            e6.printStackTrace();
            k kVar2 = this.f9168k;
            if (kVar2 != null) {
                kVar2.onShowFailed(com.anythink.basead.d.g.a("-9999", e6.getMessage()));
            }
        }
    }
}
