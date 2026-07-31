package x;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class b implements e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8197a;

    /* renamed from: b, reason: collision with root package name */
    public final float f8198b;

    public b(int i) {
        this.f8197a = i;
        switch (i) {
            case 1:
                this.f8198b = 0;
                break;
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                this.f8198b = 0;
                break;
            case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                this.f8198b = 0;
                break;
            default:
                this.f8198b = 0;
                break;
        }
    }

    @Override // x.d, x.h
    public final float a() {
        switch (this.f8197a) {
        }
        return this.f8198b;
    }

    @Override // x.h
    public final void b(u1.g0 g0Var, int i, int[] iArr, int[] iArr2) {
        switch (this.f8197a) {
            case 0:
                i.a(i, iArr, iArr2, false);
                break;
            case 1:
                i.d(i, iArr, iArr2, false);
                break;
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                i.e(i, iArr, iArr2, false);
                break;
            default:
                i.f(i, iArr, iArr2, false);
                break;
        }
    }

    @Override // x.d
    public final void c(u1.g0 g0Var, int i, int[] iArr, r2.l lVar, int[] iArr2) {
        switch (this.f8197a) {
            case 0:
                if (lVar != r2.l.f6529d) {
                    i.a(i, iArr, iArr2, true);
                    break;
                } else {
                    i.a(i, iArr, iArr2, false);
                    break;
                }
            case 1:
                if (lVar != r2.l.f6529d) {
                    i.d(i, iArr, iArr2, true);
                    break;
                } else {
                    i.d(i, iArr, iArr2, false);
                    break;
                }
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                if (lVar != r2.l.f6529d) {
                    i.e(i, iArr, iArr2, true);
                    break;
                } else {
                    i.e(i, iArr, iArr2, false);
                    break;
                }
            default:
                if (lVar != r2.l.f6529d) {
                    i.f(i, iArr, iArr2, true);
                    break;
                } else {
                    i.f(i, iArr, iArr2, false);
                    break;
                }
        }
    }

    public final String toString() {
        switch (this.f8197a) {
            case 0:
                return "Arrangement#Center";
            case 1:
                return "Arrangement#SpaceAround";
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                return "Arrangement#SpaceBetween";
            default:
                return "Arrangement#SpaceEvenly";
        }
    }
}
