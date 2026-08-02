package okhttp3.internal.ws;

import okio.ByteString;

/* loaded from: classes9.dex */
public abstract class MessageDeflaterKt {
    public static final ByteString EMPTY_DEFLATE_BLOCK;

    static {
        ByteString.Companion companion = ByteString.Companion;
        EMPTY_DEFLATE_BLOCK = ByteString.Companion.decodeHex("000000ffff");
    }
}
