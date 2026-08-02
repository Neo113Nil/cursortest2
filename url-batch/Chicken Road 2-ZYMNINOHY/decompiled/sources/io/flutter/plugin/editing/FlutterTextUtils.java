package io.flutter.plugin.editing;

import io.flutter.embedding.engine.FlutterJNI;

/* loaded from: classes.dex */
class FlutterTextUtils {
    public static final int CANCEL_TAG = 917631;
    public static final int CARRIAGE_RETURN = 13;
    public static final int COMBINING_ENCLOSING_KEYCAP = 8419;
    public static final int LINE_FEED = 10;
    public static final int ZERO_WIDTH_JOINER = 8205;
    private final FlutterJNI flutterJNI;

    public FlutterTextUtils(FlutterJNI flutterJNI) {
        this.flutterJNI = flutterJNI;
    }

    public int getOffsetAfter(CharSequence charSequence, int i4) {
        int charCount;
        int charCount2;
        int charCount3;
        int length = charSequence.length();
        int i5 = length - 1;
        if (i4 >= i5) {
            return length;
        }
        int codePointAt = Character.codePointAt(charSequence, i4);
        int charCount4 = Character.charCount(codePointAt);
        int i6 = i4 + charCount4;
        int i7 = 0;
        if (i6 == 0) {
            return 0;
        }
        if (codePointAt == 10) {
            if (Character.codePointAt(charSequence, i6) == 13) {
                charCount4++;
            }
            return i4 + charCount4;
        }
        if (isRegionalIndicatorSymbol(codePointAt)) {
            if (i6 >= i5 || !isRegionalIndicatorSymbol(Character.codePointAt(charSequence, i6))) {
                return i6;
            }
            int i8 = i4;
            while (i8 > 0 && isRegionalIndicatorSymbol(Character.codePointBefore(charSequence, i4))) {
                i8 -= Character.charCount(Character.codePointBefore(charSequence, i4));
                i7++;
            }
            if (i7 % 2 == 0) {
                charCount4 += 2;
            }
            return i4 + charCount4;
        }
        if (isKeycapBase(codePointAt)) {
            charCount4 += Character.charCount(codePointAt);
        }
        if (codePointAt == 8419) {
            int codePointBefore = Character.codePointBefore(charSequence, i6);
            int charCount5 = Character.charCount(codePointBefore) + i6;
            if (charCount5 >= length || !isVariationSelector(codePointBefore)) {
                if (isKeycapBase(codePointBefore)) {
                    charCount3 = Character.charCount(codePointBefore);
                    charCount4 += charCount3;
                }
                return i4 + charCount4;
            }
            int codePointAt2 = Character.codePointAt(charSequence, charCount5);
            if (isKeycapBase(codePointAt2)) {
                charCount3 = Character.charCount(codePointAt2) + Character.charCount(codePointBefore);
                charCount4 += charCount3;
            }
            return i4 + charCount4;
        }
        if (isEmoji(codePointAt)) {
            boolean z = false;
            int i9 = 0;
            do {
                if (z) {
                    charCount4 = Character.charCount(codePointAt) + i9 + 1 + charCount4;
                    z = false;
                }
                if (isEmojiModifier(codePointAt)) {
                    break;
                }
                if (i6 < length) {
                    codePointAt = Character.codePointAt(charSequence, i6);
                    int charCount6 = Character.charCount(codePointAt) + i6;
                    if (codePointAt != 8419) {
                        if (isEmojiModifier(codePointAt)) {
                            charCount2 = Character.charCount(codePointAt);
                        } else if (isVariationSelector(codePointAt)) {
                            charCount2 = Character.charCount(codePointAt);
                        } else if (codePointAt == 8205) {
                            codePointAt = Character.codePointAt(charSequence, charCount6);
                            i6 = Character.charCount(codePointAt) + charCount6;
                            if (i6 >= length || !isVariationSelector(codePointAt)) {
                                i9 = 0;
                            } else {
                                codePointAt = Character.codePointAt(charSequence, i6);
                                int charCount7 = Character.charCount(codePointAt);
                                i6 = Character.charCount(codePointAt) + i6;
                                i9 = charCount7;
                            }
                            z = true;
                            if (i6 < length || !z) {
                                break;
                                break;
                            }
                        } else {
                            i6 = charCount6;
                        }
                        charCount4 += charCount2;
                        break;
                    }
                    int codePointBefore2 = Character.codePointBefore(charSequence, charCount6);
                    int charCount8 = Character.charCount(codePointBefore2) + charCount6;
                    if (charCount8 >= length || !isVariationSelector(codePointBefore2)) {
                        if (isKeycapBase(codePointBefore2)) {
                            charCount = Character.charCount(codePointBefore2);
                            charCount4 += charCount;
                        }
                        return i4 + charCount4;
                    }
                    int codePointAt3 = Character.codePointAt(charSequence, charCount8);
                    if (isKeycapBase(codePointAt3)) {
                        charCount = Character.charCount(codePointAt3) + Character.charCount(codePointBefore2);
                        charCount4 += charCount;
                    }
                    return i4 + charCount4;
                }
                i9 = 0;
                if (i6 < length) {
                    break;
                }
            } while (isEmoji(codePointAt));
        }
        return i4 + charCount4;
    }

