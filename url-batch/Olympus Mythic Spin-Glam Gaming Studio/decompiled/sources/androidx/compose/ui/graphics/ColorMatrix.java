package androidx.compose.ui.graphics;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ColorMatrix.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0005\b\u0087@\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\t\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000e\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\u0088\u0001\u0010\u0092\u0001\u00020\u000fø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/graphics/ColorMatrix;", "", "", "toString-impl", "([F)Ljava/lang/String;", "toString", "", "hashCode-impl", "([F)I", "hashCode", "other", "", "equals-impl", "([FLjava/lang/Object;)Z", "equals", "", "values", "[F", "getValues", "()[F", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ColorMatrix {
    private final float[] values;

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1472equalsimpl(float[] fArr, Object obj) {
        return (obj instanceof ColorMatrix) && Intrinsics.areEqual(fArr, ((ColorMatrix) obj).getValues());
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1473hashCodeimpl(float[] fArr) {
        return Arrays.hashCode(fArr);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1474toStringimpl(float[] fArr) {
        return "ColorMatrix(values=" + Arrays.toString(fArr) + ')';
    }

    public boolean equals(Object obj) {
        return m1472equalsimpl(this.values, obj);
    }

    public int hashCode() {
        return m1473hashCodeimpl(this.values);
    }

    public String toString() {
        return m1474toStringimpl(this.values);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ float[] getValues() {
        return this.values;
    }
}
