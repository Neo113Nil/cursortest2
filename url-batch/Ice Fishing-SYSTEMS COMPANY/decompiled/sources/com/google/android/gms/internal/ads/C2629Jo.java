package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Jo, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2629Jo implements InterfaceC4063vN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25809a;

    /* renamed from: b, reason: collision with root package name */
    public final C4009uN f25810b;

    /* renamed from: c, reason: collision with root package name */
    public final C3700ok f25811c;

    /* renamed from: d, reason: collision with root package name */
    public final C4009uN f25812d;

    public /* synthetic */ C2629Jo(C4009uN c4009uN, C3700ok c3700ok, C4009uN c4009uN2, int i) {
        this.f25809a = i;
        this.f25810b = c4009uN;
        this.f25811c = c3700ok;
        this.f25812d = c4009uN2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4279zN
    public final /* bridge */ /* synthetic */ Object d() {
        switch (this.f25809a) {
            case 0:
                return new C2612Io((C2748Qo) this.f25810b.d(), this.f25811c.a(), (String) this.f25812d.d());
            default:
                return new Sr((S2.a) this.f25810b.d(), this.f25811c.a(), ((Long) this.f25812d.d()).longValue());
        }
    }
}
