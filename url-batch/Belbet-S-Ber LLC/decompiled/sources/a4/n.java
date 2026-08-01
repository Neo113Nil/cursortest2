package a4;

import java.io.IOException;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class n extends w3.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r f189e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f190f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g4.f f191g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(String str, r rVar, int i, g4.f fVar, int i4, boolean z4) {
        super(str, true);
        this.f189e = rVar;
        this.f190f = i;
        this.f191g = fVar;
        this.h = i4;
    }

    @Override // w3.a
    public final long a() {
        try {
            d0 d0Var = this.f189e.f208p;
            g4.f fVar = this.f191g;
            int i = this.h;
            d0Var.getClass();
            fVar.skip(i);
            this.f189e.B.s(this.f190f, 9);
            synchronized (this.f189e) {
                this.f189e.D.remove(Integer.valueOf(this.f190f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
