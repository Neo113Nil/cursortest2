package defpackage;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final /* synthetic */ class lz implements k40 {
    public final /* synthetic */ int a;
    public final /* synthetic */ tr b;

    public /* synthetic */ lz(tr trVar, int i) {
        this.a = i;
        this.b = trVar;
    }

    @Override // defpackage.k40
    public final /* synthetic */ void a(Object obj) {
        int i = this.a;
        tr trVar = this.b;
        switch (i) {
            case 0:
                ((jz) trVar).h(obj);
                break;
            default:
                trVar.h(obj);
                break;
        }
    }

    public final tr b() {
        int i = this.a;
        tr trVar = this.b;
        switch (i) {
            case 0:
                return (jz) trVar;
            default:
                return trVar;
        }
    }

    public final boolean equals(Object obj) {
        int i = this.a;
        tr trVar = this.b;
        switch (i) {
            case 0:
                return (obj instanceof k40) && (obj instanceof lz) && ((jz) trVar) == ((lz) obj).b();
            default:
                if ((obj instanceof k40) && (obj instanceof lz)) {
                    return trVar.equals(((lz) obj).b());
                }
                return false;
        }
    }

    public final int hashCode() {
        int i = this.a;
        tr trVar = this.b;
        switch (i) {
            case 0:
                return ((jz) trVar).hashCode();
            default:
                return trVar.hashCode();
        }
    }
}
