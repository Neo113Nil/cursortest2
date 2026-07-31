package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.fg, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2627fg implements InterfaceC2895po {
    @Override // io.appmetrica.analytics.impl.InterfaceC2895po
    public final C2843no a(Object obj) {
        Integer num = (Integer) obj;
        if (num == null || num.intValue() > 0) {
            return new C2843no(this, true, "");
        }
        return new C2843no(this, false, "Invalid quantity value " + num);
    }
}
