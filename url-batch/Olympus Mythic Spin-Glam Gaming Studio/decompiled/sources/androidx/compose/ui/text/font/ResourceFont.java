package androidx.compose.ui.text.font;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Font.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\tR\u001a\u0010\u0011\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R#\u0010\u0016\u001a\u00020\u00158\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u000e\u001a\u0004\b\u0017\u0010\tR)\u0010\u0019\u001a\u00020\u00188WX\u0097\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u000e\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001a\u0010\t\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/text/font/ResourceFont;", "Landroidx/compose/ui/text/font/Font;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "resId", "I", "getResId", "Landroidx/compose/ui/text/font/FontWeight;", "weight", "Landroidx/compose/ui/text/font/FontWeight;", "getWeight", "()Landroidx/compose/ui/text/font/FontWeight;", "Landroidx/compose/ui/text/font/FontStyle;", "style", "getStyle-_-LCdwA", "Landroidx/compose/ui/text/font/FontLoadingStrategy;", "loadingStrategy", "getLoadingStrategy-PKNRLFQ", "getLoadingStrategy-PKNRLFQ$annotations", "()V", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ResourceFont implements Font {
    private final int loadingStrategy;
    private final int resId;
    private final int style;
    private final FontWeight weight;

    public final int getResId() {
        return this.resId;
    }

    @Override // androidx.compose.ui.text.font.Font
    public FontWeight getWeight() {
        return this.weight;
    }

    @Override // androidx.compose.ui.text.font.Font
    /* renamed from: getStyle-_-LCdwA, reason: from getter */
    public int getStyle() {
        return this.style;
    }

    @Override // androidx.compose.ui.text.font.Font
    /* renamed from: getLoadingStrategy-PKNRLFQ, reason: from getter */
    public int getLoadingStrategy() {
        return this.loadingStrategy;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResourceFont)) {
            return false;
        }
        ResourceFont resourceFont = (ResourceFont) other;
        return this.resId == resourceFont.resId && Intrinsics.areEqual(getWeight(), resourceFont.getWeight()) && FontStyle.m2302equalsimpl0(getStyle(), resourceFont.getStyle()) && FontLoadingStrategy.m2291equalsimpl0(getLoadingStrategy(), resourceFont.getLoadingStrategy());
    }

    public int hashCode() {
        return (((((this.resId * 31) + getWeight().hashCode()) * 31) + FontStyle.m2303hashCodeimpl(getStyle())) * 31) + FontLoadingStrategy.m2292hashCodeimpl(getLoadingStrategy());
    }

    public String toString() {
        return "ResourceFont(resId=" + this.resId + ", weight=" + getWeight() + ", style=" + ((Object) FontStyle.m2304toStringimpl(getStyle())) + ", loadingStrategy=" + ((Object) FontLoadingStrategy.m2293toStringimpl(getLoadingStrategy())) + ')';
    }
}
