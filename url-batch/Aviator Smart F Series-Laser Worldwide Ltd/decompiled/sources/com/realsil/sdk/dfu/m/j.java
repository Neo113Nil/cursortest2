package com.realsil.sdk.dfu.m;

import com.realsil.sdk.core.logger.ZLogger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* loaded from: classes4.dex */
public class j extends com.realsil.sdk.dfu.k.e {

    /* renamed from: a, reason: collision with root package name */
    public int f16061a;

    /* renamed from: b, reason: collision with root package name */
    public int f16062b;

    /* renamed from: c, reason: collision with root package name */
    public int f16063c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f16064d;

    public j(int i8, int i9, byte[] bArr) {
        this.f16063c = 0;
        this.f16061a = i8;
        this.f16062b = i9;
        this.f16064d = bArr;
        this.f16063c = bArr != null ? bArr.length : 0;
    }

    public static j a(byte[] bArr) {
        if (bArr == null || bArr.length < 2) {
            ZLogger.d("invalid data");
            return null;
        }
        ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
        byte b8 = bArr[0];
        byte b9 = bArr[1];
        int length = bArr.length;
        byte[] bArr2 = new byte[0];
        if (length - 2 > 0) {
            bArr2 = Arrays.copyOfRange(bArr, 2, length);
        }
        return new j(b8, b9, bArr2);
    }

    public boolean b() {
        return this.f16061a == 16;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("GattDfuRsp {");
        stringBuffer.append(String.format("\n\tresponseType=%02X , requestOpCode=%02X", Integer.valueOf(this.f16061a), Integer.valueOf(this.f16062b)));
        stringBuffer.append("\n}");
        return stringBuffer.toString();
    }

    public byte[] a() {
        return this.f16064d;
    }
}
