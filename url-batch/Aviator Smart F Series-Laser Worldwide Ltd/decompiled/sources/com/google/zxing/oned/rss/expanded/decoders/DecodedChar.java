package com.google.zxing.oned.rss.expanded.decoders;

/* loaded from: classes4.dex */
final class DecodedChar extends DecodedObject {
    static final char FNC1 = '$';
    private final char value;

    DecodedChar(int i8, char c8) {
        super(i8);
        this.value = c8;
    }

    char getValue() {
        return this.value;
    }

    boolean isFNC1() {
        return this.value == '$';
    }
}
