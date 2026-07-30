package com.google.android.gms.internal.ads;

import android.net.NetworkCapabilities;
import java.lang.reflect.Method;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.pz, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3769pz extends AbstractC3984tz {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f33551f = 0;

    /* renamed from: g, reason: collision with root package name */
    public final Object f33552g;

    public C3769pz(C3830r6 c3830r6, C3391iz c3391iz, C3066cy c3066cy, C4158xA c4158xA) {
        super("4x2Hh5iTg/qW5xffP7XUVyyhNVEHgfMgXZN24VVA9KHUAzifkbImBn58u0wzbVSZ", "gKocIG5D8c3aRlaOl/4axnWoyxTZtkz2guMC88wPwLk=", c3830r6, c3391iz, c4158xA.a(116));
        this.f33552g = c3066cy;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3984tz
    public final void a(Method method, C3830r6 c3830r6) {
        switch (this.f33551f) {
            case 0:
                Object[] objArr = (Object[]) method.invoke("", ((C3066cy) this.f33552g).R());
                objArr.getClass();
                synchronized (c3830r6) {
                    String str = (String) objArr[0];
                    c3830r6.h();
                    ((D6) c3830r6.f30000u).F0(str);
                    String str2 = (String) objArr[1];
                    c3830r6.h();
                    ((D6) c3830r6.f30000u).l0(str2);
                }
                return;
            default:
                Map map = (Map) this.f33552g;
                Object[] objArr2 = (Object[]) method.invoke("", (NetworkCapabilities) map.get("ntc"), (Long) map.get("vs"), (Long) map.get("vf"));
                objArr2.getClass();
                synchronized (c3830r6) {
                    long longValue = ((Long) objArr2[0]).longValue();
                    c3830r6.h();
                    ((D6) c3830r6.f30000u).J0(longValue);
                    long longValue2 = ((Long) objArr2[1]).longValue();
                    if (longValue2 >= 0) {
                        c3830r6.h();
                        ((D6) c3830r6.f30000u).h0(longValue2);
                    }
                    long longValue3 = ((Long) objArr2[2]).longValue();
                    if (longValue3 >= 0) {
                        c3830r6.h();
                        ((D6) c3830r6.f30000u).i0(longValue3);
                    }
                }
                return;
        }
    }

    public C3769pz(C3830r6 c3830r6, C3391iz c3391iz, Map map, C4158xA c4158xA) {
        super("YG+UUJxJEVSGG6jfg3qjLnMxlQFUVyMMjgzEbZMK/+kyZ0C5+m/L80+lYQbH4OQO", "6dR3aiNoBR9E5efHnflEq0hfvoZwKGjGgWyKk1r6EjY=", c3830r6, c3391iz, c4158xA.a(118));
        this.f33552g = map;
    }
}
