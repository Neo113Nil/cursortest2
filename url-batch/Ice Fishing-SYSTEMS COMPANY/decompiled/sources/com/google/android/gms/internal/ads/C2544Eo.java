package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.Eo, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2544Eo implements InterfaceC3970tl {

    /* renamed from: n, reason: collision with root package name */
    public final Bundle f24822n = new Bundle();

    @Override // com.google.android.gms.internal.ads.InterfaceC3970tl
    public final void E(String str) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3970tl
    public final synchronized void b(String str) {
        this.f24822n.putInt(str, 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3970tl
    public final void c() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3970tl
    public final synchronized void d(String str) {
        this.f24822n.putInt(str, 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3970tl
    public final void f() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3970tl
    public final synchronized void i(String str, String str2) {
        this.f24822n.putInt(str, 3);
    }
}
