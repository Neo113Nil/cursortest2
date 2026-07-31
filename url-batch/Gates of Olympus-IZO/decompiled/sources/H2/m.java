package H2;

import N2.C0150f;
import java.io.IOException;

/* loaded from: classes.dex */
public final class m extends D2.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p f1973e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1974f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0150f f1975g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1976h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str, p pVar, int i3, C0150f c0150f, int i4, boolean z3) {
        super(str, true);
        this.f1973e = pVar;
        this.f1974f = i3;
        this.f1975g = c0150f;
        this.f1976h = i4;
    }

    @Override // D2.a
    public final long a() {
        try {
            B b2 = this.f1973e.f1994n;
            C0150f c0150f = this.f1975g;
            int i3 = this.f1976h;
            b2.getClass();
            c0150f.x(i3);
            this.f1973e.f2005z.k(this.f1974f, 9);
            synchronized (this.f1973e) {
                this.f1973e.B.remove(Integer.valueOf(this.f1974f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