    public int getOffsetBefore(CharSequence charSequence, int i4) {
        int codePointBefore;
        int charCount;
        int charCount2;
        int charCount3;
        int i5 = 0;
        int i6 = 1;
        if (i4 <= 1 || (charCount2 = i4 - (charCount = Character.charCount((codePointBefore = Character.codePointBefore(charSequence, i4))))) == 0) {
            return 0;
        }
        if (codePointBefore == 10) {
            if (Character.codePointBefore(charSequence, charCount2) == 13) {
                charCount++;
            }
            return i4 - charCount;
        }
        if (isRegionalIndicatorSymbol(codePointBefore)) {
            int codePointBefore2 = Character.codePointBefore(charSequence, charCount2);
            int charCount4 = charCount2 - Character.charCount(codePointBefore2);
            while (charCount4 > 0 && isRegionalIndicatorSymbol(codePointBefore2)) {
                codePointBefore2 = Character.codePointBefore(charSequence, charCount4);
                charCount4 -= Character.charCount(codePointBefore2);
                i6++;
            }
            if (i6 % 2 == 0) {
                charCount += 2;
            }
            return i4 - charCount;
        }
        if (codePointBefore == 8419) {
            int codePointBefore3 = Character.codePointBefore(charSequence, charCount2);
            int charCount5 = charCount2 - Character.charCount(codePointBefore3);
            if (charCount5 <= 0 || !isVariationSelector(codePointBefore3)) {
                if (isKeycapBase(codePointBefore3)) {
                    charCount3 = Character.charCount(codePointBefore3);
                    charCount += charCount3;
                }
                return i4 - charCount;
            }
            int codePointBefore4 = Character.codePointBefore(charSequence, charCount5);
            if (isKeycapBase(codePointBefore4)) {
                charCount3 = Character.charCount(codePointBefore4) + Character.charCount(codePointBefore3);
                charCount += charCount3;
            }
            return i4 - charCount;
        }
        if (codePointBefore == 917631) {
            codePointBefore = Character.codePointBefore(charSequence, charCount2);
            int charCount6 = Character.charCount(codePointBefore);
            while (true) {
                charCount2 -= charCount6;
                if (charCount2 <= 0 || !isTagSpecChar(codePointBefore)) {
                    break;
                }
                charCount += Character.charCount(codePointBefore);
                codePointBefore = Character.codePointBefore(charSequence, charCount2);
                charCount6 = Character.charCount(codePointBefore);
            }
            if (!isEmoji(codePointBefore)) {
                return i4 - 2;
            }
            charCount += Character.charCount(codePointBefore);
        }
        if (isVariationSelector(codePointBefore)) {
            codePointBefore = Character.codePointBefore(charSequence, charCount2);
            if (!isEmoji(codePointBefore)) {
                return i4 - charCount;
            }
            charCount += Character.charCount(codePointBefore);
            charCount2 -= charCount;
        }
        if (isEmoji(codePointBefore)) {
            boolean z = false;
            int i7 = 0;
            while (true) {
                if (z) {
                    charCount = Character.charCount(codePointBefore) + i7 + 1 + charCount;
                    z = false;
                }
                if (isEmojiModifier(codePointBefore)) {
                    int codePointBefore5 = Character.codePointBefore(charSequence, charCount2);
                    int charCount7 = charCount2 - Character.charCount(codePointBefore5);
                    if (charCount7 > 0 && isVariationSelector(codePointBefore5)) {
                        codePointBefore5 = Character.codePointBefore(charSequence, charCount7);
                        if (!isEmoji(codePointBefore5)) {
                            return i4 - charCount;
                        }
                        i5 = Character.charCount(codePointBefore5);
                        Character.charCount(codePointBefore5);
                    }
                    if (isEmojiModifierBase(codePointBefore5)) {
                        charCount += Character.charCount(codePointBefore5) + i5;
                    }
                } else {
                    if (charCount2 > 0) {
                        codePointBefore = Character.codePointBefore(charSequence, charCount2);
                        charCount2 -= Character.charCount(codePointBefore);
                        if (codePointBefore == 8205) {
                            codePointBefore = Character.codePointBefore(charSequence, charCount2);
                            charCount2 -= Character.charCount(codePointBefore);
                            if (charCount2 <= 0 || !isVariationSelector(codePointBefore)) {
                                i7 = 0;
                            } else {
                                codePointBefore = Character.codePointBefore(charSequence, charCount2);
                                int charCount8 = Character.charCount(codePointBefore);
                                charCount2 -= Character.charCount(codePointBefore);
                                i7 = charCount8;
                            }
                            z = true;
                            if (charCount2 != 0 || !z || !isEmoji(codePointBefore)) {
                                break;
                                break;
                            }
                        }
                    }
                    i7 = 0;
                    if (charCount2 != 0) {
                        break;
                    }
                }
            }
        }
        return i4 - charCount;
    }

    public boolean isEmoji(int i4) {
        return this.flutterJNI.isCodePointEmoji(i4);
    }

    public boolean isEmojiModifier(int i4) {
        return this.flutterJNI.isCodePointEmojiModifier(i4);
    }

    public boolean isEmojiModifierBase(int i4) {
        return this.flutterJNI.isCodePointEmojiModifierBase(i4);
    }

    public boolean isKeycapBase(int i4) {
        return (48 <= i4 && i4 <= 57) || i4 == 35 || i4 == 42;
    }

    public boolean isRegionalIndicatorSymbol(int i4) {
        return this.flutterJNI.isCodePointRegionalIndicator(i4);
    }

    public boolean isTagSpecChar(int i4) {
        return 917536 <= i4 && i4 <= 917630;
    }

    public boolean isVariationSelector(int i4) {
        return this.flutterJNI.isCodePointVariantSelector(i4);
    }
}
