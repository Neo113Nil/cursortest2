package B0;

import G.O;
import java.util.Comparator;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import s0.C1117C;

/* loaded from: classes.dex */
public final /* synthetic */ class t implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f943a;

    public /* synthetic */ t(int i2) {
        this.f943a = i2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f943a) {
            case 0:
                Pair pair = (Pair) obj;
                Pair pair2 = (Pair) obj2;
                return (((Number) pair.f7486e).intValue() - ((Number) pair.f7485d).intValue()) - (((Number) pair2.f7486e).intValue() - ((Number) pair2.f7485d).intValue());
            case 1:
                return Intrinsics.e(((O) obj).f2728b, ((O) obj2).f2728b);
            case 2:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i2 = 0; i2 < bArr.length; i2++) {
                    byte b4 = bArr[i2];
                    byte b5 = bArr2[i2];
                    if (b4 != b5) {
                        return b4 - b5;
                    }
                }
                return 0;
            case 3:
                r0.E e4 = (r0.E) obj;
                r0.E e5 = (r0.E) obj2;
                float f4 = e4.f9584C.f9691r.f9651E;
                float f5 = e5.f9584C.f9691r.f9651E;
                return f4 == f5 ? Intrinsics.e(e4.t(), e5.t()) : Float.compare(f4, f5);
            default:
                return ((Number) C1117C.f9993e.h(obj, obj2)).intValue();
        }
    }
}
