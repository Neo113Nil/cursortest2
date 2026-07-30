package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class Pr implements Qs {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27067a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f27068b;

    public /* synthetic */ Pr(int i, boolean z8) {
        this.f27067a = i;
        this.f27068b = z8;
    }

    @Override // com.google.android.gms.internal.ads.Qs
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        switch (this.f27067a) {
            case 0:
                ((Bundle) obj).putString("adid_p", true != this.f27068b ? "0" : "1");
                break;
            case 1:
                ((Bundle) obj).putBoolean("ibrr", this.f27068b);
                break;
            case 2:
                ((Bundle) obj).putBoolean("is_gbid", this.f27068b);
                break;
            default:
                Bundle bundle = (Bundle) obj;
                if (this.f27068b) {
                    bundle.putBoolean("sdk_prefetch", true);
                    break;
                }
                break;
        }
    }
}
