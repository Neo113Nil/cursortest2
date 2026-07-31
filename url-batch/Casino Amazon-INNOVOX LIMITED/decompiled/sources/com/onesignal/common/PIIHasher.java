package com.onesignal.common;

import com.onesignal.core.BuildConfig;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.Regex;

/* compiled from: PIIHasher.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/onesignal/common/PIIHasher;", "", "()V", "SHA256_HEX_LENGTH", "", "SHA256_HEX_REGEX", "Lkotlin/text/Regex;", "hash", "", "value", "isHashed", "", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PIIHasher {
    private static final int SHA256_HEX_LENGTH = 64;
    public static final PIIHasher INSTANCE = new PIIHasher();
    private static final Regex SHA256_HEX_REGEX = new Regex("^[a-f0-9]{64}$");

    private PIIHasher() {
    }

    public final String hash(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = value.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        byte[] digest = messageDigest.digest(bytes);
        Intrinsics.checkNotNull(digest);
        return ArraysKt.joinToString$default(digest, (CharSequence) "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) new Function1<Byte, CharSequence>() { // from class: com.onesignal.common.PIIHasher$hash$1
            public final CharSequence invoke(byte b) {
                String format = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                return format;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ CharSequence invoke(Byte b) {
                return invoke(b.byteValue());
            }
        }, 30, (Object) null);
    }

    public final boolean isHashed(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return SHA256_HEX_REGEX.matches(value);
    }
}
