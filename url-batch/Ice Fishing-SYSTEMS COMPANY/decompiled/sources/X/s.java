package X;

import O7.C0388m;
import x7.AbstractC5219c;

/* loaded from: classes.dex */
public final class s extends AbstractC5219c {

    /* renamed from: n, reason: collision with root package name */
    public Object f3586n;

    /* renamed from: u, reason: collision with root package name */
    public D f3587u;

    /* renamed from: v, reason: collision with root package name */
    public C0388m f3588v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f3589w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ D f3590x;

    /* renamed from: y, reason: collision with root package name */
    public int f3591y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(D d2, AbstractC5219c abstractC5219c) {
        super(abstractC5219c);
        this.f3590x = d2;
    }

    @Override // x7.AbstractC5217a
    public final Object invokeSuspend(Object obj) {
        this.f3589w = obj;
        this.f3591y |= Integer.MIN_VALUE;
        return D.a(this.f3590x, null, this);
    }
}
