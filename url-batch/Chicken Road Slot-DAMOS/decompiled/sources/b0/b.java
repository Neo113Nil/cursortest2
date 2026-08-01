package b0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b implements c, f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f802a;

    /* renamed from: b, reason: collision with root package name */
    public final float f803b;

    public b(int i3) {
        this.f802a = i3;
        switch (i3) {
            case 1:
                this.f803b = 0;
                break;
            case 2:
                this.f803b = 0;
                break;
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                this.f803b = 0;
                break;
            default:
                this.f803b = 0;
                break;
        }
    }

    @Override // b0.c, b0.f
    public final float a() {
        switch (this.f802a) {
        }
        return this.f803b;
    }

    @Override // b0.c
    public final void b(x2.c cVar, int i3, int[] iArr, x2.l lVar, int[] iArr2) {
        switch (this.f802a) {
            case 0:
                if (lVar != x2.l.f10330d) {
                    g.a(i3, iArr, iArr2, true);
                    break;
                } else {
                    g.a(i3, iArr, iArr2, false);
                    break;
                }
            case 1:
                if (lVar != x2.l.f10330d) {
                    g.d(i3, iArr, iArr2, true);
                    break;
                } else {
                    g.d(i3, iArr, iArr2, false);
                    break;
                }
            case 2:
                if (lVar != x2.l.f10330d) {
                    g.e(i3, iArr, iArr2, true);
                    break;
                } else {
                    g.e(i3, iArr, iArr2, false);
                    break;
                }
            default:
                if (lVar != x2.l.f10330d) {
                    g.f(i3, iArr, iArr2, true);
                    break;
                } else {
                    g.f(i3, iArr, iArr2, false);
                    break;
                }
        }
    }

    @Override // b0.f
    public final void c(int i3, a2.i0 i0Var, int[] iArr, int[] iArr2) {
        switch (this.f802a) {
            case 0:
                g.a(i3, iArr, iArr2, false);
                break;
            case 1:
                g.d(i3, iArr, iArr2, false);
                break;
            case 2:
                g.e(i3, iArr, iArr2, false);
                break;
            default:
                g.f(i3, iArr, iArr2, false);
                break;
        }
    }

    public final String toString() {
        switch (this.f802a) {
            case 0:
                return "Arrangement#Center";
            case 1:
                return "Arrangement#SpaceAround";
            case 2:
                return "Arrangement#SpaceBetween";
            default:
                return "Arrangement#SpaceEvenly";
        }
    }
}
