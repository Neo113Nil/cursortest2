package N2;

import T2.C0231f;
import java.io.IOException;

/* loaded from: classes.dex */
public final class m extends J2.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p f3628e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f3629f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0231f f3630g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f3631h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str, p pVar, int i3, C0231f c0231f, int i4, boolean z3) {
        super(str, true);
        this.f3628e = pVar;
        this.f3629f = i3;
        this.f3630g = c0231f;
        this.f3631h = i4;
    }

    @Override // J2.a
    public final long a() {
        try {
            B b3 = this.f3628e.f3650n;
            C0231f c0231f = this.f3630g;
            int i3 = this.f3631h;
            b3.getClass();
            c0231f.v(i3);
            this.f3628e.f3662z.l(this.f3629f, 9);
            synchronized (this.f3628e) {
                this.f3628e.f3639B.remove(Integer.valueOf(this.f3629f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
