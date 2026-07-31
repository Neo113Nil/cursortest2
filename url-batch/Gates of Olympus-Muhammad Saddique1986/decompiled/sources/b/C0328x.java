package b;

import e2.InterfaceC0424c;
import java.util.ListIterator;

/* renamed from: b.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0328x extends f2.k implements InterfaceC0424c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5340e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0301E f5341f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0328x(C0301E c0301e, int i3) {
        super(1);
        this.f5340e = i3;
        this.f5341f = c0301e;
    }

    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        Object obj2;
        Object obj3;
        switch (this.f5340e) {
            case 0:
                C0306b c0306b = (C0306b) obj;
                f2.j.f(c0306b, "backEvent");
                C0301E c0301e = this.f5341f;
                S1.j jVar = c0301e.f5268b;
                ListIterator listIterator = jVar.listIterator(jVar.b());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        obj2 = listIterator.previous();
                        if (((AbstractC0327w) obj2).f5337a) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                AbstractC0327w abstractC0327w = (AbstractC0327w) obj2;
                if (c0301e.f5269c != null) {
                    c0301e.b();
                }
                c0301e.f5269c = abstractC0327w;
                if (abstractC0327w != null) {
                    abstractC0327w.d(c0306b);
                }
                break;
            default:
                C0306b c0306b2 = (C0306b) obj;
                f2.j.f(c0306b2, "backEvent");
                C0301E c0301e2 = this.f5341f;
                AbstractC0327w abstractC0327w2 = c0301e2.f5269c;
                if (abstractC0327w2 == null) {
                    S1.j jVar2 = c0301e2.f5268b;
                    ListIterator listIterator2 = jVar2.listIterator(jVar2.b());
                    while (true) {
                        if (listIterator2.hasPrevious()) {
                            obj3 = listIterator2.previous();
                            if (((AbstractC0327w) obj3).f5337a) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                    abstractC0327w2 = (AbstractC0327w) obj3;
                }
                if (abstractC0327w2 != null) {
                    abstractC0327w2.c(c0306b2);
                }
                break;
        }
        return R1.y.f4171a;
    }
}
