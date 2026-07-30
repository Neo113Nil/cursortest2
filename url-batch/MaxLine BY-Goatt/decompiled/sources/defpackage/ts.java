package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class ts implements Function0 {
    public final /* synthetic */ int m;
    public final /* synthetic */ Function1 n;
    public final /* synthetic */ String o;

    public /* synthetic */ ts(int i, String str, Function1 function1) {
        this.m = i;
        this.n = function1;
        this.o = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.m) {
            case 0:
                this.n.invoke(this.o);
                break;
            default:
                this.n.invoke(this.o);
                break;
        }
        return Unit.a;
    }
}
