package com.realsil.sdk.dfu.w;

import com.realsil.sdk.dfu.k.d;
import java.util.Locale;

/* loaded from: classes4.dex */
public class b extends d {

    /* renamed from: a, reason: collision with root package name */
    public int f16421a;

    /* renamed from: com.realsil.sdk.dfu.w.b$b, reason: collision with other inner class name */
    public static class C0336b {

        /* renamed from: a, reason: collision with root package name */
        public int f16422a;

        public C0336b(int i8) {
            this.f16422a = i8;
        }

        public b a() {
            return new b(this.f16422a);
        }
    }

    public b(int i8) {
        this.f16421a = i8;
    }

    @Override // com.realsil.sdk.dfu.k.d
    public byte[] a() {
        int i8 = this.f16421a;
        return new byte[]{(byte) (i8 & 255), (byte) ((i8 >> 8) & 255)};
    }

    @Override // com.realsil.sdk.dfu.k.d
    public int b() {
        return 1545;
    }

    public String toString() {
        return String.format("GeTargetImageInfoReq(0x%04X) {", Integer.valueOf(b())) + String.format(Locale.US, "\n\timageId=0x%02X", Integer.valueOf(this.f16421a)) + "\n}";
    }
}
