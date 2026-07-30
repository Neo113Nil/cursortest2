package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* renamed from: androidx.datastore.preferences.protobuf.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0209z extends IOException {

    /* renamed from: d, reason: collision with root package name */
    public boolean f3573d;

    public static C0209z a() {
        return new C0209z("Protocol message had invalid UTF-8.");
    }

    public static C0208y b() {
        return new C0208y("Protocol message tag had invalid wire type.");
    }

    public static C0209z c() {
        return new C0209z("CodedInputStream encountered a malformed varint.");
    }

    public static C0209z d() {
        return new C0209z("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static C0209z e() {
        return new C0209z("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
