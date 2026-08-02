package com.instagram.common.viewpoint.core;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import com.google.common.base.Ascii;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import kotlin.io.encoding.Base64;
import okio.Utf8;
import org.objectweb.asm.Opcodes;

/* loaded from: assets/audience_network.dex */
public final class SG {
    public static byte[] A03;
    public static String[] A04 = {"hUOGynEtmSUNsKdJkghkOGNAWtryygzy", "wzPRxUupX2XKUl6NSNI9kT750batbohw", "Jhw1FAiFO5yEDnp58HFyVFkAnHcYvwe5", "TOMeOtqGrF4uQ0cY9hasq1ESWlFY5vR9", "yYpnUvpVzVqKhRvrciBHRtLUwNGFzaUs", "hHaB", "31TBXmQRr4tlfWcucEg5Ko3P35yO7", "Q2"};
    public static final String A05;
    public static volatile SG A06;
    public final C1127cu A00;
    public final Map<String, SD> A02 = Collections.synchronizedMap(new HashMap());
    public final Map<String, Float> A01 = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private Bitmap A02(SQ sq, SD sd, String str) {
        Bitmap A01;
        String str2 = sd.A08;
        int i = sd.A04;
        int i2 = sd.A05;
        long currentTimeMillis = System.currentTimeMillis();
        IOException e = null;
        String A08 = A08(223, 9, 68);
        boolean startsWith = str2.startsWith(A08);
        String A082 = A08(239, 22, 119);
        if (startsWith || str2.startsWith(A082)) {
            String substring = str2.startsWith(A08) ? str2.substring(A08.length()) : str2.substring(A082.length());
            InputStream inputStream = null;
            try {
                try {
                    inputStream = this.A00.getAssets().open(substring);
                    if (A0D(i, i2)) {
                        try {
                            A01 = SK.A01(inputStream, i, i2);
                        } catch (IOException e2) {
                            e = e2;
                            A0C(e);
                            if (inputStream != null) {
                                A0A(inputStream);
                            }
                            return null;
                        } catch (OutOfMemoryError e3) {
                            e = e3;
                            A0C(e);
                            if (inputStream != null) {
                                A0A(inputStream);
                            }
                            return null;
                        } catch (Throwable th) {
                            th = th;
                            if (inputStream != null) {
                                A0A(inputStream);
                            }
                            throw th;
                        }
                    } else {
                        A01 = BitmapFactory.decodeStream(inputStream);
                    }
                    if (inputStream != null) {
                        A0A(inputStream);
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException e4) {
                e = e4;
            } catch (OutOfMemoryError e5) {
                e = e5;
            } catch (Throwable th3) {
                th = th3;
            }
        } else if (A0D(i, i2)) {
            try {
                A01 = A05(str2, i, i2);
            } catch (IOException e6) {
                e = e6;
                A0C(e);
                A01 = A03(str2);
            }
        } else {
            A01 = A03(str2);
        }
        String th4 = e != null ? e.toString() : null;
        if (A01 == null) {
            SI.A03(sq, sd, str, SI.A03, th4, null, null);
            return null;
        }
        long A00 = A00(str2, A01);
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (A00 > 0) {
            SI.A03(sq, sd, str, SI.A02, th4, Long.valueOf(A00), Long.valueOf(currentTimeMillis2));
            return A01;
        }
        SI.A03(sq, sd, str, SI.A01, th4, null, null);
        if (U7.A11(sq)) {
            return null;
        }
        return A01;
    }

    public static String A08(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 67);
        }
        return new String(copyOfRange);
    }

