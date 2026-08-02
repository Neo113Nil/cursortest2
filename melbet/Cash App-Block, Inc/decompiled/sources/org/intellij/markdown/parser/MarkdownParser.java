package org.intellij.markdown.parser;

import androidx.biometric.AuthenticatorUtils;
import coil3.svg.internal.ParseSvg_androidKt;
import com.squareup.cash.scrubbing.USPhoneNumberVisualTransformer$filter$3;
import io.noties.markwon.MarkwonImpl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import net.idrnd.face.iad.capture.internal.p0;
import net.oneformapp.helper.matching.POPMatchingFactory;
import okhttp3.FormBody;
import org.bouncycastle.pqc.asn1.GMSSPrivateKey$$ExternalSyntheticOutline0;
import org.commonmark.internal.BlockContent;
import org.intellij.markdown.MarkdownElementType;
import org.intellij.markdown.MarkdownParsingException;
import org.intellij.markdown.MarkdownTokenTypes;
import org.intellij.markdown.ast.ASTNodeImpl;
import org.intellij.markdown.flavours.gfm.GFMConstraints;
import org.intellij.markdown.flavours.gfm.GFMFlavourDescriptor;
import org.intellij.markdown.flavours.gfm.GFMMarkerProcessor;
import org.intellij.markdown.flavours.gfm.GFMTokenTypes;
import org.intellij.markdown.flavours.gfm.StrikeThroughDelimiterParser;
import org.intellij.markdown.flavours.gfm.lexer._GFMLexer;
import org.intellij.markdown.lexer.MarkdownLexer;
import org.intellij.markdown.parser.constraints.CommonMarkdownConstraints;
import org.intellij.markdown.parser.markerblocks.MarkerBlock$ProcessingResult;
import org.intellij.markdown.parser.markerblocks.MarkerBlockImpl;
import org.intellij.markdown.parser.markerblocks.MarkerBlockProvider;
import org.intellij.markdown.parser.markerblocks.impl.ParagraphMarkerBlock;
import org.intellij.markdown.parser.sequentialparsers.EmphasisLikeParser;
import org.intellij.markdown.parser.sequentialparsers.SequentialParser;
import org.intellij.markdown.parser.sequentialparsers.impl.MathParser;

/* loaded from: classes10.dex */
public final class MarkdownParser {
    public final GFMFlavourDescriptor flavour;

    public final class InlineExpandingASTNodeBuilder extends FormBody.Builder {
        public final /* synthetic */ MarkdownParser this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InlineExpandingASTNodeBuilder(MarkdownParser markdownParser, String str) {
            super(0, str);
            str.getClass();
            this.this$0 = markdownParser;
        }

