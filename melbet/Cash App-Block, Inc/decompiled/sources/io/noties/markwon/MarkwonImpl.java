package io.noties.markwon;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.activity.result.ActivityResultLauncher;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.view.PreviewView;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.bumptech.glide.load.engine.Jobs;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.workflow1.internal.SubtreeManager;
import com.withpersona.sdk2.camera.CameraPreview;
import com.withpersona.sdk2.camera.CameraXBinder;
import com.withpersona.sdk2.camera.SelfieDirectionFeed;
import com.withpersona.sdk2.inquiry.launchers.ReusableActivityResultLauncher;
import com.withpersona.sdk2.inquiry.selfie.OldSelfieCameraScreenViewFactory$1$1$1$cameraController$1$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.selfie.databinding.Pi2OldSelfieCameraBinding;
import com.withpersona.sdk2.inquiry.selfie.selfieStep.SelfieStepFragment;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.ui.UiStepFileSelectWorker;
import com.withpersona.sdk2.inquiry.ui.UiStepFileSelectWorker$Factory$create$2;
import dagger.Lazy;
import io.noties.markwon.MarkwonConfiguration;
import io.noties.markwon.Prop;
import io.noties.markwon.RenderPropsImpl;
import io.noties.markwon.SpannableBuilder;
import io.noties.markwon.core.CorePlugin;
import io.noties.markwon.core.CoreProps;
import io.noties.markwon.core.MarkwonTheme;
import io.noties.markwon.core.factory.CodeSpanFactory;
import io.noties.markwon.core.spans.OrderedListItemSpan;
import io.noties.markwon.core.spans.TextViewSpan;
import io.noties.markwon.image.ImageProps;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.reflect.full.KClasses$$Lambda$1;
import kotlin.text.MatchResult;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.StateFlowImpl;
import net.idrnd.face.iad.capture.Plane;
import net.idrnd.face.iad.capture.internal.y0;
import net.oneformapp.helper.matching.POPMatchingFactory;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http2.Http2Connection$$ExternalSyntheticLambda3;
import okhttp3.internal.ws.RealWebSocket$connect$1;
import okio.ByteString;
import okio.Path$$ExternalSyntheticBUOutline0;
import okio.Sink;
import okio.Socket;
import okio.Source;
import org.commonmark.internal.DocumentParser;
import org.commonmark.internal.InlineParserImpl;
import org.commonmark.node.Block;
import org.commonmark.node.BlockQuote;
import org.commonmark.node.BulletList;
import org.commonmark.node.Code;
import org.commonmark.node.Document;
import org.commonmark.node.Emphasis;
import org.commonmark.node.FencedCodeBlock;
import org.commonmark.node.HardLineBreak;
import org.commonmark.node.Heading;
import org.commonmark.node.Image;
import org.commonmark.node.IndentedCodeBlock;
import org.commonmark.node.Link;
import org.commonmark.node.ListBlock;
import org.commonmark.node.ListItem;
import org.commonmark.node.Node;
import org.commonmark.node.OrderedList;
import org.commonmark.node.Paragraph;
import org.commonmark.node.SoftLineBreak;
import org.commonmark.node.StrongEmphasis;
import org.commonmark.node.Text;
import org.commonmark.node.ThematicBreak;
import org.commonmark.parser.Parser;
import org.commonmark.parser.block.AbstractBlockParser;
import org.intellij.markdown.parser.LookaheadText$Position;

/* loaded from: classes9.dex */
public final class MarkwonImpl implements CameraXBinder, Socket {
    public final Object parser;
    public Object plugins;
    public Object visitorFactory;

    public MarkwonImpl(Exchange exchange) {
        this.plugins = exchange;
        ExchangeCodec exchangeCodec = (ExchangeCodec) exchange.codec;
        this.parser = new Exchange.RequestBodySink(exchange, exchangeCodec.getSocket().getSink(), -1L, true);
        this.visitorFactory = new Exchange.ResponseBodySource(exchange, exchangeCodec.getSocket().getSource(), -1L, true);
    }

