package net.idrnd.face.iad.capture.internal;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;

/* loaded from: classes9.dex */
public final class s1 extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
    public final void a(b1 b1Var) {
        copyOnWrite();
        t1 t1Var = (t1) this.instance;
        t1Var.getClass();
        b1Var.getClass();
        t1Var.androidSecuritySoftwareChecks_ = b1Var;
    }

    public final void a(boolean z) {
        copyOnWrite();
        ((t1) this.instance).rootedDevice_ = z;
    }
}
