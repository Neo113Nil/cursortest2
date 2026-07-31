package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes.dex */
public class mq3 extends IOException {

    /* renamed from: f, reason: collision with root package name */
    private kr3 f8688f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f8689g;

    public mq3(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.f8688f = null;
    }

    public mq3(String str) {
        super(str);
        this.f8688f = null;
    }

    static lq3 a() {
        return new lq3("Protocol message tag had invalid wire type.");
    }

    static mq3 b() {
        return new mq3("Protocol message end-group tag did not match expected tag.");
    }

    static mq3 c() {
        return new mq3("Protocol message contained an invalid tag (zero).");
    }

    static mq3 d() {
        return new mq3("Protocol message had invalid UTF-8.");
    }

    static mq3 e() {
        return new mq3("CodedInputStream encountered a malformed varint.");
    }

    static mq3 f() {
        return new mq3("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static mq3 g() {
        return new mq3("Failed to parse the message.");
    }

    static mq3 i() {
        return new mq3("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    static mq3 j() {
        return new mq3("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final mq3 h(kr3 kr3Var) {
        this.f8688f = kr3Var;
        return this;
    }

    final void k() {
        this.f8689g = true;
    }

    final boolean l() {
        return this.f8689g;
    }
}
