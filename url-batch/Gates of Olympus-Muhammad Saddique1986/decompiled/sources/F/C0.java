package F;

import C0.C0026b;
import a0.C0238c;
import android.graphics.Matrix;
import android.graphics.Path;
import b0.C0341j;
import e2.InterfaceC0424c;
import h2.AbstractC0508a;
import r0.AbstractC0892N;
import r0.AbstractC0893O;

/* loaded from: classes.dex */
public final class C0 extends f2.k implements InterfaceC0424c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1127e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f1128f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1129g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1130h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0(int i3, AbstractC0893O abstractC0893O, int i4) {
        super(1);
        this.f1127e = 0;
        this.f1129g = i3;
        this.f1128f = abstractC0893O;
        this.f1130h = i4;
    }

    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        switch (this.f1127e) {
            case 0:
                AbstractC0892N.d((AbstractC0892N) obj, (AbstractC0893O) this.f1128f, AbstractC0508a.Q((this.f1129g - r0.f8126d) / 2.0f), AbstractC0508a.Q((this.f1130h - r0.f8127e) / 2.0f));
                return R1.y.f4171a;
            case 1:
                AbstractC0892N.d((AbstractC0892N) obj, (AbstractC0893O) this.f1128f, this.f1129g, this.f1130h);
                return R1.y.f4171a;
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                AbstractC0892N.d((AbstractC0892N) obj, (AbstractC0893O) this.f1128f, -this.f1129g, -this.f1130h);
                return R1.y.f4171a;
            default:
                C0.r rVar = (C0.r) obj;
                C0026b c0026b = rVar.f634a;
                int b3 = rVar.b(this.f1129g);
                int b4 = rVar.b(this.f1130h);
                CharSequence charSequence = c0026b.f582e;
                if (b3 < 0 || b3 > b4 || b4 > charSequence.length()) {
                    throw new IllegalArgumentException(("start(" + b3 + ") or end(" + b4 + ") is out of range [0.." + charSequence.length() + "], or start > end!").toString());
                }
                Path path = new Path();
                D0.G g3 = c0026b.f581d;
                g3.f827f.getSelectionPath(b3, b4, path);
                int i3 = g3.f829h;
                if (i3 != 0 && !path.isEmpty()) {
                    path.offset(0.0f, i3);
                }
                long e3 = l0.c.e(0.0f, rVar.f639f);
                Matrix matrix = new Matrix();
                matrix.setTranslate(C0238c.d(e3), C0238c.e(e3));
                path.transform(matrix);
                ((C0341j) this.f1128f).f5420a.addPath(path, C0238c.d(0L), C0238c.e(0L));
                return R1.y.f4171a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0(Object obj, int i3, int i4, int i5) {
        super(1);
        this.f1127e = i5;
        this.f1128f = obj;
        this.f1129g = i3;
        this.f1130h = i4;
    }
}
