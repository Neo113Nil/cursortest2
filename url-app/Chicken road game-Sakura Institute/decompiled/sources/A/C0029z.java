package A;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import l0.C0800A;
import l0.C0811i;
import w2.C1294c;
import y2.AbstractC1343r;

/* renamed from: A.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0029z extends E2.i implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public int f207i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f208j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C1294c f209k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0016l f210l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ w.Y f211m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0029z(C1294c c1294c, C0016l c0016l, w.Y y4, C2.a aVar) {
        super(2, aVar);
        this.f209k = c1294c;
        this.f210l = c0016l;
        this.f211m = y4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((C0029z) j((C2.a) obj2, (C0800A) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        C0029z c0029z = new C0029z(this.f209k, this.f210l, this.f211m, aVar);
        c0029z.f208j = obj;
        return c0029z;
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, java.util.List] */
    @Override // E2.a
    public final Object l(Object obj) {
        C0800A c0800a;
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f207i;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            c0800a = (C0800A) this.f208j;
            this.f208j = c0800a;
            this.f207i = 1;
            obj = u3.d.i(c0800a, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2 && i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1343r.b(obj);
                return Unit.f7487a;
            }
            c0800a = (C0800A) this.f208j;
            AbstractC1343r.b(obj);
        }
        C0811i c0811i = (C0811i) obj;
        if (u3.d.K(c0811i) && (c0811i.f7908b & 33) != 0) {
            ?? r2 = c0811i.f7907a;
            int size = r2.size();
            for (int i4 = 0; i4 < size; i4++) {
                if (!((l0.s) r2.get(i4)).b()) {
                }
            }
            this.f208j = null;
            this.f207i = 2;
            if (u3.d.m(c0800a, this.f209k, this.f210l, c0811i, this) == aVar) {
                return aVar;
            }
            return Unit.f7487a;
        }
        if (!u3.d.K(c0811i)) {
            this.f208j = null;
            this.f207i = 3;
            if (u3.d.n(c0800a, this.f211m, c0811i, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f7487a;
    }
}
