package androidx.compose.ui.text.style;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: TextDrawStyle.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u001d\u0010\u0014\u001a\u00020\u00028VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/text/style/ColorStyle;", "Landroidx/compose/ui/text/style/TextDrawStyle;", "Landroidx/compose/ui/graphics/Color;", "value", "<init>", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getColor-0d7_KjU", "()J", "color", "Landroidx/compose/ui/graphics/Brush;", "getBrush", "()Landroidx/compose/ui/graphics/Brush;", "brush", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class ColorStyle implements TextDrawStyle {
    private final long value;

    public /* synthetic */ ColorStyle(long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(j);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ColorStyle) && Color.m1447equalsimpl0(this.value, ((ColorStyle) other).value);
    }

    @Override // androidx.compose.ui.text.style.TextDrawStyle
    public Brush getBrush() {
        return null;
    }

    public int hashCode() {
        return Color.m1453hashCodeimpl(this.value);
    }

    public String toString() {
        return "ColorStyle(value=" + ((Object) Color.m1454toStringimpl(this.value)) + ')';
    }

    private ColorStyle(long j) {
        this.value = j;
        if (j == Color.INSTANCE.m1461getUnspecified0d7_KjU()) {
            throw new IllegalArgumentException("ColorStyle value must be specified, use TextDrawStyle.Unspecified instead.");
        }
    }

    @Override // androidx.compose.ui.text.style.TextDrawStyle
    /* renamed from: getColor-0d7_KjU, reason: from getter */
    public long getValue() {
        return this.value;
    }
}
