package com.realsil.sdk.dfu.t;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f16306a;

    /* renamed from: b, reason: collision with root package name */
    public List f16307b;

    /* renamed from: com.realsil.sdk.dfu.t.a$a, reason: collision with other inner class name */
    public static class C0330a {

        /* renamed from: a, reason: collision with root package name */
        public int f16308a;

        /* renamed from: b, reason: collision with root package name */
        public byte f16309b;

        public C0330a(int i8, byte b8) {
            this.f16308a = i8;
            this.f16309b = b8;
        }

        public String toString() {
            return String.format("imageId=0x%04X, status=0x%02X", Integer.valueOf(this.f16308a), Byte.valueOf(this.f16309b));
        }
    }

    public a(int i8, List list) {
        this.f16306a = i8;
        this.f16307b = list;
    }

    public C0330a a(int i8) {
        List list = this.f16307b;
        if (list == null || list.size() <= 0) {
            return new C0330a(i8, (byte) 0);
        }
        for (C0330a c0330a : this.f16307b) {
            if (c0330a.f16308a == i8) {
                return c0330a;
            }
        }
        return new C0330a(i8, (byte) 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CheckSha256Rsp {");
        sb.append(String.format(Locale.US, "\n\tnumber=%d", Integer.valueOf(this.f16306a)));
        List list = this.f16307b;
        if (list != null && list.size() > 0) {
            for (C0330a c0330a : this.f16307b) {
                sb.append("\n\t");
                sb.append(c0330a.toString());
            }
        }
        sb.append("\n}");
        return sb.toString();
    }

    public static a a(byte[] bArr) {
        ArrayList arrayList = new ArrayList();
        int i8 = 0;
        if (bArr == null || bArr.length < 3) {
            return new a(0, arrayList);
        }
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        int remaining = wrap.remaining() / 3;
        while (i8 < remaining) {
            int i9 = i8 + 1;
            arrayList.add(new C0330a((((short) (wrap.get(i9) & 255)) << 8) | ((short) (wrap.get(i8) & 255)), wrap.get(i8 + 2)));
            i8 = i9;
        }
        return new a(remaining, arrayList);
    }

    public boolean a() {
        List list = this.f16307b;
        if (list == null || list.size() <= 0) {
            return false;
        }
        Iterator it = this.f16307b.iterator();
        while (it.hasNext()) {
            byte b8 = ((C0330a) it.next()).f16309b;
            if (b8 != 1 && b8 != 3) {
                return false;
            }
        }
        return true;
    }
}
