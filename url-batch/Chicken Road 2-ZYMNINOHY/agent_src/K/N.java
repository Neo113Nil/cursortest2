package K;

import java.io.FileInputStream;

/* loaded from: classes.dex */
public final class N extends h3.c {

    /* renamed from: a, reason: collision with root package name */
    public Object f1285a;

    /* renamed from: b, reason: collision with root package name */
    public FileInputStream f1286b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f1287c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ O f1288d;

    /* renamed from: e, reason: collision with root package name */
    public int f1289e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(O o, h3.c cVar) {
        super(cVar);
        this.f1288d = o;
    }

    @Override // h3.AbstractC0448a
    public final Object invokeSuspend(Object obj) {
        this.f1287c = obj;
        this.f1289e |= Integer.MIN_VALUE;
        return O.a(this.f1288d, this);
    }
}
