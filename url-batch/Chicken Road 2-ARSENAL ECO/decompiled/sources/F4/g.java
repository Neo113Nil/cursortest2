package F4;

import D4.s;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.function.BiConsumer;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements BiConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f761a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ D4.b f762b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ D4.i f763c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f764d;

    public /* synthetic */ g(D4.i iVar, int[] iArr, D4.b bVar) {
        this.f763c = iVar;
        this.f764d = iArr;
        this.f762b = bVar;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        int i7;
        int i8 = this.f761a;
        D4.b bVar = this.f762b;
        Object obj3 = this.f764d;
        switch (i8) {
            case 0:
                int[] iArr = (int[]) obj3;
                X3.a aVar = (X3.a) obj;
                D4.i iVar = this.f763c;
                int b7 = iVar.b();
                if (aVar.f2864b.isEmpty()) {
                    i7 = 0;
                } else {
                    i7 = D4.j.b(K4.d.f1382a, aVar.d());
                }
                int b8 = s.b(K4.d.f1383b, aVar, obj2, a.f748h, iVar) + i7;
                iVar.f533c[b7] = b8;
                iArr[0] = D4.d.b(b8) + bVar.f512c + b8 + iArr[0];
                return;
            default:
                D4.n nVar = (D4.n) obj3;
                D4.i iVar2 = this.f763c;
                X3.a aVar2 = (X3.a) obj;
                try {
                    nVar.U(bVar, iVar2.e());
                    if (aVar2.f2864b.isEmpty()) {
                        D4.b bVar2 = K4.d.f1382a;
                    } else {
                        nVar.v(K4.d.f1382a, aVar2.d());
                    }
                    nVar.e(K4.d.f1383b, aVar2, obj2, a.f748h, iVar2);
                    nVar.K();
                    return;
                } catch (IOException e4) {
                    throw new UncheckedIOException(e4);
                }
        }
    }

    public /* synthetic */ g(D4.n nVar, D4.b bVar, D4.i iVar) {
        this.f764d = nVar;
        this.f762b = bVar;
        this.f763c = iVar;
    }
}
