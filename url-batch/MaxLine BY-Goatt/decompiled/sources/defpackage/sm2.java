package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class sm2 implements Function1 {
    public final /* synthetic */ int m;
    public final /* synthetic */ Function1 n;
    public final /* synthetic */ Function1 o;

    public /* synthetic */ sm2(Function1 function1, Function1 function12, int i) {
        this.m = i;
        this.n = function1;
        this.o = function12;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.m;
        Function1 function1 = this.o;
        Function1 function12 = this.n;
        switch (i) {
            case 0:
                function12.invoke(obj);
                function1.invoke(obj);
                break;
            default:
                function12.invoke(obj);
                function1.invoke(obj);
                break;
        }
        return Unit.a;
    }
}
