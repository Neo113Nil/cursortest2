package F;

import java.io.FileOutputStream;

/* loaded from: classes.dex */
public final class Z extends I0.b {

    /* renamed from: h, reason: collision with root package name */
    public FileOutputStream f332h;

    /* renamed from: i, reason: collision with root package name */
    public FileOutputStream f333i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f334j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ a0 f335k;

    /* renamed from: l, reason: collision with root package name */
    public int f336l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(a0 a0Var, I0.b bVar) {
        super(bVar);
        this.f335k = a0Var;
    }

    @Override // I0.b
    public final Object m(Object obj) {
        this.f334j = obj;
        this.f336l |= Integer.MIN_VALUE;
        return this.f335k.b(this, null);
    }
}
