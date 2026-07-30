package com.baidu.ar;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* loaded from: classes.dex */
public class a1 {
    public static int a(byte[] bArr) {
        return ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).getInt();
    }

    public static short b(byte[] bArr) {
        return ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).getShort();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x016f A[Catch: IOException -> 0x016b, TRY_LEAVE, TryCatch #7 {IOException -> 0x016b, blocks: (B:38:0x0167, B:31:0x016f), top: B:37:0x0167 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0167 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static re c(byte[] bArr) {
        re reVar;
        Throwable th;
        DataInputStream dataInputStream;
        Exception e8;
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[2];
        ByteArrayInputStream byteArrayInputStream = null;
        try {
        } catch (IOException e9) {
            e9.printStackTrace();
        }
        try {
            try {
                reVar = new re();
                try {
                    ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArr);
                    try {
                        dataInputStream = new DataInputStream(byteArrayInputStream2);
                        try {
                            reVar.f3062a = "" + ((char) dataInputStream.readByte()) + ((char) dataInputStream.readByte()) + ((char) dataInputStream.readByte()) + ((char) dataInputStream.readByte());
                            dataInputStream.read(bArr2);
                            reVar.f3063b = a(bArr2);
                            reVar.f3064c = "" + ((char) dataInputStream.readByte()) + ((char) dataInputStream.readByte()) + ((char) dataInputStream.readByte()) + ((char) dataInputStream.readByte());
                            reVar.f3065d = "" + ((char) dataInputStream.readByte()) + ((char) dataInputStream.readByte()) + ((char) dataInputStream.readByte()) + ((char) dataInputStream.readByte());
                            dataInputStream.read(bArr2);
                            reVar.f3066e = a(bArr2);
                            dataInputStream.read(bArr3);
                            reVar.f3067f = b(bArr3);
                            dataInputStream.read(bArr3);
                            reVar.f3068g = b(bArr3);
                            dataInputStream.read(bArr2);
                            reVar.f3069h = a(bArr2);
                            dataInputStream.read(bArr2);
                            reVar.f3070i = a(bArr2);
                            dataInputStream.read(bArr3);
                            reVar.f3071j = b(bArr3);
                            dataInputStream.read(bArr3);
                            reVar.f3072k = b(bArr3);
                            reVar.f3073l = "" + ((char) dataInputStream.readByte()) + ((char) dataInputStream.readByte()) + ((char) dataInputStream.readByte()) + ((char) dataInputStream.readByte());
                            dataInputStream.read(bArr2);
                            reVar.f3074m = a(bArr2);
                            h.a("AudioUtil", reVar.toString());
                            byteArrayInputStream2.close();
                            dataInputStream.close();
                        } catch (Exception e10) {
                            e8 = e10;
                            byteArrayInputStream = byteArrayInputStream2;
                            try {
                                e8.printStackTrace();
                                if (byteArrayInputStream != null) {
                                    byteArrayInputStream.close();
                                }
                                if (dataInputStream != null) {
                                    dataInputStream.close();
                                }
                                return reVar;
                            } catch (Throwable th2) {
                                th = th2;
                                if (byteArrayInputStream != null) {
                                    try {
                                        byteArrayInputStream.close();
                                    } catch (IOException e11) {
                                        e11.printStackTrace();
                                        throw th;
                                    }
                                }
                                if (dataInputStream != null) {
                                    dataInputStream.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            byteArrayInputStream = byteArrayInputStream2;
                            if (byteArrayInputStream != null) {
                            }
                            if (dataInputStream != null) {
                            }
                            throw th;
                        }
                    } catch (Exception e12) {
                        e8 = e12;
                        dataInputStream = null;
                    } catch (Throwable th4) {
                        th = th4;
                        dataInputStream = null;
                    }
                } catch (Exception e13) {
                    e8 = e13;
                    dataInputStream = null;
                }
            } catch (Exception e14) {
                e8 = e14;
                dataInputStream = null;
                reVar = null;
            }
            return reVar;
        } catch (Throwable th5) {
            th = th5;
            dataInputStream = null;
        }
    }

    public static byte[] d(byte[] bArr) {
        return bArr != null ? Arrays.copyOfRange(bArr, 44, bArr.length) : new byte[0];
    }
}
