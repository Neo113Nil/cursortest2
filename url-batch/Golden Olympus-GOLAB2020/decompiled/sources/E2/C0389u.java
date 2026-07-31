package E2;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: E2.u, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0389u extends C0383n {

    /* renamed from: c, reason: collision with root package name */
    private final boolean f622c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0389u(Q writer, boolean z4) {
        super(writer);
        Intrinsics.checkNotNullParameter(writer, "writer");
        this.f622c = z4;
    }

    @Override // E2.C0383n
    public void d(byte b4) {
        boolean z4 = this.f622c;
        String e4 = W1.r.e(W1.r.b(b4));
        if (z4) {
            m(e4);
        } else {
            j(e4);
        }
    }

    @Override // E2.C0383n
    public void h(int i4) {
        boolean z4 = this.f622c;
        String a4 = r.a(W1.t.b(i4));
        if (z4) {
            m(a4);
        } else {
            j(a4);
        }
    }

    @Override // E2.C0383n
    public void i(long j4) {
        String a4;
        String a5;
        boolean z4 = this.f622c;
        long b4 = W1.v.b(j4);
        if (z4) {
            a5 = AbstractC0388t.a(b4, 10);
            m(a5);
        } else {
            a4 = AbstractC0388t.a(b4, 10);
            j(a4);
        }
    }

    @Override // E2.C0383n
    public void k(short s4) {
        boolean z4 = this.f622c;
        String e4 = W1.y.e(W1.y.b(s4));
        if (z4) {
            m(e4);
        } else {
            j(e4);
        }
    }
}
