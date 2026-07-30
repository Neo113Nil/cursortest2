package com.realsil.sdk.dfu.x;

import com.realsil.sdk.core.utility.DataConverter;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class d extends com.realsil.sdk.dfu.k.d {

    /* renamed from: a, reason: collision with root package name */
    public int f16431a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f16432b;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f16433a;

        /* renamed from: b, reason: collision with root package name */
        public byte[] f16434b;

        public b a(int i8, byte[] bArr) {
            this.f16433a = i8;
            this.f16434b = bArr;
            return this;
        }

        public d a() {
            return new d(this.f16433a, this.f16434b);
        }
    }

    public d(int i8, byte[] bArr) {
        this.f16431a = i8;
        this.f16432b = bArr;
    }

    @Override // com.realsil.sdk.dfu.k.d
    public byte[] a() {
        byte[] bArr = this.f16432b;
        int length = bArr.length;
        byte[] bArr2 = new byte[length + 2];
        int i8 = this.f16431a;
        bArr2[0] = (byte) (i8 & 255);
        bArr2[1] = (byte) (i8 >> 8);
        if (length > 0) {
            System.arraycopy(bArr, 0, bArr2, 2, length);
        }
        return bArr2;
    }

    @Override // com.realsil.sdk.dfu.k.d
    public int b() {
        return 1555;
    }

    public String toString() {
        return String.format("CheckPubKeyHashReq(0x%04X) {", Integer.valueOf(b())) + String.format(Locale.US, "\n\tnumber=%d, keys=%s", Integer.valueOf(this.f16431a), DataConverter.bytes2Hex(this.f16432b)) + "\n}";
    }
}
