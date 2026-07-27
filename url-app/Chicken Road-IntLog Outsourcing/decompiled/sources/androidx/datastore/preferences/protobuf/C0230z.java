package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* renamed from: androidx.datastore.preferences.protobuf.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0230z extends IOException {

    /* renamed from: a, reason: collision with root package name */
    public boolean f4510a;

    public static C0230z a() {
        return new C0230z("Protocol message had invalid UTF-8.");
    }

    public static C0229y b() {
        return new C0229y("Protocol message tag had invalid wire type.");
    }

    public static C0230z c() {
        return new C0230z("CodedInputStream encountered a malformed varint.");
    }

    public static C0230z d() {
        return new C0230z("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static C0230z e() {
        return new C0230z("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
