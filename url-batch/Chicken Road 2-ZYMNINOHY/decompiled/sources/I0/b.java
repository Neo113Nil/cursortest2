package I0;

import T.E;
import W.t;
import W.u;
import i2.AbstractC0457a;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b extends AbstractC0457a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f1123k;

    public static J0.a H(u uVar) {
        String u4 = uVar.u();
        u4.getClass();
        String u5 = uVar.u();
        u5.getClass();
        return new J0.a(u4, u5, uVar.t(), uVar.t(), Arrays.copyOfRange(uVar.f3351a, uVar.f3352b, uVar.f3353c));
    }

    @Override // i2.AbstractC0457a
    public final E n(H0.a aVar, ByteBuffer byteBuffer) {
        switch (this.f1123k) {
            case 0:
                if (byteBuffer.get() != 116) {
                    return null;
                }
                t tVar = new t(byteBuffer.limit(), byteBuffer.array());
                int i4 = 12;
                tVar.t(12);
                int f4 = (tVar.f() + tVar.i(12)) - 4;
                tVar.t(44);
                tVar.u(tVar.i(12));
                tVar.t(16);
                ArrayList arrayList = new ArrayList();
                while (tVar.f() < f4) {
                    tVar.t(48);
                    int i5 = tVar.i(8);
                    tVar.t(4);
                    int f5 = tVar.f() + tVar.i(i4);
                    String str = null;
                    String str2 = null;
                    while (tVar.f() < f5) {
                        int i6 = tVar.i(8);
                        int i7 = tVar.i(8);
                        int f6 = tVar.f() + i7;
                        if (i6 == 2) {
                            int i8 = tVar.i(16);
                            tVar.t(8);
                            if (i8 == 3) {
                                while (tVar.f() < f6) {
                                    int i9 = tVar.i(8);
                                    Charset charset = StandardCharsets.US_ASCII;
                                    byte[] bArr = new byte[i9];
                                    tVar.l(i9, bArr);
                                    String str3 = new String(bArr, charset);
                                    int i10 = tVar.i(8);
                                    for (int i11 = 0; i11 < i10; i11++) {
                                        tVar.u(tVar.i(8));
                                    }
                                    str = str3;
                                }
                            }
                        } else if (i6 == 21) {
                            Charset charset2 = StandardCharsets.US_ASCII;
                            byte[] bArr2 = new byte[i7];
                            tVar.l(i7, bArr2);
                            str2 = new String(bArr2, charset2);
                        }
                        tVar.q(f6 * 8);
                    }
                    tVar.q(f5 * 8);
                    if (str != null && str2 != null) {
                        arrayList.add(new a(i5, str.concat(str2)));
                    }
                    i4 = 12;
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                return new E(arrayList);
            default:
                return new E(H(new u(byteBuffer.limit(), byteBuffer.array())));
        }
    }
}