    public static MarkwonImpl create(Context context) {
        ArrayList arrayList = new ArrayList(3);
        TextView.BufferType bufferType = TextView.BufferType.SPANNABLE;
        arrayList.add(new CorePlugin());
        arrayList.add(new CorePlugin());
        if (arrayList.isEmpty()) {
            a$$ExternalSyntheticBUOutline0.m$1("No plugins were added to this builder. Use #usePlugin method to add them");
            return null;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        HashSet hashSet = new HashSet(3);
        Iterator it = arrayList.iterator();
        while (true) {
            final int i = 0;
            if (!it.hasNext()) {
                Parser.Builder builder = new Parser.Builder();
                float f = context.getResources().getDisplayMetrics().density;
                MarkwonTheme markwonTheme = new MarkwonTheme();
                markwonTheme.codeBlockMargin = (int) ((8.0f * f) + 0.5f);
                markwonTheme.blockMargin = (int) ((24.0f * f) + 0.5f);
                int i2 = (int) ((4.0f * f) + 0.5f);
                markwonTheme.blockQuoteWidth = i2;
                int i3 = (int) ((1.0f * f) + 0.5f);
                markwonTheme.bulletListItemStrokeWidth = i3;
                markwonTheme.headingBreakHeight = i3;
                markwonTheme.thematicBreakHeight = i2;
                SubtreeManager subtreeManager = new SubtreeManager();
                Jobs jobs = new Jobs(1);
                HashMap hashMap = new HashMap(3);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    final CorePlugin corePlugin = (CorePlugin) it2.next();
                    corePlugin.getClass();
                    jobs.on(Text.class, new MarkwonVisitor$NodeVisitor() { // from class: io.noties.markwon.core.CorePlugin.1
                        @Override // io.noties.markwon.MarkwonVisitor$NodeVisitor
                        public final void visit(Parser parser, Node node) {
                            String str = ((Text) node).literal;
                            ((SpannableBuilder) parser.postProcessors).builder.append(str);
                            ArrayList arrayList3 = CorePlugin.this.onTextAddedListeners;
                            if (arrayList3.isEmpty()) {
                                return;
                            }
                            parser.length();
                            str.getClass();
                            Iterator it3 = arrayList3.iterator();
                            if (it3.hasNext()) {
                                throw Recorder$$ExternalSyntheticOutline2.m(it3);
                            }
                        }
                    });
                    jobs.on(StrongEmphasis.class, new MarkwonVisitor$NodeVisitor() { // from class: io.noties.markwon.core.CorePlugin.2
                        @Override // io.noties.markwon.MarkwonVisitor$NodeVisitor
                        public final void visit(Parser parser, Node node) {
                            boolean z = false;
                            int i4 = 0;
                            z = false;
                            switch (i) {
                                case 0:
                                    Node node2 = (StrongEmphasis) node;
                                    int length = parser.length();
                                    parser.visitChildren(node2);
                                    parser.setSpansForNodeOptional(node2, length);
                                    break;
                                case 1:
                                    Node node3 = (ThematicBreak) node;
                                    parser.ensureNewLine();
                                    int length2 = parser.length();
                                    ((SpannableBuilder) parser.postProcessors).append((char) 160);
                                    parser.setSpansForNodeOptional(node3, length2);
                                    parser.blockEnd(node3);
                                    break;
                                case 2:
                                    Heading heading = (Heading) node;
                                    parser.ensureNewLine();
                                    int length3 = parser.length();
                                    parser.visitChildren(heading);
                                    CoreProps.HEADING_LEVEL.set((RenderPropsImpl) parser.delimiterProcessors, Integer.valueOf(heading.level));
                                    parser.setSpansForNodeOptional(heading, length3);
                                    parser.blockEnd(heading);
                                    break;
                                case 3:
                                    ((SpannableBuilder) parser.postProcessors).append(' ');
                                    break;
                                case 4:
                                    parser.ensureNewLine();
                                    break;
                                case 5:
                                    Node node4 = (Paragraph) node;
                                    Block block = (Block) ((Node) node4.parent);
                                    if (block != null) {
                                        Block block2 = (Block) ((Node) block.parent);
                                        if (block2 instanceof ListBlock) {
                                            z = ((ListBlock) block2).tight;
                                        }
                                    }
                                    if (!z) {
                                        parser.ensureNewLine();
                                    }
                                    int length4 = parser.length();
                                    parser.visitChildren(node4);
                                    CoreProps.PARAGRAPH_IS_IN_TIGHT_LIST.set((RenderPropsImpl) parser.delimiterProcessors, Boolean.valueOf(z));
                                    parser.setSpansForNodeOptional(node4, length4);
                                    if (!z) {
                                        parser.blockEnd(node4);
                                        break;
                                    }
                                    break;
                                case 6:
                                    Link link = (Link) node;
                                    int length5 = parser.length();
                                    parser.visitChildren(link);
                                    CoreProps.LINK_DESTINATION.set((RenderPropsImpl) parser.delimiterProcessors, link.destination);
                                    parser.setSpansForNodeOptional(link, length5);
                                    break;
                                case 7:
                                    Node node5 = (Emphasis) node;
                                    int length6 = parser.length();
                                    parser.visitChildren(node5);
                                    parser.setSpansForNodeOptional(node5, length6);
                                    break;
                                case 8:
                                    Node node6 = (BlockQuote) node;
                                    parser.ensureNewLine();
                                    int length7 = parser.length();
                                    parser.visitChildren(node6);
                                    parser.setSpansForNodeOptional(node6, length7);
                                    parser.blockEnd(node6);
                                    break;
                                case 9:
                                    Code code = (Code) node;
                                    int length8 = parser.length();
                                    SpannableBuilder spannableBuilder = (SpannableBuilder) parser.postProcessors;
                                    StringBuilder sb = spannableBuilder.builder;
                                    sb.append((char) 160);
                                    sb.append(code.literal);
                                    spannableBuilder.append((char) 160);
                                    parser.setSpansForNodeOptional(code, length8);
                                    break;
                                case 10:
                                    FencedCodeBlock fencedCodeBlock = (FencedCodeBlock) node;
                                    CorePlugin.visitCodeBlock(parser, fencedCodeBlock.info, fencedCodeBlock.literal, fencedCodeBlock);
                                    break;
                                case 11:
                                    IndentedCodeBlock indentedCodeBlock = (IndentedCodeBlock) node;
                                    CorePlugin.visitCodeBlock(parser, null, indentedCodeBlock.literal, indentedCodeBlock);
                                    break;
                                case 12:
                                    SpannableBuilder spannableBuilder2 = (SpannableBuilder) parser.postProcessors;
                                    Image image = (Image) node;
                                    MarkwonConfiguration markwonConfiguration = (MarkwonConfiguration) parser.blockParserFactories;
                                    CodeSpanFactory codeSpanFactory = (CodeSpanFactory) ((Map) ((MatchResult.Destructured) markwonConfiguration.spansFactory).match).get(Image.class);
                                    if (codeSpanFactory == null) {
                                        parser.visitChildren(image);
                                        break;
                                    } else {
                                        int length9 = parser.length();
                                        parser.visitChildren(image);
                                        if (length9 == parser.length()) {
                                            spannableBuilder2.append((char) 65532);
                                        }
                                        boolean z2 = ((Node) image.parent) instanceof Link;
                                        POPMatchingFactory pOPMatchingFactory = (POPMatchingFactory) markwonConfiguration.imageDestinationProcessor;
                                        String str = image.destination;
                                        pOPMatchingFactory.getClass();
                                        RenderPropsImpl renderPropsImpl = (RenderPropsImpl) parser.delimiterProcessors;
                                        ImageProps.DESTINATION.set(renderPropsImpl, str);
                                        ImageProps.REPLACEMENT_TEXT_IS_LINK.set(renderPropsImpl, Boolean.valueOf(z2));
                                        ImageProps.IMAGE_SIZE.set(renderPropsImpl, null);
                                        Object spans = codeSpanFactory.getSpans(markwonConfiguration, renderPropsImpl);
                                        StringBuilder sb2 = spannableBuilder2.builder;
                                        int length10 = sb2.length();
                                        int length11 = sb2.length();
                                        if (length10 > length9 && length9 >= 0 && length10 <= length11) {
                                            SpannableBuilder.setSpansInternal(spannableBuilder2, spans, length9, length10);
                                            break;
                                        }
                                    }
                                    break;
                                case 13:
                                    Node node7 = (ListItem) node;
                                    int length12 = parser.length();
                                    RenderPropsImpl renderPropsImpl2 = (RenderPropsImpl) parser.delimiterProcessors;
                                    parser.visitChildren(node7);
                                    Block block3 = (Block) ((Node) node7.parent);
                                    boolean z3 = block3 instanceof OrderedList;
                                    Prop prop = CoreProps.LIST_ITEM_TYPE;
                                    if (z3) {
                                        OrderedList orderedList = (OrderedList) block3;
                                        int i5 = orderedList.startNumber;
                                        prop.set(renderPropsImpl2, CoreProps.ListItemType.ORDERED);
                                        CoreProps.ORDERED_LIST_ITEM_NUMBER.set(renderPropsImpl2, Integer.valueOf(i5));
                                        orderedList.startNumber++;
                                    } else {
                                        prop.set(renderPropsImpl2, CoreProps.ListItemType.BULLET);
                                        for (Node node8 = (Block) ((Node) node7.parent); node8 != null; node8 = node8.getParent()) {
                                            if (node8 instanceof ListItem) {
                                                i4++;
                                            }
                                        }
                                        CoreProps.BULLET_LIST_ITEM_LEVEL.set(renderPropsImpl2, Integer.valueOf(i4));
                                    }
                                    parser.setSpansForNodeOptional(node7, length12);
                                    if (((Node) node7.next) != null) {
                                        parser.ensureNewLine();
                                        break;
                                    }
                                    break;
                                default:
                                    parser.ensureNewLine();
                                    int length13 = parser.length();
                                    parser.visitChildren(node);
                                    parser.setSpansForNodeOptional(node, length13);
                                    parser.blockEnd(node);
                                    break;
                            }
                        }
                    });
                    final int i4 = 7;
                    jobs.on(Emphasis.class, new MarkwonVisitor$NodeVisitor() { // from class: io.noties.markwon.core.CorePlugin.2
                        @Override // io.noties.markwon.MarkwonVisitor$NodeVisitor
                        public final void visit(Parser parser, Node node) {
                            boolean z = false;
                            int i42 = 0;
                            z = false;
                            switch (i4) {
                                case 0:
                                    Node node2 = (StrongEmphasis) node;
                                    int length = parser.length();
                                    parser.visitChildren(node2);
                                    parser.setSpansForNodeOptional(node2, length);
                                    break;
                                case 1:
                                    Node node3 = (ThematicBreak) node;
                                    parser.ensureNewLine();
                                    int length2 = parser.length();
                                    ((SpannableBuilder) parser.postProcessors).append((char) 160);
                                    parser.setSpansForNodeOptional(node3, length2);
                                    parser.blockEnd(node3);
                                    break;
                                case 2:
                                    Heading heading = (Heading) node;
                                    parser.ensureNewLine();
                                    int length3 = parser.length();
                                    parser.visitChildren(heading);
                                    CoreProps.HEADING_LEVEL.set((RenderPropsImpl) parser.delimiterProcessors, Integer.valueOf(heading.level));
                                    parser.setSpansForNodeOptional(heading, length3);
                                    parser.blockEnd(heading);
                                    break;
                                case 3:
                                    ((SpannableBuilder) parser.postProcessors).append(' ');
                                    break;
                                case 4:
                                    parser.ensureNewLine();
                                    break;
                                case 5:
                                    Node node4 = (Paragraph) node;
                                    Block block = (Block) ((Node) node4.parent);
                                    if (block != null) {
                                        Block block2 = (Block) ((Node) block.parent);
                                        if (block2 instanceof ListBlock) {
                                            z = ((ListBlock) block2).tight;
                                        }
                                    }
                                    if (!z) {
                                        parser.ensureNewLine();
                                    }
                                    int length4 = parser.length();
                                    parser.visitChildren(node4);
                                    CoreProps.PARAGRAPH_IS_IN_TIGHT_LIST.set((RenderPropsImpl) parser.delimiterProcessors, Boolean.valueOf(z));
                                    parser.setSpansForNodeOptional(node4, length4);
                                    if (!z) {
                                        parser.blockEnd(node4);
                                        break;
                                    }
                                    break;
                                case 6:
                                    Link link = (Link) node;
                                    int length5 = parser.length();
                                    parser.visitChildren(link);
                                    CoreProps.LINK_DESTINATION.set((RenderPropsImpl) parser.delimiterProcessors, link.destination);
                                    parser.setSpansForNodeOptional(link, length5);
                                    break;
                                case 7:
                                    Node node5 = (Emphasis) node;
                                    int length6 = parser.length();
                                    parser.visitChildren(node5);
                                    parser.setSpansForNodeOptional(node5, length6);
                                    break;
                                case 8:
                                    Node node6 = (BlockQuote) node;
                                    parser.ensureNewLine();
                                    int length7 = parser.length();
                                    parser.visitChildren(node6);
                                    parser.setSpansForNodeOptional(node6, length7);
                                    parser.blockEnd(node6);
                                    break;
                                case 9:
                                    Code code = (Code) node;
                                    int length8 = parser.length();
                                    SpannableBuilder spannableBuilder = (SpannableBuilder) parser.postProcessors;
                                    StringBuilder sb = spannableBuilder.builder;
                                    sb.append((char) 160);
                                    sb.append(code.literal);
                                    spannableBuilder.append((char) 160);
                                    parser.setSpansForNodeOptional(code, length8);
                                    break;
                                case 10:
                                    FencedCodeBlock fencedCodeBlock = (FencedCodeBlock) node;
                                    CorePlugin.visitCodeBlock(parser, fencedCodeBlock.info, fencedCodeBlock.literal, fencedCodeBlock);
                                    break;
                                case 11:
                                    IndentedCodeBlock indentedCodeBlock = (IndentedCodeBlock) node;
                                    CorePlugin.visitCodeBlock(parser, null, indentedCodeBlock.literal, indentedCodeBlock);
                                    break;
                                case 12:
                                    SpannableBuilder spannableBuilder2 = (SpannableBuilder) parser.postProcessors;
                                    Image image = (Image) node;
                                    MarkwonConfiguration markwonConfiguration = (MarkwonConfiguration) parser.blockParserFactories;
                                    CodeSpanFactory codeSpanFactory = (CodeSpanFactory) ((Map) ((MatchResult.Destructured) markwonConfiguration.spansFactory).match).get(Image.class);
                                    if (codeSpanFactory == null) {
                                        parser.visitChildren(image);
                                        break;
                                    } else {
                                        int length9 = parser.length();
                                        parser.visitChildren(image);
                                        if (length9 == parser.length()) {
                                            spannableBuilder2.append((char) 65532);
                                        }
                                        boolean z2 = ((Node) image.parent) instanceof Link;
                                        POPMatchingFactory pOPMatchingFactory = (POPMatchingFactory) markwonConfiguration.imageDestinationProcessor;
                                        String str = image.destination;
                                        pOPMatchingFactory.getClass();
                                        RenderPropsImpl renderPropsImpl = (RenderPropsImpl) parser.delimiterProcessors;
                                        ImageProps.DESTINATION.set(renderPropsImpl, str);
                                        ImageProps.REPLACEMENT_TEXT_IS_LINK.set(renderPropsImpl, Boolean.valueOf(z2));
                                        ImageProps.IMAGE_SIZE.set(renderPropsImpl, null);
                                        Object spans = codeSpanFactory.getSpans(markwonConfiguration, renderPropsImpl);
                                        StringBuilder sb2 = spannableBuilder2.builder;
                                        int length10 = sb2.length();
                                        int length11 = sb2.length();
                                        if (length10 > length9 && length9 >= 0 && length10 <= length11) {
                                            SpannableBuilder.setSpansInternal(spannableBuilder2, spans, length9, length10);
                                            break;
                                        }
                                    }
                                    break;
                                case 13:
                                    Node node7 = (ListItem) node;
                                    int length12 = parser.length();
                                    RenderPropsImpl renderPropsImpl2 = (RenderPropsImpl) parser.delimiterProcessors;
                                    parser.visitChildren(node7);
                                    Block block3 = (Block) ((Node) node7.parent);
                                    boolean z3 = block3 instanceof OrderedList;
                                    Prop prop = CoreProps.LIST_ITEM_TYPE;
                                    if (z3) {
                                        OrderedList orderedList = (OrderedList) block3;
                                        int i5 = orderedList.startNumber;
                                        prop.set(renderPropsImpl2, CoreProps.ListItemType.ORDERED);
                                        CoreProps.ORDERED_LIST_ITEM_NUMBER.set(renderPropsImpl2, Integer.valueOf(i5));
                                        orderedList.startNumber++;
                                    } else {
                                        prop.set(renderPropsImpl2, CoreProps.ListItemType.BULLET);
                                        for (Node node8 = (Block) ((Node) node7.parent); node8 != null; node8 = node8.getParent()) {
                                            if (node8 instanceof ListItem) {
                                                i42++;
                                            }
                                        }
                                        CoreProps.BULLET_LIST_ITEM_LEVEL.set(renderPropsImpl2, Integer.valueOf(i42));
                                    }
                                    parser.setSpansForNodeOptional(node7, length12);
                                    if (((Node) node7.next) != null) {
                                        parser.ensureNewLine();
                                        break;
                                    }
                                    break;
                                default:
                                    parser.ensureNewLine();
                                    int length13 = parser.length();
                                    parser.visitChildren(node);
                                    parser.setSpansForNodeOptional(node, length13);
                                    parser.blockEnd(node);
                                    break;
                            }
                        }
                    });
                    final int i5 = 8;
                    jobs.on(BlockQuote.class, new MarkwonVisitor$NodeVisitor() { // from class: io.noties.markwon.core.CorePlugin.2
                        @Override // io.noties.markwon.MarkwonVisitor$NodeVisitor
                        public final void visit(Parser parser, Node node) {
                            boolean z = false;
                            int i42 = 0;
                            z = false;
                            switch (i5) {
                                case 0:
                                    Node node2 = (StrongEmphasis) node;
                                    int length = parser.length();
                                    parser.visitChildren(node2);
                                    parser.setSpansForNodeOptional(node2, length);
                                    break;
                                case 1:
                                    Node node3 = (ThematicBreak) node;
                                    parser.ensureNewLine();
                                    int length2 = parser.length();
                                    ((SpannableBuilder) parser.postProcessors).append((char) 160);
                                    parser.setSpansForNodeOptional(node3, length2);
                                    parser.blockEnd(node3);
                                    break;
                                case 2:
                                    Heading heading = (Heading) node;
                                    parser.ensureNewLine();
                                    int length3 = parser.length();
                                    parser.visitChildren(heading);
                                    CoreProps.HEADING_LEVEL.set((RenderPropsImpl) parser.delimiterProcessors, Integer.valueOf(heading.level));
                                    parser.setSpansForNodeOptional(heading, length3);
                                    parser.blockEnd(heading);
                                    break;
                                case 3:
                                    ((SpannableBuilder) parser.postProcessors).append(' ');
                                    break;
                                case 4:
                                    parser.ensureNewLine();
                                    break;
                                case 5:
                                    Node node4 = (Paragraph) node;
                                    Block block = (Block) ((Node) node4.parent);
                                    if (block != null) {
                                        Block block2 = (Block) ((Node) block.parent);
                                        if (block2 instanceof ListBlock) {
                                            z = ((ListBlock) block2).tight;
                                        }
                                    }
                                    if (!z) {
                                        parser.ensureNewLine();
                                    }
                                    int length4 = parser.length();
                                    parser.visitChildren(node4);
                                    CoreProps.PARAGRAPH_IS_IN_TIGHT_LIST.set((RenderPropsImpl) parser.delimiterProcessors, Boolean.valueOf(z));
                                    parser.setSpansForNodeOptional(node4, length4);
                                    if (!z) {
                                        parser.blockEnd(node4);
                                        break;
                                    }
                                    break;
                                case 6:
                                    Link link = (Link) node;
                                    int length5 = parser.length();
                                    parser.visitChildren(link);
                                    CoreProps.LINK_DESTINATION.set((RenderPropsImpl) parser.delimiterProcessors, link.destination);
                                    parser.setSpansForNodeOptional(link, length5);
                                    break;
                                case 7:
                                    Node node5 = (Emphasis) node;
                                    int length6 = parser.length();
                                    parser.visitChildren(node5);
                                    parser.setSpansForNodeOptional(node5, length6);
                                    break;
                                case 8:
                                    Node node6 = (BlockQuote) node;
                                    parser.ensureNewLine();
                                    int length7 = parser.length();
                                    parser.visitChildren(node6);
                                    parser.setSpansForNodeOptional(node6, length7);
                                    parser.blockEnd(node6);
                                    break;
                                case 9:
                                    Code code = (Code) node;
                                    int length8 = parser.length();
                                    SpannableBuilder spannableBuilder = (SpannableBuilder) parser.postProcessors;
                                    StringBuilder sb = spannableBuilder.builder;
                                    sb.append((char) 160);
                                    sb.append(code.literal);
                                    spannableBuilder.append((char) 160);
                                    parser.setSpansForNodeOptional(code, length8);
                                    break;
                                case 10:
                                    FencedCodeBlock fencedCodeBlock = (FencedCodeBlock) node;
                                    CorePlugin.visitCodeBlock(parser, fencedCodeBlock.info, fencedCodeBlock.literal, fencedCodeBlock);
                                    break;
                                case 11:
                                    IndentedCodeBlock indentedCodeBlock = (IndentedCodeBlock) node;
                                    CorePlugin.visitCodeBlock(parser, null, indentedCodeBlock.literal, indentedCodeBlock);
                                    break;
                                case 12:
                                    SpannableBuilder spannableBuilder2 = (SpannableBuilder) parser.postProcessors;
                                    Image image = (Image) node;
                                    MarkwonConfiguration markwonConfiguration = (MarkwonConfiguration) parser.blockParserFactories;
                                    CodeSpanFactory codeSpanFactory = (CodeSpanFactory) ((Map) ((MatchResult.Destructured) markwonConfiguration.spansFactory).match).get(Image.class);
                                    if (codeSpanFactory == null) {
                                        parser.visitChildren(image);
                                        break;
                                    } else {
                                        int length9 = parser.length();
                                        parser.visitChildren(image);
                                        if (length9 == parser.length()) {
                                            spannableBuilder2.append((char) 65532);
                                        }
                                        boolean z2 = ((Node) image.parent) instanceof Link;
                                        POPMatchingFactory pOPMatchingFactory = (POPMatchingFactory) markwonConfiguration.imageDestinationProcessor;
                                        String str = image.destination;
                                        pOPMatchingFactory.getClass();
                                        RenderPropsImpl renderPropsImpl = (RenderPropsImpl) parser.delimiterProcessors;
                                        ImageProps.DESTINATION.set(renderPropsImpl, str);
                                        ImageProps.REPLACEMENT_TEXT_IS_LINK.set(renderPropsImpl, Boolean.valueOf(z2));
                                        ImageProps.IMAGE_SIZE.set(renderPropsImpl, null);
                                        Object spans = codeSpanFactory.getSpans(markwonConfiguration, renderPropsImpl);
                                        StringBuilder sb2 = spannableBuilder2.builder;
                                        int length10 = sb2.length();
                                        int length11 = sb2.length();
                                        if (length10 > length9 && length9 >= 0 && length10 <= length11) {
                                            SpannableBuilder.setSpansInternal(spannableBuilder2, spans, length9, length10);
                                            break;
                                        }
                                    }
                                    break;
                                case 13:
                                    Node node7 = (ListItem) node;
                                    int length12 = parser.length();
                                    RenderPropsImpl renderPropsImpl2 = (RenderPropsImpl) parser.delimiterProcessors;
                                    parser.visitChildren(node7);
                                    Block block3 = (Block) ((Node) node7.parent);
                                    boolean z3 = block3 instanceof OrderedList;
                                    Prop prop = CoreProps.LIST_ITEM_TYPE;
                                    if (z3) {
                                        OrderedList orderedList = (OrderedList) block3;
                                        int i52 = orderedList.startNumber;
                                        prop.set(renderPropsImpl2, CoreProps.ListItemType.ORDERED);
                                        CoreProps.ORDERED_LIST_ITEM_NUMBER.set(renderPropsImpl2, Integer.valueOf(i52));
                                        orderedList.startNumber++;
                                    } else {
                                        prop.set(renderPropsImpl2, CoreProps.ListItemType.BULLET);
                                        for (Node node8 = (Block) ((Node) node7.parent); node8 != null; node8 = node8.getParent()) {
                                            if (node8 instanceof ListItem) {
                                                i42++;
                                            }
                                        }
                                        CoreProps.BULLET_LIST_ITEM_LEVEL.set(renderPropsImpl2, Integer.valueOf(i42));
                                    }
                                    parser.setSpansForNodeOptional(node7, length12);
                                    if (((Node) node7.next) != null) {
                                        parser.ensureNewLine();
                                        break;
                                    }
                                    break;
                                default:
                                    parser.ensureNewLine();
                                    int length13 = parser.length();
                                    parser.visitChildren(node);
                                    parser.setSpansForNodeOptional(node, length13);
                                    parser.blockEnd(node);
                                    break;
                            }
                        }
                    });
                    final int i6 = 9;
                    jobs.on(Code.class, new MarkwonVisitor$NodeVisitor() { // from class: io.noties.markwon.core.CorePlugin.2
                        @Override // io.noties.markwon.MarkwonVisitor$NodeVisitor
                        public final void visit(Parser parser, Node node) {
                            boolean z = false;
                            int i42 = 0;
                            z = false;
                            switch (i6) {
                                case 0:
                                    Node node2 = (StrongEmphasis) node;
                                    int length = parser.length();
                                    parser.visitChildren(node2);
                                    parser.setSpansForNodeOptional(node2, length);
                                    break;
                                case 1:
                                    Node node3 = (ThematicBreak) node;
                                    parser.ensureNewLine();
                                    int length2 = parser.length();
                                    ((SpannableBuilder) parser.postProcessors).append((char) 160);
                                    parser.setSpansForNodeOptional(node3, length2);
                                    parser.blockEnd(node3);
                                    break;
                                case 2:
                                    Heading heading = (Heading) node;
                                    parser.ensureNewLine();
                                    int length3 = parser.length();
                                    parser.visitChildren(heading);
                                    CoreProps.HEADING_LEVEL.set((RenderPropsImpl) parser.delimiterProcessors, Integer.valueOf(heading.level));
                                    parser.setSpansForNodeOptional(heading, length3);
                                    parser.blockEnd(heading);
                                    break;
                                case 3:
                                    ((SpannableBuilder) parser.postProcessors).append(' ');
                                    break;
                                case 4:
                                    parser.ensureNewLine();
                                    break;
                                case 5:
                                    Node node4 = (Paragraph) node;
                                    Block block = (Block) ((Node) node4.parent);
                                    if (block != null) {
                                        Block block2 = (Block) ((Node) block.parent);
                                        if (block2 instanceof ListBlock) {
                                            z = ((ListBlock) block2).tight;
                                        }
                                    }
                                    if (!z) {
                                        parser.ensureNewLine();
                                    }
                                    int length4 = parser.length();
                                    parser.visitChildren(node4);
                                    CoreProps.PARAGRAPH_IS_IN_TIGHT_LIST.set((RenderPropsImpl) parser.delimiterProcessors, Boolean.valueOf(z));
                                    parser.setSpansForNodeOptional(node4, length4);
                                    if (!z) {
                                        parser.blockEnd(node4);
                                        break;
                                    }
                                    break;
                                case 6:
                                    Link link = (Link) node;
                                    int length5 = parser.length();
                                    parser.visitChildren(link);
                                    CoreProps.LINK_DESTINATION.set((RenderPropsImpl) parser.delimiterProcessors, link.destination);
                                    parser.setSpansForNodeOptional(link, length5);
                                    break;
                                case 7:
                                    Node node5 = (Emphasis) node;
                                    int length6 = parser.length();
                                    parser.visitChildren(node5);
                                    parser.setSpansForNodeOptional(node5, length6);
                                    break;
                                case 8:
                                    Node node6 = (BlockQuote) node;
                                    parser.ensureNewLine();
                                    int length7 = parser.length();
                                    parser.visitChildren(node6);
                                    parser.setSpansForNodeOptional(node6, length7);
                                    parser.blockEnd(node6);
                                    break;
                                case 9:
                                    Code code = (Code) node;
                                    int length8 = parser.length();
                                    SpannableBuilder spannableBuilder = (SpannableBuilder) parser.postProcessors;
                                    StringBuilder sb = spannableBuilder.builder;
                                    sb.append((char) 160);
                                    sb.append(code.literal);
                                    spannableBuilder.append((char) 160);
                                    parser.setSpansForNodeOptional(code, length8);
                                    break;
                                case 10:
                                    FencedCodeBlock fencedCodeBlock = (FencedCodeBlock) node;
                                    CorePlugin.visitCodeBlock(parser, fencedCodeBlock.info, fencedCodeBlock.literal, fencedCodeBlock);
                                    break;
                                case 11:
                                    IndentedCodeBlock indentedCodeBlock = (IndentedCodeBlock) node;
                                    CorePlugin.visitCodeBlock(parser, null, indentedCodeBlock.literal, indentedCodeBlock);
                                    break;
                                case 12:
                                    SpannableBuilder spannableBuilder2 = (SpannableBuilder) parser.postProcessors;
                                    Image image = (Image) node;
                                    MarkwonConfiguration markwonConfiguration = (MarkwonConfiguration) parser.blockParserFactories;
                                    CodeSpanFactory codeSpanFactory = (CodeSpanFactory) ((Map) ((MatchResult.Destructured) markwonConfiguration.spansFactory).match).get(Image.class);
                                    if (codeSpanFactory == null) {
                                        parser.visitChildren(image);
                                        break;
                                    } else {
                                        int length9 = parser.length();
                                        parser.visitChildren(image);
                                        if (length9 == parser.length()) {
                                            spannableBuilder2.append((char) 65532);
                                        }
                                        boolean z2 = ((Node) image.parent) instanceof Link;
                                        POPMatchingFactory pOPMatchingFactory = (POPMatchingFactory) markwonConfiguration.imageDestinationProcessor;
                                        String str = image.destination;
                                        pOPMatchingFactory.getClass();
                                        RenderPropsImpl renderPropsImpl = (RenderPropsImpl) parser.delimiterProcessors;
                                        ImageProps.DESTINATION.set(renderPropsImpl, str);
                                        ImageProps.REPLACEMENT_TEXT_IS_LINK.set(renderPropsImpl, Boolean.valueOf(z2));
                                        ImageProps.IMAGE_SIZE.set(renderPropsImpl, null);
                                        Object spans = codeSpanFactory.getSpans(markwonConfiguration, renderPropsImpl);
                                        StringBuilder sb2 = spannableBuilder2.builder;
                                        int length10 = sb2.length();
                                        int length11 = sb2.length();
                                        if (length10 > length9 && length9 >= 0 && length10 <= length11) {
                                            SpannableBuilder.setSpansInternal(spannableBuilder2, spans, length9, length10);
                                            break;
                                        }
                                    }
                                    break;
                                case 13:
                                    Node node7 = (ListItem) node;
                                    int length12 = parser.length();
                                    RenderPropsImpl renderPropsImpl2 = (RenderPropsImpl) parser.delimiterProcessors;
                                    parser.visitChildren(node7);
                                    Block block3 = (Block) ((Node) node7.parent);
                                    boolean z3 = block3 instanceof OrderedList;
                                    Prop prop = CoreProps.LIST_ITEM_TYPE;
                                    if (z3) {
                                        OrderedList orderedList = (OrderedList) block3;
                                        int i52 = orderedList.startNumber;
                                        prop.set(renderPropsImpl2, CoreProps.ListItemType.ORDERED);
                                        CoreProps.ORDERED_LIST_ITEM_NUMBER.set(renderPropsImpl2, Integer.valueOf(i52));
                                        orderedList.startNumber++;
                                    } else {
                                        prop.set(renderPropsImpl2, CoreProps.ListItemType.BULLET);
                                        for (Node node8 = (Block) ((Node) node7.parent); node8 != null; node8 = node8.getParent()) {
                                            if (node8 instanceof ListItem) {
                                                i42++;
                                            }
                                        }
                                        CoreProps.BULLET_LIST_ITEM_LEVEL.set(renderPropsImpl2, Integer.valueOf(i42));
                                    }
                                    parser.setSpansForNodeOptional(node7, length12);
                                    if (((Node) node7.next) != null) {
                                        parser.ensureNewLine();
                                        break;
                                    }
                                    break;
                                default:
                                    parser.ensureNewLine();
                                    int length13 = parser.length();
                                    parser.visitChildren(node);
                                    parser.setSpansForNodeOptional(node, length13);
                                    parser.blockEnd(node);
                                    break;
                            }
                        }
                    });
                    final int i7 = 10;
                    jobs.on(FencedCodeBlock.class, new MarkwonVisitor$NodeVisitor() { // from class: io.noties.markwon.core.CorePlugin.2
                        @Override // io.noties.markwon.MarkwonVisitor$NodeVisitor
                        public final void visit(Parser parser, Node node) {
                            boolean z = false;
                            int i42 = 0;
                            z = false;
                            switch (i7) {
                                case 0:
                                    Node node2 = (StrongEmphasis) node;
                                    int length = parser.length();
                                    parser.visitChildren(node2);
                                    parser.setSpansForNodeOptional(node2, length);
                                    break;
                                case 1:
                                    Node node3 = (ThematicBreak) node;
                                    parser.ensureNewLine();
                                    int length2 = parser.length();
                                    ((SpannableBuilder) parser.postProcessors).append((char) 160);
                                    parser.setSpansForNodeOptional(node3, length2);
                                    parser.blockEnd(node3);
                                    break;
                                case 2:
                                    Heading heading = (Heading) node;
                                    parser.ensureNewLine();
                                    int length3 = parser.length();
                                    parser.visitChildren(heading);
                                    CoreProps.HEADING_LEVEL.set((RenderPropsImpl) parser.delimiterProcessors, Integer.valueOf(heading.level));
                                    parser.setSpansForNodeOptional(heading, length3);
                                    parser.blockEnd(heading);
                                    break;
                                case 3:
                                    ((SpannableBuilder) parser.postProcessors).append(' ');
                                    break;
                                case 4:
                                    parser.ensureNewLine();
                                    break;
                                case 5:
                                    Node node4 = (Paragraph) node;
                                    Block block = (Block) ((Node) node4.parent);
                                    if (block != null) {
                                        Block block2 = (Block) ((Node) block.parent);
                                        if (block2 instanceof ListBlock) {
                                            z = ((ListBlock) block2).tight;
                                        }
                                    }
                                    if (!z) {
                                        parser.ensureNewLine();
                                    }
                                    int length4 = parser.length();
                                    parser.visitChildren(node4);
                                    CoreProps.PARAGRAPH_IS_IN_TIGHT_LIST.set((RenderPropsImpl) parser.delimiterProcessors, Boolean.valueOf(z));
                                    parser.setSpansForNodeOptional(node4, length4);
                                    if (!z) {
                                        parser.blockEnd(node4);
                                        break;
                                    }
                                    break;
                                case 6:
                                    Link link = (Link) node;
                                    int length5 = parser.length();
                                    parser.visitChildren(link);
                                    CoreProps.LINK_DESTINATION.set((RenderPropsImpl) parser.delimiterProcessors, link.destination);
                                    parser.setSpansForNodeOptional(link, length5);
                                    break;
                                case 7:
                                    Node node5 = (Emphasis) node;
                                    int length6 = parser.length();
                                    parser.visitChildren(node5);
                                    parser.setSpansForNodeOptional(node5, length6);
                                    break;
                                case 8:
                                    Node node6 = (BlockQuote) node;
                                    parser.ensureNewLine();
                                    int length7 = parser.length();
                                    parser.visitChildren(node6);
                                    parser.setSpansForNodeOptional(node6, length7);
                                    parser.blockEnd(node6);
                                    break;
                                case 9:
                                    Code code = (Code) node;
                                    int length8 = parser.length();
                                    SpannableBuilder spannableBuilder = (SpannableBuilder) parser.postProcessors;
                                    StringBuilder sb = spannableBuilder.builder;
                                    sb.append((char) 160);
                                    sb.append(code.literal);
                                    spannableBuilder.append((char) 160);
                                    parser.setSpansForNodeOptional(code, length8);
                                    break;
                                case 10:
                                    FencedCodeBlock fencedCodeBlock = (FencedCodeBlock) node;
                                    CorePlugin.visitCodeBlock(parser, fencedCodeBlock.info, fencedCodeBlock.literal, fencedCodeBlock);
                                    break;
                                case 11:
                                    IndentedCodeBlock indentedCodeBlock = (IndentedCodeBlock) node;
                                    CorePlugin.visitCodeBlock(parser, null, indentedCodeBlock.literal, indentedCodeBlock);
                                    break;
                                case 12:
                                    SpannableBuilder spannableBuilder2 = (SpannableBuilder) parser.postProcessors;
                                    Image image = (Image) node;
                                    MarkwonConfiguration markwonConfiguration = (MarkwonConfiguration) parser.blockParserFactories;
                                    CodeSpanFactory codeSpanFactory = (CodeSpanFactory) ((Map) ((MatchResult.Destructured) markwonConfiguration.spansFactory).match).get(Image.class);
                                    if (codeSpanFactory == null) {
                                        parser.visitChildren(image);
                                        break;
                                    } else {
                                        int length9 = parser.length();
                                        parser.visitChildren(image);
                                        if (length9 == parser.length()) {
                                            spannableBuilder2.append((char) 65532);
                                        }
                                        boolean z2 = ((Node) image.parent) instanceof Link;
                                        POPMatchingFactory pOPMatchingFactory = (POPMatchingFactory) markwonConfiguration.imageDestinationProcessor;
                                        String str = image.destination;
                                        pOPMatchingFactory.getClass();
                                        RenderPropsImpl renderPropsImpl = (RenderPropsImpl) parser.delimiterProcessors;
                                        ImageProps.DESTINATION.set(renderPropsImpl, str);
                                        ImageProps.REPLACEMENT_TEXT_IS_LINK.set(renderPropsImpl, Boolean.valueOf(z2));
                                        ImageProps.IMAGE_SIZE.set(renderPropsImpl, null);
                                        Object spans = codeSpanFactory.getSpans(markwonConfiguration, renderPropsImpl);
                                        StringBuilder sb2 = spannableBuilder2.builder;
                                        int length10 = sb2.length();
                                        int length11 = sb2.length();
                                        if (length10 > length9 && length9 >= 0 && length10 <= length11) {
                                            SpannableBuilder.setSpansInternal(spannableBuilder2, spans, length9, length10);
                                            break;
                                        }
                                    }
                                    break;
                                case 13:
                                    Node node7 = (ListItem) node;
                                    int length12 = parser.length();
                                    RenderPropsImpl renderPropsImpl2 = (RenderPropsImpl) parser.delimiterProcessors;
                                    parser.visitChildren(node7);
                                    Block block3 = (Block) ((Node) node7.parent);
                                    boolean z3 = block3 instanceof OrderedList;
                                    Prop prop = CoreProps.LIST_ITEM_TYPE;
                                    if (z3) {
                                        OrderedList orderedList = (OrderedList) block3;
                                        int i52 = orderedList.startNumber;
                                        prop.set(renderPropsImpl2, CoreProps.ListItemType.ORDERED);
                                        CoreProps.ORDERED_LIST_ITEM_NUMBER.set(renderPropsImpl2, Integer.valueOf(i52));
                                        orderedList.startNumber++;
                                    } else {
                                        prop.set(renderPropsImpl2, CoreProps.ListItemType.BULLET);
                                        for (Node node8 = (Block) ((Node) node7.parent); node8 != null; node8 = node8.getParent()) {
                                            if (node8 instanceof ListItem) {
                                                i42++;
                                            }
                                        }
                                        CoreProps.BULLET_LIST_ITEM_LEVEL.set(renderPropsImpl2, Integer.valueOf(i42));
                                    }
                                    parser.setSpansForNodeOptional(node7, length12);
                                    if (((Node) node7.next) != null) {
                                        parser.ensureNewLine();
                                        break;
                                    }
                                    break;
                                default:
                                    parser.ensureNewLine();
                                    int length13 = parser.length();
                                    parser.visitChildren(node);
                                    parser.setSpansForNodeOptional(node, length13);
                                    parser.blockEnd(node);
                                    break;
                            }
                        }
                    });
                    final int i8 = 11;
                    jobs.on(IndentedCodeBlock.class, new MarkwonVisitor$NodeVisitor() { // from class: io.noties.markwon.core.CorePlugin.2
                        @Override // io.noties.markwon.MarkwonVisitor$NodeVisitor
                        public final void visit(Parser parser, Node node) {
                            boolean z = false;
                            int i42 = 0;
                            z = false;
                            switch (i8) {
                                case 0:
                                    Node node2 = (StrongEmphasis) node;
                                    int length = parser.length();
                                    parser.visitChildren(node2);
                                    parser.setSpansForNodeOptional(node2, length);
                                    break;
                                case 1:
                                    Node node3 = (ThematicBreak) node;
                                    parser.ensureNewLine();
                                    int length2 = parser.length();
                                    ((SpannableBuilder) parser.postProcessors).append((char) 160);
                                    parser.setSpansForNodeOptional(node3, length2);
                                    parser.blockEnd(node3);
                                    break;
                                case 2:
                                    Heading heading = (Heading) node;
                                    parser.ensureNewLine();
                                    int length3 = parser.length();
                                    parser.visitChildren(heading);
                                    CoreProps.HEADING_LEVEL.set((RenderPropsImpl) parser.delimiterProcessors, Integer.valueOf(heading.level));
                                    parser.setSpansForNodeOptional(heading, length3);
                                    parser.blockEnd(heading);
                                    break;
                                case 3:
                                    ((SpannableBuilder) parser.postProcessors).append(' ');
                                    break;
                                case 4:
                                    parser.ensureNewLine();
                                    break;
                                case 5:
                                    Node node4 = (Paragraph) node;
                                    Block block = (Block) ((Node) node4.parent);
                                    if (block != null) {
                                        Block block2 = (Block) ((Node) block.parent);
                                        if (block2 instanceof ListBlock) {
                                            z = ((ListBlock) block2).tight;
                                        }
                                    }
                                    if (!z) {
                                        parser.ensureNewLine();
                                    }
                                    int length4 = parser.length();
                                    parser.visitChildren(node4);
                                    CoreProps.PARAGRAPH_IS_IN_TIGHT_LIST.set((RenderPropsImpl) parser.delimiterProcessors, Boolean.valueOf(z));
                                    parser.setSpansForNodeOptional(node4, length4);
                                    if (!z) {
                                        parser.blockEnd(node4);
                                        break;
                                    }
                                    break;
                                case 6:
                                    Link link = (Link) node;
                                    int length5 = parser.length();
                                    parser.visitChildren(link);
                                    CoreProps.LINK_DESTINATION.set((RenderPropsImpl) parser.delimiterProcessors, link.destination);
                                    parser.setSpansForNodeOptional(link, length5);
                                    break;
                                case 7:
                                    Node node5 = (Emphasis) node;
                                    int length6 = parser.length();
                                    parser.visitChildren(node5);
                                    parser.setSpansForNodeOptional(node5, length6);
                                    break;
                                case 8:
                                    Node node6 = (BlockQuote) node;
                                    parser.ensureNewLine();
                                    int length7 = parser.length();
                                    parser.visitChildren(node6);
                                    parser.setSpansForNodeOptional(node6, length7);
                                    parser.blockEnd(node6);
                                    break;
                                case 9:
                                    Code code = (Code) node;
                                    int length8 = parser.length();
                                    SpannableBuilder spannableBuilder = (SpannableBuilder) parser.postProcessors;
                                    StringBuilder sb = spannableBuilder.builder;
                                    sb.append((char) 160);
                                    sb.append(code.literal);
                                    spannableBuilder.append((char) 160);
                                    parser.setSpansForNodeOptional(code, length8);
                                    break;
                                case 10:
                                    FencedCodeBlock fencedCodeBlock = (FencedCodeBlock) node;
                                    CorePlugin.visitCodeBlock(parser, fencedCodeBlock.info, fencedCodeBlock.literal, fencedCodeBlock);
                                    break;
                                case 11:
                                    IndentedCodeBlock indentedCodeBlock = (IndentedCodeBlock) node;
                                    CorePlugin.visitCodeBlock(parser, null, indentedCodeBlock.literal, indentedCodeBlock);
                                    break;
                                case 12:
                                    SpannableBuilder spannableBuilder2 = (SpannableBuilder) parser.postProcessors;
                                    Image image = (Image) node;
                                    MarkwonConfiguration markwonConfiguration = (MarkwonConfiguration) parser.blockParserFactories;
                                    CodeSpanFactory codeSpanFactory = (CodeSpanFactory) ((Map) ((MatchResult.Destructured) markwonConfiguration.spansFactory).match).get(Image.class);
                                    if (codeSpanFactory == null) {
                                        parser.visitChildren(image);
                                        break;
                                    } else {
                                        int length9 = parser.length();
                                        parser.visitChildren(image);
                                        if (length9 == parser.length()) {
                                            spannableBuilder2.append((char) 65532);
                                        }
                                        boolean z2 = ((Node) image.parent) instanceof Link;
                                        POPMatchingFactory pOPMatchingFactory = (POPMatchingFactory) markwonConfiguration.imageDestinationProcessor;
                                        String str = image.destination;
                                        pOPMatchingFactory.getClass();
                                        RenderPropsImpl renderPropsImpl = (RenderPropsImpl) parser.delimiterProcessors;
                                        ImageProps.DESTINATION.set(renderPropsImpl, str);
                                        ImageProps.REPLACEMENT_TEXT_IS_LINK.set(renderPropsImpl, Boolean.valueOf(z2));
                                        ImageProps.IMAGE_SIZE.set(renderPropsImpl, null);
                                        Object spans = codeSpanFactory.getSpans(markwonConfiguration, renderPropsImpl);
                                        StringBuilder sb2 = spannableBuilder2.builder;
                                        int length10 = sb2.length();
                                        int length11 = sb2.length();
                                        if (length10 > length9 && length9 >= 0 && length10 <= length11) {
                                            SpannableBuilder.setSpansInternal(spannableBuilder2, spans, length9, length10);
                                            break;
                                        }
                                    }
                                    break;
                                case 13:
                                    Node node7 = (ListItem) node;
                                    int length12 = parser.length();
                                    RenderPropsImpl renderPropsImpl2 = (RenderPropsImpl) parser.delimiterProcessors;
                                    parser.visitChildren(node7);
                                    Block block3 = (Block) ((Node) node7.parent);
                                    boolean z3 = block3 instanceof OrderedList;
                                    Prop prop = CoreProps.LIST_ITEM_TYPE;
                                    if (z3) {
                                        OrderedList orderedList = (OrderedList) block3;
                                        int i52 = orderedList.startNumber;
                                        prop.set(renderPropsImpl2, CoreProps.ListItemType.ORDERED);
                                        CoreProps.ORDERED_LIST_ITEM_NUMBER.set(renderPropsImpl2, Integer.valueOf(i52));
                                        orderedList.startNumber++;
                                    } else {
                                        prop.set(renderPropsImpl2, CoreProps.ListItemType.BULLET);
                                        for (Node node8 = (Block) ((Node) node7.parent); node8 != null; node8 = node8.getParent()) {
                                            if (node8 instanceof ListItem) {
                                                i42++;
                                            }
                                        }
                                        CoreProps.BULLET_LIST_ITEM_LEVEL.set(renderPropsImpl2, Integer.valueOf(i42));
                                    }
                                    parser.setSpansForNodeOptional(node7, length12);
                                    if (((Node) node7.next) != null) {
                                        parser.ensureNewLine();
                                        break;
                                    }
                                    break;
                                default:
                                    parser.ensureNewLine();
                                    int length13 = parser.length();
                                    parser.visitChildren(node);
                                    parser.setSpansForNodeOptional(node, length13);
                                    parser.blockEnd(node);
                                    break;
                            }
                        }
                    });
                    final int i9 = 12;
                    jobs.on(Image.class, new MarkwonVisitor$NodeVisitor() { // from class: io.noties.markwon.core.CorePlugin.2
                        @Override // io.noties.markwon.MarkwonVisitor$NodeVisitor
                        public final void visit(Parser parser, Node node) {
                            boolean z = false;
                            int i42 = 0;
                            z = false;
                            switch (i9) {
                                case 0:
                                    Node node2 = (StrongEmphasis) node;
                                    int length = parser.length();
                                    parser.visitChildren(node2);
                                    parser.setSpansForNodeOptional(node2, length);
                                    break;
                                case 1:
                                    Node node3 = (ThematicBreak) node;
                                    parser.ensureNewLine();
                                    int length2 = parser.length();
                                    ((SpannableBuilder) parser.postProcessors).append((char) 160);
                                    parser.setSpansForNodeOptional(node3, length2);
                                    parser.blockEnd(node3);
                                    break;
                                case 2:
                                    Heading heading = (Heading) node;
                                    parser.ensureNewLine();
                                    int length3 = parser.length();
                                    parser.visitChildren(heading);
                                    CoreProps.HEADING_LEVEL.set((RenderPropsImpl) parser.delimiterProcessors, Integer.valueOf(heading.level));
                                    parser.setSpansForNodeOptional(heading, length3);
                                    parser.blockEnd(heading);
                                    break;
                                case 3:
                                    ((SpannableBuilder) parser.postProcessors).append(' ');
                                    break;
                                case 4:
                                    parser.ensureNewLine();
                                    break;
                                case 5:
                                    Node node4 = (Paragraph) node;
                                    Block block = (Block) ((Node) node4.parent);
                                    if (block != null) {
                                        Block block2 = (Block) ((Node) block.parent);
                                        if (block2 instanceof ListBlock) {
                                            z = ((ListBlock) block2).tight;
                                        }
                                    }
                                    if (!z) {
                                        parser.ensureNewLine();
                                    }
                                    int length4 = parser.length();
                                    parser.visitChildren(node4);
                                    CoreProps.PARAGRAPH_IS_IN_TIGHT_LIST.set((RenderPropsImpl) parser.delimiterProcessors, Boolean.valueOf(z));
                                    parser.setSpansForNodeOptional(node4, length4);
                                    if (!z) {
                                        parser.blockEnd(node4);
                                        break;
                                    }
                                    break;
                                case 6:
                                    Link link = (Link) node;
                                    int length5 = parser.length();
                                    parser.visitChildren(link);
                                    CoreProps.LINK_DESTINATION.set((RenderPropsImpl) parser.delimiterProcessors, link.destination);
                                    parser.setSpansForNodeOptional(link, length5);
                                    break;
                                case 7:
                                    Node node5 = (Emphasis) node;
                                    int length6 = parser.length();
                                    parser.visitChildren(node5);
                                    parser.setSpansForNodeOptional(node5, length6);
                                    break;
                                case 8:
                                    Node node6 = (BlockQuote) node;
                                    parser.ensureNewLine();
                                    int length7 = parser.length();
                                    parser.visitChildren(node6);
                                    parser.setSpansForNodeOptional(node6, length7);
                                    parser.blockEnd(node6);
                                    break;
                                case 9:
                                    Code code = (Code) node;
                                    int length8 = parser.length();
                                    SpannableBuilder spannableBuilder = (SpannableBuilder) parser.postProcessors;
                                    StringBuilder sb = spannableBuilder.builder;
                                    sb.append((char) 160);
                                    sb.append(code.literal);
                                    spannableBuilder.append((char) 160);
                                    parser.setSpansForNodeOptional(code, length8);
                                    break;
                                case 10:
                                    FencedCodeBlock fencedCodeBlock = (FencedCodeBlock) node;
                                    CorePlugin.visitCodeBlock(parser, fencedCodeBlock.info, fencedCodeBlock.literal, fencedCodeBlock);
                                    break;
                                case 11:
                                    IndentedCodeBlock indentedCodeBlock = (IndentedCodeBlock) node;
                                    CorePlugin.visitCodeBlock(parser, null, indentedCodeBlock.literal, indentedCodeBlock);
                                    break;
                                case 12:
                                    SpannableBuilder spannableBuilder2 = (SpannableBuilder) parser.postProcessors;
                                    Image image = (Image) node;
                                    MarkwonConfiguration markwonConfiguration = (MarkwonConfiguration) parser.blockParserFactories;
                                    CodeSpanFactory codeSpanFactory = (CodeSpanFactory) ((Map) ((MatchResult.Destructured) markwonConfiguration.spansFactory).match).get(Image.class);
                                    if (codeSpanFactory == null) {
                                        parser.visitChildren(image);
                                        break;
                                    } else {
                                        int length9 = parser.length();
                                        parser.visitChildren(image);
                                        if (length9 == parser.length()) {
                                            spannableBuilder2.append((char) 65532);
                                        }
                                        boolean z2 = ((Node) image.parent) instanceof Link;
                                        POPMatchingFactory pOPMatchingFactory = (POPMatchingFactory) markwonConfiguration.imageDestinationProcessor;
                                        String str = image.destination;
                                        pOPMatchingFactory.getClass();
                                        RenderPropsImpl renderPropsImpl = (RenderPropsImpl) parser.delimiterProcessors;
                                        ImageProps.DESTINATION.set(renderPropsImpl, str);
                                        ImageProps.REPLACEMENT_TEXT_IS_LINK.set(renderPropsImpl, Boolean.valueOf(z2));
                                        ImageProps.IMAGE_SIZE.set(renderPropsImpl, null);
                                        Object spans = codeSpanFactory.getSpans(markwonConfiguration, renderPropsImpl);
                                        StringBuilder sb2 = spannableBuilder2.builder;
                                        int length10 = sb2.length();
                                        int length11 = sb2.length();
                                        if (length10 > length9 && length9 >= 0 && length10 <= length11) {
                                            SpannableBuilder.setSpansInternal(spannableBuilder2, spans, length9, length10);
                                            break;
                                        }
                                    }
                                    break;
                                case 13:
                                    Node node7 = (ListItem) node;
                                    int length12 = parser.length();
                                    RenderPropsImpl renderPropsImpl2 = (RenderPropsImpl) parser.delimiterProcessors;
                                    parser.visitChildren(node7);
                                    Block block3 = (Block) ((Node) node7.parent);
                                    boolean z3 = block3 instanceof OrderedList;
                                    Prop prop = CoreProps.LIST_ITEM_TYPE;
                                    if (z3) {
                                        OrderedList orderedList = (OrderedList) block3;
                                        int i52 = orderedList.startNumber;
                                        prop.set(renderPropsImpl2, CoreProps.ListItemType.ORDERED);
                                        CoreProps.ORDERED_LIST_ITEM_NUMBER.set(renderPropsImpl2, Integer.valueOf(i52));
                                        orderedList.startNumber++;
                                    } else {
                                        prop.set(renderPropsImpl2, CoreProps.ListItemType.BULLET);
                                        for (Node node8 = (Block) ((Node) node7.parent); node8 != null; node8 = node8.getParent()) {
                                            if (node8 instanceof ListItem) {
                                                i42++;
                                            }
                                        }
                                        CoreProps.BULLET_LIST_ITEM_LEVEL.set(renderPropsImpl2, Integer.valueOf(i42));
                                    }
                                    parser.setSpansForNodeOptional(node7, length12);
                                    if (((Node) node7.next) != null) {
                                        parser.ensureNewLine();
                                        break;
                                    }
                                    break;
                                default:
                                    parser.ensureNewLine();
                                    int length13 = parser.length();
                                    parser.visitChildren(node);
                                    parser.setSpansForNodeOptional(node, length13);
                                    parser.blockEnd(node);
                                    break;
                            }
                        }
                    });
                    final int i10 = 14;
                    jobs.on(BulletList.class, new MarkwonVisitor$NodeVisitor() { // from class: io.noties.markwon.core.CorePlugin.2
                        @Override // io.noties.markwon.MarkwonVisitor$NodeVisitor
                        public final void visit(Parser parser, Node node) {
                            boolean z = false;
                            int i42 = 0;
                            z = false;
                            switch (i10) {
                                case 0:
                                    Node node2 = (StrongEmphasis) node;
                                    int length = parser.length();
                                    parser.visitChildren(node2);
                                    parser.setSpansForNodeOptional(node2, length);
                                    break;
                                case 1:
                                    Node node3 = (ThematicBreak) node;
                                    parser.ensureNewLine();
                                    int length2 = parser.length();
                                    ((SpannableBuilder) parser.postProcessors).append((char) 160);
                                    parser.setSpansForNodeOptional(node3, length2);
                                    parser.blockEnd(node3);
                                    break;
                                case 2:
                                    Heading heading = (Heading) node;
                                    parser.ensureNewLine();
                                    int length3 = parser.length();
                                    parser.visitChildren(heading);
                                    CoreProps.HEADING_LEVEL.set((RenderPropsImpl) parser.delimiterProcessors, Integer.valueOf(heading.level));
                                    parser.setSpansForNodeOptional(heading, length3);
                                    parser.blockEnd(heading);
                                    break;
                                case 3:
                                    ((SpannableBuilder) parser.postProcessors).append(' ');
                                    break;
                                case 4:
                                    parser.ensureNewLine();
                                    break;
                                case 5:
                                    Node node4 = (Paragraph) node;
                                    Block block = (Block) ((Node) node4.parent);
                                    if (block != null) {
                                        Block block2 = (Block) ((Node) block.parent);
                                        if (block2 instanceof ListBlock) {
                                            z = ((ListBlock) block2).tight;
                                        }
                                    }
                                    if (!z) {
                                        parser.ensureNewLine();
                                    }
                                    int length4 = parser.length();
                                    parser.visitChildren(node4);
                                    CoreProps.PARAGRAPH_IS_IN_TIGHT_LIST.set((RenderPropsImpl) parser.delimiterProcessors, Boolean.valueOf(z));
                                    parser.setSpansForNodeOptional(node4, length4);
                                    if (!z) {
                                        parser.blockEnd(node4);
                                        break;
                                    }
                                    break;
                                case 6:
                                    Link link = (Link) node;
                                    int length5 = parser.length();
                                    parser.visitChildren(link);
                                    CoreProps.LINK_DESTINATION.set((RenderPropsImpl) parser.delimiterProcessors, link.destination);
                                    parser.setSpansForNodeOptional(link, length5);
                                    break;
                                case 7:
                                    Node node5 = (Emphasis) node;
                                    int length6 = parser.length();
                                    parser.visitChildren(node5);
                                    parser.setSpansForNodeOptional(node5, length6);
                                    break;
                                case 8:
                                    Node node6 = (BlockQuote) node;
                                    parser.ensureNewLine();
                                    int length7 = parser.length();
                                    parser.visitChildren(node6);
                                    parser.setSpansForNodeOptional(node6, length7);
                                    parser.blockEnd(node6);
                                    break;
                                case 9:
                                    Code code = (Code) node;
                                    int length8 = parser.length();
                                    SpannableBuilder spannableBuilder = (SpannableBuilder) parser.postProcessors;
                                    StringBuilder sb = spannableBuilder.builder;
                                    sb.append((char) 160);
                                    sb.append(code.literal);
                                    spannableBuilder.append((char) 160);
                                    parser.setSpansForNodeOptional(code, length8);
                                    break;
                                case 10:
                                    FencedCodeBlock fencedCodeBlock = (FencedCodeBlock) node;
                                    CorePlugin.visitCodeBlock(parser, fencedCodeBlock.info, fencedCodeBlock.literal, fencedCodeBlock);
                                    break;
                                case 11:
                                    IndentedCodeBlock indentedCodeBlock = (IndentedCodeBlock) node;
                                    CorePlugin.visitCodeBlock(parser, null, indentedCodeBlock.literal, indentedCodeBlock);
                                    break;
                                case 12:
                                    SpannableBuilder spannableBuilder2 = (SpannableBuilder) parser.postProcessors;
                                    Image image = (Image) node;
                                    MarkwonConfiguration markwonConfiguration = (MarkwonConfiguration) parser.blockParserFactories;
                                    CodeSpanFactory codeSpanFactory = (CodeSpanFactory) ((Map) ((MatchResult.Destructured) markwonConfiguration.spansFactory).match).get(Image.class);
                                    if (codeSpanFactory == null) {
                                        parser.visitChildren(image);
                                        break;
                                    } else {
                                        int length9 = parser.length();
                                        parser.visitChildren(image);
                                        if (length9 == parser.length()) {
                                            spannableBuilder2.append((char) 65532);
                                        }
                                        boolean z2 = ((Node) image.parent) instanceof Link;
                                        POPMatchingFactory pOPMatchingFactory = (POPMatchingFactory) markwonConfiguration.imageDestinationProcessor;
                                        String str = image.destination;
                                        pOPMatchingFactory.getClass();
                                        RenderPropsImpl renderPropsImpl = (RenderPropsImpl) parser.delimiterProcessors;
                                        ImageProps.DESTINATION.set(renderPropsImpl, str);
                                        ImageProps.REPLACEMENT_TEXT_IS_LINK.set(renderPropsImpl, Boolean.valueOf(z2));
                                        ImageProps.IMAGE_SIZE.set(renderPropsImpl, null);
                                        Object spans = codeSpanFactory.getSpans(markwonConfiguration, renderPropsImpl);
                                        StringBuilder sb2 = spannableBuilder2.builder;
                                        int length10 = sb2.length();
                                        int length11 = sb2.length();
                                        if (length10 > length9 && length9 >= 0 && length10 <= length11) {
                                            SpannableBuilder.setSpansInternal(spannableBuilder2, spans, length9, length10);
                                            break;
                                        }
                                    }
                                    break;
                                case 13:
                                    Node node7 = (ListItem) node;
                                    int length12 = parser.length();
                                    RenderPropsImpl renderPropsImpl2 = (RenderPropsImpl) parser.delimiterProcessors;
                                    parser.visitChildren(node7);
                                    Block block3 = (Block) ((Node) node7.parent);
                                    boolean z3 = block3 instanceof OrderedList;
                                    Prop prop = CoreProps.LIST_ITEM_TYPE;
                                    if (z3) {
                                        OrderedList orderedList = (OrderedList) block3;
                                        int i52 = orderedList.startNumber;
                                        prop.set(renderPropsImpl2, CoreProps.ListItemType.ORDERED);
                                        CoreProps.ORDERED_LIST_ITEM_NUMBER.set(renderPropsImpl2, Integer.valueOf(i52));
                                        orderedList.startNumber++;
                                    } else {
                                        prop.set(renderPropsImpl2, CoreProps.ListItemType.BULLET);
                                        for (Node node8 = (Block) ((Node) node7.parent); node8 != null; node8 = node8.getParent()) {
                                            if (node8 instanceof ListItem) {
                                                i42++;
                                            }
                                        }
                                        CoreProps.BULLET_LIST_ITEM_LEVEL.set(renderPropsImpl2, Integer.valueOf(i42));
                                    }
                                    parser.setSpansForNodeOptional(node7, length12);
                                    if (((Node) node7.next) != null) {
                                        parser.ensureNewLine();
                                        break;
                                    }
                                    break;
                                default:
                                    parser.ensureNewLine();
                                    int length13 = parser.length();
                                    parser.visitChildren(node);
                                    parser.setSpansForNodeOptional(node, length13);
                                    parser.blockEnd(node);
                                    break;
                            }
                        }
                    });
                    jobs.on(OrderedList.class, new MarkwonVisitor$NodeVisitor() { // from class: io.noties.markwon.core.CorePlugin.2
                        @Override // io.noties.markwon.MarkwonVisitor$NodeVisitor
                        public final void visit(Parser parser, Node node) {
                            boolean z = false;
                            int i42 = 0;
                            z = false;
                            switch (i10) {
                                case 0:
                                    Node node2 = (StrongEmphasis) node;
                                    int length = parser.length();
                                    parser.visitChildren(node2);
                                    parser.setSpansForNodeOptional(node2, length);
                                    break;
                                case 1:
                                    Node node3 = (ThematicBreak) node;
                                    parser.ensureNewLine();
                                    int length2 = parser.length();
                                    ((SpannableBuilder) parser.postProcessors).append((char) 160);
                                    parser.setSpansForNodeOptional(node3, length2);
                                    parser.blockEnd(node3);
                                    break;
                                case 2:
                                    Heading heading = (Heading) node;
                                    parser.ensureNewLine();
                                    int length3 = parser.length();
                                    parser.visitChildren(heading);
                                    CoreProps.HEADING_LEVEL.set((RenderPropsImpl) parser.delimiterProcessors, Integer.valueOf(heading.level));
                                    parser.setSpansForNodeOptional(heading, length3);
                                    parser.blockEnd(heading);
                                    break;
                                case 3:
                                    ((SpannableBuilder) parser.postProcessors).append(' ');
                                    break;
                                case 4:
                                    parser.ensureNewLine();
                                    break;
                                case 5:
                                    Node node4 = (Paragraph) node;
                                    Block block = (Block) ((Node) node4.parent);
                                    if (block != null) {
                                        Block block2 = (Block) ((Node) block.parent);
                                        if (block2 instanceof ListBlock) {
                                            z = ((ListBlock) block2).tight;
                                        }
                                    }
                                    if (!z) {
                                        parser.ensureNewLine();
                                    }
                                    int length4 = parser.length();
                                    parser.visitChildren(node4);
                                    CoreProps.PARAGRAPH_IS_IN_TIGHT_LIST.set((RenderPropsImpl) parser.delimiterProcessors, Boolean.valueOf(z));
                                    parser.setSpansForNodeOptional(node4, length4);
                                    if (!z) {
                                        parser.blockEnd(node4);
                                        break;
                                    }
                                    break;
                                case 6:
                                    Link link = (Link) node;
                                    int length5 = parser.length();
                                    parser.visitChildren(link);
                                    CoreProps.LINK_DESTINATION.set((RenderPropsImpl) parser.delimiterProcessors, link.destination);
                                    parser.setSpansForNodeOptional(link, length5);
                                    break;
                                case 7:
                                    Node node5 = (Emphasis) node;
                                    int length6 = parser.length();
                                    parser.visitChildren(node5);
                                    parser.setSpansForNodeOptional(node5, length6);
                                    break;
                                case 8:
                                    Node node6 = (BlockQuote) node;
                                    parser.ensureNewLine();
                                    int length7 = parser.length();
                                    parser.visitChildren(node6);
                                    parser.setSpansForNodeOptional(node6, length7);
                                    parser.blockEnd(node6);
                                    break;
                                case 9:
                                    Code code = (Code) node;
                                    int length8 = parser.length();
                                    SpannableBuilder spannableBuilder = (SpannableBuilder) parser.postProcessors;
                                    StringBuilder sb = spannableBuilder.builder;
                                    sb.append((char) 160);
                                    sb.append(code.literal);
                                    spannableBuilder.append((char) 160);
                                    parser.setSpansForNodeOptional(code, length8);
                                    break;
                                case 10:
                                    FencedCodeBlock fencedCodeBlock = (FencedCodeBlock) node;
                                    CorePlugin.visitCodeBlock(parser, fencedCodeBlock.info, fencedCodeBlock.literal, fencedCodeBlock);
                                    break;
                                case 11:
                                    IndentedCodeBlock indentedCodeBlock = (IndentedCodeBlock) node;
                                    CorePlugin.visitCodeBlock(parser, null, indentedCodeBlock.literal, indentedCodeBlock);
                                    break;
                                case 12:
                                    SpannableBuilder spannableBuilder2 = (SpannableBuilder) parser.postProcessors;
                                    Image image = (Image) node;
                                    MarkwonConfiguration markwonConfiguration = (MarkwonConfiguration) parser.blockParserFactories;
                                    CodeSpanFactory codeSpanFactory = (CodeSpanFactory) ((Map) ((MatchResult.Destructured) markwonConfiguration.spansFactory).match).get(Image.class);
                                    if (codeSpanFactory == null) {
                                        parser.visitChildren(image);
                                        break;
                                    } else {
                                        int length9 = parser.length();
                                        parser.visitChildren(image);
                                        if (length9 == parser.length()) {
                                            spannableBuilder2.append((char) 65532);
                                        }
                                        boolean z2 = ((Node) image.parent) instanceof Link;
                                        POPMatchingFactory pOPMatchingFactory = (POPMatchingFactory) markwonConfiguration.imageDestinationProcessor;
                                        String str = image.destination;
                                        pOPMatchingFactory.getClass();
                                        RenderPropsImpl renderPropsImpl = (RenderPropsImpl) parser.delimiterProcessors;
                                        ImageProps.DESTINATION.set(renderPropsImpl, str);
                                        ImageProps.REPLACEMENT_TEXT_IS_LINK.set(renderPropsImpl, Boolean.valueOf(z2));
                                        ImageProps.IMAGE_SIZE.set(renderPropsImpl, null);
                                        Object spans = codeSpanFactory.getSpans(markwonConfiguration, renderPropsImpl);
                                        StringBuilder sb2 = spannableBuilder2.builder;
                                        int length10 = sb2.length();
                                        int length11 = sb2.length();
                                        if (length10 > length9 && length9 >= 0 && length10 <= length11) {
                                            SpannableBuilder.setSpansInternal(spannableBuilder2, spans, length9, length10);
                                            break;
                                        }
                                    }
                                    break;
                                case 13:
                                    Node node7 = (ListItem) node;
                                    int length12 = parser.length();
                                    RenderPropsImpl renderPropsImpl2 = (RenderPropsImpl) parser.delimiterProcessors;
                                    parser.visitChildren(node7);
                                    Block block3 = (Block) ((Node) node7.parent);
                                    boolean z3 = block3 instanceof OrderedList;
                                    Prop prop = CoreProps.LIST_ITEM_TYPE;
                                    if (z3) {
                                        OrderedList orderedList = (OrderedList) block3;
                                        int i52 = orderedList.startNumber;
                                        prop.set(renderPropsImpl2, CoreProps.ListItemType.ORDERED);
                                        CoreProps.ORDERED_LIST_ITEM_NUMBER.set(renderPropsImpl2, Integer.valueOf(i52));
                                        orderedList.startNumber++;
                                    } else {
                                        prop.set(renderPropsImpl2, CoreProps.ListItemType.BULLET);
                                        for (Node node8 = (Block) ((Node) node7.parent); node8 != null; node8 = node8.getParent()) {
                                            if (node8 instanceof ListItem) {
                                                i42++;
                                            }
                                        }
                                        CoreProps.BULLET_LIST_ITEM_LEVEL.set(renderPropsImpl2, Integer.valueOf(i42));
                                    }
                                    parser.setSpansForNodeOptional(node7, length12);
                                    if (((Node) node7.next) != null) {
                                        parser.ensureNewLine();
                                        break;
                                    }
                                    break;
                                default:
                                    parser.ensureNewLine();
                                    int length13 = parser.length();
                                    parser.visitChildren(node);
                                    parser.setSpansForNodeOptional(node, length13);
                                    parser.blockEnd(node);
                                    break;
                            }
                        }
                    });
                    final int i11 = 13;
                    jobs.on(ListItem.class, new MarkwonVisitor$NodeVisitor() { // from class: io.noties.markwon.core.CorePlugin.2
                        @Override // io.noties.markwon.MarkwonVisitor$NodeVisitor
                        public final void visit(Parser parser, Node node) {
                            boolean z = false;
                            int i42 = 0;
                            z = false;
                            switch (i11) {
                                case 0:
                                    Node node2 = (StrongEmphasis) node;
                                    int length = parser.length();
                                    parser.visitChildren(node2);
                                    parser.setSpansForNodeOptional(node2, length);
                                    break;
                                case 1:
                                    Node node3 = (ThematicBreak) node;
                                    parser.ensureNewLine();
                                    int length2 = parser.length();
                                    ((SpannableBuilder) parser.postProcessors).append((char) 160);
                                    parser.setSpansForNodeOptional(node3, length2);
                                    parser.blockEnd(node3);
                                    break;
                                case 2:
                                    Heading heading = (Heading) node;
                                    parser.ensureNewLine();
                                    int length3 = parser.length();
                                    parser.visitChildren(heading);
                                    CoreProps.HEADING_LEVEL.set((RenderPropsImpl) parser.delimiterProcessors, Integer.valueOf(heading.level));
                                    parser.setSpansForNodeOptional(heading, length3);
                                    parser.blockEnd(heading);
                                    break;
                                case 3:
                                    ((SpannableBuilder) parser.postProcessors).append(' ');
                                    break;
                                case 4:
                                    parser.ensureNewLine();
                                    break;
                                case 5:
                                    Node node4 = (Paragraph) node;
                                    Block block = (Block) ((Node) node4.parent);
                                    if (block != null) {
                                        Block block2 = (Block) ((Node) block.parent);
                                        if (block2 instanceof ListBlock) {
                                            z = ((ListBlock) block2).tight;
                                        }
                                    }
                                    if (!z) {
                                        parser.ensureNewLine();
                                    }
                                    int length4 = parser.length();
                                    parser.visitChildren(node4);
                                    CoreProps.PARAGRAPH_IS_IN_TIGHT_LIST.set((RenderPropsImpl) parser.delimiterProcessors, Boolean.valueOf(z));
                                    parser.setSpansForNodeOptional(node4, length4);
                                    if (!z) {
                                        parser.blockEnd(node4);
                                        break;
                                    }
                                    break;
                                case 6:
                                    Link link = (Link) node;
                                    int length5 = parser.length();
                                    parser.visitChildren(link);
                                    CoreProps.LINK_DESTINATION.set((RenderPropsImpl) parser.delimiterProcessors, link.destination);
                                    parser.setSpansForNodeOptional(link, length5);
                                    break;
                                case 7:
                                    Node node5 = (Emphasis) node;
                                    int length6 = parser.length();
                                    parser.visitChildren(node5);
                                    parser.setSpansForNodeOptional(node5, length6);
                                    break;
                                case 8:
                                    Node node6 = (BlockQuote) node;
                                    parser.ensureNewLine();
                                    int length7 = parser.length();
                                    parser.visitChildren(node6);
                                    parser.setSpansForNodeOptional(node6, length7);
                                    parser.blockEnd(node6);
                                    break;
                                case 9:
                                    Code code = (Code) node;
                                    int length8 = parser.length();
                                    SpannableBuilder spannableBuilder = (SpannableBuilder) parser.postProcessors;
                                    StringBuilder sb = spannableBuilder.builder;
                                    sb.append((char) 160);
                                    sb.append(code.literal);
                                    spannableBuilder.append((char) 160);
                                    parser.setSpansForNodeOptional(code, length8);
                                    break;
                                case 10:
                                    FencedCodeBlock fencedCodeBlock = (FencedCodeBlock) node;
                                    CorePlugin.visitCodeBlock(parser, fencedCodeBlock.info, fencedCodeBlock.literal, fencedCodeBlock);
                                    break;
                                case 11:
                                    IndentedCodeBlock indentedCodeBlock = (IndentedCodeBlock) node;
                                    CorePlugin.visitCodeBlock(parser, null, indentedCodeBlock.literal, indentedCodeBlock);
                                    break;
                                case 12:
                                    SpannableBuilder spannableBuilder2 = (SpannableBuilder) parser.postProcessors;
                                    Image image = (Image) node;
                                    MarkwonConfiguration markwonConfiguration = (MarkwonConfiguration) parser.blockParserFactories;
                                    CodeSpanFactory codeSpanFactory = (CodeSpanFactory) ((Map) ((MatchResult.Destructured) markwonConfiguration.spansFactory).match).get(Image.class);
                                    if (codeSpanFactory == null) {
                                        parser.visitChildren(image);
                                        break;
                                    } else {
                                        int length9 = parser.length();
                                        parser.visitChildren(image);
                                        if (length9 == parser.length()) {
                                            spannableBuilder2.append((char) 65532);
                                        }
                                        boolean z2 = ((Node) image.parent) instanceof Link;
                                        POPMatchingFactory pOPMatchingFactory = (POPMatchingFactory) markwonConfiguration.imageDestinationProcessor;
                                        String str = image.destination;
                                        pOPMatchingFactory.getClass();
                                        RenderPropsImpl renderPropsImpl = (RenderPropsImpl) parser.delimiterProcessors;
                                        ImageProps.DESTINATION.set(renderPropsImpl, str);
                                        ImageProps.REPLACEMENT_TEXT_IS_LINK.set(renderPropsImpl, Boolean.valueOf(z2));
                                        ImageProps.IMAGE_SIZE.set(renderPropsImpl, null);
                                        Object spans = codeSpanFactory.getSpans(markwonConfiguration, renderPropsImpl);
                                        StringBuilder sb2 = spannableBuilder2.builder;
                                        int length10 = sb2.length();
                                        int length11 = sb2.length();
                                        if (length10 > length9 && length9 >= 0 && length10 <= length11) {
                                            SpannableBuilder.setSpansInternal(spannableBuilder2, spans, length9, length10);
                                            break;
                                        }
                                    }
                                    break;
                                case 13:
                                    Node node7 = (ListItem) node;
                                    int length12 = parser.length();
                                    RenderPropsImpl renderPropsImpl2 = (RenderPropsImpl) parser.delimiterProcessors;
                                    parser.visitChildren(node7);
                                    Block block3 = (Block) ((Node) node7.parent);
                                    boolean z3 = block3 instanceof OrderedList;
                                    Prop prop = CoreProps.LIST_ITEM_TYPE;
                                    if (z3) {
                                        OrderedList orderedList = (OrderedList) block3;
                                        int i52 = orderedList.startNumber;
                                        prop.set(renderPropsImpl2, CoreProps.ListItemType.ORDERED);
                                        CoreProps.ORDERED_LIST_ITEM_NUMBER.set(renderPropsImpl2, Integer.valueOf(i52));
                                        orderedList.startNumber++;
                                    } else {
                                        prop.set(renderPropsImpl2, CoreProps.ListItemType.BULLET);
                                        for (Node node8 = (Block) ((Node) node7.parent); node8 != null; node8 = node8.getParent()) {
                                            if (node8 instanceof ListItem) {
                                                i42++;
                                            }
                                        }
                                        CoreProps.BULLET_LIST_ITEM_LEVEL.set(renderPropsImpl2, Integer.valueOf(i42));
                                    }
                                    parser.setSpansForNodeOptional(node7, length12);
                                    if (((Node) node7.next) != null) {
                                        parser.ensureNewLine();
                                        break;
                                    }
                                    break;
                                default:
                                    parser.ensureNewLine();
                                    int length13 = parser.length();
                                    parser.visitChildren(node);
                                    parser.setSpansForNodeOptional(node, length13);
                                    parser.blockEnd(node);
                                    break;
                            }
                        }
                    });
                    final int i12 = 1;
                    jobs.on(ThematicBreak.class, new MarkwonVisitor$NodeVisitor() { // from class: io.noties.markwon.core.CorePlugin.2
                        @Override // io.noties.markwon.MarkwonVisitor$NodeVisitor
                        public final void visit(Parser parser, Node node) {
                            boolean z = false;
                            int i42 = 0;
                            z = false;
                            switch (i12) {
                                case 0:
                                    Node node2 = (StrongEmphasis) node;
                                    int length = parser.length();
                                    parser.visitChildren(node2);
                                    parser.setSpansForNodeOptional(node2, length);
                                    break;
                                case 1:
                                    Node node3 = (ThematicBreak) node;
                                    parser.ensureNewLine();
                                    int length2 = parser.length();
                                    ((SpannableBuilder) parser.postProcessors).append((char) 160);
                                    parser.setSpansForNodeOptional(node3, length2);
                                    parser.blockEnd(node3);
                                    break;
                                case 2:
                                    Heading heading = (Heading) node;
                                    parser.ensureNewLine();
                                    int length3 = parser.length();
                                    parser.visitChildren(heading);
                                    CoreProps.HEADING_LEVEL.set((RenderPropsImpl) parser.delimiterProcessors, Integer.valueOf(heading.level));
                                    parser.setSpansForNodeOptional(heading, length3);
                                    parser.blockEnd(heading);
                                    break;
                                case 3:
                                    ((SpannableBuilder) parser.postProcessors).append(' ');
                                    break;
                                case 4:
                                    parser.ensureNewLine();
                                    break;
                                case 5:
                                    Node node4 = (Paragraph) node;
                                    Block block = (Block) ((Node) node4.parent);
                                    if (block != null) {
                                        Block block2 = (Block) ((Node) block.parent);
                                        if (block2 instanceof ListBlock) {
                                            z = ((ListBlock) block2).tight;
                                        }
                                    }
                                    if (!z) {
                                        parser.ensureNewLine();
                                    }
                                    int length4 = parser.length();
                                    parser.visitChildren(node4);
                                    CoreProps.PARAGRAPH_IS_IN_TIGHT_LIST.set((RenderPropsImpl) parser.delimiterProcessors, Boolean.valueOf(z));
                                    parser.setSpansForNodeOptional(node4, length4);
                                    if (!z) {
                                        parser.blockEnd(node4);
                                        break;
                                    }
                                    break;
                                case 6:
                                    Link link = (Link) node;
                                    int length5 = parser.length();
                                    parser.visitChildren(link);
                                    CoreProps.LINK_DESTINATION.set((RenderPropsImpl) parser.delimiterProcessors, link.destination);
                                    parser.setSpansForNodeOptional(link, length5);
                                    break;
                                case 7:
                                    Node node5 = (Emphasis) node;
                                    int length6 = parser.length();
                                    parser.visitChildren(node5);
                                    parser.setSpansForNodeOptional(node5, length6);
                                    break;
                                case 8:
                                    Node node6 = (BlockQuote) node;
                                    parser.ensureNewLine();
                                    int length7 = parser.length();
                                    parser.visitChildren(node6);
                                    parser.setSpansForNodeOptional(node6, length7);
                                    parser.blockEnd(node6);
                                    break;
                                case 9:
                                    Code code = (Code) node;
                                    int length8 = parser.length();
                                    SpannableBuilder spannableBuilder = (SpannableBuilder) parser.postProcessors;
                                    StringBuilder sb = spannableBuilder.builder;
                                    sb.append((char) 160);
                                    sb.append(code.literal);
                                    spannableBuilder.append((char) 160);
                                    parser.setSpansForNodeOptional(code, length8);
                                    break;
                                case 10:
                                    FencedCodeBlock fencedCodeBlock = (FencedCodeBlock) node;
                                    CorePlugin.visitCodeBlock(parser, fencedCodeBlock.info, fencedCodeBlock.literal, fencedCodeBlock);
                                    break;
                                case 11:
                                    IndentedCodeBlock indentedCodeBlock = (IndentedCodeBlock) node;
                                    CorePlugin.visitCodeBlock(parser, null, indentedCodeBlock.literal, indentedCodeBlock);
                                    break;
                                case 12:
                                    SpannableBuilder spannableBuilder2 = (SpannableBuilder) parser.postProcessors;
                                    Image image = (Image) node;
                                    MarkwonConfiguration markwonConfiguration = (MarkwonConfiguration) parser.blockParserFactories;
                                    CodeSpanFactory codeSpanFactory = (CodeSpanFactory) ((Map) ((MatchResult.Destructured) markwonConfiguration.spansFactory).match).get(Image.class);
                                    if (codeSpanFactory == null) {
                                        parser.visitChildren(image);
                                        break;
                                    } else {
                                        int length9 = parser.length();
                                        parser.visitChildren(image);
                                        if (length9 == parser.length()) {
                                            spannableBuilder2.append((char) 65532);
                                        }
                                        boolean z2 = ((Node) image.parent) instanceof Link;
                                        POPMatchingFactory pOPMatchingFactory = (POPMatchingFactory) markwonConfiguration.imageDestinationProcessor;
                                        String str = image.destination;
                                        pOPMatchingFactory.getClass();
                                        RenderPropsImpl renderPropsImpl = (RenderPropsImpl) parser.delimiterProcessors;
                                        ImageProps.DESTINATION.set(renderPropsImpl, str);
                                        ImageProps.REPLACEMENT_TEXT_IS_LINK.set(renderPropsImpl, Boolean.valueOf(z2));
                                        ImageProps.IMAGE_SIZE.set(renderPropsImpl, null);
                                        Object spans = codeSpanFactory.getSpans(markwonConfiguration, renderPropsImpl);
                                        StringBuilder sb2 = spannableBuilder2.builder;
                                        int length10 = sb2.length();
                                        int length11 = sb2.length();
                                        if (length10 > length9 && length9 >= 0 && length10 <= length11) {
                                            SpannableBuilder.setSpansInternal(spannableBuilder2, spans, length9, length10);
                                            break;
                                        }
                                    }
                                    break;
                                case 13:
                                    Node node7 = (ListItem) node;
                                    int length12 = parser.length();
                                    RenderPropsImpl renderPropsImpl2 = (RenderPropsImpl) parser.delimiterProcessors;
                                    parser.visitChildren(node7);
                                    Block block3 = (Block) ((Node) node7.parent);
                                    boolean z3 = block3 instanceof OrderedList;
                                    Prop prop = CoreProps.LIST_ITEM_TYPE;
                                    if (z3) {
                                        OrderedList orderedList = (OrderedList) block3;
                                        int i52 = orderedList.startNumber;
                                        prop.set(renderPropsImpl2, CoreProps.ListItemType.ORDERED);
                                        CoreProps.ORDERED_LIST_ITEM_NUMBER.set(renderPropsImpl2, Integer.valueOf(i52));
                                        orderedList.startNumber++;
                                    } else {
                                        prop.set(renderPropsImpl2, CoreProps.ListItemType.BULLET);
                                        for (Node node8 = (Block) ((Node) node7.parent); node8 != null; node8 = node8.getParent()) {
                                            if (node8 instanceof ListItem) {
                                                i42++;
                                            }
                                        }
                                        CoreProps.BULLET_LIST_ITEM_LEVEL.set(renderPropsImpl2, Integer.valueOf(i42));
                                    }
                                    parser.setSpansForNodeOptional(node7, length12);
                                    if (((Node) node7.next) != null) {
                                        parser.ensureNewLine();
                                        break;
                                    }
                                    break;
                                default:
                                    parser.ensureNewLine();
                                    int length13 = parser.length();
                                    parser.visitChildren(node);
                                    parser.setSpansForNodeOptional(node, length13);
                                    parser.blockEnd(node);
                                    break;
                            }
                        }
                    });
                    ArrayList arrayList3 = arrayList2;
                    final int i13 = 2;
                    jobs.on(Heading.class, new MarkwonVisitor$NodeVisitor() { // from class: io.noties.markwon.core.CorePlugin.2
                        @Override // io.noties.markwon.MarkwonVisitor$NodeVisitor
                        public final void visit(Parser parser, Node node) {
                            boolean z = false;
                            int i42 = 0;
                            z = false;
                            switch (i13) {
                                case 0:
                                    Node node2 = (StrongEmphasis) node;
                                    int length = parser.length();
                                    parser.visitChildren(node2);
                                    parser.setSpansForNodeOptional(node2, length);
                                    break;
                                case 1:
                                    Node node3 = (ThematicBreak) node;
                                    parser.ensureNewLine();
                                    int length2 = parser.length();
                                    ((SpannableBuilder) parser.postProcessors).append((char) 160);
                                    parser.setSpansForNodeOptional(node3, length2);
                                    parser.blockEnd(node3);
                                    break;
                                case 2:
                                    Heading heading = (Heading) node;
                                    parser.ensureNewLine();
                                    int length3 = parser.length();
                                    parser.visitChildren(heading);
                                    CoreProps.HEADING_LEVEL.set((RenderPropsImpl) parser.delimiterProcessors, Integer.valueOf(heading.level));
                                    parser.setSpansForNodeOptional(heading, length3);
                                    parser.blockEnd(heading);
                                    break;
                                case 3:
                                    ((SpannableBuilder) parser.postProcessors).append(' ');
                                    break;
                                case 4:
                                    parser.ensureNewLine();
                                    break;
                                case 5:
                                    Node node4 = (Paragraph) node;
                                    Block block = (Block) ((Node) node4.parent);
                                    if (block != null) {
                                        Block block2 = (Block) ((Node) block.parent);
                                        if (block2 instanceof ListBlock) {
                                            z = ((ListBlock) block2).tight;
                                        }
                                    }
                                    if (!z) {
                                        parser.ensureNewLine();
                                    }
                                    int length4 = parser.length();
                                    parser.visitChildren(node4);
                                    CoreProps.PARAGRAPH_IS_IN_TIGHT_LIST.set((RenderPropsImpl) parser.delimiterProcessors, Boolean.valueOf(z));
                                    parser.setSpansForNodeOptional(node4, length4);
                                    if (!z) {
                                        parser.blockEnd(node4);
                                        break;
                                    }
                                    break;
                                case 6:
                                    Link link = (Link) node;
                                    int length5 = parser.length();
                                    parser.visitChildren(link);
                                    CoreProps.LINK_DESTINATION.set((RenderPropsImpl) parser.delimiterProcessors, link.destination);
                                    parser.setSpansForNodeOptional(link, length5);
                                    break;
                                case 7:
                                    Node node5 = (Emphasis) node;
                                    int length6 = parser.length();
                                    parser.visitChildren(node5);
                                    parser.setSpansForNodeOptional(node5, length6);
                                    break;
                                case 8:
                                    Node node6 = (BlockQuote) node;
                                    parser.ensureNewLine();
                                    int length7 = parser.length();
                                    parser.visitChildren(node6);
                                    parser.setSpansForNodeOptional(node6, length7);
                                    parser.blockEnd(node6);
                                    break;
                                case 9:
                                    Code code = (Code) node;
                                    int length8 = parser.length();
                                    SpannableBuilder spannableBuilder = (SpannableBuilder) parser.postProcessors;
                                    StringBuilder sb = spannableBuilder.builder;
                                    sb.append((char) 160);
                                    sb.append(code.literal);
                                    spannableBuilder.append((char) 160);
                                    parser.setSpansForNodeOptional(code, length8);
                                    break;
                                case 10:
                                    FencedCodeBlock fencedCodeBlock = (FencedCodeBlock) node;
                                    CorePlugin.visitCodeBlock(parser, fencedCodeBlock.info, fencedCodeBlock.literal, fencedCodeBlock);
                                    break;
                                case 11:
                                    IndentedCodeBlock indentedCodeBlock = (IndentedCodeBlock) node;
                                    CorePlugin.visitCodeBlock(parser, null, indentedCodeBlock.literal, indentedCodeBlock);
                                    break;
                                case 12:
                                    SpannableBuilder spannableBuilder2 = (SpannableBuilder) parser.postProcessors;
                                    Image image = (Image) node;
                                    MarkwonConfiguration markwonConfiguration = (MarkwonConfiguration) parser.blockParserFactories;
                                    CodeSpanFactory codeSpanFactory = (CodeSpanFactory) ((Map) ((MatchResult.Destructured) markwonConfiguration.spansFactory).match).get(Image.class);
                                    if (codeSpanFactory == null) {
                                        parser.visitChildren(image);
                                        break;
                                    } else {
                                        int length9 = parser.length();
                                        parser.visitChildren(image);
                                        if (length9 == parser.length()) {
                                            spannableBuilder2.append((char) 65532);
                                        }
                                        boolean z2 = ((Node) image.parent) instanceof Link;
                                        POPMatchingFactory pOPMatchingFactory = (POPMatchingFactory) markwonConfiguration.imageDestinationProcessor;
                                        String str = image.destination;
                                        pOPMatchingFactory.getClass();
                                        RenderPropsImpl renderPropsImpl = (RenderPropsImpl) parser.delimiterProcessors;
                                        ImageProps.DESTINATION.set(renderPropsImpl, str);
                                        ImageProps.REPLACEMENT_TEXT_IS_LINK.set(renderPropsImpl, Boolean.valueOf(z2));
                                        ImageProps.IMAGE_SIZE.set(renderPropsImpl, null);
                                        Object spans = codeSpanFactory.getSpans(markwonConfiguration, renderPropsImpl);
                                        StringBuilder sb2 = spannableBuilder2.builder;
                                        int length10 = sb2.length();
                                        int length11 = sb2.length();
                                        if (length10 > length9 && length9 >= 0 && length10 <= length11) {
                                            SpannableBuilder.setSpansInternal(spannableBuilder2, spans, length9, length10);
                                            break;
                                        }
                                    }
                                    break;
                                case 13:
                                    Node node7 = (ListItem) node;
                                    int length12 = parser.length();
                                    RenderPropsImpl renderPropsImpl2 = (RenderPropsImpl) parser.delimiterProcessors;
                                    parser.visitChildren(node7);
                                    Block block3 = (Block) ((Node) node7.parent);
                                    boolean z3 = block3 instanceof OrderedList;
                                    Prop prop = CoreProps.LIST_ITEM_TYPE;
                                    if (z3) {
                                        OrderedList orderedList = (OrderedList) block3;
                                        int i52 = orderedList.startNumber;
                                        prop.set(renderPropsImpl2, CoreProps.ListItemType.ORDERED);
                                        CoreProps.ORDERED_LIST_ITEM_NUMBER.set(renderPropsImpl2, Integer.valueOf(i52));
                                        orderedList.startNumber++;
                                    } else {
                                        prop.set(renderPropsImpl2, CoreProps.ListItemType.BULLET);
                                        for (Node node8 = (Block) ((Node) node7.parent); node8 != null; node8 = node8.getParent()) {
                                            if (node8 instanceof ListItem) {
                                                i42++;
                                            }
                                        }
                                        CoreProps.BULLET_LIST_ITEM_LEVEL.set(renderPropsImpl2, Integer.valueOf(i42));
                                    }
                                    parser.setSpansForNodeOptional(node7, length12);
                                    if (((Node) node7.next) != null) {
                                        parser.ensureNewLine();
                                        break;
                                    }
                                    break;
                                default:
                                    parser.ensureNewLine();
                                    int length13 = parser.length();
                                    parser.visitChildren(node);
                                    parser.setSpansForNodeOptional(node, length13);
                                    parser.blockEnd(node);
                                    break;
                            }
                        }
                    });
                    Iterator it3 = it2;
                    final int i14 = 3;
                    jobs.on(SoftLineBreak.class, new MarkwonVisitor$NodeVisitor() { // from class: io.noties.markwon.core.CorePlugin.2
                        @Override // io.noties.markwon.MarkwonVisitor$NodeVisitor
                        public final void visit(Parser parser, Node node) {
                            boolean z = false;
                            int i42 = 0;
                            z = false;
                            switch (i14) {
                                case 0:
                                    Node node2 = (StrongEmphasis) node;
                                    int length = parser.length();
                                    parser.visitChildren(node2);
                                    parser.setSpansForNodeOptional(node2, length);
                                    break;
                                case 1:
                                    Node node3 = (ThematicBreak) node;
                                    parser.ensureNewLine();
                                    int length2 = parser.length();
                                    ((SpannableBuilder) parser.postProcessors).append((char) 160);
                                    parser.setSpansForNodeOptional(node3, length2);
                                    parser.blockEnd(node3);
                                    break;
                                case 2:
                                    Heading heading = (Heading) node;
                                    parser.ensureNewLine();
                                    int length3 = parser.length();
                                    parser.visitChildren(heading);
                                    CoreProps.HEADING_LEVEL.set((RenderPropsImpl) parser.delimiterProcessors, Integer.valueOf(heading.level));
                                    parser.setSpansForNodeOptional(heading, length3);
                                    parser.blockEnd(heading);
                                    break;
                                case 3:
                                    ((SpannableBuilder) parser.postProcessors).append(' ');
                                    break;
                                case 4:
                                    parser.ensureNewLine();
                                    break;
                                case 5:
                                    Node node4 = (Paragraph) node;
                                    Block block = (Block) ((Node) node4.parent);
                                    if (block != null) {
                                        Block block2 = (Block) ((Node) block.parent);
                                        if (block2 instanceof ListBlock) {
                                            z = ((ListBlock) block2).tight;
                                        }
                                    }
                                    if (!z) {
                                        parser.ensureNewLine();
                                    }
                                    int length4 = parser.length();
                                    parser.visitChildren(node4);
                                    CoreProps.PARAGRAPH_IS_IN_TIGHT_LIST.set((RenderPropsImpl) parser.delimiterProcessors, Boolean.valueOf(z));
                                    parser.setSpansForNodeOptional(node4, length4);
                                    if (!z) {
                                        parser.blockEnd(node4);
                                        break;
                                    }
                                    break;
                                case 6:
                                    Link link = (Link) node;
                                    int length5 = parser.length();
                                    parser.visitChildren(link);
                                    CoreProps.LINK_DESTINATION.set((RenderPropsImpl) parser.delimiterProcessors, link.destination);
                                    parser.setSpansForNodeOptional(link, length5);
                                    break;
                                case 7:
                                    Node node5 = (Emphasis) node;
                                    int length6 = parser.length();
                                    parser.visitChildren(node5);
                                    parser.setSpansForNodeOptional(node5, length6);
                                    break;
                                case 8:
                                    Node node6 = (BlockQuote) node;
                                    parser.ensureNewLine();
                                    int length7 = parser.length();
                                    parser.visitChildren(node6);
                                    parser.setSpansForNodeOptional(node6, length7);
                                    parser.blockEnd(node6);
                                    break;
                                case 9:
                                    Code code = (Code) node;
                                    int length8 = parser.length();
                                    SpannableBuilder spannableBuilder = (SpannableBuilder) parser.postProcessors;
                                    StringBuilder sb = spannableBuilder.builder;
                                    sb.append((char) 160);
                                    sb.append(code.literal);
                                    spannableBuilder.append((char) 160);
                                    parser.setSpansForNodeOptional(code, length8);
                                    break;
                                case 10:
                                    FencedCodeBlock fencedCodeBlock = (FencedCodeBlock) node;
                                    CorePlugin.visitCodeBlock(parser, fencedCodeBlock.info, fencedCodeBlock.literal, fencedCodeBlock);
                                    break;
                                case 11:
                                    IndentedCodeBlock indentedCodeBlock = (IndentedCodeBlock) node;
                                    CorePlugin.visitCodeBlock(parser, null, indentedCodeBlock.literal, indentedCodeBlock);
                                    break;
                                case 12:
                                    SpannableBuilder spannableBuilder2 = (SpannableBuilder) parser.postProcessors;
                                    Image image = (Image) node;
                                    MarkwonConfiguration markwonConfiguration = (MarkwonConfiguration) parser.blockParserFactories;
                                    CodeSpanFactory codeSpanFactory = (CodeSpanFactory) ((Map) ((MatchResult.Destructured) markwonConfiguration.spansFactory).match).get(Image.class);
                                    if (codeSpanFactory == null) {
                                        parser.visitChildren(image);
                                        break;
                                    } else {
                                        int length9 = parser.length();
                                        parser.visitChildren(image);
                                        if (length9 == parser.length()) {
                                            spannableBuilder2.append((char) 65532);
                                        }
                                        boolean z2 = ((Node) image.parent) instanceof Link;
                                        POPMatchingFactory pOPMatchingFactory = (POPMatchingFactory) markwonConfiguration.imageDestinationProcessor;
                                        String str = image.destination;
                                        pOPMatchingFactory.getClass();
                                        RenderPropsImpl renderPropsImpl = (RenderPropsImpl) parser.delimiterProcessors;
                                        ImageProps.DESTINATION.set(renderPropsImpl, str);
                                        ImageProps.REPLACEMENT_TEXT_IS_LINK.set(renderPropsImpl, Boolean.valueOf(z2));
                                        ImageProps.IMAGE_SIZE.set(renderPropsImpl, null);
                                        Object spans = codeSpanFactory.getSpans(markwonConfiguration, renderPropsImpl);
                                        StringBuilder sb2 = spannableBuilder2.builder;
                                        int length10 = sb2.length();
                                        int length11 = sb2.length();
                                        if (length10 > length9 && length9 >= 0 && length10 <= length11) {
                                            SpannableBuilder.setSpansInternal(spannableBuilder2, spans, length9, length10);
                                            break;
                                        }
                                    }
                                    break;
                                case 13:
                                    Node node7 = (ListItem) node;
                                    int length12 = parser.length();
                                    RenderPropsImpl renderPropsImpl2 = (RenderPropsImpl) parser.delimiterProcessors;
                                    parser.visitChildren(node7);
                                    Block block3 = (Block) ((Node) node7.parent);
                                    boolean z3 = block3 instanceof OrderedList;
                                    Prop prop = CoreProps.LIST_ITEM_TYPE;
                                    if (z3) {
                                        OrderedList orderedList = (OrderedList) block3;
                                        int i52 = orderedList.startNumber;
                                        prop.set(renderPropsImpl2, CoreProps.ListItemType.ORDERED);
                                        CoreProps.ORDERED_LIST_ITEM_NUMBER.set(renderPropsImpl2, Integer.valueOf(i52));
                                        orderedList.startNumber++;
                                    } else {
                                        prop.set(renderPropsImpl2, CoreProps.ListItemType.BULLET);
                                        for (Node node8 = (Block) ((Node) node7.parent); node8 != null; node8 = node8.getParent()) {
                                            if (node8 instanceof ListItem) {
                                                i42++;
                                            }
                                        }
                                        CoreProps.BULLET_LIST_ITEM_LEVEL.set(renderPropsImpl2, Integer.valueOf(i42));
                                    }
                                    parser.setSpansForNodeOptional(node7, length12);
                                    if (((Node) node7.next) != null) {
                                        parser.ensureNewLine();
                                        break;
                                    }
                                    break;
                                default:
                                    parser.ensureNewLine();
                                    int length13 = parser.length();
                                    parser.visitChildren(node);
                                    parser.setSpansForNodeOptional(node, length13);
                                    parser.blockEnd(node);
                                    break;
                            }
                        }
                    });
                    final int i15 = 4;
                    jobs.on(HardLineBreak.class, new MarkwonVisitor$NodeVisitor() { // from class: io.noties.markwon.core.CorePlugin.2
                        @Override // io.noties.markwon.MarkwonVisitor$NodeVisitor
                        public final void visit(Parser parser, Node node) {
                            boolean z = false;
                            int i42 = 0;
                            z = false;
                            switch (i15) {
                                case 0:
                                    Node node2 = (StrongEmphasis) node;
                                    int length = parser.length();
                                    parser.visitChildren(node2);
                                    parser.setSpansForNodeOptional(node2, length);
                                    break;
                                case 1:
                                    Node node3 = (ThematicBreak) node;
                                    parser.ensureNewLine();
                                    int length2 = parser.length();
                                    ((SpannableBuilder) parser.postProcessors).append((char) 160);
                                    parser.setSpansForNodeOptional(node3, length2);
                                    parser.blockEnd(node3);
                                    break;
                                case 2:
                                    Heading heading = (Heading) node;
                                    parser.ensureNewLine();
                                    int length3 = parser.length();
                                    parser.visitChildren(heading);
                                    CoreProps.HEADING_LEVEL.set((RenderPropsImpl) parser.delimiterProcessors, Integer.valueOf(heading.level));
                                    parser.setSpansForNodeOptional(heading, length3);
                                    parser.blockEnd(heading);
                                    break;
                                case 3:
                                    ((SpannableBuilder) parser.postProcessors).append(' ');
                                    break;
                                case 4:
                                    parser.ensureNewLine();
                                    break;
                                case 5:
                                    Node node4 = (Paragraph) node;
                                    Block block = (Block) ((Node) node4.parent);
                                    if (block != null) {
                                        Block block2 = (Block) ((Node) block.parent);
                                        if (block2 instanceof ListBlock) {
                                            z = ((ListBlock) block2).tight;
                                        }
                                    }
                                    if (!z) {
                                        parser.ensureNewLine();
                                    }
                                    int length4 = parser.length();
                                    parser.visitChildren(node4);
                                    CoreProps.PARAGRAPH_IS_IN_TIGHT_LIST.set((RenderPropsImpl) parser.delimiterProcessors, Boolean.valueOf(z));
                                    parser.setSpansForNodeOptional(node4, length4);
                                    if (!z) {
                                        parser.blockEnd(node4);
                                        break;
                                    }
                                    break;
                                case 6:
                                    Link link = (Link) node;
                                    int length5 = parser.length();
                                    parser.visitChildren(link);
                                    CoreProps.LINK_DESTINATION.set((RenderPropsImpl) parser.delimiterProcessors, link.destination);
                                    parser.setSpansForNodeOptional(link, length5);
                                    break;
                                case 7:
                                    Node node5 = (Emphasis) node;
                                    int length6 = parser.length();
                                    parser.visitChildren(node5);
                                    parser.setSpansForNodeOptional(node5, length6);
                                    break;
                                case 8:
                                    Node node6 = (BlockQuote) node;
                                    parser.ensureNewLine();
                                    int length7 = parser.length();
                                    parser.visitChildren(node6);
                                    parser.setSpansForNodeOptional(node6, length7);
                                    parser.blockEnd(node6);
                                    break;
                                case 9:
                                    Code code = (Code) node;
                                    int length8 = parser.length();
                                    SpannableBuilder spannableBuilder = (SpannableBuilder) parser.postProcessors;
                                    StringBuilder sb = spannableBuilder.builder;
                                    sb.append((char) 160);
                                    sb.append(code.literal);
                                    spannableBuilder.append((char) 160);
                                    parser.setSpansForNodeOptional(code, length8);
                                    break;
                                case 10:
                                    FencedCodeBlock fencedCodeBlock = (FencedCodeBlock) node;
                                    CorePlugin.visitCodeBlock(parser, fencedCodeBlock.info, fencedCodeBlock.literal, fencedCodeBlock);
                                    break;
                                case 11:
                                    IndentedCodeBlock indentedCodeBlock = (IndentedCodeBlock) node;
                                    CorePlugin.visitCodeBlock(parser, null, indentedCodeBlock.literal, indentedCodeBlock);
                                    break;
                                case 12:
                                    SpannableBuilder spannableBuilder2 = (SpannableBuilder) parser.postProcessors;
                                    Image image = (Image) node;
                                    MarkwonConfiguration markwonConfiguration = (MarkwonConfiguration) parser.blockParserFactories;
                                    CodeSpanFactory codeSpanFactory = (CodeSpanFactory) ((Map) ((MatchResult.Destructured) markwonConfiguration.spansFactory).match).get(Image.class);
                                    if (codeSpanFactory == null) {
                                        parser.visitChildren(image);
                                        break;
                                    } else {
                                        int length9 = parser.length();
                                        parser.visitChildren(image);
                                        if (length9 == parser.length()) {
                                            spannableBuilder2.append((char) 65532);
                                        }
                                        boolean z2 = ((Node) image.parent) instanceof Link;
                                        POPMatchingFactory pOPMatchingFactory = (POPMatchingFactory) markwonConfiguration.imageDestinationProcessor;
                                        String str = image.destination;
                                        pOPMatchingFactory.getClass();
                                        RenderPropsImpl renderPropsImpl = (RenderPropsImpl) parser.delimiterProcessors;
                                        ImageProps.DESTINATION.set(renderPropsImpl, str);
                                        ImageProps.REPLACEMENT_TEXT_IS_LINK.set(renderPropsImpl, Boolean.valueOf(z2));
                                        ImageProps.IMAGE_SIZE.set(renderPropsImpl, null);
                                        Object spans = codeSpanFactory.getSpans(markwonConfiguration, renderPropsImpl);
                                        StringBuilder sb2 = spannableBuilder2.builder;
                                        int length10 = sb2.length();
                                        int length11 = sb2.length();
                                        if (length10 > length9 && length9 >= 0 && length10 <= length11) {
                                            SpannableBuilder.setSpansInternal(spannableBuilder2, spans, length9, length10);
                                            break;
                                        }
                                    }
                                    break;
                                case 13:
                                    Node node7 = (ListItem) node;
                                    int length12 = parser.length();
                                    RenderPropsImpl renderPropsImpl2 = (RenderPropsImpl) parser.delimiterProcessors;
                                    parser.visitChildren(node7);
                                    Block block3 = (Block) ((Node) node7.parent);
                                    boolean z3 = block3 instanceof OrderedList;
                                    Prop prop = CoreProps.LIST_ITEM_TYPE;
                                    if (z3) {
                                        OrderedList orderedList = (OrderedList) block3;
                                        int i52 = orderedList.startNumber;
                                        prop.set(renderPropsImpl2, CoreProps.ListItemType.ORDERED);
                                        CoreProps.ORDERED_LIST_ITEM_NUMBER.set(renderPropsImpl2, Integer.valueOf(i52));
                                        orderedList.startNumber++;
                                    } else {
                                        prop.set(renderPropsImpl2, CoreProps.ListItemType.BULLET);
                                        for (Node node8 = (Block) ((Node) node7.parent); node8 != null; node8 = node8.getParent()) {
                                            if (node8 instanceof ListItem) {
                                                i42++;
                                            }
                                        }
                                        CoreProps.BULLET_LIST_ITEM_LEVEL.set(renderPropsImpl2, Integer.valueOf(i42));
                                    }
                                    parser.setSpansForNodeOptional(node7, length12);
                                    if (((Node) node7.next) != null) {
                                        parser.ensureNewLine();
                                        break;
                                    }
                                    break;
                                default:
                                    parser.ensureNewLine();
                                    int length13 = parser.length();
                                    parser.visitChildren(node);
                                    parser.setSpansForNodeOptional(node, length13);
                                    parser.blockEnd(node);
                                    break;
                            }
                        }
                    });
                    final int i16 = 5;
                    jobs.on(Paragraph.class, new MarkwonVisitor$NodeVisitor() { // from class: io.noties.markwon.core.CorePlugin.2
                        @Override // io.noties.markwon.MarkwonVisitor$NodeVisitor
                        public final void visit(Parser parser, Node node) {
                            boolean z = false;
                            int i42 = 0;
                            z = false;
                            switch (i16) {
                                case 0:
                                    Node node2 = (StrongEmphasis) node;
                                    int length = parser.length();
                                    parser.visitChildren(node2);
                                    parser.setSpansForNodeOptional(node2, length);
                                    break;
                                case 1:
                                    Node node3 = (ThematicBreak) node;
                                    parser.ensureNewLine();
                                    int length2 = parser.length();
                                    ((SpannableBuilder) parser.postProcessors).append((char) 160);
                                    parser.setSpansForNodeOptional(node3, length2);
                                    parser.blockEnd(node3);
                                    break;
                                case 2:
                                    Heading heading = (Heading) node;
                                    parser.ensureNewLine();
                                    int length3 = parser.length();
                                    parser.visitChildren(heading);
                                    CoreProps.HEADING_LEVEL.set((RenderPropsImpl) parser.delimiterProcessors, Integer.valueOf(heading.level));
                                    parser.setSpansForNodeOptional(heading, length3);
                                    parser.blockEnd(heading);
                                    break;
                                case 3:
                                    ((SpannableBuilder) parser.postProcessors).append(' ');
                                    break;
                                case 4:
                                    parser.ensureNewLine();
                                    break;
                                case 5:
                                    Node node4 = (Paragraph) node;
                                    Block block = (Block) ((Node) node4.parent);
                                    if (block != null) {
                                        Block block2 = (Block) ((Node) block.parent);
                                        if (block2 instanceof ListBlock) {
                                            z = ((ListBlock) block2).tight;
                                        }
                                    }
                                    if (!z) {
                                        parser.ensureNewLine();
                                    }
                                    int length4 = parser.length();
                                    parser.visitChildren(node4);
                                    CoreProps.PARAGRAPH_IS_IN_TIGHT_LIST.set((RenderPropsImpl) parser.delimiterProcessors, Boolean.valueOf(z));
                                    parser.setSpansForNodeOptional(node4, length4);
                                    if (!z) {
                                        parser.blockEnd(node4);
                                        break;
                                    }
                                    break;
                                case 6:
                                    Link link = (Link) node;
                                    int length5 = parser.length();
                                    parser.visitChildren(link);
                                    CoreProps.LINK_DESTINATION.set((RenderPropsImpl) parser.delimiterProcessors, link.destination);
                                    parser.setSpansForNodeOptional(link, length5);
                                    break;
                                case 7:
                                    Node node5 = (Emphasis) node;
                                    int length6 = parser.length();
                                    parser.visitChildren(node5);
                                    parser.setSpansForNodeOptional(node5, length6);
                                    break;
                                case 8:
                                    Node node6 = (BlockQuote) node;
                                    parser.ensureNewLine();
                                    int length7 = parser.length();
                                    parser.visitChildren(node6);
                                    parser.setSpansForNodeOptional(node6, length7);
                                    parser.blockEnd(node6);
                                    break;
                                case 9:
                                    Code code = (Code) node;
                                    int length8 = parser.length();
                                    SpannableBuilder spannableBuilder = (SpannableBuilder) parser.postProcessors;
                                    StringBuilder sb = spannableBuilder.builder;
                                    sb.append((char) 160);
                                    sb.append(code.literal);
                                    spannableBuilder.append((char) 160);
                                    parser.setSpansForNodeOptional(code, length8);
                                    break;
                                case 10:
                                    FencedCodeBlock fencedCodeBlock = (FencedCodeBlock) node;
                                    CorePlugin.visitCodeBlock(parser, fencedCodeBlock.info, fencedCodeBlock.literal, fencedCodeBlock);
                                    break;
                                case 11:
                                    IndentedCodeBlock indentedCodeBlock = (IndentedCodeBlock) node;
                                    CorePlugin.visitCodeBlock(parser, null, indentedCodeBlock.literal, indentedCodeBlock);
                                    break;
                                case 12:
                                    SpannableBuilder spannableBuilder2 = (SpannableBuilder) parser.postProcessors;
                                    Image image = (Image) node;
                                    MarkwonConfiguration markwonConfiguration = (MarkwonConfiguration) parser.blockParserFactories;
                                    CodeSpanFactory codeSpanFactory = (CodeSpanFactory) ((Map) ((MatchResult.Destructured) markwonConfiguration.spansFactory).match).get(Image.class);
                                    if (codeSpanFactory == null) {
                                        parser.visitChildren(image);
                                        break;
                                    } else {
                                        int length9 = parser.length();
                                        parser.visitChildren(image);
                                        if (length9 == parser.length()) {
                                            spannableBuilder2.append((char) 65532);
                                        }
                                        boolean z2 = ((Node) image.parent) instanceof Link;
                                        POPMatchingFactory pOPMatchingFactory = (POPMatchingFactory) markwonConfiguration.imageDestinationProcessor;
                                        String str = image.destination;
                                        pOPMatchingFactory.getClass();
                                        RenderPropsImpl renderPropsImpl = (RenderPropsImpl) parser.delimiterProcessors;
                                        ImageProps.DESTINATION.set(renderPropsImpl, str);
                                        ImageProps.REPLACEMENT_TEXT_IS_LINK.set(renderPropsImpl, Boolean.valueOf(z2));
                                        ImageProps.IMAGE_SIZE.set(renderPropsImpl, null);
                                        Object spans = codeSpanFactory.getSpans(markwonConfiguration, renderPropsImpl);
                                        StringBuilder sb2 = spannableBuilder2.builder;
                                        int length10 = sb2.length();
                                        int length11 = sb2.length();
                                        if (length10 > length9 && length9 >= 0 && length10 <= length11) {
                                            SpannableBuilder.setSpansInternal(spannableBuilder2, spans, length9, length10);
                                            break;
                                        }
                                    }
                                    break;
                                case 13:
                                    Node node7 = (ListItem) node;
                                    int length12 = parser.length();
                                    RenderPropsImpl renderPropsImpl2 = (RenderPropsImpl) parser.delimiterProcessors;
                                    parser.visitChildren(node7);
                                    Block block3 = (Block) ((Node) node7.parent);
                                    boolean z3 = block3 instanceof OrderedList;
                                    Prop prop = CoreProps.LIST_ITEM_TYPE;
                                    if (z3) {
                                        OrderedList orderedList = (OrderedList) block3;
                                        int i52 = orderedList.startNumber;
                                        prop.set(renderPropsImpl2, CoreProps.ListItemType.ORDERED);
                                        CoreProps.ORDERED_LIST_ITEM_NUMBER.set(renderPropsImpl2, Integer.valueOf(i52));
                                        orderedList.startNumber++;
                                    } else {
                                        prop.set(renderPropsImpl2, CoreProps.ListItemType.BULLET);
                                        for (Node node8 = (Block) ((Node) node7.parent); node8 != null; node8 = node8.getParent()) {
                                            if (node8 instanceof ListItem) {
                                                i42++;
                                            }
                                        }
                                        CoreProps.BULLET_LIST_ITEM_LEVEL.set(renderPropsImpl2, Integer.valueOf(i42));
                                    }
                                    parser.setSpansForNodeOptional(node7, length12);
                                    if (((Node) node7.next) != null) {
                                        parser.ensureNewLine();
                                        break;
                                    }
                                    break;
                                default:
                                    parser.ensureNewLine();
                                    int length13 = parser.length();
                                    parser.visitChildren(node);
                                    parser.setSpansForNodeOptional(node, length13);
                                    parser.blockEnd(node);
                                    break;
                            }
                        }
                    });
                    final int i17 = 6;
                    jobs.on(Link.class, new MarkwonVisitor$NodeVisitor() { // from class: io.noties.markwon.core.CorePlugin.2
                        @Override // io.noties.markwon.MarkwonVisitor$NodeVisitor
                        public final void visit(Parser parser, Node node) {
                            boolean z = false;
                            int i42 = 0;
                            z = false;
                            switch (i17) {
                                case 0:
                                    Node node2 = (StrongEmphasis) node;
                                    int length = parser.length();
                                    parser.visitChildren(node2);
                                    parser.setSpansForNodeOptional(node2, length);
                                    break;
                                case 1:
                                    Node node3 = (ThematicBreak) node;
                                    parser.ensureNewLine();
                                    int length2 = parser.length();
                                    ((SpannableBuilder) parser.postProcessors).append((char) 160);
                                    parser.setSpansForNodeOptional(node3, length2);
                                    parser.blockEnd(node3);
                                    break;
                                case 2:
                                    Heading heading = (Heading) node;
                                    parser.ensureNewLine();
                                    int length3 = parser.length();
                                    parser.visitChildren(heading);
                                    CoreProps.HEADING_LEVEL.set((RenderPropsImpl) parser.delimiterProcessors, Integer.valueOf(heading.level));
                                    parser.setSpansForNodeOptional(heading, length3);
                                    parser.blockEnd(heading);
                                    break;
                                case 3:
                                    ((SpannableBuilder) parser.postProcessors).append(' ');
                                    break;
                                case 4:
                                    parser.ensureNewLine();
                                    break;
                                case 5:
                                    Node node4 = (Paragraph) node;
                                    Block block = (Block) ((Node) node4.parent);
                                    if (block != null) {
                                        Block block2 = (Block) ((Node) block.parent);
                                        if (block2 instanceof ListBlock) {
                                            z = ((ListBlock) block2).tight;
                                        }
                                    }
                                    if (!z) {
                                        parser.ensureNewLine();
                                    }
                                    int length4 = parser.length();
                                    parser.visitChildren(node4);
                                    CoreProps.PARAGRAPH_IS_IN_TIGHT_LIST.set((RenderPropsImpl) parser.delimiterProcessors, Boolean.valueOf(z));
                                    parser.setSpansForNodeOptional(node4, length4);
                                    if (!z) {
                                        parser.blockEnd(node4);
                                        break;
                                    }
                                    break;
                                case 6:
                                    Link link = (Link) node;
                                    int length5 = parser.length();
                                    parser.visitChildren(link);
                                    CoreProps.LINK_DESTINATION.set((RenderPropsImpl) parser.delimiterProcessors, link.destination);
                                    parser.setSpansForNodeOptional(link, length5);
                                    break;
                                case 7:
                                    Node node5 = (Emphasis) node;
                                    int length6 = parser.length();
                                    parser.visitChildren(node5);
                                    parser.setSpansForNodeOptional(node5, length6);
                                    break;
                                case 8:
                                    Node node6 = (BlockQuote) node;
                                    parser.ensureNewLine();
                                    int length7 = parser.length();
                                    parser.visitChildren(node6);
                                    parser.setSpansForNodeOptional(node6, length7);
                                    parser.blockEnd(node6);
                                    break;
                                case 9:
                                    Code code = (Code) node;
                                    int length8 = parser.length();
                                    SpannableBuilder spannableBuilder = (SpannableBuilder) parser.postProcessors;
                                    StringBuilder sb = spannableBuilder.builder;
                                    sb.append((char) 160);
                                    sb.append(code.literal);
                                    spannableBuilder.append((char) 160);
                                    parser.setSpansForNodeOptional(code, length8);
                                    break;
                                case 10:
                                    FencedCodeBlock fencedCodeBlock = (FencedCodeBlock) node;
                                    CorePlugin.visitCodeBlock(parser, fencedCodeBlock.info, fencedCodeBlock.literal, fencedCodeBlock);
                                    break;
                                case 11:
                                    IndentedCodeBlock indentedCodeBlock = (IndentedCodeBlock) node;
                                    CorePlugin.visitCodeBlock(parser, null, indentedCodeBlock.literal, indentedCodeBlock);
                                    break;
                                case 12:
                                    SpannableBuilder spannableBuilder2 = (SpannableBuilder) parser.postProcessors;
                                    Image image = (Image) node;
                                    MarkwonConfiguration markwonConfiguration = (MarkwonConfiguration) parser.blockParserFactories;
                                    CodeSpanFactory codeSpanFactory = (CodeSpanFactory) ((Map) ((MatchResult.Destructured) markwonConfiguration.spansFactory).match).get(Image.class);
                                    if (codeSpanFactory == null) {
                                        parser.visitChildren(image);
                                        break;
                                    } else {
                                        int length9 = parser.length();
                                        parser.visitChildren(image);
                                        if (length9 == parser.length()) {
                                            spannableBuilder2.append((char) 65532);
                                        }
                                        boolean z2 = ((Node) image.parent) instanceof Link;
                                        POPMatchingFactory pOPMatchingFactory = (POPMatchingFactory) markwonConfiguration.imageDestinationProcessor;
                                        String str = image.destination;
                                        pOPMatchingFactory.getClass();
                                        RenderPropsImpl renderPropsImpl = (RenderPropsImpl) parser.delimiterProcessors;
                                        ImageProps.DESTINATION.set(renderPropsImpl, str);
                                        ImageProps.REPLACEMENT_TEXT_IS_LINK.set(renderPropsImpl, Boolean.valueOf(z2));
                                        ImageProps.IMAGE_SIZE.set(renderPropsImpl, null);
                                        Object spans = codeSpanFactory.getSpans(markwonConfiguration, renderPropsImpl);
                                        StringBuilder sb2 = spannableBuilder2.builder;
                                        int length10 = sb2.length();
                                        int length11 = sb2.length();
                                        if (length10 > length9 && length9 >= 0 && length10 <= length11) {
                                            SpannableBuilder.setSpansInternal(spannableBuilder2, spans, length9, length10);
                                            break;
                                        }
                                    }
                                    break;
                                case 13:
                                    Node node7 = (ListItem) node;
                                    int length12 = parser.length();
                                    RenderPropsImpl renderPropsImpl2 = (RenderPropsImpl) parser.delimiterProcessors;
                                    parser.visitChildren(node7);
                                    Block block3 = (Block) ((Node) node7.parent);
                                    boolean z3 = block3 instanceof OrderedList;
                                    Prop prop = CoreProps.LIST_ITEM_TYPE;
                                    if (z3) {
                                        OrderedList orderedList = (OrderedList) block3;
                                        int i52 = orderedList.startNumber;
                                        prop.set(renderPropsImpl2, CoreProps.ListItemType.ORDERED);
                                        CoreProps.ORDERED_LIST_ITEM_NUMBER.set(renderPropsImpl2, Integer.valueOf(i52));
                                        orderedList.startNumber++;
                                    } else {
                                        prop.set(renderPropsImpl2, CoreProps.ListItemType.BULLET);
                                        for (Node node8 = (Block) ((Node) node7.parent); node8 != null; node8 = node8.getParent()) {
                                            if (node8 instanceof ListItem) {
                                                i42++;
                                            }
                                        }
                                        CoreProps.BULLET_LIST_ITEM_LEVEL.set(renderPropsImpl2, Integer.valueOf(i42));
                                    }
                                    parser.setSpansForNodeOptional(node7, length12);
                                    if (((Node) node7.next) != null) {
                                        parser.ensureNewLine();
                                        break;
                                    }
                                    break;
                                default:
                                    parser.ensureNewLine();
                                    int length13 = parser.length();
                                    parser.visitChildren(node);
                                    parser.setSpansForNodeOptional(node, length13);
                                    parser.blockEnd(node);
                                    break;
                            }
                        }
                    });
                    CodeSpanFactory codeSpanFactory = new CodeSpanFactory(2);
                    hashMap.put(StrongEmphasis.class, new CodeSpanFactory(7));
                    hashMap.put(Emphasis.class, new CodeSpanFactory(3));
                    hashMap.put(BlockQuote.class, new CodeSpanFactory(1));
                    hashMap.put(Code.class, new CodeSpanFactory(0));
                    hashMap.put(FencedCodeBlock.class, codeSpanFactory);
                    hashMap.put(IndentedCodeBlock.class, codeSpanFactory);
                    hashMap.put(ListItem.class, new CodeSpanFactory(6));
                    hashMap.put(Heading.class, new CodeSpanFactory(4));
                    hashMap.put(Link.class, new CodeSpanFactory(5));
                    hashMap.put(ThematicBreak.class, new CodeSpanFactory(8));
                    arrayList2 = arrayList3;
                    jobs = jobs;
                    it2 = it3;
                    builder = builder;
                    i = 0;
                }
                Parser.Builder builder2 = builder;
                ArrayList arrayList4 = arrayList2;
                Jobs jobs2 = jobs;
                MarkwonTheme markwonTheme2 = new MarkwonTheme();
                markwonTheme2.blockMargin = markwonTheme.blockMargin;
                markwonTheme2.blockQuoteWidth = markwonTheme.blockQuoteWidth;
                markwonTheme2.bulletListItemStrokeWidth = markwonTheme.bulletListItemStrokeWidth;
                markwonTheme2.codeBlockMargin = markwonTheme.codeBlockMargin;
                markwonTheme2.headingBreakHeight = markwonTheme.headingBreakHeight;
                markwonTheme2.thematicBreakHeight = markwonTheme.thematicBreakHeight;
                MatchResult.Destructured destructured = new MatchResult.Destructured(Collections.unmodifiableMap(hashMap));
                subtreeManager.snapshotCache = markwonTheme2;
                subtreeManager.children = destructured;
                if (((y0) subtreeManager.contextForChildren) == null) {
                    subtreeManager.contextForChildren = new y0();
                }
                int i18 = 21;
                if (((Plane) subtreeManager.emitActionToParent) == null) {
                    subtreeManager.emitActionToParent = new Plane(i18);
                }
                if (((LinkResolverDef) subtreeManager.workflowSession) == null) {
                    subtreeManager.workflowSession = new LinkResolverDef(0);
                }
                if (((POPMatchingFactory) subtreeManager.interceptor) == null) {
                    subtreeManager.interceptor = new POPMatchingFactory(i18);
                }
                if (((KClasses$$Lambda$1) subtreeManager.idCounter) == null) {
                    subtreeManager.idCounter = new KClasses$$Lambda$1(20);
                }
                MarkwonConfiguration markwonConfiguration = new MarkwonConfiguration();
                markwonConfiguration.theme = (MarkwonTheme) subtreeManager.snapshotCache;
                markwonConfiguration.syntaxHighlight = (Plane) subtreeManager.emitActionToParent;
                markwonConfiguration.linkResolver = (LinkResolverDef) subtreeManager.workflowSession;
                markwonConfiguration.imageDestinationProcessor = (POPMatchingFactory) subtreeManager.interceptor;
                markwonConfiguration.spansFactory = (MatchResult.Destructured) subtreeManager.children;
                return new MarkwonImpl(new Parser(builder2), new FormBody.Builder(jobs2, markwonConfiguration), Collections.unmodifiableList(arrayList4));
            }
            CorePlugin corePlugin2 = (CorePlugin) it.next();
            if (!arrayList2.contains(corePlugin2)) {
                if (hashSet.contains(corePlugin2)) {
                    OptionalProvider$$ExternalSyntheticLambda0.m$1(hashSet, "Cyclic dependency chain found: ");
                    return null;
                }
                hashSet.add(corePlugin2);
                corePlugin2.getClass();
                hashSet.remove(corePlugin2);
                if (!arrayList2.contains(corePlugin2)) {
                    if (CorePlugin.class.isAssignableFrom(corePlugin2.getClass())) {
                        arrayList2.add(0, corePlugin2);
                    } else {
                        arrayList2.add(corePlugin2);
                    }
                }
            }
        }
    }

