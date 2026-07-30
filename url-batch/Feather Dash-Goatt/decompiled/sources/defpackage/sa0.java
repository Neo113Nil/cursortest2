package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public class sa0 extends IOException {
    public boolean d;

    public static sa0 a() {
        return new sa0("Protocol message had invalid UTF-8.");
    }

    public static ra0 b() {
        return new ra0("Protocol message tag had invalid wire type.");
    }

    public static sa0 c() {
        return new sa0("CodedInputStream encountered a malformed varint.");
    }

    public static sa0 d() {
        return new sa0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static sa0 e() {
        return new sa0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
