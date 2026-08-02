package org.bouncycastle.crypto.digests;

import com.plaid.internal.EnumC0170g;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;

/* loaded from: classes9.dex */
public final class WhirlpoolDigest implements ExtendedDigest, Memoable {
    private static final int BITCOUNT_ARRAY_SIZE = 32;
    private static final int BYTE_LENGTH = 64;
    private static final int DIGEST_LENGTH_BYTES = 64;
    private static final short[] EIGHT;
    private static final int REDUCTION_POLYNOMIAL = 285;
    private static final int ROUNDS = 10;
    private long[] _K;
    private long[] _L;
    private short[] _bitCount;
    private long[] _block;
    private byte[] _buffer;
    private int _bufferPos;
    private long[] _hash;
    private final long[] _rc;
    private long[] _state;
    private final CryptoServicePurpose purpose;
    private static final int[] SBOX = {24, 35, EnumC0170g.SDK_ASSET_ICON_ARROW_UP_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE, 1, 79, 54, EnumC0170g.SDK_ASSET_ILLUSTRATION_ETH_WITH_PLAID_VALUE, EnumC0170g.SDK_ASSET_ICON_NEW_WINDOW_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE, 121, 111, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE, 82, 96, 188, EnumC0170g.SDK_ASSET_ILLUSTRATION_MANAGE_CONNECTIONS_VALUE, EnumC0170g.SDK_ASSET_CONNECTIVITY_WARNING_ILLUSTRATION_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_PAYWITHPLAID_LOGO_VALUE, 12, EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE, 53, 29, 224, EnumC0170g.SDK_ASSET_ICON_PRODUCT_IDV_VALUE, EnumC0170g.SDK_ASSET_ICON_EXTERNAL_VALUE, 46, 75, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, 87, 21, 119, 55, EnumC0170g.SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_INCOME_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE, 74, EnumC0170g.SDK_ASSET_ICON_QUESTION_VALUE, 88, EnumC0170g.SDK_ASSET_ICON_CHEVRON_LEFT_DOUBLE_S2_VALUE, 41, 10, EnumC0170g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE, 107, EnumC0170g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE, 93, 16, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE, EnumC0170g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S2_VALUE, 62, 5, 103, EnumC0170g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE, 39, 65, EnumC0170g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE, 167, 125, EnumC0170g.SDK_ASSET_ILLUSTRATION_SDK_EMPTY_SVG_VALUE, EnumC0170g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_02_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, 102, EnumC0170g.SDK_ASSET_ICON_SUBMIT_VALUE, 23, 71, EnumC0170g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE, EnumC0170g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S1_VALUE, 45, EnumC0170g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE, 7, EnumC0170g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE, 90, 131, 51, 99, 2, EnumC0170g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE, 113, 200, 25, 73, EnumC0170g.SDK_ASSET_ICON_PROGRESS_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_02_CIRCLE_VALUE, 91, 136, EnumC0170g.SDK_ASSET_ILLUSTRATION_UPLOAD_VALUE, 38, 50, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE, 15, EnumC0170g.SDK_ASSET_ICON_PAUSE_VALUE, 128, EnumC0170g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE, EnumC0170g.SDK_ASSET_ICON_CLIPBOARD_VALUE, 52, 72, 255, EnumC0170g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, 144, 95, 32, 104, 26, EnumC0170g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_VALUE, EnumC0170g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE, 84, 147, 34, 100, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_VALUE, 115, 18, 64, 8, EnumC0170g.SDK_ASSET_ICON_ALERT_WARNING_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE, EnumC0170g.SDK_ASSET_ICON_REJECTED_REC_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_VALUE, EnumC0170g.SDK_ASSET_CONNECTIVITY_DOWN_ILLUSTRATION_VALUE, 61, 151, 0, EnumC0170g.SDK_ASSET_ICON_COMMENT_VALUE, 43, 118, EnumC0170g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE, EnumC0170g.SDK_ASSET_ICON_PIN_VALUE, 27, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_REVIEW_CONNECTION_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_DARK_APPEARANCE_VALUE, 106, 80, 69, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE, 48, 239, 63, 85, EnumC0170g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE, 101, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_TEXT_VALUE, 47, 192, EnumC0170g.SDK_ASSET_ICON_SUBTRACT_VALUE, 28, EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, 77, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_PERSON_VALUE, 117, 6, EnumC0170g.SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY_DARK_APPEARANCE_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE, 14, 31, 98, EnumC0170g.SDK_ASSET_ICON_OVERRIDE_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE, 150, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_CONFIRMED_VALUE, EnumC0170g.SDK_ASSET_ICON_ARROW_RIGHT_DOWN_VALUE, 37, 89, EnumC0170g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE, 114, 57, 76, 94, 120, 56, 140, EnumC0170g.SDK_ASSET_ICON_INCOMPLETE_VALUE, 165, EnumC0170g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_01_CIRCLE_VALUE, 97, EnumC0170g.SDK_ASSET_ILLUSTRATION_VERIFICATION_IN_PROGRESS_DARK_APPEARANCE_VALUE, 33, EnumC0170g.SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_CENTERED_VALUE, 30, 67, EnumC0170g.SDK_ASSET_ICON_CANCEL_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, 4, 81, 153, 109, 13, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 36, 59, EnumC0170g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_VALUE, EnumC0170g.SDK_ASSET_ICON_CLOCK_VALUE, 17, EnumC0170g.SDK_ASSET_ICON_ALERT_ERROR_BLACK_VALUE, 78, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE, 60, EnumC0170g.SDK_ASSET_ILLUSTRATION_FORM_VALUE, EnumC0170g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE, 185, 19, 44, 211, EnumC0170g.SDK_ASSET_ILLUSTRATION_EXIT_VALUE, 110, EnumC0170g.SDK_ASSET_ICON_ARROW_DOWN_VALUE, 3, 86, 68, 127, EnumC0170g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE, 42, EnumC0170g.SDK_ASSET_ILLUSTRATION_ATOMIC_LOGO_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_2_VALUE, 83, EnumC0170g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE, 11, EnumC0170g.SDK_ASSET_ILLUSTRATION_FALLBACK_INSTITUTION_VALUE, 108, 49, 116, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE, 70, EnumC0170g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_INSTITUTION_CIRCLE_VALUE, 20, EnumC0170g.SDK_ASSET_ILLUSTRATION_ACCOUNT_NUMBER_SEARCH_CIRCLE_VALUE, 22, 58, 105, 9, 112, EnumC0170g.SDK_ASSET_ILLUSTRATION_PINWHEEL_LOGO_VALUE, EnumC0170g.SDK_ASSET_ICON_INCOME_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE, EnumC0170g.SDK_ASSET_ICON_CLEARED_REC_VALUE, 66, EnumC0170g.SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE, 40, 92, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_DEV_LOGS_VALUE};
    private static final long[] C0 = new long[256];
    private static final long[] C1 = new long[256];
    private static final long[] C2 = new long[256];
    private static final long[] C3 = new long[256];
    private static final long[] C4 = new long[256];
    private static final long[] C5 = new long[256];
    private static final long[] C6 = new long[256];
    private static final long[] C7 = new long[256];

