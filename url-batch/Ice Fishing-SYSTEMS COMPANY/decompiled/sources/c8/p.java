package c8;

import java.util.LinkedHashMap;
import q7.C4933b;
import x7.AbstractC5217a;
import x7.AbstractC5219c;

/* loaded from: classes2.dex */
public final class p extends AbstractC5219c {

    /* renamed from: n, reason: collision with root package name */
    public C4933b f5782n;

    /* renamed from: u, reason: collision with root package name */
    public G1.a f5783u;

    /* renamed from: v, reason: collision with root package name */
    public LinkedHashMap f5784v;

    /* renamed from: w, reason: collision with root package name */
    public String f5785w;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f5786x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ G1.a f5787y;

    /* renamed from: z, reason: collision with root package name */
    public int f5788z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(G1.a aVar, AbstractC5217a abstractC5217a) {
        super(abstractC5217a);
        this.f5787y = aVar;
    }

    @Override // x7.AbstractC5217a
    public final Object invokeSuspend(Object obj) {
        this.f5786x = obj;
        this.f5788z |= Integer.MIN_VALUE;
        return G1.a.a(this.f5787y, null, this);
    }
}
