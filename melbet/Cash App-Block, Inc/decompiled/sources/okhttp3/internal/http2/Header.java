package okhttp3.internal.http2;

import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* loaded from: classes3.dex */
public final class Header {
    public static final ByteString PSEUDO_PREFIX;
    public static final ByteString RESPONSE_STATUS;
    public static final ByteString TARGET_AUTHORITY;
    public static final ByteString TARGET_METHOD;
    public static final ByteString TARGET_PATH;
    public static final ByteString TARGET_SCHEME;
    public final int hpackSize;
    public final ByteString name;
    public final ByteString value;

    static {
        ByteString.Companion companion = ByteString.Companion;
        PSEUDO_PREFIX = ByteString.Companion.encodeUtf8(":");
        RESPONSE_STATUS = ByteString.Companion.encodeUtf8(":status");
        TARGET_METHOD = ByteString.Companion.encodeUtf8(":method");
        TARGET_PATH = ByteString.Companion.encodeUtf8(":path");
        TARGET_SCHEME = ByteString.Companion.encodeUtf8(":scheme");
        TARGET_AUTHORITY = ByteString.Companion.encodeUtf8(":authority");
    }

    public Header(ByteString byteString, ByteString byteString2) {
        byteString.getClass();
        byteString2.getClass();
        this.name = byteString;
        this.value = byteString2;
        this.hpackSize = byteString2.getSize$okio() + byteString.getSize$okio() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Header)) {
            return false;
        }
        Header header = (Header) obj;
        return Intrinsics.areEqual(this.name, header.name) && Intrinsics.areEqual(this.value, header.value);
    }

    public final int hashCode() {
        return this.value.hashCode() + (this.name.hashCode() * 31);
    }

    public final String toString() {
        return this.name.utf8() + ": " + this.value.utf8();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Header(String str, String str2) {
        this(ByteString.Companion.encodeUtf8(str), ByteString.Companion.encodeUtf8(str2));
        str.getClass();
        ByteString.Companion companion = ByteString.Companion;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Header(String str, ByteString byteString) {
        this(byteString, ByteString.Companion.encodeUtf8(str));
        byteString.getClass();
        str.getClass();
        ByteString.Companion companion = ByteString.Companion;
    }
}
