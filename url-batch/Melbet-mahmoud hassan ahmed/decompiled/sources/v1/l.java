package v1;

import java.util.Arrays;
import o2.m0;
import r0.s1;

/* loaded from: classes.dex */
public abstract class l extends f {

    /* renamed from: j, reason: collision with root package name */
    private byte[] f22790j;

    /* renamed from: k, reason: collision with root package name */
    private volatile boolean f22791k;

    public l(n2.l lVar, n2.p pVar, int i7, s1 s1Var, int i8, Object obj, byte[] bArr) {
        super(lVar, pVar, i7, s1Var, i8, obj, -9223372036854775807L, -9223372036854775807L);
        l lVar2;
        byte[] bArr2;
        if (bArr == null) {
            bArr2 = m0.f19757f;
            lVar2 = this;
        } else {
            lVar2 = this;
            bArr2 = bArr;
        }
        lVar2.f22790j = bArr2;
    }

    private void i(int i7) {
        byte[] bArr = this.f22790j;
        if (bArr.length < i7 + 16384) {
            this.f22790j = Arrays.copyOf(bArr, bArr.length + 16384);
        }
    }

    @Override // n2.h0.e
    public final void a() {
        try {
            this.f22755i.b(this.f22748b);
            int i7 = 0;
            int i8 = 0;
            while (i7 != -1 && !this.f22791k) {
                i(i8);
                i7 = this.f22755i.read(this.f22790j, i8, 16384);
                if (i7 != -1) {
                    i8 += i7;
                }
            }
            if (!this.f22791k) {
                g(this.f22790j, i8);
            }
        } finally {
            n2.o.a(this.f22755i);
        }
    }

    @Override // n2.h0.e
    public final void c() {
        this.f22791k = true;
    }

    protected abstract void g(byte[] bArr, int i7);

    public byte[] h() {
        return this.f22790j;
    }
}