    static {
        short[] sArr = new short[32];
        EIGHT = sArr;
        sArr[31] = 8;
        for (int i = 0; i < 256; i++) {
            int i2 = SBOX[i];
            int mulX = mulX(i2);
            int mulX2 = mulX(mulX);
            int i3 = mulX2 ^ i2;
            int mulX3 = mulX(mulX2);
            int i4 = mulX3 ^ i2;
            C0[i] = packIntoLong(i2, i2, mulX2, i2, mulX3, i3, mulX, i4);
            C1[i] = packIntoLong(i4, i2, i2, mulX2, i2, mulX3, i3, mulX);
            C2[i] = packIntoLong(mulX, i4, i2, i2, mulX2, i2, mulX3, i3);
            C3[i] = packIntoLong(i3, mulX, i4, i2, i2, mulX2, i2, mulX3);
            C4[i] = packIntoLong(mulX3, i3, mulX, i4, i2, i2, mulX2, i2);
            C5[i] = packIntoLong(i2, mulX3, i3, mulX, i4, i2, i2, mulX2);
            C6[i] = packIntoLong(mulX2, i2, mulX3, i3, mulX, i4, i2, i2);
            C7[i] = packIntoLong(i2, mulX2, i2, mulX3, i3, mulX, i4, i2);
        }
    }

