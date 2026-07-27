package k3;

import java.util.LinkedHashMap;
import y2.AbstractC1327b;

/* loaded from: classes.dex */
public final class o extends E2.c {

    /* renamed from: j, reason: collision with root package name */
    public AbstractC1327b f7457j;

    /* renamed from: k, reason: collision with root package name */
    public p f7458k;

    /* renamed from: l, reason: collision with root package name */
    public LinkedHashMap f7459l;

    /* renamed from: m, reason: collision with root package name */
    public String f7460m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f7461n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ p f7462o;

    /* renamed from: p, reason: collision with root package name */
    public int f7463p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, E2.a aVar) {
        super(aVar);
        this.f7462o = pVar;
    }

    @Override // E2.a
    public final Object l(Object obj) {
        this.f7461n = obj;
        this.f7463p |= Integer.MIN_VALUE;
        return p.a(this.f7462o, null, this);
    }
}
