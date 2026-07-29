package com.tapjoy.internal;

import com.tapjoy.TapjoyConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class hs extends hr {

    /* renamed from: d, reason: collision with root package name */
    public static final bi f8312d = new bi() { // from class: com.tapjoy.internal.hs.1
        @Override // com.tapjoy.internal.bi
        public final /* synthetic */ Object a(bn bnVar) {
            return new hs(bnVar);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f8313a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public Map f8314b;

    /* renamed from: c, reason: collision with root package name */
    public float f8315c;

    public hs(bn bnVar) {
        bnVar.h();
        String str = null;
        String str2 = null;
        while (bnVar.j()) {
            String l = bnVar.l();
            if ("layouts".equals(l)) {
                bnVar.a(this.f8313a, ib.f8354d);
            } else if ("meta".equals(l)) {
                this.f8314b = bnVar.d();
            } else if ("max_show_time".equals(l)) {
                this.f8315c = (float) bnVar.p();
            } else if ("ad_content".equals(l)) {
                str = bnVar.b();
            } else if (TapjoyConstants.TJC_REDIRECT_URL.equals(l)) {
                str2 = bnVar.b();
            } else {
                bnVar.s();
            }
        }
        bnVar.i();
        if (this.f8313a != null) {
            Iterator it = this.f8313a.iterator();
            while (it.hasNext()) {
                ib ibVar = (ib) it.next();
                if (ibVar.f8357c != null) {
                    Iterator it2 = ibVar.f8357c.iterator();
                    while (it2.hasNext()) {
                        ia iaVar = (ia) it2.next();
                        if (iaVar.i == null) {
                            iaVar.i = str;
                        }
                        if (iaVar.h == null) {
                            iaVar.h = str2;
                        }
                    }
                }
            }
        }
    }
}
