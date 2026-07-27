package G;

/* renamed from: G.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0214o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2843a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2844b;

    public /* synthetic */ C0214o(int i2, Object obj) {
        this.f2843a = i2;
        this.f2844b = obj;
    }

    public final void a() {
        switch (this.f2843a) {
            case 0:
                C0216p c0216p = (C0216p) this.f2844b;
                c0216p.f2887z--;
                break;
            default:
                Q.z zVar = (Q.z) this.f2844b;
                zVar.f3914j--;
                break;
        }
    }

    public final void b() {
        switch (this.f2843a) {
            case 0:
                ((C0216p) this.f2844b).f2887z++;
                break;
            default:
                ((Q.z) this.f2844b).f3914j++;
                break;
        }
    }
}
