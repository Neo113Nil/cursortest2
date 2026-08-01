package a;

import java.util.ListIterator;

/* loaded from: classes.dex */
public final class s extends X0.g implements W0.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f931b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f932c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(int i, Object obj) {
        super(1);
        this.f931b = i;
        this.f932c = obj;
    }

    @Override // W0.l
    public final Object c(Object obj) {
        Object obj2;
        Object obj3;
        switch (this.f931b) {
            case 0:
                X0.f.e((C0041b) obj, "backEvent");
                C0039B c0039b = (C0039B) this.f932c;
                O0.f fVar = c0039b.f894b;
                ListIterator listIterator = fVar.listIterator(fVar.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        obj2 = listIterator.previous();
                        if (((androidx.fragment.app.C) obj2).f1195a) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                androidx.fragment.app.C c2 = (androidx.fragment.app.C) obj2;
                if (c0039b.f895c != null) {
                    c0039b.a();
                }
                c0039b.f895c = c2;
                return N0.f.f677c;
            case 1:
                X0.f.e((C0041b) obj, "backEvent");
                C0039B c0039b2 = (C0039B) this.f932c;
                if (c0039b2.f895c == null) {
                    O0.f fVar2 = c0039b2.f894b;
                    ListIterator listIterator2 = fVar2.listIterator(fVar2.size());
                    while (true) {
                        if (listIterator2.hasPrevious()) {
                            obj3 = listIterator2.previous();
                            if (((androidx.fragment.app.C) obj3).f1195a) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                }
                return N0.f.f677c;
            default:
                return obj == ((O0.d) this.f932c) ? "(this Collection)" : String.valueOf(obj);
        }
    }
}
