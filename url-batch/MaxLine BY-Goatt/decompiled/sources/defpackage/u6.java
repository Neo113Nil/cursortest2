package defpackage;

import android.graphics.Rect;
import kotlin.Unit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class u6 extends o81 implements yt0 {
    public final /* synthetic */ v6 m;
    public final /* synthetic */ int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u6(v6 v6Var, int i) {
        super(4);
        this.m = v6Var;
        this.n = i;
    }

    @Override // defpackage.yt0
    public final Object b(Object obj, Object obj2, Object obj3, Object obj4) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        int intValue3 = ((Number) obj3).intValue();
        int intValue4 = ((Number) obj4).intValue();
        v6 v6Var = this.m;
        v6Var.a.f(v6Var.c, this.n, new Rect(intValue, intValue2, intValue3, intValue4));
        return Unit.a;
    }
}
