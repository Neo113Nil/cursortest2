package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.Ie, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2602Ie implements InterfaceC3404jB, InterfaceC3701ol {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f25578n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Context f25579u;

    public /* synthetic */ C2602Ie(Context context, int i) {
        this.f25578n = i;
        this.f25579u = context;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3404jB
    public Object a() {
        Context context = this.f25579u;
        switch (this.f25578n) {
            case 0:
                return AbstractC2655Lg.b(context);
            default:
                int i = SN.f27536z;
                new L0();
                new C3826r2(5);
                context.getApplicationContext();
                C3796qP c3796qP = new C3796qP(8);
                HashMap hashMap = new HashMap();
                HashMap hashMap2 = new HashMap();
                hashMap.clear();
                hashMap2.clear();
                return c3796qP;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3701ol, com.google.android.gms.internal.ads.InterfaceC3865ro
    /* renamed from: b */
    public /* synthetic */ void mo2b(Object obj) {
        ((InterfaceC2523Dk) obj).q(this.f25579u);
    }
}
