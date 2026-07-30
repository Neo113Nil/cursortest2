package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.net.Uri;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import q2.C4907p;

/* renamed from: com.google.android.gms.internal.ads.t8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3940t8 implements InterfaceC4063vN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34366a;

    public /* synthetic */ C3940t8(int i) {
        this.f34366a = i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4279zN
    public final Object d() {
        switch (this.f34366a) {
            case 0:
                return new C3886s8();
            case 1:
                C2690Nh c2690Nh = new C2690Nh();
                c2690Nh.f26591a = null;
                return c2690Nh;
            case 2:
                return p2.j.f39798C.f39808h;
            case 3:
                ExecutorService executorService = AbstractC3212fg.f30744g;
                AbstractC3137eE.h(executorService);
                return new C4086vt(3, executorService);
            case 4:
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setPackage("com.android.vending");
                intent.setData(Uri.parse("https://play.google.com/d"));
                return intent;
            case 5:
                String str = C4907p.f40108g.f40114f;
                AbstractC3137eE.h(str);
                return str;
            case 6:
                return new ArrayDeque();
            case 7:
                return new T2(29);
            case 8:
                return new C2837Wb(14);
            case 9:
                return new C2837Wb(17);
            case 10:
                return p2.j.f39798C.f39824y;
            case 11:
                return new C2589Hi();
            case 12:
                return EnumC2969b9.APP_OPEN;
            case 13:
                return "app_open_ad";
            case 14:
                return EnumC2969b9.BANNER;
            case 15:
                return com.anythink.expressad.foundation.g.a.f.f19281e;
            case 16:
                return new C2862Xj();
            case 17:
                return new C2999bl();
            case 18:
                C3378il c3378il = new C3378il();
                C3151ea c3151ea = AbstractC3368ia.f31511O1;
                q2.r rVar = q2.r.f40116e;
                c3378il.f31994n = ((Integer) rVar.f40119c.a(c3151ea)).intValue();
                c3378il.f31995u = ((Integer) rVar.f40119c.a(AbstractC3368ia.qe)).intValue();
                return c3378il;
            case 19:
                Set set = Collections.EMPTY_SET;
                AbstractC3137eE.h(set);
                return set;
            case 20:
                Set set2 = Collections.EMPTY_SET;
                AbstractC3137eE.h(set2);
                return set2;
            case 21:
                Set set3 = Collections.EMPTY_SET;
                AbstractC3137eE.h(set3);
                return set3;
            case 22:
                Set set4 = Collections.EMPTY_SET;
                AbstractC3137eE.h(set4);
                return set4;
            case 23:
                Set set5 = Collections.EMPTY_SET;
                AbstractC3137eE.h(set5);
                return set5;
            case 24:
                Set set6 = Collections.EMPTY_SET;
                AbstractC3137eE.h(set6);
                return set6;
            case 25:
                Set set7 = Collections.EMPTY_SET;
                AbstractC3137eE.h(set7);
                return set7;
            case 26:
                Set set8 = Collections.EMPTY_SET;
                AbstractC3137eE.h(set8);
                return set8;
            case 27:
                return new C4078vl();
            case 28:
                return EnumC2969b9.INTERSTITIAL;
            default:
                return com.anythink.expressad.foundation.g.a.f.f19280d;
        }
    }

    public C3940t8(C3809ql c3809ql) {
        this.f34366a = 20;
    }
}
