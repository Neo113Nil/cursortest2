package com.google.zxing.oned.rss.expanded.decoders;

/* loaded from: classes4.dex */
final class DecodedInformation extends DecodedObject {
    private final String newString;
    private final boolean remaining;
    private final int remainingValue;

    DecodedInformation(int i8, String str) {
        super(i8);
        this.newString = str;
        this.remaining = false;
        this.remainingValue = 0;
    }

    String getNewString() {
        return this.newString;
    }

    int getRemainingValue() {
        return this.remainingValue;
    }

    boolean isRemaining() {
        return this.remaining;
    }

    DecodedInformation(int i8, String str, int i9) {
        super(i8);
        this.remaining = true;
        this.remainingValue = i9;
        this.newString = str;
    }
}
