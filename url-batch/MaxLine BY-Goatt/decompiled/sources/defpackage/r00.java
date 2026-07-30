package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class r00 extends t52 {
    public final /* synthetic */ int b = 1;
    public final Object c;

    public r00(Function1 function1) {
        super(new e4(3));
        this.c = new s00(function1);
    }

    @Override // defpackage.t52
    public final ye a(Object obj) {
        switch (this.b) {
            case 0:
                return new ye(this, obj, obj == null, null, true);
            default:
                return new ye(this, obj, obj == null, (zm2) this.c, true);
        }
    }

    @Override // defpackage.t52
    public r33 b() {
        switch (this.b) {
            case 0:
                return (s00) this.c;
            default:
                return super.b();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r00(Function0 function0) {
        super(function0);
        by1 by1Var = by1.B;
        this.c = by1Var;
    }
}
