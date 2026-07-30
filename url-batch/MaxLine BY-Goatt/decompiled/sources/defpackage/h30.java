package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class h30 extends o81 implements Function0 {
    public final /* synthetic */ int m = 0;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ tt0 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h30(Function1 function1, boolean z) {
        super(0);
        this.o = function1;
        this.n = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.m;
        boolean z = this.n;
        tt0 tt0Var = this.o;
        switch (i) {
            case 0:
                if (z) {
                    ((Function0) tt0Var).invoke();
                }
                break;
            default:
                ((Function1) tt0Var).invoke(Boolean.valueOf(!z));
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h30(Function0 function0, boolean z) {
        super(0);
        this.n = z;
        this.o = function0;
    }
}
