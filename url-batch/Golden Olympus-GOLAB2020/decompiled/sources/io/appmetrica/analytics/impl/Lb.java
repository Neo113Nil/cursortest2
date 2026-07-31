package io.appmetrica.analytics.impl;

/* loaded from: classes3.dex */
public final class Lb implements InterfaceC2895po {
    @Override // io.appmetrica.analytics.impl.InterfaceC2895po
    public final C2843no a(String str) {
        return str == null ? new C2843no(this, false, "key is null") : str.startsWith("appmetrica") ? new C2843no(this, false, "key starts with appmetrica") : str.length() > 200 ? new C2843no(this, false, "key length more then 200 characters") : new C2843no(this, true, "");
    }
}
