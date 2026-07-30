package com.realsil.sdk.dfu.s;

import com.realsil.sdk.core.utility.DataConverter;
import java.util.Locale;

/* loaded from: classes4.dex */
public class b extends com.realsil.sdk.dfu.k.d {

    /* renamed from: a, reason: collision with root package name */
    public int f16286a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f16287b;

    /* renamed from: com.realsil.sdk.dfu.s.b$b, reason: collision with other inner class name */
    public static class C0329b {

        /* renamed from: a, reason: collision with root package name */
        public int f16288a;

        /* renamed from: b, reason: collision with root package name */
        public byte[] f16289b;

        public C0329b a(int i8, byte[] bArr) {
            this.f16288a = i8;
            this.f16289b = bArr;
            return this;
        }

        public b a() {
            return new b(this.f16288a, this.f16289b);
        }
    }

    public b(int i8, byte[] bArr) {
        this.f16286a = i8;
        this.f16287b = bArr;
    }

    @Override // com.realsil.sdk.dfu.k.d
    public byte[] a() {
        int length = this.f16287b.length;
        byte[] bArr = new byte[length + 2];
        bArr[0] = (byte) (b() & 255);
        bArr[1] = (byte) (this.f16286a & 255);
        if (length > 0) {
            System.arraycopy(this.f16287b, 0, bArr, 2, length);
        }
        return bArr;
    }

    @Override // com.realsil.sdk.dfu.k.d
    public int b() {
        return 18;
    }

    public String toString() {
        return String.format("CheckPubKeyHashReq(0x%04X) {", Integer.valueOf(b())) + String.format(Locale.US, "\n\tnumber=%d, keys=%s", Integer.valueOf(this.f16286a), DataConverter.bytes2Hex(this.f16287b)) + "\n}";
    }
}
