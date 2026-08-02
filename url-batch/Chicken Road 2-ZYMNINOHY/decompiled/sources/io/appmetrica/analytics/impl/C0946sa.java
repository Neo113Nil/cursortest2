package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.sa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0946sa extends C2 {
    public C0946sa(int i4) {
        super(i4);
    }

    @Override // io.appmetrica.analytics.impl.C2, io.appmetrica.analytics.impl.InterfaceC0972ta
    public final Mn a(String str) {
        int i4 = 0;
        if (str != null) {
            int length = str.length();
            int i5 = this.f10150a;
            if (length > i5) {
                String substring = str.substring(0, i5);
                i4 = str.getBytes().length - substring.getBytes().length;
                str = substring;
            }
        }
        return new Mn(str, new C0474a3(i4));
    }
}
