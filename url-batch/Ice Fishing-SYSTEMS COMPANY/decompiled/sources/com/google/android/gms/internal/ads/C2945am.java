package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.UUID;

/* renamed from: com.google.android.gms.internal.ads.am, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2945am implements InterfaceC4063vN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29299a;

    public /* synthetic */ C2945am(int i) {
        this.f29299a = i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4279zN
    public final Object d() {
        switch (this.f29299a) {
            case 0:
                return EnumC2969b9.AD_LOADER;
            case 1:
                return com.anythink.expressad.foundation.g.a.f.f19277a;
            case 2:
                return null;
            case 3:
                return new Gr();
            case 4:
                return null;
            case 5:
                return null;
            case 6:
                return null;
            case 7:
                return new C4242yn();
            case 8:
                return new C2679Mn();
            case 9:
                return new C2764Rn();
            case 10:
                C3157eg c3157eg = AbstractC3212fg.f30738a;
                AbstractC3137eE.h(c3157eg);
                return new C2815Un(c3157eg);
            case 11:
                return new C2849Wn(11, 12, 1007);
            case 12:
                return new C2849Wn(19, 20, 1008);
            case 13:
                return new C2849Wn(13, 14, 1004);
            case 14:
                return new C2849Wn(1001, AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE, 1003);
            case 15:
                return new C2849Wn(15, 16, 1005);
            case 16:
                return new C2849Wn(17, 18, 1006);
            case 17:
                return new C3274go(Lu.SIGNALS, com.anythink.expressad.foundation.d.j.cL);
            case 18:
                return new C3274go(Lu.PRELOADED_LOADER, "t_load_as");
            case 19:
                return new C3758po();
            case 20:
                return new C2544Eo();
            case 21:
                t2.G g9 = p2.j.f39798C.f39803c;
                String uuid = UUID.randomUUID().toString();
                AbstractC3137eE.h(uuid);
                return uuid;
            case 22:
                return new C2749Qp();
            case 23:
                C3157eg c3157eg2 = AbstractC3212fg.f30738a;
                AbstractC3137eE.h(c3157eg2);
                return new C4084vr(c3157eg2);
            case 24:
                return new Hr();
            case 25:
                return new C3114ds();
            case 26:
                C3157eg c3157eg3 = AbstractC3212fg.f30738a;
                AbstractC3137eE.h(c3157eg3);
                return new C3923ss(c3157eg3, 0);
            case 27:
                Object arrayList = new ArrayList();
                C3151ea c3151ea = AbstractC3368ia.id;
                q2.r rVar = q2.r.f40116e;
                if (!((String) rVar.f40119c.a(c3151ea)).isEmpty()) {
                    arrayList = Arrays.asList(((String) rVar.f40119c.a(c3151ea)).split(","));
                }
                AbstractC3137eE.h(arrayList);
                return arrayList;
            case 28:
                C3157eg c3157eg4 = AbstractC3212fg.f30738a;
                AbstractC3137eE.h(c3157eg4);
                return new C3923ss(c3157eg4, 1);
            default:
                C3157eg c3157eg5 = AbstractC3212fg.f30738a;
                AbstractC3137eE.h(c3157eg5);
                return new C3923ss(c3157eg5, 2);
        }
    }
}
