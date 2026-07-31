package f3;

import q5.AbstractC0607c;
import u0.C0675e;

/* renamed from: f3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0371d extends AbstractC0607c {

    /* renamed from: f, reason: collision with root package name */
    public C0675e f4208f;

    /* renamed from: g, reason: collision with root package name */
    public Object f4209g;

    /* renamed from: h, reason: collision with root package name */
    public String f4210h;

    /* renamed from: i, reason: collision with root package name */
    public V3.a f4211i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f4212j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0675e f4213k;

    /* renamed from: l, reason: collision with root package name */
    public int f4214l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0371d(C0675e c0675e, AbstractC0607c abstractC0607c) {
        super(abstractC0607c);
        this.f4213k = c0675e;
    }

    @Override // q5.AbstractC0605a
    public final Object invokeSuspend(Object obj) {
        this.f4212j = obj;
        this.f4214l |= Integer.MIN_VALUE;
        return this.f4213k.i(null, null, null, false, this);
    }
}
