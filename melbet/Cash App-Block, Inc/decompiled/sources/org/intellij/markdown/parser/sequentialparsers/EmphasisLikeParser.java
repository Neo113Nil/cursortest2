package org.intellij.markdown.parser.sequentialparsers;

import androidx.biometric.AuthenticatorUtils;
import com.squareup.cash.scrubbing.USPhoneNumberVisualTransformer$filter$3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import net.idrnd.face.iad.capture.internal.p0;
import org.commonmark.internal.BlockContent;
import org.intellij.markdown.MarkdownElementType;
import org.intellij.markdown.MarkdownTokenTypes;
import org.intellij.markdown.parser.sequentialparsers.SequentialParser;

/* loaded from: classes10.dex */
public final class EmphasisLikeParser implements SequentialParser {
    public final /* synthetic */ int $r8$classId = 1;
    public final Object parsers;

    public EmphasisLikeParser(List list) {
        list.getClass();
        this.parsers = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:91:0x021f  */
    @Override // org.intellij.markdown.parser.sequentialparsers.SequentialParser
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final USPhoneNumberVisualTransformer$filter$3 parse(p0 p0Var, List list) {
        int i;
        int i2;
        int i3;
        int i4;
        DelimiterParser$Info delimiterParser$Info;
        Integer[] numArr;
        int i5;
        int i6;
        int i7;
        MarkdownElementType rawLookup;
        MarkdownElementType markdownElementType;
        int i8 = this.$r8$classId;
        Object obj = this.parsers;
        boolean z = true;
        switch (i8) {
            case 0:
                AuthenticatorUtils[] authenticatorUtilsArr = (AuthenticatorUtils[]) obj;
                list.getClass();
                USPhoneNumberVisualTransformer$filter$3 uSPhoneNumberVisualTransformer$filter$3 = new USPhoneNumberVisualTransformer$filter$3();
                TokensCache$RangesListIterator tokensCache$RangesListIterator = new TokensCache$RangesListIterator(p0Var, list);
                ArrayList arrayList = new ArrayList();
                BlockContent blockContent = tokensCache$RangesListIterator;
                while (true) {
                    i = 0;
                    if (blockContent.getType() != null) {
                        int i9 = 0;
                        for (AuthenticatorUtils authenticatorUtils : authenticatorUtilsArr) {
                            int scan = authenticatorUtils.scan(p0Var, blockContent, arrayList);
                            i9 += scan;
                            for (int i10 = 0; i10 < scan; i10++) {
                                if (blockContent.getType() != null) {
                                    blockContent = blockContent.advance();
                                }
                            }
                        }
                        if (i9 == 0) {
                            blockContent = blockContent.advance();
                        }
                    }
                }
                int size = arrayList.size();
                Integer[] numArr2 = new Integer[size];
                for (int i11 = 0; i11 < size; i11++) {
                    numArr2[i11] = 0;
                }
                HashMap hashMap = new HashMap();
                Iterator it = arrayList.iterator();
                int i12 = 0;
                int i13 = 0;
                int i14 = -2;
                while (it.hasNext()) {
                    int i15 = i12 + 1;
                    DelimiterParser$Info delimiterParser$Info2 = (DelimiterParser$Info) it.next();
                    char c = ((DelimiterParser$Info) arrayList.get(i13)).marker;
                    boolean z2 = z;
                    char c2 = delimiterParser$Info2.marker;
                    int i16 = delimiterParser$Info2.position;
                    int i17 = delimiterParser$Info2.length;
                    int i18 = (c == c2 && i14 == i16 + (-1)) ? i13 : i12;
                    if (delimiterParser$Info2.canClose) {
                        if (hashMap.containsKey(Character.valueOf(c2))) {
                            i2 = i16;
                            i3 = i17;
                            i4 = i12;
                            delimiterParser$Info = delimiterParser$Info2;
                            numArr = numArr2;
                        } else {
                            i2 = i16;
                            i4 = i12;
                            i3 = i17;
                            delimiterParser$Info = delimiterParser$Info2;
                            numArr = numArr2;
                            hashMap.put(Character.valueOf(c2), new Integer[]{-1, -1, -1, -1, -1, -1});
                        }
                        Object obj2 = hashMap.get(Character.valueOf(c2));
                        obj2.getClass();
                        int i19 = i3 % 3;
                        int intValue = ((Integer[]) obj2)[(delimiterParser$Info.canOpen ? 3 : 0) + i19].intValue();
                        int intValue2 = (i18 - numArr[i18].intValue()) - 1;
                        int i20 = intValue2;
                        while (i20 > intValue) {
                            Object obj3 = arrayList.get(i20);
                            obj3.getClass();
                            DelimiterParser$Info delimiterParser$Info3 = (DelimiterParser$Info) obj3;
                            i6 = 3;
                            if (delimiterParser$Info3.marker != c2) {
                                i20 -= numArr[i20].intValue() + 1;
                            } else {
                                if (delimiterParser$Info3.canOpen && delimiterParser$Info3.closerIndex < 0) {
                                    if (delimiterParser$Info3.canClose || delimiterParser$Info.canOpen) {
                                        int i21 = delimiterParser$Info3.length;
                                        if ((i21 + i3) % 3 == 0) {
                                            if (i21 % 3 == 0 && i19 == 0) {
                                            }
                                        }
                                    }
                                    if (i20 > 0) {
                                        int i22 = i20 - 1;
                                        if (!((DelimiterParser$Info) arrayList.get(i22)).canOpen) {
                                            i7 = numArr[i22].intValue() + 1;
                                            numArr[i20] = Integer.valueOf(i7);
                                            numArr[i4] = Integer.valueOf((i4 - i20) + i7);
                                            i5 = 0;
                                            delimiterParser$Info.canOpen = false;
                                            delimiterParser$Info3.closerIndex = i4;
                                            delimiterParser$Info3.canClose = false;
                                            i2 = -2;
                                            intValue2 = -1;
                                            if (intValue2 != -1) {
                                                Object obj4 = hashMap.get(Character.valueOf(c2));
                                                obj4.getClass();
                                                Integer[] numArr3 = (Integer[]) obj4;
                                                if (!delimiterParser$Info.canOpen) {
                                                    i6 = i5;
                                                }
                                                numArr3[i19 + i6] = Integer.valueOf(intValue2);
                                            }
                                            z = z2;
                                            i = i5;
                                            i12 = i15;
                                            i13 = i18;
                                            numArr2 = numArr;
                                            i14 = i2;
                                        }
                                    }
                                    i7 = 0;
                                    numArr[i20] = Integer.valueOf(i7);
                                    numArr[i4] = Integer.valueOf((i4 - i20) + i7);
                                    i5 = 0;
                                    delimiterParser$Info.canOpen = false;
                                    delimiterParser$Info3.closerIndex = i4;
                                    delimiterParser$Info3.canClose = false;
                                    i2 = -2;
                                    intValue2 = -1;
                                    if (intValue2 != -1) {
                                    }
                                    z = z2;
                                    i = i5;
                                    i12 = i15;
                                    i13 = i18;
                                    numArr2 = numArr;
                                    i14 = i2;
                                }
                                i20 -= numArr[i20].intValue() + 1;
                            }
                        }
                        i5 = 0;
                        i6 = 3;
                        if (intValue2 != -1) {
                        }
                        z = z2;
                        i = i5;
                        i12 = i15;
                        i13 = i18;
                        numArr2 = numArr;
                        i14 = i2;
                    } else {
                        z = z2;
                        i14 = i16;
                        i12 = i15;
                        i13 = i18;
                        i = 0;
                    }
                }
                int length = authenticatorUtilsArr.length;
                while (i < length) {
                    authenticatorUtilsArr[i].process(p0Var, tokensCache$RangesListIterator, arrayList, uSPhoneNumberVisualTransformer$filter$3);
                    i++;
                }
                return uSPhoneNumberVisualTransformer$filter$3;
            default:
                list.getClass();
                USPhoneNumberVisualTransformer$filter$3 uSPhoneNumberVisualTransformer$filter$32 = new USPhoneNumberVisualTransformer$filter$3();
                ArrayList arrayList2 = new ArrayList();
                TokensCache$RangesListIterator tokensCache$RangesListIterator2 = new TokensCache$RangesListIterator(p0Var, list);
                int i23 = -239;
                int i24 = -239;
                while (true) {
                    int i25 = tokensCache$RangesListIterator2.lineCount;
                    if (tokensCache$RangesListIterator2.getType() == null) {
                        if (i24 != -239) {
                            arrayList2.add(new IntRange(i24, i23, 1));
                        }
                        uSPhoneNumberVisualTransformer$filter$32.withFurtherProcessing(arrayList2);
                        return uSPhoneNumberVisualTransformer$filter$32;
                    }
                    if (Intrinsics.areEqual(tokensCache$RangesListIterator2.getType(), MarkdownTokenTypes.LT) && (rawLookup = tokensCache$RangesListIterator2.rawLookup()) != null && ((List) obj).contains(rawLookup)) {
                        while (true) {
                            MarkdownElementType type2 = tokensCache$RangesListIterator2.getType();
                            markdownElementType = MarkdownTokenTypes.GT;
                            if (!Intrinsics.areEqual(type2, markdownElementType) && tokensCache$RangesListIterator2.getType() != null) {
                                tokensCache$RangesListIterator2 = tokensCache$RangesListIterator2.advance();
                            }
                        }
                        if (Intrinsics.areEqual(tokensCache$RangesListIterator2.getType(), markdownElementType)) {
                            uSPhoneNumberVisualTransformer$filter$32.$originalToTransformed.add(new SequentialParser.Node(new IntRange(i25, tokensCache$RangesListIterator2.lineCount + 1, 1), MarkdownTokenTypes.AUTOLINK$1));
                        }
                    } else {
                        if (i23 + 1 != i25) {
                            if (i24 != -239) {
                                arrayList2.add(new IntRange(i24, i23, 1));
                            }
                            i24 = i25;
                        }
                        i23 = i25;
                    }
                    tokensCache$RangesListIterator2 = tokensCache$RangesListIterator2.advance();
                }
                break;
        }
    }

    public EmphasisLikeParser(AuthenticatorUtils[] authenticatorUtilsArr) {
        this.parsers = authenticatorUtilsArr;
    }
}
