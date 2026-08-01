package com.facebook.ads.redexgen.X;

import android.text.Html;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import androidx.core.view.PointerIconCompat;
import androidx.exifinterface.media.ExifInterface;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.google.common.base.Ascii;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.io.encoding.Base64;
import kotlin.text.Typography;
import org.objectweb.asm.Opcodes;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* renamed from: com.facebook.ads.redexgen.X.Vb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0893Vb implements FY {
    public static byte[] A00;
    public static String[] A01 = {"WhhTtmL3IE0OcmfXWkhGt3DJMBKWOPru", "IevVaXk7JqzzQUabSVzCZHFLz34", "JQeKeaIRvnKict07eDImxsw0zmpeeDwJ", "rs4XVQZ55s40EhV5j5mU6ZQA9Y9rRaIz", "SJPDpX1Ek2cYyhaXJ8Sq3wDJ6OH3a64q", "ZrPZtqAmah23MQGa5C4AxOobVPmeO1Q6", "YNQWbrIx5dPz4M9Oia0FZFMQh4yL9BRJ", ""};

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A01;
            if (strArr[3].charAt(9) == strArr[6].charAt(9)) {
                break;
            }
            String[] strArr2 = A01;
            strArr2[7] = "";
            strArr2[1] = "4dyVwnIREhtUy8kbUvz4COx2efs";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            int i5 = (copyOfRange[i4] ^ i3) ^ 91;
            String[] strArr3 = A01;
            if (strArr3[3].charAt(9) == strArr3[6].charAt(9)) {
                break;
            }
            String[] strArr4 = A01;
            strArr4[2] = "YKvNYNoIe7sickVZlze0IU3YAzLP0yRC";
            strArr4[0] = "QfLwrAzJ9MWwcUOLXpFOoivgYgfoEA7m";
            copyOfRange[i4] = (byte) i5;
            i4++;
        }
        throw new RuntimeException();
    }

    public static void A01() {
        byte[] bArr = {74, Byte.MAX_VALUE, Byte.MAX_VALUE, 110, 102, 123, Byte.MAX_VALUE, 110, 111, 43, Byte.MAX_VALUE, 100, 43, 104, 121, 110, 106, Byte.MAX_VALUE, 110, 43, 111, 110, 104, 100, 111, 110, 121, 43, 109, 100, 121, 43, 126, 101, 120, 126, 123, 123, 100, 121, Byte.MAX_VALUE, 110, 111, 43, 109, 100, 121, 102, 106, Byte.MAX_VALUE, 77, 92, 92, 64, 69, 79, 77, 88, 69, 67, 66, 3, 79, 73, 77, 1, Ascii.SUB, Ascii.FS, Ascii.DC4, Ascii.SI, Ascii.RS, Ascii.RS, 2, 7, Ascii.CR, Ascii.SI, Ascii.SUB, 7, 1, 0, 65, Ascii.CR, Ascii.VT, Ascii.SI, 67, 89, 94, 86, 89, 72, 72, 84, 81, 91, 89, 76, 81, 87, 86, Ascii.ETB, 92, 78, 90, 75, 77, 90, 75, Ascii.DC4, 5, 5, Ascii.EM, Ascii.FS, Ascii.SYN, Ascii.DC4, 1, Ascii.FS, Ascii.SUB, Ascii.ESC, 90, 5, Ascii.DC2, 6, 56, 41, 41, 53, 48, 58, 56, 45, 48, 54, 55, 118, 45, 45, 52, 53, 114, 33, 52, 53, 86, 71, 71, 91, 94, 84, 86, 67, 94, 88, 89, Ascii.CAN, 79, Ascii.SUB, 90, 71, 3, Ascii.SUB, 84, 82, 86, Ascii.SUB, 1, 7, Ascii.SI, 107, 122, 122, 102, 99, 105, 107, 126, 99, 101, 100, 37, 114, 39, 103, 122, 62, 39, 124, 126, 126, 119, 102, 102, 122, Byte.MAX_VALUE, 117, 119, 98, Byte.MAX_VALUE, 121, 120, 57, 110, 59, 103, 99, Byte.MAX_VALUE, 117, 125, 98, Byte.MAX_VALUE, 123, 115, 59, 98, 110, 37, 113, 49, 32, 32, 60, 57, 51, 49, 36, 57, 63, 62, Byte.MAX_VALUE, 40, 125, 35, 37, 50, 34, 57, 32, Ascii.SUB, Ascii.VT, Ascii.SYN, Ascii.SUB, 65, Ascii.CAN, Ascii.SUB, Ascii.SUB, 110, Byte.MAX_VALUE, 98, 110, 53, 98, 55, 105, 105, 123};
        String[] strArr = A01;
        if (strArr[7].length() == strArr[1].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[7] = "";
        strArr2[1] = "2GwQ5PhYbi899tQyrHJTlEvTlhB";
        A00 = bArr;
    }

    static {
        A01();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x000d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x012e  */
    @Override // com.facebook.ads.redexgen.X.FY
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC0894Vc A4W(Format format) {
        char c;
        String str = format.A0O;
        switch (str.hashCode()) {
            case -1351681404:
                if (str.equals(A00(88, 19, 99))) {
                    c = '\t';
                    switch (c) {
                        case 0:
                            return new BP() { // from class: com.facebook.ads.redexgen.X.2Q
                                public static byte[] A05;
                                public static String[] A06 = {"", "nabbxVlkTS02KbOXtvrYjxXOkvgrE4Rx", "pCs3X8pbdqhf3udQeQHOHg2TESRVIExP", "X7dWDqGkZ4oo9ojzasriQNNbGDOP4U2k", "bRsmFeMe4IswSZg7MRLOH", "8AzhoLHWgRP6QDlYco1FQ5KlMFYiSCT4", "JmcruW7M7IQPekUGyzzhcFR79qXiQpMI", "0ZXGLWfsk5GmSFBdSETpQZD9x"};
                                public final G0 A00;
                                public final G6 A01;
                                public final G9 A02;
                                public final C0541Hh A03;
                                public final List<G4> A04;

                                public static String A02(int i, int i2, int i3) {
                                    byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
                                    for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                                        copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 33);
                                    }
                                    return new String(copyOfRange);
                                }

                                public static void A03() {
                                    byte[] bArr = {-88, -121, -38, -37, -32, -45, -52, -121, -55, -45, -42, -54, -46, -121, -34, -56, -38, -121, -51, -42, -36, -43, -53, -121, -56, -51, -37, -52, -39, -121, -37, -49, -52, -121, -51, -48, -39, -38, -37, -121, -54, -36, -52, -107, -110, -109, -104, -119, -73, -72, -67, -80, -87, -92, -78, -81, -61, -63, -63, -111, -78, -80, -68, -79, -78, -65};
                                    if (A06[4].length() == 3) {
                                        throw new RuntimeException();
                                    }
                                    A06[1] = "qjCLSi9tiUSTzkFi0DFuhWZdaggVbYhZ";
                                    A05 = bArr;
                                }

                                static {
                                    A03();
                                }

                                {
                                    A02(53, 13, 44);
                                    this.A02 = new G9();
                                    this.A03 = new C0541Hh();
                                    this.A01 = new G6();
                                    this.A00 = new G0();
                                    this.A04 = new ArrayList();
                                }

                                public static int A00(C0541Hh c0541Hh) {
                                    int currentInputPosition = -1;
                                    int i = 0;
                                    while (currentInputPosition == -1) {
                                        i = c0541Hh.A06();
                                        String A0P = c0541Hh.A0P();
                                        if (A0P == null) {
                                            currentInputPosition = 0;
                                        } else if (A02(48, 5, 67).equals(A0P)) {
                                            currentInputPosition = 2;
                                        } else {
                                            String[] strArr = A06;
                                            String str2 = strArr[6];
                                            String line = strArr[5];
                                            int currentInputPosition2 = str2.charAt(27);
                                            int foundEvent = line.charAt(27);
                                            if (currentInputPosition2 != foundEvent) {
                                                throw new RuntimeException();
                                            }
                                            A06[4] = "";
                                            if (A02(44, 4, 35).startsWith(A0P)) {
                                                currentInputPosition = 1;
                                            } else {
                                                currentInputPosition = 3;
                                            }
                                        }
                                    }
                                    c0541Hh.A0Y(i);
                                    return currentInputPosition;
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                @Override // com.facebook.ads.redexgen.X.BP
                                /* renamed from: A01, reason: merged with bridge method [inline-methods] */
                                public final VQ A0b(byte[] bArr, int i, boolean z) throws FX {
                                    C0541Hh c0541Hh;
                                    this.A03.A0b(bArr, i);
                                    this.A01.A0E();
                                    this.A04.clear();
                                    GA.A04(this.A03);
                                    do {
                                        c0541Hh = this.A03;
                                        String[] strArr = A06;
                                        if (strArr[0].length() == strArr[7].length()) {
                                            throw new RuntimeException();
                                        }
                                        A06[1] = "tbdDXORcAGWDWJQvQKVPnq93lpg2mrPP";
                                    } while (!TextUtils.isEmpty(c0541Hh.A0P()));
                                    ArrayList arrayList = new ArrayList();
                                    while (true) {
                                        int A002 = A00(this.A03);
                                        if (A002 != 0) {
                                            if (A002 == 1) {
                                                C0541Hh c0541Hh2 = this.A03;
                                                if (A06[2].charAt(14) != 'd') {
                                                    A04(c0541Hh2);
                                                } else {
                                                    String[] strArr2 = A06;
                                                    strArr2[6] = "XeLthZEhonOY1WTLxlO74ZC3vwAi7Gzu";
                                                    strArr2[5] = "58vrG83lY5mmO2PMdgn4YupBjgbiqU0F";
                                                    A04(c0541Hh2);
                                                }
                                            } else if (A002 == 2) {
                                                if (arrayList.isEmpty()) {
                                                    this.A03.A0P();
                                                    G4 styleBlock = this.A00.A0E(this.A03);
                                                    if (styleBlock != null) {
                                                        this.A04.add(styleBlock);
                                                    }
                                                } else {
                                                    throw new FX(A02(0, 44, 70));
                                                }
                                            } else if (A002 == 3 && this.A02.A0G(this.A03, this.A01, this.A04)) {
                                                arrayList.add(this.A01.A0D());
                                                this.A01.A0E();
                                            }
                                        } else {
                                            return new VQ(arrayList);
                                        }
                                    }
                                }

                                public static void A04(C0541Hh c0541Hh) {
                                    while (!TextUtils.isEmpty(c0541Hh.A0P())) {
                                    }
                                }
                            };
                        case 1:
                            return new AnonymousClass34(format.A0P);
                        case 2:
                            return new BP() { // from class: com.facebook.ads.redexgen.X.2R
                                public static byte[] A02;
                                public static final int A03;
                                public static final int A04;
                                public static final int A05;
                                public final G6 A00;
                                public final C0541Hh A01;

                                public static String A02(int i, int i2, int i3) {
                                    byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
                                    for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                                        copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 28);
                                    }
                                    return new String(copyOfRange);
                                }

                                public static void A03() {
                                    A02 = new byte[]{-108, -71, -82, -70, -72, -69, -73, -80, -65, -80, 107, -104, -69, Byte.MAX_VALUE, -94, -80, -83, -63, -65, -65, 107, -97, -70, -69, 107, -105, -80, -63, -80, -73, 107, -83, -70, -61, 107, -77, -80, -84, -81, -80, -67, 107, -79, -70, -64, -71, -81, 121, -79, -42, -53, -41, -43, -40, -44, -51, -36, -51, -120, -34, -36, -36, -120, -53, -35, -51, -120, -54, -41, -32, -120, -48, -51, -55, -52, -51, -38, -120, -50, -41, -35, -42, -52, -106, -110, -75, 121, -100, -86, -89, -69, -71, -71, -119, -86, -88, -76, -87, -86, -73, -109, -124, -100, -113, -60, -59, -59, -72, -67, -69, -69, -86};
                                }

                                static {
                                    A03();
                                    A03 = C0557Hx.A08(A02(100, 4, 7));
                                    A04 = C0557Hx.A08(A02(104, 4, 53));
                                    A05 = C0557Hx.A08(A02(108, 4, 43));
                                }

                                {
                                    A02(84, 16, 41);
                                    this.A01 = new C0541Hh();
                                    this.A00 = new G6();
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                @Override // com.facebook.ads.redexgen.X.BP
                                /* renamed from: A00, reason: merged with bridge method [inline-methods] */
                                public final VS A0b(byte[] bArr, int i, boolean z) throws FX {
                                    this.A01.A0b(bArr, i);
                                    ArrayList arrayList = new ArrayList();
                                    while (this.A01.A04() > 0) {
                                        if (this.A01.A04() >= 8) {
                                            int A08 = this.A01.A08();
                                            int boxSize = this.A01.A08();
                                            if (boxSize == A05) {
                                                arrayList.add(A01(this.A01, this.A00, A08 - 8));
                                            } else {
                                                this.A01.A0Z(A08 - 8);
                                            }
                                        } else {
                                            throw new FX(A02(0, 48, 47));
                                        }
                                    }
                                    return new VS(arrayList);
                                }

                                public static VR A01(C0541Hh c0541Hh, G6 g6, int i) throws FX {
                                    g6.A0E();
                                    while (i > 0) {
                                        if (i >= 8) {
                                            int boxSize = c0541Hh.A08();
                                            int A08 = c0541Hh.A08();
                                            int payloadLength = boxSize - 8;
                                            byte[] bArr = c0541Hh.A00;
                                            int boxSize2 = c0541Hh.A06();
                                            String A0R = C0557Hx.A0R(bArr, boxSize2, payloadLength);
                                            c0541Hh.A0Z(payloadLength);
                                            i = (i - 8) - payloadLength;
                                            int boxSize3 = A04;
                                            if (A08 == boxSize3) {
                                                G9.A08(A0R, g6);
                                            } else {
                                                int boxSize4 = A03;
                                                if (A08 == boxSize4) {
                                                    G9.A0C(null, A0R.trim(), g6, Collections.emptyList());
                                                }
                                            }
                                        } else {
                                            throw new FX(A02(48, 36, 76));
                                        }
                                    }
                                    return g6.A0D();
                                }
                            };
                        case 3:
                            return new BP() { // from class: com.facebook.ads.redexgen.X.2w
                                public static byte[] A01;
                                public static String[] A02 = {"ff17", "Epnx6L2Qdick8ldRQp4l7BnlSI8QmptE", "ljG9OFjVBzBRhwuqGOYC4vHmUbqYdsL6", "TMePV7blo4smW7duQxXAKVUeIZW7rpp7", "u0S9kmkdURLs6ByjnQg69vh6km8YA", "mjiuJPwHAboaZQPmxwSh", "1oI66QXJTVRsz3UkRyBrlAv9", "GPRnM1PB0ZzPL"};
                                public static final C0501Fr A03;
                                public static final C0502Fs A04;
                                public static final Pattern A05;
                                public static final Pattern A06;
                                public static final Pattern A07;
                                public static final Pattern A08;
                                public static final Pattern A09;
                                public final XmlPullParserFactory A00;

                                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                                /* JADX WARN: Code restructure failed: missing block: B:47:0x0129, code lost:
                                
                                    if (r3.equals(A08(1374, 1, 2)) != false) goto L22;
                                 */
                                /* JADX WARN: Failed to parse debug info
                                java.lang.ArrayIndexOutOfBoundsException
                                 */
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public static long A00(String str2, C0502Fs c0502Fs) throws FX {
                                    Matcher matcher = A06.matcher(str2);
                                    char c2 = 5;
                                    if (matcher.matches()) {
                                        double parseLong = (Long.parseLong(matcher.group(1)) * 3600) + (Long.parseLong(matcher.group(2)) * 60) + Long.parseLong(matcher.group(3));
                                        String group = matcher.group(4);
                                        double d = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
                                        double parseDouble = parseLong + (group != null ? Double.parseDouble(group) : 0.0d) + (matcher.group(5) != null ? Long.parseLong(r0) / c0502Fs.A00 : 0.0d);
                                        if (matcher.group(6) != null) {
                                            d = (Long.parseLong(r0) / c0502Fs.A01) / c0502Fs.A00;
                                        }
                                        return (long) (1000000.0d * (parseDouble + d));
                                    }
                                    Matcher matcher2 = A08.matcher(str2);
                                    if (!matcher2.matches()) {
                                        throw new FX(A08(556, 27, 97) + str2);
                                    }
                                    double parseDouble2 = Double.parseDouble(matcher2.group(1));
                                    String group2 = matcher2.group(2);
                                    switch (group2.hashCode()) {
                                        case 102:
                                            if (group2.equals(A08(1072, 1, 71))) {
                                                c2 = 4;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 104:
                                            if (group2.equals(A08(1178, 1, 57))) {
                                                c2 = 0;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 109:
                                            if (group2.equals(A08(1247, 1, 43))) {
                                                c2 = 1;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 115:
                                            if (group2.equals(A08(1302, 1, 19))) {
                                                c2 = 2;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 116:
                                            break;
                                        case 3494:
                                            if (group2.equals(A08(1256, 2, 14))) {
                                                c2 = 3;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        default:
                                            c2 = 65535;
                                            break;
                                    }
                                    switch (c2) {
                                        case 0:
                                            parseDouble2 *= 3600.0d;
                                            break;
                                        case 1:
                                            parseDouble2 *= 60.0d;
                                            break;
                                        case 3:
                                            parseDouble2 /= 1000.0d;
                                            break;
                                        case 4:
                                            float f = c0502Fs.A00;
                                            String[] strArr = A02;
                                            if (strArr[1].charAt(6) == strArr[3].charAt(6)) {
                                                throw new RuntimeException();
                                            }
                                            String[] strArr2 = A02;
                                            strArr2[4] = "C7awbwnIxZw0XVbEiadu7f1EszJQk";
                                            strArr2[6] = "UUwzzqvY4tAULpj2ZCY7OXZa";
                                            parseDouble2 /= f;
                                            break;
                                        case 5:
                                            parseDouble2 /= c0502Fs.A02;
                                            break;
                                    }
                                    return (long) (1000000.0d * parseDouble2);
                                }

                                public static String A08(int i, int i2, int i3) {
                                    byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
                                    for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                                        copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 73);
                                    }
                                    return new String(copyOfRange);
                                }

                                /* JADX WARN: Failed to parse debug info
                                java.lang.ArrayIndexOutOfBoundsException
                                 */
                                private Map<String, C0509Fz> A09(XmlPullParser xmlPullParser, Map<String, C0509Fz> map, Map<String, C0504Fu> map2, C0501Fr c0501Fr) throws IOException, XmlPullParserException {
                                    C0504Fu A042;
                                    do {
                                        xmlPullParser.next();
                                        String A082 = A08(1350, 5, 18);
                                        if (C0558Hy.A04(xmlPullParser, A082)) {
                                            String A002 = C0558Hy.A00(xmlPullParser, A082);
                                            C0509Fz A062 = A06(xmlPullParser, new C0509Fz());
                                            if (A002 != null) {
                                                String[] A0D = A0D(A002);
                                                for (String str2 : A0D) {
                                                    A062.A0E(map.get(str2));
                                                }
                                            }
                                            String A0M = A062.A0M();
                                            String[] strArr = A02;
                                            if (strArr[4].length() == strArr[6].length()) {
                                                throw new RuntimeException();
                                            }
                                            A02[0] = "X";
                                            if (A0M != null) {
                                                map.put(A062.A0M(), A062);
                                            }
                                        } else if (C0558Hy.A04(xmlPullParser, A08(1291, 6, 88)) && (A042 = A04(xmlPullParser, c0501Fr)) != null) {
                                            map2.put(A042.A07, A042);
                                        }
                                    } while (!C0558Hy.A03(xmlPullParser, A08(1179, 4, 18)));
                                    return map;
                                }

                                public static void A0A() {
                                    A01 = new byte[]{17, Ascii.SI, 69, 76, 9, Ascii.DC4, 56, 34, 59, 51, 57, 112, 35, 119, 52, 37, 50, 54, 35, 50, 119, Ascii.SI, 58, 59, 7, 34, 59, 59, 7, 54, 37, 36, 50, 37, 17, 54, 52, 35, 56, 37, 46, 119, 62, 57, 36, 35, 54, 57, 52, 50, 117, 82, 90, 95, 86, 87, 19, 67, 82, 65, 64, 90, 93, 84, 19, 81, 82, 80, 88, 84, 65, 92, 70, 93, 87, 19, 69, 82, 95, 70, 86, 9, 19, 116, 83, 91, 94, 87, 86, Ascii.DC2, 66, 83, 64, 65, 91, 92, 85, Ascii.DC2, 81, 93, 94, 93, 64, Ascii.DC2, 68, 83, 94, 71, 87, 8, Ascii.DC2, 49, Ascii.SYN, Ascii.RS, Ascii.ESC, Ascii.DC2, 19, 87, 7, Ascii.SYN, 5, 4, Ascii.RS, Ascii.EM, 16, 87, 17, Ascii.CAN, Ascii.EM, 3, 36, Ascii.RS, Ascii.CR, Ascii.DC2, 87, 1, Ascii.SYN, Ascii.ESC, 2, Ascii.DC2, 77, 87, 115, 93, 84, 85, 72, 83, 84, 93, Ascii.SUB, 87, 91, 86, 92, 85, 72, 87, 95, 94, Ascii.SUB, 89, 95, 86, 86, Ascii.SUB, 72, 95, 73, 85, 86, 79, 78, 83, 85, 84, 0, Ascii.SUB, 95, 113, 120, 121, 100, Byte.MAX_VALUE, 120, 113, 54, 100, 115, 113, Byte.MAX_VALUE, 121, 120, 54, 97, Byte.MAX_VALUE, 98, 126, 54, 123, 119, 122, 112, 121, 100, 123, 115, 114, 54, 115, 110, 98, 115, 120, 98, 44, 54, 79, 97, 104, 105, 116, 111, 104, 97, 38, 116, 99, 97, 111, 105, 104, 38, 113, 111, 114, 110, 38, 107, 103, 106, 96, 105, 116, 107, 99, 98, 38, 105, 116, 111, 97, 111, 104, 60, 38, 53, Ascii.ESC, Ascii.DC2, 19, Ascii.SO, Ascii.NAK, Ascii.DC2, Ascii.ESC, 92, Ascii.SO, Ascii.EM, Ascii.ESC, Ascii.NAK, 19, Ascii.DC2, 92, Ascii.VT, Ascii.NAK, 8, Ascii.DC4, 92, 9, Ascii.DC2, Ascii.SI, 9, Ascii.FF, Ascii.FF, 19, Ascii.SO, 8, Ascii.EM, Ascii.CAN, 92, Ascii.EM, 4, 8, Ascii.EM, Ascii.DC2, 8, 70, 92, 77, 99, 106, 107, 118, 109, 106, 99, 36, 118, 97, 99, 109, 107, 106, 36, 115, 109, 112, 108, 36, 113, 106, 119, 113, 116, 116, 107, 118, 112, 97, 96, 36, 107, 118, 109, 99, 109, 106, 62, 36, 50, Ascii.FS, Ascii.NAK, Ascii.DC4, 9, Ascii.DC2, Ascii.NAK, Ascii.FS, 91, 9, Ascii.RS, Ascii.FS, Ascii.DC2, Ascii.DC4, Ascii.NAK, 91, Ascii.FF, Ascii.DC2, Ascii.SI, 19, Ascii.DC4, Ascii.SO, Ascii.SI, 91, Ascii.SUB, Ascii.NAK, 91, Ascii.RS, 3, Ascii.SI, Ascii.RS, Ascii.NAK, Ascii.SI, 76, 98, 107, 106, 119, 108, 107, 98, 37, 119, 96, 98, 108, 106, 107, 37, 114, 108, 113, 109, 106, 112, 113, 37, 100, 107, 37, 106, 119, 108, 98, 108, 107, 108, 66, 75, 74, 87, 76, 75, 66, 5, 80, 75, 86, 80, 85, 85, 74, 87, 81, 64, 65, 5, 81, 68, 66, Ascii.US, 5, Ascii.CAN, 63, 39, 48, Base64.padSymbol, 56, 53, 113, 50, 52, Base64.padSymbol, Base64.padSymbol, 113, 35, 52, 34, 62, Base64.padSymbol, 36, 37, 56, 62, 63, 113, 79, 104, 112, 103, 106, 111, 98, 38, 99, 126, 118, 116, 99, 117, 117, 111, 105, 104, 38, 96, 105, 116, 38, 96, 105, 104, 114, 85, 111, 124, 99, 60, 38, 33, 53, Ascii.DC2, 10, Ascii.GS, 16, Ascii.NAK, Ascii.CAN, 92, Ascii.DC2, 9, 17, Ascii.RS, Ascii.EM, Ascii.SO, 92, 19, Ascii.SUB, 92, Ascii.EM, Ascii.DC2, 8, Ascii.SO, Ascii.NAK, Ascii.EM, Ascii.SI, 92, Ascii.SUB, 19, Ascii.SO, 92, Ascii.SUB, 19, Ascii.DC2, 8, 47, Ascii.NAK, 6, Ascii.EM, 70, 92, 97, 70, 94, 73, 68, 65, 76, 8, 93, 70, 65, 92, 8, 78, 71, 90, 8, 78, 71, 70, 92, 123, 65, 82, 77, Ascii.DC2, 8, Ascii.SI, 101, 73, 68, 78, 71, 90, 69, 77, 76, 8, 92, 65, 69, 77, 8, 77, 80, 88, 90, 77, 91, 91, 65, 71, 70, Ascii.DC2, 8, 90, 98, 123, 99, 126, 103, 123, 114, 55, 97, 118, 123, 98, 114, 100, 55, 126, 121, 55, 113, 120, 121, 99, 68, 126, 109, 114, 55, 118, 99, 99, 101, 126, 117, 98, 99, 114, 57, 55, 71, 126, 116, 124, 126, 121, 112, 55, 99, Byte.MAX_VALUE, 114, 55, 100, 114, 116, 120, 121, 115, 55, 97, 118, 123, 98, 114, 55, 113, 120, 101, 55, 97, 114, 101, 99, 126, 116, 118, 123, 55, 113, 120, 121, 99, 55, 100, 126, 109, 114, 55, 118, 121, 115, 55, 126, 112, 121, 120, 101, 126, 121, 112, 55, 99, Byte.MAX_VALUE, 114, 55, 113, 126, 101, 100, 99, 57, 56, Ascii.RS, Ascii.ESC, Ascii.ESC, Ascii.EM, Ascii.SO, Ascii.CAN, Ascii.CAN, 2, 5, Ascii.FF, 75, Ascii.ESC, 10, Ascii.EM, Ascii.CAN, Ascii.SO, Ascii.EM, 75, Ascii.SO, Ascii.EM, Ascii.EM, 4, Ascii.EM, 9, 41, 48, 49, Ascii.EM, 56, 62, 50, 57, 56, 47, 46, Ascii.NAK, Ascii.SUB, Ascii.EM, Ascii.ETB, Ascii.RS, 91, Ascii.SI, Ascii.DC4, 91, Ascii.US, Ascii.RS, Ascii.CAN, Ascii.DC4, Ascii.US, Ascii.RS, 91, 8, Ascii.DC4, Ascii.SO, 9, Ascii.CAN, Ascii.RS, 60, 7, Ascii.FF, 17, Ascii.EM, Ascii.FF, 10, Ascii.GS, Ascii.FF, Ascii.CR, 73, Ascii.FF, Ascii.ESC, Ascii.ESC, 6, Ascii.ESC, 73, Ascii.RS, 1, Ascii.FF, 7, 73, Ascii.ESC, Ascii.FF, 8, Ascii.CR, 0, 7, Ascii.SO, 73, 0, 7, Ascii.EM, Ascii.FS, Ascii.GS, 71, 72, 103, 63, 7, 113, 113, 2, 105, 116, 96, 4, 115, 119, 112, 102, 2, 105, 116, 96, 4, 114, 112, 113, 41, 33, 37, 60, 52, 37, 124, 112, 125, Ascii.SI, 121, 10, 97, 124, 104, Ascii.FF, 122, 121, 110, 107, Ascii.CR, Byte.MAX_VALUE, 10, 97, 124, 104, Ascii.FF, 122, 120, 110, 120, 121, 57, 45, 60, 45, 34, 45, 60, 34, 45, 55, 45, 37, 120, 117, 105, Ascii.US, 108, 7, Ascii.SUB, Ascii.SO, 106, 108, 7, Ascii.SUB, Ascii.SO, 106, Ascii.FS, Ascii.RS, Ascii.CR, Ascii.US, 108, 7, Ascii.SUB, Ascii.SO, 106, 108, 7, Ascii.SUB, Ascii.SO, 106, Ascii.RS, Ascii.CR, Ascii.US, 108, 7, Ascii.SUB, Ascii.SO, 106, 108, 7, Ascii.SUB, Ascii.SO, 106, Ascii.RS, Ascii.US, 8, Ascii.CR, Ascii.US, 107, Ascii.EM, 108, 7, Ascii.SUB, Ascii.SO, 106, Ascii.FS, Ascii.RS, 75, Ascii.CR, Ascii.US, 108, 7, Ascii.SUB, Ascii.SO, 106, 108, 7, Ascii.SUB, Ascii.SO, 106, Ascii.RS, Ascii.US, 8, Ascii.CR, 107, Ascii.EM, Ascii.US, 108, 7, Ascii.SUB, Ascii.SO, 106, Ascii.FS, Ascii.RS, Ascii.RS, 8, Ascii.RS, 8, 19, Ascii.SI, 121, Ascii.CR, 53, 122, 120, 113, 121, Ascii.CR, 53, 122, 120, 117, 46, 88, 44, Ascii.DC4, 91, 44, 94, 79, 44, Ascii.DC4, 90, 79, 89, 85, 80, 88, 44, Ascii.DC4, 91, 44, 94, 79, 44, Ascii.DC4, 90, 79, 89, 85, 84, 113, 118, 100, 117, 98, 83, 80, 82, 90, 86, 67, 94, 68, 95, 85, 114, 94, 
                                    93, 94, 67, 94, 89, 91, 85, 82, 71, 74, 65, 92, 10, 7, 4, Ascii.FF, Ascii.EM, 9, 109, 107, 98, 98, 92, 107, 125, 97, 98, 123, 122, 103, 97, 96, 48, 54, Base64.padSymbol, 39, 54, 33, 35, 47, 44, 47, 50, 91, 86, 76, 79, 83, 94, 70, 126, 83, 86, 88, 81, Ascii.SO, 3, Ascii.FS, 78, 95, 88, Ascii.DC2, Ascii.SUB, 96, 107, 97, 71, 90, 86, 71, 76, 86, 104, 125, 116, 117, 111, 93, 122, 118, 114, 119, 98, 95, 86, 87, 77, 106, 80, 67, 92, 4, Ascii.CR, Ascii.FF, Ascii.SYN, 49, Ascii.SYN, Ascii.ESC, Ascii.SO, 7, 33, 40, 41, 51, 16, 34, 46, 32, 47, 51, 111, 123, 104, 100, 108, 91, 104, 125, 108, 91, 79, 92, 80, 88, 111, 92, 73, 88, 112, 72, 81, 73, 84, 77, 81, 84, 88, 79, 46, 58, 41, 37, 45, Ascii.SUB, 41, 60, 45, 5, Base64.padSymbol, 36, 60, 33, 56, 36, 33, 45, 58, 104, 44, 39, 45, 59, 38, 111, 60, 104, 32, 41, 62, 45, 104, 122, 104, 56, 41, 58, 60, 59, Ascii.CAN, 51, 62, 58, 63, 126, 98, 98, 102, 44, 57, 57, 97, 97, 97, 56, 97, 37, 56, 121, 100, 113, 57, 120, 101, 57, 98, 98, 123, 122, 53, 102, 119, 100, 119, 123, 115, 98, 115, 100, 68, 73, Byte.MAX_VALUE, 98, 119, 122, Byte.MAX_VALUE, 117, 116, 121, 97, 119, 109, 108, Ascii.SUB, 19, 16, 2, Ascii.FS, Ascii.EM, Ascii.RS, Ascii.NAK, 4, Ascii.CAN, 2, Ascii.US, 5, Ascii.ETB, Ascii.CAN, Ascii.SI, 84, 92, 77, 88, 93, 88, 77, 88, 42, 52, 48, 49, 50, 55, 48, 59, 42, 54, 44, 49, 43, 57, 54, 90, 91, 65, 90, 80, 81, 70, 88, 93, 90, 81, 122, 103, 124, 114, 124, 123, 95, Ascii.SI, 7, 99, 116, 118, 120, 126, Byte.MAX_VALUE, 54, 45, 35, 44, 48, 41, 77, 83, 78, 74, 91, 4, 90, 95, 74, 95, 99, 125, 96, 100, 117, 42, 121, 125, 113, 119, 117, 54, 40, 53, 49, 32, Byte.MAX_VALUE, 44, 43, 35, 42, 55, 40, 36, 49, 44, 42, 43, 90, 89, 72, 71, 94, 89, 76, 95, 89, 40, 47, 34, 55, 62, 124, 123, 118, 99, 102, 97, 104, 47, 41, 62, Ascii.SUB, 46, Base64.padSymbol, 49, 57, Ascii.SO, Base64.padSymbol, 40, 57, 63, 85, 68, 89, 85, 96, 77, 72, 70, 79, Ascii.ESC, 10, Ascii.ETB, Ascii.ESC, 43, 10, Ascii.FF, 0, Ascii.GS, Ascii.SO, Ascii.ESC, 6, 0, 1, 48, 45, 39, 47, Ascii.SYN, 37, 48, 33, 51, 51, 9, Ascii.DC2, Ascii.CAN, Ascii.EM, Ascii.SO, 16, Ascii.NAK, Ascii.DC2, Ascii.EM};
                                }

                                static {
                                    A0A();
                                    A06 = Pattern.compile(A08(856, 85, 126));
                                    A08 = Pattern.compile(A08(819, 37, 24));
                                    A07 = Pattern.compile(A08(790, 29, 16));
                                    A09 = Pattern.compile(A08(954, 29, 57));
                                    A05 = Pattern.compile(A08(941, 13, 24));
                                    A04 = new C0502Fs(30.0f, 1, 1);
                                    A03 = new C0501Fr(32, 15);
                                }

                                {
                                    A08(717, 11, 20);
                                    try {
                                        XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
                                        this.A00 = newInstance;
                                        newInstance.setNamespaceAware(true);
                                    } catch (XmlPullParserException e) {
                                        throw new RuntimeException(A08(5, 45, 30), e);
                                    }
                                }

                                private C0501Fr A01(XmlPullParser xmlPullParser, C0501Fr c0501Fr) throws FX {
                                    String attributeValue = xmlPullParser.getAttributeValue(A08(1183, 35, 95), A08(PointerIconCompat.TYPE_ZOOM_IN, 14, 71));
                                    if (attributeValue == null) {
                                        return c0501Fr;
                                    }
                                    Matcher matcher = A05.matcher(attributeValue);
                                    boolean matches = matcher.matches();
                                    String A082 = A08(Opcodes.D2I, 36, 115);
                                    String A083 = A08(717, 11, 20);
                                    if (!matches) {
                                        String cellResolution = A082 + attributeValue;
                                        Log.w(A083, cellResolution);
                                        return c0501Fr;
                                    }
                                    try {
                                        String cellResolution2 = matcher.group(1);
                                        int parseInt = Integer.parseInt(cellResolution2);
                                        String cellResolution3 = matcher.group(2);
                                        int parseInt2 = Integer.parseInt(cellResolution3);
                                        if (parseInt != 0 && parseInt2 != 0) {
                                            return new C0501Fr(parseInt, parseInt2);
                                        }
                                        StringBuilder sb = new StringBuilder();
                                        String cellResolution4 = A08(430, 24, 24);
                                        StringBuilder append = sb.append(cellResolution4).append(parseInt);
                                        String cellResolution5 = A08(0, 1, 120);
                                        throw new FX(append.append(cellResolution5).append(parseInt2).toString());
                                    } catch (NumberFormatException unused) {
                                        String cellResolution6 = A082 + attributeValue;
                                        Log.w(A083, cellResolution6);
                                        return c0501Fr;
                                    }
                                }

                                private C0502Fs A02(XmlPullParser xmlPullParser) throws FX {
                                    int subFrameRate = 30;
                                    String A082 = A08(1110, 9, 64);
                                    String subFrameRateString = A08(1183, 35, 95);
                                    String attributeValue = xmlPullParser.getAttributeValue(subFrameRateString, A082);
                                    if (attributeValue != null) {
                                        subFrameRate = Integer.parseInt(attributeValue);
                                    }
                                    float f = 1.0f;
                                    String attributeValue2 = xmlPullParser.getAttributeValue(subFrameRateString, A08(1119, 19, 116));
                                    if (attributeValue2 != null) {
                                        String[] A0l = C0557Hx.A0l(attributeValue2, A08(0, 1, 120));
                                        if (A0l.length == 2) {
                                            int frameRate = Integer.parseInt(A0l[0]);
                                            float f2 = frameRate;
                                            int frameRate2 = Integer.parseInt(A0l[1]);
                                            f = f2 / frameRate2;
                                        } else {
                                            String frameRateString = A08(1138, 40, 1);
                                            throw new FX(frameRateString);
                                        }
                                    }
                                    C0502Fs c0502Fs = A04;
                                    int i = c0502Fs.A01;
                                    String attributeValue3 = xmlPullParser.getAttributeValue(subFrameRateString, A08(1362, 12, 21));
                                    if (attributeValue3 != null) {
                                        i = Integer.parseInt(attributeValue3);
                                    }
                                    int i2 = c0502Fs.A02;
                                    String attributeValue4 = xmlPullParser.getAttributeValue(subFrameRateString, A08(1398, 8, 13));
                                    if (attributeValue4 != null) {
                                        i2 = Integer.parseInt(attributeValue4);
                                    }
                                    return new C0502Fs(subFrameRate * f, i, i2);
                                }

                                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                                /* JADX WARN: Removed duplicated region for block: B:11:0x0048  */
                                /* JADX WARN: Removed duplicated region for block: B:13:0x004d  */
                                /* JADX WARN: Removed duplicated region for block: B:15:0x0052  */
                                /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
                                /* JADX WARN: Removed duplicated region for block: B:31:0x003e A[SYNTHETIC] */
                                /* JADX WARN: Removed duplicated region for block: B:8:0x0043  */
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                private C0503Ft A03(XmlPullParser xmlPullParser, C0503Ft c0503Ft, Map<String, C0504Fu> map, C0502Fs c0502Fs) throws FX {
                                    char c2;
                                    C02022w c02022w = this;
                                    long j = -9223372036854775807L;
                                    long j2 = -9223372036854775807L;
                                    long startTime = -9223372036854775807L;
                                    String A082 = A08(0, 0, 58);
                                    String[] strArr = null;
                                    int attributeCount = xmlPullParser.getAttributeCount();
                                    C0509Fz A062 = c02022w.A06(xmlPullParser, null);
                                    int i = 0;
                                    while (i < attributeCount) {
                                        String attributeName = xmlPullParser.getAttributeName(i);
                                        String attributeValue = xmlPullParser.getAttributeValue(i);
                                        switch (attributeName.hashCode()) {
                                            case -934795532:
                                                if (A02[2].charAt(7) == 'x') {
                                                    throw new RuntimeException();
                                                }
                                                String[] strArr2 = A02;
                                                strArr2[5] = "jtebo7lmLiOwGkcoeI6I";
                                                strArr2[7] = "LXAFSQOg38u3m";
                                                if (attributeName.equals(A08(1291, 6, 88))) {
                                                    c2 = 4;
                                                    switch (c2) {
                                                        case 0:
                                                            j2 = A00(attributeValue, c0502Fs);
                                                            break;
                                                        case 1:
                                                            startTime = A00(attributeValue, c0502Fs);
                                                            break;
                                                        case 2:
                                                            j = A00(attributeValue, c0502Fs);
                                                            break;
                                                        case 3:
                                                            String[] A0D = c02022w.A0D(attributeValue);
                                                            if (A0D.length <= 0) {
                                                                break;
                                                            } else {
                                                                strArr = A0D;
                                                                break;
                                                            }
                                                        case 4:
                                                            boolean containsKey = map.containsKey(attributeValue);
                                                            String[] strArr3 = A02;
                                                            if (strArr3[5].length() == strArr3[7].length()) {
                                                                throw new RuntimeException();
                                                            }
                                                            String[] strArr4 = A02;
                                                            strArr4[5] = "Eb74ghscuywKtVeWCrPT";
                                                            strArr4[7] = "vurVSidhOtwIg";
                                                            if (!containsKey) {
                                                                break;
                                                            } else {
                                                                A082 = attributeValue;
                                                                break;
                                                            }
                                                    }
                                                    i++;
                                                    c02022w = this;
                                                }
                                                c2 = 65535;
                                                switch (c2) {
                                                }
                                                i++;
                                                c02022w = this;
                                                break;
                                            case 99841:
                                                if (attributeName.equals(A08(1058, 3, 99))) {
                                                    c2 = 2;
                                                    switch (c2) {
                                                    }
                                                    i++;
                                                    c02022w = this;
                                                }
                                                c2 = 65535;
                                                switch (c2) {
                                                }
                                                i++;
                                                c02022w = this;
                                                break;
                                            case 100571:
                                                if (attributeName.equals(A08(1063, 3, 76))) {
                                                    c2 = 1;
                                                    switch (c2) {
                                                    }
                                                    i++;
                                                    c02022w = this;
                                                }
                                                c2 = 65535;
                                                switch (c2) {
                                                }
                                                i++;
                                                c02022w = this;
                                                break;
                                            case 93616297:
                                                if (attributeName.equals(A08(PointerIconCompat.TYPE_HELP, 5, 117))) {
                                                    c2 = 0;
                                                    switch (c2) {
                                                    }
                                                    i++;
                                                    c02022w = this;
                                                }
                                                c2 = 65535;
                                                switch (c2) {
                                                }
                                                i++;
                                                c02022w = this;
                                                break;
                                            case 109780401:
                                                if (attributeName.equals(A08(1350, 5, 18))) {
                                                    c2 = 3;
                                                    switch (c2) {
                                                    }
                                                    i++;
                                                    c02022w = this;
                                                }
                                                c2 = 65535;
                                                switch (c2) {
                                                }
                                                i++;
                                                c02022w = this;
                                                break;
                                            default:
                                                c2 = 65535;
                                                switch (c2) {
                                                }
                                                i++;
                                                c02022w = this;
                                                break;
                                        }
                                    }
                                    if (c0503Ft != null && c0503Ft.A02 != -9223372036854775807L) {
                                        if (j2 != -9223372036854775807L) {
                                            j2 += c0503Ft.A02;
                                        }
                                        if (startTime != -9223372036854775807L) {
                                            startTime += c0503Ft.A02;
                                        }
                                    }
                                    if (startTime == -9223372036854775807L) {
                                        if (j != -9223372036854775807L) {
                                            startTime = j2 + j;
                                        } else if (c0503Ft != null && c0503Ft.A01 != -9223372036854775807L) {
                                            startTime = c0503Ft.A01;
                                        }
                                    }
                                    return C0503Ft.A05(xmlPullParser.getName(), j2, startTime, A062, strArr, A082);
                                }

                                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                                /* JADX WARN: Code restructure failed: missing block: B:36:0x0110, code lost:
                                
                                    if (r3.equals(A08(983, 5, 89)) != false) goto L25;
                                 */
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                private C0504Fu A04(XmlPullParser xmlPullParser, C0501Fr c0501Fr) {
                                    String regionId = C0558Hy.A00(xmlPullParser, A08(1218, 2, 100));
                                    if (regionId == null) {
                                        return null;
                                    }
                                    String A002 = C0558Hy.A00(xmlPullParser, A08(1282, 6, 92));
                                    String A082 = A08(717, 11, 20);
                                    String[] strArr = A02;
                                    if (strArr[5].length() != strArr[7].length()) {
                                        String[] strArr2 = A02;
                                        strArr2[5] = "BVX9IxOC0W1HmSeSxl1M";
                                        strArr2[7] = "L9bqvqqPb1db8";
                                        if (A002 != null) {
                                            Pattern pattern = A09;
                                            Matcher matcher = pattern.matcher(A002);
                                            if (matcher.matches()) {
                                                char c2 = 1;
                                                try {
                                                    float parseFloat = Float.parseFloat(matcher.group(1)) / 100.0f;
                                                    float position = Float.parseFloat(matcher.group(2)) / 100.0f;
                                                    String A003 = C0558Hy.A00(xmlPullParser, A08(1066, 6, 107));
                                                    if (A003 != null) {
                                                        Matcher matcher2 = pattern.matcher(A003);
                                                        if (matcher2.matches()) {
                                                            try {
                                                                float parseFloat2 = Float.parseFloat(matcher2.group(1)) / 100.0f;
                                                                float parseFloat3 = Float.parseFloat(matcher2.group(2)) / 100.0f;
                                                                int i = 0;
                                                                String[] strArr3 = A02;
                                                                if (strArr3[1].charAt(6) != strArr3[3].charAt(6)) {
                                                                    String[] strArr4 = A02;
                                                                    strArr4[4] = "RdzjINTKuygb2XRVfMf348I8lMwh8";
                                                                    strArr4[6] = "OTpcuYV4nCRIsN2XcdJQrDrj";
                                                                    String A004 = C0558Hy.A00(xmlPullParser, A08(1043, 12, 118));
                                                                    if (A004 != null) {
                                                                        String A0M = C0557Hx.A0M(A004);
                                                                        float width = A0M.hashCode();
                                                                        switch (width) {
                                                                            case -8.1307995E-11f:
                                                                                if (A0M.equals(A08(1032, 6, 26))) {
                                                                                    c2 = 0;
                                                                                    break;
                                                                                }
                                                                                c2 = 65535;
                                                                                break;
                                                                            case 1.2697491E-35f:
                                                                                break;
                                                                            default:
                                                                                c2 = 65535;
                                                                                break;
                                                                        }
                                                                        switch (c2) {
                                                                            case 0:
                                                                                i = 1;
                                                                                position += parseFloat3 / 2.0f;
                                                                                break;
                                                                            case 1:
                                                                                i = 2;
                                                                                position += parseFloat3;
                                                                                break;
                                                                        }
                                                                    }
                                                                    float width2 = c0501Fr.A01;
                                                                    float line = 1.0f / width2;
                                                                    return new C0504Fu(regionId, parseFloat, position, 0, i, parseFloat2, 1, line);
                                                                }
                                                            } catch (NumberFormatException unused) {
                                                                Log.w(A082, A08(Opcodes.GETSTATIC, 39, 95) + A002);
                                                                return null;
                                                            }
                                                        } else {
                                                            Log.w(A082, A08(256, 41, 53) + A002);
                                                            return null;
                                                        }
                                                    } else {
                                                        Log.w(A082, A08(338, 33, 50));
                                                        return null;
                                                    }
                                                } catch (NumberFormatException unused2) {
                                                    Log.w(A082, A08(217, 39, 79) + A002);
                                                    return null;
                                                }
                                            } else {
                                                Log.w(A082, A08(297, 41, 77) + A002);
                                                return null;
                                            }
                                        } else {
                                            Log.w(A082, A08(371, 33, 76));
                                            return null;
                                        }
                                    }
                                    throw new RuntimeException();
                                }

                                private C0509Fz A05(C0509Fz c0509Fz) {
                                    return c0509Fz == null ? new C0509Fz() : c0509Fz;
                                }

                                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                                /* JADX WARN: Code restructure failed: missing block: B:101:0x026c, code lost:
                                
                                    if (r5.equals(A08(1258, 13, 23)) != false) goto L75;
                                 */
                                /* JADX WARN: Code restructure failed: missing block: B:102:0x026e, code lost:
                                
                                    r11 = 1;
                                 */
                                /* JADX WARN: Code restructure failed: missing block: B:104:0x0278, code lost:
                                
                                    if (r5.equals(A08(1258, 13, 23)) != false) goto L75;
                                 */
                                /* JADX WARN: Code restructure failed: missing block: B:125:0x0304, code lost:
                                
                                    if (r8.equals(A08(1073, 10, 82)) != false) goto L95;
                                 */
                                /* JADX WARN: Code restructure failed: missing block: B:126:0x0306, code lost:
                                
                                    r10 = 3;
                                 */
                                /* JADX WARN: Code restructure failed: missing block: B:128:0x031f, code lost:
                                
                                    if (r8.equals(A08(1073, 10, 42)) != false) goto L95;
                                 */
                                /* JADX WARN: Code restructure failed: missing block: B:65:0x0162, code lost:
                                
                                    if (r3.equals(A08(1032, 6, 26)) != false) goto L31;
                                 */
                                /* JADX WARN: Code restructure failed: missing block: B:67:0x016f, code lost:
                                
                                    if (r3.equals(A08(1032, 6, 26)) != false) goto L31;
                                 */
                                /* JADX WARN: Code restructure failed: missing block: B:97:0x0241, code lost:
                                
                                    if (r5.equals(A08(1408, 9, 53)) != false) goto L63;
                                 */
                                /* JADX WARN: Removed duplicated region for block: B:115:0x03ac A[SYNTHETIC] */
                                /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                private C0509Fz A06(XmlPullParser xmlPullParser, C0509Fz c0509Fz) {
                                    char c2;
                                    int i;
                                    int attributeCount = xmlPullParser.getAttributeCount();
                                    for (int i2 = 0; i2 < attributeCount; i2++) {
                                        String attributeValue = xmlPullParser.getAttributeValue(i2);
                                        String attributeName = xmlPullParser.getAttributeName(i2);
                                        int attributeCount2 = attributeName.hashCode();
                                        char c3 = 4;
                                        char c4 = 2;
                                        switch (attributeCount2) {
                                            case -1550943582:
                                                String A082 = A08(1091, 9, 43);
                                                int i3 = A02[2].charAt(7);
                                                if (i3 == 120) {
                                                    throw new RuntimeException();
                                                }
                                                String[] strArr = A02;
                                                strArr[1] = "QxuUNrowWOj1nrz0sXV08JFi2hQMydEb";
                                                strArr[3] = "AZnGdWrcIt83BDgiFAV9TosnkrcA9Afh";
                                                if (attributeName.equals(A082)) {
                                                    c2 = 6;
                                                    i = A02[0].length();
                                                    if (i == 25) {
                                                        A02[0] = "6RPCn5PPZXNOVK1K";
                                                        String A083 = A08(717, 11, 20);
                                                        switch (c2) {
                                                            case 0:
                                                                if (A08(1350, 5, 18).equals(xmlPullParser.getName())) {
                                                                    c0509Fz = A05(c0509Fz).A0G(attributeValue);
                                                                } else {
                                                                    continue;
                                                                }
                                                            case 1:
                                                                c0509Fz = A05(c0509Fz);
                                                                try {
                                                                    int attributeCount3 = HN.A03(attributeValue);
                                                                    c0509Fz.A0A(attributeCount3);
                                                                    continue;
                                                                } catch (IllegalArgumentException unused) {
                                                                    Log.w(A083, A08(50, 33, 122) + attributeValue);
                                                                }
                                                            case 2:
                                                                c0509Fz = A05(c0509Fz);
                                                                try {
                                                                    int attributeCount4 = HN.A03(attributeValue);
                                                                    c0509Fz.A0B(attributeCount4);
                                                                    continue;
                                                                } catch (IllegalArgumentException unused2) {
                                                                    Log.w(A083, A08(83, 28, 123) + attributeValue);
                                                                }
                                                            case 3:
                                                                C0509Fz A052 = A05(c0509Fz);
                                                                int i4 = A02[2].charAt(7);
                                                                if (i4 == 120) {
                                                                    throw new RuntimeException();
                                                                }
                                                                String[] strArr2 = A02;
                                                                strArr2[1] = "H8hLhiq5d54a1qBuq5UsZG3FOC57WeTu";
                                                                strArr2[3] = "rkHrDxFmjDVxlAmyY15NKmfVeVuakzFj";
                                                                c0509Fz = A052.A0F(attributeValue);
                                                                continue;
                                                            case 4:
                                                                try {
                                                                    c0509Fz = A05(c0509Fz);
                                                                    A0B(attributeValue, c0509Fz);
                                                                    continue;
                                                                } catch (FX unused3) {
                                                                    Log.w(A083, A08(111, 31, 62) + attributeValue);
                                                                }
                                                            case 5:
                                                                c0509Fz = A05(c0509Fz).A0H(A08(PointerIconCompat.TYPE_NO_DROP, 4, 33).equalsIgnoreCase(attributeValue));
                                                                continue;
                                                            case 6:
                                                                c0509Fz = A05(c0509Fz).A0I(A08(1220, 6, 95).equalsIgnoreCase(attributeValue));
                                                                continue;
                                                            case 7:
                                                                String A0M = C0557Hx.A0M(attributeValue);
                                                                int attributeCount5 = A0M.hashCode();
                                                                switch (attributeCount5) {
                                                                    case -1364013995:
                                                                        String[] strArr3 = A02;
                                                                        String str2 = strArr3[5];
                                                                        String str3 = strArr3[7];
                                                                        int i5 = str2.length();
                                                                        int attributeCount6 = str3.length();
                                                                        if (i5 != attributeCount6) {
                                                                            A02[2] = "8IkO1gtPquOIMMTI4o0zmbBu59F0heCH";
                                                                            break;
                                                                        } else {
                                                                            break;
                                                                        }
                                                                    case 100571:
                                                                        if (A0M.equals(A08(1063, 3, 76))) {
                                                                            c3 = 3;
                                                                            break;
                                                                        }
                                                                        c3 = 65535;
                                                                        break;
                                                                    case 3317767:
                                                                        if (A0M.equals(A08(1232, 4, 63))) {
                                                                            c3 = 0;
                                                                            break;
                                                                        }
                                                                        c3 = 65535;
                                                                        break;
                                                                    case 108511772:
                                                                        if (A0M.equals(A08(1297, 5, 13))) {
                                                                            c3 = 2;
                                                                            break;
                                                                        }
                                                                        c3 = 65535;
                                                                        break;
                                                                    case 109757538:
                                                                        if (A0M.equals(A08(1345, 5, 100))) {
                                                                            c3 = 1;
                                                                            break;
                                                                        }
                                                                        c3 = 65535;
                                                                        break;
                                                                    default:
                                                                        c3 = 65535;
                                                                        break;
                                                                }
                                                                switch (c3) {
                                                                    case 0:
                                                                        c0509Fz = A05(c0509Fz).A0D(Layout.Alignment.ALIGN_NORMAL);
                                                                        continue;
                                                                    case 1:
                                                                        C0509Fz A053 = A05(c0509Fz);
                                                                        String[] strArr4 = A02;
                                                                        String str4 = strArr4[5];
                                                                        String str5 = strArr4[7];
                                                                        int i6 = str4.length();
                                                                        int attributeCount7 = str5.length();
                                                                        if (i6 == attributeCount7) {
                                                                            break;
                                                                        } else {
                                                                            String[] strArr5 = A02;
                                                                            strArr5[5] = "IVKgZ6okjNrbAau3W10R";
                                                                            strArr5[7] = "16YLUHvqIySRh";
                                                                            c0509Fz = A053.A0D(Layout.Alignment.ALIGN_NORMAL);
                                                                        }
                                                                    case 2:
                                                                        c0509Fz = A05(c0509Fz).A0D(Layout.Alignment.ALIGN_OPPOSITE);
                                                                        continue;
                                                                    case 3:
                                                                        c0509Fz = A05(c0509Fz).A0D(Layout.Alignment.ALIGN_OPPOSITE);
                                                                        continue;
                                                                    case 4:
                                                                        c0509Fz = A05(c0509Fz).A0D(Layout.Alignment.ALIGN_CENTER);
                                                                        continue;
                                                                    default:
                                                                        continue;
                                                                }
                                                            case '\b':
                                                                String A0M2 = C0557Hx.A0M(attributeValue);
                                                                int attributeCount8 = A0M2.hashCode();
                                                                switch (attributeCount8) {
                                                                    case -1461280213:
                                                                        if (A0M2.equals(A08(1271, 11, 125))) {
                                                                            c4 = 3;
                                                                            break;
                                                                        }
                                                                        c4 = 65535;
                                                                        break;
                                                                    case -1026963764:
                                                                        break;
                                                                    case 913457136:
                                                                        int i7 = A02[2].charAt(7);
                                                                        if (i7 != 120) {
                                                                            String[] strArr6 = A02;
                                                                            strArr6[4] = "R2KyHN0FOwK5MnUo7YbTUMpQ5PoRi";
                                                                            strArr6[6] = "VsEANZg47j2qMqZ7rRVzz7mw";
                                                                            break;
                                                                        } else {
                                                                            break;
                                                                        }
                                                                    case 1679736913:
                                                                        if (A0M2.equals(A08(1236, 11, 57))) {
                                                                            c4 = 0;
                                                                            break;
                                                                        }
                                                                        c4 = 65535;
                                                                        break;
                                                                    default:
                                                                        c4 = 65535;
                                                                        break;
                                                                }
                                                                switch (c4) {
                                                                    case 0:
                                                                        c0509Fz = A05(c0509Fz).A0J(true);
                                                                        continue;
                                                                    case 1:
                                                                        c0509Fz = A05(c0509Fz).A0J(false);
                                                                        break;
                                                                    case 2:
                                                                        c0509Fz = A05(c0509Fz).A0K(true);
                                                                        break;
                                                                    case 3:
                                                                        c0509Fz = A05(c0509Fz).A0K(false);
                                                                        break;
                                                                }
                                                                break;
                                                            default:
                                                        }
                                                    }
                                                    throw new RuntimeException();
                                                }
                                                c2 = 65535;
                                                i = A02[0].length();
                                                if (i == 25) {
                                                }
                                                throw new RuntimeException();
                                            case -1224696685:
                                                int i8 = A02[0].length();
                                                if (i8 != 25) {
                                                    A02[0] = "eSj";
                                                    break;
                                                } else {
                                                    String[] strArr7 = A02;
                                                    strArr7[4] = "qjJBWaQLGTYykdeaQVpdDbXd6or87";
                                                    strArr7[6] = "pJb2qQFYJcmpINAVkV969GMx";
                                                    break;
                                                }
                                                i = A02[0].length();
                                                if (i == 25) {
                                                }
                                                throw new RuntimeException();
                                            case -1065511464:
                                                if (attributeName.equals(A08(1375, 9, 104))) {
                                                    c2 = 7;
                                                    i = A02[0].length();
                                                    if (i == 25) {
                                                    }
                                                    throw new RuntimeException();
                                                }
                                                c2 = 65535;
                                                i = A02[0].length();
                                                if (i == 25) {
                                                }
                                                throw new RuntimeException();
                                            case -879295043:
                                                if (attributeName.equals(A08(1384, 14, 38))) {
                                                    c2 = '\b';
                                                    i = A02[0].length();
                                                    if (i == 25) {
                                                    }
                                                    throw new RuntimeException();
                                                }
                                                c2 = 65535;
                                                i = A02[0].length();
                                                if (i == 25) {
                                                }
                                                throw new RuntimeException();
                                            case -734428249:
                                                if (attributeName.equals(A08(1100, 10, 14))) {
                                                    c2 = 5;
                                                    i = A02[0].length();
                                                    if (i == 25) {
                                                    }
                                                    throw new RuntimeException();
                                                }
                                                c2 = 65535;
                                                i = A02[0].length();
                                                if (i == 25) {
                                                }
                                                throw new RuntimeException();
                                            case 3355:
                                                if (attributeName.equals(A08(1218, 2, 100))) {
                                                    c2 = 0;
                                                    i = A02[0].length();
                                                    if (i == 25) {
                                                    }
                                                    throw new RuntimeException();
                                                }
                                                c2 = 65535;
                                                i = A02[0].length();
                                                if (i == 25) {
                                                }
                                                throw new RuntimeException();
                                            case 94842723:
                                                if (attributeName.equals(A08(1038, 5, 9))) {
                                                    c2 = 2;
                                                    i = A02[0].length();
                                                    if (i == 25) {
                                                    }
                                                    throw new RuntimeException();
                                                }
                                                c2 = 65535;
                                                i = A02[0].length();
                                                if (i == 25) {
                                                }
                                                throw new RuntimeException();
                                            case 365601008:
                                                if (attributeName.equals(A08(1083, 8, 112))) {
                                                    c2 = 4;
                                                    i = A02[0].length();
                                                    if (i == 25) {
                                                    }
                                                    throw new RuntimeException();
                                                }
                                                c2 = 65535;
                                                i = A02[0].length();
                                                if (i == 25) {
                                                }
                                                throw new RuntimeException();
                                            case 1287124693:
                                                if (attributeName.equals(A08(988, 15, 120))) {
                                                    c2 = 1;
                                                    i = A02[0].length();
                                                    if (i == 25) {
                                                    }
                                                    throw new RuntimeException();
                                                }
                                                c2 = 65535;
                                                i = A02[0].length();
                                                if (i == 25) {
                                                }
                                                throw new RuntimeException();
                                            default:
                                                c2 = 65535;
                                                i = A02[0].length();
                                                if (i == 25) {
                                                }
                                                throw new RuntimeException();
                                        }
                                    }
                                    return c0509Fz;
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                @Override // com.facebook.ads.redexgen.X.BP
                                /* renamed from: A07, reason: merged with bridge method [inline-methods] */
                                public final VU A0b(byte[] bArr, int i, boolean z) throws FX {
                                    try {
                                        XmlPullParser newPullParser = this.A00.newPullParser();
                                        HashMap hashMap = new HashMap();
                                        HashMap hashMap2 = new HashMap();
                                        hashMap2.put(A08(0, 0, 58), new C0504Fu(null));
                                        try {
                                            newPullParser.setInput(new ByteArrayInputStream(bArr, 0, i), null);
                                            VU vu = null;
                                            ArrayDeque arrayDeque = new ArrayDeque();
                                            int i2 = 0;
                                            C0502Fs c0502Fs = A04;
                                            C0501Fr c0501Fr = A03;
                                            if (A02[0].length() != 25) {
                                                A02[2] = "Ton6pta07Fc5fwLRetsjRgmhhTZnbfi2";
                                                for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                                                    C0503Ft c0503Ft = (C0503Ft) arrayDeque.peek();
                                                    String[] strArr = A02;
                                                    if (strArr[5].length() == strArr[7].length()) {
                                                        throw new RuntimeException();
                                                    }
                                                    String[] strArr2 = A02;
                                                    strArr2[5] = "ndGR1PBeuf2R1G0tg1U3";
                                                    strArr2[7] = "UjY46IM5njUbD";
                                                    if (i2 == 0) {
                                                        String name = newPullParser.getName();
                                                        String A082 = A08(1406, 2, 14);
                                                        if (eventType == 2) {
                                                            if (A082.equals(name)) {
                                                                c0502Fs = A02(newPullParser);
                                                                c0501Fr = A01(newPullParser, A03);
                                                            }
                                                            boolean A0C = A0C(name);
                                                            String A083 = A08(717, 11, 20);
                                                            if (!A0C) {
                                                                Log.i(A083, A08(TTAdConstant.DEEPLINK_FALLBACK_CODE, 26, 108) + newPullParser.getName());
                                                                i2++;
                                                            } else if (A08(1179, 4, 18).equals(name)) {
                                                                A09(newPullParser, hashMap, hashMap2, c0501Fr);
                                                            } else {
                                                                try {
                                                                    C0503Ft node = A03(newPullParser, c0503Ft, hashMap2, c0502Fs);
                                                                    arrayDeque.push(node);
                                                                    if (c0503Ft != null) {
                                                                        c0503Ft.A0E(node);
                                                                    }
                                                                } catch (FX e) {
                                                                    Log.w(A083, A08(693, 24, 34), e);
                                                                    i2++;
                                                                }
                                                            }
                                                        } else {
                                                            if (A02[2].charAt(7) == 'x') {
                                                                throw new RuntimeException();
                                                            }
                                                            String[] strArr3 = A02;
                                                            strArr3[5] = "zXqMjfHvGsE5GqeoOMtQ";
                                                            strArr3[7] = "VJJEXPfiEpIWi";
                                                            if (eventType == 4) {
                                                                c0503Ft.A0E(C0503Ft.A04(newPullParser.getText()));
                                                            } else if (A02[0].length() != 25) {
                                                                A02[2] = "PPq67hrZJbAJbQ23vsd2Ce9Kh4nkKHNO";
                                                                if (eventType == 3) {
                                                                    if (newPullParser.getName().equals(A082)) {
                                                                        vu = new VU((C0503Ft) arrayDeque.peek(), hashMap, hashMap2);
                                                                    }
                                                                    arrayDeque.pop();
                                                                }
                                                            }
                                                        }
                                                    } else if (eventType == 2) {
                                                        i2++;
                                                    } else if (eventType == 3) {
                                                        i2--;
                                                    }
                                                    newPullParser.next();
                                                }
                                                return vu;
                                            }
                                            throw new RuntimeException();
                                        } catch (IOException e2) {
                                            e = e2;
                                            throw new IllegalStateException(A08(751, 36, 32), e);
                                        } catch (XmlPullParserException e3) {
                                            e = e3;
                                            throw new FX(A08(728, 23, 50), e);
                                        }
                                    } catch (IOException e4) {
                                        e = e4;
                                    } catch (XmlPullParserException e5) {
                                        e = e5;
                                    }
                                }

                                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                                /* JADX WARN: Removed duplicated region for block: B:12:0x006a  */
                                /* JADX WARN: Removed duplicated region for block: B:14:0x006e  */
                                /* JADX WARN: Removed duplicated region for block: B:17:0x0108  */
                                /* JADX WARN: Removed duplicated region for block: B:20:0x010c  */
                                /* JADX WARN: Removed duplicated region for block: B:21:0x0110  */
                                /* JADX WARN: Removed duplicated region for block: B:22:0x009e  */
                                /* JADX WARN: Removed duplicated region for block: B:25:0x00ae  */
                                /* JADX WARN: Removed duplicated region for block: B:32:0x00d3  */
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public static void A0B(String str2, C0509Fz c0509Fz) throws FX {
                                    Matcher matcher;
                                    char c2;
                                    String[] A0l = C0557Hx.A0l(str2, A08(787, 3, 93));
                                    if (A0l.length == 1) {
                                        Pattern pattern = A07;
                                        String[] strArr = A02;
                                        if (strArr[5].length() == strArr[7].length()) {
                                            throw new RuntimeException();
                                        }
                                        String[] strArr2 = A02;
                                        strArr2[5] = "byjPIFM18GrWKQrGQXqO";
                                        strArr2[7] = "SWWIm7wx7bDMw";
                                        matcher = pattern.matcher(str2);
                                    } else if (A0l.length == 2) {
                                        matcher = A07.matcher(A0l[1]);
                                        Log.w(A08(717, 11, 20), A08(583, 110, 94));
                                    } else {
                                        throw new FX(A08(488, 40, 53) + A0l.length + A08(4, 1, 110));
                                    }
                                    boolean matches = matcher.matches();
                                    String A082 = A08(2, 2, 43);
                                    if (matches) {
                                        String group = matcher.group(3);
                                        int hashCode = group.hashCode();
                                        if (A02[2].charAt(7) == 'x') {
                                            A02[2] = "5kQ0Bru9wD96ZpUiShAzCCUsdhQs8Ki9";
                                            switch (hashCode) {
                                                case 37:
                                                    break;
                                                case 3240:
                                                    break;
                                                case 3592:
                                                    break;
                                            }
                                        } else {
                                            String[] strArr3 = A02;
                                            strArr3[4] = "0HuxTeZujmyRaSiybqeAfDBmliSYF";
                                            strArr3[6] = "KCywfQbYaMV4ekdNL2PKqpW0";
                                            switch (hashCode) {
                                                case 37:
                                                    if (group.equals(A08(1, 1, 99))) {
                                                        c2 = 2;
                                                        switch (c2) {
                                                            case 0:
                                                                c0509Fz.A0C(1);
                                                                break;
                                                            case 1:
                                                                c0509Fz.A0C(2);
                                                                break;
                                                            case 2:
                                                                c0509Fz.A0C(3);
                                                                break;
                                                            default:
                                                                throw new FX(A08(528, 28, 97) + group + A082);
                                                        }
                                                        c0509Fz.A09(Float.valueOf(matcher.group(1)).floatValue());
                                                        return;
                                                    }
                                                    c2 = 65535;
                                                    switch (c2) {
                                                    }
                                                    c0509Fz.A09(Float.valueOf(matcher.group(1)).floatValue());
                                                    return;
                                                case 3240:
                                                    boolean equals = group.equals(A08(1061, 2, 62));
                                                    if (A02[0].length() == 25) {
                                                        throw new RuntimeException();
                                                    }
                                                    A02[0] = "0KBdKNtkqi14akQWinupcYr1fi";
                                                    if (equals) {
                                                        c2 = 1;
                                                        switch (c2) {
                                                        }
                                                        c0509Fz.A09(Float.valueOf(matcher.group(1)).floatValue());
                                                        return;
                                                    }
                                                    c2 = 65535;
                                                    switch (c2) {
                                                    }
                                                    c0509Fz.A09(Float.valueOf(matcher.group(1)).floatValue());
                                                    return;
                                                case 3592:
                                                    if (group.equals(A08(1289, 2, 54))) {
                                                        c2 = 0;
                                                        switch (c2) {
                                                        }
                                                        c0509Fz.A09(Float.valueOf(matcher.group(1)).floatValue());
                                                        return;
                                                    }
                                                    c2 = 65535;
                                                    switch (c2) {
                                                    }
                                                    c0509Fz.A09(Float.valueOf(matcher.group(1)).floatValue());
                                                    return;
                                                default:
                                                    c2 = 65535;
                                                    switch (c2) {
                                                    }
                                                    c0509Fz.A09(Float.valueOf(matcher.group(1)).floatValue());
                                                    return;
                                            }
                                        }
                                    } else {
                                        throw new FX(A08(454, 34, 79) + str2 + A082);
                                    }
                                }

                                public static boolean A0C(String str2) {
                                    if (!str2.equals(A08(1406, 2, 14)) && !str2.equals(A08(1179, 4, 18)) && !str2.equals(A08(PointerIconCompat.TYPE_TEXT, 4, 108))) {
                                        String[] strArr = A02;
                                        if (strArr[1].charAt(6) == strArr[3].charAt(6)) {
                                            throw new RuntimeException();
                                        }
                                        A02[0] = "eh6qU7kFaGj6321g";
                                        if (!str2.equals(A08(1055, 3, 35)) && !str2.equals(A08(1288, 1, 102)) && !str2.equals(A08(1341, 4, 96)) && !str2.equals(A08(PointerIconCompat.TYPE_TOP_RIGHT_DIAGONAL_DOUBLE_ARROW, 2, 50)) && !str2.equals(A08(1350, 5, 18)) && !str2.equals(A08(1355, 7, 70)) && !str2.equals(A08(1226, 6, 81)) && !str2.equals(A08(1291, 6, 88)) && !str2.equals(A08(1248, 8, 112)) && !str2.equals(A08(1313, 11, 89)) && !str2.equals(A08(1303, 10, 119)) && !str2.equals(A08(1324, 17, 12))) {
                                            return false;
                                        }
                                    }
                                    return true;
                                }

                                private String[] A0D(String str2) {
                                    String trim = str2.trim();
                                    return trim.isEmpty() ? new String[0] : C0557Hx.A0l(trim, A08(787, 3, 93));
                                }
                            };
                        case 4:
                            return new BP() { // from class: com.facebook.ads.redexgen.X.33
                                public static byte[] A01;
                                public static String[] A02 = {"Ioj5QFG5xWgPcoEtjOUzaOZZSi58ResH", "BzmKEPAZeTNHFXERaqj4eCVrzKer9OZC", "NXpwqwuc0NaLde90r7V6pJ4Ne8qzedrG", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "yEljI7WS2HC0", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "lK1gkgvi7lIT", "F53fXZog2qyDmXitWMdKElRAH8rnzLvF"};
                                public static final Pattern A03;
                                public final StringBuilder A00;

                                public static String A02(int i, int i2, int i3) {
                                    byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
                                    for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                                        copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 16);
                                    }
                                    return new String(copyOfRange);
                                }

                                public static void A03() {
                                    byte[] bArr = {103, -115, -99, 105, -118, -94, -96, -89, -89, -96, -91, -98, 87, -96, -91, -83, -104, -93, -96, -101, 87, -96, -91, -101, -100, -81, 113, 87, 120, -112, -114, -107, -107, -114, -109, -116, 69, -114, -109, -101, -122, -111, -114, -119, 69, -103, -114, -110, -114, -109, -116, 95, 69, -77, -43, -62, -46, -55, -48, -92, -59, -61, -49, -60, -59, -46, 102, Byte.MAX_VALUE, 118, -119, -127, 118, 116, -123, 118, 117, 49, 118, Byte.MAX_VALUE, 117, -98, -75, 108, 106, 106, -127, 124, 106, -98, -90, 109, 107, 124, 107, -127, 106, -98, -90, 109, 107, 124, 106, -98, -90, 109, 107, 110, 106, -98, -90, 109, 107, 107, -98, -75, 108, 111, 111, Byte.MIN_VALUE, -98, -75, 108, 106, 106, -127, 124, 106, -98, -90, 109, 107, 124, 107, -127, 106, -98, -90, 109, 107, 124, 106, -98, -90, 109, 107, 110, 106, -98, -90, 109, 107, 107, -127, -98, -75, 108};
                                    if (A02[7].charAt(10) == 'b') {
                                        throw new RuntimeException();
                                    }
                                    String[] strArr = A02;
                                    strArr[5] = "J";
                                    strArr[3] = "X";
                                    A01 = bArr;
                                }

                                static {
                                    A03();
                                    A03 = Pattern.compile(A02(80, 76, 50));
                                }

                                {
                                    A02(53, 13, 80);
                                    this.A00 = new StringBuilder();
                                }

                                public static long A00(Matcher matcher, int i) {
                                    long parseLong = Long.parseLong(matcher.group(i + 1)) * 60 * 60 * 1000;
                                    long timestampMs = Long.parseLong(matcher.group(i + 2));
                                    long j = parseLong + (timestampMs * 60 * 1000);
                                    long timestampMs2 = Long.parseLong(matcher.group(i + 3));
                                    long j2 = j + (timestampMs2 * 1000);
                                    long timestampMs3 = Long.parseLong(matcher.group(i + 4));
                                    return 1000 * (j2 + timestampMs3);
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                /* JADX WARN: Code restructure failed: missing block: B:37:0x0136, code lost:
                                
                                    throw new java.lang.RuntimeException();
                                 */
                                @Override // com.facebook.ads.redexgen.X.BP
                                /* renamed from: A01, reason: merged with bridge method [inline-methods] */
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final VV A0b(byte[] bArr, int i, boolean z) {
                                    String A022 = A02(53, 13, 80);
                                    ArrayList arrayList = new ArrayList();
                                    HX hx = new HX();
                                    C0541Hh subripData = new C0541Hh(bArr, i);
                                    loop0: while (true) {
                                        String A0P = subripData.A0P();
                                        if (A0P == null) {
                                            break;
                                        }
                                        if (A0P.length() != 0) {
                                            try {
                                                Integer.parseInt(A0P);
                                                boolean z2 = false;
                                                String A0P2 = subripData.A0P();
                                                if (A02[2].charAt(23) == '4') {
                                                    break;
                                                }
                                                String[] strArr = A02;
                                                strArr[6] = "wL2HcHZBYnMm";
                                                strArr[4] = "fSI8vf5yxWFS";
                                                if (A0P2 == null) {
                                                    Log.w(A022, A02(66, 14, 1));
                                                    break;
                                                }
                                                Matcher matcher = A03.matcher(A0P2);
                                                if (matcher.matches()) {
                                                    hx.A04(A00(matcher, 1));
                                                    if (!TextUtils.isEmpty(matcher.group(6))) {
                                                        z2 = true;
                                                        hx.A04(A00(matcher, 6));
                                                    }
                                                    StringBuilder sb = this.A00;
                                                    String[] strArr2 = A02;
                                                    if (strArr2[6].length() != strArr2[4].length()) {
                                                        throw new RuntimeException();
                                                    }
                                                    String[] strArr3 = A02;
                                                    strArr3[6] = "n36ctdQtR3xT";
                                                    strArr3[4] = "M7zwhEscm5OK";
                                                    sb.setLength(0);
                                                    while (true) {
                                                        String A0P3 = subripData.A0P();
                                                        if (!TextUtils.isEmpty(A0P3)) {
                                                            if (this.A00.length() > 0) {
                                                                this.A00.append(A02(0, 4, 27));
                                                            }
                                                            StringBuilder sb2 = this.A00;
                                                            String trim = A0P3.trim();
                                                            String[] strArr4 = A02;
                                                            if (strArr4[6].length() != strArr4[4].length()) {
                                                                break loop0;
                                                            }
                                                            A02[2] = "ShmBIuWjICEvIyzm2BcCexgzWE2ZXKb5";
                                                            sb2.append(trim);
                                                        } else {
                                                            arrayList.add(new FV(Html.fromHtml(this.A00.toString())));
                                                            if (z2) {
                                                                String[] strArr5 = A02;
                                                                if (strArr5[6].length() != strArr5[4].length()) {
                                                                    String[] strArr6 = A02;
                                                                    strArr6[6] = "6ZS2jVoXZhpD";
                                                                    strArr6[4] = "OBwxGYUW0cYM";
                                                                    arrayList.add(null);
                                                                } else {
                                                                    A02[7] = "4qzQdfN5mVsjbIRLWBypkVgZKG6qbpad";
                                                                    arrayList.add(null);
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    Log.w(A022, A02(28, 25, 21) + A0P2);
                                                }
                                            } catch (NumberFormatException unused) {
                                                Log.w(A022, A02(4, 24, 39) + A0P);
                                            }
                                        }
                                    }
                                    FV[] fvArr = new FV[arrayList.size()];
                                    arrayList.toArray(fvArr);
                                    return new VV(fvArr, hx.A05());
                                }
                            };
                        case 5:
                            final List<byte[]> list = format.A0P;
                            return new BP(list) { // from class: com.facebook.ads.redexgen.X.2o
                                public static byte[] A07;
                                public static String[] A08 = {"y3MdhIgBOQEfONjtg81Qtbi8GqjfngaU", "ayjyD", "uFpqfpJ7hSL4OommhWSR8KeefHSBvEcd", "jYbvzJN34gTcdSRocF6CBPzhG3OB5Yct", "RwlI3", "XQjKxHQSRLuUXJnTYFWTsxujqzA", "GTWh6mQOWxWX5OlOf9c", "GbfE4nIjdQIOu6XrpHRmDAGo7RW"};
                                public static final int A09;
                                public static final int A0A;
                                public float A00;
                                public int A01;
                                public int A02;
                                public int A03;
                                public String A04;
                                public boolean A05;
                                public final C0541Hh A06;

                                public static String A00(int i, int i2, int i3) {
                                    byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
                                    for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                                        copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 83);
                                    }
                                    return new String(copyOfRange);
                                }

                                public static void A02() {
                                    A07 = new byte[]{-55, -37, -24, -33, -36, -40, -4, -73, -21, -56, -23, -25, -13, -24, -23, -10, -87, -88, -102, -127, -123, -118, -65, -66, -80, -105, -94, -68, -43, -52, -33, -41, -52, -54, -37, -52, -53, -121, -38, -36, -55, -37, -48, -37, -45, -52, -121, -51, -42, -39, -44, -56, -37, -107, -30, -48, -35, -30, -100, -30, -44, -31, -40, -43, -50, -64, -51, -60, -63, 48, 49, 54, 41, -33, -51, -38, -29};
                                }

                                static {
                                    A02();
                                    A09 = C0557Hx.A08(A00(69, 4, 106));
                                    A0A = C0557Hx.A08(A00(73, 4, 24));
                                }

                                {
                                    super(A00(5, 11, 49));
                                    this.A06 = new C0541Hh();
                                    A07(list);
                                }

                                public static String A01(C0541Hh c0541Hh) throws FX {
                                    char firstChar;
                                    A08(c0541Hh.A04() >= 2);
                                    int A0I = c0541Hh.A0I();
                                    if (A0I == 0) {
                                        return A00(0, 0, 76);
                                    }
                                    int textLength = c0541Hh.A04();
                                    if (textLength >= 2 && ((firstChar = c0541Hh.A02()) == 65279 || firstChar == 65534)) {
                                        return c0541Hh.A0T(A0I, Charset.forName(A00(16, 6, 1)));
                                    }
                                    return c0541Hh.A0T(A0I, Charset.forName(A00(22, 5, 23)));
                                }

                                public static void A03(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
                                    if (i != i2) {
                                        int colorArgb = i5 | 33;
                                        spannableStringBuilder.setSpan(new ForegroundColorSpan(((i & 255) << 24) | (i >>> 8)), i3, i4, colorArgb);
                                    }
                                }

                                public static void A04(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
                                    if (i != i2) {
                                        int i6 = i5 | 33;
                                        int flags = i & 1;
                                        boolean z = flags != 0;
                                        int flags2 = i & 2;
                                        boolean z2 = flags2 != 0;
                                        if (z) {
                                            if (z2) {
                                                spannableStringBuilder.setSpan(new StyleSpan(3), i3, i4, i6);
                                            } else {
                                                spannableStringBuilder.setSpan(new StyleSpan(1), i3, i4, i6);
                                            }
                                        } else if (z2) {
                                            spannableStringBuilder.setSpan(new StyleSpan(2), i3, i4, i6);
                                        }
                                        int flags3 = i & 4;
                                        boolean z3 = flags3 != 0;
                                        if (z3) {
                                            spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i4, i6);
                                        }
                                        if (!z3 && !z && !z2) {
                                            spannableStringBuilder.setSpan(new StyleSpan(0), i3, i4, i6);
                                        }
                                    }
                                }

                                public static void A05(SpannableStringBuilder spannableStringBuilder, String str2, String str3, int i, int i2, int i3) {
                                    if (str2 != str3) {
                                        spannableStringBuilder.setSpan(new TypefaceSpan(str2), i, i2, i3 | 33);
                                    }
                                }

                                private void A06(C0541Hh c0541Hh, SpannableStringBuilder spannableStringBuilder) throws FX {
                                    A08(c0541Hh.A04() >= 12);
                                    int A0I = c0541Hh.A0I();
                                    int A0I2 = c0541Hh.A0I();
                                    c0541Hh.A0Z(2);
                                    int colorRgba = c0541Hh.A0E();
                                    c0541Hh.A0Z(1);
                                    int A082 = c0541Hh.A08();
                                    A04(spannableStringBuilder, colorRgba, this.A03, A0I, A0I2, 0);
                                    int fontFace = this.A02;
                                    A03(spannableStringBuilder, A082, fontFace, A0I, A0I2, 0);
                                }

                                private void A07(List<byte[]> list2) {
                                    String A002 = A00(54, 10, 28);
                                    if (list2 != null && list2.size() == 1 && (list2.get(0).length == 48 || list2.get(0).length == 53)) {
                                        byte[] bArr = list2.get(0);
                                        this.A03 = bArr[24];
                                        this.A02 = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
                                        if (A00(0, 5, 35).equals(C0557Hx.A0R(bArr, 43, bArr.length - 43))) {
                                            if (A08[0].charAt(13) != 'N') {
                                                throw new RuntimeException();
                                            }
                                            A08[5] = "N60L8QydNUmR0MfdRB9J1gzWK8S";
                                            A002 = A00(64, 5, 8);
                                        }
                                        this.A04 = A002;
                                        int i = bArr[25] * Ascii.DC4;
                                        this.A01 = i;
                                        boolean z = (bArr[0] & 32) != 0;
                                        this.A05 = z;
                                        if (z) {
                                            float f = (((bArr[10] & 255) << 8) | (bArr[11] & 255)) / i;
                                            this.A00 = f;
                                            this.A00 = C0557Hx.A00(f, 0.0f, 0.95f);
                                            return;
                                        }
                                        this.A00 = 0.85f;
                                        return;
                                    }
                                    this.A03 = 0;
                                    this.A02 = -1;
                                    this.A04 = A002;
                                    this.A05 = false;
                                    this.A00 = 0.85f;
                                }

                                public static void A08(boolean z) throws FX {
                                    if (z) {
                                    } else {
                                        throw new FX(A00(27, 27, 20));
                                    }
                                }

                                @Override // com.facebook.ads.redexgen.X.BP
                                public final FW A0b(byte[] bArr, int i, boolean z) throws FX {
                                    this.A06.A0b(bArr, i);
                                    String A012 = A01(this.A06);
                                    if (A012.isEmpty()) {
                                        return VT.A01;
                                    }
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(A012);
                                    A04(spannableStringBuilder, this.A03, 0, 0, spannableStringBuilder.length(), 16711680);
                                    A03(spannableStringBuilder, this.A02, -1, 0, spannableStringBuilder.length(), 16711680);
                                    A05(spannableStringBuilder, this.A04, A00(54, 10, 28), 0, spannableStringBuilder.length(), 16711680);
                                    float verticalPlacement = this.A00;
                                    while (this.A06.A04() >= 8) {
                                        int A06 = this.A06.A06();
                                        int atomSize = this.A06.A08();
                                        int position = this.A06.A08();
                                        if (position == A09) {
                                            A08(this.A06.A04() >= 2);
                                            if (A08[1].length() != 5) {
                                                throw new RuntimeException();
                                            }
                                            A08[0] = "XgeQwtNzfjcS7NtzyEXlUfPnJ3FfDbJq";
                                            int A0I = this.A06.A0I();
                                            for (int i2 = 0; i2 < A0I; i2++) {
                                                A06(this.A06, spannableStringBuilder);
                                            }
                                        } else if (position == A0A && this.A05) {
                                            A08(this.A06.A04() >= 2);
                                            verticalPlacement = C0557Hx.A00(this.A06.A0I() / this.A01, 0.0f, 0.95f);
                                        }
                                        this.A06.A0Y(A06 + atomSize);
                                    }
                                    return new VT(new FV(spannableStringBuilder, null, verticalPlacement, 0, 0, Float.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE));
                                }
                            };
                        case 6:
                        case 7:
                            return new C3A(format.A0O, format.A03);
                        case '\b':
                            final int i = format.A03;
                            return new BI(i) { // from class: com.facebook.ads.redexgen.X.39
                                public static byte[] A09;
                                public static String[] A0A = {"L8nSDLrO9TAW6D5HPeCL1si5c1hAxtei", "yTRb7xwkWwLSkx7Cn6wgTsSbifoyAf9H", "Pu75iiq5ul4XKDpFB8omN9mmt6MpAi03", "oele7RmZxHriYfeWVBMRgXe0mbma165L", "r81I3UJTjgZxb8d", "D", "tOJQceEm3WwBKYsVwUd4wYPMC2E8", "d"};
                                public int A00;
                                public C0487Fd A01;
                                public C0488Fe A02;
                                public List<FV> A03;
                                public List<FV> A04;
                                public final int A05;
                                public final C0487Fd[] A08;
                                public final C0541Hh A07 = new C0541Hh();
                                public final C0540Hg A06 = new C0540Hg();

                                public static String A00(int i2, int i3, int i4) {
                                    byte[] copyOfRange = Arrays.copyOfRange(A09, i2, i2 + i3);
                                    for (int i5 = 0; i5 < copyOfRange.length; i5++) {
                                        copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 5);
                                    }
                                    return new String(copyOfRange);
                                }

                                /* JADX WARN: Failed to parse debug info
                                java.lang.ArrayIndexOutOfBoundsException
                                 */
                                private void A03() {
                                    this.A01.A0C(this.A06.A04(4), this.A06.A04(2), this.A06.A04(2), this.A06.A0F(), this.A06.A0F(), this.A06.A04(3), this.A06.A04(3));
                                }

                                /* JADX WARN: Failed to parse debug info
                                java.lang.ArrayIndexOutOfBoundsException
                                 */
                                private void A04() {
                                    int A012 = C0487Fd.A01(this.A06.A04(2), this.A06.A04(2), this.A06.A04(2), this.A06.A04(2));
                                    int A013 = C0487Fd.A01(this.A06.A04(2), this.A06.A04(2), this.A06.A04(2), this.A06.A04(2));
                                    this.A06.A08(2);
                                    this.A01.A0B(A012, A013, C0487Fd.A00(this.A06.A04(2), this.A06.A04(2), this.A06.A04(2)));
                                }

                                /* JADX WARN: Failed to parse debug info
                                java.lang.ArrayIndexOutOfBoundsException
                                 */
                                private void A06() {
                                    int A012 = C0487Fd.A01(this.A06.A04(2), this.A06.A04(2), this.A06.A04(2), this.A06.A04(2));
                                    int A04 = this.A06.A04(2);
                                    int A002 = C0487Fd.A00(this.A06.A04(2), this.A06.A04(2), this.A06.A04(2));
                                    if (this.A06.A0F()) {
                                        A04 |= 4;
                                    }
                                    boolean A0F = this.A06.A0F();
                                    int A042 = this.A06.A04(2);
                                    int A043 = this.A06.A04(2);
                                    int A044 = this.A06.A04(2);
                                    this.A06.A08(8);
                                    this.A01.A0D(A012, A002, A0F, A04, A042, A043, A044);
                                }

                                public static void A09() {
                                    A09 = new byte[]{50, 58, 97, 119, 99, 103, 119, 124, 113, 119, 50, 124, 103, Byte.MAX_VALUE, 112, 119, 96, 50, 94, 87, 0, Ascii.US, Ascii.DC2, Ascii.EM, 87, Ascii.NAK, Ascii.ESC, Ascii.CAN, Ascii.DC4, Ascii.FS, 36, Ascii.RS, Ascii.CR, Ascii.DC2, 87, Ascii.RS, 4, 87, 71, 72, 90, 65, 8, 6, Ascii.SI, Ascii.SO, 19, 8, Ascii.SI, 6, 65, 17, 0, 2, 10, 4, Ascii.NAK, 68, 72, 10, Ascii.GS, Ascii.FS, 72, Ascii.VT, Ascii.GS, Ascii.SUB, Ascii.SUB, Ascii.CR, 6, Ascii.FS, 72, 1, 6, Ascii.FF, Ascii.CR, 16, 72, 1, Ascii.ESC, 72, 19, 53, 49, 103, 96, 104, Ascii.DC4, 53, 51, 63, 52, 53, 34, 84, 98, 101, 101, 114, 121, 99, 123, 110, 55, 98, 121, 100, 98, 103, 103, 120, 101, 99, 114, 115, 55, 84, 88, 90, 90, 86, 89, 83, 72, 82, 79, 67, 38, 55, 84, 120, 122, 122, 118, 121, 115, 45, 55, 72, 126, 121, 121, 110, 101, Byte.MAX_VALUE, 103, 114, 43, 126, 101, 120, 126, 123, 123, 100, 121, Byte.MAX_VALUE, 110, 111, 43, 72, 68, 70, 70, 74, 69, 79, 84, 91, 58, Base64.padSymbol, 43, 72, 100, 102, 102, 106, 101, 111, 49, 43, 109, 93, 95, 106, 74, 121, 72, 74, 66, 76, 93, 9, 76, 71, 77, 76, 77, 9, 89, 91, 76, 68, 72, 93, 92, 91, 76, 69, 80, Ascii.DC2, 9, 90, 64, 83, 76, 9, 64, 90, 9, 116, 95, 82, 94, 68, 95, 69, 84, 67, 84, 85, 17, 117, 101, 103, 114, 114, 110, 97, 112, 114, 122, 116, 101, 110, 117, 112, 101, 112, 17, 83, 84, 87, 94, 67, 84, 17, 117, 101, 103, 114, 114, 110, 97, 112, 114, 122, 116, 101, 110, 98, 101, 112, 99, 101, 38, 1, Ascii.EM, Ascii.SO, 3, 6, Ascii.VT, 79, 44, 95, 79, Ascii.FF, 0, 2, 2, Ascii.SO, 1, Ascii.VT, 85, 79, 94, 121, 97, 118, 123, 126, 115, 55, 84, 38, 55, 116, 120, 122, 122, 118, 121, 115, 45, 55, 114, 85, 77, 90, 87, 82, 95, Ascii.ESC, 124, 9, Ascii.ESC, 88, 83, 90, 73, 90, 88, 79, 94, 73, 1, Ascii.ESC, 58, Ascii.GS, 5, Ascii.DC2, Ascii.US, Ascii.SUB, Ascii.ETB, 83, 52, 64, 83, 16, Ascii.ESC, Ascii.DC2, 1, Ascii.DC2, 16, 7, Ascii.SYN, 1, 73, 83, 59, Ascii.FS, 4, 19, Ascii.RS, Ascii.ESC, Ascii.SYN, 82, 16, 19, 1, Ascii.ETB, 82, 17, Ascii.GS, Ascii.US, Ascii.US, 19, Ascii.FS, Ascii.SYN, 72, 82, 95, 120, 96, 119, 122, Byte.MAX_VALUE, 114, 54, 115, 110, 98, 115, 120, 114, 115, 114, 54, 117, 121, 123, 123, 119, 120, 114, 44, 54, 115, 101, 114, 118, 105, 99, 101, 78, 117, 109, 98, 101, 114, 32, 105, 115, 32, 110, 111, 110, 45, 122, 101, 114, 111, 32, 40};
                                }

                                /* JADX WARN: Failed to parse debug info
                                java.lang.ArrayIndexOutOfBoundsException
                                 */
                                private void A0E(int i2) {
                                    C0487Fd c0487Fd = this.A08[i2];
                                    this.A06.A08(2);
                                    boolean A0F = this.A06.A0F();
                                    boolean A0F2 = this.A06.A0F();
                                    boolean A0F3 = this.A06.A0F();
                                    int A04 = this.A06.A04(3);
                                    boolean A0F4 = this.A06.A0F();
                                    int A042 = this.A06.A04(7);
                                    int A043 = this.A06.A04(8);
                                    int A044 = this.A06.A04(4);
                                    int A045 = this.A06.A04(4);
                                    this.A06.A08(2);
                                    int A046 = this.A06.A04(6);
                                    this.A06.A08(2);
                                    c0487Fd.A0F(A0F, A0F2, A0F3, A04, A0F4, A042, A043, A045, A046, A044, this.A06.A04(3), this.A06.A04(3));
                                }

                                static {
                                    A09();
                                }

                                {
                                    this.A05 = i == -1 ? 1 : i;
                                    this.A08 = new C0487Fd[8];
                                    for (int i2 = 0; i2 < 8; i2++) {
                                        this.A08[i2] = new C0487Fd();
                                    }
                                    this.A01 = this.A08[0];
                                    A08();
                                }

                                private List<FV> A01() {
                                    ArrayList arrayList = new ArrayList();
                                    for (int i2 = 0; i2 < 8; i2++) {
                                        if (!this.A08[i2].A0H() && this.A08[i2].A0I()) {
                                            arrayList.add(this.A08[i2].A05());
                                        }
                                    }
                                    Collections.sort(arrayList);
                                    return Collections.unmodifiableList(arrayList);
                                }

                                private void A02() {
                                    if (this.A02 == null) {
                                        return;
                                    }
                                    A07();
                                    this.A02 = null;
                                }

                                private void A05() {
                                    this.A06.A08(4);
                                    int A04 = this.A06.A04(4);
                                    this.A06.A08(2);
                                    int column = this.A06.A04(6);
                                    this.A01.A0A(A04, column);
                                }

                                /* JADX WARN: Incorrect condition in loop: B:19:0x00e0 */
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                private void A07() {
                                    int i2 = this.A02.A00;
                                    int i3 = (this.A02.A01 * 2) - 1;
                                    String A002 = A00(80, 13, 85);
                                    if (i2 != i3) {
                                        Log.w(A002, A00(Opcodes.GETFIELD, 39, 44) + ((this.A02.A01 * 2) - 1) + A00(57, 23, 109) + this.A02.A00 + A00(0, 18, 23) + this.A02.A02 + A00(39, 18, 100));
                                        return;
                                    }
                                    this.A06.A0C(this.A02.A03, this.A02.A00);
                                    int A04 = this.A06.A04(3);
                                    int A042 = this.A06.A04(5);
                                    if (A04 == 7) {
                                        this.A06.A08(2);
                                        int serviceNumber = this.A06.A04(6);
                                        A04 += serviceNumber;
                                    }
                                    if (A042 == 0) {
                                        if (A04 != 0) {
                                            Log.w(A002, A00(TTAdConstant.LANDING_PAGE_TYPE_CODE, 27, 5) + A04 + A00(18, 21, 114));
                                            return;
                                        }
                                        return;
                                    }
                                    int serviceNumber2 = this.A05;
                                    if (A04 != serviceNumber2) {
                                        return;
                                    }
                                    boolean z = false;
                                    while (serviceNumber > 0) {
                                        int command = this.A06.A04(8);
                                        if (command != 16) {
                                            if (command <= 31) {
                                                A0A(command);
                                            } else if (command <= 127) {
                                                A0F(command);
                                                int blockSize = A0A[2].charAt(20);
                                                if (blockSize == 100) {
                                                    throw new RuntimeException();
                                                }
                                                A0A[6] = "rjuMXnqaebSKWE8kqibyPX";
                                                z = true;
                                            } else if (command <= 159) {
                                                A0B(command);
                                                z = true;
                                            } else if (command <= 255) {
                                                A0G(command);
                                                int blockSize2 = A0A[4].length();
                                                if (blockSize2 != 30) {
                                                    A0A[6] = "EgJ0sJhEBhD0w9Kefz8q6JJasn";
                                                    z = true;
                                                } else {
                                                    A0A[2] = "g5pQSTU3MNC04Gh1KYXWxOkcOn9rSElo";
                                                    z = false;
                                                }
                                            } else {
                                                Log.w(A002, A00(358, 22, 119) + command);
                                            }
                                        } else {
                                            int command2 = this.A06.A04(8);
                                            if (command2 <= 31) {
                                                A0C(command2);
                                            } else if (command2 <= 127) {
                                                A0H(command2);
                                                z = true;
                                            } else if (command2 <= 159) {
                                                A0D(command2);
                                            } else if (command2 <= 255) {
                                                A0I(command2);
                                                z = true;
                                            } else {
                                                Log.w(A002, A00(380, 26, 19) + command2);
                                            }
                                        }
                                    }
                                    if (z) {
                                        this.A03 = A01();
                                    }
                                }

                                private void A08() {
                                    for (int i2 = 0; i2 < 8; i2++) {
                                        this.A08[i2].A08();
                                    }
                                }

                                private void A0A(int i2) {
                                    switch (i2) {
                                        case 0:
                                        case 14:
                                            break;
                                        case 3:
                                            this.A03 = A01();
                                            break;
                                        case 8:
                                            this.A01.A06();
                                            break;
                                        case 12:
                                            A08();
                                            break;
                                        case 13:
                                            this.A01.A09('\n');
                                            break;
                                        default:
                                            String A002 = A00(80, 13, 85);
                                            if (i2 >= 17 && i2 <= 23) {
                                                Log.w(A002, A00(93, 44, 18) + i2);
                                                this.A06.A08(8);
                                                break;
                                            } else if (i2 >= 24 && i2 <= 31) {
                                                Log.w(A002, A00(Opcodes.L2F, 43, 14) + i2);
                                                this.A06.A08(16);
                                                break;
                                            } else {
                                                Log.w(A002, A00(274, 20, 106) + i2);
                                                break;
                                            }
                                    }
                                }

                                private void A0B(int i2) {
                                    switch (i2) {
                                        case 128:
                                        case Opcodes.LOR /* 129 */:
                                        case 130:
                                        case Opcodes.LXOR /* 131 */:
                                        case Opcodes.IINC /* 132 */:
                                        case Opcodes.I2L /* 133 */:
                                        case Opcodes.I2F /* 134 */:
                                        case Opcodes.I2D /* 135 */:
                                            int i3 = i2 - 128;
                                            int window = this.A00;
                                            if (window == i3) {
                                                return;
                                            }
                                            this.A00 = i3;
                                            this.A01 = this.A08[i3];
                                            return;
                                        case Opcodes.L2I /* 136 */:
                                            for (int i4 = 1; i4 <= 8; i4++) {
                                                if (this.A06.A0F()) {
                                                    int window2 = 8 - i4;
                                                    this.A08[window2].A07();
                                                }
                                            }
                                            return;
                                        case Opcodes.L2F /* 137 */:
                                            for (int i5 = 1; i5 <= 8; i5++) {
                                                if (this.A06.A0F()) {
                                                    int window3 = 8 - i5;
                                                    this.A08[window3].A0E(true);
                                                }
                                            }
                                            return;
                                        case Opcodes.L2D /* 138 */:
                                            for (int i6 = 1; i6 <= 8; i6++) {
                                                if (this.A06.A0F()) {
                                                    int window4 = 8 - i6;
                                                    this.A08[window4].A0E(false);
                                                }
                                            }
                                            return;
                                        case Opcodes.F2I /* 139 */:
                                            for (int i7 = 1; i7 <= 8; i7++) {
                                                if (this.A06.A0F()) {
                                                    int window5 = 8 - i7;
                                                    this.A08[window5].A0E(!r1.A0I());
                                                }
                                            }
                                            return;
                                        case Opcodes.F2L /* 140 */:
                                            for (int i8 = 1; i8 <= 8; i8++) {
                                                if (this.A06.A0F()) {
                                                    int i9 = 8 - i8;
                                                    this.A08[i9].A08();
                                                }
                                            }
                                            return;
                                        case Opcodes.F2D /* 141 */:
                                            this.A06.A08(8);
                                            return;
                                        case Opcodes.D2I /* 142 */:
                                            return;
                                        case Opcodes.D2L /* 143 */:
                                            A08();
                                            return;
                                        case Opcodes.D2F /* 144 */:
                                            if (!this.A01.A0G()) {
                                                this.A06.A08(16);
                                                return;
                                            } else {
                                                A03();
                                                return;
                                            }
                                        case Opcodes.I2B /* 145 */:
                                            if (!this.A01.A0G()) {
                                                this.A06.A08(24);
                                                return;
                                            } else {
                                                A04();
                                                return;
                                            }
                                        case Opcodes.I2C /* 146 */:
                                            boolean A0G = this.A01.A0G();
                                            if (A0A[2].charAt(20) == 'd') {
                                                throw new RuntimeException();
                                            }
                                            A0A[6] = "sx3hxSZmvwYc7KEcLHD7P9DXHyFO";
                                            if (!A0G) {
                                                this.A06.A08(16);
                                                return;
                                            } else {
                                                A05();
                                                return;
                                            }
                                        case Opcodes.I2S /* 147 */:
                                        case Opcodes.LCMP /* 148 */:
                                        case Opcodes.FCMPL /* 149 */:
                                        case Opcodes.FCMPG /* 150 */:
                                        default:
                                            Log.w(A00(80, 13, 85), A00(294, 20, 18) + i2);
                                            return;
                                        case Opcodes.DCMPL /* 151 */:
                                            if (!this.A01.A0G()) {
                                                this.A06.A08(32);
                                                return;
                                            } else {
                                                A06();
                                                return;
                                            }
                                        case Opcodes.DCMPG /* 152 */:
                                        case 153:
                                        case 154:
                                        case 155:
                                        case 156:
                                        case 157:
                                        case 158:
                                        case Opcodes.IF_ICMPEQ /* 159 */:
                                            int i10 = i2 - 152;
                                            A0E(i10);
                                            int window6 = this.A00;
                                            if (window6 == i10) {
                                                return;
                                            }
                                            this.A00 = i10;
                                            this.A01 = this.A08[i10];
                                            return;
                                    }
                                }

                                private void A0C(int i2) {
                                    if (i2 <= 7) {
                                        return;
                                    }
                                    if (A0A[6].length() == 27) {
                                        throw new RuntimeException();
                                    }
                                    A0A[6] = "CPm7fUwNYaP";
                                    if (i2 <= 15) {
                                        this.A06.A08(8);
                                    } else if (i2 <= 23) {
                                        this.A06.A08(16);
                                    } else {
                                        if (i2 > 31) {
                                            return;
                                        }
                                        this.A06.A08(24);
                                    }
                                }

                                private void A0D(int i2) {
                                    if (i2 <= 135) {
                                        this.A06.A08(32);
                                        return;
                                    }
                                    if (i2 <= 143) {
                                        this.A06.A08(40);
                                    } else {
                                        if (i2 > 159) {
                                            return;
                                        }
                                        this.A06.A08(2);
                                        int length = this.A06.A04(6);
                                        this.A06.A08(length * 8);
                                    }
                                }

                                private void A0F(int i2) {
                                    if (i2 == 127) {
                                        this.A01.A09((char) 9835);
                                    } else {
                                        this.A01.A09((char) (i2 & 255));
                                    }
                                }

                                private void A0G(int i2) {
                                    this.A01.A09((char) (i2 & 255));
                                }

                                private void A0H(int i2) {
                                    switch (i2) {
                                        case 32:
                                            this.A01.A09(' ');
                                            return;
                                        case 33:
                                            C0487Fd c0487Fd = this.A01;
                                            if (A0A[2].charAt(20) != 'd') {
                                                A0A[6] = "c7yrU4YPgQ4V4O";
                                                c0487Fd.A09(Typography.nbsp);
                                                return;
                                            } else {
                                                c0487Fd.A09(Typography.nbsp);
                                                return;
                                            }
                                        case 37:
                                            this.A01.A09(Typography.ellipsis);
                                            return;
                                        case 42:
                                            this.A01.A09((char) 352);
                                            return;
                                        case 44:
                                            this.A01.A09((char) 338);
                                            return;
                                        case 48:
                                            this.A01.A09((char) 9608);
                                            return;
                                        case 49:
                                            this.A01.A09(Typography.leftSingleQuote);
                                            return;
                                        case 50:
                                            this.A01.A09(Typography.rightSingleQuote);
                                            return;
                                        case 51:
                                            this.A01.A09(Typography.leftDoubleQuote);
                                            return;
                                        case 52:
                                            this.A01.A09(Typography.rightDoubleQuote);
                                            return;
                                        case 53:
                                            this.A01.A09(Typography.bullet);
                                            return;
                                        case 57:
                                            this.A01.A09(Typography.tm);
                                            return;
                                        case 58:
                                            this.A01.A09((char) 353);
                                            return;
                                        case 60:
                                            this.A01.A09((char) 339);
                                            return;
                                        case 61:
                                            this.A01.A09((char) 8480);
                                            return;
                                        case 63:
                                            C0487Fd c0487Fd2 = this.A01;
                                            String[] strArr = A0A;
                                            if (strArr[7].length() != strArr[5].length()) {
                                                String[] strArr2 = A0A;
                                                strArr2[7] = "Z";
                                                strArr2[5] = "t";
                                                c0487Fd2.A09((char) 311);
                                                return;
                                            }
                                            A0A[0] = "pU3RJGTC6nTuniMjXABkJRZbH1Ri26sV";
                                            c0487Fd2.A09((char) 376);
                                            return;
                                        case 118:
                                            this.A01.A09((char) 8539);
                                            return;
                                        case 119:
                                            this.A01.A09((char) 8540);
                                            return;
                                        case 120:
                                            this.A01.A09((char) 8541);
                                            return;
                                        case 121:
                                            this.A01.A09((char) 8542);
                                            return;
                                        case 122:
                                            this.A01.A09((char) 9474);
                                            return;
                                        case 123:
                                            this.A01.A09((char) 9488);
                                            return;
                                        case 124:
                                            this.A01.A09((char) 9492);
                                            return;
                                        case 125:
                                            this.A01.A09((char) 9472);
                                            return;
                                        case 126:
                                            C0487Fd c0487Fd3 = this.A01;
                                            if (A0A[0].charAt(25) != '1') {
                                                throw new RuntimeException();
                                            }
                                            A0A[4] = "QsM0qcrDDlKDBNJu";
                                            c0487Fd3.A09((char) 9496);
                                            return;
                                        case 127:
                                            this.A01.A09((char) 9484);
                                            return;
                                        default:
                                            Log.w(A00(80, 13, 85), A00(314, 22, 62) + i2);
                                            return;
                                    }
                                }

                                private void A0I(int i2) {
                                    if (i2 == 160) {
                                        this.A01.A09((char) 13252);
                                        return;
                                    }
                                    Log.w(A00(80, 13, 85), A00(336, 22, 118) + i2);
                                    this.A01.A09('_');
                                }

                                @Override // com.facebook.ads.redexgen.X.BI
                                /* renamed from: A0L */
                                public final /* bridge */ /* synthetic */ BO A50() throws FX {
                                    return super.A50();
                                }

                                @Override // com.facebook.ads.redexgen.X.BI
                                /* renamed from: A0M */
                                public final /* bridge */ /* synthetic */ BN A51() throws FX {
                                    return super.A51();
                                }

                                @Override // com.facebook.ads.redexgen.X.BI
                                public final VZ A0N() {
                                    List<FV> list2 = this.A03;
                                    this.A04 = list2;
                                    return new VZ(list2);
                                }

                                @Override // com.facebook.ads.redexgen.X.BI
                                /* renamed from: A0O */
                                public final /* bridge */ /* synthetic */ void AE8(BO bo) throws FX {
                                    super.AE8(bo);
                                }

                                @Override // com.facebook.ads.redexgen.X.BI
                                public final void A0P(BO bo) {
                                    this.A07.A0b(bo.A01.array(), bo.A01.limit());
                                    while (this.A07.A04() >= 3) {
                                        int A0E = this.A07.A0E() & 7;
                                        int ccType = A0E & 3;
                                        int ccTypeAndValid = A0E & 4;
                                        int ccTypeAndValid2 = ccTypeAndValid == 4 ? 1 : 0;
                                        byte A0E2 = (byte) this.A07.A0E();
                                        byte A0E3 = (byte) this.A07.A0E();
                                        if (ccType == 2 || ccType == 3) {
                                            if (ccTypeAndValid2 != 0) {
                                                if (ccType == 3) {
                                                    A02();
                                                    int sequenceNumber = (A0E2 & 192) >> 6;
                                                    int ccTypeAndValid3 = A0E2 & 63;
                                                    if (ccTypeAndValid3 == 0) {
                                                        ccTypeAndValid3 = 64;
                                                    }
                                                    C0488Fe c0488Fe = new C0488Fe(sequenceNumber, ccTypeAndValid3);
                                                    this.A02 = c0488Fe;
                                                    byte[] bArr = c0488Fe.A03;
                                                    C0488Fe c0488Fe2 = this.A02;
                                                    int ccTypeAndValid4 = c0488Fe2.A00;
                                                    c0488Fe2.A00 = ccTypeAndValid4 + 1;
                                                    bArr[ccTypeAndValid4] = A0E3;
                                                } else {
                                                    HI.A03(ccType == 2);
                                                    C0488Fe c0488Fe3 = this.A02;
                                                    if (c0488Fe3 == null) {
                                                        String A002 = A00(80, 13, 85);
                                                        String[] strArr = A0A;
                                                        String str2 = strArr[1];
                                                        String str3 = strArr[3];
                                                        int ccTypeAndValid5 = str2.charAt(4);
                                                        if (ccTypeAndValid5 != str3.charAt(4)) {
                                                            throw new RuntimeException();
                                                        }
                                                        String[] strArr2 = A0A;
                                                        strArr2[7] = "q";
                                                        strArr2[5] = ExifInterface.LONGITUDE_WEST;
                                                        Log.e(A002, A00(219, 55, 52));
                                                    } else {
                                                        byte[] bArr2 = c0488Fe3.A03;
                                                        C0488Fe c0488Fe4 = this.A02;
                                                        int ccTypeAndValid6 = c0488Fe4.A00;
                                                        c0488Fe4.A00 = ccTypeAndValid6 + 1;
                                                        bArr2[ccTypeAndValid6] = A0E2;
                                                        byte[] bArr3 = this.A02.A03;
                                                        C0488Fe c0488Fe5 = this.A02;
                                                        int ccTypeAndValid7 = c0488Fe5.A00;
                                                        c0488Fe5.A00 = ccTypeAndValid7 + 1;
                                                        bArr3[ccTypeAndValid7] = A0E3;
                                                    }
                                                }
                                                int ccTypeAndValid8 = this.A02.A00;
                                                if (ccTypeAndValid8 == (this.A02.A01 * 2) - 1) {
                                                    A02();
                                                }
                                            } else {
                                                continue;
                                            }
                                        }
                                    }
                                }

                                @Override // com.facebook.ads.redexgen.X.BI
                                public final boolean A0R() {
                                    return this.A03 != this.A04;
                                }

                                @Override // com.facebook.ads.redexgen.X.BI, com.facebook.ads.redexgen.X.InterfaceC0392At
                                public final /* bridge */ /* synthetic */ void AEO() {
                                    super.AEO();
                                }

                                @Override // com.facebook.ads.redexgen.X.BI, com.facebook.ads.redexgen.X.InterfaceC0894Vc
                                public final /* bridge */ /* synthetic */ void AFQ(long j) {
                                    super.AFQ(j);
                                }

                                @Override // com.facebook.ads.redexgen.X.BI, com.facebook.ads.redexgen.X.InterfaceC0392At
                                public final void flush() {
                                    super.flush();
                                    this.A03 = null;
                                    this.A04 = null;
                                    this.A00 = 0;
                                    this.A01 = this.A08[0];
                                    A08();
                                    this.A02 = null;
                                }
                            };
                        case '\t':
                            final List<byte[]> list2 = format.A0P;
                            return new BP(list2) { // from class: com.facebook.ads.redexgen.X.36
                                public static byte[] A01;
                                public static String[] A02 = {"qXs6V74QtfwsjkdnoCxmJzB", "rDVNLzgykNd1AH758Rq4GWVPoy1tVQj9", "jM465NfFzErNKErFjgf6VJp", "O940NHtyzLSWvZI0lGeygt5D5zeLYjSX", "IuamGBNMrj6Ry3rbJvLyLGhfPsP3YgpR", "kdA6LXUEwFVqowFtkI1z0bh3awlqFMvG", "qZ4BxXZCpPq", "ZVJDameXAJGG2K8CQpo78THH5d3v47HP"};
                                public final C0499Fp A00;

                                /* JADX WARN: Failed to parse debug info
                                java.lang.ArrayIndexOutOfBoundsException
                                 */
                                {
                                    super(A01(0, 10, 88));
                                    C0541Hh c0541Hh = new C0541Hh(list2.get(0));
                                    this.A00 = new C0499Fp(c0541Hh.A0I(), c0541Hh.A0I());
                                }

                                public static String A01(int i2, int i3, int i4) {
                                    byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
                                    for (int i5 = 0; i5 < copyOfRange.length; i5++) {
                                        copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 28);
                                        if (A02[2].length() == 10) {
                                            throw new RuntimeException();
                                        }
                                        A02[2] = "O3jBya31pC1F5QAY5BmtxW8w";
                                    }
                                    return new String(copyOfRange);
                                }

                                public static void A02() {
                                    A01 = new byte[]{-72, -22, -42, -72, -39, -41, -29, -40, -39, -26};
                                }

                                static {
                                    A02();
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                @Override // com.facebook.ads.redexgen.X.BP
                                /* renamed from: A00, reason: merged with bridge method [inline-methods] */
                                public final VY A0b(byte[] bArr, int i2, boolean z) {
                                    if (z) {
                                        this.A00.A0J();
                                    }
                                    return new VY(this.A00.A0I(bArr, i2));
                                }
                            };
                        case '\n':
                            return new BP() { // from class: com.facebook.ads.redexgen.X.35
                                public static byte[] A05;
                                public static String[] A06 = {"KZ4UL", "wgXsM35CSFw9qKyQNcN9Wb65ea62QfH", "u", "bZRcIQY0UF", "DXQv5hm0yQKynjovM0KVIm6LRK5IA2nE", "iihMGEW2flPgM8Zn1sj0niYt866SE", "FKEIju0brb8TcnFl6P73gCCGBn9qAzeO", "uXrSbQs8DhxM"};
                                public int A00;
                                public Inflater A01;
                                public byte[] A02;
                                public final C0500Fq A03;
                                public final C0541Hh A04;

                                public static String A01(int i2, int i3, int i4) {
                                    byte[] copyOfRange = Arrays.copyOfRange(A05, i2, i2 + i3);
                                    int i5 = 0;
                                    while (true) {
                                        int length = copyOfRange.length;
                                        if (A06[5].length() == 14) {
                                            throw new RuntimeException();
                                        }
                                        String[] strArr = A06;
                                        strArr[6] = "xm4Qjv6rB5C9SjkyTxonjV3g80gHALfZ";
                                        strArr[4] = "xMbN2EBFBRv8Ib3Z5HVusSMeKeHnAAXK";
                                        if (i5 >= length) {
                                            return new String(copyOfRange);
                                        }
                                        copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 74);
                                        i5++;
                                    }
                                }

                                public static void A02() {
                                    A05 = new byte[]{-46, -23, -11, -58, -25, -27, -15, -26, -25, -12};
                                }

                                static {
                                    A02();
                                }

                                {
                                    A01(0, 10, 56);
                                    this.A04 = new C0541Hh();
                                    this.A03 = new C0500Fq();
                                }

                                public static FV A00(C0541Hh c0541Hh, C0500Fq c0500Fq) {
                                    int limit = c0541Hh.A07();
                                    int nextSectionPosition = c0541Hh.A0E();
                                    int sectionLength = c0541Hh.A0I();
                                    int sectionType = c0541Hh.A06() + sectionLength;
                                    if (sectionType > limit) {
                                        c0541Hh.A0Y(limit);
                                        return null;
                                    }
                                    FV fv = null;
                                    switch (nextSectionPosition) {
                                        case 20:
                                            c0500Fq.A05(c0541Hh, sectionLength);
                                            break;
                                        case 21:
                                            c0500Fq.A03(c0541Hh, sectionLength);
                                            break;
                                        case 22:
                                            c0500Fq.A04(c0541Hh, sectionLength);
                                            break;
                                        case 128:
                                            fv = c0500Fq.A06();
                                            c0500Fq.A07();
                                            break;
                                    }
                                    c0541Hh.A0Y(sectionType);
                                    return fv;
                                }

                                private boolean A03(byte[] bArr, int i2) {
                                    if (i2 == 0 || bArr[0] != 120) {
                                        return false;
                                    }
                                    if (this.A01 == null) {
                                        this.A01 = new Inflater();
                                        this.A02 = new byte[i2];
                                    }
                                    this.A00 = 0;
                                    this.A01.setInput(bArr, 0, i2);
                                    while (!this.A01.finished() && !this.A01.needsDictionary() && !this.A01.needsInput()) {
                                        try {
                                            int i3 = this.A00;
                                            byte[] bArr2 = this.A02;
                                            if (i3 == bArr2.length) {
                                                this.A02 = Arrays.copyOf(bArr2, bArr2.length * 2);
                                            }
                                            int i4 = this.A00;
                                            Inflater inflater = this.A01;
                                            byte[] bArr3 = this.A02;
                                            this.A00 = i4 + inflater.inflate(bArr3, i4, bArr3.length - i4);
                                        } catch (DataFormatException unused) {
                                            this.A01.reset();
                                            if (A06[2].length() != 1) {
                                                throw new RuntimeException();
                                            }
                                            A06[3] = "vilpTalb32";
                                            return false;
                                        } catch (Throwable th) {
                                            this.A01.reset();
                                            throw th;
                                        }
                                    }
                                    boolean finished = this.A01.finished();
                                    this.A01.reset();
                                    return finished;
                                }

                                @Override // com.facebook.ads.redexgen.X.BP
                                public final FW A0b(byte[] bArr, int i2, boolean z) throws FX {
                                    if (A03(bArr, i2)) {
                                        C0541Hh c0541Hh = this.A04;
                                        byte[] bArr2 = this.A02;
                                        if (A06[1].length() == 25) {
                                            throw new RuntimeException();
                                        }
                                        A06[2] = "I";
                                        c0541Hh.A0b(bArr2, this.A00);
                                    } else {
                                        this.A04.A0b(bArr, i2);
                                    }
                                    this.A03.A07();
                                    ArrayList arrayList = new ArrayList();
                                    while (this.A04.A04() >= 3) {
                                        FV A002 = A00(this.A04, this.A03);
                                        if (A002 != null) {
                                            arrayList.add(A002);
                                        }
                                    }
                                    return new VX(Collections.unmodifiableList(arrayList));
                                }
                            };
                        default:
                            throw new IllegalArgumentException(A00(0, 50, 80));
                    }
                }
                c = 65535;
                switch (c) {
                }
            case -1248334819:
                if (str.equals(A00(107, 15, 46))) {
                    c = '\n';
                    switch (c) {
                    }
                }
                c = 65535;
                switch (c) {
                }
            case -1026075066:
                if (str.equals(A00(Opcodes.GOTO, 21, 81))) {
                    c = 2;
                    switch (c) {
                    }
                }
                c = 65535;
                switch (c) {
                }
            case -1004728940:
                String[] strArr = A01;
                if (strArr[7].length() != strArr[1].length()) {
                    String[] strArr2 = A01;
                    strArr2[2] = "KXlpriTpraKFcv57lT18lTeyRhtKtNSZ";
                    strArr2[0] = "BNYOrjLD5iRKcrXVa2sdELjis64G4Od1";
                    if (str.equals(A00(236, 8, 53))) {
                        c = 0;
                        switch (c) {
                        }
                    }
                    c = 65535;
                    switch (c) {
                    }
                }
                throw new RuntimeException();
            case 691401887:
                if (str.equals(A00(Opcodes.NEWARRAY, 28, 77))) {
                    c = 5;
                    switch (c) {
                    }
                }
                c = 65535;
                switch (c) {
                }
            case 822864842:
                if (str.equals(A00(244, 10, 65))) {
                    c = 1;
                    switch (c) {
                    }
                }
                c = 65535;
                switch (c) {
                }
            case 930165504:
                if (str.equals(A00(Opcodes.D2I, 25, 108))) {
                    c = 7;
                    switch (c) {
                    }
                }
                c = 65535;
                switch (c) {
                }
            case 1566015601:
                if (str.equals(A00(50, 19, 119))) {
                    c = 6;
                    switch (c) {
                    }
                }
                c = 65535;
                switch (c) {
                }
            case 1566016562:
                if (str.equals(A00(69, 19, 53))) {
                    c = '\b';
                    switch (c) {
                    }
                }
                c = 65535;
                switch (c) {
                }
            case 1668750253:
                if (str.equals(A00(216, 20, 11))) {
                    c = 4;
                    switch (c) {
                    }
                }
                c = 65535;
                switch (c) {
                }
            case 1693976202:
                String[] strArr3 = A01;
                if (strArr3[4].charAt(2) == strArr3[5].charAt(2)) {
                    String[] strArr4 = A01;
                    strArr4[3] = "iCK0DOAOAum2L2g39hl8m3YBdeVER5re";
                    strArr4[6] = "HqF3vvc9y3ihxVKIIHQ9Z97D0VQRHqvW";
                    if (str.equals(A00(122, 20, 2))) {
                        c = 3;
                        switch (c) {
                        }
                    }
                    c = 65535;
                    switch (c) {
                    }
                }
                throw new RuntimeException();
            default:
                c = 65535;
                switch (c) {
                }
        }
    }

    @Override // com.facebook.ads.redexgen.X.FY
    public final boolean AFu(Format format) {
        String str = format.A0O;
        String mimeType = A00(236, 8, 53);
        if (!mimeType.equals(str)) {
            String mimeType2 = A00(244, 10, 65);
            if (!mimeType2.equals(str)) {
                String mimeType3 = A00(122, 20, 2);
                if (!mimeType3.equals(str)) {
                    String[] strArr = A01;
                    if (strArr[4].charAt(2) != strArr[5].charAt(2)) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A01;
                    strArr2[2] = "loep2I6zPFVtcRcjqtJxRjX9IyStAKeo";
                    strArr2[0] = "undYhYHmNoLvcT1DYiuXgnR63VlRVc3K";
                    String mimeType4 = A00(Opcodes.GOTO, 21, 81);
                    if (!mimeType4.equals(str)) {
                        String mimeType5 = A00(216, 20, 11);
                        if (!mimeType5.equals(str)) {
                            String mimeType6 = A00(Opcodes.NEWARRAY, 28, 77);
                            if (!mimeType6.equals(str)) {
                                String mimeType7 = A00(50, 19, 119);
                                if (!mimeType7.equals(str)) {
                                    String mimeType8 = A00(Opcodes.D2I, 25, 108);
                                    if (!mimeType8.equals(str)) {
                                        String mimeType9 = A00(69, 19, 53);
                                        if (!mimeType9.equals(str)) {
                                            String mimeType10 = A00(88, 19, 99);
                                            if (!mimeType10.equals(str)) {
                                                String mimeType11 = A00(107, 15, 46);
                                                if (!mimeType11.equals(str)) {
                                                    return false;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
}
