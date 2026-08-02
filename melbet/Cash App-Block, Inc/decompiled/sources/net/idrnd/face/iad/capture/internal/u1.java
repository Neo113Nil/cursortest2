package net.idrnd.face.iad.capture.internal;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;

/* loaded from: classes9.dex */
public final class u1 extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
    public final void a(m2 m2Var) {
        copyOnWrite();
        v1 v1Var = (v1) this.instance;
        n2 n2Var = (n2) m2Var.build();
        v1Var.getClass();
        n2Var.getClass();
        v1Var.size_ = n2Var;
    }

    public final void a$1(ByteString byteString) {
        copyOnWrite();
        v1 v1Var = (v1) this.instance;
        v1Var.getClass();
        byteString.getClass();
        v1Var.content_ = byteString;
    }

    public final void a(n1 n1Var) {
        copyOnWrite();
        v1 v1Var = (v1) this.instance;
        v1Var.getClass();
        v1Var.positionOnImage_ = n1Var.getNumber();
    }

    public final void a(i2 i2Var) {
        copyOnWrite();
        v1 v1Var = (v1) this.instance;
        j2 j2Var = (j2) i2Var.build();
        v1Var.getClass();
        j2Var.getClass();
        v1Var.topLeftPointOnImage_ = j2Var;
    }
}
