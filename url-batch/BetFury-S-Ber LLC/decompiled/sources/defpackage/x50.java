package defpackage;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class x50 implements h70, v50 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x50(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.h70
    public final cb0 b() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((e60) obj).a;
            default:
                return ((mg0) obj).a;
        }
    }

    @Override // defpackage.v50
    public final Object d(String str, tr trVar, eg egVar) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((e60) obj).d(str, trVar, egVar);
            default:
                return ((mg0) obj).d(str, trVar, egVar);
        }
    }
}
