package j3;

import java.io.IOException;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class m extends f3.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p f2436e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2437f;
    public final /* synthetic */ p3.f g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str, p pVar, int i4, p3.f fVar, int i5, boolean z3) {
        super(str, true);
        this.f2436e = pVar;
        this.f2437f = i4;
        this.g = fVar;
        this.h = i5;
    }

    @Override // f3.a
    public final long a() {
        try {
            b0 b0Var = this.f2436e.f2450p;
            p3.f fVar = this.g;
            int i4 = this.h;
            b0Var.getClass();
            fVar.skip(i4);
            this.f2436e.B.s(this.f2437f, 9);
            synchronized (this.f2436e) {
                this.f2436e.D.remove(Integer.valueOf(this.f2437f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
