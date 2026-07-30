package y4;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class w extends X5.c {

    /* renamed from: d, reason: collision with root package name */
    public Set f8637d;

    /* renamed from: e, reason: collision with root package name */
    public Map f8638e;

    /* renamed from: i, reason: collision with root package name */
    public Iterator f8639i;

    /* renamed from: l, reason: collision with root package name */
    public T.d f8640l;

    /* renamed from: m, reason: collision with root package name */
    public int f8641m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f8642n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ K f8643o;

    /* renamed from: p, reason: collision with root package name */
    public int f8644p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(K k7, X5.c cVar) {
        super(cVar);
        this.f8643o = k7;
    }

    @Override // X5.a
    public final Object invokeSuspend(Object obj) {
        this.f8642n = obj;
        this.f8644p |= Integer.MIN_VALUE;
        return K.g(this.f8643o, null, this);
    }
}
