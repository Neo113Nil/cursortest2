package com.realsil.sdk.dfu.x;

import java.util.Locale;

/* loaded from: classes4.dex */
public final class e extends com.realsil.sdk.dfu.k.d {

    /* renamed from: a, reason: collision with root package name */
    public com.realsil.sdk.dfu.t.c f16435a;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public com.realsil.sdk.dfu.t.c f16436a;

        public b a(com.realsil.sdk.dfu.t.c cVar) {
            this.f16436a = cVar;
            return this;
        }

        public e a() {
            return new e(this.f16436a);
        }
    }

    public e(com.realsil.sdk.dfu.t.c cVar) {
        this.f16435a = cVar;
    }

    @Override // com.realsil.sdk.dfu.k.d
    public byte[] a() {
        return a(false);
    }

    @Override // com.realsil.sdk.dfu.k.d
    public int b() {
        return 1552;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("CheckSha256Req(0x%04X) {", Integer.valueOf(b())));
        com.realsil.sdk.dfu.t.c cVar = this.f16435a;
        if (cVar != null) {
            sb.append(String.format(Locale.US, "\n\t%s", cVar.toString()));
        }
        sb.append("\n}");
        return sb.toString();
    }

    public byte[] a(boolean z7) {
        com.realsil.sdk.dfu.t.c cVar = this.f16435a;
        if (cVar != null) {
            return cVar.a();
        }
        return null;
    }
}
