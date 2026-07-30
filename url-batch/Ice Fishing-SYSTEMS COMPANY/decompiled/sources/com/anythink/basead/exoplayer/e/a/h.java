package com.anythink.basead.exoplayer.e.a;

import android.util.Log;
import com.anythink.basead.exoplayer.k.s;
import java.nio.ByteBuffer;
import java.util.UUID;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private static final String f7261a = "PsshAtomUtil";

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final UUID f7262a;

        /* renamed from: b, reason: collision with root package name */
        private final int f7263b;

        /* renamed from: c, reason: collision with root package name */
        private final byte[] f7264c;

        public a(UUID uuid, int i, byte[] bArr) {
            this.f7262a = uuid;
            this.f7263b = i;
            this.f7264c = bArr;
        }
    }

    private h() {
    }

    private static byte[] a(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        boolean z8 = uuidArr != null;
        int length = bArr != null ? bArr.length : 0;
        int i = length + 32;
        if (z8) {
            i += (uuidArr.length * 16) + 4;
        }
        ByteBuffer allocate = ByteBuffer.allocate(i);
        allocate.putInt(i);
        allocate.putInt(com.anythink.basead.exoplayer.e.a.a.f7075Z);
        allocate.putInt(z8 ? com.anythink.basead.exoplayer.b.bc : 0);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        if (z8) {
            allocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                allocate.putLong(uuid2.getMostSignificantBits());
                allocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (length != 0) {
            allocate.putInt(bArr.length);
            allocate.put(bArr);
        }
        return allocate.array();
    }

    public static int b(byte[] bArr) {
        a c4 = c(bArr);
        if (c4 == null) {
            return -1;
        }
        return c4.f7263b;
    }

    private static a c(byte[] bArr) {
        s sVar = new s(bArr);
        if (sVar.b() < 32) {
            return null;
        }
        sVar.c(0);
        if (sVar.i() != sVar.a() + 4 || sVar.i() != com.anythink.basead.exoplayer.e.a.a.f7075Z) {
            return null;
        }
        int a9 = com.anythink.basead.exoplayer.e.a.a.a(sVar.i());
        if (a9 > 1) {
            Log.w(f7261a, "Unsupported pssh version: ".concat(String.valueOf(a9)));
            return null;
        }
        UUID uuid = new UUID(sVar.j(), sVar.j());
        if (a9 == 1) {
            sVar.d(sVar.m() * 16);
        }
        int m8 = sVar.m();
        if (m8 != sVar.a()) {
            return null;
        }
        byte[] bArr2 = new byte[m8];
        sVar.a(bArr2, 0, m8);
        return new a(uuid, a9, bArr2);
    }

    public static UUID a(byte[] bArr) {
        a c4 = c(bArr);
        if (c4 == null) {
            return null;
        }
        return c4.f7262a;
    }

    public static byte[] a(byte[] bArr, UUID uuid) {
        a c4 = c(bArr);
        if (c4 == null) {
            return null;
        }
        if (uuid == null || uuid.equals(c4.f7262a)) {
            return c4.f7264c;
        }
        Log.w(f7261a, "UUID mismatch. Expected: " + uuid + ", got: " + c4.f7262a + com.anythink.core.common.d.j.f12535z);
        return null;
    }

    private static byte[] a(UUID uuid, byte[] bArr) {
        int length = bArr != null ? bArr.length : 0;
        int i = length + 32;
        ByteBuffer allocate = ByteBuffer.allocate(i);
        allocate.putInt(i);
        allocate.putInt(com.anythink.basead.exoplayer.e.a.a.f7075Z);
        allocate.putInt(0);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        if (length != 0) {
            allocate.putInt(bArr.length);
            allocate.put(bArr);
        }
        return allocate.array();
    }
}
