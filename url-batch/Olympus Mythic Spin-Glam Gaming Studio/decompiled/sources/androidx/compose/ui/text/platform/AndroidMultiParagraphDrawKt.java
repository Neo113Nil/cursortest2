package androidx.compose.ui.text.platform;

import android.graphics.Matrix;
import android.graphics.Shader;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.BrushKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.ParagraphInfo;
import androidx.compose.ui.text.style.TextDecoration;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AndroidMultiParagraphDraw.kt */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a4\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nH\u0000\u001a0\u0010\u000b\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002¨\u0006\f"}, d2 = {"drawMultiParagraph", "", "Landroidx/compose/ui/text/MultiParagraph;", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "brush", "Landroidx/compose/ui/graphics/Brush;", "shadow", "Landroidx/compose/ui/graphics/Shadow;", "decoration", "Landroidx/compose/ui/text/style/TextDecoration;", "drawParagraphs", "ui-text_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidMultiParagraphDrawKt {
    public static final void drawMultiParagraph(MultiParagraph multiParagraph, Canvas canvas, Brush brush, Shadow shadow, TextDecoration textDecoration) {
        Intrinsics.checkNotNullParameter(multiParagraph, "<this>");
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(brush, "brush");
        canvas.save();
        if (multiParagraph.getParagraphInfoList().size() <= 1) {
            drawParagraphs(multiParagraph, canvas, brush, shadow, textDecoration);
        } else if (brush instanceof SolidColor) {
            drawParagraphs(multiParagraph, canvas, brush, shadow, textDecoration);
        } else if (brush instanceof ShaderBrush) {
            List paragraphInfoList = multiParagraph.getParagraphInfoList();
            int size = paragraphInfoList.size();
            float f = 0.0f;
            float f2 = 0.0f;
            for (int i = 0; i < size; i++) {
                ParagraphInfo paragraphInfo = (ParagraphInfo) paragraphInfoList.get(i);
                f2 += paragraphInfo.getParagraph().getHeight();
                f = Math.max(f, paragraphInfo.getParagraph().getWidth());
            }
            Shader mo1428createShaderuvyYCjk = ((ShaderBrush) brush).mo1428createShaderuvyYCjk(SizeKt.Size(f, f2));
            Matrix matrix = new Matrix();
            mo1428createShaderuvyYCjk.getLocalMatrix(matrix);
            List paragraphInfoList2 = multiParagraph.getParagraphInfoList();
            int size2 = paragraphInfoList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ParagraphInfo paragraphInfo2 = (ParagraphInfo) paragraphInfoList2.get(i2);
                paragraphInfo2.getParagraph().paint(canvas, BrushKt.ShaderBrush(mo1428createShaderuvyYCjk), shadow, textDecoration);
                canvas.translate(0.0f, paragraphInfo2.getParagraph().getHeight());
                matrix.setTranslate(0.0f, -paragraphInfo2.getParagraph().getHeight());
                mo1428createShaderuvyYCjk.setLocalMatrix(matrix);
            }
        }
        canvas.restore();
    }

    private static final void drawParagraphs(MultiParagraph multiParagraph, Canvas canvas, Brush brush, Shadow shadow, TextDecoration textDecoration) {
        List paragraphInfoList = multiParagraph.getParagraphInfoList();
        int size = paragraphInfoList.size();
        for (int i = 0; i < size; i++) {
            ParagraphInfo paragraphInfo = (ParagraphInfo) paragraphInfoList.get(i);
            paragraphInfo.getParagraph().paint(canvas, brush, shadow, textDecoration);
            canvas.translate(0.0f, paragraphInfo.getParagraph().getHeight());
        }
    }
}
