package ru.rustore.sdk.imaging.internal;

import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.collections.AbstractC3219i;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import kotlin.text.Charsets;

/* loaded from: classes3.dex */
public final class b {

    public static final class a extends s implements Function1<Byte, CharSequence> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f43647a = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            String format = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(((Number) obj).byteValue())}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(this, *args)");
            return format;
        }
    }

    public static ru.rustore.sdk.imaging.internal.a a(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        byte[] bytes = url.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        byte[] digest = messageDigest.digest(bytes);
        Intrinsics.checkNotNullExpressionValue(digest, "getInstance(MD5_ALGORITH…digest(url.toByteArray())");
        return new ru.rustore.sdk.imaging.internal.a(AbstractC3219i.i0(digest, "", null, null, 0, null, a.f43647a, 30, null));
    }
}
