package g1;

import N2.v;

/* renamed from: g1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0401h extends R1.c {

    /* renamed from: d, reason: collision with root package name */
    public C0402i f4820d;

    /* renamed from: e, reason: collision with root package name */
    public Object f4821e;

    /* renamed from: f, reason: collision with root package name */
    public v f4822f;

    /* renamed from: g, reason: collision with root package name */
    public Object f4823g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f4824h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0402i f4825i;

    /* renamed from: j, reason: collision with root package name */
    public int f4826j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0401h(C0402i c0402i, R1.c cVar) {
        super(cVar);
        this.f4825i = c0402i;
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        this.f4824h = obj;
        this.f4826j |= Integer.MIN_VALUE;
        return this.f4825i.b(null, this);
    }
}
