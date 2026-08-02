package org.brotli.dec;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.EnumC0170g;
import java.io.IOException;
import org.apache.commons.imaging.formats.pnm.PnmConstants;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes10.dex */
public abstract class Utils {
    public static final int[] LOOKUP = {0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 4, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8, 12, 16, 12, 12, 20, 12, 16, 24, 28, 12, 12, 32, 12, 36, 12, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 32, 32, 24, 40, 28, 12, 12, 48, 52, 52, 52, 48, 52, 52, 52, 48, 52, 52, 52, 52, 52, 48, 52, 52, 52, 52, 52, 48, 52, 52, 52, 52, 52, 24, 12, 28, 12, 12, 12, 56, 60, 60, 60, 56, 60, 60, 60, 56, 60, 60, 60, 60, 60, 56, 60, 60, 60, 60, 60, 56, 60, 60, 60, 60, 60, 24, 12, 28, 12, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 0, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 
    40, 40, 40, 40, 40, 40, 40, 40, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 56, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 8, 9, 9, 9, 9, 10, 10, 10, 10, 11, 11, 11, 11, 12, 12, 12, 12, 13, 13, 13, 13, 14, 14, 14, 14, 15, 15, 15, 15, 16, 16, 16, 16, 17, 17, 17, 17, 18, 18, 18, 18, 19, 19, 19, 19, 20, 20, 20, 20, 21, 21, 21, 21, 22, 22, 22, 22, 23, 23, 23, 23, 24, 24, 24, 24, 25, 25, 25, 25, 26, 26, 26, 26, 27, 27, 27, 27, 28, 28, 28, 28, 29, 29, 29, 29, 30, 30, 30, 30, 31, 31, 31, 31, 32, 32, 32, 32, 33, 33, 33, 33, 34, 34, 34, 34, 35, 35, 35, 35, 36, 36, 36, 36, 37, 37, 37, 37, 38, 38, 38, 38, 39, 39, 39, 39, 40, 40, 40, 40, 41, 41, 41, 41, 42, 42, 42, 42, 43, 43, 43, 43, 44, 44, 44, 44, 45, 45, 45, 45, 46, 46, 46, 46, 47, 47, 47, 47, 48, 48, 48, 48, 49, 49, 49, 49, 50, 50, 50, 50, 51, 51, 51, 51, 52, 52, 52, 52, 53, 53, 53, 53, 54, 54, 54, 54, 55, 55, 55, 55, 56, 56, 56, 56, 57, 57, 57, 57, 58, 58, 58, 58, 59, 59, 59, 59, 60, 60, 60, 60, 61, 61, 61, 61, 62, 62, 62, 62, 63, 63, 63, 63, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    public static final int[] LOOKUP_OFFSETS = {1024, 1536, 1280, 1536, 0, 256, 768, 512};
    public static final int[] CODE_LENGTH_CODE_ORDER = {1, 2, 3, 4, 0, 5, 17, 6, 16, 7, 8, 9, 10, 11, 12, 13, 14, 15};
    public static final int[] DISTANCE_SHORT_CODE_INDEX_OFFSET = {3, 2, 1, 0, 3, 3, 3, 3, 3, 3, 2, 2, 2, 2, 2, 2};
    public static final int[] DISTANCE_SHORT_CODE_VALUE_OFFSET = {0, 0, 0, 0, -1, 1, -2, 2, -3, 3, -1, 1, -2, 2, -3, 3};
    public static final int[] FIXED_TABLE = {PKIFailureInfo.unsupportedVersion, 131076, 131075, 196610, PKIFailureInfo.unsupportedVersion, 131076, 131075, 262145, PKIFailureInfo.unsupportedVersion, 131076, 131075, 196610, PKIFailureInfo.unsupportedVersion, 131076, 131075, 262149};
    public static final int[] OFFSETS_BY_LENGTH = {0, 0, 0, 0, 0, 4096, 9216, 21504, 35840, 44032, 53248, 63488, 74752, 87040, 93696, 100864, 104704, 106752, 108928, 113536, 115968, 118528, 119872, 121280, 122016};
    public static final int[] SIZE_BITS_BY_LENGTH = {0, 0, 0, 0, 10, 10, 11, 11, 10, 10, 10, 10, 10, 9, 9, 8, 7, 7, 8, 7, 7, 6, 6, 5, 5};
    public static final int[] BLOCK_LENGTH_OFFSET = {1, 5, 9, 13, 17, 25, 33, 41, 49, 65, 81, 97, 113, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE, EnumC0170g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE, EnumC0170g.SDK_ASSET_ICON_INCOMPLETE_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_VALUE, EnumC0170g.SDK_ASSET_ICON_INLINE_LIGHTNING_DARK_APPEARANCE_VALUE, 369, 497, 753, 1265, 2289, 4337, 8433, 16625};
    public static final int[] BLOCK_LENGTH_N_BITS = {2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 7, 8, 9, 10, 11, 12, 13, 24};
    public static final int[] INSERT_LENGTH_OFFSET = {0, 1, 2, 3, 4, 5, 6, 8, 10, 14, 18, 26, 34, 50, 66, 98, EnumC0170g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE, EnumC0170g.SDK_ASSET_ICON_EXTERNAL_VALUE, EnumC0170g.SDK_ASSET_PLAID_PROFILE_CIRCLE_VALUE, 578, 1090, 2114, 6210, 22594};
    public static final int[] INSERT_LENGTH_N_BITS = {0, 0, 0, 0, 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 7, 8, 9, 10, 12, 14, 24};
    public static final int[] COPY_LENGTH_OFFSET = {2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 14, 18, 22, 30, 38, 54, 70, 102, EnumC0170g.SDK_ASSET_ILLUSTRATION_DEV_LOGS_VALUE, EnumC0170g.SDK_ASSET_ICON_ARROW_UP_VALUE, EnumC0170g.SDK_ASSET_ICON_STEP_COMPLETE_VALUE, 582, 1094, 2118};
    public static final int[] COPY_LENGTH_N_BITS = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 7, 8, 9, 10, 24};
    public static final int[] INSERT_RANGE_LUT = {0, 0, 8, 8, 0, 16, 8, 16, 16};
    public static final int[] COPY_RANGE_LUT = {0, 8, 0, 8, 16, 0, 16, 8, 16};
    public static final byte[] BYTE_ZEROES = new byte[1024];
    public static final int[] INT_ZEROES = new int[1024];

