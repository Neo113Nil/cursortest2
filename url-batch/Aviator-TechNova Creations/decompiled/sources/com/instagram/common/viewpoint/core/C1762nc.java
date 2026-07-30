package com.instagram.common.viewpoint.core;

import androidx.core.view.PointerIconCompat;
import com.facebook.ads.AdError;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.Arrays;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.nc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1762nc extends C01734z {
    public static byte[] A02;
    public final int A00;
    public final AnonymousClass56 A01;

    static {
        A06();
    }

    public static String A05(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 56);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A02 = new byte[]{-39, -30, -37, -41, -24, -22, -37, -18, -22, -92, -96, -28, -27, -22, -106, -26, -37, -24, -29, -33, -22, -22, -37, -38, -92, -96};
    }

    public C1762nc(AnonymousClass56 anonymousClass56, int i, int i2) {
        super(A03(i, i2));
        this.A01 = anonymousClass56;
        this.A00 = i2;
    }

    public C1762nc(IOException iOException, AnonymousClass56 anonymousClass56, int i, int i2) {
        super(iOException, A03(i, i2));
        this.A01 = anonymousClass56;
        this.A00 = i2;
    }

    public C1762nc(String str, AnonymousClass56 anonymousClass56, int i, int i2) {
        super(str, A03(i, i2));
        this.A01 = anonymousClass56;
        this.A00 = i2;
    }

    public C1762nc(String str, IOException iOException, AnonymousClass56 anonymousClass56, int i, int i2) {
        super(str, iOException, A03(i, i2));
        this.A01 = anonymousClass56;
        this.A00 = i2;
    }

    public static int A03(int i, int i2) {
        if (i == 2000 && i2 == 1) {
            return AdError.INTERNAL_ERROR_CODE;
        }
        return i;
    }

    public static C1762nc A04(final IOException iOException, final AnonymousClass56 anonymousClass56, int i) {
        int errorCode;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            errorCode = AdError.CACHE_ERROR_CODE;
        } else if (iOException instanceof InterruptedIOException) {
            errorCode = PointerIconCompat.TYPE_WAIT;
        } else {
            if (message != null) {
                String A01 = AbstractC1466iY.A01(message);
                String message2 = A05(0, 26, 62);
                if (A01.matches(message2)) {
                    errorCode = 2007;
                }
            }
            errorCode = AdError.INTERNAL_ERROR_CODE;
        }
        if (errorCode == 2007) {
            return new C1762nc(iOException, anonymousClass56) { // from class: com.facebook.ads.redexgen.X.9h
                public static byte[] A00;
                public static String[] A01 = {"IiHFHpE70aCOc94efxOlf2iC0Ng8zMr5", "b3mzaytlZJgoRVhs4UINeaUr6S0G0E41", "6IHqdrhMw9UxFnoc7iMNxZeDC0DTO0yB", "go0dTVggBQ2s7heaJCrnqGQgIh6JhPx1", "bkC24C7HhnNqTiNutYzB4zMXotuBenI", "te5qRCwogDd297VgLok2fv8nwYFOdDR1", "xjDDw5bsf4CogqtV7hhNk6k9HWMs2JIA", "oLDdWjUmHvVvISH87gP40QDZoo9t6EZz"};

                public static String A01(int i2, int i3, int i4) {
                    byte[] copyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
                    int i5 = 0;
                    while (true) {
                        int length = copyOfRange.length;
                        if (A01[0].charAt(11) != 'O') {
                            throw new RuntimeException();
                        }
                        A01[2] = "31sOmOCDO5yq31NNiMqquOfpDH8J50WI";
                        if (i5 >= length) {
                            return new String(copyOfRange);
                        }
                        copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 39);
                        i5++;
                    }
                }

                public static void A02() {
                    A00 = new byte[]{96, 79, 70, 66, 81, 87, 70, 91, 87, 3, 107, 119, 119, 115, 3, 87, 81, 66, 69, 69, 74, 64, 3, 77, 76, 87, 3, 83, 70, 81, 78, 74, 87, 87, 70, 71, Ascii.CR, 3, 112, 70, 70, 3, 75, 87, 87, 83, 80, Ascii.EM, Ascii.FF, Ascii.FF, 71, 70, 85, 70, 79, 76, 83, 70, 81, Ascii.CR, 66, 77, 71, 81, 76, 74, 71, Ascii.CR, 64, 76, 78, Ascii.FF, 68, 86, 74, 71, 70, Ascii.FF, 87, 76, 83, 74, 64, 80, Ascii.FF, 78, 70, 71, 74, 66, Ascii.FF, 74, 80, 80, 86, 70, 80, Ascii.FF, 64, 79, 70, 66, 81, 87, 70, 91, 87, Ascii.SO, 77, 76, 87, Ascii.SO, 83, 70, 81, 78, 74, 87, 87, 70, 71};
                }

                static {
                    A02();
                }

                {
                    String A012 = A01(0, Opcodes.LSHL, 4);
                }
            };
        }
        return new C1762nc(iOException, anonymousClass56, errorCode, i);
    }
}
