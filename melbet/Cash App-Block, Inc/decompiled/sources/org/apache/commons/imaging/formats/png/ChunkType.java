package org.apache.commons.imaging.formats.png;

import java.nio.charset.StandardCharsets;
import org.apache.commons.imaging.common.BinaryFunctions;

/* loaded from: classes9.dex */
public enum ChunkType {
    IHDR,
    PLTE,
    IDAT,
    IEND,
    tRNS,
    cHRM,
    gAMA,
    iCCP,
    sBIT,
    sRGB,
    tEXt,
    zTXt,
    iTXt,
    bKGD,
    hIST,
    pHYs,
    sCAL,
    sPLT,
    tIME;


    /* renamed from: array, reason: collision with root package name */
    final byte[] f1554array;
    final int value;

    ChunkType() {
        char[] charArray = name().toCharArray();
        this.f1554array = name().getBytes(StandardCharsets.UTF_8);
        this.value = BinaryFunctions.charsToQuad(charArray[0], charArray[1], charArray[2], charArray[3]);
    }
}
