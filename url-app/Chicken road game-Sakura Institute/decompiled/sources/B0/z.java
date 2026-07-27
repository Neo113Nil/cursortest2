package B0;

import android.graphics.text.LineBreakConfig;
import android.text.StaticLayout;

/* loaded from: classes.dex */
public abstract class z {
    public static final boolean a(StaticLayout staticLayout) {
        boolean isFallbackLineSpacingEnabled;
        isFallbackLineSpacingEnabled = staticLayout.isFallbackLineSpacingEnabled();
        return isFallbackLineSpacingEnabled;
    }

    public static final void b(StaticLayout.Builder builder, int i2, int i4) {
        LineBreakConfig.Builder lineBreakStyle;
        LineBreakConfig.Builder lineBreakWordStyle;
        LineBreakConfig build;
        lineBreakStyle = AbstractC0090d.e().setLineBreakStyle(i2);
        lineBreakWordStyle = lineBreakStyle.setLineBreakWordStyle(i4);
        build = lineBreakWordStyle.build();
        builder.setLineBreakConfig(build);
    }
}
