package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Comparator;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class f6 implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ f6(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return Intrinsics.b(((fz0) obj2).a, ((fz0) obj).a);
            case 1:
                return Intrinsics.b(((va0) obj).b, ((va0) obj2).b);
            case 2:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i = 0; i < bArr.length; i++) {
                    byte b = bArr[i];
                    byte b2 = bArr2[i];
                    if (b != b2) {
                        return b - b2;
                    }
                }
                return 0;
            case 3:
                Pair pair = (Pair) obj;
                Pair pair2 = (Pair) obj2;
                return (((Number) pair.e).intValue() - ((Number) pair.d).intValue()) - (((Number) pair2.e).intValue() - ((Number) pair2.d).intValue());
            case 4:
                jd0 jd0Var = (jd0) obj;
                jd0 jd0Var2 = (jd0) obj2;
                float f = jd0Var.K.p.H;
                float f2 = jd0Var2.K.p.H;
                return f == f2 ? Intrinsics.b(jd0Var.u(), jd0Var2.u()) : Float.compare(f, f2);
            default:
                return Intrinsics.b(((sf0) obj).a, ((sf0) obj2).a);
        }
    }
}
