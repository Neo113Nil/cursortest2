package D;

import java.io.FileOutputStream;

/* loaded from: classes.dex */
public final class b0 extends y0.b {

    /* renamed from: h, reason: collision with root package name */
    public FileOutputStream f170h;

    /* renamed from: i, reason: collision with root package name */
    public FileOutputStream f171i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f172j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ c0 f173k;

    /* renamed from: l, reason: collision with root package name */
    public int f174l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(c0 c0Var, y0.b bVar) {
        super(bVar);
        this.f173k = c0Var;
    }

    @Override // y0.b
    public final Object l(Object obj) {
        this.f172j = obj;
        this.f174l |= Integer.MIN_VALUE;
        return this.f173k.b(null, this);
    }
}
