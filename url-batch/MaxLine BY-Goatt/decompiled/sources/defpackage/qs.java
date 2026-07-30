package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class qs implements Function0 {
    public final /* synthetic */ int m;
    public final /* synthetic */ Function1 n;
    public final /* synthetic */ ik o;

    public /* synthetic */ qs(Function1 function1, ik ikVar, int i) {
        this.m = i;
        this.n = function1;
        this.o = ikVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.m;
        ik ikVar = this.o;
        Function1 function1 = this.n;
        switch (i) {
            case 0:
                function1.invoke(ikVar.a);
                break;
            case 1:
                function1.invoke(ikVar.a);
                break;
            case 2:
                function1.invoke(ikVar.a);
                break;
            case 3:
                function1.invoke(ikVar.a);
                break;
            default:
                function1.invoke(ikVar.a);
                break;
        }
        return Unit.a;
    }
}