    public static void buildHuffmanTable(int i, int[] iArr, int i2, int i3, int[] iArr2) {
        int i4;
        int i5;
        int i6;
        int[] iArr3 = new int[i3];
        int[] iArr4 = new int[16];
        int[] iArr5 = new int[16];
        int i7 = 0;
        for (int i8 = 0; i8 < i3; i8++) {
            int i9 = iArr2[i8];
            iArr4[i9] = iArr4[i9] + 1;
        }
        iArr5[1] = 0;
        int i10 = 1;
        while (i10 < 15) {
            int i11 = i10 + 1;
            iArr5[i11] = iArr5[i10] + iArr4[i10];
            i10 = i11;
        }
        for (int i12 = 0; i12 < i3; i12++) {
            int i13 = iArr2[i12];
            if (i13 != 0) {
                int i14 = iArr5[i13];
                iArr5[i13] = i14 + 1;
                iArr3[i14] = i12;
            }
        }
        int i15 = 1 << i2;
        if (iArr5[15] == 1) {
            for (int i16 = 0; i16 < i15; i16++) {
                iArr[i + i16] = iArr3[0];
            }
            return;
        }
        int i17 = 2;
        int i18 = 2;
        int i19 = 0;
        int i20 = 1;
        while (i20 <= i2) {
            while (iArr4[i20] > 0) {
                int i21 = i + i7;
                int i22 = i19 + 1;
                int i23 = (i20 << 16) | iArr3[i19];
                int i24 = i15;
                do {
                    i24 -= i18;
                    iArr[i21 + i24] = i23;
                } while (i24 > 0);
                int i25 = 1 << (i20 - 1);
                while ((i7 & i25) != 0) {
                    i25 >>= 1;
                }
                i7 = (i7 & (i25 - 1)) + i25;
                iArr4[i20] = iArr4[i20] - 1;
                i19 = i22;
            }
            i20++;
            i18 <<= 1;
        }
        int i26 = i15 - 1;
        int i27 = i2 + 1;
        int i28 = -1;
        int i29 = i;
        while (i27 <= 15) {
            while (iArr4[i27] > 0) {
                int i30 = i7 & i26;
                if (i30 != i28) {
                    int i31 = i29 + i15;
                    int i32 = 1 << (i27 - i2);
                    int i33 = i27;
                    while (i33 < 15) {
                        int i34 = i32 - iArr4[i33];
                        if (i34 <= 0) {
                            break;
                        }
                        i33++;
                        i32 = i34 << 1;
                    }
                    int i35 = i33 - i2;
                    iArr[i + i30] = ((i35 + i2) << 16) | ((i31 - i) - i30);
                    i4 = i30;
                    i6 = i31;
                    i5 = 1 << i35;
                } else {
                    i4 = i28;
                    i5 = i15;
                    i6 = i29;
                }
                int i36 = i6 + (i7 >> i2);
                int i37 = i19 + 1;
                int i38 = ((i27 - i2) << 16) | iArr3[i19];
                int i39 = i5;
                do {
                    i39 -= i17;
                    iArr[i36 + i39] = i38;
                } while (i39 > 0);
                int i40 = 1 << (i27 - 1);
                while ((i7 & i40) != 0) {
                    i40 >>= 1;
                }
                i7 = (i7 & (i40 - 1)) + i40;
                iArr4[i27] = iArr4[i27] - 1;
                i15 = i5;
                i29 = i6;
                i28 = i4;
                i19 = i37;
            }
            i27++;
            i17 <<= 1;
        }
    }

    public static void decodeBlockTypeAndLength(State state, int i) {
        BitReader bitReader = state.br;
        int[] iArr = state.blockTypeRb;
        int i2 = i * 2;
        BitReader.fillBitWindow(bitReader);
        int i3 = i * 1080;
        int readSymbol = readSymbol(state.blockTypeTrees, i3, bitReader);
        int[] iArr2 = state.blockLength;
        int[] iArr3 = state.blockLenTrees;
        BitReader.fillBitWindow(bitReader);
        int readSymbol2 = readSymbol(iArr3, i3, bitReader);
        iArr2[i] = BitReader.readBits(bitReader, BLOCK_LENGTH_N_BITS[readSymbol2]) + BLOCK_LENGTH_OFFSET[readSymbol2];
        int i4 = readSymbol == 1 ? iArr[i2 + 1] + 1 : readSymbol == 0 ? iArr[i2] : readSymbol - 2;
        int i5 = state.numBlockTypes[i];
        if (i4 >= i5) {
            i4 -= i5;
        }
        int i6 = i2 + 1;
        iArr[i2] = iArr[i6];
        iArr[i6] = i4;
    }

    public static int decodeContextMap(int i, byte[] bArr, BitReader bitReader) {
        int i2;
        BitReader.readMoreInput(bitReader);
        if (BitReader.readBits(bitReader, 1) != 0) {
            int readBits = BitReader.readBits(bitReader, 3);
            i2 = readBits == 0 ? 1 : BitReader.readBits(bitReader, readBits) + (1 << readBits);
        } else {
            i2 = 0;
        }
        int i3 = i2 + 1;
        if (i3 == 1) {
            int i4 = 0;
            while (i4 < i) {
                int min = Math.min(i4 + 1024, i) - i4;
                System.arraycopy(BYTE_ZEROES, 0, bArr, i4, min);
                i4 += min;
            }
        } else {
            int readBits2 = BitReader.readBits(bitReader, 1) == 1 ? BitReader.readBits(bitReader, 4) + 1 : 0;
            int[] iArr = new int[1080];
            readHuffmanCode(i3 + readBits2, iArr, 0, bitReader);
            int i5 = 0;
            while (i5 < i) {
                BitReader.readMoreInput(bitReader);
                BitReader.fillBitWindow(bitReader);
                int readSymbol = readSymbol(iArr, 0, bitReader);
                if (readSymbol == 0) {
                    bArr[i5] = 0;
                } else if (readSymbol <= readBits2) {
                    for (int readBits3 = BitReader.readBits(bitReader, readSymbol) + (1 << readSymbol); readBits3 != 0; readBits3--) {
                        if (i5 >= i) {
                            State$$ExternalSyntheticBUOutline0.m("Corrupted context map");
                            return 0;
                        }
                        bArr[i5] = 0;
                        i5++;
                    }
                } else {
                    bArr[i5] = (byte) (readSymbol - readBits2);
                }
                i5++;
            }
            if (BitReader.readBits(bitReader, 1) == 1) {
                int[] iArr2 = new int[256];
                for (int i6 = 0; i6 < 256; i6++) {
                    iArr2[i6] = i6;
                }
                for (int i7 = 0; i7 < i; i7++) {
                    int i8 = bArr[i7] & 255;
                    int i9 = iArr2[i8];
                    bArr[i7] = (byte) i9;
                    if (i8 != 0) {
                        while (i8 > 0) {
                            iArr2[i8] = iArr2[i8 - 1];
                            i8--;
                        }
                        iArr2[0] = i9;
                    }
                }
            }
        }
        return i3;
    }

