package b;

import c3.C0297i;
import java.util.ListIterator;
import o3.InterfaceC1339l;

/* loaded from: classes.dex */
public final class r extends kotlin.jvm.internal.j implements InterfaceC1339l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5239e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0238A f5240f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(C0238A c0238a, int i4) {
        super(1);
        this.f5239e = i4;
        this.f5240f = c0238a;
    }

    @Override // o3.InterfaceC1339l
    public final Object invoke(Object obj) {
        Object obj2;
        Object obj3;
        switch (this.f5239e) {
            case 0:
                C0241b backEvent = (C0241b) obj;
                kotlin.jvm.internal.i.e(backEvent, "backEvent");
                C0238A c0238a = this.f5240f;
                d3.f fVar = c0238a.f5206b;
                ListIterator listIterator = fVar.listIterator(fVar.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        obj2 = listIterator.previous();
                        if (((q) obj2).isEnabled()) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                q qVar = (q) obj2;
                if (c0238a.f5207c != null) {
                    c0238a.b();
                }
                c0238a.f5207c = qVar;
                if (qVar != null) {
                    qVar.handleOnBackStarted(backEvent);
                }
                break;
            default:
                C0241b backEvent2 = (C0241b) obj;
                kotlin.jvm.internal.i.e(backEvent2, "backEvent");
                C0238A c0238a2 = this.f5240f;
                q qVar2 = c0238a2.f5207c;
                if (qVar2 == null) {
                    d3.f fVar2 = c0238a2.f5206b;
                    ListIterator listIterator2 = fVar2.listIterator(fVar2.size());
                    while (true) {
                        if (listIterator2.hasPrevious()) {
                            obj3 = listIterator2.previous();
                            if (((q) obj3).isEnabled()) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                    qVar2 = (q) obj3;
                }
                if (qVar2 != null) {
                    qVar2.handleOnBackProgressed(backEvent2);
                }
                break;
        }
        return C0297i.f5732a;
    }
}
