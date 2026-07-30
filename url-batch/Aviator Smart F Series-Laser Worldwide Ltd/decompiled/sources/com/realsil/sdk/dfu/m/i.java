package com.realsil.sdk.dfu.m;

import com.realsil.sdk.core.utility.DataConverter;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Locale;

/* loaded from: classes4.dex */
public class i extends com.realsil.sdk.dfu.k.e {

    /* renamed from: a, reason: collision with root package name */
    public byte f16059a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f16060b;

    public i(byte b8, byte[] bArr) {
        this.f16059a = b8;
        this.f16060b = bArr;
    }

    public byte a() {
        return this.f16059a;
    }

    public String toString() {
        return "GattDfuNormalRsp {" + String.format(Locale.US, "\n\tstatus=0x%02X, params=%s", Byte.valueOf(this.f16059a), DataConverter.bytes2Hex(this.f16060b)) + "\n}";
    }

    public static i a(j jVar) {
        byte[] bArr = null;
        if (jVar == null) {
            return null;
        }
        ByteBuffer.wrap(jVar.f16064d).order(ByteOrder.LITTLE_ENDIAN);
        byte[] bArr2 = jVar.f16064d;
        byte b8 = bArr2[0];
        int length = bArr2.length - 1;
        if (length > 0) {
            bArr = new byte[length];
            System.arraycopy(bArr2, 1, bArr, 0, length);
        }
        return new i(b8, bArr);
    }
}
