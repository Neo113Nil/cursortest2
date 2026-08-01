package c2;

import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class y implements Comparator {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1703d;

    public /* synthetic */ y(int i3) {
        this.f1703d = i3;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f1703d) {
            case 0:
                g0 g0Var = (g0) obj;
                g0 g0Var2 = (g0) obj2;
                float f3 = g0Var.T.f1606p.R;
                float f10 = g0Var2.T.f1606p.R;
                return f3 == f10 ? Intrinsics.b(g0Var.t(), g0Var2.t()) : Float.compare(f3, f10);
            case 1:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i3 = 0; i3 < bArr.length; i3++) {
                    byte b10 = bArr[i3];
                    byte b11 = bArr2[i3];
                    if (b10 != b11) {
                        return b10 - b11;
                    }
                }
                return 0;
            case 2:
                return Intrinsics.b(((n0.n0) obj).f6763b, ((n0.n0) obj2).f6763b);
            default:
                IntRange intRange = (IntRange) obj;
                IntRange intRange2 = (IntRange) obj2;
                return (intRange.f5600e - intRange.f5599d) - (intRange2.f5600e - intRange2.f5599d);
        }
    }
}
