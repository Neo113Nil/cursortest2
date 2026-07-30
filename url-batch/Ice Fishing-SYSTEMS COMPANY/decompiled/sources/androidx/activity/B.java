package androidx.activity;

/* loaded from: classes.dex */
public final class B extends kotlin.jvm.internal.i implements E7.a {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f4526n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ G f4527u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ B(G g9, int i) {
        super(0);
        this.f4526n = i;
        this.f4527u = g9;
    }

    @Override // E7.a
    public final Object invoke() {
        switch (this.f4526n) {
            case 0:
                this.f4527u.c();
                break;
            case 1:
                this.f4527u.b();
                break;
            default:
                this.f4527u.c();
                break;
        }
        return q7.v.f40183a;
    }
}
