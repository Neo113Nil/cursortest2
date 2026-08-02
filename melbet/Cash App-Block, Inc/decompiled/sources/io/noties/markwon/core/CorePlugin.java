package io.noties.markwon.core;

import io.noties.markwon.MarkwonConfiguration;
import io.noties.markwon.RenderPropsImpl;
import io.noties.markwon.SpannableBuilder;
import java.util.ArrayList;
import net.idrnd.face.iad.capture.Plane;
import org.commonmark.node.Block;
import org.commonmark.parser.Parser;

/* loaded from: classes9.dex */
public final class CorePlugin {
    public final ArrayList onTextAddedListeners = new ArrayList(0);

    public static void visitCodeBlock(Parser parser, String str, String str2, Block block) {
        parser.ensureNewLine();
        int length = parser.length();
        SpannableBuilder spannableBuilder = (SpannableBuilder) parser.postProcessors;
        StringBuilder sb = spannableBuilder.builder;
        sb.append((char) 160);
        sb.append('\n');
        ((Plane) ((MarkwonConfiguration) parser.blockParserFactories).syntaxHighlight).getClass();
        spannableBuilder.copySpans(sb.length(), str2);
        sb.append((CharSequence) str2);
        parser.ensureNewLine();
        spannableBuilder.append((char) 160);
        CoreProps.CODE_BLOCK_INFO.set((RenderPropsImpl) parser.delimiterProcessors, str);
        parser.setSpansForNodeOptional(block, length);
        parser.blockEnd(block);
    }
}
