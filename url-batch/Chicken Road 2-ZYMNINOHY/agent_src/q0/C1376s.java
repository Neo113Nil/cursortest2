package q0;

import a.AbstractC0124a;
import android.net.Uri;
import java.util.Map;
import kotlin.KotlinVersion;

/* renamed from: q0.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1376s implements Y.h {

    /* renamed from: a, reason: collision with root package name */
    public final Y.h f15062a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15063b;

    /* renamed from: c, reason: collision with root package name */
    public final Q f15064c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f15065d;

    /* renamed from: e, reason: collision with root package name */
    public int f15066e;

    public C1376s(Y.h hVar, int i4, Q q4) {
        AbstractC0124a.h(i4 > 0);
        this.f15062a = hVar;
        this.f15063b = i4;
        this.f15064c = q4;
        this.f15065d = new byte[1];
        this.f15066e = i4;
    }

    @Override // Y.h
    public final Uri B() {
        return this.f15062a.B();
    }

    @Override // Y.h
    public final long b(Y.k kVar) {
        throw new UnsupportedOperationException();
    }

    @Override // Y.h
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // T.InterfaceC0090h
    public final int read(byte[] bArr, int i4, int i5) {
        int i6 = this.f15066e;
        Y.h hVar = this.f15062a;
        if (i6 == 0) {
            byte[] bArr2 = this.f15065d;
            int i7 = 0;
            if (hVar.read(bArr2, 0, 1) != -1) {
                int i8 = (bArr2[0] & KotlinVersion.MAX_COMPONENT_VALUE) << 4;
                if (i8 != 0) {
                    byte[] bArr3 = new byte[i8];
                    int i9 = i8;
                    while (i9 > 0) {
                        int read = hVar.read(bArr3, i7, i9);
                        if (read != -1) {
                            i7 += read;
                            i9 -= read;
                        }
                    }
                    while (i8 > 0 && bArr3[i8 - 1] == 0) {
                        i8--;
                    }
                    if (i8 > 0) {
                        W.u uVar = new W.u(i8, bArr3);
                        Q q4 = this.f15064c;
                        long max = !q4.f14875l ? q4.f14872i : Math.max(q4.f14876m.s(true), q4.f14872i);
                        int a3 = uVar.a();
                        y0.F f4 = q4.f14874k;
                        f4.getClass();
                        f4.a(a3, uVar);
                        f4.e(max, 1, a3, 0, null);
                        q4.f14875l = true;
                    }
                }
                this.f15066e = this.f15063b;
            }
            return -1;
        }
        int read2 = hVar.read(bArr, i4, Math.min(this.f15066e, i5));
        if (read2 != -1) {
            this.f15066e -= read2;
        }
        return read2;
    }

    @Override // Y.h
    public final Map t() {
        return this.f15062a.t();
    }

    @Override // Y.h
    public final void y(Y.A a3) {
        a3.getClass();
        this.f15062a.y(a3);
    }
}
