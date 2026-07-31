package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* renamed from: androidx.datastore.preferences.protobuf.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0215z extends IOException {

    /* renamed from: d, reason: collision with root package name */
    public boolean f3936d;

    public static C0215z a() {
        return new C0215z("Protocol message had invalid UTF-8.");
    }

    public static C0214y b() {
        return new C0214y("Protocol message tag had invalid wire type.");
    }

    public static C0215z c() {
        return new C0215z("CodedInputStream encountered a malformed varint.");
    }

    public static C0215z d() {
        return new C0215z("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static C0215z e() {
        return new C0215z("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
