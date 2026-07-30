package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class qr2 implements PointerInputEventHandler, eu0 {
    public final /* synthetic */ Function2 m;

    public qr2(Function2 function2) {
        this.m = function2;
    }

    @Override // defpackage.eu0
    public final tt0 b() {
        return this.m;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PointerInputEventHandler) || !(obj instanceof eu0)) {
            return false;
        }
        return Intrinsics.b(this.m, ((eu0) obj).b());
    }

    public final int hashCode() {
        return this.m.hashCode();
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final /* synthetic */ Object invoke(x22 x22Var, o30 o30Var) {
        return this.m.invoke(x22Var, o30Var);
    }
}