    public void addPart(Headers headers, RequestBody requestBody) {
        requestBody.getClass();
        if (headers.get("Content-Type") != null) {
            a$$ExternalSyntheticBUOutline0.m$3("Unexpected header: Content-Type");
        } else if (headers.get("Content-Length") != null) {
            a$$ExternalSyntheticBUOutline0.m$3("Unexpected header: Content-Length");
        } else {
            ((ArrayList) this.plugins).add(new MultipartBody.Part(headers, requestBody));
        }
    }

    @Override // com.withpersona.sdk2.camera.CameraXBinder
    public void bind() {
        SelfieStepFragment selfieStepFragment = (SelfieStepFragment) this.parser;
        CameraPreview cameraPreview = selfieStepFragment.cameraPreview;
        if (cameraPreview == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cameraPreview");
            throw null;
        }
        PreviewView previewView = ((Pi2OldSelfieCameraBinding) this.visitorFactory).previewviewSelfieCamera;
        CameraPreview.CameraDirection cameraDirection = CameraPreview.CameraDirection.FRONT;
        Lazy lazy = selfieStepFragment.selfieDirectionFeed;
        if (lazy != null) {
            cameraPreview.rebind(previewView, cameraDirection, (SelfieDirectionFeed) lazy.get(), false, new OldSelfieCameraScreenViewFactory$1$1$1$cameraController$1$$ExternalSyntheticLambda0((SelfieWorkflow.Screen.OldCameraScreen) this.plugins, 1));
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("selfieDirectionFeed");
            throw null;
        }
    }

