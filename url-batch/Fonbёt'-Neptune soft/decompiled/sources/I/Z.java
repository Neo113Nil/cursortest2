package I;

import java.io.FileOutputStream;

/* loaded from: classes.dex */
public final class Z extends J0.b {

    /* renamed from: h, reason: collision with root package name */
    public FileOutputStream f613h;

    /* renamed from: i, reason: collision with root package name */
    public FileOutputStream f614i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f615j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ a0 f616k;

    /* renamed from: l, reason: collision with root package name */
    public int f617l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(a0 a0Var, J0.b bVar) {
        super(bVar);
        this.f616k = a0Var;
    }

    @Override // J0.b
    public final Object l(Object obj) {
        this.f615j = obj;
        this.f617l |= Integer.MIN_VALUE;
        return this.f616k.b(null, this);
    }
}
