package net.idrnd.face.iad.capture.internal;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;

/* loaded from: classes9.dex */
public final class l0 extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
    public final void a(ByteString byteString) {
        copyOnWrite();
        m0 m0Var = (m0) this.instance;
        m0Var.getClass();
        byteString.getClass();
        m0Var.key_ = byteString;
    }

    public final void b(ByteString byteString) {
        copyOnWrite();
        m0 m0Var = (m0) this.instance;
        m0Var.getClass();
        byteString.getClass();
        m0Var.rawData_ = byteString;
    }

    public final void a() {
        copyOnWrite();
        ((m0) this.instance).scheme_ = 1;
    }
}
