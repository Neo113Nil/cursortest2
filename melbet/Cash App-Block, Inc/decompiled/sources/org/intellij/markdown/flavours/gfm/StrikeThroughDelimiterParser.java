package org.intellij.markdown.flavours.gfm;

import androidx.biometric.AuthenticatorUtils;
import com.google.android.gms.dynamite.zzb;
import com.squareup.cash.scrubbing.USPhoneNumberVisualTransformer$filter$3;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import net.idrnd.face.iad.capture.internal.p0;
import org.commonmark.internal.BlockContent;
import org.intellij.markdown.MarkdownElementType;
import org.intellij.markdown.MarkdownTokenTypes;
import org.intellij.markdown.parser.sequentialparsers.DelimiterParser$Info;
import org.intellij.markdown.parser.sequentialparsers.SequentialParser;
import org.intellij.markdown.parser.sequentialparsers.TokensCache$RangesListIterator;

/* loaded from: classes10.dex */
public final class StrikeThroughDelimiterParser extends AuthenticatorUtils {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ StrikeThroughDelimiterParser(int i) {
        this.$r8$classId = i;
    }

    @Override // androidx.biometric.AuthenticatorUtils
    public final void process(p0 p0Var, TokensCache$RangesListIterator tokensCache$RangesListIterator, ArrayList arrayList, USPhoneNumberVisualTransformer$filter$3 uSPhoneNumberVisualTransformer$filter$3) {
        int i;
        int i2;
        switch (this.$r8$classId) {
            case 0:
                int size = arrayList.size() - 1;
                if (size >= 0) {
                    boolean z = false;
                    while (true) {
                        int i3 = size - 1;
                        if (z) {
                            z = false;
                        } else {
                            DelimiterParser$Info delimiterParser$Info = (DelimiterParser$Info) arrayList.get(size);
                            if (Intrinsics.areEqual(delimiterParser$Info.tokenType, GFMTokenTypes.TILDE) && (i = delimiterParser$Info.closerIndex) != -1) {
                                z = zzb.areAdjacentSameMarkers(arrayList, size, i);
                                DelimiterParser$Info delimiterParser$Info2 = (DelimiterParser$Info) arrayList.get(delimiterParser$Info.closerIndex);
                                if (z) {
                                    uSPhoneNumberVisualTransformer$filter$3.$originalToTransformed.add(new SequentialParser.Node(new IntRange(delimiterParser$Info.position - 1, delimiterParser$Info2.position + 2, 1), GFMElementTypes.STRIKETHROUGH));
                                }
                            }
                        }
                        if (i3 < 0) {
                            break;
                        } else {
                            size = i3;
                        }
                    }
                }
                break;
            default:
                int size2 = arrayList.size() - 1;
                if (size2 >= 0) {
                    boolean z2 = false;
                    while (true) {
                        int i4 = size2 - 1;
                        if (z2) {
                            z2 = false;
                        } else {
                            DelimiterParser$Info delimiterParser$Info3 = (DelimiterParser$Info) arrayList.get(size2);
                            MarkdownElementType markdownElementType = delimiterParser$Info3.tokenType;
                            int i5 = delimiterParser$Info3.position;
                            if (Intrinsics.areEqual(markdownElementType, MarkdownTokenTypes.EMPH) && (i2 = delimiterParser$Info3.closerIndex) != -1) {
                                z2 = zzb.areAdjacentSameMarkers(arrayList, size2, i2);
                                DelimiterParser$Info delimiterParser$Info4 = (DelimiterParser$Info) arrayList.get(delimiterParser$Info3.closerIndex);
                                uSPhoneNumberVisualTransformer$filter$3.$originalToTransformed.add(z2 ? new SequentialParser.Node(new IntRange(i5 - 1, delimiterParser$Info4.position + 2, 1), MarkdownTokenTypes.STRONG) : new SequentialParser.Node(new IntRange(i5, delimiterParser$Info4.position + 1, 1), MarkdownTokenTypes.EMPH$1));
                            }
                        }
                        if (i4 < 0) {
                            break;
                        } else {
                            size2 = i4;
                        }
                    }
                }
                break;
        }
    }

    @Override // androidx.biometric.AuthenticatorUtils
    public final int scan(p0 p0Var, BlockContent blockContent, ArrayList arrayList) {
        int i = this.$r8$classId;
        int i2 = 0;
        blockContent.getClass();
        switch (i) {
            case 0:
                if (!Intrinsics.areEqual(blockContent.getType(), GFMTokenTypes.TILDE)) {
                    return 0;
                }
                BlockContent blockContent2 = blockContent;
                int i3 = 1;
                for (int i4 = 0; i4 < 50 && Intrinsics.areEqual(blockContent2.rawLookup(), GFMTokenTypes.TILDE); i4++) {
                    blockContent2 = blockContent2.advance();
                    i3++;
                }
                Pair canOpenClose = AuthenticatorUtils.canOpenClose(p0Var, blockContent, blockContent2, true);
                boolean booleanValue = ((Boolean) canOpenClose.first).booleanValue();
                boolean booleanValue2 = ((Boolean) canOpenClose.second).booleanValue();
                while (i2 < i3) {
                    arrayList.add(new DelimiterParser$Info(GFMTokenTypes.TILDE, blockContent.lineCount + i2, 0, booleanValue, booleanValue2, '~'));
                    i2++;
                }
                return i3;
            default:
                MarkdownElementType type2 = blockContent.getType();
                MarkdownElementType markdownElementType = MarkdownTokenTypes.EMPH;
                if (!Intrinsics.areEqual(type2, markdownElementType)) {
                    return 0;
                }
                char rawCharAt = ((p0) blockContent.sb).getRawCharAt(blockContent.info(0).tokenStart);
                BlockContent blockContent3 = blockContent;
                int i5 = 1;
                for (int i6 = 0; i6 < 50 && Intrinsics.areEqual(blockContent3.rawLookup(), markdownElementType); i6++) {
                    BlockContent advance = blockContent3.advance();
                    if (((p0) advance.sb).getRawCharAt(advance.info(0).tokenStart) == rawCharAt) {
                        blockContent3 = blockContent3.advance();
                        i5++;
                    }
                }
                Pair canOpenClose2 = AuthenticatorUtils.canOpenClose(p0Var, blockContent, blockContent3, rawCharAt == '*');
                boolean booleanValue3 = ((Boolean) canOpenClose2.first).booleanValue();
                boolean booleanValue4 = ((Boolean) canOpenClose2.second).booleanValue();
                while (i2 < i5) {
                    arrayList.add(new DelimiterParser$Info(markdownElementType, blockContent.lineCount + i2, i5, booleanValue3, booleanValue4, rawCharAt));
                    i2++;
                }
                return i5;
        }
    }
}
