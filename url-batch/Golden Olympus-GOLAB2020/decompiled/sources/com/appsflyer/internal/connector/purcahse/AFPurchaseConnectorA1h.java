package com.appsflyer.internal.connector.purcahse;

import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.InputStream;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public final class AFPurchaseConnectorA1h extends FilterInputStream implements AutoCloseable {
    private final byte[][] PurchaseClient;
    private final byte[] PurchaseClientBuilder;
    private final int autoLogInApps;
    private final int[] equals;
    private int getVERSION_NAME;
    private final byte[] hashCode;
    private final int logSubscriptions;
    private int setSandbox;
    private int setSubscriptionPurchaseEventDataSource;
    private int setSubscriptionValidationResultListener;
    private final int startObservingTransactions;
    private final int[] stopObservingTransactions;
    private static final byte[] toJsonMap = AFPurchaseConnectorA1j.InAppPurchaseEvent;
    private static final int[] getQuantity = AFPurchaseConnectorA1j.toJsonMap;
    private static final int[] InAppPurchaseEvent = AFPurchaseConnectorA1j.getOneTimePurchaseOfferDetails;
    private static final int[] getOneTimePurchaseOfferDetails = AFPurchaseConnectorA1j.getQuantity;
    private static final int[] getPackageName = AFPurchaseConnectorA1j.getPackageName;

    public AFPurchaseConnectorA1h(InputStream inputStream, int i4, byte[] bArr, byte[][] bArr2) {
        this(inputStream, i4, bArr, bArr2, (byte) 0);
    }

    private void getOneTimePurchaseOfferDetails(byte[] bArr, byte[] bArr2) {
        int[] iArr = this.stopObservingTransactions;
        boolean z4 = true;
        char c4 = 2;
        char c5 = '\b';
        char c6 = 3;
        int i4 = (bArr[0] << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int[] iArr2 = this.equals;
        iArr[0] = i4 ^ iArr2[0];
        char c7 = 5;
        char c8 = 6;
        iArr[1] = ((((bArr[4] << 24) | ((bArr[5] & 255) << 16)) | ((bArr[6] & 255) << 8)) | (bArr[7] & 255)) ^ iArr2[1];
        iArr[2] = ((bArr[11] & 255) | (((bArr[8] << 24) | ((bArr[9] & 255) << 16)) | ((bArr[10] & 255) << 8))) ^ iArr2[2];
        char c9 = 14;
        iArr[3] = (((((bArr[13] & 255) << 16) | (bArr[12] << 24)) | ((bArr[14] & 255) << 8)) | (bArr[15] & 255)) ^ iArr2[3];
        int i5 = 1;
        int i6 = 4;
        while (i5 < this.startObservingTransactions) {
            int[] iArr3 = getQuantity;
            int[] iArr4 = this.stopObservingTransactions;
            boolean z5 = z4;
            byte[][] bArr3 = this.PurchaseClient;
            byte[] bArr4 = bArr3[0];
            int i7 = iArr3[iArr4[bArr4[0]] >>> 24];
            int[] iArr5 = InAppPurchaseEvent;
            byte[] bArr5 = bArr3[z5 ? 1 : 0];
            char c10 = c4;
            int i8 = i7 ^ iArr5[(iArr4[bArr5[0]] >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE];
            int[] iArr6 = getOneTimePurchaseOfferDetails;
            byte[] bArr6 = bArr3[c10];
            char c11 = c6;
            int i9 = i8 ^ iArr6[(iArr4[bArr6[0]] >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE];
            int[] iArr7 = getPackageName;
            byte[] bArr7 = bArr3[c11];
            char c12 = c5;
            int i10 = i9 ^ iArr7[iArr4[bArr7[0]] & KotlinVersion.MAX_COMPONENT_VALUE];
            int[] iArr8 = this.equals;
            int i11 = i10 ^ iArr8[i6];
            char c13 = c9;
            char c14 = c7;
            int i12 = (((iArr3[iArr4[bArr4[z5 ? 1 : 0]] >>> 24] ^ iArr5[(iArr4[bArr5[z5 ? 1 : 0]] >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE]) ^ iArr6[(iArr4[bArr6[z5 ? 1 : 0]] >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE]) ^ iArr7[iArr4[bArr7[z5 ? 1 : 0]] & KotlinVersion.MAX_COMPONENT_VALUE]) ^ iArr8[i6 + 1];
            int i13 = (((iArr3[iArr4[bArr4[c10]] >>> 24] ^ iArr5[(iArr4[bArr5[c10]] >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE]) ^ iArr6[(iArr4[bArr6[c10]] >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE]) ^ iArr7[iArr4[bArr7[c10]] & KotlinVersion.MAX_COMPONENT_VALUE]) ^ iArr8[i6 + 2];
            int i14 = (((iArr3[iArr4[bArr4[c11]] >>> 24] ^ iArr5[(iArr4[bArr5[c11]] >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE]) ^ iArr6[(iArr4[bArr6[c11]] >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE]) ^ iArr7[iArr4[bArr7[c11]] & KotlinVersion.MAX_COMPONENT_VALUE]) ^ iArr8[i6 + 3];
            iArr4[0] = i11;
            iArr4[z5 ? 1 : 0] = i12;
            iArr4[c10] = i13;
            iArr4[c11] = i14;
            i5++;
            i6 += 4;
            z4 = z5 ? 1 : 0;
            c4 = c10;
            c6 = c11;
            c5 = c12;
            c7 = c14;
            c9 = c13;
            c8 = c8;
        }
        boolean z6 = z4;
        char c15 = c4;
        char c16 = c6;
        char c17 = c5;
        char c18 = c9;
        int[] iArr9 = this.equals;
        int i15 = iArr9[i6];
        byte[] bArr8 = toJsonMap;
        int[] iArr10 = this.stopObservingTransactions;
        byte[][] bArr9 = this.PurchaseClient;
        byte[] bArr10 = bArr9[0];
        bArr2[0] = (byte) (bArr8[iArr10[bArr10[0]] >>> 24] ^ (i15 >>> 24));
        byte[] bArr11 = bArr9[z6 ? 1 : 0];
        bArr2[z6 ? 1 : 0] = (byte) (bArr8[(iArr10[bArr11[0]] >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE] ^ (i15 >>> 16));
        byte[] bArr12 = bArr9[c15];
        bArr2[c15] = (byte) (bArr8[(iArr10[bArr12[0]] >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE] ^ (i15 >>> 8));
        byte[] bArr13 = bArr9[c16];
        bArr2[c16] = (byte) (i15 ^ bArr8[iArr10[bArr13[0]] & KotlinVersion.MAX_COMPONENT_VALUE]);
        int i16 = iArr9[i6 + 1];
        bArr2[4] = (byte) (bArr8[iArr10[bArr10[z6 ? 1 : 0]] >>> 24] ^ (i16 >>> 24));
        bArr2[c7] = (byte) (bArr8[(iArr10[bArr11[z6 ? 1 : 0]] >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE] ^ (i16 >>> 16));
        bArr2[c8] = (byte) (bArr8[(iArr10[bArr12[z6 ? 1 : 0]] >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE] ^ (i16 >>> 8));
        bArr2[7] = (byte) (i16 ^ bArr8[iArr10[bArr13[z6 ? 1 : 0]] & KotlinVersion.MAX_COMPONENT_VALUE]);
        int i17 = iArr9[i6 + 2];
        bArr2[c17] = (byte) (bArr8[iArr10[bArr10[c15]] >>> 24] ^ (i17 >>> 24));
        bArr2[9] = (byte) (bArr8[(iArr10[bArr11[c15]] >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE] ^ (i17 >>> 16));
        bArr2[10] = (byte) (bArr8[(iArr10[bArr12[c15]] >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE] ^ (i17 >>> 8));
        bArr2[11] = (byte) (i17 ^ bArr8[iArr10[bArr13[c15]] & KotlinVersion.MAX_COMPONENT_VALUE]);
        int i18 = iArr9[i6 + 3];
        bArr2[12] = (byte) (bArr8[iArr10[bArr10[c16]] >>> 24] ^ (i18 >>> 24));
        bArr2[13] = (byte) (bArr8[(iArr10[bArr11[c16]] >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE] ^ (i18 >>> 16));
        bArr2[c18] = (byte) (bArr8[(iArr10[bArr12[c16]] >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE] ^ (i18 >>> 8));
        bArr2[15] = (byte) (i18 ^ bArr8[iArr10[bArr13[c16]] & KotlinVersion.MAX_COMPONENT_VALUE]);
    }

    private int toJsonMap() {
        if (this.getVERSION_NAME == Integer.MAX_VALUE) {
            this.getVERSION_NAME = ((FilterInputStream) this).in.read();
        }
        if (this.setSubscriptionValidationResultListener == 16) {
            byte[] bArr = this.hashCode;
            int i4 = this.getVERSION_NAME;
            bArr[0] = (byte) i4;
            if (i4 < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i5 = 1;
            do {
                int read = ((FilterInputStream) this).in.read(this.hashCode, i5, 16 - i5);
                if (read <= 0) {
                    break;
                }
                i5 += read;
            } while (i5 < 16);
            if (i5 < 16) {
                throw new IllegalStateException("unexpected block size");
            }
            int i6 = this.autoLogInApps;
            if (i6 == this.logSubscriptions) {
                getOneTimePurchaseOfferDetails(this.hashCode, this.PurchaseClientBuilder);
            } else {
                if (this.setSandbox <= i6) {
                    getOneTimePurchaseOfferDetails(this.hashCode, this.PurchaseClientBuilder);
                } else {
                    byte[] bArr2 = this.hashCode;
                    System.arraycopy(bArr2, 0, this.PurchaseClientBuilder, 0, bArr2.length);
                }
                int i7 = this.setSandbox;
                if (i7 < this.logSubscriptions) {
                    this.setSandbox = i7 + 1;
                } else {
                    this.setSandbox = 1;
                }
            }
            int read2 = ((FilterInputStream) this).in.read();
            this.getVERSION_NAME = read2;
            this.setSubscriptionValidationResultListener = 0;
            this.setSubscriptionPurchaseEventDataSource = read2 < 0 ? 16 - (this.PurchaseClientBuilder[15] & 255) : 16;
        }
        return this.setSubscriptionPurchaseEventDataSource;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        toJsonMap();
        return this.setSubscriptionPurchaseEventDataSource - this.setSubscriptionValidationResultListener;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i4) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        toJsonMap();
        int i4 = this.setSubscriptionValidationResultListener;
        if (i4 >= this.setSubscriptionPurchaseEventDataSource) {
            return -1;
        }
        byte[] bArr = this.PurchaseClientBuilder;
        this.setSubscriptionValidationResultListener = i4 + 1;
        return bArr[i4] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j4) {
        long j5 = 0;
        while (j5 < j4 && read() != -1) {
            j5++;
        }
        return j5;
    }

    private AFPurchaseConnectorA1h(InputStream inputStream, int i4, byte[] bArr, byte[][] bArr2, byte b4) {
        super(new BufferedInputStream(inputStream, Base64Utils.IO_BUFFER_SIZE));
        this.stopObservingTransactions = new int[4];
        this.hashCode = new byte[16];
        this.PurchaseClientBuilder = new byte[16];
        this.setSandbox = 1;
        this.getVERSION_NAME = Integer.MAX_VALUE;
        this.setSubscriptionValidationResultListener = 16;
        this.setSubscriptionPurchaseEventDataSource = 16;
        this.startObservingTransactions = i4;
        this.equals = AFPurchaseConnectorA1j.getPackageName(bArr, i4);
        byte[][] bArr3 = new byte[bArr2.length][];
        for (int i5 = 0; i5 < bArr2.length; i5++) {
            bArr3[i5] = new byte[bArr2[i5].length];
            int i6 = 0;
            while (true) {
                byte[] bArr4 = bArr2[i5];
                if (i6 < bArr4.length) {
                    bArr3[i5][bArr4[i6]] = (byte) i6;
                    i6++;
                }
            }
        }
        this.PurchaseClient = bArr3;
        this.autoLogInApps = 100;
        this.logSubscriptions = 100;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i4, int i5) {
        int i6 = i4 + i5;
        for (int i7 = i4; i7 < i6; i7++) {
            toJsonMap();
            int i8 = this.setSubscriptionValidationResultListener;
            if (i8 >= this.setSubscriptionPurchaseEventDataSource) {
                if (i7 == i4) {
                    return -1;
                }
                return i5 - (i6 - i7);
            }
            byte[] bArr2 = this.PurchaseClientBuilder;
            this.setSubscriptionValidationResultListener = i8 + 1;
            bArr[i7] = bArr2[i8];
        }
        return i5;
    }
}
