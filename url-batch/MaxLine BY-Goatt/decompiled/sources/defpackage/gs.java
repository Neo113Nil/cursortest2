package defpackage;

import defpackage.aa2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class gs {
    public static final void a(Function2 function2, e0 e0Var, e0 e0Var2) {
        try {
            o30 b = q41.b(q41.a(e0Var, e0Var2, function2));
            aa2.a aVar = aa2.m;
            j8.U(b, Unit.a);
        } catch (Throwable th) {
            aa2.a aVar2 = aa2.m;
            e0Var2.resumeWith(new ba2(th));
            throw th;
        }
    }
}
