package defpackage;

import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class q43 extends o81 implements Function2 {
    public final /* synthetic */ int m;
    public final /* synthetic */ ay0[] n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q43(ay0[] ay0VarArr, int i) {
        super(2);
        this.m = i;
        this.n = ay0VarArr;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.m;
        ay0[] ay0VarArr = this.n;
        switch (i) {
            case 0:
                return Float.valueOf(iv1.l((m12) obj, true, ay0VarArr, ((Number) obj2).floatValue()));
            default:
                return Float.valueOf(iv1.l((m12) obj, false, ay0VarArr, ((Number) obj2).floatValue()));
        }
    }
}
