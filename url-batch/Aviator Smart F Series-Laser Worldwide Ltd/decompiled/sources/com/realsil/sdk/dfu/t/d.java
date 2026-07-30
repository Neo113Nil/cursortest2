package com.realsil.sdk.dfu.t;

import com.realsil.sdk.dfu.m.j;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Locale;
import y5.u;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public byte f16318a;

    /* renamed from: b, reason: collision with root package name */
    public int f16319b;

    /* renamed from: c, reason: collision with root package name */
    public int f16320c;

    /* renamed from: d, reason: collision with root package name */
    public int f16321d;

    public d(byte b8, int i8, int i9, int i10) {
        this.f16318a = b8;
        this.f16319b = i8;
        this.f16320c = i9;
        this.f16321d = i10;
    }

    public int a() {
        return this.f16321d;
    }

    public byte b() {
        return this.f16318a;
    }

    public int c() {
        return this.f16320c;
    }

    public String toString() {
        return "TargetImageInfoRsp {" + String.format(Locale.US, "\n\tstatus=0x%02X,imageVersion=0x%08X, updateOffset=0x%08X(%d),bufferCheckOffset=0x%08X(%d)", Byte.valueOf(this.f16318a), Integer.valueOf(this.f16319b), Integer.valueOf(this.f16320c), Integer.valueOf(this.f16320c), Integer.valueOf(this.f16321d), Integer.valueOf(this.f16321d)) + "\n}";
    }

    public static d a(j jVar) {
        int i8;
        int i9;
        int i10;
        int i11 = 0;
        if (jVar == null || (i8 = jVar.f16063c) == 0) {
            return new d((byte) 2, 0, 0, 0);
        }
        ByteBuffer wrap = ByteBuffer.wrap(jVar.f16064d);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        byte b8 = wrap.get();
        if (i8 == 7) {
            int i12 = wrap.getShort(1) & u.MAX_VALUE;
            i9 = wrap.getInt(3);
            i11 = i12;
        } else {
            if (i8 == 11) {
                i11 = wrap.getInt(1);
                int i13 = wrap.getInt(5);
                i10 = wrap.getShort(9) & u.MAX_VALUE;
                i9 = i13;
                return new d(b8, i11, i9, i10);
            }
            i9 = 0;
        }
        i10 = 0;
        return new d(b8, i11, i9, i10);
    }
}