    public static void A09() {
        A03 = new byte[]{3, 4, 119, 41, 55, 62, 58, Ascii.EM, Ascii.FS, 88, Ascii.ETB, Ascii.CR, Ascii.FF, 8, Ascii.CR, Ascii.FF, 88, Ascii.FS, Ascii.GS, Ascii.VT, Ascii.FF, 17, Ascii.SYN, Ascii.EM, Ascii.FF, 17, Ascii.ETB, Ascii.SYN, 88, 80, Ascii.RS, 17, Ascii.DC4, Ascii.GS, 69, 122, 81, 76, 85, 89, 72, Ascii.CAN, 75, 81, 66, 93, Ascii.CAN, 93, 64, 91, 93, 93, 92, 75, Ascii.CAN, 85, 89, 64, Ascii.CAN, 75, 81, 66, 93, Ascii.CAN, 94, 87, 74, Ascii.CAN, 75, 76, 87, 74, 89, 95, 93, 2, Ascii.CAN, Ascii.DC2, 48, 50, 57, 52, 113, 52, 35, 35, 62, 35, Byte.MAX_VALUE, 113, 19, 56, 37, 60, 48, 33, 113, 56, 34, 113, Utf8.REPLACEMENT_BYTE, 36, Base64.padSymbol, Base64.padSymbol, Byte.MAX_VALUE, 125, 90, 82, 87, 94, 95, Ascii.ESC, 79, 84, Ascii.ESC, 88, 84, 75, 66, Ascii.ESC, 87, 84, 88, 90, 87, Ascii.ESC, 82, 86, 90, 92, 94, Ascii.ESC, 82, 85, 79, 84, Ascii.ESC, 88, 90, 88, 83, 94, Ascii.ESC, 19, 78, 73, 87, 6, 38, Ascii.GS, Ascii.DC2, 17, Ascii.US, Ascii.SYN, 83, 7, Ascii.FS, 83, 4, 1, Ascii.SUB, 7, Ascii.SYN, 83, 17, Ascii.SUB, 7, Ascii.RS, Ascii.DC2, 3, 83, 7, Ascii.FS, 83, Ascii.NAK, Ascii.SUB, Ascii.US, Ascii.SYN, 83, 91, 6, 1, Ascii.US, 78, 70, 125, 114, 113, Byte.MAX_VALUE, 118, 51, 103, 124, 51, 100, 97, 122, 103, 118, 51, 113, 122, 103, 126, 114, 99, 51, 103, 124, 51, 124, 102, 103, 99, 102, 103, 51, 96, 103, 97, 118, 114, 126, 102, 116, 116, 98, 115, Base64.padSymbol, 40, 40, 40, 85, 90, 95, 86, 9, Ascii.FS, Ascii.FS, 82, 93, 88, 81, Ascii.SO, Ascii.ESC, Ascii.ESC, Ascii.ESC, 85, 90, 80, 70, 91, 93, 80, 107, 85, 71, 71, 81, 64, Ascii.ESC, 115, 119, 123, 125, Byte.MAX_VALUE, 10, 9, 7, 2, 42, 49, 52, 49, 48, 40, 49};
    }

    static {
        A09();
        A05 = SG.class.getSimpleName();
    }

    public SG(C1127cu c1127cu) {
        this.A00 = c1127cu;
    }

