package androidx.compose.ui.res;

import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.compat.AndroidVectorParser;
import androidx.compose.ui.graphics.vector.compat.XmlVectorParser_androidKt;
import androidx.compose.ui.res.ImageVectorCache;
import com.yandex.div.core.dagger.Names;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: VectorResources.android.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a/\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\u0002\u001a\b\u0018\u00010\u0000R\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", Names.THEME, "res", "Landroid/content/res/XmlResourceParser;", "parser", "Landroidx/compose/ui/res/ImageVectorCache$ImageVectorEntry;", "loadVectorResourceInner", "(Landroid/content/res/Resources$Theme;Landroid/content/res/Resources;Landroid/content/res/XmlResourceParser;)Landroidx/compose/ui/res/ImageVectorCache$ImageVectorEntry;", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class VectorResources_androidKt {
    public static final ImageVectorCache.ImageVectorEntry loadVectorResourceInner(Resources.Theme theme, Resources res, XmlResourceParser parser) {
        Intrinsics.checkNotNullParameter(res, "res");
        Intrinsics.checkNotNullParameter(parser, "parser");
        AttributeSet attrs = Xml.asAttributeSet(parser);
        AndroidVectorParser androidVectorParser = new AndroidVectorParser(parser, 0, 2, null);
        Intrinsics.checkNotNullExpressionValue(attrs, "attrs");
        ImageVector.Builder createVectorImageBuilder = XmlVectorParser_androidKt.createVectorImageBuilder(androidVectorParser, res, theme, attrs);
        int i = 0;
        while (!XmlVectorParser_androidKt.isAtEnd(parser)) {
            i = XmlVectorParser_androidKt.parseCurrentVectorNode(androidVectorParser, res, attrs, theme, createVectorImageBuilder, i);
            parser.next();
        }
        return new ImageVectorCache.ImageVectorEntry(createVectorImageBuilder.build(), androidVectorParser.getConfig());
    }
}
