package org.intellij.markdown.lexer;

import com.nimbusds.jose.jwk.JWK$$ExternalSyntheticBUOutline0;
import java.util.Set;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import net.idrnd.face.iad.capture.Plane;
import org.intellij.markdown.MarkdownElementType;
import org.intellij.markdown.MarkdownTokenTypes;
import org.intellij.markdown.MarkdownTokenTypes$Companion$WHITE_SPACE$1;
import org.intellij.markdown.flavours.gfm.GFMTokenTypes;
import org.intellij.markdown.flavours.gfm.lexer._GFMLexer;
import org.intellij.markdown.html.BitSet;

/* loaded from: classes10.dex */
public final class MarkdownLexer {
    public static final Set TOKENS_TO_MERGE = ArraysKt___ArraysKt.toSet(new MarkdownElementType[]{MarkdownTokenTypes.TEXT, MarkdownTokenTypes.WHITE_SPACE, MarkdownTokenTypes.CODE_LINE, MarkdownTokenTypes.LINK_ID, MarkdownTokenTypes.LINK_TITLE, MarkdownTokenTypes.URL, MarkdownTokenTypes.AUTOLINK, MarkdownTokenTypes.EMAIL_AUTOLINK, MarkdownTokenTypes.BAD_CHARACTER});
    public final _GFMLexer baseLexer;
    public int bufferEnd;
    public int bufferStart;
    public MarkdownElementType nextType;
    public CharSequence originalText = "";
    public int tokenEnd;
    public int tokenStart;

    /* renamed from: type, reason: collision with root package name */
    public MarkdownElementType f1631type;

