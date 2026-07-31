package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ta, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0525ta extends D2 {
    public C0525ta(int i) {
        super(i);
    }

    @Override // io.appmetrica.analytics.impl.D2, io.appmetrica.analytics.impl.InterfaceC0550ua
    public final Nn a(String str) {
        int i = 0;
        if (str != null) {
            int length = str.length();
            int i2 = this.f805a;
            if (length > i2) {
                String substring = str.substring(0, i2);
                i = str.getBytes().length - substring.getBytes().length;
                str = substring;
            }
        }
        return new Nn(str, new C0061b3(i));
    }
}
