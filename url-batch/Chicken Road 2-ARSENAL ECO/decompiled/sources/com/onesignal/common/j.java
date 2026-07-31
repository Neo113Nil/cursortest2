package com.onesignal.common;

import java.security.MessageDigest;
import java.util.Arrays;
import x5.InterfaceC0743l;

/* loaded from: classes.dex */
public final class j {
    private static final int SHA256_HEX_LENGTH = 64;
    public static final j INSTANCE = new j();
    private static final F5.i SHA256_HEX_REGEX = new F5.i("^[a-f0-9]{64}$");

    public static final class a extends kotlin.jvm.internal.j implements InterfaceC0743l {
        public static final a INSTANCE = new a();

        public a() {
            super(1);
        }

        public final CharSequence invoke(byte b7) {
            return String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b7)}, 1));
        }

        @Override // x5.InterfaceC0743l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).byteValue());
        }
    }

    private j() {
    }

    public final String hash(String value) {
        kotlin.jvm.internal.i.e(value, "value");
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = value.getBytes(F5.a.f785a);
        kotlin.jvm.internal.i.d(bytes, "getBytes(...)");
        byte[] digest = messageDigest.digest(bytes);
        kotlin.jvm.internal.i.b(digest);
        a aVar = a.INSTANCE;
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i7 = 0;
        for (byte b7 : digest) {
            i7++;
            if (i7 > 1) {
                sb.append((CharSequence) "");
            }
            if (aVar != null) {
                sb.append((CharSequence) aVar.invoke(Byte.valueOf(b7)));
            } else {
                sb.append((CharSequence) String.valueOf((int) b7));
            }
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public final boolean isHashed(String value) {
        kotlin.jvm.internal.i.e(value, "value");
        F5.i iVar = SHA256_HEX_REGEX;
        iVar.getClass();
        return iVar.f806f.matcher(value).matches();
    }
}
