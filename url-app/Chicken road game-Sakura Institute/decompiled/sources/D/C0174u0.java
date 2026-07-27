package D;

import A0.C0031b;
import Z.C0313j;
import a.AbstractC0345a;
import android.graphics.Matrix;
import android.graphics.Path;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import p0.AbstractC0953N;
import p0.AbstractC0954O;

/* renamed from: D.u0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0174u0 extends M2.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2039d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2040e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f2041i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f2042j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0174u0(int i2, AbstractC0954O abstractC0954O, int i4) {
        super(1);
        this.f2039d = 0;
        this.f2041i = i2;
        this.f2040e = abstractC0954O;
        this.f2042j = i4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f2039d) {
            case 0:
                AbstractC0953N.d((AbstractC0953N) obj, (AbstractC0954O) this.f2040e, O2.c.a((this.f2041i - r0.f9005d) / 2.0f), O2.c.a((this.f2042j - r0.f9006e) / 2.0f));
                return Unit.f7487a;
            case 1:
                AbstractC0953N.g((AbstractC0953N) obj, (AbstractC0954O) this.f2040e, this.f2041i, this.f2042j);
                return Unit.f7487a;
            case 2:
                AbstractC0953N.d((AbstractC0953N) obj, (AbstractC0954O) this.f2040e, this.f2041i, this.f2042j);
                return Unit.f7487a;
            case 3:
                AbstractC0953N.d((AbstractC0953N) obj, (AbstractC0954O) this.f2040e, -this.f2041i, -this.f2042j);
                return Unit.f7487a;
            default:
                A0.r rVar = (A0.r) obj;
                C0031b c0031b = rVar.f366a;
                int b4 = rVar.b(this.f2041i);
                int b5 = rVar.b(this.f2042j);
                CharSequence charSequence = c0031b.f314e;
                if (b4 < 0 || b4 > b5 || b5 > charSequence.length()) {
                    throw new IllegalArgumentException(("start(" + b4 + ") or end(" + b5 + ") is out of range [0.." + charSequence.length() + "], or start > end!").toString());
                }
                Path path = new Path();
                B0.F f4 = c0031b.f313d;
                f4.f905f.getSelectionPath(b4, b5, path);
                int i2 = f4.f907h;
                if (i2 != 0 && !path.isEmpty()) {
                    path.offset(0.0f, i2);
                }
                long c4 = AbstractC0345a.c(0.0f, rVar.f371f);
                Matrix matrix = new Matrix();
                matrix.setTranslate(Y.c.d(c4), Y.c.e(c4));
                path.transform(matrix);
                ((C0313j) this.f2040e).f4530a.addPath(path, Y.c.d(0L), Y.c.e(0L));
                return Unit.f7487a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0174u0(Object obj, int i2, int i4, int i5) {
        super(1);
        this.f2039d = i5;
        this.f2040e = obj;
        this.f2041i = i2;
        this.f2042j = i4;
    }
}
