package je;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class i extends nd.c {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f5172d;

    /* renamed from: e, reason: collision with root package name */
    public int f5173e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ j f5174i;

    /* renamed from: r, reason: collision with root package name */
    public f f5175r;

    /* renamed from: s, reason: collision with root package name */
    public Serializable f5176s;

    /* renamed from: t, reason: collision with root package name */
    public int f5177t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, ld.a aVar) {
        super(aVar);
        this.f5174i = jVar;
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        this.f5172d = obj;
        this.f5173e |= Integer.MIN_VALUE;
        return this.f5174i.c(null, this);
    }
}
