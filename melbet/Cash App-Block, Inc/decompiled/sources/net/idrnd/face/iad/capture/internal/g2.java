package net.idrnd.face.iad.capture.internal;

import android.os.Build;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;

/* loaded from: classes9.dex */
public final class g2 extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
    public final void a$2() {
        copyOnWrite();
        h2 h2Var = (h2) this.instance;
        h2Var.getClass();
        h2Var.type_ = "Mobile";
    }

    public final void a$3() {
        String str = Build.MODEL;
        copyOnWrite();
        h2 h2Var = (h2) this.instance;
        h2Var.getClass();
        str.getClass();
        h2Var.deviceModel_ = Build.MODEL;
    }

    public final void b$1() {
        String str = Build.MANUFACTURER;
        copyOnWrite();
        h2 h2Var = (h2) this.instance;
        h2Var.getClass();
        str.getClass();
        h2Var.vendor_ = Build.MANUFACTURER;
    }
}
