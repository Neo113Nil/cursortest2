package q3;

import C.F;
import java.net.Socket;
import kotlin.jvm.internal.Intrinsics;
import z3.C1447e;

/* loaded from: classes.dex */
public final class f extends C1447e {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g f9387m;

    public f(g gVar) {
        this.f9387m = gVar;
    }

    @Override // z3.C1447e
    public final void j() {
        Socket socket;
        g call = this.f9387m;
        if (call.f9400s) {
            return;
        }
        call.f9400s = true;
        F f4 = call.f9401t;
        if (f4 != null) {
            ((r3.d) f4.f1054d).cancel();
        }
        i iVar = call.f9402u;
        if (iVar != null && (socket = iVar.f9405c) != null) {
            n3.b.d(socket);
        }
        Intrinsics.checkNotNullParameter(call, "call");
    }
}
