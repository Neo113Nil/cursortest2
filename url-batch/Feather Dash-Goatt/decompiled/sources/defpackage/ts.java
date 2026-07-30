package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class ts extends pc0 implements Function0 {
    public final /* synthetic */ boolean d;
    public final /* synthetic */ c51 e;
    public final /* synthetic */ String g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ts(boolean z, c51 c51Var, String str) {
        super(0);
        this.d = z;
        this.e = c51Var;
        this.g = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if (this.d) {
            c51 c51Var = this.e;
            String str = this.g;
            d61 d61Var = (d61) c51Var.e;
            synchronized (d61Var.c) {
            }
        }
        return Unit.a;
    }
}
