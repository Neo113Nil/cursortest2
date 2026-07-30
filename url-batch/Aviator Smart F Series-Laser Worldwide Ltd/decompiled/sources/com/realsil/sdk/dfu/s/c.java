package com.realsil.sdk.dfu.s;

import java.util.Locale;

/* loaded from: classes4.dex */
public final class c extends com.realsil.sdk.dfu.k.d {

    /* renamed from: a, reason: collision with root package name */
    public com.realsil.sdk.dfu.t.c f16290a;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public com.realsil.sdk.dfu.t.c f16291a;

        public b a(com.realsil.sdk.dfu.t.c cVar) {
            this.f16291a = cVar;
            return this;
        }

        public c a() {
            return new c(this.f16291a);
        }
    }

    public c(com.realsil.sdk.dfu.t.c cVar) {
        this.f16290a = cVar;
    }

    @Override // com.realsil.sdk.dfu.k.d
    public byte[] a() {
        byte[] a8 = this.f16290a.a();
        byte[] bArr = new byte[a8.length + 1];
        bArr[0] = (byte) (b() & 255);
        System.arraycopy(a8, 0, bArr, 1, a8.length);
        return bArr;
    }

    @Override // com.realsil.sdk.dfu.k.d
    public int b() {
        return 15;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("CheckSha256Req(0x%02X) {", Integer.valueOf(b())));
        com.realsil.sdk.dfu.t.c cVar = this.f16290a;
        if (cVar != null) {
            sb.append(String.format(Locale.US, "\n\tsha256=%s", cVar.toString()));
        }
        sb.append("\n}");
        return sb.toString();
    }
}
