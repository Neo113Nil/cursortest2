package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class Hs implements Qs {

    /* renamed from: a, reason: collision with root package name */
    public final C3288h1 f25430a;

    /* renamed from: b, reason: collision with root package name */
    public final C3288h1 f25431b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f25432c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f25433d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f25434e = false;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f25435f;

    public Hs(C3288h1 c3288h1, C3288h1 c3288h12, boolean z8, boolean z9, boolean z10) {
        this.f25430a = c3288h1;
        this.f25431b = c3288h12;
        this.f25432c = z8;
        this.f25433d = z9;
        this.f25435f = z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0046, code lost:
    
        if (r7 <= 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0048, code lost:
    
        r1.putString("paidv1_id_android", r6);
        r1.putLong("paidv1_creation_time_android", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0064, code lost:
    
        if (((java.lang.Boolean) q2.r.f40116e.f40119c.a(com.google.android.gms.internal.ads.AbstractC3368ia.f31573V3)).booleanValue() == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x007a, code lost:
    
        r4 = r9.f25431b;
        r5 = (java.lang.String) r4.f31134v;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0080, code lost:
    
        if (r5 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0082, code lost:
    
        r6 = r4.f31133u;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0086, code lost:
    
        if (r6 <= 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0088, code lost:
    
        r1.putString("paidv2_id_android", r5);
        r1.putLong("paidv2_creation_time_android", r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0092, code lost:
    
        r1.putBoolean("paidv2_pub_option_android", r9.f25432c);
        r1.putBoolean("paidv2_user_option_android", r9.f25433d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0078, code lost:
    
        if (((java.lang.Boolean) q2.r.f40116e.f40119c.a(com.google.android.gms.internal.ads.AbstractC3368ia.f31591X3)).booleanValue() != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0038, code lost:
    
        if (((java.lang.Boolean) q2.r.f40116e.f40119c.a(com.google.android.gms.internal.ads.AbstractC3368ia.f31582W3)).booleanValue() != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0024, code lost:
    
        if (((java.lang.Boolean) q2.r.f40116e.f40119c.a(com.google.android.gms.internal.ads.AbstractC3368ia.f31565U3)).booleanValue() == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003a, code lost:
    
        r5 = r9.f25430a;
        r6 = (java.lang.String) r5.f31134v;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0040, code lost:
    
        if (r6 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0042, code lost:
    
        r7 = r5.f31133u;
     */
    @Override // com.google.android.gms.internal.ads.Qs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (this.f25434e) {
            return;
        }
        Bundle b9 = AbstractC2720Pd.b("pii", bundle);
        boolean z8 = this.f25435f;
        if (!z8) {
        }
        if (z8) {
        }
        if (!z8) {
        }
        if (z8) {
        }
        if (b9.isEmpty()) {
            return;
        }
        bundle.putBundle("pii", b9);
    }

    public Hs(boolean z8) {
        this.f25435f = z8;
    }
}
