package net.idrnd.face.iad.capture.internal;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes9.dex */
public final class a1 extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
    public final void a(ArrayList arrayList) {
        Internal.IntList intList;
        copyOnWrite();
        b1 b1Var = (b1) this.instance;
        b1Var.a();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            u0 u0Var = (u0) it.next();
            intList = b1Var.emulatorSigns_;
            intList.addInt(u0Var.getNumber());
        }
    }

    public final void b(ArrayList arrayList) {
        Internal.IntList intList;
        copyOnWrite();
        b1 b1Var = (b1) this.instance;
        b1Var.b();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            v0 v0Var = (v0) it.next();
            intList = b1Var.rootSigns_;
            intList.addInt(v0Var.getNumber());
        }
    }

    public final void c(ArrayList arrayList) {
        Internal.IntList intList;
        copyOnWrite();
        b1 b1Var = (b1) this.instance;
        b1Var.c();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            w0 w0Var = (w0) it.next();
            intList = b1Var.sandboxSigns_;
            intList.addInt(w0Var.getNumber());
        }
    }
}
