package androidx.compose.ui.graphics;

import android.graphics.Shader;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Brush.kt */
@Immutable
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001J!\u0010\b\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001a\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/graphics/SweepGradient;", "Landroidx/compose/ui/graphics/ShaderBrush;", "Landroidx/compose/ui/geometry/Size;", "size", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "createShader-uvyYCjk", "(J)Landroid/graphics/Shader;", "createShader", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/geometry/Offset;", "center", "J", "", "Landroidx/compose/ui/graphics/Color;", "colors", "Ljava/util/List;", "", "stops", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SweepGradient extends ShaderBrush {
    private final long center;
    private final List colors;
    private final List stops;

    @Override // androidx.compose.ui.graphics.ShaderBrush
    /* renamed from: createShader-uvyYCjk */
    public Shader mo1428createShaderuvyYCjk(long size) {
        long Offset;
        if (OffsetKt.m1311isUnspecifiedk4lQ0M(this.center)) {
            Offset = SizeKt.m1342getCenteruvyYCjk(size);
        } else {
            Offset = OffsetKt.Offset(Offset.m1297getXimpl(this.center) == Float.POSITIVE_INFINITY ? Size.m1335getWidthimpl(size) : Offset.m1297getXimpl(this.center), Offset.m1298getYimpl(this.center) == Float.POSITIVE_INFINITY ? Size.m1333getHeightimpl(size) : Offset.m1298getYimpl(this.center));
        }
        return ShaderKt.m1577SweepGradientShader9KIMszo(Offset, this.colors, this.stops);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SweepGradient)) {
            return false;
        }
        SweepGradient sweepGradient = (SweepGradient) other;
        return Offset.m1294equalsimpl0(this.center, sweepGradient.center) && Intrinsics.areEqual(this.colors, sweepGradient.colors) && Intrinsics.areEqual(this.stops, sweepGradient.stops);
    }

    public int hashCode() {
        int m1299hashCodeimpl = ((Offset.m1299hashCodeimpl(this.center) * 31) + this.colors.hashCode()) * 31;
        List list = this.stops;
        return m1299hashCodeimpl + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        String str;
        if (OffsetKt.m1310isSpecifiedk4lQ0M(this.center)) {
            str = "center=" + ((Object) Offset.m1304toStringimpl(this.center)) + ", ";
        } else {
            str = "";
        }
        return "SweepGradient(" + str + "colors=" + this.colors + ", stops=" + this.stops + ')';
    }
}
