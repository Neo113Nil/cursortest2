package com.onesignal.common;

import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;
import kotlin.text.Charsets;
import kotlin.text.Regex;

/* loaded from: classes.dex */
public final class j {
    private static final int SHA256_HEX_LENGTH = 64;
    public static final j INSTANCE = new j();
    private static final Regex SHA256_HEX_REGEX = new Regex("^[a-f0-9]{64}$");

    public static final class a extends p implements Function1 {
        public static final a INSTANCE = new a();

        public a() {
            super(1);
        }

        public final CharSequence invoke(byte b7) {
            String format = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b7)}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            return format;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).byteValue());
        }
    }

    private j() {
    }

    public final String hash(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = value.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        byte[] digest = messageDigest.digest(bytes);
        Intrinsics.b(digest);
        return kotlin.collections.p.n(digest, "", a.INSTANCE, 30);
    }

    public final boolean isHashed(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return SHA256_HEX_REGEX.c(value);
    }
}
