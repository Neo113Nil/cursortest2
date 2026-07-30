package P;

import java.io.FileInputStream;

/* loaded from: classes.dex */
public final class S extends X5.c {

    /* renamed from: d, reason: collision with root package name */
    public Object f2029d;

    /* renamed from: e, reason: collision with root package name */
    public FileInputStream f2030e;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f2031i;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ T f2032l;

    /* renamed from: m, reason: collision with root package name */
    public int f2033m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(T t6, X5.c cVar) {
        super(cVar);
        this.f2032l = t6;
    }

    @Override // X5.a
    public final Object invokeSuspend(Object obj) {
        this.f2031i = obj;
        this.f2033m |= Integer.MIN_VALUE;
        return T.a(this.f2032l, this);
    }
}
