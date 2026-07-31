package I;

/* renamed from: I.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0165o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2847a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2848b;

    public /* synthetic */ C0165o(int i3, Object obj) {
        this.f2847a = i3;
        this.f2848b = obj;
    }

    public final void a() {
        switch (this.f2847a) {
            case 0:
                C0167p c0167p = (C0167p) this.f2848b;
                c0167p.f2890z--;
                break;
            default:
                S.v vVar = (S.v) this.f2848b;
                vVar.f4268j--;
                break;
        }
    }

    public final void b() {
        switch (this.f2847a) {
            case 0:
                ((C0167p) this.f2848b).f2890z++;
                break;
            default:
                ((S.v) this.f2848b).f4268j++;
                break;
        }
    }
}
