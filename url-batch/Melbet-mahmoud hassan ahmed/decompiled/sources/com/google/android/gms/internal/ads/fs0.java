package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class fs0 extends l7 {

    /* renamed from: c, reason: collision with root package name */
    static final fs0 f5189c = new fs0();

    fs0() {
    }

    @Override // com.google.android.gms.internal.ads.l7
    public final p7 b(String str, byte[] bArr, String str2) {
        return "moov".equals(str) ? new r7() : "mvhd".equals(str) ? new s7() : new t7(str);
    }
}
