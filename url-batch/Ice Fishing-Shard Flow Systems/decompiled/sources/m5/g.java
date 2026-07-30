package m5;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.function.BiConsumer;
import k5.C0602b;
import k5.C0603c;
import k5.q;
import r5.AbstractC0851d;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements BiConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6560a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0602b f6561b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k5.g f6562c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f6563d;

    public /* synthetic */ g(k5.g gVar, int[] iArr, C0602b c0602b) {
        this.f6562c = gVar;
        this.f6563d = iArr;
        this.f6561b = c0602b;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        int i2;
        int i5 = this.f6560a;
        C0602b c0602b = this.f6561b;
        Object obj3 = this.f6563d;
        switch (i5) {
            case 0:
                int[] iArr = (int[]) obj3;
                E4.a aVar = (E4.a) obj;
                k5.g gVar = this.f6562c;
                int b7 = gVar.b();
                if (aVar.f701b.isEmpty()) {
                    i2 = 0;
                } else {
                    i2 = k5.h.b(AbstractC0851d.f7538a, aVar.d());
                }
                int b8 = q.b(AbstractC0851d.f7539b, aVar, obj2, C0691a.f6548h, gVar) + i2;
                gVar.f6072c[b7] = b8;
                iArr[0] = C0603c.b(b8) + c0602b.f6058c + b8 + iArr[0];
                return;
            default:
                k5.l lVar = (k5.l) obj3;
                k5.g gVar2 = this.f6562c;
                E4.a aVar2 = (E4.a) obj;
                try {
                    lVar.U(c0602b, gVar2.e());
                    if (aVar2.f701b.isEmpty()) {
                        C0602b c0602b2 = AbstractC0851d.f7538a;
                    } else {
                        lVar.B(AbstractC0851d.f7538a, aVar2.d());
                    }
                    lVar.g(AbstractC0851d.f7539b, aVar2, obj2, C0691a.f6548h, gVar2);
                    lVar.K();
                    return;
                } catch (IOException e7) {
                    throw new UncheckedIOException(e7);
                }
        }
    }

    public /* synthetic */ g(k5.l lVar, C0602b c0602b, k5.g gVar) {
        this.f6563d = lVar;
        this.f6561b = c0602b;
        this.f6562c = gVar;
    }
}
