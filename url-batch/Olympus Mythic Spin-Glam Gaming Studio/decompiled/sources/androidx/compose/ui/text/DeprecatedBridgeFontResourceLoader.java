package androidx.compose.ui.text;

import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontKt;
import androidx.compose.ui.text.platform.Synchronization_jvmKt;
import androidx.compose.ui.text.platform.SynchronizedObject;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TextLayoutResult.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000 \n2\u00020\u0001:\u0001\nJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/text/DeprecatedBridgeFontResourceLoader;", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "Landroidx/compose/ui/text/font/Font;", "font", "", "load", "(Landroidx/compose/ui/text/font/Font;)Ljava/lang/Object;", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "Companion", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
final class DeprecatedBridgeFontResourceLoader implements Font.ResourceLoader {
    private static Map cache = new LinkedHashMap();
    private static final SynchronizedObject lock = Synchronization_jvmKt.createSynchronizedObject();
    private final FontFamily.Resolver fontFamilyResolver;

    @Override // androidx.compose.ui.text.font.Font.ResourceLoader
    public Object load(Font font) {
        Intrinsics.checkNotNullParameter(font, "font");
        return FontFamily.Resolver.m2287resolveDPcqOEQ$default(this.fontFamilyResolver, FontKt.toFontFamily(font), font.getWeight(), font.getStyle(), 0, 8, null).getValue();
    }
}