        @Override // okhttp3.FormBody.Builder
        public final List createLeafNodes(MarkdownElementType markdownElementType, int i, int i2) {
            int i3;
            markdownElementType.getClass();
            int i4 = 1;
            if (!(markdownElementType.equals(MarkdownTokenTypes.PARAGRAPH) ? true : markdownElementType.equals(MarkdownTokenTypes.ATX_CONTENT) ? true : markdownElementType.equals(MarkdownTokenTypes.SETEXT_CONTENT) ? true : markdownElementType.equals(GFMTokenTypes.CELL))) {
                return super.createLeafNodes(markdownElementType, i, i2);
            }
            CharSequence charSequence = (CharSequence) this.names;
            charSequence.getClass();
            GFMFlavourDescriptor gFMFlavourDescriptor = this.this$0.flavour;
            gFMFlavourDescriptor.getClass();
            _GFMLexer _gfmlexer = new _GFMLexer();
            MarkdownLexer markdownLexer = new MarkdownLexer(_gfmlexer);
            charSequence.getClass();
            markdownLexer.originalText = charSequence;
            markdownLexer.bufferStart = i;
            markdownLexer.bufferEnd = i2;
            _gfmlexer.zzBuffer = charSequence;
            _gfmlexer.tokenStart = i;
            _gfmlexer.zzMarkedPos = i;
            _gfmlexer.zzCurrentPos = i;
            int i5 = 0;
            _gfmlexer.zzAtEOF = false;
            _gfmlexer.zzEndRead = i2;
            _gfmlexer.state = 0;
            markdownLexer.f1631type = markdownLexer.advanceBase();
            markdownLexer.tokenStart = _gfmlexer.tokenStart;
            markdownLexer.calcNextType();
            p0 p0Var = new p0(markdownLexer);
            IntRange intRange = new IntRange(0, ((ArrayList) p0Var.b).size(), 1);
            POPMatchingFactory pOPMatchingFactory = gFMFlavourDescriptor.sequentialParserManager;
            ArrayList arrayList = new ArrayList();
            int i6 = intRange.last;
            int i7 = i6 - 1;
            if (i7 >= 0) {
                int i8 = 0;
                i3 = 0;
                while (true) {
                    if (Intrinsics.areEqual(new BlockContent(p0Var, i8, 6).getType(), MarkdownTokenTypes.BLOCK_QUOTE)) {
                        if (i3 < i8) {
                            arrayList.add(new IntRange(i3, i8 - 1, 1));
                        }
                        i3 = i8 + 1;
                    }
                    if (i8 == i7) {
                        break;
                    }
                    i8++;
                }
            } else {
                i3 = 0;
            }
            if (i3 < i6) {
                arrayList.add(new IntRange(i3, i6, 1));
            }
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add(arrayList);
            for (SequentialParser sequentialParser : CollectionsKt__CollectionsKt.listOf((Object[]) new SequentialParser[]{new EmphasisLikeParser(CollectionsKt__CollectionsKt.listOf((Object[]) new MarkdownElementType[]{MarkdownTokenTypes.AUTOLINK, GFMTokenTypes.GFM_AUTOLINK})), new MathParser(i4), new MathParser(i5), new MathParser(2), new MathParser(3), new MathParser(4), new EmphasisLikeParser(new AuthenticatorUtils[]{new StrikeThroughDelimiterParser(i4), new StrikeThroughDelimiterParser(i5)})})) {
                ArrayList arrayList4 = new ArrayList();
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    List list = (List) it.next();
                    list.getClass();
                    USPhoneNumberVisualTransformer$filter$3 parse = sequentialParser.parse(p0Var, list);
                    arrayList2.addAll(parse.$originalToTransformed);
                    arrayList4.addAll(parse.$transformedToOriginal);
                }
                arrayList3 = arrayList4;
            }
            return CollectionsKt__CollectionsJVMKt.listOf(new InlineBuilder(new FormBody.Builder(0, charSequence), p0Var).buildTree(CollectionsKt.plus((Iterable) CollectionsKt__CollectionsJVMKt.listOf(new SequentialParser.Node(intRange, markdownElementType)), (Collection) arrayList2)));
        }
    }

    public MarkdownParser(GFMFlavourDescriptor gFMFlavourDescriptor) {
        gFMFlavourDescriptor.getClass();
        this.flavour = gFMFlavourDescriptor;
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x00e0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ASTNodeImpl doParse(MarkdownElementType markdownElementType, String str) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        MarkdownElementType markdownElementType2;
        int nextLineOrEofOffset;
        MarkerBlockImpl markerBlockImpl;
        List<MarkerBlockImpl> list;
        MarkerBlock$ProcessingResult markerBlock$ProcessingResult;
        BlockContent blockContent = new BlockContent(5);
        ArrayList arrayList = (ArrayList) blockContent.sb;
        this.flavour.getClass();
        GFMMarkerProcessor gFMMarkerProcessor = new GFMMarkerProcessor(blockContent, GFMConstraints.BASE);
        int i3 = blockContent.lineCount;
        LookaheadText$Position lookaheadText$Position = (LookaheadText$Position) new MarkwonImpl(str).visitorFactory;
        while (true) {
            int i4 = -1;
            if (lookaheadText$Position == null) {
                blockContent.lineCount = str.length();
                gFMMarkerProcessor.closeChildren(-1, 3);
                markdownElementType.getClass();
                arrayList.add(new SequentialParser.Node(new IntRange(i3, blockContent.lineCount, 1), markdownElementType));
                return new TopLevelBuilder(new InlineExpandingASTNodeBuilder(this, str)).buildTree(arrayList);
            }
            int i5 = lookaheadText$Position.globalPos;
            blockContent.lineCount = i5;
            String str2 = lookaheadText$Position.currentLine;
            int i6 = lookaheadText$Position.localPos;
            ArrayList arrayList2 = gFMMarkerProcessor.markersStack;
            if (i6 == -1) {
                gFMMarkerProcessor.stateInfo = new MarkerProcessor$StateInfo(gFMMarkerProcessor.startConstraints, gFMMarkerProcessor.topBlockConstraints.applyToNextLine$1(lookaheadText$Position), arrayList2);
            } else {
                CommonMarkdownConstraints commonMarkdownConstraints = gFMMarkerProcessor.stateInfo.nextConstraints;
                commonMarkdownConstraints.getClass();
                if (i6 == ParseSvg_androidKt.getCharsEaten(commonMarkdownConstraints, str2)) {
                    CommonMarkdownConstraints commonMarkdownConstraints2 = gFMMarkerProcessor.stateInfo.nextConstraints;
                    CommonMarkdownConstraints addModifierIfNeeded$1 = commonMarkdownConstraints2.addModifierIfNeeded$1(lookaheadText$Position);
                    if (addModifierIfNeeded$1 == null) {
                        addModifierIfNeeded$1 = gFMMarkerProcessor.stateInfo.nextConstraints;
                    }
                    gFMMarkerProcessor.stateInfo = new MarkerProcessor$StateInfo(commonMarkdownConstraints2, addModifierIfNeeded$1, arrayList2);
                }
            }
            if (i5 >= gFMMarkerProcessor.nextInterestingPosForExistingMarkers) {
                int size = arrayList2.size();
                while (size > 0) {
                    size--;
                    if (size < arrayList2.size()) {
                        MarkerBlockImpl markerBlockImpl2 = (MarkerBlockImpl) arrayList2.get(size);
                        CommonMarkdownConstraints commonMarkdownConstraints3 = gFMMarkerProcessor.stateInfo.currentConstraints;
                        markerBlockImpl2.getClass();
                        commonMarkdownConstraints3.getClass();
                        int i7 = markerBlockImpl2.lastInterestingOffset;
                        if (i7 != i5) {
                            if (markerBlockImpl2.scheduledResult != null) {
                                markerBlock$ProcessingResult = MarkerBlock$ProcessingResult.CANCEL;
                                if (Intrinsics.areEqual(markerBlock$ProcessingResult, MarkerBlock$ProcessingResult.PASS)) {
                                    gFMMarkerProcessor.closeChildren(size, markerBlock$ProcessingResult.childrenAction);
                                    int i8 = markerBlock$ProcessingResult.selfAction;
                                    if (i8 == 0) {
                                        throw null;
                                    }
                                    if (i8 == 3) {
                                        i8 = 1;
                                    }
                                    GMSSPrivateKey$$ExternalSyntheticOutline0._dispatch_doAction(i8, markerBlockImpl2.marker, markerBlockImpl2.getDefaultNodeType());
                                    if (i8 != 4) {
                                        arrayList2.remove(size);
                                        gFMMarkerProcessor.relaxTopConstraints();
                                    }
                                    if (markerBlock$ProcessingResult.eventAction == 2) {
                                        break;
                                    }
                                } else {
                                    continue;
                                }
                            } else {
                                i4 = -1;
                            }
                        }
                        if (i7 == i4 || i7 > i5) {
                            markerBlock$ProcessingResult = MarkerBlock$ProcessingResult.PASS;
                        } else if (i7 >= i5 || markerBlockImpl2.isInterestingOffset(lookaheadText$Position)) {
                            markerBlock$ProcessingResult = markerBlockImpl2.scheduledResult;
                            if (markerBlock$ProcessingResult == null) {
                                markerBlock$ProcessingResult = markerBlockImpl2.doProcessToken(lookaheadText$Position, commonMarkdownConstraints3);
                            }
                        } else {
                            markerBlock$ProcessingResult = MarkerBlock$ProcessingResult.PASS;
                        }
                        if (Intrinsics.areEqual(markerBlock$ProcessingResult, MarkerBlock$ProcessingResult.PASS)) {
                        }
                    }
                    i4 = -1;
                }
                z = true;
            } else {
                z = false;
            }
            CommonMarkdownConstraints commonMarkdownConstraints4 = gFMMarkerProcessor.stateInfo.currentConstraints;
            commonMarkdownConstraints4.getClass();
            int charsEaten = ParseSvg_androidKt.getCharsEaten(commonMarkdownConstraints4, str2);
            BlockContent blockContent2 = gFMMarkerProcessor.productionHolder;
            if (i6 == charsEaten && ((markerBlockImpl = (MarkerBlockImpl) CollectionsKt.lastOrNull((List) arrayList2)) == null || markerBlockImpl.allowsSubBlocks())) {
                if (i6 == -1) {
                    list = gFMMarkerProcessor.NO_BLOCKS;
                    z2 = z;
                } else {
                    CommonMarkdownConstraints commonMarkdownConstraints5 = gFMMarkerProcessor.stateInfo.currentConstraints;
                    commonMarkdownConstraints5.getClass();
                    if (i6 != ParseSvg_androidKt.getCharsEaten(commonMarkdownConstraints5, str2)) {
                        throw new MarkdownParsingException("");
                    }
                    Iterator it = gFMMarkerProcessor.markerBlockProviders.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            List createMarkerBlocks = ((MarkerBlockProvider) it.next()).createMarkerBlocks(lookaheadText$Position, blockContent2, gFMMarkerProcessor.stateInfo);
                            if (!createMarkerBlocks.isEmpty()) {
                                z2 = z;
                                list = createMarkerBlocks;
                                break;
                            }
                        } else if (i6 < ParseSvg_androidKt.getCharsEaten(gFMMarkerProcessor.stateInfo.nextConstraints, str2) || lookaheadText$Position.charsToNonWhitespace() == null) {
                            z2 = z;
                            list = EmptyList.INSTANCE;
                        } else {
                            z2 = z;
                            list = CollectionsKt__CollectionsJVMKt.listOf(new ParagraphMarkerBlock(gFMMarkerProcessor.stateInfo.currentConstraints, new BlockContent(blockContent2), gFMMarkerProcessor.interruptsParagraph));
                        }
                    }
                }
                for (MarkerBlockImpl markerBlockImpl3 : list) {
                    markerBlockImpl3.getClass();
                    arrayList2.add(markerBlockImpl3);
                    gFMMarkerProcessor.relaxTopConstraints();
                    z2 = true;
                }
            } else {
                z2 = z;
            }
            if (z2) {
                MarkerBlockImpl markerBlockImpl4 = (MarkerBlockImpl) CollectionsKt.lastOrNull((List) arrayList2);
                if (markerBlockImpl4 == null) {
                    nextLineOrEofOffset = lookaheadText$Position.getNextLineOrEofOffset();
                } else if (markerBlockImpl4.scheduledResult != null) {
                    nextLineOrEofOffset = i5 + 1;
                } else {
                    int i9 = markerBlockImpl4.lastInterestingOffset;
                    if (i9 != -1 && i9 <= i5) {
                        markerBlockImpl4.lastInterestingOffset = markerBlockImpl4.calcNextInterestingOffset(lookaheadText$Position);
                    }
                    nextLineOrEofOffset = markerBlockImpl4.lastInterestingOffset;
                }
                i = -1;
                if (nextLineOrEofOffset == -1) {
                    nextLineOrEofOffset = Integer.MAX_VALUE;
                }
                gFMMarkerProcessor.nextInterestingPosForExistingMarkers = nextLineOrEofOffset;
            } else {
                i = -1;
            }
            if (i6 != i) {
                CommonMarkdownConstraints commonMarkdownConstraints6 = gFMMarkerProcessor.stateInfo.currentConstraints;
                commonMarkdownConstraints6.getClass();
                if (i6 != ParseSvg_androidKt.getCharsEaten(commonMarkdownConstraints6, str2)) {
                    lookaheadText$Position = lookaheadText$Position.nextPosition(gFMMarkerProcessor.nextInterestingPosForExistingMarkers - i5);
                }
            }
            int charsEaten2 = ParseSvg_androidKt.getCharsEaten(gFMMarkerProcessor.stateInfo.nextConstraints, str2) - i6;
            if (charsEaten2 > 0) {
                if (i6 != -1 && gFMMarkerProcessor.stateInfo.nextConstraints.getIndent() <= gFMMarkerProcessor.topBlockConstraints.getIndent()) {
                    CommonMarkdownConstraints commonMarkdownConstraints7 = gFMMarkerProcessor.stateInfo.nextConstraints;
                    String str3 = lookaheadText$Position.currentLine;
                    commonMarkdownConstraints7.getClass();
                    if ((commonMarkdownConstraints7 instanceof GFMConstraints) && ((GFMConstraints) commonMarkdownConstraints7).isCheckbox) {
                        int i10 = lookaheadText$Position.globalPos;
                        int i11 = lookaheadText$Position.localPos;
                        int i12 = i11;
                        while (i12 < str3.length() && str3.charAt(i12) != '[') {
                            i12++;
                        }
                        if (i12 == str3.length()) {
                            gFMMarkerProcessor.populateConstraintsTokens$org$intellij$markdown$flavours$commonmark$CommonMarkMarkerProcessor(blockContent2, lookaheadText$Position, commonMarkdownConstraints7);
                        } else {
                            Character lastOrNull = ArraysKt___ArraysKt.lastOrNull(commonMarkdownConstraints7.types);
                            if (lastOrNull == null) {
                                i2 = i11;
                            } else {
                                i2 = i11;
                                if (lastOrNull.charValue() == '>') {
                                    markdownElementType2 = MarkdownTokenTypes.BLOCK_QUOTE;
                                    int i13 = i10 - i2;
                                    int i14 = i12 + i13;
                                    blockContent2.addProduction(CollectionsKt__CollectionsKt.listOf((Object[]) new SequentialParser.Node[]{new SequentialParser.Node(new IntRange(i10, i14, 1), markdownElementType2), new SequentialParser.Node(new IntRange(i14, Math.min(ParseSvg_androidKt.getCharsEaten(commonMarkdownConstraints7, str3) + i13, lookaheadText$Position.getNextLineOrEofOffset()), 1), GFMTokenTypes.CHECK_BOX)}));
                                }
                            }
                            markdownElementType2 = ((lastOrNull != null && lastOrNull.charValue() == '.') || (lastOrNull != null && lastOrNull.charValue() == ')')) ? MarkdownTokenTypes.LIST_NUMBER : MarkdownTokenTypes.LIST_BULLET;
                            int i132 = i10 - i2;
                            int i142 = i12 + i132;
                            blockContent2.addProduction(CollectionsKt__CollectionsKt.listOf((Object[]) new SequentialParser.Node[]{new SequentialParser.Node(new IntRange(i10, i142, 1), markdownElementType2), new SequentialParser.Node(new IntRange(i142, Math.min(ParseSvg_androidKt.getCharsEaten(commonMarkdownConstraints7, str3) + i132, lookaheadText$Position.getNextLineOrEofOffset()), 1), GFMTokenTypes.CHECK_BOX)}));
                        }
                    } else {
                        gFMMarkerProcessor.populateConstraintsTokens$org$intellij$markdown$flavours$commonmark$CommonMarkMarkerProcessor(blockContent2, lookaheadText$Position, commonMarkdownConstraints7);
                    }
                }
                lookaheadText$Position = lookaheadText$Position.nextPosition(charsEaten2);
            } else {
                lookaheadText$Position = lookaheadText$Position.nextPosition(gFMMarkerProcessor.nextInterestingPosForExistingMarkers - i5);
            }
        }
    }
}
