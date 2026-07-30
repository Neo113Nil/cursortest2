package defpackage;

import java.util.Map;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class fc1 extends o81 implements Function1 {
    public final /* synthetic */ int m;
    public final /* synthetic */ ld2 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fc1(ld2 ld2Var, int i) {
        super(1);
        this.m = i;
        this.n = ld2Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.m;
        ld2 ld2Var = this.n;
        switch (i) {
            case 0:
                return Boolean.valueOf(ld2Var != null ? ld2Var.a(obj) : true);
            default:
                return new gc1(ld2Var, (Map) obj);
        }
    }
}
