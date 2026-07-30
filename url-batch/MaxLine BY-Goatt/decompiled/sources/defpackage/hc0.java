package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class hc0 extends o81 implements Function0 {
    public final /* synthetic */ boolean m;
    public final /* synthetic */ wd2 n;
    public final /* synthetic */ String o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hc0(boolean z, wd2 wd2Var, String str) {
        super(0);
        this.m = z;
        this.n = wd2Var;
        this.o = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if (this.m) {
            wd2 wd2Var = this.n;
            String str = this.o;
            yd2 yd2Var = wd2Var.a;
            synchronized (yd2Var.c) {
            }
        }
        return Unit.a;
    }
}
