package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.za, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1155za extends K2 {
    public C1155za(int i2) {
        super(i2);
    }

    @Override // io.appmetrica.analytics.impl.K2, io.appmetrica.analytics.impl.Aa
    public final On a(String str) {
        int i2 = 0;
        if (str != null) {
            int length = str.length();
            int i3 = this.f7028a;
            if (length > i3) {
                String substring = str.substring(0, i3);
                i2 = str.getBytes().length - substring.getBytes().length;
                str = substring;
            }
        }
        return new On(str, new C0710i3(i2));
    }
}
