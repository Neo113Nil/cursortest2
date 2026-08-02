package net.idrnd.face.iad.capture.internal;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.ArrayList;

/* loaded from: classes9.dex */
public final class e1 extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
    public final void a(ByteString byteString) {
        copyOnWrite();
        h1 h1Var = (h1) this.instance;
        h1Var.getClass();
        byteString.getClass();
        h1Var.controlPhoto_ = byteString;
    }

    public final void a$1(ArrayList arrayList) {
        copyOnWrite();
        ((h1) this.instance).a$1(arrayList);
    }

    public final void b(ByteString byteString) {
        copyOnWrite();
        h1 h1Var = (h1) this.instance;
        h1Var.getClass();
        byteString.getClass();
        h1Var.photo_ = byteString;
    }

    public final void b$1(ArrayList arrayList) {
        copyOnWrite();
        ((h1) this.instance).b$1(arrayList);
    }

    public final void a(String str) {
        copyOnWrite();
        h1 h1Var = (h1) this.instance;
        h1Var.getClass();
        h1Var.applicationVersion_ = str;
    }

    public final void b() {
        copyOnWrite();
        h1 h1Var = (h1) this.instance;
        h1Var.getClass();
        h1Var.qualityPhoto_ = 1;
    }

    public final void a(t1 t1Var) {
        copyOnWrite();
        h1 h1Var = (h1) this.instance;
        h1Var.getClass();
        t1Var.getClass();
        h1Var.frontCheck_ = t1Var;
    }

    public final void a(a2 a2Var) {
        copyOnWrite();
        h1 h1Var = (h1) this.instance;
        h1Var.getClass();
        a2Var.getClass();
        h1Var.metaInfo_ = a2Var;
    }

    public final void a(x1 x1Var) {
        copyOnWrite();
        h1 h1Var = (h1) this.instance;
        h1Var.getClass();
        x1Var.getClass();
        h1Var.photoFormat_ = x1Var;
    }

    public final void a() {
        copyOnWrite();
        h1 h1Var = (h1) this.instance;
        h1Var.getClass();
        h1Var.platform_ = 1;
    }

    public final void a(long j) {
        copyOnWrite();
        ((h1) this.instance).timestampSec_ = j;
    }
}
