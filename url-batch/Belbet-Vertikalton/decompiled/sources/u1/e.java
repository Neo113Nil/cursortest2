package u1;

import b1.EnumC0098a;
import c1.AbstractC0106c;
import r1.N;

/* loaded from: classes.dex */
public final class e extends AbstractC0106c {

    /* renamed from: a, reason: collision with root package name */
    public f f4388a;

    /* renamed from: b, reason: collision with root package name */
    public c f4389b;

    /* renamed from: c, reason: collision with root package name */
    public h f4390c;

    /* renamed from: d, reason: collision with root package name */
    public N f4391d;
    public Object e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f4392f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f f4393g;

    /* renamed from: h, reason: collision with root package name */
    public int f4394h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, a1.d dVar) {
        super(dVar);
        this.f4393g = fVar;
    }

    @Override // c1.AbstractC0104a
    public final Object invokeSuspend(Object obj) {
        this.f4392f = obj;
        this.f4394h |= Integer.MIN_VALUE;
        this.f4393g.collect(null, this);
        return EnumC0098a.f2223a;
    }
}
