package o;

import java.util.concurrent.CancellationException;
import l.w1;
import l.x1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class j extends j6.i implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public r6.s f6651g;

    /* renamed from: h, reason: collision with root package name */
    public l.l f6652h;

    /* renamed from: i, reason: collision with root package name */
    public int f6653i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f6654j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ k f6655k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b1 f6656l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(float f9, k kVar, b1 b1Var, h6.d dVar) {
        super(2, dVar);
        this.f6654j = f9;
        this.f6655k = kVar;
        this.f6656l = b1Var;
    }

    @Override // j6.a
    public final h6.d create(Object obj, h6.d dVar) {
        return new j(this.f6654j, this.f6655k, this.f6656l, dVar);
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        return ((j) create((c7.x) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
    }

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        float f9;
        l.l lVar;
        r6.s sVar;
        int i7 = this.f6653i;
        if (i7 == 0) {
            d6.a.e(obj);
            f9 = this.f6654j;
            if (Math.abs(f9) > 1.0f) {
                r6.s sVar2 = new r6.s();
                sVar2.f7965f = f9;
                r6.s sVar3 = new r6.s();
                w1 w1Var = x1.f5722a;
                lVar = new l.l(w1Var, Float.valueOf(0.0f), new l.m(f9), Long.MIN_VALUE, Long.MIN_VALUE, false);
                try {
                    k kVar = this.f6655k;
                    l.w wVar = kVar.f6662a;
                    l.a aVar = new l.a(sVar3, this.f6656l, sVar2, kVar, 2);
                    this.f6651g = sVar2;
                    this.f6652h = lVar;
                    this.f6653i = 1;
                    Object b9 = l.e.b(lVar, new l.v(wVar, w1Var, lVar.f5563g.getValue(), lVar.f5564h), Long.MIN_VALUE, aVar, this);
                    Object obj2 = i6.a.f4956f;
                    if (b9 != obj2) {
                        b9 = d6.z.f2639a;
                    }
                    if (b9 == obj2) {
                        return obj2;
                    }
                    sVar = sVar2;
                } catch (CancellationException unused) {
                    sVar = sVar2;
                    sVar.f7965f = ((Number) lVar.f5562f.f5703b.f(lVar.f5564h)).floatValue();
                    f9 = sVar.f7965f;
                    return new Float(f9);
                }
            }
            return new Float(f9);
        }
        if (i7 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        lVar = this.f6652h;
        sVar = this.f6651g;
        try {
            d6.a.e(obj);
        } catch (CancellationException unused2) {
            sVar.f7965f = ((Number) lVar.f5562f.f5703b.f(lVar.f5564h)).floatValue();
            f9 = sVar.f7965f;
            return new Float(f9);
        }
        f9 = sVar.f7965f;
        return new Float(f9);
    }
}
