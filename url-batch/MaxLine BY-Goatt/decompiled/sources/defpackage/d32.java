package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class d32 implements e62, b32 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d32(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.b32
    public final Object b(String str, Function1 function1, r30 r30Var) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((j32) obj).b(str, function1, r30Var);
            default:
                return ((dr2) obj).b(str, function1, r30Var);
        }
    }

    @Override // defpackage.e62
    public final nc2 c() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((j32) obj).a;
            default:
                return ((dr2) obj).a;
        }
    }
}
