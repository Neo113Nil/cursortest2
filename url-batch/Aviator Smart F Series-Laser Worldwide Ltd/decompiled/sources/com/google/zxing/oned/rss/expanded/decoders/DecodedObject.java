package com.google.zxing.oned.rss.expanded.decoders;

/* loaded from: classes4.dex */
abstract class DecodedObject {
    private final int newPosition;

    DecodedObject(int i8) {
        this.newPosition = i8;
    }

    final int getNewPosition() {
        return this.newPosition;
    }
}