    private int A00(String str, Bitmap bitmap) {
        String A08 = A08(0, 2, 105);
        if (bitmap == null) {
            A0C(null);
            return 0;
        }
        File file = new File(A07(this.A00), str.hashCode() + A08(2, 4, 26));
        ByteArrayOutputStream bOut = null;
        FileOutputStream fileOutputStream = null;
        try {
            bOut = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, bOut);
            int size = bOut.size();
            if (size >= U7.A0H(this.A00)) {
                A0C(new Throwable(A08(35, 42, 123) + size));
                return 0;
            }
            fileOutputStream = new FileOutputStream(file);
            bOut.writeTo(fileOutputStream);
            fileOutputStream.flush();
            return size;
        } catch (OutOfMemoryError e) {
            A0C(e);
            Log.e(A05, A08(Opcodes.INVOKESTATIC, 39, 80), e);
            return 0;
        } catch (FileNotFoundException e2) {
            Log.e(A05, A08(6, 29, 59) + file.getPath() + A08, e2);
            A0C(e2);
            return 0;
        } catch (IOException e3) {
            A0C(e3);
            Log.e(A05, A08(Opcodes.LCMP, 36, 48) + str + A08, e3);
            return 0;
        } finally {
            A0A(bOut);
            A0A(fileOutputStream);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Bitmap A01(SQ sq, SD sd, int i, int i2, String str) {
        Bitmap decodeFile;
        Bitmap A02;
        if (SI.A06(sq) && A08(266, 4, 37).equals(str)) {
            this.A02.put(sd.A08, sd);
        }
        String str2 = sd.A08;
        SH sh = new SH(sd.A06, sd.A07, A08(261, 5, 89), str, str2);
        File A07 = A07(this.A00);
        StringBuilder append = new StringBuilder().append(str2.hashCode());
        String url = A08(2, 4, 26);
        File file = new File(A07, append.append(url).toString());
        if (!file.exists()) {
            SI.A04(sq, sh, false);
            String url2 = A08(232, 7, 112);
            if (str2.startsWith(url2)) {
                if (A04[4].charAt(22) == 'U') {
                    throw new RuntimeException();
                }
                A04[4] = "1yvOkimt2rWPU4mmWW1HHQmjZRsiMbmk";
                String url3 = A08(239, 22, 119);
                if (!str2.startsWith(url3)) {
                    A02 = A04(str2, i2, i);
                    String str3 = sd.A08;
                    if (A04[0].charAt(7) == 'l') {
                        A04[5] = "mvVz";
                        A0B(str3, A02);
                        return A02;
                    }
                    A04[4] = "ZqrwEo7e3gbOTkHDiv52cvZJTxj52IUd";
                    A0B(str3, A02);
                    return A02;
                }
            }
            A02 = A02(sq, sd, str);
            String str32 = sd.A08;
            if (A04[0].charAt(7) == 'l') {
            }
        } else {
            SI.A04(sq, sh, true);
            try {
                if (A0D(i2, i)) {
                    decodeFile = SK.A02(file.getCanonicalPath(), i2, i, this.A00);
                } else {
                    String url4 = file.getCanonicalPath();
                    decodeFile = BitmapFactory.decodeFile(url4);
                }
                String url5 = sd.A08;
                A0B(url5, decodeFile);
                return decodeFile;
            } catch (IOException e) {
                A0C(e);
                return null;
            }
        }
    }

    private Bitmap A03(String str) {
        byte[] A6u;
        InterfaceC1231ec AGC = C1250ev.A00(this.A00).AGC(str, new C1246er());
        if (AGC == null || (A6u = AGC.A6u()) == null) {
            return null;
        }
        int length = A6u.length;
        if (A04[4].charAt(22) == 'U') {
            throw new RuntimeException();
        }
        A04[2] = "99IwdndnBnCK07hgvsXqxjXsnHcettbD";
        return BitmapFactory.decodeByteArray(A6u, 0, length);
    }

    private Bitmap A04(String str, int i, int i2) {
        Bitmap decodeStream;
        int A00;
        try {
            boolean A0D = A0D(i, i2);
            String A08 = A08(232, 7, 112);
            if (A0D) {
                decodeStream = SK.A02(str.substring(A08.length()), i, i2, this.A00);
            } else {
                decodeStream = BitmapFactory.decodeStream(new FileInputStream(str.substring(A08.length())), null, null);
            }
            A00 = A00(str, decodeStream);
        } catch (IOException e) {
            Log.e(A05, A08(105, 43, 120) + str + A08(0, 2, 105), e);
        }
        if (U7.A11(this.A00)) {
            if (A00 <= 0) {
                return null;
            }
            return decodeStream;
        }
        return decodeStream;
    }

    private Bitmap A05(String str, int i, int i2) throws IOException {
        URL urlObj = new URL(str);
        HttpURLConnection connection = (HttpURLConnection) urlObj.openConnection();
        connection.setDoInput(true);
        connection.connect();
        InputStream inputStream = connection.getInputStream();
        Bitmap A01 = SK.A01(inputStream, i, i2);
        A0A(inputStream);
        return A01;
    }

    public static SG A06(C1127cu c1127cu) {
        if (A06 == null) {
            synchronized (SG.class) {
                if (A06 == null) {
                    A06 = new SG(c1127cu);
                }
            }
        }
        return A06;
    }

    public static File A07(SQ sq) {
        return sq.getCacheDir();
    }

    public static void A0A(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    private void A0B(String str, Bitmap bitmap) {
        if (!this.A01.containsKey(str) && bitmap != null && bitmap.getHeight() > 0) {
            float width = bitmap.getWidth() / bitmap.getHeight();
            if (width > 0.0f) {
                this.A01.put(str, Float.valueOf(width));
            }
        }
    }

    private void A0C(Throwable th) {
        String A08 = A08(261, 5, 89);
        if (th != null) {
            this.A00.A08().AAy(A08, AbstractC0766Sv.A1f, new C0767Sw(th));
        } else {
            this.A00.A08().AAy(A08, AbstractC0766Sv.A1f, new C0767Sw(A08(77, 28, 18)));
        }
    }

    private boolean A0D(int i, int i2) {
        return i > 0 && i2 > 0;
    }

    public final float A0E(String str) {
        if (this.A01.containsKey(str) && this.A01.get(str) != null) {
            return this.A01.get(str).floatValue();
        }
        if (A04[6].length() == 28) {
            throw new RuntimeException();
        }
        A04[6] = "EtgkjkQAQYyyMgrrXA05VcKpExUV0Ywa";
        return -1.0f;
    }

    public final Bitmap A0F(SD sd) {
        return A01(this.A00, sd, sd.A05, sd.A04, sd.A02);
    }

    public final Bitmap A0G(SQ sq, String str, int i, int i2, String str2) {
        SD sd = this.A02.get(str);
        return (!SI.A06(sq) || sd == null) ? A01(sq, new SD(str, i, i2, A08(270, 7, 28), A08(270, 7, 28)), i2, i, str2) : A01(sq, sd, i2, i, str2);
    }

    public final File A0H(String str) {
        File file = new File(A07(this.A00), str.hashCode() + A08(2, 4, 26));
        if (file.exists()) {
            return file;
        }
        return null;
    }

    public final String A0I(String str) {
        File file = new File(A07(this.A00), str.hashCode() + A08(2, 4, 26));
        return file.exists() ? file.getPath() : str;
    }
}
