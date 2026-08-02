package net.idrnd.face.iad.capture.internal;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;

/* loaded from: classes9.dex */
public final class o2 extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
    public final void a$1(long j) {
        copyOnWrite();
        ((p2) this.instance).captureEnd_ = j;
    }

    public final void b(long j) {
        copyOnWrite();
        ((p2) this.instance).captureStart_ = j;
    }

    public final void c(long j) {
        copyOnWrite();
        ((p2) this.instance).controlPhoto_ = j;
    }

    public final void d(long j) {
        copyOnWrite();
        ((p2) this.instance).photo_ = j;
    }
}
