package androidx.compose.ui.graphics;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Matrix.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u0017\u0010\u0004\u001a\u00020\u0001*\u00020\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/graphics/Matrix;", "", "isIdentity-58bKbWc", "([F)Z", "isIdentity", "ui-graphics_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class MatrixKt {
    /* renamed from: isIdentity-58bKbWc, reason: not valid java name */
    public static final boolean m1527isIdentity58bKbWc(float[] isIdentity) {
        Intrinsics.checkNotNullParameter(isIdentity, "$this$isIdentity");
        int i = 0;
        while (i < 4) {
            int i2 = 0;
            while (i2 < 4) {
                if (isIdentity[(i * 4) + i2] != (i == i2 ? 1.0f : 0.0f)) {
                    return false;
                }
                i2++;
            }
            i++;
        }
        return true;
    }
}
