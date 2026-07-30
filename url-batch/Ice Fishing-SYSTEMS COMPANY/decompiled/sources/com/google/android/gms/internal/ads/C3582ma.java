package com.google.android.gms.internal.ads;

import l2.InterfaceC4689d;

/* renamed from: com.google.android.gms.internal.ads.ma, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3582ma implements InterfaceC3701ol {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f32699n;

    /* renamed from: u, reason: collision with root package name */
    public final String f32700u;

    /* renamed from: v, reason: collision with root package name */
    public final String f32701v;

    public /* synthetic */ C3582ma(String str, String str2, int i) {
        this.f32699n = i;
        this.f32700u = str;
        this.f32701v = str2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3701ol, com.google.android.gms.internal.ads.InterfaceC3865ro
    /* renamed from: b */
    public /* synthetic */ void mo2b(Object obj) {
        switch (this.f32699n) {
            case 1:
                ((InterfaceC4689d) obj).l(this.f32700u, this.f32701v);
                break;
            default:
                ((InterfaceC3970tl) obj).i(this.f32700u, this.f32701v);
                break;
        }
    }
}
