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
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001J!\u0010\b\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u001d\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001d\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b \u0010!R\u001d\u0010$\u001a\u00020\u00028VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\"\u0010#\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006%"}, d2 = {"Landroidx/compose/ui/graphics/RadialGradient;", "Landroidx/compose/ui/graphics/ShaderBrush;", "Landroidx/compose/ui/geometry/Size;", "size", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "createShader-uvyYCjk", "(J)Landroid/graphics/Shader;", "createShader", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "", "Landroidx/compose/ui/graphics/Color;", "colors", "Ljava/util/List;", "", "stops", "Landroidx/compose/ui/geometry/Offset;", "center", "J", "radius", "F", "Landroidx/compose/ui/graphics/TileMode;", "tileMode", "I", "getIntrinsicSize-NH-jbRc", "()J", "intrinsicSize", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RadialGradient extends ShaderBrush {
    private final long center;
    private final List colors;
    private final float radius;
    private final List stops;
    private final int tileMode;

    @Override // androidx.compose.ui.graphics.Brush
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public long getIntrinsicSize() {
        float f = this.radius;
        if (Float.isInfinite(f) || Float.isNaN(f)) {
            return Size.INSTANCE.m1340getUnspecifiedNHjbRc();
        }
        float f2 = this.radius;
        float f3 = 2;
        return SizeKt.Size(f2 * f3, f2 * f3);
    }

    @Override // androidx.compose.ui.graphics.ShaderBrush
    /* renamed from: createShader-uvyYCjk */
    public Shader mo1428createShaderuvyYCjk(long size) {
        float m1335getWidthimpl;
        float m1333getHeightimpl;
        if (OffsetKt.m1311isUnspecifiedk4lQ0M(this.center)) {
            long m1342getCenteruvyYCjk = SizeKt.m1342getCenteruvyYCjk(size);
            m1335getWidthimpl = Offset.m1297getXimpl(m1342getCenteruvyYCjk);
            m1333getHeightimpl = Offset.m1298getYimpl(m1342getCenteruvyYCjk);
        } else {
            m1335getWidthimpl = Offset.m1297getXimpl(this.center) == Float.POSITIVE_INFINITY ? Size.m1335getWidthimpl(size) : Offset.m1297getXimpl(this.center);
            m1333getHeightimpl = Offset.m1298getYimpl(this.center) == Float.POSITIVE_INFINITY ? Size.m1333getHeightimpl(size) : Offset.m1298getYimpl(this.center);
        }
        List list = this.colors;
        List list2 = this.stops;
        long Offset = OffsetKt.Offset(m1335getWidthimpl, m1333getHeightimpl);
        float f = this.radius;
        return ShaderKt.m1576RadialGradientShader8uybcMk(Offset, f == Float.POSITIVE_INFINITY ? Size.m1334getMinDimensionimpl(size) / 2 : f, list, list2, this.tileMode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RadialGradient)) {
            return false;
        }
        RadialGradient radialGradient = (RadialGradient) other;
        return Intrinsics.areEqual(this.colors, radialGradient.colors) && Intrinsics.areEqual(this.stops, radialGradient.stops) && Offset.m1294equalsimpl0(this.center, radialGradient.center) && this.radius == radialGradient.radius && TileMode.m1609equalsimpl0(this.tileMode, radialGradient.tileMode);
    }

    public int hashCode() {
        int hashCode = this.colors.hashCode() * 31;
        List list = this.stops;
        return ((((((hashCode + (list != null ? list.hashCode() : 0)) * 31) + Offset.m1299hashCodeimpl(this.center)) * 31) + Float.hashCode(this.radius)) * 31) + TileMode.m1610hashCodeimpl(this.tileMode);
    }

    public String toString() {
        String str;
        String str2 = "";
        if (OffsetKt.m1310isSpecifiedk4lQ0M(this.center)) {
            str = "center=" + ((Object) Offset.m1304toStringimpl(this.center)) + ", ";
        } else {
            str = "";
        }
        float f = this.radius;
        if (!Float.isInfinite(f) && !Float.isNaN(f)) {
            str2 = "radius=" + this.radius + ", ";
        }
        return "RadialGradient(colors=" + this.colors + ", stops=" + this.stops + ", " + str + str2 + "tileMode=" + ((Object) TileMode.m1611toStringimpl(this.tileMode)) + ')';
    }
}
