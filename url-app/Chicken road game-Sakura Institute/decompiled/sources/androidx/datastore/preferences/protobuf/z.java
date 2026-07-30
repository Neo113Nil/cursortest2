package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public class z extends IOException {

    /* renamed from: f, reason: collision with root package name */
    public boolean f928f;

    public static z a() {
        return new z("Protocol message had invalid UTF-8.");
    }

    public static y b() {
        return new y("Protocol message tag had invalid wire type.");
    }

    public static z c() {
        return new z("CodedInputStream encountered a malformed varint.");
    }

    public static z d() {
        return new z("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static z e() {
        return new z("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