    public static void decodeLiteralBlockSwitch(State state) {
        decodeBlockTypeAndLength(state, 0);
        int i = state.blockTypeRb[1];
        int i2 = i << 6;
        state.contextMapSlice = i2;
        state.literalTree = ((int[]) state.hGroup0.trees)[state.contextMap[i2] & 255];
        byte b = state.contextModes[i];
        int[] iArr = LOOKUP_OFFSETS;
        state.contextLookupOffset1 = iArr[b];
        state.contextLookupOffset2 = iArr[b + 1];
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x0149, code lost:
    
        org.brotli.dec.State$$ExternalSyntheticBUOutline0.m("Invalid backward reference");
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x014c, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0603 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0435 A[LOOP:7: B:108:0x0435->B:115:0x047e, LOOP_START, PHI: r8
      0x0435: PHI (r8v113 char) = (r8v70 char), (r8v121 char) binds: [B:107:0x0433, B:115:0x047e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x063a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x060b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void decompress(State state) {
        byte[] bArr;
        int i;
        int i2;
        int i3;
        char c;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11 = state.runningState;
        int[] iArr = state.blockTypeRb;
        HuffmanTreeGroup huffmanTreeGroup = state.hGroup2;
        HuffmanTreeGroup huffmanTreeGroup2 = state.hGroup0;
        HuffmanTreeGroup huffmanTreeGroup3 = state.hGroup1;
        BitReader bitReader = state.br;
        int[] iArr2 = state.blockLength;
        if (i11 == 0) {
            a$$ExternalSyntheticBUOutline0.m$1("Can't decompress until initialized");
            return;
        }
        if (i11 == 11) {
            a$$ExternalSyntheticBUOutline0.m$1("Can't decompress after close");
            return;
        }
        int i12 = 1;
        int i13 = state.ringBufferSize - 1;
        byte[] bArr2 = state.ringBuffer;
        while (true) {
            int i14 = state.runningState;
            int i15 = i12;
            if (i14 == 10) {
                if (i14 == 10) {
                    if (state.metaBlockLength < 0) {
                        State$$ExternalSyntheticBUOutline0.m("Invalid metablock length");
                        return;
                    }
                    int i16 = (64 - bitReader.bitOffset) & 7;
                    if (i16 == 0 || BitReader.readBits(bitReader, i16) == 0) {
                        BitReader.checkHealth(bitReader, true);
                        return;
                    } else {
                        State$$ExternalSyntheticBUOutline0.m("Corrupted padding bits");
                        return;
                    }
                }
                return;
            }
            if (i14 != 12) {
                switch (i14) {
                    case 1:
                        if (state.metaBlockLength < 0) {
                            State$$ExternalSyntheticBUOutline0.m("Invalid metablock length");
                            return;
                        }
                        if (state.inputEnd) {
                            state.nextRunningState = 10;
                            state.bytesToWrite = state.pos;
                            state.bytesWritten = 0;
                            state.runningState = 12;
                        } else {
                            huffmanTreeGroup2.codes = null;
                            huffmanTreeGroup2.trees = null;
                            huffmanTreeGroup3.codes = null;
                            huffmanTreeGroup3.trees = null;
                            huffmanTreeGroup.codes = null;
                            huffmanTreeGroup.trees = null;
                            BitReader.readMoreInput(bitReader);
                            boolean z = BitReader.readBits(bitReader, 1) == 1;
                            state.inputEnd = z;
                            state.metaBlockLength = 0;
                            state.isUncompressed = false;
                            state.isMetadata = false;
                            if (!z || BitReader.readBits(bitReader, 1) == 0) {
                                int readBits = BitReader.readBits(bitReader, 2) + 4;
                                if (readBits == 7) {
                                    state.isMetadata = true;
                                    if (BitReader.readBits(bitReader, 1) != 0) {
                                        State$$ExternalSyntheticBUOutline0.m("Corrupted reserved bit");
                                        return;
                                    }
                                    int readBits2 = BitReader.readBits(bitReader, 2);
                                    if (readBits2 != 0) {
                                        for (int i17 = 0; i17 < readBits2; i17++) {
                                            int readBits3 = BitReader.readBits(bitReader, 8);
                                            if (readBits3 == 0 && i17 + 1 == readBits2 && readBits2 > 1) {
                                                State$$ExternalSyntheticBUOutline0.m("Exuberant nibble");
                                                return;
                                            }
                                            state.metaBlockLength = (readBits3 << (i17 * 8)) | state.metaBlockLength;
                                        }
                                    }
                                } else {
                                    for (int i18 = 0; i18 < readBits; i18++) {
                                        int readBits4 = BitReader.readBits(bitReader, 4);
                                        if (readBits4 == 0 && i18 + 1 == readBits && readBits > 4) {
                                            State$$ExternalSyntheticBUOutline0.m("Exuberant nibble");
                                            return;
                                        }
                                        state.metaBlockLength = (readBits4 << (i18 * 4)) | state.metaBlockLength;
                                    }
                                }
                                state.metaBlockLength++;
                                if (!state.inputEnd) {
                                    state.isUncompressed = BitReader.readBits(bitReader, 1) == 1;
                                }
                            }
                            if (state.metaBlockLength != 0 || state.isMetadata) {
                                if (state.isUncompressed || state.isMetadata) {
                                    int i19 = (64 - bitReader.bitOffset) & 7;
                                    if (i19 != 0 && BitReader.readBits(bitReader, i19) != 0) {
                                        State$$ExternalSyntheticBUOutline0.m("Corrupted padding bits");
                                        return;
                                    }
                                    state.runningState = state.isMetadata ? 4 : 5;
                                } else {
                                    state.runningState = 2;
                                }
                                if (!state.isMetadata) {
                                    long j = state.expectedTotalSize + state.metaBlockLength;
                                    state.expectedTotalSize = j;
                                    int i20 = state.ringBufferSize;
                                    int i21 = state.maxRingBufferSize;
                                    if (i20 < i21) {
                                        if (i21 > j) {
                                            int length = ((int) j) + state.customDictionary.length;
                                            while (true) {
                                                int i22 = i21 >> 1;
                                                if (i22 > length) {
                                                    i21 = i22;
                                                } else if (!state.inputEnd && i21 < 16384 && state.maxRingBufferSize >= 16384) {
                                                    i21 = 16384;
                                                }
                                            }
                                        }
                                        int i23 = state.ringBufferSize;
                                        if (i21 > i23) {
                                            byte[] bArr3 = new byte[i21 + 37];
                                            byte[] bArr4 = state.ringBuffer;
                                            if (bArr4 != null) {
                                                System.arraycopy(bArr4, 0, bArr3, 0, i23);
                                            } else {
                                                byte[] bArr5 = state.customDictionary;
                                                if (bArr5.length != 0) {
                                                    int length2 = bArr5.length;
                                                    int i24 = state.maxBackwardDistance;
                                                    if (length2 > i24) {
                                                        int i25 = length2 - i24;
                                                        length2 = i24;
                                                        i = i25;
                                                    } else {
                                                        i = 0;
                                                    }
                                                    System.arraycopy(bArr5, i, bArr3, 0, length2);
                                                    state.pos = length2;
                                                    state.bytesToIgnore = length2;
                                                }
                                            }
                                            state.ringBuffer = bArr3;
                                            state.ringBufferSize = i21;
                                        }
                                    }
                                }
                            }
                        }
                        i13 = state.ringBufferSize - 1;
                        bArr2 = state.ringBuffer;
                        i12 = 1;
                        break;
                    case 2:
                        bArr = bArr2;
                        int i26 = i15;
                        int[] iArr3 = state.blockLenTrees;
                        int[] iArr4 = state.numBlockTypes;
                        int i27 = 0;
                        while (i27 < 3) {
                            if (BitReader.readBits(bitReader, i26) != 0) {
                                int readBits5 = BitReader.readBits(bitReader, 3);
                                i3 = readBits5 == 0 ? i26 : BitReader.readBits(bitReader, readBits5) + (i26 << readBits5);
                            } else {
                                i3 = 0;
                            }
                            iArr4[i27] = i3 + 1;
                            iArr2[i27] = 268435456;
                            int i28 = iArr4[i27];
                            if (i28 > i26) {
                                int i29 = i27 * 1080;
                                readHuffmanCode(i28 + 2, state.blockTypeTrees, i29, bitReader);
                                readHuffmanCode(26, iArr3, i29, bitReader);
                                BitReader.fillBitWindow(bitReader);
                                int readSymbol = readSymbol(iArr3, i29, bitReader);
                                iArr2[i27] = BitReader.readBits(bitReader, BLOCK_LENGTH_N_BITS[readSymbol]) + BLOCK_LENGTH_OFFSET[readSymbol];
                            }
                            i27++;
                            i26 = 1;
                        }
                        BitReader.readMoreInput(bitReader);
                        state.distancePostfixBits = BitReader.readBits(bitReader, 2);
                        int readBits6 = BitReader.readBits(bitReader, 4);
                        int i30 = state.distancePostfixBits;
                        int i31 = (readBits6 << i30) + 16;
                        state.numDirectDistanceCodes = i31;
                        state.distancePostfixMask = (1 << i30) - 1;
                        int i32 = i31 + (48 << i30);
                        char c2 = 0;
                        state.contextModes = new byte[iArr4[0]];
                        int i33 = 0;
                        while (true) {
                            int i34 = iArr4[c2];
                            if (i33 < i34) {
                                int min = Math.min(i33 + 96, i34);
                                while (i33 < min) {
                                    state.contextModes[i33] = (byte) (BitReader.readBits(bitReader, 2) << 1);
                                    i33++;
                                }
                                BitReader.readMoreInput(bitReader);
                                c2 = 0;
                            } else {
                                int i35 = i34 << 6;
                                byte[] bArr6 = new byte[i35];
                                state.contextMap = bArr6;
                                int decodeContextMap = decodeContextMap(i35, bArr6, bitReader);
                                state.trivialLiteralContext = true;
                                int i36 = 0;
                                while (true) {
                                    if (i36 < (iArr4[0] << 6)) {
                                        if (state.contextMap[i36] != (i36 >> 6)) {
                                            state.trivialLiteralContext = false;
                                        } else {
                                            i36++;
                                        }
                                    }
                                }
                                int i37 = iArr4[2] << 2;
                                byte[] bArr7 = new byte[i37];
                                state.distContextMap = bArr7;
                                int decodeContextMap2 = decodeContextMap(i37, bArr7, bitReader);
                                huffmanTreeGroup2.alphabetSize = 256;
                                huffmanTreeGroup2.codes = new int[decodeContextMap * 1080];
                                huffmanTreeGroup2.trees = new int[decodeContextMap];
                                int i38 = iArr4[1];
                                huffmanTreeGroup3.alphabetSize = 704;
                                huffmanTreeGroup3.codes = new int[i38 * 1080];
                                huffmanTreeGroup3.trees = new int[i38];
                                huffmanTreeGroup.alphabetSize = i32;
                                huffmanTreeGroup.codes = new int[decodeContextMap2 * 1080];
                                huffmanTreeGroup.trees = new int[decodeContextMap2];
                                HuffmanTreeGroup.decode(huffmanTreeGroup2, bitReader);
                                HuffmanTreeGroup.decode(huffmanTreeGroup3, bitReader);
                                HuffmanTreeGroup.decode(huffmanTreeGroup, bitReader);
                                state.contextMapSlice = 0;
                                state.distContextMapSlice = 0;
                                byte b = state.contextModes[0];
                                int[] iArr5 = LOOKUP_OFFSETS;
                                state.contextLookupOffset1 = iArr5[b];
                                i2 = 1;
                                state.contextLookupOffset2 = iArr5[b + 1];
                                state.literalTree = ((int[]) huffmanTreeGroup2.trees)[0];
                                state.treeCommandOffset = ((int[]) huffmanTreeGroup3.trees)[0];
                                iArr[4] = 1;
                                iArr[2] = 1;
                                iArr[0] = 1;
                                iArr[5] = 0;
                                iArr[3] = 0;
                                iArr[1] = 0;
                                state.runningState = 3;
                                if (state.metaBlockLength > 0) {
                                    state.runningState = i2;
                                    break;
                                } else {
                                    BitReader.readMoreInput(bitReader);
                                    if (iArr2[i2] == 0) {
                                        decodeBlockTypeAndLength(state, i2);
                                        state.treeCommandOffset = ((int[]) huffmanTreeGroup3.trees)[iArr[3]];
                                    }
                                    iArr2[i2] = iArr2[i2] - i2;
                                    BitReader.fillBitWindow(bitReader);
                                    int readSymbol2 = readSymbol((int[]) huffmanTreeGroup3.codes, state.treeCommandOffset, bitReader);
                                    int i39 = readSymbol2 >>> 6;
                                    state.distanceCode = 0;
                                    if (i39 >= 2) {
                                        i39 -= 2;
                                        state.distanceCode = -1;
                                    }
                                    int i40 = INSERT_RANGE_LUT[i39] + ((readSymbol2 >>> 3) & 7);
                                    int i41 = COPY_RANGE_LUT[i39] + (readSymbol2 & 7);
                                    state.insertLength = BitReader.readBits(bitReader, INSERT_LENGTH_N_BITS[i40]) + INSERT_LENGTH_OFFSET[i40];
                                    state.copyLength = BitReader.readBits(bitReader, COPY_LENGTH_N_BITS[i41]) + COPY_LENGTH_OFFSET[i41];
                                    c = 0;
                                    state.j = 0;
                                    state.runningState = 6;
                                    if (state.trivialLiteralContext) {
                                        int i42 = state.pos;
                                        int i43 = bArr[(i42 - 1) & i13] & 255;
                                        int i44 = bArr[(i42 - 2) & i13] & 255;
                                        while (state.j < state.insertLength) {
                                            BitReader.readMoreInput(bitReader);
                                            if (iArr2[0] == 0) {
                                                decodeLiteralBlockSwitch(state);
                                            }
                                            byte[] bArr8 = state.contextMap;
                                            int i45 = state.contextMapSlice;
                                            int i46 = state.contextLookupOffset1 + i43;
                                            int[] iArr6 = LOOKUP;
                                            int i47 = bArr8[i45 + (iArr6[state.contextLookupOffset2 + i44] | iArr6[i46])] & 255;
                                            iArr2[0] = iArr2[0] - 1;
                                            BitReader.fillBitWindow(bitReader);
                                            int readSymbol3 = readSymbol((int[]) huffmanTreeGroup2.codes, ((int[]) huffmanTreeGroup2.trees)[i47], bitReader);
                                            int i48 = state.pos;
                                            bArr[i48] = (byte) readSymbol3;
                                            state.j++;
                                            state.pos = i48 + 1;
                                            if (i48 == i13) {
                                                i4 = 6;
                                                state.nextRunningState = 6;
                                                state.bytesToWrite = state.ringBufferSize;
                                                state.bytesWritten = 0;
                                                state.runningState = 12;
                                                if (state.runningState == i4) {
                                                    int i49 = state.metaBlockLength - state.insertLength;
                                                    state.metaBlockLength = i49;
                                                    if (i49 <= 0) {
                                                        state.runningState = 3;
                                                        break;
                                                    } else {
                                                        if (state.distanceCode < 0) {
                                                            BitReader.readMoreInput(bitReader);
                                                            if (iArr2[2] == 0) {
                                                                decodeBlockTypeAndLength(state, 2);
                                                                state.distContextMapSlice = iArr[5] << 2;
                                                            }
                                                            iArr2[2] = iArr2[2] - 1;
                                                            BitReader.fillBitWindow(bitReader);
                                                            int[] iArr7 = (int[]) huffmanTreeGroup.codes;
                                                            int[] iArr8 = (int[]) huffmanTreeGroup.trees;
                                                            byte[] bArr9 = state.distContextMap;
                                                            int i50 = state.distContextMapSlice;
                                                            int i51 = state.copyLength;
                                                            int readSymbol4 = readSymbol(iArr7, iArr8[bArr9[i50 + (i51 > 4 ? 3 : i51 - 2)] & 255], bitReader);
                                                            state.distanceCode = readSymbol4;
                                                            int i52 = state.numDirectDistanceCodes;
                                                            if (readSymbol4 >= i52) {
                                                                int i53 = readSymbol4 - i52;
                                                                int i54 = state.distancePostfixMask & i53;
                                                                int i55 = i53 >>> state.distancePostfixBits;
                                                                state.distanceCode = i55;
                                                                int i56 = (i55 >>> 1) + 1;
                                                                state.distanceCode = i52 + i54 + ((BitReader.readBits(bitReader, i56) + ((((i55 & 1) + 2) << i56) - 4)) << state.distancePostfixBits);
                                                            }
                                                        }
                                                        int i57 = state.distanceCode;
                                                        int[] iArr9 = state.distRb;
                                                        int i58 = state.distRbIdx;
                                                        int i59 = i57 < 16 ? iArr9[(DISTANCE_SHORT_CODE_INDEX_OFFSET[i57] + i58) & 3] + DISTANCE_SHORT_CODE_VALUE_OFFSET[i57] : i57 - 15;
                                                        state.distance = i59;
                                                        if (i59 < 0) {
                                                            State$$ExternalSyntheticBUOutline0.m("Negative distance");
                                                            return;
                                                        }
                                                        int i60 = state.maxDistance;
                                                        int i61 = state.maxBackwardDistance;
                                                        if (i60 == i61 || (i5 = state.pos) >= i61) {
                                                            state.maxDistance = i61;
                                                        } else {
                                                            state.maxDistance = i5;
                                                        }
                                                        state.copyDst = state.pos;
                                                        if (i59 > state.maxDistance) {
                                                            state.runningState = 9;
                                                            break;
                                                        } else {
                                                            if (i57 > 0) {
                                                                iArr9[i58 & 3] = i59;
                                                                state.distRbIdx = i58 + 1;
                                                            }
                                                            if (state.copyLength > state.metaBlockLength) {
                                                                State$$ExternalSyntheticBUOutline0.m("Invalid backward reference");
                                                                return;
                                                            }
                                                            state.j = 0;
                                                            state.runningState = 7;
                                                            int i62 = state.pos;
                                                            i6 = (i62 - state.distance) & i13;
                                                            i7 = state.copyLength - state.j;
                                                            if (i6 + i7 < i13 || i62 + i7 >= i13) {
                                                                do {
                                                                    i8 = state.j;
                                                                    if (i8 >= state.copyLength) {
                                                                        i9 = state.pos;
                                                                        bArr[i9] = bArr[(i9 - state.distance) & i13];
                                                                        state.metaBlockLength--;
                                                                        state.j = i8 + 1;
                                                                        state.pos = i9 + 1;
                                                                    }
                                                                } while (i9 != i13);
                                                                i10 = 7;
                                                                state.nextRunningState = 7;
                                                                state.bytesToWrite = state.ringBufferSize;
                                                                state.bytesWritten = 0;
                                                                state.runningState = 12;
                                                                if (state.runningState == i10) {
                                                                    state.runningState = 3;
                                                                    break;
                                                                }
                                                            } else {
                                                                int i63 = 0;
                                                                while (i63 < i7) {
                                                                    bArr[i62] = bArr[i6];
                                                                    i63++;
                                                                    i62++;
                                                                    i6++;
                                                                }
                                                                state.j += i7;
                                                                state.metaBlockLength -= i7;
                                                                state.pos += i7;
                                                            }
                                                            i10 = 7;
                                                            if (state.runningState == i10) {
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                int i64 = i43;
                                                i43 = readSymbol3;
                                                i44 = i64;
                                            }
                                        }
                                    } else {
                                        while (true) {
                                            if (state.j < state.insertLength) {
                                                BitReader.readMoreInput(bitReader);
                                                if (iArr2[c] == 0) {
                                                    decodeLiteralBlockSwitch(state);
                                                }
                                                iArr2[c] = iArr2[c] - 1;
                                                BitReader.fillBitWindow(bitReader);
                                                bArr[state.pos] = (byte) readSymbol((int[]) huffmanTreeGroup2.codes, state.literalTree, bitReader);
                                                state.j++;
                                                int i65 = state.pos;
                                                state.pos = i65 + 1;
                                                if (i65 == i13) {
                                                    state.nextRunningState = 6;
                                                    state.bytesToWrite = state.ringBufferSize;
                                                    state.bytesWritten = 0;
                                                    state.runningState = 12;
                                                } else {
                                                    c = 0;
                                                }
                                            }
                                        }
                                    }
                                    i4 = 6;
                                    if (state.runningState == i4) {
                                    }
                                }
                            }
                        }
                        break;
                    case 3:
                        bArr = bArr2;
                        i2 = i15;
                        if (state.metaBlockLength > 0) {
                        }
                        break;
                    case 4:
                        bArr = bArr2;
                        while (state.metaBlockLength > 0) {
                            BitReader.readMoreInput(bitReader);
                            BitReader.readBits(bitReader, 8);
                            state.metaBlockLength--;
                        }
                        state.runningState = 1;
                        break;
                    case 5:
                        byte[] bArr10 = state.ringBuffer;
                        int i66 = state.metaBlockLength;
                        if (i66 > 0) {
                            int min2 = Math.min(state.ringBufferSize - state.pos, i66);
                            int i67 = state.pos;
                            if ((bitReader.bitOffset & 7) != 0) {
                                State$$ExternalSyntheticBUOutline0.m("Unaligned copyBytes");
                                return;
                            }
                            int i68 = min2;
                            while (true) {
                                int i69 = bitReader.bitOffset;
                                if (i69 != 64 && i68 != 0) {
                                    bArr10[i67] = (byte) (bitReader.accumulator >>> i69);
                                    bitReader.bitOffset = i69 + 8;
                                    i68--;
                                    i67++;
                                    bArr2 = bArr2;
                                }
                            }
                            bArr = bArr2;
                            if (i68 != 0) {
                                int min3 = Math.min(BitReader.intAvailable(bitReader), i68 >> 2);
                                if (min3 > 0) {
                                    int i70 = min3 << 2;
                                    System.arraycopy(bitReader.byteBuffer, bitReader.intOffset << 2, bArr10, i67, i70);
                                    i67 += i70;
                                    i68 -= i70;
                                    bitReader.intOffset += min3;
                                }
                                if (i68 != 0) {
                                    if (BitReader.intAvailable(bitReader) > 0) {
                                        BitReader.fillBitWindow(bitReader);
                                        while (i68 != 0) {
                                            long j2 = bitReader.accumulator;
                                            int i71 = bitReader.bitOffset;
                                            bArr10[i67] = (byte) (j2 >>> i71);
                                            bitReader.bitOffset = i71 + 8;
                                            i68--;
                                            i67++;
                                        }
                                        BitReader.checkHealth(bitReader, false);
                                    } else {
                                        while (i68 > 0) {
                                            try {
                                                int read = bitReader.input.read(bArr10, i67, i68);
                                                if (read == -1) {
                                                    throw new BrotliRuntimeException("Unexpected end of input");
                                                }
                                                i67 += read;
                                                i68 -= read;
                                            } catch (IOException e) {
                                                throw new BrotliRuntimeException("Failed to read input", e);
                                            }
                                        }
                                    }
                                }
                            }
                            state.metaBlockLength -= min2;
                            int i72 = state.pos + min2;
                            state.pos = i72;
                            int i73 = state.ringBufferSize;
                            if (i72 == i73) {
                                state.nextRunningState = 5;
                                state.bytesToWrite = i73;
                                state.bytesWritten = 0;
                                state.runningState = 12;
                                break;
                            } else {
                                if (bitReader.bitOffset == 64) {
                                    BitReader.readMoreInput(bitReader);
                                    BitReader.checkHealth(bitReader, false);
                                    BitReader.fillBitWindow(bitReader);
                                    BitReader.fillBitWindow(bitReader);
                                }
                                state.runningState = 1;
                                break;
                            }
                        } else {
                            if (bitReader.bitOffset == 64) {
                                BitReader.readMoreInput(bitReader);
                                BitReader.checkHealth(bitReader, false);
                                BitReader.fillBitWindow(bitReader);
                                BitReader.fillBitWindow(bitReader);
                            }
                            state.runningState = i15;
                            bArr = bArr2;
                            break;
                        }
                        break;
                    case 6:
                        bArr = bArr2;
                        c = 0;
                        if (state.trivialLiteralContext) {
                        }
                        i4 = 6;
                        if (state.runningState == i4) {
                        }
                        break;
                    case 7:
                        bArr = bArr2;
                        int i622 = state.pos;
                        i6 = (i622 - state.distance) & i13;
                        i7 = state.copyLength - state.j;
                        if (i6 + i7 < i13) {
                            break;
                        }
                        do {
                            i8 = state.j;
                            if (i8 >= state.copyLength) {
                            }
                        } while (i9 != i13);
                        i10 = 7;
                        state.nextRunningState = 7;
                        state.bytesToWrite = state.ringBufferSize;
                        state.bytesWritten = 0;
                        state.runningState = 12;
                        if (state.runningState == i10) {
                        }
                        break;
                    case 8:
                        int i74 = state.ringBufferSize;
                        System.arraycopy(bArr2, i74, bArr2, 0, state.copyDst - i74);
                        state.runningState = 3;
                        bArr = bArr2;
                        break;
                    case 9:
                        int i75 = state.copyLength;
                        if (i75 >= 4 && i75 <= 24) {
                            int i76 = OFFSETS_BY_LENGTH[i75];
                            int i77 = (state.distance - state.maxDistance) - 1;
                            int i78 = i77 & ((i15 << r15) - 1);
                            int i79 = i77 >>> SIZE_BITS_BY_LENGTH[i75];
                            int i80 = (i78 * i75) + i76;
                            Transform[] transformArr = Transform.TRANSFORMS;
                            if (i79 >= transformArr.length) {
                                State$$ExternalSyntheticBUOutline0.m("Invalid backward reference");
                                return;
                            }
                            int i81 = state.copyDst;
                            byte[] bArr11 = Dictionary$DataHolder.DATA;
                            Transform transform = transformArr[i79];
                            int i82 = i81;
                            for (byte b2 : transform.prefix) {
                                bArr2[i82] = b2;
                                i82++;
                            }
                            int i83 = transform.f1629type;
                            int i84 = i83 >= 12 ? i83 - 11 : 0;
                            if (i84 > i75) {
                                i84 = i75;
                            }
                            int i85 = i80 + i84;
                            int i86 = (i75 - i84) - (i83 <= 9 ? i83 : 0);
                            int i87 = i86;
                            while (i87 > 0) {
                                bArr2[i82] = bArr11[i85];
                                i87--;
                                i82++;
                                i85++;
                            }
                            if (i83 == 11 || i83 == 10) {
                                int i88 = i82 - i86;
                                if (i83 == 10) {
                                    i86 = i15;
                                }
                                while (i86 > 0) {
                                    byte b3 = bArr2[i88];
                                    int i89 = b3 & 255;
                                    if (i89 < 192) {
                                        if (i89 >= 97 && i89 <= 122) {
                                            bArr2[i88] = (byte) (b3 ^ PnmConstants.PNM_SEPARATOR);
                                        }
                                        i88++;
                                        i86--;
                                    } else if (i89 < 224) {
                                        int i90 = i88 + 1;
                                        bArr2[i90] = (byte) (bArr2[i90] ^ PnmConstants.PNM_SEPARATOR);
                                        i88 += 2;
                                        i86 -= 2;
                                    } else {
                                        int i91 = i88 + 2;
                                        bArr2[i91] = (byte) (bArr2[i91] ^ 5);
                                        i88 += 3;
                                        i86 -= 3;
                                    }
                                }
                            }
                            byte[] bArr12 = transform.suffix;
                            for (byte b4 : bArr12) {
                                bArr2[i82] = b4;
                                i82++;
                            }
                            int i92 = i82 - i81;
                            int i93 = state.copyDst + i92;
                            state.copyDst = i93;
                            state.pos += i92;
                            state.metaBlockLength -= i92;
                            int i94 = state.ringBufferSize;
                            if (i93 >= i94) {
                                state.nextRunningState = 8;
                                state.bytesToWrite = i94;
                                state.bytesWritten = 0;
                                state.runningState = 12;
                            } else {
                                state.runningState = 3;
                            }
                            bArr = bArr2;
                            break;
                        }
                        break;
                    default:
                        throw new BrotliRuntimeException("Unexpected state " + state.runningState);
                }
            } else {
                bArr = bArr2;
                int i95 = state.bytesToIgnore;
                if (i95 != 0) {
                    state.bytesWritten += i95;
                    state.bytesToIgnore = 0;
                }
                int min4 = Math.min(state.outputLength - state.outputUsed, state.bytesToWrite - state.bytesWritten);
                if (min4 != 0) {
                    System.arraycopy(state.ringBuffer, state.bytesWritten, state.output, state.outputOffset + state.outputUsed, min4);
                    state.outputUsed += min4;
                    state.bytesWritten += min4;
                }
                if (state.outputUsed >= state.outputLength) {
                    return;
                }
                int i96 = state.pos;
                int i97 = state.maxBackwardDistance;
                if (i96 >= i97) {
                    state.maxDistance = i97;
                }
                state.pos = i96 & i13;
                state.runningState = state.nextRunningState;
            }
            bArr2 = bArr;
            i12 = 1;
        }
    }

    public static void readHuffmanCode(int i, int[] iArr, int i2, BitReader bitReader) {
        int i3;
        int i4;
        int i5;
        BitReader.readMoreInput(bitReader);
        int[] iArr2 = new int[i];
        int readBits = BitReader.readBits(bitReader, 2);
        char c = 3;
        boolean z = true;
        if (readBits == 1) {
            int i6 = i - 1;
            int[] iArr3 = new int[4];
            int readBits2 = BitReader.readBits(bitReader, 2) + 1;
            int i7 = 0;
            while (i6 != 0) {
                i6 >>= 1;
                i7++;
            }
            for (int i8 = 0; i8 < readBits2; i8++) {
                int readBits3 = BitReader.readBits(bitReader, i7) % i;
                iArr3[i8] = readBits3;
                iArr2[readBits3] = 2;
            }
            iArr2[iArr3[0]] = 1;
            if (readBits2 != 1) {
                if (readBits2 == 2) {
                    int i9 = iArr3[0];
                    int i10 = iArr3[1];
                    r7 = i9 != i10;
                    iArr2[i10] = 1;
                } else if (readBits2 != 3) {
                    int i11 = iArr3[0];
                    int i12 = iArr3[1];
                    boolean z2 = (i11 == i12 || i11 == (i4 = iArr3[2]) || i11 == (i5 = iArr3[3]) || i12 == i4 || i12 == i5 || i4 == i5) ? false : true;
                    if (BitReader.readBits(bitReader, 1) == 1) {
                        iArr2[iArr3[2]] = 3;
                        iArr2[iArr3[3]] = 3;
                    } else {
                        iArr2[iArr3[0]] = 2;
                    }
                    z = z2;
                } else {
                    int i13 = iArr3[0];
                    int i14 = iArr3[1];
                    if (i13 != i14 && i13 != (i3 = iArr3[2]) && i14 != i3) {
                        r7 = true;
                    }
                }
                z = r7;
            }
        } else {
            int[] iArr4 = new int[18];
            int i15 = 0;
            int i16 = 32;
            while (readBits < 18 && i16 > 0) {
                int i17 = CODE_LENGTH_CODE_ORDER[readBits];
                BitReader.fillBitWindow(bitReader);
                long j = bitReader.accumulator;
                char c2 = c;
                int i18 = bitReader.bitOffset;
                int i19 = FIXED_TABLE[((int) (j >>> i18)) & 15];
                bitReader.bitOffset = i18 + (i19 >> 16);
                int i20 = i19 & 65535;
                iArr4[i17] = i20;
                if (i20 != 0) {
                    i16 -= 32 >> i20;
                    i15++;
                }
                readBits++;
                c = c2;
            }
            if (i15 != 1 && i16 != 0) {
                z = false;
            }
            int[] iArr5 = new int[32];
            buildHuffmanTable(0, iArr5, 5, 18, iArr4);
            int i21 = 8;
            int i22 = 0;
            int i23 = 0;
            int i24 = 0;
            int i25 = 32768;
            while (i22 < i && i25 > 0) {
                BitReader.readMoreInput(bitReader);
                BitReader.fillBitWindow(bitReader);
                long j2 = bitReader.accumulator;
                int i26 = bitReader.bitOffset;
                int i27 = iArr5[((int) (j2 >>> i26)) & 31];
                bitReader.bitOffset = i26 + (i27 >> 16);
                int i28 = i27 & 65535;
                if (i28 < 16) {
                    int i29 = i22 + 1;
                    iArr2[i22] = i28;
                    if (i28 != 0) {
                        i25 -= 32768 >> i28;
                        i21 = i28;
                    }
                    i22 = i29;
                    i24 = 0;
                } else {
                    int i30 = i28 - 14;
                    int i31 = i28 == 16 ? i21 : 0;
                    if (i23 != i31) {
                        i23 = i31;
                        i24 = 0;
                    }
                    int readBits4 = BitReader.readBits(bitReader, i30) + 3 + (i24 > 0 ? (i24 - 2) << i30 : i24);
                    int i32 = readBits4 - i24;
                    if (i22 + i32 > i) {
                        State$$ExternalSyntheticBUOutline0.m("symbol + repeatDelta > numSymbols");
                        return;
                    }
                    int i33 = 0;
                    while (i33 < i32) {
                        iArr2[i22] = i23;
                        i33++;
                        i22++;
                    }
                    if (i23 != 0) {
                        i25 -= i32 << (15 - i23);
                    }
                    i24 = readBits4;
                }
            }
            if (i25 != 0) {
                State$$ExternalSyntheticBUOutline0.m("Unused space");
                return;
            }
            int i34 = i - i22;
            int i35 = 0;
            while (i35 < i34) {
                int min = Math.min(i35 + 1024, i34) - i35;
                System.arraycopy(INT_ZEROES, 0, iArr2, i22 + i35, min);
                i35 += min;
            }
        }
        if (z) {
            buildHuffmanTable(i2, iArr, 8, i, iArr2);
        } else {
            State$$ExternalSyntheticBUOutline0.m("Can't readHuffmanCode");
        }
    }

    public static int readSymbol(int[] iArr, int i, BitReader bitReader) {
        long j = bitReader.accumulator;
        int i2 = bitReader.bitOffset;
        int i3 = (int) (j >>> i2);
        int i4 = i + (i3 & 255);
        int i5 = iArr[i4];
        int i6 = i5 >> 16;
        int i7 = i5 & 65535;
        if (i6 <= 8) {
            bitReader.bitOffset = i2 + i6;
            return i7;
        }
        int i8 = iArr[i4 + i7 + ((i3 & ((1 << i6) - 1)) >>> 8)];
        bitReader.bitOffset = (i8 >> 16) + 8 + i2;
        return i8 & 65535;
    }
}
