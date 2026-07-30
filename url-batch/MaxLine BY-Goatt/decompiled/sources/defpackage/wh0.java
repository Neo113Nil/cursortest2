package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class wh0 extends o81 implements Function1 {
    public final /* synthetic */ int m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ Function0 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wh0(boolean z, Function0 function0, int i) {
        super(1);
        this.m = i;
        this.n = z;
        this.o = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.m) {
            case 0:
                ((ia2) obj).c(!this.n && ((Boolean) this.o.invoke()).booleanValue());
                break;
            default:
                ((ia2) obj).a(this.n ? 1.0f : ((Number) this.o.invoke()).floatValue());
                break;
        }
        return Unit.a;
    }
}
