package org.apache.commons.imaging.icc;

import java.io.ByteArrayInputStream;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.logging.Logger;
import org.apache.commons.imaging.common.BinaryFunctions;

/* loaded from: classes9.dex */
public enum IccTagDataTypes implements IccTagDataType {
    DESC_TYPE("descType", 1684370275) { // from class: org.apache.commons.imaging.icc.IccTagDataTypes.1
        @Override // org.apache.commons.imaging.icc.IccTagDataType
        public void dump(String str, byte[] bArr) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
                BinaryFunctions.read4Bytes("type_signature", byteArrayInputStream, "ICC: corrupt tag data", byteOrder);
                BinaryFunctions.read4Bytes("ignore", byteArrayInputStream, "ICC: corrupt tag data", byteOrder);
                String str2 = new String(bArr, 12, BinaryFunctions.read4Bytes("stringLength", byteArrayInputStream, "ICC: corrupt tag data", byteOrder) - 1, StandardCharsets.US_ASCII);
                IccTagDataTypes.LOGGER.fine(str + "s: '" + str2 + "'");
                byteArrayInputStream.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        }
    },
    DATA_TYPE("dataType", 1684108385) { // from class: org.apache.commons.imaging.icc.IccTagDataTypes.2
        @Override // org.apache.commons.imaging.icc.IccTagDataType
        public void dump(String str, byte[] bArr) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                BinaryFunctions.read4Bytes("type_signature", byteArrayInputStream, "ICC: corrupt tag data", ByteOrder.BIG_ENDIAN);
                byteArrayInputStream.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        }
    },
    MULTI_LOCALIZED_UNICODE_TYPE("multiLocalizedUnicodeType", 1835824483) { // from class: org.apache.commons.imaging.icc.IccTagDataTypes.3
        @Override // org.apache.commons.imaging.icc.IccTagDataType
        public void dump(String str, byte[] bArr) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                BinaryFunctions.read4Bytes("type_signature", byteArrayInputStream, "ICC: corrupt tag data", ByteOrder.BIG_ENDIAN);
                byteArrayInputStream.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        }
    },
    SIGNATURE_TYPE("signatureType", 1936287520) { // from class: org.apache.commons.imaging.icc.IccTagDataTypes.4
        @Override // org.apache.commons.imaging.icc.IccTagDataType
        public void dump(String str, byte[] bArr) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
                BinaryFunctions.read4Bytes("type_signature", byteArrayInputStream, "ICC: corrupt tag data", byteOrder);
                BinaryFunctions.read4Bytes("ignore", byteArrayInputStream, "ICC: corrupt tag data", byteOrder);
                int read4Bytes = BinaryFunctions.read4Bytes("thesignature ", byteArrayInputStream, "ICC: corrupt tag data", byteOrder);
                IccTagDataTypes.LOGGER.fine(str + "thesignature: " + Integer.toHexString(read4Bytes) + " (" + new String(new byte[]{(byte) ((read4Bytes >> 24) & 255), (byte) ((read4Bytes >> 16) & 255), (byte) ((read4Bytes >> 8) & 255), (byte) (read4Bytes & 255)}, StandardCharsets.US_ASCII) + ")");
                byteArrayInputStream.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        }
    },
    TEXT_TYPE("textType", 1952807028) { // from class: org.apache.commons.imaging.icc.IccTagDataTypes.5
        @Override // org.apache.commons.imaging.icc.IccTagDataType
        public void dump(String str, byte[] bArr) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
                BinaryFunctions.read4Bytes("type_signature", byteArrayInputStream, "ICC: corrupt tag data", byteOrder);
                BinaryFunctions.read4Bytes("ignore", byteArrayInputStream, "ICC: corrupt tag data", byteOrder);
                String str2 = new String(bArr, 8, bArr.length - 8, StandardCharsets.US_ASCII);
                IccTagDataTypes.LOGGER.fine(str + "s: '" + str2 + "'");
                byteArrayInputStream.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        }
    };

    private static final Logger LOGGER = Logger.getLogger(IccTagDataTypes.class.getName());
    public final String name;
    public final int signature;

    IccTagDataTypes(String str, int i) {
        this.name = str;
        this.signature = i;
    }

    @Override // org.apache.commons.imaging.icc.IccTagDataType
    public String getName() {
        return this.name;
    }

    @Override // org.apache.commons.imaging.icc.IccTagDataType
    public int getSignature() {
        return this.signature;
    }
}
