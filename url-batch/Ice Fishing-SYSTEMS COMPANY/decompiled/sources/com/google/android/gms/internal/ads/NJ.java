package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes2.dex */
public abstract class NJ {

    /* renamed from: a, reason: collision with root package name */
    public static final C3733pG f26511a;

    /* renamed from: b, reason: collision with root package name */
    public static final C3625nG f26512b;

    /* renamed from: c, reason: collision with root package name */
    public static final XF f26513c;

    /* renamed from: d, reason: collision with root package name */
    public static final VF f26514d;

    /* renamed from: e, reason: collision with root package name */
    public static final XF f26515e;

    /* renamed from: f, reason: collision with root package name */
    public static final VF f26516f;

    /* renamed from: g, reason: collision with root package name */
    public static final C4237yi f26517g;

    static {
        C3791qK a9 = IG.a("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey");
        C3791qK a10 = IG.a("type.googleapis.com/google.crypto.tink.Ed25519PublicKey");
        f26511a = new C3733pG(C3574mJ.class, C4275zJ.J);
        f26512b = new C3625nG(a9, C4275zJ.f35504E);
        f26513c = new XF(C3736pJ.class, C4275zJ.f35505F);
        f26514d = new VF(a10, C4275zJ.f35506G);
        f26515e = new XF(C3628nJ.class, C4275zJ.f35507H);
        f26516f = new VF(a9, C4275zJ.f35508I);
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        EI ei = EI.RAW;
        C3520lJ c3520lJ = C3520lJ.f32563e;
        hashMap.put(ei, c3520lJ);
        hashMap2.put(c3520lJ, ei);
        EI ei2 = EI.TINK;
        C3520lJ c3520lJ2 = C3520lJ.f32560b;
        hashMap.put(ei2, c3520lJ2);
        hashMap2.put(c3520lJ2, ei2);
        EI ei3 = EI.CRUNCHY;
        C3520lJ c3520lJ3 = C3520lJ.f32561c;
        hashMap.put(ei3, c3520lJ3);
        hashMap2.put(c3520lJ3, ei3);
        EI ei4 = EI.LEGACY;
        C3520lJ c3520lJ4 = C3520lJ.f32562d;
        hashMap.put(ei4, c3520lJ4);
        hashMap2.put(c3520lJ4, ei4);
        f26517g = new C4237yi(Collections.unmodifiableMap(hashMap), Collections.unmodifiableMap(hashMap2));
    }

    public static C2978bI a(C3736pJ c3736pJ) {
        C2923aI D8 = C2978bI.D();
        byte[] b9 = c3736pJ.f33377c.b();
        QK s3 = SK.s(b9, 0, b9.length);
        D8.h();
        ((C2978bI) D8.f30000u).G(s3);
        return (C2978bI) D8.j();
    }
}
