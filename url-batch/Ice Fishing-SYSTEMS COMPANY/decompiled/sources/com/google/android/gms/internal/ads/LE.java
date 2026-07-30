package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes2.dex */
public final class LE implements LD, InterfaceC3701ol, Gu {

    /* renamed from: A, reason: collision with root package name */
    public static final LE f26117A;

    /* renamed from: B, reason: collision with root package name */
    public static final LE f26118B;

    /* renamed from: C, reason: collision with root package name */
    public static final LE f26119C;

    /* renamed from: D, reason: collision with root package name */
    public static final LE f26120D;

    /* renamed from: E, reason: collision with root package name */
    public static final LE f26121E;

    /* renamed from: F, reason: collision with root package name */
    public static final LE f26122F;

    /* renamed from: G, reason: collision with root package name */
    public static final LE f26123G;

    /* renamed from: v, reason: collision with root package name */
    public static final LE f26124v;

    /* renamed from: w, reason: collision with root package name */
    public static final LE f26125w;

    /* renamed from: x, reason: collision with root package name */
    public static final LE f26126x;

    /* renamed from: y, reason: collision with root package name */
    public static final LE f26127y;

    /* renamed from: z, reason: collision with root package name */
    public static final LE f26128z;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f26129n;

    /* renamed from: u, reason: collision with root package name */
    public final String f26130u;

    static {
        int i = 0;
        f26124v = new LE("TINK", i);
        f26125w = new LE("CRUNCHY", i);
        f26126x = new LE("NO_PREFIX", i);
        int i4 = 1;
        f26127y = new LE("TINK", i4);
        f26128z = new LE("NO_PREFIX", i4);
        int i9 = 2;
        f26117A = new LE("TINK", i9);
        f26118B = new LE("CRUNCHY", i9);
        f26119C = new LE("NO_PREFIX", i9);
        int i10 = 3;
        f26120D = new LE("TINK", i10);
        f26121E = new LE("CRUNCHY", i10);
        f26122F = new LE("LEGACY", i10);
        f26123G = new LE("NO_PREFIX", i10);
    }

    public /* synthetic */ LE(String str, int i) {
        this.f26129n = i;
        this.f26130u = str;
    }

    @Override // com.google.android.gms.internal.ads.Gu
    public Object b(Object obj) {
        ((SQLiteDatabase) obj).delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{this.f26130u, Integer.toString(0)});
        return null;
    }

    @Override // com.google.android.gms.internal.ads.LD
    public void q(Throwable th) {
        p2.j.f39798C.f39808h.d(this.f26130u, th);
    }

    public String toString() {
        switch (this.f26129n) {
            case 0:
                return this.f26130u;
            case 1:
                return this.f26130u;
            case 2:
                return this.f26130u;
            case 3:
                return this.f26130u;
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3701ol, com.google.android.gms.internal.ads.InterfaceC3865ro
    /* renamed from: b */
    public /* synthetic */ void mo2b(Object obj) {
        switch (this.f26129n) {
            case 5:
                ((InterfaceC3970tl) obj).b(this.f26130u);
                break;
            default:
                ((InterfaceC2592Hl) obj).C(this.f26130u);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.LD
    /* renamed from: l */
    public void mo7l(Object obj) {
    }
}
