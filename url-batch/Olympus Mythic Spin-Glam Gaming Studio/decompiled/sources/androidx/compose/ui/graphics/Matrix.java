package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import com.yandex.div.core.timer.TimerController;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: Matrix.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u0000 02\u00020\u0001:\u00010B\u0014\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\n\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0016\u001a\u00020\r¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010!\u001a\u00020\r2\b\b\u0002\u0010\u001c\u001a\u00020\u00172\b\b\u0002\u0010\u001d\u001a\u00020\u00172\b\b\u0002\u0010\u001e\u001a\u00020\u0017¢\u0006\u0004\b\u001f\u0010 J+\u0010#\u001a\u00020\r2\b\b\u0002\u0010\u001c\u001a\u00020\u00172\b\b\u0002\u0010\u001d\u001a\u00020\u00172\b\b\u0002\u0010\u001e\u001a\u00020\u0017¢\u0006\u0004\b\"\u0010 J\u0010\u0010'\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010,\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010/\u0088\u0001\u0003\u0092\u0001\u00020\u0002ø\u0001\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00061"}, d2 = {"Landroidx/compose/ui/graphics/Matrix;", "", "", "values", "constructor-impl", "([F)[F", "Landroidx/compose/ui/geometry/Offset;", "point", "map-MK-Hz9U", "([FJ)J", "map", "Landroidx/compose/ui/geometry/MutableRect;", "rect", "", "map-impl", "([FLandroidx/compose/ui/geometry/MutableRect;)V", "", "toString-impl", "([F)Ljava/lang/String;", "toString", "reset-impl", "([F)V", TimerController.RESET_COMMAND, "", "degrees", "rotateZ-impl", "([FF)V", "rotateZ", VastAttributes.HORIZONTAL_POSITION, VastAttributes.VERTICAL_POSITION, "z", "scale-impl", "([FFFF)V", "scale", "translate-impl", "translate", "", "hashCode-impl", "([F)I", "hashCode", "other", "", "equals-impl", "([FLjava/lang/Object;)Z", "equals", "[F", "getValues", "()[F", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class Matrix {
    private final float[] values;

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Matrix m1513boximpl(float[] fArr) {
        return new Matrix(fArr);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static float[] m1514constructorimpl(float[] values) {
        Intrinsics.checkNotNullParameter(values, "values");
        return values;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1516equalsimpl(float[] fArr, Object obj) {
        return (obj instanceof Matrix) && Intrinsics.areEqual(fArr, ((Matrix) obj).getValues());
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1517hashCodeimpl(float[] fArr) {
        return Arrays.hashCode(fArr);
    }

    public boolean equals(Object obj) {
        return m1516equalsimpl(this.values, obj);
    }

    public int hashCode() {
        return m1517hashCodeimpl(this.values);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ float[] getValues() {
        return this.values;
    }

    private /* synthetic */ Matrix(float[] fArr) {
        this.values = fArr;
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ float[] m1515constructorimpl$default(float[] fArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            fArr = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        }
        return m1514constructorimpl(fArr);
    }

    /* renamed from: scale-impl, reason: not valid java name */
    public static final void m1522scaleimpl(float[] fArr, float f, float f2, float f3) {
        fArr[0] = fArr[0] * f;
        fArr[1] = fArr[1] * f;
        fArr[2] = fArr[2] * f;
        fArr[3] = fArr[3] * f;
        fArr[4] = fArr[4] * f2;
        fArr[5] = fArr[5] * f2;
        fArr[6] = fArr[6] * f2;
        fArr[7] = fArr[7] * f2;
        fArr[8] = fArr[8] * f3;
        fArr[9] = fArr[9] * f3;
        fArr[10] = fArr[10] * f3;
        fArr[11] = fArr[11] * f3;
    }

    /* renamed from: translate-impl, reason: not valid java name */
    public static final void m1524translateimpl(float[] fArr, float f, float f2, float f3) {
        float f4 = (fArr[0] * f) + (fArr[4] * f2) + (fArr[8] * f3) + fArr[12];
        float f5 = (fArr[1] * f) + (fArr[5] * f2) + (fArr[9] * f3) + fArr[13];
        float f6 = (fArr[2] * f) + (fArr[6] * f2) + (fArr[10] * f3) + fArr[14];
        float f7 = (fArr[3] * f) + (fArr[7] * f2) + (fArr[11] * f3) + fArr[15];
        fArr[12] = f4;
        fArr[13] = f5;
        fArr[14] = f6;
        fArr[15] = f7;
    }

    /* renamed from: reset-impl, reason: not valid java name */
    public static final void m1520resetimpl(float[] fArr) {
        int i = 0;
        while (i < 4) {
            int i2 = 0;
            while (i2 < 4) {
                fArr[(i2 * 4) + i] = i == i2 ? 1.0f : 0.0f;
                i2++;
            }
            i++;
        }
    }

    /* renamed from: map-MK-Hz9U, reason: not valid java name */
    public static final long m1518mapMKHz9U(float[] fArr, long j) {
        float m1297getXimpl = Offset.m1297getXimpl(j);
        float m1298getYimpl = Offset.m1298getYimpl(j);
        float f = 1 / (((fArr[3] * m1297getXimpl) + (fArr[7] * m1298getYimpl)) + fArr[15]);
        if (Float.isInfinite(f) || Float.isNaN(f)) {
            f = 0.0f;
        }
        return OffsetKt.Offset(((fArr[0] * m1297getXimpl) + (fArr[4] * m1298getYimpl) + fArr[12]) * f, f * ((fArr[1] * m1297getXimpl) + (fArr[5] * m1298getYimpl) + fArr[13]));
    }

    /* renamed from: map-impl, reason: not valid java name */
    public static final void m1519mapimpl(float[] fArr, MutableRect rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        long m1518mapMKHz9U = m1518mapMKHz9U(fArr, OffsetKt.Offset(rect.getLeft(), rect.getTop()));
        long m1518mapMKHz9U2 = m1518mapMKHz9U(fArr, OffsetKt.Offset(rect.getLeft(), rect.getBottom()));
        long m1518mapMKHz9U3 = m1518mapMKHz9U(fArr, OffsetKt.Offset(rect.getRight(), rect.getTop()));
        long m1518mapMKHz9U4 = m1518mapMKHz9U(fArr, OffsetKt.Offset(rect.getRight(), rect.getBottom()));
        rect.setLeft(Math.min(Math.min(Offset.m1297getXimpl(m1518mapMKHz9U), Offset.m1297getXimpl(m1518mapMKHz9U2)), Math.min(Offset.m1297getXimpl(m1518mapMKHz9U3), Offset.m1297getXimpl(m1518mapMKHz9U4))));
        rect.setTop(Math.min(Math.min(Offset.m1298getYimpl(m1518mapMKHz9U), Offset.m1298getYimpl(m1518mapMKHz9U2)), Math.min(Offset.m1298getYimpl(m1518mapMKHz9U3), Offset.m1298getYimpl(m1518mapMKHz9U4))));
        rect.setRight(Math.max(Math.max(Offset.m1297getXimpl(m1518mapMKHz9U), Offset.m1297getXimpl(m1518mapMKHz9U2)), Math.max(Offset.m1297getXimpl(m1518mapMKHz9U3), Offset.m1297getXimpl(m1518mapMKHz9U4))));
        rect.setBottom(Math.max(Math.max(Offset.m1298getYimpl(m1518mapMKHz9U), Offset.m1298getYimpl(m1518mapMKHz9U2)), Math.max(Offset.m1298getYimpl(m1518mapMKHz9U3), Offset.m1298getYimpl(m1518mapMKHz9U4))));
    }

    public String toString() {
        return m1523toStringimpl(this.values);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1523toStringimpl(float[] fArr) {
        return StringsKt.trimIndent("\n            |" + fArr[0] + ' ' + fArr[1] + ' ' + fArr[2] + ' ' + fArr[3] + "|\n            |" + fArr[4] + ' ' + fArr[5] + ' ' + fArr[6] + ' ' + fArr[7] + "|\n            |" + fArr[8] + ' ' + fArr[9] + ' ' + fArr[10] + ' ' + fArr[11] + "|\n            |" + fArr[12] + ' ' + fArr[13] + ' ' + fArr[14] + ' ' + fArr[15] + "|\n        ");
    }

    /* renamed from: rotateZ-impl, reason: not valid java name */
    public static final void m1521rotateZimpl(float[] fArr, float f) {
        double d = (f * 3.141592653589793d) / 180.0d;
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        float f2 = fArr[0];
        float f3 = fArr[4];
        float f4 = -sin;
        float f5 = fArr[1];
        float f6 = fArr[5];
        float f7 = fArr[2];
        float f8 = fArr[6];
        float f9 = fArr[3];
        float f10 = fArr[7];
        fArr[0] = (cos * f2) + (sin * f3);
        fArr[1] = (cos * f5) + (sin * f6);
        fArr[2] = (cos * f7) + (sin * f8);
        fArr[3] = (cos * f9) + (sin * f10);
        fArr[4] = (f2 * f4) + (f3 * cos);
        fArr[5] = (f5 * f4) + (f6 * cos);
        fArr[6] = (f7 * f4) + (f8 * cos);
        fArr[7] = (f4 * f9) + (cos * f10);
    }

    /* renamed from: translate-impl$default, reason: not valid java name */
    public static /* synthetic */ void m1525translateimpl$default(float[] fArr, float f, float f2, float f3, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        m1524translateimpl(fArr, f, f2, f3);
    }
}
