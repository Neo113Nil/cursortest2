package org.commonmark.parser;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import coil3.Image;
import coil3.target.Target;
import com.withpersona.sdk2.inquiry.steps.ui.components.ESignatureComponent;
import com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiSignatureFieldBinding;
import io.noties.markwon.MarkwonConfiguration;
import io.noties.markwon.MarkwonVisitor$NodeVisitor;
import io.noties.markwon.RenderPropsImpl;
import io.noties.markwon.SpannableBuilder;
import io.noties.markwon.core.factory.CodeSpanFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.text.MatchResult;
import net.idrnd.face.iad.capture.Plane;
import net.idrnd.face.iad.capture.internal.y0;
import okhttp3.internal.ws.RealWebSocket$connect$1;
import org.commonmark.internal.DocumentParser;
import org.commonmark.internal.InlineParserImpl;
import org.commonmark.node.Node;

/* loaded from: classes9.dex */
public final class Parser {
    public final Object blockParserFactories;
    public final Object delimiterProcessors;
    public final Object inlineParserFactory;
    public final Object postProcessors;

    public Parser(Builder builder) {
        ArrayList arrayList = (ArrayList) builder.blockParserFactories;
        LinkedHashSet linkedHashSet = (LinkedHashSet) builder.enabledBlockTypes;
        LinkedHashSet linkedHashSet2 = DocumentParser.CORE_FACTORY_TYPES;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(arrayList);
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList2.add(DocumentParser.NODES_TO_CORE_FACTORIES.get((Class) it.next()));
        }
        this.blockParserFactories = arrayList2;
        this.inlineParserFactory = new y0();
        this.postProcessors = (ArrayList) builder.postProcessors;
        ArrayList arrayList3 = (ArrayList) builder.delimiterProcessors;
        this.delimiterProcessors = arrayList3;
        new InlineParserImpl(new RealWebSocket$connect$1(13, arrayList3, Collections.EMPTY_MAP));
    }

    public void blockEnd(Node node) {
        if (((Node) node.next) != null) {
            ensureNewLine();
            ((SpannableBuilder) this.postProcessors).append('\n');
        }
    }

    public void ensureNewLine() {
        SpannableBuilder spannableBuilder = (SpannableBuilder) this.postProcessors;
        StringBuilder sb = spannableBuilder.builder;
        if (sb.length() <= 0 || '\n' == sb.charAt(sb.length() - 1)) {
            return;
        }
        spannableBuilder.append('\n');
    }

    public int length() {
        return ((SpannableBuilder) this.postProcessors).builder.length();
    }

    public void setSpansForNodeOptional(Node node, int i) {
        Class<?> cls = node.getClass();
        MarkwonConfiguration markwonConfiguration = (MarkwonConfiguration) this.blockParserFactories;
        CodeSpanFactory codeSpanFactory = (CodeSpanFactory) ((Map) ((MatchResult.Destructured) markwonConfiguration.spansFactory).match).get(cls);
        if (codeSpanFactory != null) {
            Object spans = codeSpanFactory.getSpans(markwonConfiguration, (RenderPropsImpl) this.delimiterProcessors);
            SpannableBuilder spannableBuilder = (SpannableBuilder) this.postProcessors;
            StringBuilder sb = spannableBuilder.builder;
            int length = sb.length();
            int length2 = sb.length();
            if (length <= i || i < 0 || length > length2) {
                return;
            }
            SpannableBuilder.setSpansInternal(spannableBuilder, spans, i, length);
        }
    }

    public void visit(Node node) {
        MarkwonVisitor$NodeVisitor markwonVisitor$NodeVisitor = (MarkwonVisitor$NodeVisitor) ((Map) this.inlineParserFactory).get(node.getClass());
        if (markwonVisitor$NodeVisitor != null) {
            markwonVisitor$NodeVisitor.visit(this, node);
        } else {
            visitChildren(node);
        }
    }

    public void visitChildren(Node node) {
        Node node2 = (Node) node.firstChild;
        while (node2 != null) {
            Node node3 = (Node) node2.next;
            node2.accept(this);
            node2 = node3;
        }
    }

    public final class Builder implements Target {
        public final Object blockParserFactories;
        public final Object delimiterProcessors;
        public final Object enabledBlockTypes;
        public final Object postProcessors;

        public Builder() {
            this.blockParserFactories = new ArrayList();
            this.delimiterProcessors = new ArrayList();
            this.postProcessors = new ArrayList();
            this.enabledBlockTypes = DocumentParser.CORE_FACTORY_TYPES;
        }

        @Override // coil3.target.Target
        public void onError(Image image) {
            ((Pi2UiSignatureFieldBinding) this.delimiterProcessors).addSignatureLabel.setVisibility(0);
        }

        @Override // coil3.target.Target
        public void onStart(Image image) {
            Pi2UiSignatureFieldBinding pi2UiSignatureFieldBinding = (Pi2UiSignatureFieldBinding) this.blockParserFactories;
            pi2UiSignatureFieldBinding.addSignatureLabel.setVisibility(8);
            pi2UiSignatureFieldBinding.editSignatureIcon.setVisibility(8);
            pi2UiSignatureFieldBinding.signaturePreview.setVisibility(8);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // coil3.target.Target
        public void onSuccess(Image image) {
            Bitmap bitmap;
            Pi2UiSignatureFieldBinding pi2UiSignatureFieldBinding = (Pi2UiSignatureFieldBinding) this.enabledBlockTypes;
            BitmapDrawable bitmapDrawable = image instanceof BitmapDrawable ? (BitmapDrawable) image : null;
            if (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) {
                return;
            }
            ((ESignatureComponent) this.postProcessors).bitmapController._bitmapValue.setValue(bitmap);
            pi2UiSignatureFieldBinding.signaturePreview.setVisibility(0);
            pi2UiSignatureFieldBinding.editSignatureIcon.setVisibility(0);
        }

        public Builder(Pi2UiSignatureFieldBinding pi2UiSignatureFieldBinding, Pi2UiSignatureFieldBinding pi2UiSignatureFieldBinding2, ESignatureComponent eSignatureComponent, Pi2UiSignatureFieldBinding pi2UiSignatureFieldBinding3) {
            this.blockParserFactories = pi2UiSignatureFieldBinding;
            this.delimiterProcessors = pi2UiSignatureFieldBinding2;
            this.postProcessors = eSignatureComponent;
            this.enabledBlockTypes = pi2UiSignatureFieldBinding3;
        }
    }

    public Parser(MarkwonConfiguration markwonConfiguration, RenderPropsImpl renderPropsImpl, SpannableBuilder spannableBuilder, Map map, Plane plane) {
        this.blockParserFactories = markwonConfiguration;
        this.delimiterProcessors = renderPropsImpl;
        this.postProcessors = spannableBuilder;
        this.inlineParserFactory = map;
    }
}
