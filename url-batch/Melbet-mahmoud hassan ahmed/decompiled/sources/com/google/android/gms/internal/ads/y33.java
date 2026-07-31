package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class y33 extends x33 {

    /* renamed from: a, reason: collision with root package name */
    private final char f14533a;

    y33(char c7) {
        this.f14533a = c7;
    }

    @Override // com.google.android.gms.internal.ads.b43
    public final boolean a(char c7) {
        return c7 == this.f14533a;
    }

    public final String toString() {
        int i7 = this.f14533a;
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i8 = 0; i8 < 4; i8++) {
            cArr[5 - i8] = "0123456789ABCDEF".charAt(i7 & 15);
            i7 >>= 4;
        }
        String copyValueOf = String.copyValueOf(cArr);
        StringBuilder sb = new StringBuilder(String.valueOf(copyValueOf).length() + 18);
        sb.append("CharMatcher.is('");
        sb.append(copyValueOf);
        sb.append("')");
        return sb.toString();
    }
}
