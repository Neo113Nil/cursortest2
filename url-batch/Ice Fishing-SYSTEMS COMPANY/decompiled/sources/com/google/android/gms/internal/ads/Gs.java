package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class Gs implements Qs {

    /* renamed from: a, reason: collision with root package name */
    public final String f25228a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f25229b;

    /* renamed from: c, reason: collision with root package name */
    public final String f25230c;

    /* renamed from: d, reason: collision with root package name */
    public final String f25231d;

    /* renamed from: e, reason: collision with root package name */
    public final String f25232e;

    /* renamed from: f, reason: collision with root package name */
    public final String f25233f;

    public Gs(String str, Integer num, String str2, String str3, String str4, String str5) {
        this.f25228a = str;
        this.f25229b = num;
        this.f25230c = str2;
        this.f25231d = str3;
        this.f25232e = str4;
        this.f25233f = str5;
    }

    @Override // com.google.android.gms.internal.ads.Qs
    public final void b(Object obj) {
        Bundle bundle = (Bundle) obj;
        AbstractC2720Pd.J("pn", bundle, this.f25228a);
        Integer num = this.f25229b;
        if (num != null) {
            bundle.putInt(com.anythink.expressad.foundation.g.a.f19223M, num.intValue());
        }
        AbstractC2720Pd.J("vnm", bundle, this.f25230c);
        AbstractC2720Pd.J("dl", bundle, this.f25231d);
        AbstractC2720Pd.J("ins_pn", bundle, this.f25232e);
        AbstractC2720Pd.J("ini_pn", bundle, this.f25233f);
    }
}
