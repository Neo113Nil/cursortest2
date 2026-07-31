package androidx.compose.material;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.TextUnitKt;
import com.facebook.share.internal.ShareConstants;
import com.sglib.easymobile.androidnative.gdpr.SplitContent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Typography.kt */
@Immutable
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001Bq\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011B\u0095\u0001\b\u0016\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b\"\u0010!R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b#\u0010!R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b$\u0010!R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b%\u0010!R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b&\u0010!R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b'\u0010!R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b(\u0010!R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001f\u001a\u0004\b)\u0010!R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u001f\u001a\u0004\b*\u0010!R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u001f\u001a\u0004\b+\u0010!R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001f\u001a\u0004\b,\u0010!R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001f\u001a\u0004\b-\u0010!¨\u0006."}, d2 = {"Landroidx/compose/material/Typography;", "", "Landroidx/compose/ui/text/TextStyle;", "h1", "h2", "h3", "h4", "h5", "h6", "subtitle1", "subtitle2", "body1", "body2", SplitContent.BUTTON_VALUE, ShareConstants.FEED_CAPTION_PARAM, "overline", "<init>", "(Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;)V", "Landroidx/compose/ui/text/font/FontFamily;", "defaultFontFamily", "(Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/text/TextStyle;", "getH1", "()Landroidx/compose/ui/text/TextStyle;", "getH2", "getH3", "getH4", "getH5", "getH6", "getSubtitle1", "getSubtitle2", "getBody1", "getBody2", "getButton", "getCaption", "getOverline", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class Typography {
    private final TextStyle body1;
    private final TextStyle body2;
    private final TextStyle button;
    private final TextStyle caption;
    private final TextStyle h1;
    private final TextStyle h2;
    private final TextStyle h3;
    private final TextStyle h4;
    private final TextStyle h5;
    private final TextStyle h6;
    private final TextStyle overline;
    private final TextStyle subtitle1;
    private final TextStyle subtitle2;

    public Typography(TextStyle h1, TextStyle h2, TextStyle h3, TextStyle h4, TextStyle h5, TextStyle h6, TextStyle subtitle1, TextStyle subtitle2, TextStyle body1, TextStyle body2, TextStyle button, TextStyle caption, TextStyle overline) {
        Intrinsics.checkNotNullParameter(h1, "h1");
        Intrinsics.checkNotNullParameter(h2, "h2");
        Intrinsics.checkNotNullParameter(h3, "h3");
        Intrinsics.checkNotNullParameter(h4, "h4");
        Intrinsics.checkNotNullParameter(h5, "h5");
        Intrinsics.checkNotNullParameter(h6, "h6");
        Intrinsics.checkNotNullParameter(subtitle1, "subtitle1");
        Intrinsics.checkNotNullParameter(subtitle2, "subtitle2");
        Intrinsics.checkNotNullParameter(body1, "body1");
        Intrinsics.checkNotNullParameter(body2, "body2");
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(caption, "caption");
        Intrinsics.checkNotNullParameter(overline, "overline");
        this.h1 = h1;
        this.h2 = h2;
        this.h3 = h3;
        this.h4 = h4;
        this.h5 = h5;
        this.h6 = h6;
        this.subtitle1 = subtitle1;
        this.subtitle2 = subtitle2;
        this.body1 = body1;
        this.body2 = body2;
        this.button = button;
        this.caption = caption;
        this.overline = overline;
    }

    public final TextStyle getH6() {
        return this.h6;
    }

    public final TextStyle getSubtitle1() {
        return this.subtitle1;
    }

    public final TextStyle getBody1() {
        return this.body1;
    }

    public final TextStyle getBody2() {
        return this.body2;
    }

    public final TextStyle getButton() {
        return this.button;
    }

    public final TextStyle getCaption() {
        return this.caption;
    }

    public final TextStyle getOverline() {
        return this.overline;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ Typography(FontFamily fontFamily, TextStyle textStyle, TextStyle textStyle2, TextStyle textStyle3, TextStyle textStyle4, TextStyle textStyle5, TextStyle textStyle6, TextStyle textStyle7, TextStyle textStyle8, TextStyle textStyle9, TextStyle textStyle10, TextStyle textStyle11, TextStyle textStyle12, TextStyle textStyle13, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r1, r2, r3, r4, r6, r5, r9, r10, r11, r13, r7, r8, r12, r0);
        TextStyle textStyle14;
        TextStyle textStyle15;
        TextStyle textStyle16;
        TextStyle textStyle17;
        TextStyle textStyle18;
        TextStyle textStyle19;
        TextStyle textStyle20;
        TextStyle textStyle21;
        TextStyle textStyle22;
        TextStyle textStyle23;
        TextStyle textStyle24;
        TextStyle textStyle25;
        TextStyle textStyle26;
        FontFamily fontFamily2 = (i & 1) != 0 ? FontFamily.INSTANCE.getDefault() : fontFamily;
        if ((i & 2) != 0) {
            textStyle14 = new TextStyle(0L, TextUnitKt.getSp(96), FontWeight.INSTANCE.getLight(), null, null, null, null, TextUnitKt.getSp(-1.5d), null, null, null, 0L, null, null, null, null, 0L, null, 262009, null);
        } else {
            textStyle14 = textStyle;
        }
        if ((i & 4) != 0) {
            textStyle15 = new TextStyle(0L, TextUnitKt.getSp(60), FontWeight.INSTANCE.getLight(), null, null, null, null, TextUnitKt.getSp(-0.5d), null, null, null, 0L, null, null, null, null, 0L, null, 262009, null);
        } else {
            textStyle15 = textStyle2;
        }
        if ((i & 8) != 0) {
            textStyle16 = new TextStyle(0L, TextUnitKt.getSp(48), FontWeight.INSTANCE.getNormal(), null, null, null, null, TextUnitKt.getSp(0), null, null, null, 0L, null, null, null, null, 0L, null, 262009, null);
        } else {
            textStyle16 = textStyle3;
        }
        if ((i & 16) != 0) {
            textStyle17 = new TextStyle(0L, TextUnitKt.getSp(34), FontWeight.INSTANCE.getNormal(), null, null, null, null, TextUnitKt.getSp(0.25d), null, null, null, 0L, null, null, null, null, 0L, null, 262009, null);
        } else {
            textStyle17 = textStyle4;
        }
        if ((i & 32) != 0) {
            textStyle18 = new TextStyle(0L, TextUnitKt.getSp(24), FontWeight.INSTANCE.getNormal(), null, null, null, null, TextUnitKt.getSp(0), null, null, null, 0L, null, null, null, null, 0L, null, 262009, null);
        } else {
            textStyle18 = textStyle5;
        }
        if ((i & 64) != 0) {
            textStyle19 = new TextStyle(0L, TextUnitKt.getSp(20), FontWeight.INSTANCE.getMedium(), null, null, null, null, TextUnitKt.getSp(0.15d), null, null, null, 0L, null, null, null, null, 0L, null, 262009, null);
        } else {
            textStyle19 = textStyle6;
        }
        if ((i & 128) != 0) {
            textStyle20 = new TextStyle(0L, TextUnitKt.getSp(16), FontWeight.INSTANCE.getNormal(), null, null, null, null, TextUnitKt.getSp(0.15d), null, null, null, 0L, null, null, null, null, 0L, null, 262009, null);
        } else {
            textStyle20 = textStyle7;
        }
        if ((i & 256) != 0) {
            textStyle21 = new TextStyle(0L, TextUnitKt.getSp(14), FontWeight.INSTANCE.getMedium(), null, null, null, null, TextUnitKt.getSp(0.1d), null, null, null, 0L, null, null, null, null, 0L, null, 262009, null);
        } else {
            textStyle21 = textStyle8;
        }
        if ((i & 512) != 0) {
            textStyle22 = new TextStyle(0L, TextUnitKt.getSp(16), FontWeight.INSTANCE.getNormal(), null, null, null, null, TextUnitKt.getSp(0.5d), null, null, null, 0L, null, null, null, null, 0L, null, 262009, null);
        } else {
            textStyle22 = textStyle9;
        }
        if ((i & 1024) != 0) {
            textStyle23 = new TextStyle(0L, TextUnitKt.getSp(14), FontWeight.INSTANCE.getNormal(), null, null, null, null, TextUnitKt.getSp(0.25d), null, null, null, 0L, null, null, null, null, 0L, null, 262009, null);
        } else {
            textStyle23 = textStyle10;
        }
        if ((i & 2048) != 0) {
            textStyle24 = new TextStyle(0L, TextUnitKt.getSp(14), FontWeight.INSTANCE.getMedium(), null, null, null, null, TextUnitKt.getSp(1.25d), null, null, null, 0L, null, null, null, null, 0L, null, 262009, null);
        } else {
            textStyle24 = textStyle11;
        }
        if ((i & 4096) != 0) {
            textStyle25 = new TextStyle(0L, TextUnitKt.getSp(12), FontWeight.INSTANCE.getNormal(), null, null, null, null, TextUnitKt.getSp(0.4d), null, null, null, 0L, null, null, null, null, 0L, null, 262009, null);
        } else {
            textStyle25 = textStyle12;
        }
        if ((i & 8192) != 0) {
            textStyle26 = new TextStyle(0L, TextUnitKt.getSp(10), FontWeight.INSTANCE.getNormal(), null, null, null, null, TextUnitKt.getSp(1.5d), null, null, null, 0L, null, null, null, null, 0L, null, 262009, null);
        } else {
            textStyle26 = textStyle13;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Typography(FontFamily defaultFontFamily, TextStyle h1, TextStyle h2, TextStyle h3, TextStyle h4, TextStyle h5, TextStyle h6, TextStyle subtitle1, TextStyle subtitle2, TextStyle body1, TextStyle body2, TextStyle button, TextStyle caption, TextStyle overline) {
        this(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15);
        TextStyle withDefaultFontFamily;
        TextStyle withDefaultFontFamily2;
        TextStyle withDefaultFontFamily3;
        TextStyle withDefaultFontFamily4;
        TextStyle withDefaultFontFamily5;
        TextStyle withDefaultFontFamily6;
        TextStyle withDefaultFontFamily7;
        TextStyle withDefaultFontFamily8;
        TextStyle withDefaultFontFamily9;
        TextStyle withDefaultFontFamily10;
        TextStyle withDefaultFontFamily11;
        TextStyle withDefaultFontFamily12;
        TextStyle withDefaultFontFamily13;
        Intrinsics.checkNotNullParameter(defaultFontFamily, "defaultFontFamily");
        Intrinsics.checkNotNullParameter(h1, "h1");
        Intrinsics.checkNotNullParameter(h2, "h2");
        Intrinsics.checkNotNullParameter(h3, "h3");
        Intrinsics.checkNotNullParameter(h4, "h4");
        Intrinsics.checkNotNullParameter(h5, "h5");
        Intrinsics.checkNotNullParameter(h6, "h6");
        Intrinsics.checkNotNullParameter(subtitle1, "subtitle1");
        Intrinsics.checkNotNullParameter(subtitle2, "subtitle2");
        Intrinsics.checkNotNullParameter(body1, "body1");
        Intrinsics.checkNotNullParameter(body2, "body2");
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(caption, "caption");
        Intrinsics.checkNotNullParameter(overline, "overline");
        withDefaultFontFamily = TypographyKt.withDefaultFontFamily(h1, defaultFontFamily);
        withDefaultFontFamily2 = TypographyKt.withDefaultFontFamily(h2, defaultFontFamily);
        withDefaultFontFamily3 = TypographyKt.withDefaultFontFamily(h3, defaultFontFamily);
        withDefaultFontFamily4 = TypographyKt.withDefaultFontFamily(h4, defaultFontFamily);
        withDefaultFontFamily5 = TypographyKt.withDefaultFontFamily(h5, defaultFontFamily);
        withDefaultFontFamily6 = TypographyKt.withDefaultFontFamily(h6, defaultFontFamily);
        withDefaultFontFamily7 = TypographyKt.withDefaultFontFamily(subtitle1, defaultFontFamily);
        withDefaultFontFamily8 = TypographyKt.withDefaultFontFamily(subtitle2, defaultFontFamily);
        withDefaultFontFamily9 = TypographyKt.withDefaultFontFamily(body1, defaultFontFamily);
        withDefaultFontFamily10 = TypographyKt.withDefaultFontFamily(body2, defaultFontFamily);
        withDefaultFontFamily11 = TypographyKt.withDefaultFontFamily(button, defaultFontFamily);
        withDefaultFontFamily12 = TypographyKt.withDefaultFontFamily(caption, defaultFontFamily);
        withDefaultFontFamily13 = TypographyKt.withDefaultFontFamily(overline, defaultFontFamily);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Typography)) {
            return false;
        }
        Typography typography = (Typography) other;
        return Intrinsics.areEqual(this.h1, typography.h1) && Intrinsics.areEqual(this.h2, typography.h2) && Intrinsics.areEqual(this.h3, typography.h3) && Intrinsics.areEqual(this.h4, typography.h4) && Intrinsics.areEqual(this.h5, typography.h5) && Intrinsics.areEqual(this.h6, typography.h6) && Intrinsics.areEqual(this.subtitle1, typography.subtitle1) && Intrinsics.areEqual(this.subtitle2, typography.subtitle2) && Intrinsics.areEqual(this.body1, typography.body1) && Intrinsics.areEqual(this.body2, typography.body2) && Intrinsics.areEqual(this.button, typography.button) && Intrinsics.areEqual(this.caption, typography.caption) && Intrinsics.areEqual(this.overline, typography.overline);
    }

    public int hashCode() {
        return (((((((((((((((((((((((this.h1.hashCode() * 31) + this.h2.hashCode()) * 31) + this.h3.hashCode()) * 31) + this.h4.hashCode()) * 31) + this.h5.hashCode()) * 31) + this.h6.hashCode()) * 31) + this.subtitle1.hashCode()) * 31) + this.subtitle2.hashCode()) * 31) + this.body1.hashCode()) * 31) + this.body2.hashCode()) * 31) + this.button.hashCode()) * 31) + this.caption.hashCode()) * 31) + this.overline.hashCode();
    }

    public String toString() {
        return "Typography(h1=" + this.h1 + ", h2=" + this.h2 + ", h3=" + this.h3 + ", h4=" + this.h4 + ", h5=" + this.h5 + ", h6=" + this.h6 + ", subtitle1=" + this.subtitle1 + ", subtitle2=" + this.subtitle2 + ", body1=" + this.body1 + ", body2=" + this.body2 + ", button=" + this.button + ", caption=" + this.caption + ", overline=" + this.overline + ')';
    }
}
