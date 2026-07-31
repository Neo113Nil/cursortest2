package r;

/* renamed from: r.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0807d implements InterfaceC0808e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7057a;

    @Override // r.InterfaceC0808e
    public final void b(M0.b bVar, int i3, int[] iArr, M0.j jVar, int[] iArr2) {
        switch (this.f7057a) {
            case 0:
                if (jVar != M0.j.f2775d) {
                    AbstractC0813j.b(iArr, iArr2, true);
                    break;
                } else {
                    AbstractC0813j.c(i3, iArr, iArr2, false);
                    break;
                }
            default:
                if (jVar != M0.j.f2775d) {
                    AbstractC0813j.c(i3, iArr, iArr2, true);
                    break;
                } else {
                    AbstractC0813j.b(iArr, iArr2, false);
                    break;
                }
        }
    }

    public final String toString() {
        switch (this.f7057a) {
            case 0:
                return "Arrangement#End";
            default:
                return "Arrangement#Start";
        }
    }
}
