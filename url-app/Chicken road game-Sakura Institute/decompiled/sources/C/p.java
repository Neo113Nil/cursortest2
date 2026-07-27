package C;

import G.C0192d;
import G.C0205j0;
import G.W;
import W2.C0292n;
import kotlin.Unit;
import l.AbstractC0779e;
import l.C0778d;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public Y.c f1109a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1110b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1111c;

    /* renamed from: d, reason: collision with root package name */
    public Float f1112d;

    /* renamed from: e, reason: collision with root package name */
    public Y.c f1113e;

    /* renamed from: f, reason: collision with root package name */
    public final C0778d f1114f = AbstractC0779e.a(0.0f);

    /* renamed from: g, reason: collision with root package name */
    public final C0778d f1115g = AbstractC0779e.a(0.0f);

    /* renamed from: h, reason: collision with root package name */
    public final C0778d f1116h = AbstractC0779e.a(0.0f);

    /* renamed from: i, reason: collision with root package name */
    public final C0292n f1117i;

    /* renamed from: j, reason: collision with root package name */
    public final C0205j0 f1118j;

    /* renamed from: k, reason: collision with root package name */
    public final C0205j0 f1119k;

    public p(Y.c cVar, float f4, boolean z4) {
        this.f1109a = cVar;
        this.f1110b = f4;
        this.f1111c = z4;
        C0292n c0292n = new C0292n(true);
        c0292n.R(null);
        this.f1117i = c0292n;
        Boolean bool = Boolean.FALSE;
        W w4 = W.f2779l;
        this.f1118j = C0192d.K(bool, w4);
        this.f1119k = C0192d.K(bool, w4);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0086 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(E2.c cVar) {
        i iVar;
        Object obj;
        int i2;
        p pVar;
        Object d4;
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i4 = iVar.f1096m;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                iVar.f1096m = i4 - Integer.MIN_VALUE;
                Object obj2 = iVar.f1094k;
                obj = D2.a.f2163d;
                i2 = iVar.f1096m;
                if (i2 != 0) {
                    AbstractC1343r.b(obj2);
                    iVar.f1093j = this;
                    iVar.f1096m = 1;
                    Object d5 = W2.B.d(new m(this, null), iVar);
                    if (d5 != obj) {
                        d5 = Unit.f7487a;
                    }
                    if (d5 == obj) {
                        return obj;
                    }
                    pVar = this;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            AbstractC1343r.b(obj2);
                            return Unit.f7487a;
                        }
                        pVar = iVar.f1093j;
                        AbstractC1343r.b(obj2);
                        iVar.f1093j = null;
                        iVar.f1096m = 3;
                        pVar.getClass();
                        d4 = W2.B.d(new o(pVar, null), iVar);
                        if (d4 != obj) {
                            d4 = Unit.f7487a;
                        }
                        if (d4 == obj) {
                            return obj;
                        }
                        return Unit.f7487a;
                    }
                    pVar = iVar.f1093j;
                    AbstractC1343r.b(obj2);
                }
                pVar.f1118j.setValue(Boolean.TRUE);
                iVar.f1093j = pVar;
                iVar.f1096m = 2;
                if (pVar.f1117i.h0(iVar) == obj) {
                    return obj;
                }
                iVar.f1093j = null;
                iVar.f1096m = 3;
                pVar.getClass();
                d4 = W2.B.d(new o(pVar, null), iVar);
                if (d4 != obj) {
                }
                if (d4 == obj) {
                }
                return Unit.f7487a;
            }
        }
        iVar = new i(this, cVar);
        Object obj22 = iVar.f1094k;
        obj = D2.a.f2163d;
        i2 = iVar.f1096m;
        if (i2 != 0) {
        }
        pVar.f1118j.setValue(Boolean.TRUE);
        iVar.f1093j = pVar;
        iVar.f1096m = 2;
        if (pVar.f1117i.h0(iVar) == obj) {
        }
        iVar.f1093j = null;
        iVar.f1096m = 3;
        pVar.getClass();
        d4 = W2.B.d(new o(pVar, null), iVar);
        if (d4 != obj) {
        }
        if (d4 == obj) {
        }
        return Unit.f7487a;
    }
}
