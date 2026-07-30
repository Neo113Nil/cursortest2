package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class zz implements Function2 {
    public final /* synthetic */ Object m;

    public zz(Object obj) {
        this.m = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        a00 a00Var = (a00) obj;
        int intValue = ((Number) obj2).intValue();
        if (a00Var.P(intValue & 1, (intValue & 3) != 2)) {
            throw null;
        }
        a00Var.S();
        return Unit.a;
    }
}
