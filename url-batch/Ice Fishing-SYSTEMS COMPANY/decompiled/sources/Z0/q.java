package Z0;

import X0.v;
import a1.AbstractC0421e;
import a1.InterfaceC0417a;
import f1.AbstractC4490a;
import java.util.List;

/* loaded from: classes.dex */
public final class q implements InterfaceC0417a, c {

    /* renamed from: a, reason: collision with root package name */
    public final v f4178a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0421e f4179b;

    /* renamed from: c, reason: collision with root package name */
    public e1.k f4180c;

    public q(v vVar, AbstractC4490a abstractC4490a, e1.j jVar) {
        this.f4178a = vVar;
        jVar.getClass();
        a1.i a9 = jVar.f37284a.a();
        this.f4179b = a9;
        abstractC4490a.e(a9);
        a9.a(this);
    }

    public static int c(int i, int i4) {
        int i9 = i / i4;
        if ((i ^ i4) < 0 && i9 * i4 != i) {
            i9--;
        }
        return i - (i9 * i4);
    }

    @Override // a1.InterfaceC0417a
    public final void a() {
        this.f4178a.invalidateSelf();
    }

    @Override // Z0.c
    public final void b(List list, List list2) {
    }
}
