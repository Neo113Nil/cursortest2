package K;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class C extends h3.c {

    /* renamed from: a, reason: collision with root package name */
    public Object f1226a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1227b;

    /* renamed from: c, reason: collision with root package name */
    public Serializable f1228c;

    /* renamed from: d, reason: collision with root package name */
    public kotlin.jvm.internal.p f1229d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1230e;

    /* renamed from: f, reason: collision with root package name */
    public int f1231f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f1232g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ M f1233h;

    /* renamed from: i, reason: collision with root package name */
    public int f1234i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(M m4, h3.c cVar) {
        super(cVar);
        this.f1233h = m4;
    }

    @Override // h3.AbstractC0448a
    public final Object invokeSuspend(Object obj) {
        this.f1232g = obj;
        this.f1234i |= Integer.MIN_VALUE;
        return M.f(this.f1233h, false, this);
    }
}
