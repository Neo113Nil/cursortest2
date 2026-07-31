package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
final class d80 implements z2.w {

    /* renamed from: a, reason: collision with root package name */
    boolean f4108a = false;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f4109b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ yu f4110c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Map f4111d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Map f4112e;

    d80(f80 f80Var, boolean z6, yu yuVar, Map map, Map map2) {
        this.f4109b = z6;
        this.f4110c = yuVar;
        this.f4111d = map;
        this.f4112e = map2;
    }

    @Override // z2.w
    public final void F(int i7) {
    }

    @Override // z2.w
    public final void c(boolean z6) {
        if (this.f4108a) {
            return;
        }
        if (z6 && this.f4109b) {
            ((pi1) this.f4110c).r();
        }
        this.f4108a = true;
        this.f4111d.put((String) this.f4112e.get("event_id"), Boolean.valueOf(z6));
        ((da0) this.f4110c).t("openIntentAsync", this.f4111d);
    }
}
