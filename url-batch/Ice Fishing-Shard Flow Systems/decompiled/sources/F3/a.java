package F3;

import B.f;
import X5.c;
import kotlin.Pair;

/* loaded from: classes.dex */
public final class a extends c {

    /* renamed from: d, reason: collision with root package name */
    public f f757d;

    /* renamed from: e, reason: collision with root package name */
    public Pair[] f758e;

    /* renamed from: i, reason: collision with root package name */
    public Pair[] f759i;

    /* renamed from: l, reason: collision with root package name */
    public String f760l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f761m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ f f762n;

    /* renamed from: o, reason: collision with root package name */
    public int f763o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(f fVar, c cVar) {
        super(cVar);
        this.f762n = fVar;
    }

    @Override // X5.a
    public final Object invokeSuspend(Object obj) {
        this.f761m = obj;
        this.f763o |= Integer.MIN_VALUE;
        return this.f762n.j(this);
    }
}
