package M7;

import r7.AbstractC4970a;

/* loaded from: classes2.dex */
public final /* synthetic */ class g implements E7.l {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1934n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ AbstractC4970a f1935u;

    public /* synthetic */ g(AbstractC4970a abstractC4970a, int i) {
        this.f1934n = i;
        this.f1935u = abstractC4970a;
    }

    @Override // E7.l
    public final Object invoke(Object obj) {
        switch (this.f1934n) {
            case 0:
                return ((h) this.f1935u).c(((Integer) obj).intValue());
            default:
                return obj == this.f1935u ? "(this Collection)" : String.valueOf(obj);
        }
    }
}
