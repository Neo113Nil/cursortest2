package m0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5058a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5059b;

    public /* synthetic */ r(int i, Object obj) {
        this.f5058a = i;
        this.f5059b = obj;
    }

    public final void a() {
        switch (this.f5058a) {
            case 0:
                s sVar = (s) this.f5059b;
                sVar.A--;
                break;
            default:
                w0.r rVar = (w0.r) this.f5059b;
                rVar.f7556j--;
                break;
        }
    }

    public final void b() {
        switch (this.f5058a) {
            case 0:
                ((s) this.f5059b).A++;
                break;
            default:
                ((w0.r) this.f5059b).f7556j++;
                break;
        }
    }
}
