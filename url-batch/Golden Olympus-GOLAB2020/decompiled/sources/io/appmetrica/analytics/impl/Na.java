package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public final class Na extends O2 {
    public Na(int i4) {
        super(i4);
    }

    @Override // io.appmetrica.analytics.impl.O2, io.appmetrica.analytics.impl.Oa
    @NonNull
    public final Jn a(String str) {
        int i4 = 0;
        if (str != null) {
            int length = str.length();
            int i5 = this.f38045a;
            if (length > i5) {
                String substring = str.substring(0, i5);
                i4 = str.getBytes().length - substring.getBytes().length;
                str = substring;
            }
        }
        return new Jn(str, new C3055w3(i4));
    }
}
