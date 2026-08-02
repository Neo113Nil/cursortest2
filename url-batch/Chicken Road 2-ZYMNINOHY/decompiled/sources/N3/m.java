package N3;

import java.io.IOException;

/* loaded from: classes.dex */
public final class m extends J3.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q f1867e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1868f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ T3.g f1869g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1870h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str, q qVar, int i4, T3.g gVar, int i5, boolean z) {
        super(str, true);
        this.f1867e = qVar;
        this.f1868f = i4;
        this.f1869g = gVar;
        this.f1870h = i5;
    }

    @Override // J3.a
    public final long a() {
        try {
            C c4 = this.f1867e.f1890k;
            T3.g gVar = this.f1869g;
            int i4 = this.f1870h;
            c4.getClass();
            gVar.skip(i4);
            this.f1867e.f1899w.s(this.f1868f, EnumC0078b.CANCEL);
            synchronized (this.f1867e) {
                this.f1867e.f1901y.remove(Integer.valueOf(this.f1868f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
