package P;

import java.io.FileOutputStream;

/* loaded from: classes.dex */
public final class a0 extends X5.c {

    /* renamed from: d, reason: collision with root package name */
    public FileOutputStream f2060d;

    /* renamed from: e, reason: collision with root package name */
    public FileOutputStream f2061e;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f2062i;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b0 f2063l;

    /* renamed from: m, reason: collision with root package name */
    public int f2064m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(b0 b0Var, X5.c cVar) {
        super(cVar);
        this.f2063l = b0Var;
    }

    @Override // X5.a
    public final Object invokeSuspend(Object obj) {
        this.f2062i = obj;
        this.f2064m |= Integer.MIN_VALUE;
        return this.f2063l.b(null, this);
    }
}