    public MultipartBody build() {
        ArrayList arrayList = (ArrayList) this.plugins;
        if (!arrayList.isEmpty()) {
            return new MultipartBody((ByteString) this.parser, (MediaType) this.visitorFactory, _UtilJvmKt.toImmutableList(arrayList));
        }
        a$$ExternalSyntheticBUOutline0.m$1("Multipart body must have at least one part.");
        return null;
    }

    @Override // okio.Socket
    public void cancel() {
        ((ExchangeCodec) ((Exchange) this.plugins).codec).cancel();
    }

    @Override // okio.Socket
    public Sink getSink() {
        return (Exchange.RequestBodySink) this.parser;
    }

    @Override // okio.Socket
    public Source getSource() {
        return (Exchange.ResponseBodySource) this.visitorFactory;
    }

    public void onLayout() {
        Iterator it = ((LinkedList) this.plugins).iterator();
        it.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            next.getClass();
            ((Function0) next).invoke();
        }
    }

    public void setParsedMarkdown(TextView textView, SpannableStringBuilder spannableStringBuilder) {
        List list = (List) this.plugins;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((CorePlugin) it.next()).getClass();
            OrderedListItemSpan[] orderedListItemSpanArr = (OrderedListItemSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), OrderedListItemSpan.class);
            if (orderedListItemSpanArr != null) {
                TextPaint paint = textView.getPaint();
                for (OrderedListItemSpan orderedListItemSpan : orderedListItemSpanArr) {
                    orderedListItemSpan.margin = (int) (paint.measureText(orderedListItemSpan.number) + 0.5f);
                }
            }
            TextViewSpan[] textViewSpanArr = (TextViewSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), TextViewSpan.class);
            if (textViewSpanArr != null) {
                for (TextViewSpan textViewSpan : textViewSpanArr) {
                    spannableStringBuilder.removeSpan(textViewSpan);
                }
            }
            TextViewSpan textViewSpan2 = new TextViewSpan();
            new WeakReference(textView);
            spannableStringBuilder.setSpan(textViewSpan2, 0, spannableStringBuilder.length(), 18);
        }
        textView.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ((CorePlugin) it2.next()).getClass();
            if (textView.getMovementMethod() == null) {
                textView.setMovementMethod(LinkMovementMethod.getInstance());
            }
        }
    }

    public void setType(MediaType mediaType) {
        mediaType.getClass();
        if (Intrinsics.areEqual(mediaType.f1545type, "multipart")) {
            this.visitorFactory = mediaType;
        } else {
            Path$$ExternalSyntheticBUOutline0.m$3(mediaType, "multipart != ");
        }
    }

    public SpannableStringBuilder toMarkdown(String str) {
        int i;
        List list = (List) this.plugins;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((CorePlugin) it.next()).getClass();
        }
        Parser parser = (Parser) this.parser;
        if (str == null) {
            a$$ExternalSyntheticBUOutline0.m$2("input must not be null");
            return null;
        }
        DocumentParser documentParser = new DocumentParser((ArrayList) parser.blockParserFactories, (y0) parser.inlineParserFactory, (ArrayList) parser.delimiterProcessors);
        int i2 = 0;
        while (true) {
            int length = str.length();
            int i3 = i2;
            while (true) {
                i = 13;
                if (i3 >= length) {
                    i3 = -1;
                    break;
                }
                char charAt = str.charAt(i3);
                if (charAt == '\n' || charAt == '\r') {
                    break;
                }
                i3++;
            }
            if (i3 == -1) {
                break;
            }
            documentParser.incorporateLine(str.substring(i2, i3));
            i2 = i3 + 1;
            if (i2 < str.length() && str.charAt(i3) == '\r' && str.charAt(i2) == '\n') {
                i2 = i3 + 2;
            }
        }
        if (str.length() > 0 && (i2 == 0 || i2 < str.length())) {
            documentParser.incorporateLine(str.substring(i2));
        }
        documentParser.finalizeBlocks(documentParser.activeBlockParsers);
        RealWebSocket$connect$1 realWebSocket$connect$1 = new RealWebSocket$connect$1(i, documentParser.delimiterProcessors, documentParser.definitions);
        documentParser.inlineParserFactory.getClass();
        InlineParserImpl inlineParserImpl = new InlineParserImpl(realWebSocket$connect$1);
        Iterator it2 = documentParser.allBlockParsers.iterator();
        while (it2.hasNext()) {
            ((AbstractBlockParser) it2.next()).parseInlines(inlineParserImpl);
        }
        Document document = (Document) documentParser.documentBlockParser.document;
        Iterator it3 = ((ArrayList) parser.postProcessors).iterator();
        if (it3.hasNext()) {
            throw Recorder$$ExternalSyntheticOutline2.m(it3);
        }
        Iterator it4 = list.iterator();
        while (it4.hasNext()) {
            ((CorePlugin) it4.next()).getClass();
        }
        FormBody.Builder builder = (FormBody.Builder) this.visitorFactory;
        Parser parser2 = new Parser((MarkwonConfiguration) builder.values, new RenderPropsImpl(0), new SpannableBuilder(), Collections.unmodifiableMap(((Jobs) builder.names).jobs), new Plane(20));
        parser2.visit(document);
        Iterator it5 = list.iterator();
        while (it5.hasNext()) {
            ((CorePlugin) it5.next()).getClass();
        }
        SpannableBuilder spannableBuilder = (SpannableBuilder) parser2.postProcessors;
        SpannableBuilder.SpannableStringBuilderReversed spannableStringBuilderReversed = new SpannableBuilder.SpannableStringBuilderReversed(spannableBuilder.builder);
        Iterator it6 = spannableBuilder.spans.iterator();
        while (it6.hasNext()) {
            SpannableBuilder.Span span = (SpannableBuilder.Span) it6.next();
            spannableStringBuilderReversed.setSpan(span.what, span.start, span.end, span.flags);
        }
        return (!TextUtils.isEmpty(spannableStringBuilderReversed) || TextUtils.isEmpty(str)) ? spannableStringBuilderReversed : new SpannableStringBuilder(str);
    }

    public /* synthetic */ MarkwonImpl(Object obj, Object obj2, Object obj3) {
        this.parser = obj;
        this.visitorFactory = obj2;
        this.plugins = obj3;
    }

    public MarkwonImpl(String str) {
        str.getClass();
        this.parser = str;
        this.plugins = StringsKt.split$default(str, new char[]{'\n'}, 6);
        this.visitorFactory = str.length() > 0 ? new LookaheadText$Position(this, 0, -1, -1).nextPosition(1) : null;
    }

    public MarkwonImpl(ViewGroup viewGroup) {
        viewGroup.getClass();
        this.parser = viewGroup;
    }

    public MarkwonImpl(Context context) {
        context.getClass();
        this.parser = context;
        LayoutInflater from = LayoutInflater.from(context);
        from.getClass();
        this.visitorFactory = from;
        this.plugins = new LinkedList();
    }

    public MarkwonImpl(ReusableActivityResultLauncher reusableActivityResultLauncher, ReusableActivityResultLauncher reusableActivityResultLauncher2, ReusableActivityResultLauncher reusableActivityResultLauncher3) {
        reusableActivityResultLauncher.getClass();
        reusableActivityResultLauncher2.getClass();
        reusableActivityResultLauncher3.getClass();
        this.parser = reusableActivityResultLauncher;
        this.visitorFactory = reusableActivityResultLauncher2;
        this.plugins = reusableActivityResultLauncher3;
    }

    public MarkwonImpl(Parser parser, FormBody.Builder builder, List list) {
        TextView.BufferType bufferType = TextView.BufferType.SPANNABLE;
        this.parser = parser;
        this.visitorFactory = builder;
        this.plugins = list;
    }

    public MarkwonImpl(List list) {
        list.getClass();
        StateFlowImpl MutableStateFlow = FlowKt.MutableStateFlow(list);
        this.parser = MutableStateFlow;
        FlowKt.drop(MutableStateFlow, 1);
        SharedFlowImpl MutableSharedFlow$default = FlowKt.MutableSharedFlow$default(0, 1, null, 5);
        this.visitorFactory = MutableSharedFlow$default;
        this.plugins = MutableSharedFlow$default;
    }

    public MarkwonImpl(IntRange intRange, Method[] methodArr, Method method) {
        intRange.getClass();
        this.parser = intRange;
        this.visitorFactory = methodArr;
        this.plugins = method;
    }

    public MarkwonImpl(Context context, ActivityResultLauncher activityResultLauncher, TrackingEventsLogger trackingEventsLogger) {
        context.getClass();
        activityResultLauncher.getClass();
        trackingEventsLogger.getClass();
        this.parser = context;
        this.visitorFactory = activityResultLauncher;
        this.plugins = trackingEventsLogger;
    }

    public MarkwonImpl(ActivityResultLauncher activityResultLauncher, ActivityResultLauncher activityResultLauncher2, Context context) {
        activityResultLauncher.getClass();
        activityResultLauncher2.getClass();
        context.getClass();
        this.parser = activityResultLauncher;
        this.visitorFactory = activityResultLauncher2;
        this.plugins = context;
    }

    public MarkwonImpl() {
        String m = Boxes$$ExternalSyntheticOutline1.m();
        ByteString.Companion companion = ByteString.Companion;
        this.parser = ByteString.Companion.encodeUtf8(m);
        this.visitorFactory = MultipartBody.MIXED;
        this.plugins = new ArrayList();
    }

    public UiStepFileSelectWorker create(int i, String str, String[] strArr) {
        String concat = "FileUploadPicker-".concat(str);
        Continuation continuation = null;
        return new UiStepFileSelectWorker(concat, (Context) this.plugins, new Http2Connection$$ExternalSyntheticLambda3(i, this, strArr, 11), new UiStepFileSelectWorker$Factory$create$2(i, continuation, 0), new UiStepFileSelectWorker$Factory$create$2(i, continuation, 2));
    }
}
