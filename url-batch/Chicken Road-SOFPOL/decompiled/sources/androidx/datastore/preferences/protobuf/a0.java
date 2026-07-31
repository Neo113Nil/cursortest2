package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public class a0 extends IOException {

    /* renamed from: d, reason: collision with root package name */
    public boolean f645d;

    public static a0 a() {
        return new a0("Protocol message had invalid UTF-8.");
    }

    public static z b() {
        return new z("Protocol message tag had invalid wire type.");
    }

    public static a0 c() {
        return new a0("CodedInputStream encountered a malformed varint.");
    }

    public static a0 d() {
        return new a0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static a0 e() {
        return new a0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
