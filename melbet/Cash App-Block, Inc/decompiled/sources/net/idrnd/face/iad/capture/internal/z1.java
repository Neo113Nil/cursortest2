package net.idrnd.face.iad.capture.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;

/* loaded from: classes9.dex */
public final class z1 extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
    public final void a(k1 k1Var) {
        copyOnWrite();
        a2 a2Var = (a2) this.instance;
        l1 l1Var = (l1) k1Var.build();
        a2Var.getClass();
        l1Var.getClass();
        a2Var.photoCaptureInfo_ = l1Var;
    }

    public final void a$3(int i) {
        copyOnWrite();
        ((a2) this.instance).height_ = i;
    }

    public final void a$5(int i) {
        copyOnWrite();
        a2 a2Var = (a2) this.instance;
        a2Var.getClass();
        int i2 = 0;
        if (i == 4) {
            a$$ExternalSyntheticBUOutline0.m$3("Can't get the number of an unknown enum value.");
        } else if (i != 1) {
            i2 = 2;
            if (i == 2) {
                i2 = 1;
            } else if (i != 3) {
                if (i != 4) {
                    throw null;
                }
                i2 = -1;
            }
        }
        a2Var.captureType_ = i2;
    }

    public final void b$3(int i) {
        copyOnWrite();
        ((a2) this.instance).width_ = i;
    }

    public final void a(j1 j1Var) {
        copyOnWrite();
        a2 a2Var = (a2) this.instance;
        a2Var.getClass();
        j1Var.getClass();
        a2Var.frontCameraInfo_ = j1Var;
    }

    public final void a(f2 f2Var) {
        copyOnWrite();
        a2 a2Var = (a2) this.instance;
        a2Var.getClass();
        f2Var.getClass();
        a2Var.os_ = f2Var;
    }

    public final void a(t0 t0Var) {
        copyOnWrite();
        a2 a2Var = (a2) this.instance;
        a2Var.getClass();
        t0Var.getClass();
        a2Var.androidBuildInfo_ = t0Var;
    }

    public final void a(h2 h2Var) {
        copyOnWrite();
        a2 a2Var = (a2) this.instance;
        a2Var.getClass();
        h2Var.getClass();
        a2Var.platform_ = h2Var;
    }

    public final void a(p2 p2Var) {
        copyOnWrite();
        a2 a2Var = (a2) this.instance;
        a2Var.getClass();
        p2Var.getClass();
        a2Var.timestampsMs_ = p2Var;
    }
}
