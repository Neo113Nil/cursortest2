package org.apache.commons.imaging.common.itu_t4;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.ImageWriteException;
import org.apache.commons.imaging.common.itu_t4.T4_T6_Tables;

/* loaded from: classes9.dex */
public final class T4AndT6Compression {
    public static final int BLACK = 1;
    public static final int WHITE = 0;
    private static final HuffmanTree<Integer> WHITE_RUN_LENGTHS = new HuffmanTree<>();
    private static final HuffmanTree<Integer> BLACK_RUN_LENGTHS = new HuffmanTree<>();
    private static final HuffmanTree<T4_T6_Tables.Entry> CONTROL_CODES = new HuffmanTree<>();

    static {
        try {
            for (T4_T6_Tables.Entry entry : T4_T6_Tables.WHITE_TERMINATING_CODES) {
                WHITE_RUN_LENGTHS.insert(entry.bitString, entry.value);
            }
            for (T4_T6_Tables.Entry entry2 : T4_T6_Tables.WHITE_MAKE_UP_CODES) {
                WHITE_RUN_LENGTHS.insert(entry2.bitString, entry2.value);
            }
            for (T4_T6_Tables.Entry entry3 : T4_T6_Tables.BLACK_TERMINATING_CODES) {
                BLACK_RUN_LENGTHS.insert(entry3.bitString, entry3.value);
            }
            for (T4_T6_Tables.Entry entry4 : T4_T6_Tables.BLACK_MAKE_UP_CODES) {
                BLACK_RUN_LENGTHS.insert(entry4.bitString, entry4.value);
            }
            for (T4_T6_Tables.Entry entry5 : T4_T6_Tables.ADDITIONAL_MAKE_UP_CODES) {
                WHITE_RUN_LENGTHS.insert(entry5.bitString, entry5.value);
                BLACK_RUN_LENGTHS.insert(entry5.bitString, entry5.value);
            }
            HuffmanTree<T4_T6_Tables.Entry> huffmanTree = CONTROL_CODES;
            T4_T6_Tables.Entry entry6 = T4_T6_Tables.EOL;
            huffmanTree.insert(entry6.bitString, entry6);
            T4_T6_Tables.Entry entry7 = T4_T6_Tables.EOL13;
            huffmanTree.insert(entry7.bitString, entry7);
            T4_T6_Tables.Entry entry8 = T4_T6_Tables.EOL14;
            huffmanTree.insert(entry8.bitString, entry8);
            T4_T6_Tables.Entry entry9 = T4_T6_Tables.EOL15;
            huffmanTree.insert(entry9.bitString, entry9);
            T4_T6_Tables.Entry entry10 = T4_T6_Tables.EOL16;
            huffmanTree.insert(entry10.bitString, entry10);
            T4_T6_Tables.Entry entry11 = T4_T6_Tables.EOL17;
            huffmanTree.insert(entry11.bitString, entry11);
            T4_T6_Tables.Entry entry12 = T4_T6_Tables.EOL18;
            huffmanTree.insert(entry12.bitString, entry12);
            T4_T6_Tables.Entry entry13 = T4_T6_Tables.EOL19;
            huffmanTree.insert(entry13.bitString, entry13);
            T4_T6_Tables.Entry entry14 = T4_T6_Tables.P;
            huffmanTree.insert(entry14.bitString, entry14);
            T4_T6_Tables.Entry entry15 = T4_T6_Tables.H;
            huffmanTree.insert(entry15.bitString, entry15);
            T4_T6_Tables.Entry entry16 = T4_T6_Tables.V0;
            huffmanTree.insert(entry16.bitString, entry16);
            T4_T6_Tables.Entry entry17 = T4_T6_Tables.VL1;
            huffmanTree.insert(entry17.bitString, entry17);
            T4_T6_Tables.Entry entry18 = T4_T6_Tables.VL2;
            huffmanTree.insert(entry18.bitString, entry18);
            T4_T6_Tables.Entry entry19 = T4_T6_Tables.VL3;
            huffmanTree.insert(entry19.bitString, entry19);
            T4_T6_Tables.Entry entry20 = T4_T6_Tables.VR1;
            huffmanTree.insert(entry20.bitString, entry20);
            T4_T6_Tables.Entry entry21 = T4_T6_Tables.VR2;
            huffmanTree.insert(entry21.bitString, entry21);
            T4_T6_Tables.Entry entry22 = T4_T6_Tables.VR3;
            huffmanTree.insert(entry22.bitString, entry22);
        } catch (HuffmanTreeException e) {
            throw new Error(e);
        }
    }

