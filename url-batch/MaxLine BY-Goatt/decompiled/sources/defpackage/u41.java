package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class u41 extends IOException {
    private static final long serialVersionUID = -1616151763072450476L;
    public boolean m;

    public static u41 a() {
        return new u41("Protocol message had invalid UTF-8.");
    }

    public static t41 b() {
        return new t41("Protocol message tag had invalid wire type.");
    }

    public static u41 c() {
        return new u41("CodedInputStream encountered a malformed varint.");
    }

    public static u41 d() {
        return new u41("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static u41 e() {
        return new u41("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