    public MarkdownLexer(_GFMLexer _gfmlexer) {
        this.baseLexer = _gfmlexer;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x00af A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:285:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final MarkdownElementType advanceBase() {
        int i;
        int i2;
        MarkdownElementType markdownElementType;
        int i3;
        int i4;
        String str;
        int i5;
        int i6;
        MarkdownTokenTypes$Companion$WHITE_SPACE$1 markdownTokenTypes$Companion$WHITE_SPACE$1 = MarkdownTokenTypes.WHITE_SPACE;
        MarkdownElementType markdownElementType2 = MarkdownTokenTypes.BACKTICK;
        MarkdownElementType markdownElementType3 = MarkdownTokenTypes.HARD_LINE_BREAK;
        MarkdownElementType markdownElementType4 = MarkdownTokenTypes.TEXT;
        _GFMLexer _gfmlexer = this.baseLexer;
        Stack stack = _gfmlexer.stateStack;
        _GFMLexer.ParseDelimited parseDelimited = _gfmlexer.parseDelimited;
        Plane plane = _GFMLexer.Companion;
        int i7 = _gfmlexer.zzEndRead;
        CharSequence charSequence = _gfmlexer.zzBuffer;
        int[] iArr = _GFMLexer.ZZ_TRANS;
        int[] iArr2 = _GFMLexer.ZZ_ROWMAP;
        int[] iArr3 = _GFMLexer.ZZ_ATTRIBUTE;
        while (true) {
            int i8 = _gfmlexer.zzMarkedPos;
            _gfmlexer.tokenStart = i8;
            _gfmlexer.zzCurrentPos = i8;
            int i9 = _GFMLexer.ZZ_LEXSTATE[_gfmlexer.state];
            _gfmlexer.zzState = i9;
            MarkdownTokenTypes$Companion$WHITE_SPACE$1 markdownTokenTypes$Companion$WHITE_SPACE$12 = markdownTokenTypes$Companion$WHITE_SPACE$1;
            if ((iArr3[i9] & 1) == 1) {
                i2 = i9;
                i = i8;
            } else {
                i = i8;
                i2 = -1;
            }
            while (true) {
                if (i8 < i7) {
                    charSequence.getClass();
                    char charAt = charSequence.charAt(i8);
                    if (Character.isHighSurrogate(charAt) && (i6 = i8 + 1) < charSequence.length()) {
                        char charAt2 = charSequence.charAt(i6);
                        if (Character.isLowSurrogate(charAt2)) {
                            i3 = ((charAt << '\n') + charAt2) - 56613888;
                            i8 += i3 < 65536 ? 2 : 1;
                            i5 = iArr[Plane.access$zzCMap(i3) + iArr2[_gfmlexer.zzState]];
                            markdownElementType = markdownElementType2;
                            if (i5 == -1) {
                                _gfmlexer.zzState = i5;
                                int i10 = iArr3[i5];
                                if ((i10 & 1) == 1) {
                                    i = i8;
                                    if ((i10 & 8) == 8) {
                                        i2 = i5;
                                    } else {
                                        markdownElementType2 = markdownElementType;
                                        i2 = i5;
                                    }
                                } else {
                                    markdownElementType2 = markdownElementType;
                                }
                            }
                        }
                    }
                    i3 = charAt;
                    i8 += i3 < 65536 ? 2 : 1;
                    i5 = iArr[Plane.access$zzCMap(i3) + iArr2[_gfmlexer.zzState]];
                    markdownElementType = markdownElementType2;
                    if (i5 == -1) {
                    }
                } else {
                    markdownElementType = markdownElementType2;
                    if (!_gfmlexer.zzAtEOF) {
                        _gfmlexer.zzCurrentPos = i8;
                        _gfmlexer.zzMarkedPos = i;
                        charSequence = _gfmlexer.zzBuffer;
                        i7 = _gfmlexer.zzEndRead;
                    }
                    i3 = -1;
                }
            }
            _gfmlexer.zzMarkedPos = i;
            if (i3 == -1 && _gfmlexer.tokenStart == _gfmlexer.zzCurrentPos) {
                _gfmlexer.zzAtEOF = true;
                return null;
            }
            if (i2 >= 0) {
                i2 = _GFMLexer.ZZ_ACTION[i2];
            }
            int i11 = 6;
            int i12 = 0;
            switch (i2) {
                case 1:
                    _gfmlexer.yypushback(_gfmlexer.yylength());
                    _gfmlexer.popState();
                    break;
                case 2:
                    return MarkdownTokenTypes.BLOCK_QUOTE;
                case 3:
                    return markdownElementType4;
                case 4:
                    return markdownTokenTypes$Companion$WHITE_SPACE$12;
                case 5:
                    int indexOf$default = StringsKt.indexOf$default((CharSequence) _gfmlexer.zzBuffer.subSequence(_gfmlexer.tokenStart, i).toString(), "\n", 0, false, 6);
                    if (indexOf$default >= 2) {
                        _gfmlexer.yypushback(_gfmlexer.yylength() - indexOf$default);
                        return markdownElementType3;
                    }
                    if (indexOf$default > 0) {
                        _gfmlexer.yypushback(_gfmlexer.yylength() - indexOf$default);
                        return markdownTokenTypes$Companion$WHITE_SPACE$12;
                    }
                    if (_gfmlexer.state == 8) {
                        _gfmlexer.popState();
                    }
                    int i13 = 1;
                    while (i13 < _gfmlexer.yylength() && _gfmlexer.yycharat(i13) != '\n') {
                        i13++;
                    }
                    if (i13 != _gfmlexer.yylength()) {
                        _gfmlexer.yypushback(_gfmlexer.yylength() - i13);
                    } else {
                        _gfmlexer.state = 0;
                        _gfmlexer.yypushback(_gfmlexer.yylength() - 1);
                    }
                    return MarkdownTokenTypes.EOL;
                case 6:
                    return MarkdownTokenTypes.EXCLAMATION_MARK;
                case 7:
                    return Plane.access$getDelimiterTokenType(_gfmlexer.yycharat(0));
                case 8:
                    return _gfmlexer.canInline() ? GFMTokenTypes.DOLLAR : parseDelimited.returnType;
                case 9:
                    return _gfmlexer.canInline() ? MarkdownTokenTypes.EMPH : parseDelimited.returnType;
                case 10:
                    return MarkdownTokenTypes.COLON;
                case 11:
                    if (!_gfmlexer.canInline()) {
                        return parseDelimited.returnType;
                    }
                    _gfmlexer.codeSpanBacktickslength = _gfmlexer.yylength();
                    stack.add(Integer.valueOf(_gfmlexer.state));
                    _gfmlexer.state = 8;
                    return markdownElementType;
                case 12:
                    return _gfmlexer.canInline() ? GFMTokenTypes.TILDE : parseDelimited.returnType;
                case 13:
                    if (_gfmlexer.yycharat(0) != parseDelimited.exitChar) {
                        return parseDelimited.returnType;
                    }
                    if (_gfmlexer.state == 8) {
                        stack.pop();
                    }
                    _gfmlexer.state = ((Number) stack.pop()).intValue();
                    return Plane.access$getDelimiterTokenType(_gfmlexer.yycharat(0));
                case 14:
                    if (_gfmlexer.yylength() == _gfmlexer.codeSpanBacktickslength) {
                        _gfmlexer.codeSpanBacktickslength = 0;
                        _gfmlexer.popState();
                    }
                    return markdownElementType;
                case 15:
                    int i14 = _gfmlexer.tokenStart;
                    charSequence.getClass();
                    int length = charSequence.length();
                    if (i14 < 0 || i14 > length) {
                        JWK$$ExternalSyntheticBUOutline0.m2173m();
                        return null;
                    }
                    while (i14 < length && i12 < 1) {
                        int i15 = i14 + 1;
                        i14 = (Character.isHighSurrogate(charSequence.charAt(i14)) && i15 < length && Character.isLowSurrogate(charSequence.charAt(i15))) ? i14 + 2 : i15;
                        i12++;
                    }
                    if (i12 >= 1) {
                        _gfmlexer.zzMarkedPos = i14;
                        return markdownElementType3;
                    }
                    JWK$$ExternalSyntheticBUOutline0.m2173m();
                    return null;
                case 16:
                    return _gfmlexer.canInline() ? markdownElementType4 : parseDelimited.returnType;
                case 17:
                    return MarkdownTokenTypes.HTML_TAG;
                case 18:
                    return _gfmlexer.parseDelimited(MarkdownTokenTypes.EMAIL_AUTOLINK);
                case 19:
                    return _gfmlexer.parseDelimited(MarkdownTokenTypes.AUTOLINK);
                case 20:
                    int yylength = _gfmlexer.yylength();
                    int i16 = yylength - 1;
                    if (_gfmlexer.yycharat(i16) == '/') {
                        while (_gfmlexer.yycharat(yylength - 2) == '/') {
                            yylength--;
                        }
                        _gfmlexer.yypushback(_gfmlexer.yylength() - yylength);
                    } else {
                        int i17 = -1;
                        int i18 = -1;
                        for (int i19 = i16; i18 < i19; i19--) {
                            char yycharat = _gfmlexer.yycharat(i19);
                            if (yycharat == ')') {
                                if (i17 == i18) {
                                    int i20 = i19;
                                    int i21 = 0;
                                    while (i18 < i20) {
                                        char yycharat2 = _gfmlexer.yycharat(i20);
                                        if (yycharat2 == ')') {
                                            i21++;
                                        } else if (yycharat2 == '(' && i21 - 1 <= 0) {
                                            i17 = i21;
                                        }
                                        i20--;
                                        i18 = -1;
                                    }
                                    i17 = i21;
                                }
                                if (i17 > 0) {
                                    i17--;
                                    i18 = -1;
                                    yylength--;
                                } else {
                                    _gfmlexer.yypushback(_gfmlexer.yylength() - yylength);
                                }
                            } else {
                                i18 = -1;
                                if (StringsKt.indexOf$default((CharSequence) ".,:;!?\"'*_~]`", yycharat, 0, false, 6) == -1) {
                                    _gfmlexer.yypushback(_gfmlexer.yylength() - yylength);
                                } else {
                                    yylength--;
                                }
                            }
                        }
                        _gfmlexer.yypushback(_gfmlexer.yylength() - yylength);
                    }
                    return GFMTokenTypes.GFM_AUTOLINK;
                case 21:
                    int i22 = _gfmlexer.tokenStart;
                    BitSet bitSet = _gfmlexer.zzFin;
                    if (bitSet == null || bitSet.size <= charSequence.length()) {
                        _gfmlexer.zzFin = new BitSet(charSequence.length() + 1);
                    }
                    BitSet bitSet2 = _gfmlexer.zzFin;
                    bitSet2.getClass();
                    int i23 = 5;
                    while (true) {
                        i4 = -1;
                        if (i23 != -1) {
                            if (i22 < _gfmlexer.zzMarkedPos) {
                                bitSet2.set(i22, (iArr3[i23] & 1) == 1);
                                charSequence.getClass();
                                char charAt3 = charSequence.charAt(i22);
                                boolean isHighSurrogate = Character.isHighSurrogate(charAt3);
                                int i24 = charAt3;
                                if (isHighSurrogate) {
                                    int i25 = i22 + 1;
                                    i24 = charAt3;
                                    if (i25 < charSequence.length()) {
                                        char charAt4 = charSequence.charAt(i25);
                                        i24 = charAt3;
                                        if (Character.isLowSurrogate(charAt4)) {
                                            i24 = ((charAt3 << 10) + charAt4) - 56613888;
                                        }
                                    }
                                }
                                i22 += i24 >= 65536 ? 2 : 1;
                                i23 = iArr[Plane.access$zzCMap(i24) + iArr2[i23]];
                            } else {
                                i4 = -1;
                            }
                        }
                    }
                    if (i23 != i4) {
                        int i26 = i22 + 1;
                        bitSet2.set(i22, (iArr3[i23] & 1) == 1);
                        i22 = i26;
                    }
                    while (true) {
                        int i27 = _gfmlexer.zzMarkedPos;
                        if (i22 <= i27) {
                            bitSet2.clear(i22);
                            i22++;
                        } else {
                            while (true) {
                                if (bitSet2.get(i27) && (iArr3[i11] & 1) == 1) {
                                    _gfmlexer.zzMarkedPos = i27;
                                    return markdownElementType4;
                                }
                                charSequence.getClass();
                                int i28 = i27 - 1;
                                char charAt5 = charSequence.charAt(i28);
                                boolean isLowSurrogate = Character.isLowSurrogate(charAt5);
                                int i29 = charAt5;
                                i29 = charAt5;
                                if (isLowSurrogate && i28 > 0) {
                                    char charAt6 = charSequence.charAt(i27 - 2);
                                    i29 = charAt5;
                                    if (Character.isHighSurrogate(charAt6)) {
                                        i29 = ((charAt6 << 10) + charAt5) - 56613888;
                                    }
                                }
                                i27 -= i29 >= 65536 ? 2 : 1;
                                i11 = iArr[Plane.access$zzCMap(i29) + iArr2[i11]];
                            }
                        }
                    }
                    break;
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                    break;
                default:
                    String[] strArr = _GFMLexer.ZZ_ERROR_MSG;
                    try {
                        str = strArr[1];
                    } catch (Exception unused) {
                        str = strArr[0];
                    }
                    throw new Error(str);
            }
            markdownTokenTypes$Companion$WHITE_SPACE$1 = markdownTokenTypes$Companion$WHITE_SPACE$12;
            markdownElementType2 = markdownElementType;
        }
    }

    public final void calcNextType() {
        MarkdownElementType markdownElementType;
        do {
            _GFMLexer _gfmlexer = this.baseLexer;
            this.tokenEnd = _gfmlexer.yylength() + _gfmlexer.tokenStart;
            MarkdownElementType advanceBase = advanceBase();
            this.nextType = advanceBase;
            markdownElementType = this.f1631type;
            if (!Intrinsics.areEqual(advanceBase, markdownElementType) || markdownElementType == null) {
                return;
            }
        } while (TOKENS_TO_MERGE.contains(markdownElementType));
    }
}
