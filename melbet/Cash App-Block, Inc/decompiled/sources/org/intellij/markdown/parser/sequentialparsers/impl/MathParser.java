package org.intellij.markdown.parser.sequentialparsers.impl;

import androidx.biometric.CryptoObjectUtils;
import androidx.biometric.KeyguardUtils;
import com.squareup.cash.scrubbing.USPhoneNumberVisualTransformer$filter$3;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import net.idrnd.face.iad.capture.internal.p0;
import org.commonmark.internal.BlockContent;
import org.intellij.markdown.MarkdownElementType;
import org.intellij.markdown.MarkdownTokenTypes;
import org.intellij.markdown.flavours.gfm.GFMElementTypes;
import org.intellij.markdown.flavours.gfm.GFMTokenTypes;
import org.intellij.markdown.parser.sequentialparsers.LocalParsingResult;
import org.intellij.markdown.parser.sequentialparsers.SequentialParser;
import org.intellij.markdown.parser.sequentialparsers.TokensCache$RangesListIterator;

/* loaded from: classes10.dex */
public final class MathParser implements SequentialParser {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ MathParser(int i) {
        this.$r8$classId = i;
    }

    @Override // org.intellij.markdown.parser.sequentialparsers.SequentialParser
    public final USPhoneNumberVisualTransformer$filter$3 parse(p0 p0Var, List list) {
        LocalParsingResult parseInlineLink;
        LocalParsingResult parseReferenceLink;
        switch (this.$r8$classId) {
            case 0:
                list.getClass();
                USPhoneNumberVisualTransformer$filter$3 uSPhoneNumberVisualTransformer$filter$3 = new USPhoneNumberVisualTransformer$filter$3();
                ArrayList arrayList = new ArrayList();
                BlockContent tokensCache$RangesListIterator = new TokensCache$RangesListIterator(p0Var, list);
                int i = -239;
                int i2 = -239;
                while (true) {
                    MarkdownElementType type2 = tokensCache$RangesListIterator.getType();
                    int i3 = tokensCache$RangesListIterator.lineCount;
                    if (type2 == null) {
                        if (i2 != -239) {
                            arrayList.add(new IntRange(i2, i, 1));
                        }
                        uSPhoneNumberVisualTransformer$filter$3.withFurtherProcessing(arrayList);
                        return uSPhoneNumberVisualTransformer$filter$3;
                    }
                    if (Intrinsics.areEqual(tokensCache$RangesListIterator.getType(), GFMTokenTypes.DOLLAR)) {
                        BlockContent advance = tokensCache$RangesListIterator.advance();
                        int length = tokensCache$RangesListIterator.getLength();
                        while (true) {
                            if (advance.getType() == null) {
                                advance = null;
                            } else if (!Intrinsics.areEqual(advance.getType(), GFMTokenTypes.DOLLAR) || advance.getLength() != length) {
                                advance = advance.advance();
                            }
                        }
                        if (advance != null) {
                            int i4 = advance.lineCount;
                            int length2 = tokensCache$RangesListIterator.getLength();
                            ArrayList arrayList2 = uSPhoneNumberVisualTransformer$filter$3.$originalToTransformed;
                            if (length2 == 1) {
                                arrayList2.add(new SequentialParser.Node(new IntRange(i3, i4 + 1, 1), GFMElementTypes.INLINE_MATH));
                            } else {
                                arrayList2.add(new SequentialParser.Node(new IntRange(i3, i4 + 1, 1), GFMElementTypes.BLOCK_MATH));
                            }
                            tokensCache$RangesListIterator = advance.advance();
                        }
                    }
                    if (i + 1 != i3) {
                        if (i2 != -239) {
                            arrayList.add(new IntRange(i2, i, 1));
                        }
                        i2 = i3;
                    }
                    tokensCache$RangesListIterator = tokensCache$RangesListIterator.advance();
                    i = i3;
                }
                break;
            case 1:
                MarkdownElementType markdownElementType = MarkdownTokenTypes.BACKTICK;
                MarkdownElementType markdownElementType2 = MarkdownTokenTypes.ESCAPED_BACKTICKS;
                list.getClass();
                USPhoneNumberVisualTransformer$filter$3 uSPhoneNumberVisualTransformer$filter$32 = new USPhoneNumberVisualTransformer$filter$3();
                ArrayList arrayList3 = new ArrayList();
                BlockContent tokensCache$RangesListIterator2 = new TokensCache$RangesListIterator(p0Var, list);
                int i5 = -239;
                int i6 = -239;
                while (true) {
                    MarkdownElementType type3 = tokensCache$RangesListIterator2.getType();
                    int i7 = tokensCache$RangesListIterator2.lineCount;
                    if (type3 == null) {
                        if (i6 != -239) {
                            arrayList3.add(new IntRange(i6, i5, 1));
                        }
                        uSPhoneNumberVisualTransformer$filter$32.withFurtherProcessing(arrayList3);
                        return uSPhoneNumberVisualTransformer$filter$32;
                    }
                    if (Intrinsics.areEqual(tokensCache$RangesListIterator2.getType(), markdownElementType) || Intrinsics.areEqual(tokensCache$RangesListIterator2.getType(), markdownElementType2)) {
                        BlockContent advance2 = tokensCache$RangesListIterator2.advance();
                        int length3 = tokensCache$RangesListIterator2.getLength() - (Intrinsics.areEqual(tokensCache$RangesListIterator2.getType(), markdownElementType2) ? 2 : 0);
                        while (true) {
                            if (advance2.getType() != null) {
                                if (Intrinsics.areEqual(advance2.getType(), markdownElementType) || Intrinsics.areEqual(advance2.getType(), markdownElementType2)) {
                                    if (advance2.getLength() - (Intrinsics.areEqual(advance2.getType(), markdownElementType2) ? 1 : 0) == length3) {
                                    }
                                }
                                advance2 = advance2.advance();
                            } else {
                                advance2 = null;
                            }
                        }
                        if (advance2 != null) {
                            uSPhoneNumberVisualTransformer$filter$32.$originalToTransformed.add(new SequentialParser.Node(new IntRange(i7, advance2.lineCount + 1, 1), MarkdownTokenTypes.CODE_SPAN));
                            tokensCache$RangesListIterator2 = advance2.advance();
                        }
                    }
                    if (i5 + 1 != i7) {
                        if (i6 != -239) {
                            arrayList3.add(new IntRange(i6, i5, 1));
                        }
                        i6 = i7;
                    }
                    tokensCache$RangesListIterator2 = tokensCache$RangesListIterator2.advance();
                    i5 = i7;
                }
                break;
            case 2:
                list.getClass();
                USPhoneNumberVisualTransformer$filter$3 uSPhoneNumberVisualTransformer$filter$33 = new USPhoneNumberVisualTransformer$filter$3();
                ArrayList arrayList4 = new ArrayList();
                BlockContent tokensCache$RangesListIterator3 = new TokensCache$RangesListIterator(p0Var, list);
                int i8 = -239;
                int i9 = -239;
                while (true) {
                    MarkdownElementType type4 = tokensCache$RangesListIterator3.getType();
                    int i10 = tokensCache$RangesListIterator3.lineCount;
                    if (type4 == null) {
                        if (i9 != -239) {
                            arrayList4.add(new IntRange(i9, i8, 1));
                        }
                        uSPhoneNumberVisualTransformer$filter$33.withFurtherProcessing(arrayList4);
                        return uSPhoneNumberVisualTransformer$filter$33;
                    }
                    if (Intrinsics.areEqual(tokensCache$RangesListIterator3.getType(), MarkdownTokenTypes.EXCLAMATION_MARK) && Intrinsics.areEqual(tokensCache$RangesListIterator3.rawLookup(), MarkdownTokenTypes.LBRACKET)) {
                        LocalParsingResult parseInlineLink2 = CryptoObjectUtils.parseInlineLink(tokensCache$RangesListIterator3.advance());
                        if (parseInlineLink2 == null) {
                            parseInlineLink2 = KeyguardUtils.parseReferenceLink(tokensCache$RangesListIterator3.advance());
                        }
                        if (parseInlineLink2 != null) {
                            BlockContent blockContent = parseInlineLink2.iteratorPosition;
                            uSPhoneNumberVisualTransformer$filter$33.$originalToTransformed.add(new SequentialParser.Node(new IntRange(i10, blockContent.lineCount + 1, 1), MarkdownTokenTypes.IMAGE));
                            uSPhoneNumberVisualTransformer$filter$33.withOtherParsingResult(parseInlineLink2);
                            tokensCache$RangesListIterator3 = blockContent.advance();
                        }
                    }
                    if (i8 + 1 != i10) {
                        if (i9 != -239) {
                            arrayList4.add(new IntRange(i9, i8, 1));
                        }
                        i9 = i10;
                    }
                    tokensCache$RangesListIterator3 = tokensCache$RangesListIterator3.advance();
                    i8 = i10;
                }
                break;
            case 3:
                list.getClass();
                USPhoneNumberVisualTransformer$filter$3 uSPhoneNumberVisualTransformer$filter$34 = new USPhoneNumberVisualTransformer$filter$3();
                ArrayList arrayList5 = new ArrayList();
                BlockContent tokensCache$RangesListIterator4 = new TokensCache$RangesListIterator(p0Var, list);
                int i11 = -239;
                int i12 = -239;
                while (tokensCache$RangesListIterator4.getType() != null) {
                    if (!Intrinsics.areEqual(tokensCache$RangesListIterator4.getType(), MarkdownTokenTypes.LBRACKET) || (parseInlineLink = CryptoObjectUtils.parseInlineLink(tokensCache$RangesListIterator4)) == null) {
                        int i13 = tokensCache$RangesListIterator4.lineCount;
                        if (i11 + 1 != i13) {
                            if (i12 != -239) {
                                arrayList5.add(new IntRange(i12, i11, 1));
                            }
                            i12 = i13;
                        }
                        tokensCache$RangesListIterator4 = tokensCache$RangesListIterator4.advance();
                        i11 = i13;
                    } else {
                        tokensCache$RangesListIterator4 = parseInlineLink.iteratorPosition.advance();
                        uSPhoneNumberVisualTransformer$filter$34.withOtherParsingResult(parseInlineLink);
                    }
                }
                if (i12 != -239) {
                    arrayList5.add(new IntRange(i12, i11, 1));
                }
                uSPhoneNumberVisualTransformer$filter$34.withFurtherProcessing(arrayList5);
                return uSPhoneNumberVisualTransformer$filter$34;
            default:
                list.getClass();
                USPhoneNumberVisualTransformer$filter$3 uSPhoneNumberVisualTransformer$filter$35 = new USPhoneNumberVisualTransformer$filter$3();
                ArrayList arrayList6 = new ArrayList();
                BlockContent tokensCache$RangesListIterator5 = new TokensCache$RangesListIterator(p0Var, list);
                int i14 = -239;
                int i15 = -239;
                while (tokensCache$RangesListIterator5.getType() != null) {
                    if (!Intrinsics.areEqual(tokensCache$RangesListIterator5.getType(), MarkdownTokenTypes.LBRACKET) || (parseReferenceLink = KeyguardUtils.parseReferenceLink(tokensCache$RangesListIterator5)) == null) {
                        int i16 = tokensCache$RangesListIterator5.lineCount;
                        if (i14 + 1 != i16) {
                            if (i15 != -239) {
                                arrayList6.add(new IntRange(i15, i14, 1));
                            }
                            i15 = i16;
                        }
                        tokensCache$RangesListIterator5 = tokensCache$RangesListIterator5.advance();
                        i14 = i16;
                    } else {
                        tokensCache$RangesListIterator5 = parseReferenceLink.iteratorPosition.advance();
                        uSPhoneNumberVisualTransformer$filter$35.withOtherParsingResult(parseReferenceLink);
                    }
                }
                if (i15 != -239) {
                    arrayList6.add(new IntRange(i15, i14, 1));
                }
                uSPhoneNumberVisualTransformer$filter$35.withFurtherProcessing(arrayList6);
                return uSPhoneNumberVisualTransformer$filter$35;
        }
    }
}
