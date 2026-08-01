package hd;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class h {
    public static g a(i iVar, Function0 function0) {
        int ordinal = iVar.ordinal();
        if (ordinal == 0) {
            return new q(function0, null, 2, null);
        }
        if (ordinal == 1) {
            p pVar = new p();
            pVar.f4515d = function0;
            pVar.f4516e = c0.f4498a;
            return pVar;
        }
        if (ordinal != 2) {
            a2.r.p();
            return null;
        }
        h0 h0Var = new h0();
        h0Var.f4505d = function0;
        h0Var.f4506e = c0.f4498a;
        return h0Var;
    }

    public static q b(Function0 function0) {
        function0.getClass();
        return new q(function0, null, 2, null);
    }
}
