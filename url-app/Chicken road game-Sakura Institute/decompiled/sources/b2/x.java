package b2;

import android.graphics.text.LineBreakConfig;
import android.text.StaticLayout;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class x {
    public static final boolean a(StaticLayout staticLayout) {
        boolean isFallbackLineSpacingEnabled;
        isFallbackLineSpacingEnabled = staticLayout.isFallbackLineSpacingEnabled();
        return isFallbackLineSpacingEnabled;
    }

    public static final void b(StaticLayout.Builder builder, int i7, int i8) {
        LineBreakConfig.Builder lineBreakStyle;
        LineBreakConfig.Builder lineBreakWordStyle;
        LineBreakConfig build;
        lineBreakStyle = b.p.a().setLineBreakStyle(i7);
        lineBreakWordStyle = lineBreakStyle.setLineBreakWordStyle(i8);
        build = lineBreakWordStyle.build();
        builder.setLineBreakConfig(build);
    }
}
