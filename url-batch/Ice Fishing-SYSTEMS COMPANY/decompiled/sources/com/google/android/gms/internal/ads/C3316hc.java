package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import q2.InterfaceC4877a;
import s2.InterfaceC4993a;

/* renamed from: com.google.android.gms.internal.ads.hc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3316hc implements InterfaceC4993a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f31237a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f31238b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC4877a f31239c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ HashMap f31240d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Map f31241e;

    public C3316hc(C3370ic c3370ic, boolean z8, InterfaceC4877a interfaceC4877a, HashMap hashMap, Map map) {
        this.f31238b = z8;
        this.f31239c = interfaceC4877a;
        this.f31240d = hashMap;
        this.f31241e = map;
        Objects.requireNonNull(c3370ic);
        this.f31237a = false;
    }

    @Override // s2.InterfaceC4993a
    public final void i0(boolean z8) {
        if (this.f31237a) {
            return;
        }
        InterfaceC4877a interfaceC4877a = this.f31239c;
        if (z8 && this.f31238b) {
            ((InterfaceC2524Dl) interfaceC4877a).C();
        }
        this.f31237a = true;
        String str = (String) this.f31241e.get("event_id");
        Boolean valueOf = Boolean.valueOf(z8);
        HashMap hashMap = this.f31240d;
        hashMap.put(str, valueOf);
        ((InterfaceC2566Gc) interfaceC4877a).a("openIntentAsync", hashMap);
    }

    @Override // s2.InterfaceC4993a
    public final void t(int i) {
    }
}
