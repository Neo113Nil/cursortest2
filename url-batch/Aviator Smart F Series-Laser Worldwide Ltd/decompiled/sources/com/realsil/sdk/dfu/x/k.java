package com.realsil.sdk.dfu.x;

import java.util.Locale;

/* loaded from: classes4.dex */
public final class k extends com.realsil.sdk.dfu.k.d {

    /* renamed from: a, reason: collision with root package name */
    public int f16441a;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f16442a;

        public b(int i8) {
            this.f16442a = i8;
        }

        public k a() {
            return new k(this.f16442a);
        }
    }

    public k(int i8) {
        this.f16441a = i8;
    }

    @Override // com.realsil.sdk.dfu.k.d
    public byte[] a() {
        int i8 = this.f16441a;
        return new byte[]{(byte) (i8 & 255), (byte) ((i8 >> 8) & 255)};
    }

    @Override // com.realsil.sdk.dfu.k.d
    public int b() {
        return 1545;
    }

    public String toString() {
        return String.format("GeTargetImageInfoReq(0x%04X) {", Integer.valueOf(b())) + String.format(Locale.US, "\n\timageId=0x%02X", Integer.valueOf(this.f16441a)) + "\n}";
    }
}
