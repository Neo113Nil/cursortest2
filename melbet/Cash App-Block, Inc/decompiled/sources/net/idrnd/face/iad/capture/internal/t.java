package net.idrnd.face.iad.capture.internal;

import com.plaid.internal.EnumC0170g;
import java.nio.charset.StandardCharsets;
import org.apache.commons.imaging.formats.pnm.PnmConstants;
import org.bouncycastle.crypto.signers.PSSSigner;

/* loaded from: classes9.dex */
public abstract class t {
    public static final String a;
    public static final String[] b;
    public static final String[] c;
    public static final String[] d;
    public static final String[] e;

    static {
        byte[] bArr = {30, -122};
        byte[] bArr2 = new byte[2];
        byte[] bArr3 = {109, -19, 5, 27};
        byte b2 = 0;
        for (int i = 0; i < 2; i++) {
            bArr2[i] = (byte) ((b2 ^ bArr[i]) ^ bArr3[i & 3]);
            b2 = bArr[i];
        }
        a = new String(bArr2, StandardCharsets.UTF_8);
        byte[] bArr4 = {-22, -77, 17, 18, -11, -84, 16, 85, -87, -7, 89, 1, -90, -15, PnmConstants.PNM_PREFIX_BYTE, 25, -30, -69, 29, 84, -13, -74, 12, 43, -63, -104, 58, 57, -34, -121, 59, 126, -126, -46, 114, 42, -115, -38, 123, PnmConstants.PGM_TEXT_CODE, -55, -112, PnmConstants.PPM_RAW_CODE, Byte.MAX_VALUE, -40, -99, 39, 36, -56, -110, PnmConstants.PBM_RAW_CODE, 109, -127, -67, 23, 79, -24, -67, 26, 86, -74, -18, 71, 3, -8, -85, 74, 20, -24, -82, 4, 91, -95, -30, 39, 105, -113, -44, PnmConstants.PGM_RAW_CODE, 115, -107, -42, 106, 47, -49, -110, 57, 97, -100, -34, 112, 115, -119, -54, 117, 61, -58, -123, 57, 113, -118, -74, 26, 88, PSSSigner.TRAILER_IMPLICIT, -92, 31, 90, -70, -2, 85, 8, -32, -92, 31, 75, -20, -87, 19, 78, -94, -26, 92, 2, -18, -86, 111, 33, -57, -100, 125, 41, -59, -97, 60, 126, Byte.MIN_VALUE, -45, 111, 108, -106, -43, 16, 94, -72, -29, 2, 91, -67, -5, 94, 28, -3, -91, 29, 69, -30, -71, 23, 93, -67, -8, 92, 123, -111, -56, 106, 105, -117, -44, 117, 63, -60, -99, 61, 100, -61, -98, 56, 123, -107, -42, 106, 34, -39, -27, 73, 11, -17, -9, 83, 23, -16, -95, 1, 2, -7, -96, 0, 89, -38, -113, 47, 111, -56, -115, 47, 103, -118, -43, 123, 58, -38, -126, 38, 37, -61, -101, PnmConstants.PBM_TEXT_CODE, Byte.MAX_VALUE, -102, -59, 105, 47, -44, -115, 45, 116, -9, -94, 2, 66, -27, -87, 14, 74, -78, -15, 78, 8, -81, -21, 75, 9, -12, -20, 68, 5, -29, -73, 25, 88, -37, -114, 46, 110, -55, -98, 61, 117, -116, -46, 103, 43, -53, -109, 114, 57, -62, -107, PnmConstants.PAM_RAW_CODE, 123, Byte.MIN_VALUE, -39, 121, PnmConstants.PNM_SEPARATOR};
        byte[] bArr5 = new byte[EnumC0170g.SDK_ASSET_ILLUSTRATION_REPORT_CIRCLE_SOLID_VALUE];
        byte[] bArr6 = {-119, PnmConstants.PPM_RAW_CODE, -49, 45};
        byte b3 = 0;
        for (int i2 = 0; i2 < 276; i2++) {
            bArr5[i2] = (byte) ((b3 ^ bArr4[i2]) ^ bArr6[i2 & 3]);
            b3 = bArr4[i2];
        }
        String[] split = new String(bArr5, StandardCharsets.UTF_8).split("\n");
        split.getClass();
        b = split;
        byte[] bArr7 = {-61, 65, -108, -121, 76, -50, 3, 77, -123, 1, -46, -117, 94, -57, 11, 87, -39, 70, -111, -63, 12, Byte.MIN_VALUE, 86, 10, -51, 69, -113, -72, 123, -7, 44, 63, -12, 118, -69, -11, 61, -71, 106, PnmConstants.PPM_TEXT_CODE, -26, Byte.MAX_VALUE, -77, -17, 97, -2, 41, 121, -76, 56, -18, -78, 117, -3, PnmConstants.PAM_RAW_CODE, 36, -24, 108, -73, -17, 33, -65, 98, 85, -106, 20, -63, -46, 22, -110, 71, 21, -37, 64, -111, -56, 13, -113, 25, 72, -99, 19, -64, -124, 84, -40, 20, 74, -126, 10, -64, -9, PnmConstants.PBM_RAW_CODE, -74, 99, 112, -77, PnmConstants.PPM_RAW_CODE, -21, -70, 106, -14, 57, 42, -26, 106, -79, -25, 62, -93, 122, PnmConstants.PPM_TEXT_CODE, -16, 117, -57, -103, 86, -42, 64, 15, -50, 78, -110, -35, 18, -106, 74, 89, -104, 5, -51, -127, 84, -40, 18, 78, Byte.MIN_VALUE, 25, -56, -101, 94, -71, 98, 48, -3, 62, -12, -88, 101, -20, 38, 116, -67, PnmConstants.PBM_RAW_CODE, -94, -2, 46, -77, 122, PnmConstants.PGM_TEXT_CODE, -13, 108, -75, -26, PnmConstants.PGM_TEXT_CODE, -74, 96, 56, -24, 119, -96, -105, 84, -42, 3, 16, -47, 82, -114, -63, 14, -118, 86, 69, -109, 27, -51, -108, 93, -34, 1, 18, -48, 84, Byte.MIN_VALUE, -47, 24, -101, 68, 87, -66, 61, -60, -119, 89, -10, 39, 118, -70, 62, -24, -78, 65, -55, 3, 72, -127, 15, -46, -63, 34, Byte.MIN_VALUE, 113, 2, -88, 38, -15, -95, 47, -93, 117, 44, -2, 124, -83, -12, 122, -31, 60, 111, -85, 47, -7, -93, 45, -94, 115, 34, -18, 106, PSSSigner.TRAILER_IMPLICIT, -26, 104, -52, 26, 102, -74, 43, -47, -123, 73, -56, 25, 74, -115, PnmConstants.PPM_TEXT_CODE, -18, -95, 119, -13, 40, 112, -2, 95, -78, -52, 39, -64, 27, 73, -124, 71, -100, -55, 12, -115, 69, 13, -34, 29, -55, -127, 66, -60, 5, 72, -119, 16, -53, -98, 91, -60, 118, 40, -25, 103, -15, -82, 98, -18, PnmConstants.PGM_RAW_CODE, 99, -82, 34, -24, -95, 96, -31, 41, 124, -67, 90, -115, -62, 5, -58, 28, 77, -116, 2, -47, -127, 64, -33, 19, 0, -51, 65, -117, -35, 24, -127, PnmConstants.PPM_TEXT_CODE, 109, -94, 34, -76, -24, 36, -91, 116, 39, -24, 107, -74, -91, 99, -4, 33, 121, -45, 93, -118, -38, 84, -53, 22, 91, -108, 29, -41, -123, 76, -59, 83, 15, -33, 66, -16, -94, 112, -6, 108, PnmConstants.PGM_TEXT_CODE, -32, 104, -75, -8, PnmConstants.PBM_RAW_CODE, -72, 121, PnmConstants.PAM_RAW_CODE, -71, 60, -27, -69, 112, -105, 76, 30, -45, 16, -54, -106, 69, -51, 20, 89, -119, 2, -49, -98, 82, -111, 79, 5, -63, 38, -3, -81, 98, -95, 99, PnmConstants.PPM_TEXT_CODE, -14, 111, -89, -112, 83, -47, 4, 23, -45, 72, -34, -114, 79, -48, 3, 91, -113, 15, -40, -127, 15, -117, 93, 19, -57, 75, -97, -50, 11, -108, 38, 116, -90, 44, -70, -22, 37, -86, 123, 42, -29, 125, -88, -69, 122, -7, 37, 106, -91, 33, -3, -54, 9, -117, 94, 77, -116, 15, -45, -100, 83, -41, 11, 24, -49, 82, -60, -105, 82, -53, 93, 12, -61, 73, -5, -91, 106, -22, 124, PnmConstants.PNM_SEPARATOR, -18, 103, -83, -1, PnmConstants.PPM_RAW_CODE, -65, 41, 119, -74, PnmConstants.PPM_RAW_CODE, -21, -92, 101, -90, 107, 38, -30, 110, -94, -6, PnmConstants.PNM_PREFIX_BYTE, -34, 5, 22, -37, 87, -117, -35, 20, -115, PnmConstants.PNM_PREFIX_BYTE, 67, -123, 26, -57, -97, 91, -39, 12, 59, -8, 122, -81, PSSSigner.TRAILER_IMPLICIT, 111, -19, 57, 107, -93, 61, -16, -29, 34, -95, 125, PnmConstants.PGM_TEXT_CODE, -3, 121, -91, -74, 115, -6, 58, 119, -7, 121, -96, -13, PnmConstants.PGM_TEXT_CODE, -72, 101, 42, Byte.MIN_VALUE, 2, -56, -110, 28, -100, 65, 19, -60, 74, -109, -38, 84, -36, 0, 69, -107, 23, -36, -124, 64, -125, 86, 10, -60, 72, -105, -49, 29, -6, 33, 115, -66, 125, -67, -19, 34, -85, 116, 40, -27, 109, -33, -127, 78, -50, 88, 6, -49, 74, -36, -122, 71, -57, 26, 120, -69, 63, -17, -40, 27, -103, 76, 95, -100, 25, -64, -113, 67, -53, 0, 19, -33, 66, -107, -39, 24, -122, 91, 20, -64, 39, -4, -96, 116, -6, 42, 72, -58, 70, -101, -7, 119, -13, 45, 79, -63, 85, -126, -54, PnmConstants.PGM_RAW_CODE, -10, 45, 113, -65, 13};
        byte[] bArr8 = new byte[682];
        byte[] bArr9 = {-96, -19, -72, 61};
        byte b4 = 0;
        for (int i3 = 0; i3 < 682; i3++) {
            bArr8[i3] = (byte) ((b4 ^ bArr7[i3]) ^ bArr9[i3 & 3]);
            b4 = bArr7[i3];
        }
        String[] split2 = new String(bArr8, StandardCharsets.UTF_8).split("\n");
        split2.getClass();
        c = split2;
        byte[] bArr10 = {-35, 13, 110, 65, -101, 65, 57, 89, -125, 74, 37, 74, -105, 77, 109, 30, -49, 31, 101, 7, -43, 5, 106, 0, -76, 104, 9, 101, -11, 46, 69, PnmConstants.PGM_TEXT_CODE, -19, PnmConstants.PPM_RAW_CODE, 78, 46, -2, 34, 73, 102, -86, 122, 27, 110, -77, 96, 1, 97, -76, 123, 25, 109, -96, 21, Byte.MAX_VALUE, 27, -117, 70, 39, 68, -116, 29, 114, 29, -57, 10, 107, 3, -39, 72, 62, 79, -98, 82, 57, 92, -52, 26, 122, 8, -62, 28, 126, 19, -56, 5, 1, 99, -78, 96, 64, PnmConstants.PGM_TEXT_CODE, -19, 39, 91, PnmConstants.PPM_TEXT_CODE, -26, 119, 10, 126, -94, 110, 20, 103, -72, 115, 24, 19, -50, 30, 125, 82, -106, 72, 37, 76, -127, 78, 47, 64, -103, 8, 114, 22, -59, 10, 118, 24, -55, 2, 126, 26, -55, 25, 97, 5, -47, 12, 8, 106, -69, 105, 73, 41, -6, PnmConstants.PGM_RAW_CODE, 83, 61, -15, 47, 82, 125, -85, 125, 23, 115, -96, 102, 26, 116, -91, 110, 106, 8, -39, 11, 43, 75, -104, 87, PnmConstants.PBM_TEXT_CODE, 95, -109, 77, 48, 31, -55, 31, 117, 17, -62, 4, 120, 22, -57, 12, 99, 6, -34, 19, 120, 28, -88, 116, 21, 121, -23, 48, 81, 34, -15, PnmConstants.PAM_RAW_CODE, 81, 61, -83, 122, 29, 120, -93, 110, 15, 97, -85, 68, 56, 92, -113, 89, 34, 78, -6, 38, 71, 43, -69, 98, 3, 112, -93, 101, 3, 111, -1, 40, 79, 42, -15, 60, 93, PnmConstants.PPM_TEXT_CODE, -7};
        byte[] bArr11 = new byte[EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_VALUE];
        byte[] bArr12 = {-66, -65, 14, 1};
        byte b5 = 0;
        for (int i4 = 0; i4 < 241; i4++) {
            bArr11[i4] = (byte) ((b5 ^ bArr10[i4]) ^ bArr12[i4 & 3]);
            b5 = bArr10[i4];
        }
        new String(bArr11, StandardCharsets.UTF_8).split("\n").getClass();
        byte[] bArr13 = {-59, 46, 38, 56, -77, 19, 22, 19, -102, 116, 113, PnmConstants.PBM_RAW_CODE, -44, 116, 121, 114, -20, 2, 68, 66, -57, 43, 35, 37, -32, 13, 13, 9, -52, 73, 15, 1, -118, 113, 121, 60, -70, 90, PnmConstants.PNM_PREFIX_BYTE, 91, -35, 125, 108, 100, -25, 6, 64, PnmConstants.PNM_SEPARATOR, -27, 25, 18, 17, -107, PnmConstants.PGM_RAW_CODE, 86, 19, -118, 112, PnmConstants.PPM_RAW_CODE, 62, -67, 92, 26, 122, -65, 67, 83, 74, -44, 62, 58, Byte.MAX_VALUE, -9, 17, 22, 83, -77, 19, 9, 26, -125, 120, 116, 115, -74, 91, 91, 95, -102, 59, PnmConstants.PAM_RAW_CODE, 37, -69, 27, 120, 61, -92, 82, 72, 86, -39, 59, 125, 117, -10, 23, 81, 93, -42, 48, PnmConstants.PGM_RAW_CODE, 44, -89, 78, 66, 7, -25, 71, 93, 78, -41, 44, PnmConstants.PNM_SEPARATOR, 39, -30, 30, 19, 86, -60, 41, 41, 45, -24, 109, 43, PnmConstants.PGM_TEXT_CODE, -95, 93, 64, 79, -56, 104, 116, 109, -11, 85, 75, 68, -125, 98, 110, 97, -17, 77, 86, 83, -42, 45, 107, 11, -50, PnmConstants.PGM_TEXT_CODE, 34, 59, -91, 79, 75, 14, -100, 113, 113, 117, -80, PnmConstants.PGM_RAW_CODE, 115, 122, -15, 29, 28, 19, -42, 83, 21, 27, -112, 107, 99, 38, -58, 102, 107, 100, -8, 88};
        byte[] bArr14 = new byte[EnumC0170g.SDK_ASSET_ICON_EXTERNAL_VALUE];
        byte[] bArr15 = {-22, -113, 105, 106};
        byte b6 = 0;
        for (int i5 = 0; i5 < 194; i5++) {
            bArr14[i5] = (byte) ((b6 ^ bArr13[i5]) ^ bArr15[i5 & 3]);
            b6 = bArr13[i5];
        }
        d = new String(bArr14, StandardCharsets.UTF_8).split("\n");
        byte[] bArr16 = {-85, -91, -61, -66, 78, 86, 36, PnmConstants.PNM_SEPARATOR, -117, -123, -29, -98, 110, 118, 4, 37, -61, -41, -90, -94, 9, 7, 97, 28, -20, -12, -122, -89, PnmConstants.PNM_PREFIX_BYTE, 79, 57, 89, -41, -123, -23, -98, 105, 96, 26, 121, -46, -41, -86, -51, 39, PnmConstants.PNM_PREFIX_BYTE, 96, 24, -7, -22, -111, -16, 6, 84, 41, 78, -92, -45, -29, -98, 120, 108, 29, 25, -78, -86, -63, -84};
        byte[] bArr17 = new byte[68];
        byte[] bArr18 = {-124, 125, 31, 14};
        byte b7 = 0;
        for (int i6 = 0; i6 < 68; i6++) {
            bArr17[i6] = (byte) ((b7 ^ bArr16[i6]) ^ bArr18[i6 & 3]);
            b7 = bArr16[i6];
        }
        String[] split3 = new String(bArr17, StandardCharsets.UTF_8).split("\n");
        split3.getClass();
        e = split3;
    }
}
