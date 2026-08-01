package q0;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f3127a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final f f3128b;

    /* renamed from: c, reason: collision with root package name */
    public f0.c f3129c;
    public f0.c d;

    /* renamed from: e, reason: collision with root package name */
    public int f3130e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3131f;

    public c(f fVar, ArrayList arrayList) {
        f0.c cVar = f0.c.f1414e;
        this.f3129c = cVar;
        this.d = cVar;
        a(arrayList, false);
        a(arrayList, true);
        ArrayList arrayList2 = fVar.f3137b;
        if (!arrayList2.contains(this)) {
            arrayList2.add(this);
            f0.c cVar2 = fVar.f3138c;
            f0.c cVar3 = fVar.d;
            this.f3129c = cVar2;
            this.d = cVar3;
            c();
            b(fVar.f3139e);
        }
        this.f3128b = fVar;
    }

    public final void a(List list, boolean z4) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            a aVar = (a) list.get(i);
            aVar.getClass();
            if (true == z4) {
                c cVar = aVar.f3120c;
                if (cVar != null) {
                    throw new IllegalStateException(aVar + " (" + (i + 1) + "/" + size + ") is already controlled by " + cVar + " but is still added to " + this);
                }
                aVar.f3120c = this;
                this.f3127a.add(aVar);
            }
        }
    }

    public final void b(int i) {
        ArrayList arrayList = this.f3127a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            a aVar = (a) arrayList.get(size);
            if (!aVar.d && aVar.f3121e != i) {
                aVar.f3121e = i;
                throw null;
            }
        }
    }

    public final void c() {
        ArrayList arrayList = this.f3127a;
        int size = arrayList.size() - 1;
        if (size < 0) {
            return;
        }
        a aVar = (a) arrayList.get(size);
        f0.c cVar = this.f3129c;
        f0.c cVar2 = this.d;
        aVar.f3118a = cVar;
        aVar.f3119b = cVar2;
        throw null;
    }
}