    private T4AndT6Compression() {
    }

    private static int changingElementAt(int[] iArr, int i) {
        if (i < 0 || i >= iArr.length) {
            return 0;
        }
        return iArr[i];
    }

    private static void compress1DLine(BitInputStreamFlexible bitInputStreamFlexible, BitArrayOutputStream bitArrayOutputStream, int[] iArr, int i) {
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            try {
                int readBits = bitInputStreamFlexible.readBits(1);
                if (iArr != null) {
                    iArr[i4] = readBits;
                }
                if (i3 == readBits) {
                    i2++;
                } else {
                    writeRunLength(bitArrayOutputStream, i2, i3);
                    i2 = 1;
                    i3 = readBits;
                }
            } catch (IOException e) {
                throw new ImageWriteException("Error reading image to compress", (Throwable) e);
            }
        }
        writeRunLength(bitArrayOutputStream, i2, i3);
    }

    public static byte[] compressModifiedHuffman(byte[] bArr, int i, int i2) {
        BitInputStreamFlexible bitInputStreamFlexible = new BitInputStreamFlexible(new ByteArrayInputStream(bArr));
        BitArrayOutputStream bitArrayOutputStream = new BitArrayOutputStream();
        for (int i3 = 0; i3 < i2; i3++) {
            try {
                compress1DLine(bitInputStreamFlexible, bitArrayOutputStream, null, i);
                bitInputStreamFlexible.flushCache();
                bitArrayOutputStream.flush();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        bitArrayOutputStream.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        }
        byte[] byteArray = bitArrayOutputStream.toByteArray();
        bitArrayOutputStream.close();
        return byteArray;
    }

    private static int compressT(int i, int i2, int i3, BitArrayOutputStream bitArrayOutputStream, int i4, int[] iArr) {
        int i5 = i2 - i3;
        if (-3 <= i5 && i5 <= 3) {
            (i5 == -3 ? T4_T6_Tables.VL3 : i5 == -2 ? T4_T6_Tables.VL2 : i5 == -1 ? T4_T6_Tables.VL1 : i5 == 0 ? T4_T6_Tables.V0 : i5 == 1 ? T4_T6_Tables.VR1 : i5 == 2 ? T4_T6_Tables.VR2 : T4_T6_Tables.VR3).writeBits(bitArrayOutputStream);
            return i2;
        }
        int i6 = 1 - i4;
        int nextChangingElement = nextChangingElement(iArr, i6, i2 + 1);
        T4_T6_Tables.H.writeBits(bitArrayOutputStream);
        writeRunLength(bitArrayOutputStream, i2 - i, i4);
        writeRunLength(bitArrayOutputStream, nextChangingElement - i2, i6);
        return nextChangingElement;
    }

    public static byte[] compressT4_1D(byte[] bArr, int i, int i2, boolean z) {
        BitInputStreamFlexible bitInputStreamFlexible = new BitInputStreamFlexible(new ByteArrayInputStream(bArr));
        BitArrayOutputStream bitArrayOutputStream = new BitArrayOutputStream();
        try {
            if (z) {
                T4_T6_Tables.EOL16.writeBits(bitArrayOutputStream);
            } else {
                T4_T6_Tables.EOL.writeBits(bitArrayOutputStream);
            }
            for (int i3 = 0; i3 < i2; i3++) {
                compress1DLine(bitInputStreamFlexible, bitArrayOutputStream, null, i);
                if (z) {
                    int bitsAvailableInCurrentByte = bitArrayOutputStream.getBitsAvailableInCurrentByte();
                    if (bitsAvailableInCurrentByte < 4) {
                        bitArrayOutputStream.flush();
                        bitsAvailableInCurrentByte = 8;
                    }
                    while (bitsAvailableInCurrentByte > 4) {
                        bitArrayOutputStream.writeBit(0);
                        bitsAvailableInCurrentByte--;
                    }
                }
                T4_T6_Tables.EOL.writeBits(bitArrayOutputStream);
                bitInputStreamFlexible.flushCache();
            }
            byte[] byteArray = bitArrayOutputStream.toByteArray();
            bitArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    bitArrayOutputStream.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    public static byte[] compressT4_2D(byte[] bArr, int i, int i2, boolean z, int i3) {
        BitInputStreamFlexible bitInputStreamFlexible = new BitInputStreamFlexible(new ByteArrayInputStream(bArr));
        BitArrayOutputStream bitArrayOutputStream = new BitArrayOutputStream();
        int[] iArr = new int[i];
        int[] iArr2 = new int[i];
        if (z) {
            T4_T6_Tables.EOL16.writeBits(bitArrayOutputStream);
        } else {
            T4_T6_Tables.EOL.writeBits(bitArrayOutputStream);
        }
        int[] iArr3 = iArr2;
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            if (i4 > 0) {
                bitArrayOutputStream.writeBit(0);
                for (int i6 = 0; i6 < i; i6++) {
                    try {
                        iArr3[i6] = bitInputStreamFlexible.readBits(1);
                    } catch (IOException e) {
                        throw new ImageWriteException("Error reading image to compress", (Throwable) e);
                    }
                }
                int nextChangingElement = nextChangingElement(iArr3, 0, 0);
                int nextChangingElement2 = nextChangingElement(iArr, 0, 0);
                int nextChangingElement3 = nextChangingElement(iArr, 1, nextChangingElement2 + 1);
                int i7 = nextChangingElement;
                int i8 = nextChangingElement3;
                int i9 = nextChangingElement2;
                int i10 = 0;
                int i11 = 0;
                while (i10 < i) {
                    if (i8 < i7) {
                        T4_T6_Tables.P.writeBits(bitArrayOutputStream);
                    } else {
                        int i12 = i10;
                        int i13 = i11;
                        i8 = compressT(i12, i7, i9, bitArrayOutputStream, i13, iArr3);
                        i11 = i8 == i7 ? 1 - i13 : i13;
                    }
                    i10 = i8;
                    int changingElementAt = changingElementAt(iArr, i10);
                    int i14 = i10 + 1;
                    int nextChangingElement4 = nextChangingElement(iArr3, i11, i14);
                    int nextChangingElement5 = i11 == changingElementAt ? nextChangingElement(iArr, changingElementAt, i14) : nextChangingElement(iArr, 1 - changingElementAt, nextChangingElement(iArr, changingElementAt, i14) + 1);
                    i9 = nextChangingElement5;
                    i8 = nextChangingElement(iArr, 1 - i11, nextChangingElement5 + 1);
                    i7 = nextChangingElement4;
                }
                int[] iArr4 = iArr3;
                iArr3 = iArr;
                iArr = iArr4;
            } else {
                bitArrayOutputStream.writeBit(1);
                compress1DLine(bitInputStreamFlexible, bitArrayOutputStream, iArr, i);
            }
            if (z) {
                int bitsAvailableInCurrentByte = bitArrayOutputStream.getBitsAvailableInCurrentByte();
                if (bitsAvailableInCurrentByte < 4) {
                    bitArrayOutputStream.flush();
                    bitsAvailableInCurrentByte = 8;
                }
                while (bitsAvailableInCurrentByte > 4) {
                    bitArrayOutputStream.writeBit(0);
                    bitsAvailableInCurrentByte--;
                }
            }
            T4_T6_Tables.EOL.writeBits(bitArrayOutputStream);
            i4++;
            if (i4 == i3) {
                i4 = 0;
            }
            bitInputStreamFlexible.flushCache();
        }
        return bitArrayOutputStream.toByteArray();
    }

    public static byte[] compressT6(byte[] bArr, int i, int i2) {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                BitInputStreamFlexible bitInputStreamFlexible = new BitInputStreamFlexible(byteArrayInputStream);
                try {
                    BitArrayOutputStream bitArrayOutputStream = new BitArrayOutputStream();
                    int[] iArr = new int[i];
                    int[] iArr2 = new int[i];
                    int i3 = 0;
                    while (i3 < i2) {
                        for (int i4 = 0; i4 < i; i4++) {
                            try {
                                iArr2[i4] = bitInputStreamFlexible.readBits(1);
                            } catch (IOException e) {
                                throw new ImageWriteException("Error reading image to compress", (Throwable) e);
                            }
                        }
                        int nextChangingElement = nextChangingElement(iArr2, 0, 0);
                        int nextChangingElement2 = nextChangingElement(iArr, 0, 0);
                        int nextChangingElement3 = nextChangingElement(iArr, 1, nextChangingElement2 + 1);
                        int i5 = nextChangingElement;
                        int i6 = nextChangingElement3;
                        int i7 = nextChangingElement2;
                        int i8 = 0;
                        int i9 = 0;
                        while (i8 < i) {
                            if (i6 < i5) {
                                T4_T6_Tables.P.writeBits(bitArrayOutputStream);
                            } else {
                                int i10 = i8;
                                int i11 = i9;
                                i6 = compressT(i10, i5, i7, bitArrayOutputStream, i11, iArr2);
                                i9 = i6 == i5 ? 1 - i11 : i11;
                            }
                            i8 = i6;
                            int changingElementAt = changingElementAt(iArr, i8);
                            int i12 = i8 + 1;
                            int nextChangingElement4 = nextChangingElement(iArr2, i9, i12);
                            int nextChangingElement5 = i9 == changingElementAt ? nextChangingElement(iArr, changingElementAt, i12) : nextChangingElement(iArr, 1 - changingElementAt, nextChangingElement(iArr, changingElementAt, i12) + 1);
                            i7 = nextChangingElement5;
                            i6 = nextChangingElement(iArr, 1 - i9, nextChangingElement5 + 1);
                            i5 = nextChangingElement4;
                        }
                        bitInputStreamFlexible.flushCache();
                        i3++;
                        int[] iArr3 = iArr;
                        iArr = iArr2;
                        iArr2 = iArr3;
                    }
                    T4_T6_Tables.Entry entry = T4_T6_Tables.EOL;
                    entry.writeBits(bitArrayOutputStream);
                    entry.writeBits(bitArrayOutputStream);
                    byte[] byteArray = bitArrayOutputStream.toByteArray();
                    bitInputStreamFlexible.close();
                    byteArrayInputStream.close();
                    return byteArray;
                } finally {
                }
            } finally {
            }
        } catch (IOException e2) {
            throw new ImageWriteException("I/O error", (Throwable) e2);
        }
    }

    public static byte[] decompressModifiedHuffman(byte[] bArr, int i, int i2) {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                BitInputStreamFlexible bitInputStreamFlexible = new BitInputStreamFlexible(byteArrayInputStream);
                try {
                    BitArrayOutputStream bitArrayOutputStream = new BitArrayOutputStream();
                    for (int i3 = 0; i3 < i2; i3++) {
                        int i4 = 0;
                        int i5 = 0;
                        while (i4 < i) {
                            try {
                                int readTotalRunLength = readTotalRunLength(bitInputStreamFlexible, i5);
                                for (int i6 = 0; i6 < readTotalRunLength; i6++) {
                                    bitArrayOutputStream.writeBit(i5);
                                }
                                i5 = 1 - i5;
                                i4 += readTotalRunLength;
                            } finally {
                            }
                        }
                        if (i4 == i) {
                            bitInputStreamFlexible.flushCache();
                            bitArrayOutputStream.flush();
                        } else if (i4 > i) {
                            throw new ImageReadException("Unrecoverable row length error in image row " + i3);
                        }
                    }
                    byte[] byteArray = bitArrayOutputStream.toByteArray();
                    bitArrayOutputStream.close();
                    bitInputStreamFlexible.close();
                    byteArrayInputStream.close();
                    return byteArray;
                } finally {
                }
            } finally {
            }
        } catch (IOException e) {
            throw new ImageReadException("Error reading image to decompress", e);
        }
    }

    public static byte[] decompressT4_1D(byte[] bArr, int i, int i2, boolean z) {
        BitInputStreamFlexible bitInputStreamFlexible = new BitInputStreamFlexible(new ByteArrayInputStream(bArr));
        BitArrayOutputStream bitArrayOutputStream = new BitArrayOutputStream();
        for (int i3 = 0; i3 < i2; i3++) {
            try {
                try {
                    if (!isEOL(CONTROL_CODES.decode(bitInputStreamFlexible), z)) {
                        throw new ImageReadException("Expected EOL not found");
                    }
                    int i4 = 0;
                    int i5 = 0;
                    while (i4 < i) {
                        int readTotalRunLength = readTotalRunLength(bitInputStreamFlexible, i5);
                        for (int i6 = 0; i6 < readTotalRunLength; i6++) {
                            bitArrayOutputStream.writeBit(i5);
                        }
                        i5 = 1 - i5;
                        i4 += readTotalRunLength;
                    }
                    if (i4 == i) {
                        bitArrayOutputStream.flush();
                    } else if (i4 > i) {
                        throw new ImageReadException("Unrecoverable row length error in image row " + i3);
                    }
                } catch (HuffmanTreeException e) {
                    throw new ImageReadException("Decompression error", e);
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        bitArrayOutputStream.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        }
        byte[] byteArray = bitArrayOutputStream.toByteArray();
        bitArrayOutputStream.close();
        return byteArray;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00a3 A[Catch: all -> 0x004c, HuffmanTreeException -> 0x004f, IOException -> 0x0052, TryCatch #5 {IOException -> 0x0052, HuffmanTreeException -> 0x004f, blocks: (B:7:0x0017, B:9:0x0025, B:11:0x002c, B:13:0x003b, B:15:0x0047, B:17:0x009d, B:19:0x00a3, B:21:0x00b7, B:22:0x00aa, B:24:0x0055, B:26:0x0059, B:27:0x006d, B:30:0x0096, B:31:0x0073, B:34:0x0079, B:37:0x007f, B:40:0x0085, B:43:0x008b, B:46:0x0091, B:50:0x00c2, B:51:0x00da, B:65:0x00df, B:67:0x00e6, B:73:0x0117, B:74:0x011e), top: B:6:0x0017, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00aa A[Catch: all -> 0x004c, HuffmanTreeException -> 0x004f, IOException -> 0x0052, TryCatch #5 {IOException -> 0x0052, HuffmanTreeException -> 0x004f, blocks: (B:7:0x0017, B:9:0x0025, B:11:0x002c, B:13:0x003b, B:15:0x0047, B:17:0x009d, B:19:0x00a3, B:21:0x00b7, B:22:0x00aa, B:24:0x0055, B:26:0x0059, B:27:0x006d, B:30:0x0096, B:31:0x0073, B:34:0x0079, B:37:0x007f, B:40:0x0085, B:43:0x008b, B:46:0x0091, B:50:0x00c2, B:51:0x00da, B:65:0x00df, B:67:0x00e6, B:73:0x0117, B:74:0x011e), top: B:6:0x0017, outer: #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] decompressT4_2D(byte[] bArr, int i, int i2, boolean z) {
        int i3;
        int i4;
        BitInputStreamFlexible bitInputStreamFlexible = new BitInputStreamFlexible(new ByteArrayInputStream(bArr));
        BitArrayOutputStream bitArrayOutputStream = new BitArrayOutputStream();
        try {
            int[] iArr = new int[i];
            for (int i5 = 0; i5 < i2; i5++) {
                try {
                    if (!isEOL(CONTROL_CODES.decode(bitInputStreamFlexible), z)) {
                        throw new ImageReadException("Expected EOL not found");
                    }
                    if (bitInputStreamFlexible.readBits(1) == 0) {
                        int nextChangingElement = nextChangingElement(iArr, 0, 0);
                        int nextChangingElement2 = nextChangingElement(iArr, 1, nextChangingElement + 1);
                        int i6 = 0;
                        i3 = 0;
                        int i7 = 0;
                        while (i6 < i) {
                            T4_T6_Tables.Entry decode = CONTROL_CODES.decode(bitInputStreamFlexible);
                            if (decode == T4_T6_Tables.P) {
                                fillRange(bitArrayOutputStream, iArr, i6, nextChangingElement2, i7);
                            } else if (decode == T4_T6_Tables.H) {
                                int readTotalRunLength = readTotalRunLength(bitInputStreamFlexible, i7) + i6;
                                fillRange(bitArrayOutputStream, iArr, i6, readTotalRunLength, i7);
                                int i8 = 1 - i7;
                                int readTotalRunLength2 = readTotalRunLength(bitInputStreamFlexible, i8) + readTotalRunLength;
                                fillRange(bitArrayOutputStream, iArr, readTotalRunLength, readTotalRunLength2, i8);
                                i3 = readTotalRunLength2;
                                int changingElementAt = changingElementAt(iArr, i3);
                                nextChangingElement = i7 != changingElementAt ? nextChangingElement(iArr, changingElementAt, i3 + 1) : nextChangingElement(iArr, 1 - changingElementAt, nextChangingElement(iArr, changingElementAt, i3 + 1) + 1);
                                nextChangingElement2 = nextChangingElement(iArr, 1 - i7, nextChangingElement + 1);
                                i6 = i3;
                            } else {
                                if (decode == T4_T6_Tables.V0) {
                                    i4 = 0;
                                } else if (decode == T4_T6_Tables.VL1) {
                                    i4 = -1;
                                } else if (decode == T4_T6_Tables.VL2) {
                                    i4 = -2;
                                } else if (decode == T4_T6_Tables.VL3) {
                                    i4 = -3;
                                } else if (decode == T4_T6_Tables.VR1) {
                                    i4 = 1;
                                } else if (decode == T4_T6_Tables.VR2) {
                                    i4 = 2;
                                } else {
                                    if (decode != T4_T6_Tables.VR3) {
                                        throw new ImageReadException("Invalid/unknown T.4 control code " + decode.bitString);
                                    }
                                    i4 = 3;
                                }
                                nextChangingElement2 = i4 + nextChangingElement;
                                fillRange(bitArrayOutputStream, iArr, i6, nextChangingElement2, i7);
                                i7 = 1 - i7;
                            }
                            i3 = nextChangingElement2;
                            int changingElementAt2 = changingElementAt(iArr, i3);
                            if (i7 != changingElementAt2) {
                            }
                            nextChangingElement2 = nextChangingElement(iArr, 1 - i7, nextChangingElement + 1);
                            i6 = i3;
                        }
                    } else {
                        int i9 = 0;
                        i3 = 0;
                        while (i3 < i) {
                            int readTotalRunLength3 = readTotalRunLength(bitInputStreamFlexible, i9);
                            for (int i10 = 0; i10 < readTotalRunLength3; i10++) {
                                bitArrayOutputStream.writeBit(i9);
                                iArr[i3 + i10] = i9;
                            }
                            i9 = 1 - i9;
                            i3 += readTotalRunLength3;
                        }
                    }
                    if (i3 == i) {
                        bitArrayOutputStream.flush();
                    } else if (i3 > i) {
                        throw new ImageReadException("Unrecoverable row length error in image row " + i5);
                    }
                } catch (IOException e) {
                    throw new ImageReadException("Decompression error", e);
                } catch (HuffmanTreeException e2) {
                    throw new ImageReadException("Decompression error", e2);
                }
            }
            byte[] byteArray = bitArrayOutputStream.toByteArray();
            bitArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    bitArrayOutputStream.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0084 A[Catch: HuffmanTreeException -> 0x00d3, TryCatch #0 {HuffmanTreeException -> 0x00d3, blocks: (B:4:0x0015, B:6:0x0025, B:8:0x0031, B:10:0x007e, B:12:0x0084, B:14:0x0098, B:15:0x008b, B:17:0x0036, B:19:0x003a, B:20:0x004e, B:23:0x0077, B:24:0x0054, B:27:0x005a, B:30:0x0060, B:33:0x0066, B:36:0x006c, B:39:0x0072, B:43:0x00a2, B:44:0x00ba), top: B:3:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008b A[Catch: HuffmanTreeException -> 0x00d3, TryCatch #0 {HuffmanTreeException -> 0x00d3, blocks: (B:4:0x0015, B:6:0x0025, B:8:0x0031, B:10:0x007e, B:12:0x0084, B:14:0x0098, B:15:0x008b, B:17:0x0036, B:19:0x003a, B:20:0x004e, B:23:0x0077, B:24:0x0054, B:27:0x005a, B:30:0x0060, B:33:0x0066, B:36:0x006c, B:39:0x0072, B:43:0x00a2, B:44:0x00ba), top: B:3:0x0015 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] decompressT6(byte[] bArr, int i, int i2) {
        int i3;
        BitInputStreamFlexible bitInputStreamFlexible = new BitInputStreamFlexible(new ByteArrayInputStream(bArr));
        BitArrayOutputStream bitArrayOutputStream = new BitArrayOutputStream();
        int[] iArr = new int[i];
        for (int i4 = 0; i4 < i2; i4++) {
            try {
                int nextChangingElement = nextChangingElement(iArr, 0, 0);
                int nextChangingElement2 = nextChangingElement(iArr, 1, nextChangingElement + 1);
                int i5 = 0;
                int i6 = 0;
                int i7 = 0;
                while (i5 < i) {
                    T4_T6_Tables.Entry decode = CONTROL_CODES.decode(bitInputStreamFlexible);
                    if (decode == T4_T6_Tables.P) {
                        fillRange(bitArrayOutputStream, iArr, i5, nextChangingElement2, i7);
                    } else if (decode == T4_T6_Tables.H) {
                        int readTotalRunLength = readTotalRunLength(bitInputStreamFlexible, i7) + i5;
                        fillRange(bitArrayOutputStream, iArr, i5, readTotalRunLength, i7);
                        int i8 = 1 - i7;
                        int readTotalRunLength2 = readTotalRunLength(bitInputStreamFlexible, i8) + readTotalRunLength;
                        fillRange(bitArrayOutputStream, iArr, readTotalRunLength, readTotalRunLength2, i8);
                        i6 = readTotalRunLength2;
                        int changingElementAt = changingElementAt(iArr, i6);
                        nextChangingElement = i7 != changingElementAt ? nextChangingElement(iArr, changingElementAt, i6 + 1) : nextChangingElement(iArr, 1 - changingElementAt, nextChangingElement(iArr, changingElementAt, i6 + 1) + 1);
                        nextChangingElement2 = nextChangingElement(iArr, 1 - i7, nextChangingElement + 1);
                        i5 = i6;
                    } else {
                        if (decode == T4_T6_Tables.V0) {
                            i3 = 0;
                        } else if (decode == T4_T6_Tables.VL1) {
                            i3 = -1;
                        } else if (decode == T4_T6_Tables.VL2) {
                            i3 = -2;
                        } else if (decode == T4_T6_Tables.VL3) {
                            i3 = -3;
                        } else if (decode == T4_T6_Tables.VR1) {
                            i3 = 1;
                        } else if (decode == T4_T6_Tables.VR2) {
                            i3 = 2;
                        } else {
                            if (decode != T4_T6_Tables.VR3) {
                                throw new ImageReadException("Invalid/unknown T.6 control code " + decode.bitString);
                            }
                            i3 = 3;
                        }
                        nextChangingElement2 = i3 + nextChangingElement;
                        fillRange(bitArrayOutputStream, iArr, i5, nextChangingElement2, i7);
                        i7 = 1 - i7;
                    }
                    i6 = nextChangingElement2;
                    int changingElementAt2 = changingElementAt(iArr, i6);
                    if (i7 != changingElementAt2) {
                    }
                    nextChangingElement2 = nextChangingElement(iArr, 1 - i7, nextChangingElement + 1);
                    i5 = i6;
                }
                if (i6 == i) {
                    bitArrayOutputStream.flush();
                } else if (i6 > i) {
                    throw new ImageReadException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i4, "Unrecoverable row length error in image row "));
                }
            } catch (HuffmanTreeException e) {
                throw new ImageReadException("Decompression error", e);
            }
        }
        return bitArrayOutputStream.toByteArray();
    }

    private static void fillRange(BitArrayOutputStream bitArrayOutputStream, int[] iArr, int i, int i2, int i3) {
        while (i < i2) {
            iArr[i] = i3;
            bitArrayOutputStream.writeBit(i3);
            i++;
        }
    }

    private static boolean isEOL(T4_T6_Tables.Entry entry, boolean z) {
        if (entry == T4_T6_Tables.EOL) {
            return true;
        }
        if (z) {
            return entry == T4_T6_Tables.EOL13 || entry == T4_T6_Tables.EOL14 || entry == T4_T6_Tables.EOL15 || entry == T4_T6_Tables.EOL16 || entry == T4_T6_Tables.EOL17 || entry == T4_T6_Tables.EOL18 || entry == T4_T6_Tables.EOL19;
        }
        return false;
    }

    private static T4_T6_Tables.Entry lowerBound(T4_T6_Tables.Entry[] entryArr, int i) {
        int i2;
        int length = entryArr.length - 1;
        int i3 = 0;
        do {
            int i4 = (i3 + length) >>> 1;
            if (entryArr[i4].value.intValue() <= i && ((i2 = i4 + 1) >= entryArr.length || i < entryArr[i2].value.intValue())) {
                return entryArr[i4];
            }
            if (entryArr[i4].value.intValue() > i) {
                length = i4 - 1;
            } else {
                i3 = i4 + 1;
            }
        } while (i3 < length);
        return entryArr[i3];
    }

    private static int nextChangingElement(int[] iArr, int i, int i2) {
        while (i2 < iArr.length && iArr[i2] == i) {
            i2++;
        }
        return Math.min(i2, iArr.length);
    }

    private static int readTotalRunLength(BitInputStreamFlexible bitInputStreamFlexible, int i) {
        Integer decode;
        int i2 = 0;
        do {
            if (i == 0) {
                try {
                    decode = WHITE_RUN_LENGTHS.decode(bitInputStreamFlexible);
                } catch (HuffmanTreeException e) {
                    throw new ImageReadException("Decompression error", e);
                }
            } else {
                decode = BLACK_RUN_LENGTHS.decode(bitInputStreamFlexible);
            }
            i2 += decode.intValue();
        } while (decode.intValue() > 63);
        return i2;
    }

    private static void writeRunLength(BitArrayOutputStream bitArrayOutputStream, int i, int i2) {
        T4_T6_Tables.Entry[] entryArr;
        T4_T6_Tables.Entry[] entryArr2;
        if (i2 == 0) {
            entryArr = T4_T6_Tables.WHITE_MAKE_UP_CODES;
            entryArr2 = T4_T6_Tables.WHITE_TERMINATING_CODES;
        } else {
            entryArr = T4_T6_Tables.BLACK_MAKE_UP_CODES;
            entryArr2 = T4_T6_Tables.BLACK_TERMINATING_CODES;
        }
        while (i >= 1792) {
            T4_T6_Tables.Entry lowerBound = lowerBound(T4_T6_Tables.ADDITIONAL_MAKE_UP_CODES, i);
            lowerBound.writeBits(bitArrayOutputStream);
            i -= lowerBound.value.intValue();
        }
        while (i >= 64) {
            T4_T6_Tables.Entry lowerBound2 = lowerBound(entryArr, i);
            lowerBound2.writeBits(bitArrayOutputStream);
            i -= lowerBound2.value.intValue();
        }
        entryArr2[i].writeBits(bitArrayOutputStream);
    }
}
