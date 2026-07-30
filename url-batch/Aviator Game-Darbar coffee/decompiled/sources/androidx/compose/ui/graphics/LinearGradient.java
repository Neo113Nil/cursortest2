package androidx.compose.ui.graphics;

import android.graphics.Shader;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Brush.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002BC\b\u0000\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u001c\u001a\u00060\u001dj\u0002`\u001e2\u0006\u0010\u001f\u001a\u00020\u001aH\u0016¢\u0006\u0004\b \u0010!J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0096\u0002J\b\u0010&\u001a\u00020'H\u0016J\b\u0010(\u001a\u00020)H\u0016J\u001c\u0010*\u001a\u0004\u0018\u00010%2\b\u0010$\u001a\u0004\u0018\u00010%2\u0006\u0010+\u001a\u00020\u0007H\u0016R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\b\u001a\u00020\tX\u0080\u0004¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\n\u001a\u00020\tX\u0080\u0004¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0015\u0010\u0013R\u0016\u0010\u000b\u001a\u00020\fX\u0080\u0004¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0013¨\u0006,"}, d2 = {"Landroidx/compose/ui/graphics/LinearGradient;", "Landroidx/compose/ui/graphics/ShaderBrush;", "Landroidx/compose/ui/graphics/Interpolatable;", "colors", "", "Landroidx/compose/ui/graphics/Color;", "stops", "", "start", "Landroidx/compose/ui/geometry/Offset;", "end", "tileMode", "Landroidx/compose/ui/graphics/TileMode;", "<init>", "(Ljava/util/List;Ljava/util/List;JJILkotlin/jvm/internal/DefaultConstructorMarker;)V", "getColors$ui_graphics", "()Ljava/util/List;", "getStops$ui_graphics", "getStart-F1C5BW0$ui_graphics", "()J", "J", "getEnd-F1C5BW0$ui_graphics", "getTileMode-3opZhB0$ui_graphics", "()I", "I", "intrinsicSize", "Landroidx/compose/ui/geometry/Size;", "getIntrinsicSize-NH-jbRc", "createShader", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "size", "createShader-uvyYCjk", "(J)Landroid/graphics/Shader;", "equals", "", "other", "", "hashCode", "", "toString", "", "lerp", "t", "ui-graphics"}, k = 1, mv = {2, 0, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class LinearGradient extends ShaderBrush implements Interpolatable {
    public static final int $stable = 0;
    private final List<Color> colors;
    private final long end;
    private final long start;
    private final List<Float> stops;
    private final int tileMode;

    public /* synthetic */ LinearGradient(List list, List list2, long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, j, j2, i);
    }

    private LinearGradient(List<Color> list, List<Float> list2, long j, long j2, int i) {
        this.colors = list;
        this.stops = list2;
        this.start = j;
        this.end = j2;
        this.tileMode = i;
    }

    public final List<Color> getColors$ui_graphics() {
        return this.colors;
    }

    public final List<Float> getStops$ui_graphics() {
        return this.stops;
    }

    /* renamed from: getStart-F1C5BW0$ui_graphics, reason: not valid java name and from getter */
    public final long getStart() {
        return this.start;
    }

    /* renamed from: getEnd-F1C5BW0$ui_graphics, reason: not valid java name and from getter */
    public final long getEnd() {
        return this.end;
    }

    public /* synthetic */ LinearGradient(List list, List list2, long j, long j2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i2 & 2) != 0 ? null : list2, j, j2, (i2 & 16) != 0 ? TileMode.INSTANCE.m5134getClamp3opZhB0() : i, null);
    }

    /* renamed from: getTileMode-3opZhB0$ui_graphics, reason: not valid java name and from getter */
    public final int getTileMode() {
        return this.tileMode;
    }

    @Override // androidx.compose.ui.graphics.Brush
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public long getIntrinsicSize() {
        float f;
        float intBitsToFloat;
        float intBitsToFloat2;
        float intBitsToFloat3 = Float.intBitsToFloat((int) (this.start >> 32));
        float f2 = Float.NaN;
        if (!Float.isInfinite(intBitsToFloat3) && !Float.isNaN(intBitsToFloat3)) {
            float intBitsToFloat4 = Float.intBitsToFloat((int) (this.end >> 32));
            if (!Float.isInfinite(intBitsToFloat4) && !Float.isNaN(intBitsToFloat4)) {
                f = Math.abs(Float.intBitsToFloat((int) (this.start >> 32)) - Float.intBitsToFloat((int) (this.end >> 32)));
                intBitsToFloat = Float.intBitsToFloat((int) (this.start & 4294967295L));
                if (!Float.isInfinite(intBitsToFloat) && !Float.isNaN(intBitsToFloat)) {
                    intBitsToFloat2 = Float.intBitsToFloat((int) (this.end & 4294967295L));
                    if (!Float.isInfinite(intBitsToFloat2) && !Float.isNaN(intBitsToFloat2)) {
                        f2 = Math.abs(Float.intBitsToFloat((int) (this.start & 4294967295L)) - Float.intBitsToFloat((int) (this.end & 4294967295L)));
                    }
                }
                return Size.m4554constructorimpl((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L));
            }
        }
        f = Float.NaN;
        intBitsToFloat = Float.intBitsToFloat((int) (this.start & 4294967295L));
        if (!Float.isInfinite(intBitsToFloat)) {
            intBitsToFloat2 = Float.intBitsToFloat((int) (this.end & 4294967295L));
            if (!Float.isInfinite(intBitsToFloat2)) {
                f2 = Math.abs(Float.intBitsToFloat((int) (this.start & 4294967295L)) - Float.intBitsToFloat((int) (this.end & 4294967295L)));
            }
        }
        return Size.m4554constructorimpl((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L));
    }

    @Override // androidx.compose.ui.graphics.ShaderBrush
    /* renamed from: createShader-uvyYCjk */
    public Shader mo4708createShaderuvyYCjk(long size) {
        float intBitsToFloat = Float.intBitsToFloat((int) (Float.intBitsToFloat((int) (this.start >> 32)) == Float.POSITIVE_INFINITY ? size >> 32 : this.start >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (Float.intBitsToFloat((int) (this.start & 4294967295L)) == Float.POSITIVE_INFINITY ? size & 4294967295L : this.start & 4294967295L));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (Float.intBitsToFloat((int) (this.end >> 32)) == Float.POSITIVE_INFINITY ? size >> 32 : this.end >> 32));
        float intBitsToFloat4 = Float.intBitsToFloat((int) (Float.intBitsToFloat((int) (this.end & 4294967295L)) == Float.POSITIVE_INFINITY ? size & 4294967295L : this.end & 4294967295L));
        return ShaderKt.m5073LinearGradientShaderVjE6UOU(Offset.m4486constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L)), Offset.m4486constructorimpl((Float.floatToRawIntBits(intBitsToFloat4) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat3) << 32)), this.colors, this.stops, this.tileMode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LinearGradient)) {
            return false;
        }
        LinearGradient linearGradient = (LinearGradient) other;
        return Intrinsics.areEqual(this.colors, linearGradient.colors) && Intrinsics.areEqual(this.stops, linearGradient.stops) && Offset.m4491equalsimpl0(this.start, linearGradient.start) && Offset.m4491equalsimpl0(this.end, linearGradient.end) && TileMode.m5130equalsimpl0(this.tileMode, linearGradient.tileMode);
    }

    public int hashCode() {
        int hashCode = this.colors.hashCode() * 31;
        List<Float> list = this.stops;
        return ((((((hashCode + (list != null ? list.hashCode() : 0)) * 31) + Offset.m4496hashCodeimpl(this.start)) * 31) + Offset.m4496hashCodeimpl(this.end)) * 31) + TileMode.m5131hashCodeimpl(this.tileMode);
    }

    public String toString() {
        return "LinearGradient(colors=" + this.colors + ", stops=" + this.stops + ", " + (((((this.start & androidx.compose.ui.geometry.InlineClassHelperKt.DualFloatInfinityBase) ^ androidx.compose.ui.geometry.InlineClassHelperKt.DualFloatInfinityBase) - androidx.compose.ui.geometry.InlineClassHelperKt.Uint64Low32) & (-9223372034707292160L)) == 0 ? "start=" + ((Object) Offset.m4502toStringimpl(this.start)) + ", " : "") + ((((androidx.compose.ui.geometry.InlineClassHelperKt.DualFloatInfinityBase ^ (this.end & androidx.compose.ui.geometry.InlineClassHelperKt.DualFloatInfinityBase)) - androidx.compose.ui.geometry.InlineClassHelperKt.Uint64Low32) & (-9223372034707292160L)) == 0 ? "end=" + ((Object) Offset.m4502toStringimpl(this.end)) + ", " : "") + "tileMode=" + ((Object) TileMode.m5132toStringimpl(this.tileMode)) + ')';
    }

    @Override // androidx.compose.ui.graphics.Interpolatable
    public Object lerp(Object other, float t) {
        Object solidColor = other == null ? new SolidColor(Color.INSTANCE.m4774getTransparent0d7_KjU(), null) : other;
        if (solidColor instanceof SolidColor) {
            List<Color> list = this.colors;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                list.get(i).m4749unboximpl();
                arrayList.add(Color.m4729boximpl(((SolidColor) solidColor).getValue()));
            }
            solidColor = new LinearGradient(arrayList, this.stops, this.start, this.end, this.tileMode, null);
        }
        if (!(solidColor instanceof LinearGradient)) {
            return null;
        }
        LinearGradient linearGradient = (LinearGradient) solidColor;
        return new LinearGradient(BrushKt.lerpColorList(this.colors, linearGradient.colors, t), BrushKt.lerpNullableFloatList(this.stops, linearGradient.stops, t), BrushKt.m4707lerpSafeWko1d7g(this.start, linearGradient.start, t), BrushKt.m4707lerpSafeWko1d7g(this.end, linearGradient.end, t), t < 0.5f ? this.tileMode : linearGradient.tileMode, null);
    }
}
