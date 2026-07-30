package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.sJ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3897sJ implements AG {

    /* renamed from: a, reason: collision with root package name */
    public static final C3897sJ f34226a = new C3897sJ();

    /* renamed from: b, reason: collision with root package name */
    public static final C4002uG f34227b = new C4002uG(C3085dG.class, InterfaceC4108wE.class, DF.f24403W);

    @Override // com.google.android.gms.internal.ads.AG
    public final Class a() {
        return InterfaceC4108wE.class;
    }

    @Override // com.google.android.gms.internal.ads.AG
    public final Object b(C2593Hm c2593Hm, C4164xG c4164xG) {
        C3791qK j9;
        List arrayList;
        HashMap hashMap = new HashMap();
        for (int i = 0; i < ((List) c2593Hm.f25417v).size(); i++) {
            C3838rE t9 = c2593Hm.t(i);
            if (t9.f33996b.equals(C3731pE.f33363v)) {
                InterfaceC4108wE interfaceC4108wE = (InterfaceC4108wE) c4164xG.J(t9);
                XC xc = t9.f33995a;
                if (xc instanceof KJ) {
                    j9 = ((KJ) xc).j();
                } else {
                    if (!(xc instanceof C3085dG)) {
                        String name = xc.getClass().getName();
                        String valueOf = String.valueOf(xc.b());
                        throw new GeneralSecurityException(com.anythink.basead.b.c.i.q(new StringBuilder(name.length() + 59 + valueOf.length()), "Cannot get output prefix for key of class ", name, " with parameters ", valueOf));
                    }
                    j9 = ((C3085dG) xc).j();
                }
                XJ xj = new XJ(interfaceC4108wE, t9.f33997c);
                byte[] bArr = j9.f33687a;
                if (bArr.length != 0 && bArr.length != 5) {
                    throw new GeneralSecurityException("PrefixMap only supports 0 and 5 byte prefixes");
                }
                if (hashMap.containsKey(j9)) {
                    arrayList = (List) hashMap.get(j9);
                } else {
                    arrayList = new ArrayList();
                    hashMap.put(j9, arrayList);
                }
                arrayList.add(xj);
            }
        }
        if (((HashMap) c2593Hm.f25416u).get(AbstractC3194fG.class) == null) {
            return new WJ(new C3948tG(hashMap));
        }
        throw new ClassCastException();
    }

    @Override // com.google.android.gms.internal.ads.AG
    public final Class d() {
        return InterfaceC4108wE.class;
    }
}
