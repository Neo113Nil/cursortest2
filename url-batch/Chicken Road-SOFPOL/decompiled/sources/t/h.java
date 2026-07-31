package t;

import java.util.ArrayList;
import u.h1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class h extends i6.h implements p6.e {

    /* renamed from: f, reason: collision with root package name */
    public int f6780f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f6781g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ j f6782h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar, g6.c cVar) {
        super(cVar);
        this.f6782h = jVar;
    }

    @Override // p6.e
    public final Object g(Object obj, Object obj2) {
        return ((h) l((g6.c) obj2, (q1.r) obj)).p(c6.m.f1757a);
    }

    @Override // i6.a
    public final g6.c l(g6.c cVar, Object obj) {
        h hVar = new h(this.f6782h, cVar);
        hVar.f6781g = obj;
        return hVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x004d, code lost:
    
        if (r12 != r4) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004f, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0036, code lost:
    
        if (r12 == r4) goto L16;
     */
    /* JADX WARN: Type inference failed for: r12v9, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x004d -> B:6:0x0050). Please report as a decompilation issue!!! */
    @Override // i6.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object p(Object obj) {
        q1.r rVar;
        Object obj2;
        int i = this.f6780f;
        j jVar = this.f6782h;
        h6.a aVar = h6.a.f3204d;
        if (i == 0) {
            s6.a.K(obj);
            rVar = (q1.r) this.f6781g;
            this.f6781g = rVar;
            this.f6780f = 1;
            obj = h1.a(rVar, (r3 & 1) != 0, q1.g.f5989e, this);
        } else if (i == 1) {
            rVar = (q1.r) this.f6781g;
            s6.a.K(obj);
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            rVar = (q1.r) this.f6781g;
            s6.a.K(obj);
            ?? r12 = ((q1.f) obj).f5986a;
            ArrayList arrayList = new ArrayList(r12.size());
            int size = r12.size();
            int i8 = 0;
            for (int i9 = 0; i9 < size; i9++) {
                Object obj3 = r12.get(i9);
                if (((q1.k) obj3).f5997d) {
                    arrayList.add(obj3);
                }
            }
            int size2 = arrayList.size();
            while (true) {
                if (i8 >= size2) {
                    obj2 = null;
                    break;
                }
                obj2 = arrayList.get(i8);
                if (m.a.s(((q1.k) obj2).f5994a, jVar.f6793h)) {
                    break;
                }
                i8++;
            }
            q1.k kVar = (q1.k) obj2;
            if (kVar == null) {
                kVar = (q1.k) d6.m.S(arrayList);
            }
            if (kVar != null) {
                jVar.f6793h = kVar.f5994a;
                jVar.f6787b = kVar.f5996c;
            }
            if (arrayList.isEmpty()) {
                jVar.f6793h = -1L;
                return c6.m.f1757a;
            }
            this.f6781g = rVar;
            this.f6780f = 2;
            obj = rVar.a(q1.g.f5989e, this);
        }
        q1.k kVar2 = (q1.k) obj;
        jVar.f6793h = kVar2.f5994a;
        jVar.f6787b = kVar2.f5996c;
        this.f6781g = rVar;
        this.f6780f = 2;
        obj = rVar.a(q1.g.f5989e, this);
    }
}
