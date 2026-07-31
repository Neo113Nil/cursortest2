package C0;

import android.graphics.text.LineBreakConfig;
import android.text.StaticLayout;

/* loaded from: classes.dex */
public abstract class w {
    public static final boolean a(StaticLayout staticLayout) {
        boolean isFallbackLineSpacingEnabled;
        isFallbackLineSpacingEnabled = staticLayout.isFallbackLineSpacingEnabled();
        return isFallbackLineSpacingEnabled;
    }

    public static final void b(StaticLayout.Builder builder, int i3, int i4) {
        LineBreakConfig.Builder lineBreakStyle;
        LineBreakConfig.Builder lineBreakWordStyle;
        LineBreakConfig build;
        lineBreakStyle = AbstractC0009a.a().setLineBreakStyle(i3);
        lineBreakWordStyle = lineBreakStyle.setLineBreakWordStyle(i4);
        build = lineBreakWordStyle.build();
        builder.setLineBreakConfig(build);
    }
}
