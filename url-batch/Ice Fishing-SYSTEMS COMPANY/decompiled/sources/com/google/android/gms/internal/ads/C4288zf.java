package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import java.util.concurrent.ExecutorService;
import t0.AbstractC5051n;

/* renamed from: com.google.android.gms.internal.ads.zf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4288zf implements InterfaceC4063vN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35579a;

    /* renamed from: b, reason: collision with root package name */
    public final C4117wN f35580b;

    /* renamed from: c, reason: collision with root package name */
    public final C4117wN f35581c;

    public /* synthetic */ C4288zf(C4117wN c4117wN, C4117wN c4117wN2, int i) {
        this.f35579a = i;
        this.f35580b = c4117wN;
        this.f35581c = c4117wN2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4279zN
    public final Object d() {
        switch (this.f35579a) {
            case 0:
                return new SharedPreferencesOnSharedPreferenceChangeListenerC4234yf((Context) this.f35580b.f34977a, (t2.E) this.f35581c.f34977a);
            case 1:
                ExecutorService executorService = (ExecutorService) this.f35580b.f34977a;
                C3066cy c3066cy = (C3066cy) this.f35581c.f34977a;
                String str = Build.VERSION.RELEASE;
                String str2 = Build.MODEL;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 30 + String.valueOf(str2).length() + 1);
                AbstractC5051n.j(sb, "Mozilla/5.0 (Linux; Android ", str, "; ", str2);
                sb.append(")");
                return new C3875ry(executorService, sb.toString(), c3066cy.a0());
            case 2:
                return new C3781qA((Context) this.f35580b.f34977a, (ExecutorService) this.f35581c.f34977a);
            default:
                return new C3996uA((Context) this.f35580b.f34977a, (ExecutorService) this.f35581c.f34977a);
        }
    }
}
