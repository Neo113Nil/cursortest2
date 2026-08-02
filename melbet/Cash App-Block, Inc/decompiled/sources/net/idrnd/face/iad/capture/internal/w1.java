package net.idrnd.face.iad.capture.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;

/* loaded from: classes9.dex */
public final class w1 extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
    public final void a(int i) {
        copyOnWrite();
        ((x1) this.instance).quality_ = i;
    }

    public final void a$4(int i) {
        copyOnWrite();
        x1 x1Var = (x1) this.instance;
        x1Var.getClass();
        int i2 = 0;
        if (i == 3) {
            a$$ExternalSyntheticBUOutline0.m$3("Can't get the number of an unknown enum value.");
        } else if (i != 1) {
            if (i == 2) {
                i2 = 1;
            } else {
                if (i != 3) {
                    throw null;
                }
                i2 = -1;
            }
        }
        x1Var.type_ = i2;
    }
}