    public WhirlpoolDigest(CryptoServicePurpose cryptoServicePurpose) {
        long[] jArr = new long[11];
        this._rc = jArr;
        this._buffer = new byte[64];
        this._bufferPos = 0;
        this._bitCount = new short[32];
        this._hash = new long[8];
        this._K = new long[8];
        this._L = new long[8];
        this._block = new long[8];
        this._state = new long[8];
        jArr[0] = 0;
        for (int i = 1; i <= 10; i++) {
            int i2 = (i - 1) * 8;
            this._rc[i] = (((((((C0[i2] & (-72057594037927936L)) ^ (C1[i2 + 1] & 71776119061217280L)) ^ (C2[i2 + 2] & 280375465082880L)) ^ (C3[i2 + 3] & 1095216660480L)) ^ (C4[i2 + 4] & 4278190080L)) ^ (C5[i2 + 5] & 16711680)) ^ (C6[i2 + 6] & 65280)) ^ (C7[i2 + 7] & 255);
        }
        this.purpose = cryptoServicePurpose;
        CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties(this, getDigestSize(), cryptoServicePurpose));
    }

    private byte[] copyBitLength() {
        byte[] bArr = new byte[32];
        for (int i = 0; i < 32; i++) {
            bArr[i] = (byte) (this._bitCount[i] & 255);
        }
        return bArr;
    }

    private void finish() {
        byte[] copyBitLength = copyBitLength();
        byte[] bArr = this._buffer;
        int i = this._bufferPos;
        bArr[i] = (byte) (bArr[i] | 128);
        int i2 = i + 1;
        this._bufferPos = i2;
        if (i2 == bArr.length) {
            processFilledBuffer(bArr, 0);
        }
        if (this._bufferPos > 32) {
            while (this._bufferPos != 0) {
                update((byte) 0);
            }
        }
        while (this._bufferPos <= 32) {
            update((byte) 0);
        }
        System.arraycopy(copyBitLength, 0, this._buffer, 32, copyBitLength.length);
        processFilledBuffer(this._buffer, 0);
    }

    private void increment() {
        int i = 0;
        for (int length = this._bitCount.length - 1; length >= 0; length--) {
            short[] sArr = this._bitCount;
            int i2 = (sArr[length] & 255) + EIGHT[length] + i;
            i = i2 >>> 8;
            sArr[length] = (short) (i2 & 255);
        }
    }

    private static int mulX(int i) {
        return ((-(i >>> 7)) & 285) ^ (i << 1);
    }

    private static long packIntoLong(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        return (((((((i2 << 48) ^ (i << 56)) ^ (i3 << 40)) ^ (i4 << 32)) ^ (i5 << 24)) ^ (i6 << 16)) ^ (i7 << 8)) ^ i8;
    }

    private void processFilledBuffer(byte[] bArr, int i) {
        Pack.bigEndianToLong(this._buffer, 0, this._block);
        processBlock();
        this._bufferPos = 0;
        Arrays.fill(this._buffer, (byte) 0);
    }

    @Override // org.bouncycastle.util.Memoable
    public Memoable copy() {
        return new WhirlpoolDigest(this);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        finish();
        Pack.longToBigEndian(this._hash, bArr, i);
        reset();
        return getDigestSize();
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "Whirlpool";
    }

    @Override // org.bouncycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return 64;
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 64;
    }

    public void processBlock() {
        long[] jArr;
        long[] jArr2;
        for (int i = 0; i < 8; i++) {
            long[] jArr3 = this._state;
            long j = this._block[i];
            long[] jArr4 = this._K;
            long j2 = this._hash[i];
            jArr4[i] = j2;
            jArr3[i] = j ^ j2;
        }
        for (int i2 = 1; i2 <= 10; i2++) {
            int i3 = 0;
            while (true) {
                jArr = this._L;
                if (i3 >= 8) {
                    break;
                }
                jArr[i3] = 0;
                long[] jArr5 = C0;
                long[] jArr6 = this._K;
                long j3 = jArr5[((int) (jArr6[i3 & 7] >>> 56)) & 255];
                jArr[i3] = j3;
                long j4 = C1[((int) (jArr6[(i3 - 1) & 7] >>> 48)) & 255] ^ j3;
                jArr[i3] = j4;
                long j5 = j4 ^ C2[((int) (jArr6[(i3 - 2) & 7] >>> 40)) & 255];
                jArr[i3] = j5;
                long j6 = j5 ^ C3[((int) (jArr6[(i3 - 3) & 7] >>> 32)) & 255];
                jArr[i3] = j6;
                long j7 = j6 ^ C4[((int) (jArr6[(i3 - 4) & 7] >>> 24)) & 255];
                jArr[i3] = j7;
                long j8 = j7 ^ C5[((int) (jArr6[(i3 - 5) & 7] >>> 16)) & 255];
                jArr[i3] = j8;
                long j9 = j8 ^ C6[((int) (jArr6[(i3 - 6) & 7] >>> 8)) & 255];
                jArr[i3] = j9;
                jArr[i3] = j9 ^ C7[((int) jArr6[(i3 - 7) & 7]) & 255];
                i3++;
            }
            long[] jArr7 = this._K;
            System.arraycopy(jArr, 0, jArr7, 0, jArr7.length);
            long[] jArr8 = this._K;
            jArr8[0] = jArr8[0] ^ this._rc[i2];
            int i4 = 0;
            while (true) {
                jArr2 = this._L;
                if (i4 < 8) {
                    long j10 = this._K[i4];
                    jArr2[i4] = j10;
                    long[] jArr9 = C0;
                    long[] jArr10 = this._state;
                    long j11 = j10 ^ jArr9[((int) (jArr10[i4 & 7] >>> 56)) & 255];
                    jArr2[i4] = j11;
                    long j12 = j11 ^ C1[((int) (jArr10[(i4 - 1) & 7] >>> 48)) & 255];
                    jArr2[i4] = j12;
                    long j13 = j12 ^ C2[((int) (jArr10[(i4 - 2) & 7] >>> 40)) & 255];
                    jArr2[i4] = j13;
                    long j14 = j13 ^ C3[((int) (jArr10[(i4 - 3) & 7] >>> 32)) & 255];
                    jArr2[i4] = j14;
                    long j15 = j14 ^ C4[((int) (jArr10[(i4 - 4) & 7] >>> 24)) & 255];
                    jArr2[i4] = j15;
                    long j16 = j15 ^ C5[((int) (jArr10[(i4 - 5) & 7] >>> 16)) & 255];
                    jArr2[i4] = j16;
                    long j17 = j16 ^ C6[((int) (jArr10[(i4 - 6) & 7] >>> 8)) & 255];
                    jArr2[i4] = j17;
                    jArr2[i4] = j17 ^ C7[((int) jArr10[(i4 - 7) & 7]) & 255];
                    i4++;
                }
            }
            long[] jArr11 = this._state;
            System.arraycopy(jArr2, 0, jArr11, 0, jArr11.length);
        }
        for (int i5 = 0; i5 < 8; i5++) {
            long[] jArr12 = this._hash;
            jArr12[i5] = jArr12[i5] ^ (this._state[i5] ^ this._block[i5]);
        }
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        WhirlpoolDigest whirlpoolDigest = (WhirlpoolDigest) memoable;
        long[] jArr = whirlpoolDigest._rc;
        long[] jArr2 = this._rc;
        System.arraycopy(jArr, 0, jArr2, 0, jArr2.length);
        byte[] bArr = whirlpoolDigest._buffer;
        byte[] bArr2 = this._buffer;
        System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
        this._bufferPos = whirlpoolDigest._bufferPos;
        short[] sArr = whirlpoolDigest._bitCount;
        short[] sArr2 = this._bitCount;
        System.arraycopy(sArr, 0, sArr2, 0, sArr2.length);
        long[] jArr3 = whirlpoolDigest._hash;
        long[] jArr4 = this._hash;
        System.arraycopy(jArr3, 0, jArr4, 0, jArr4.length);
        long[] jArr5 = whirlpoolDigest._K;
        long[] jArr6 = this._K;
        System.arraycopy(jArr5, 0, jArr6, 0, jArr6.length);
        long[] jArr7 = whirlpoolDigest._L;
        long[] jArr8 = this._L;
        System.arraycopy(jArr7, 0, jArr8, 0, jArr8.length);
        long[] jArr9 = whirlpoolDigest._block;
        long[] jArr10 = this._block;
        System.arraycopy(jArr9, 0, jArr10, 0, jArr10.length);
        long[] jArr11 = whirlpoolDigest._state;
        long[] jArr12 = this._state;
        System.arraycopy(jArr11, 0, jArr12, 0, jArr12.length);
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b) {
        byte[] bArr = this._buffer;
        int i = this._bufferPos;
        bArr[i] = b;
        int i2 = i + 1;
        this._bufferPos = i2;
        if (i2 == bArr.length) {
            processFilledBuffer(bArr, 0);
        }
        increment();
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i, int i2) {
        while (i2 > 0) {
            update(bArr[i]);
            i++;
            i2--;
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        this._bufferPos = 0;
        Arrays.fill(this._bitCount, (short) 0);
        Arrays.fill(this._buffer, (byte) 0);
        Arrays.fill(this._hash, 0L);
        Arrays.fill(this._K, 0L);
        Arrays.fill(this._L, 0L);
        Arrays.fill(this._block, 0L);
        Arrays.fill(this._state, 0L);
    }

    public WhirlpoolDigest() {
        this(CryptoServicePurpose.ANY);
    }

    public WhirlpoolDigest(WhirlpoolDigest whirlpoolDigest) {
        this._rc = new long[11];
        this._buffer = new byte[64];
        this._bufferPos = 0;
        this._bitCount = new short[32];
        this._hash = new long[8];
        this._K = new long[8];
        this._L = new long[8];
        this._block = new long[8];
        this._state = new long[8];
        CryptoServicePurpose cryptoServicePurpose = whirlpoolDigest.purpose;
        this.purpose = cryptoServicePurpose;
        reset(whirlpoolDigest);
        CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties(this, getDigestSize(), cryptoServicePurpose));
    }
}
