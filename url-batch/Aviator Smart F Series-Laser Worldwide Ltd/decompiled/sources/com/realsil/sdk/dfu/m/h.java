package com.realsil.sdk.dfu.m;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public int f16055a;

    /* renamed from: b, reason: collision with root package name */
    public int f16056b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f16057c;

    /* renamed from: d, reason: collision with root package name */
    public int f16058d;

    public h(int i8, int i9, boolean z7, int i10) {
        this.f16055a = i8;
        this.f16056b = i9;
        this.f16057c = z7;
        this.f16058d = i10;
    }

    public static h a(int i8, int i9, j jVar) {
        short s7;
        short s8;
        boolean z7;
        if (jVar == null) {
            return null;
        }
        ByteBuffer wrap = ByteBuffer.wrap(jVar.f16064d);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        byte b8 = 0;
        if (i8 == 16) {
            byte b9 = wrap.get();
            s7 = wrap.getShort();
            if (i9 >= 4 || jVar.f16063c < 5) {
                z7 = false;
                b8 = b9;
                s8 = 0;
            } else {
                z7 = true;
                b8 = b9;
                s8 = wrap.getShort();
            }
        } else if (i8 == 20 || i8 == 21) {
            b8 = wrap.get();
            s7 = wrap.getShort();
            s8 = 0;
            z7 = false;
        } else {
            s8 = 0;
            z7 = false;
            s7 = 0;
        }
        return new h(b8, s7, z7, s8);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("EnableBufferCheckEvent {", new Object[0]));
        Locale locale = Locale.US;
        sb.append(String.format(locale, "\n\tmode=0x%02X, maxBufferCheckSize=0x%08X(%d), bufferCheckMutSizeSupported=%b)", Integer.valueOf(this.f16055a), Integer.valueOf(this.f16056b), Integer.valueOf(this.f16056b), Boolean.valueOf(this.f16057c)));
        if (this.f16057c) {
            sb.append(String.format(locale, "\n\tbufferCheckMutSize=0x%08X(%d)", Integer.valueOf(this.f16058d), Integer.valueOf(this.f16058d)));
        }
        sb.append("\n}");
        return sb.toString();
    }

    public boolean a() {
        return this.f16055a == 1;
    }
}
