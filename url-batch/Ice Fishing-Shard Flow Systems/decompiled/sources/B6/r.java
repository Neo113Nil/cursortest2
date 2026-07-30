package B6;

import R5.AbstractC0162b;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class r extends X5.c {

    /* renamed from: d, reason: collision with root package name */
    public AbstractC0162b f238d;

    /* renamed from: e, reason: collision with root package name */
    public p f239e;

    /* renamed from: i, reason: collision with root package name */
    public LinkedHashMap f240i;

    /* renamed from: l, reason: collision with root package name */
    public String f241l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f242m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ p f243n;

    /* renamed from: o, reason: collision with root package name */
    public int f244o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(p pVar, X5.a aVar) {
        super(aVar);
        this.f243n = pVar;
    }

    @Override // X5.a
    public final Object invokeSuspend(Object obj) {
        this.f242m = obj;
        this.f244o |= Integer.MIN_VALUE;
        return p.a(this.f243n, null, this);
    }
}
