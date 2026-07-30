package defpackage;

import java.util.List;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class bo3 extends zb3 {
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bo3(String str, int i) {
        super(str);
        this.o = i;
    }

    @Override // defpackage.zb3
    public final kc3 h(js0 js0Var, List list) {
        int i = this.o;
        qc3 qc3Var = kc3.e;
        switch (i) {
            case 0:
                return qc3Var;
            case 1:
            case 2:
                return this;
            case 3:
                return new xb3(Double.valueOf(0.0d));
            default:
                return qc3Var;
        }
    }
}
