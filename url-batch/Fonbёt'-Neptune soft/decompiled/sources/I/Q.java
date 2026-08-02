package I;

import java.io.FileInputStream;

/* loaded from: classes.dex */
public final class Q extends J0.b {

    /* renamed from: h, reason: collision with root package name */
    public Object f581h;

    /* renamed from: i, reason: collision with root package name */
    public FileInputStream f582i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f583j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ S f584k;

    /* renamed from: l, reason: collision with root package name */
    public int f585l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(S s2, J0.b bVar) {
        super(bVar);
        this.f584k = s2;
    }

    @Override // J0.b
    public final Object l(Object obj) {
        this.f583j = obj;
        this.f585l |= Integer.MIN_VALUE;
        return S.a(this.f584k, this);
    }
}
