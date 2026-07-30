package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.pK, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3737pK implements InterfaceC4108wE {

    /* renamed from: a, reason: collision with root package name */
    public static final C4237yi f33380a;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f33381b;

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f33382c;

    static {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        EnumC3413jK enumC3413jK = EnumC3413jK.f32102n;
        CJ cj = CJ.f24160b;
        hashMap.put(enumC3413jK, cj);
        hashMap2.put(cj, enumC3413jK);
        EnumC3413jK enumC3413jK2 = EnumC3413jK.f32103u;
        CJ cj2 = CJ.f24161c;
        hashMap.put(enumC3413jK2, cj2);
        hashMap2.put(cj2, enumC3413jK2);
        EnumC3413jK enumC3413jK3 = EnumC3413jK.f32104v;
        CJ cj3 = CJ.f24162d;
        hashMap.put(enumC3413jK3, cj3);
        hashMap2.put(cj3, enumC3413jK3);
        f33380a = new C4237yi(Collections.unmodifiableMap(hashMap), Collections.unmodifiableMap(hashMap2));
        f33381b = new byte[0];
        f33382c = new byte[]{0};
    }
}
