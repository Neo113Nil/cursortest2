package org.bouncycastle.pqc.crypto.picnic;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.util.Properties;
import org.bouncycastle.util.Pack;
import org.bouncycastle.util.encoders.Hex;

/* loaded from: classes10.dex */
abstract class LowmcConstants {
    protected KMatrices KMatrix;
    protected KMatrices KMatrix_full;
    protected KMatrices KMatrix_inv;
    protected KMatrices LMatrix;
    protected KMatrices LMatrix_full;
    protected KMatrices LMatrix_inv;
    protected KMatrices RConstants;
    protected KMatrices RConstants_full;
    protected int[] keyMatrices;
    protected int[] keyMatrices_full;
    protected int[] keyMatrices_inv;
    protected int[] linearMatrices;
    protected int[] linearMatrices_full;
    protected int[] linearMatrices_inv;
    protected int[] roundConstants;
    protected int[] roundConstants_full;

    private KMatricesWithPointer GET_MAT(KMatrices kMatrices, int i) {
        KMatricesWithPointer kMatricesWithPointer = new KMatricesWithPointer(kMatrices);
        kMatricesWithPointer.setMatrixPointer(i * kMatricesWithPointer.getSize());
        return kMatricesWithPointer;
    }

    public static int[] ReadFromProperty(Properties properties, String str, int i) {
        byte[] decode = Hex.decode(removeCommas(properties.getProperty(str)));
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < decode.length / 4; i2++) {
            iArr[i2] = Pack.littleEndianToInt(decode, i2 * 4);
        }
        return iArr;
    }

    public static int[] readArray(DataInputStream dataInputStream) {
        int readInt = dataInputStream.readInt();
        int[] iArr = new int[readInt];
        for (int i = 0; i != readInt; i++) {
            iArr[i] = dataInputStream.readInt();
        }
        return iArr;
    }

    private static byte[] removeCommas(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i = 0; i != str.length(); i++) {
            if (str.charAt(i) != ',') {
                byteArrayOutputStream.write(str.charAt(i));
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001b, code lost:
    
        if (r3.numRounds == 4) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public KMatricesWithPointer KMatrix(PicnicEngine picnicEngine, int i) {
        KMatrices kMatrices;
        int i2 = picnicEngine.stateSizeBits;
        if (i2 != 128) {
            if (i2 != 129) {
                if (i2 != 192) {
                    if (i2 != 255) {
                        if (i2 != 256) {
                            return null;
                        }
                    }
                }
                return GET_MAT(kMatrices, i);
            }
            kMatrices = this.KMatrix_full;
            return GET_MAT(kMatrices, i);
        }
        kMatrices = this.KMatrix;
        return GET_MAT(kMatrices, i);
    }

    public KMatricesWithPointer KMatrixInv(PicnicEngine picnicEngine) {
        int i = picnicEngine.stateSizeBits;
        if (i == 129 || ((i == 192 && picnicEngine.numRounds == 4) || i == 255)) {
            return GET_MAT(this.KMatrix_inv, 0);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001b, code lost:
    
        if (r3.numRounds == 4) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public KMatricesWithPointer LMatrix(PicnicEngine picnicEngine, int i) {
        KMatrices kMatrices;
        int i2 = picnicEngine.stateSizeBits;
        if (i2 != 128) {
            if (i2 != 129) {
                if (i2 != 192) {
                    if (i2 != 255) {
                        if (i2 != 256) {
                            return null;
                        }
                    }
                }
                return GET_MAT(kMatrices, i);
            }
            kMatrices = this.LMatrix_full;
            return GET_MAT(kMatrices, i);
        }
        kMatrices = this.LMatrix;
        return GET_MAT(kMatrices, i);
    }

    public KMatricesWithPointer LMatrixInv(PicnicEngine picnicEngine, int i) {
        int i2 = picnicEngine.stateSizeBits;
        if (i2 == 129 || ((i2 == 192 && picnicEngine.numRounds == 4) || i2 == 255)) {
            return GET_MAT(this.LMatrix_inv, i);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001b, code lost:
    
        if (r3.numRounds == 4) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public KMatricesWithPointer RConstant(PicnicEngine picnicEngine, int i) {
        KMatrices kMatrices;
        int i2 = picnicEngine.stateSizeBits;
        if (i2 != 128) {
            if (i2 != 129) {
                if (i2 != 192) {
                    if (i2 != 255) {
                        if (i2 != 256) {
                            return null;
                        }
                    }
                }
                return GET_MAT(kMatrices, i);
            }
            kMatrices = this.RConstants_full;
            return GET_MAT(kMatrices, i);
        }
        kMatrices = this.RConstants;
        return GET_MAT(kMatrices, i);
    }
}
