package com.facebook.ads.redexgen.X;

import android.util.Log;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.ApicFrame;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.BinaryFrame;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.ChapterFrame;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.ChapterTocFrame;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.CommentFrame;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.GeobFrame;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.Id3Frame;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.PrivFrame;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.TextInformationFrame;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.UrlLinkFrame;
import com.google.common.base.Ascii;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import kotlin.io.encoding.Base64;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.Vu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0910Vu implements DE {
    public static byte[] A01;
    public static String[] A02 = {"mDpfQ0Mg1qMGU0sRUyB4w0yHI9AflFxL", "HrWFAZbBmLlJHBGWXoy88PVYdiXTIEfW", "ZQEIpFlmPj9dChjEJf3cuXBCToBvQGIn", "RQPpjxLwn1F2LqLyPS6YhTLdMSPVP9VK", "XPMzSAYF2Koz19PEH34p5", "swwfqTWHhic8XQtgs9vSQ", "6JbQXNgGm6Rlu9UTMBxnLLi5Rd7F6qFb", "jePmV9Iz"};
    public static final int A03;
    public static final DQ A04;
    public final DQ A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 20 out of bounds for length 20
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static ChapterFrame A06(C0541Hh c0541Hh, int i, int i2, boolean z, int i3, DQ dq) throws UnsupportedEncodingException {
        int A06 = c0541Hh.A06();
        int A022 = A02(c0541Hh.A00, A06);
        String str = new String(c0541Hh.A00, A06, A022 - A06, A0I(Opcodes.RET, 10, 32));
        c0541Hh.A0Y(A022 + 1);
        int A08 = c0541Hh.A08();
        int A082 = c0541Hh.A08();
        long A0M = c0541Hh.A0M();
        if (A0M == 4294967295L) {
            A0M = -1;
        }
        long A0M2 = c0541Hh.A0M();
        if (A0M2 == 4294967295L) {
            A0M2 = -1;
        }
        ArrayList arrayList = new ArrayList();
        int i4 = A06 + i;
        while (c0541Hh.A06() < i4) {
            Id3Frame A0B = A0B(i2, c0541Hh, z, i3, dq);
            if (A0B != null) {
                arrayList.add(A0B);
            }
        }
        Id3Frame[] id3FrameArr = new Id3Frame[arrayList.size()];
        arrayList.toArray(id3FrameArr);
        return new ChapterFrame(str, A08, A082, A0M, A0M2, id3FrameArr);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 11
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static GeobFrame A09(C0541Hh c0541Hh, int i) throws UnsupportedEncodingException {
        int A0E = c0541Hh.A0E();
        String A0H = A0H(A0E);
        byte[] bArr = new byte[i - 1];
        c0541Hh.A0c(bArr, 0, i - 1);
        int A022 = A02(bArr, 0);
        String str = new String(bArr, 0, A022, A0I(Opcodes.RET, 10, 32));
        int i2 = A022 + 1;
        int A032 = A03(bArr, i2, A0E);
        String A0K = A0K(bArr, i2, A032, A0H);
        int A00 = A00(A0E) + A032;
        int A033 = A03(bArr, A00, A0E);
        return new GeobFrame(str, A0K, A0K(bArr, A00, A033, A0H), A0N(bArr, A00(A0E) + A033, bArr.length));
    }

    public static String A0I(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 2);
        }
        return new String(copyOfRange);
    }

    public static void A0L() {
        A01 = new byte[]{78, 8, 78, 8, 78, 8, 44, 106, 44, 106, 44, 106, 44, 106, 89, 85, 19, 7, Ascii.DC4, Ascii.CAN, 16, 38, Ascii.FS, Ascii.SI, 16, 72, 91, 126, 107, 126, 63, 107, 112, 112, 63, 108, 119, 112, 109, 107, 63, 107, 112, 63, 125, 122, 63, 126, 113, 63, 86, 91, 44, 63, 107, 126, 120, Ascii.SYN, 49, 57, 60, 53, 52, 112, 36, 63, 112, 52, 53, 51, 63, 52, 53, 112, 54, 34, 49, Base64.padSymbol, 53, 106, 112, 57, 52, 109, 119, 80, 88, 93, 84, 85, 17, 69, 94, 17, 71, 80, 93, 88, 85, 80, 69, 84, 17, 120, 117, 2, 17, 69, 80, 86, 17, 70, 88, 69, 89, 17, 92, 80, 91, 94, 67, 103, 84, 67, 66, 88, 94, 95, Ascii.FF, 4, 48, 35, 47, 39, 98, 49, 43, 56, 39, 98, 39, 58, 33, 39, 39, 38, 49, 98, 48, 39, 47, 35, 43, 44, 43, 44, 37, 98, 54, 35, 37, 98, 38, 35, 54, 35, 71, 74, Base64.padSymbol, 107, 113, 109, Ascii.SI, Ascii.SUB, Ascii.SUB, Ascii.ETB, Ascii.ESC, Ascii.SI, 19, 88, 117, 34, 85, 116, 114, 126, 117, 116, 99, 97, 89, 91, 66, 66, 87, 86, Ascii.DC2, 123, 118, 1, Ascii.DC2, 70, 83, 85, Ascii.DC2, 69, 91, 70, 90, Ascii.DC2, 95, 83, 88, 93, 64, 100, 87, 64, 65, 91, 93, 92, Ascii.SI, 0, Ascii.DC2, 83, 92, 86, Ascii.DC2, 71, 92, 86, 87, 84, 91, 92, 87, 86, Ascii.DC2, 81, 93, 95, 66, 64, 87, 65, 65, 91, 93, 92, Ascii.DC2, 65, 81, 90, 87, 95, 87, 116, 76, 78, 87, 87, 66, 67, 7, 110, 99, Ascii.DC4, 7, 83, 70, 64, 7, 80, 78, 83, 79, 7, 82, 73, 84, 82, 87, 87, 72, 85, 83, 66, 67, 7, 74, 70, 77, 72, 85, 113, 66, 85, 84, 78, 72, 73, Ascii.SUB, Ascii.FS, 36, 38, 63, 63, 38, 33, 40, 111, 58, 33, 60, 58, 63, 63, 32, Base64.padSymbol, 59, 42, 43, 111, 44, 32, 34, 63, Base64.padSymbol, 42, 60, 60, 42, 43, 111, 32, Base64.padSymbol, 111, 42, 33, 44, Base64.padSymbol, 54, 63, 59, 42, 43, 111, 41, Base64.padSymbol, 46, 34, 42, 62, 50, 50, 50, Ascii.US, Ascii.RS, Ascii.FF, 103, 123, 124, 62, 63, 45, 70, 90, 93, 41, 46, 54, 55, 37, 78, 91, 68, Byte.MAX_VALUE, 116, 105, 97, 116, 114, 101, 116, 117, 49, 119, 120, 99, 98, 101, 49, 101, 121, 99, 116, 116, 49, 115, 104, 101, 116, 98, 49, 126, 119, 49, 88, 85, 34, 49, 101, 112, 118, 49, 121, 116, 112, 117, 116, 99, 43, 49, 19, 40, 53, 51, 54, 54, 41, 52, 50, 35, 34, 102, 37, 46, 39, 52, 39, 37, 50, 35, 52, 102, 35, 40, 37, 41, 34, 47, 40, 33, 97, 110, 110, 110, 70, 66, 78, 72, 74, 0, Ascii.NAK, 17, Ascii.GS, Ascii.ESC, Ascii.EM, 83, Ascii.SYN, Ascii.FF, Ascii.EM, Ascii.ESC, 81, 85, 89, 95, 93, Ascii.ETB, 82, 72, 95};
    }

    static {
        A0L();
        A04 = new C0911Vv();
        A03 = C0557Hx.A08(A0I(Opcodes.IF_ACMPNE, 3, 12));
    }

    public C0910Vu() {
        this(null);
    }

    public C0910Vu(DQ dq) {
        this.A00 = dq;
    }

    public static int A00(int i) {
        if (i == 0 || i == 3) {
            return 1;
        }
        return 2;
    }

    public static int A01(C0541Hh c0541Hh, int i) {
        byte[] bArr = c0541Hh.A00;
        for (int A06 = c0541Hh.A06(); A06 + 1 < i; A06++) {
            int i2 = bArr[A06];
            if ((i2 & 255) == 255 && bArr[A06 + 1] == 0) {
                int i3 = A06 + 2;
                int i4 = A06 + 1;
                int i5 = (i - A06) - 2;
                String[] strArr = A02;
                String str = strArr[0];
                String str2 = strArr[6];
                int i6 = str.charAt(4);
                if (i6 == str2.charAt(4)) {
                    throw new RuntimeException();
                }
                A02[1] = "GmDFLtMXmPbGQOJzrAUGcq8JFdShu0kr";
                System.arraycopy(bArr, i3, bArr, i4, i5);
                i--;
            }
        }
        return i;
    }

    /* JADX WARN: Incorrect condition in loop: B:2:0x0001 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int A02(byte[] bArr, int i) {
        while (i < i) {
            int i2 = bArr[i];
            if (i2 == 0) {
                return i;
            }
            i++;
        }
        int i3 = bArr.length;
        return i3;
    }

    /* JADX WARN: Incorrect condition in loop: B:6:0x000d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int A03(byte[] bArr, int i, int i2) {
        int A022 = A02(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return A022;
        }
        while (A022 < terminationPos - 1) {
            int terminationPos = A022 % 2;
            if (terminationPos == 0) {
                int terminationPos2 = A022 + 1;
                if (bArr[terminationPos2] == 0) {
                    return A022;
                }
            }
            int terminationPos3 = A022 + 1;
            A022 = A02(bArr, terminationPos3);
        }
        int terminationPos4 = bArr.length;
        return terminationPos4;
    }

    public static ApicFrame A04(C0541Hh c0541Hh, int i, int i2) throws UnsupportedEncodingException {
        int A022;
        String A0M;
        int descriptionStartIndex = c0541Hh.A0E();
        String A0H = A0H(descriptionStartIndex);
        int encoding = i - 1;
        byte[] bArr = new byte[encoding];
        int encoding2 = i - 1;
        c0541Hh.A0c(bArr, 0, encoding2);
        String A0I = A0I(458, 6, 45);
        String A0I2 = A0I(Opcodes.RET, 10, 32);
        if (i2 == 2) {
            A022 = 2;
            A0M = A0I + C0557Hx.A0M(new String(bArr, 0, 3, A0I2));
            if (A0I(474, 9, 58).equals(A0M)) {
                A0M = A0I(464, 10, 126);
            }
        } else {
            A022 = A02(bArr, 0);
            A0M = C0557Hx.A0M(new String(bArr, 0, A022, A0I2));
            if (A0M.indexOf(47) == -1) {
                A0M = A0I + A0M;
            }
        }
        int encoding3 = A022 + 1;
        int i3 = bArr[encoding3] & 255;
        int i4 = A022 + 2;
        int mimeTypeEndIndex = A03(bArr, i4, descriptionStartIndex);
        int encoding4 = mimeTypeEndIndex - i4;
        String str = new String(bArr, i4, encoding4, A0H);
        int A00 = A00(descriptionStartIndex) + mimeTypeEndIndex;
        int encoding5 = bArr.length;
        return new ApicFrame(A0M, str, i3, A0N(bArr, A00, encoding5));
    }

    public static BinaryFrame A05(C0541Hh c0541Hh, int i, String str) {
        byte[] bArr = new byte[i];
        c0541Hh.A0c(bArr, 0, i);
        return new BinaryFrame(str, bArr);
    }

    public static ChapterTocFrame A07(C0541Hh c0541Hh, int i, int i2, boolean z, int framePosition, DQ dq) throws UnsupportedEncodingException {
        int A06 = c0541Hh.A06();
        int A022 = A02(c0541Hh.A00, A06);
        String A0I = A0I(Opcodes.RET, 10, 32);
        String str = new String(c0541Hh.A00, A06, A022 - A06, A0I);
        c0541Hh.A0Y(A022 + 1);
        int framePosition2 = c0541Hh.A0E();
        boolean z2 = (framePosition2 & 2) != 0;
        boolean z3 = (framePosition2 & 1) != 0;
        int A0E = c0541Hh.A0E();
        String[] strArr = new String[A0E];
        for (int i3 = 0; i3 < A0E; i3++) {
            int startIndex = c0541Hh.A06();
            int i4 = A02(c0541Hh.A00, startIndex);
            int framePosition3 = i4 - startIndex;
            strArr[i3] = new String(c0541Hh.A00, startIndex, framePosition3, A0I);
            c0541Hh.A0Y(i4 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i5 = A06 + i;
        while (c0541Hh.A06() < i5) {
            String[] strArr2 = A02;
            String str2 = strArr2[4];
            String str3 = strArr2[5];
            int framePosition4 = str2.length();
            if (framePosition4 != str3.length()) {
                throw new RuntimeException();
            }
            String[] strArr3 = A02;
            strArr3[4] = "YQsr0udxa6AlS4ZOrNFlw";
            strArr3[5] = "dBU8ocTiI6WLc8wZTOIXb";
            Id3Frame A0B = A0B(i2, c0541Hh, z, framePosition, dq);
            if (A0B != null) {
                arrayList.add(A0B);
            }
        }
        Id3Frame[] id3FrameArr = new Id3Frame[arrayList.size()];
        arrayList.toArray(id3FrameArr);
        return new ChapterTocFrame(str, z2, z3, strArr, id3FrameArr);
    }

    public static CommentFrame A08(C0541Hh c0541Hh, int i) throws UnsupportedEncodingException {
        if (i < 4) {
            return null;
        }
        int textStartIndex = c0541Hh.A0E();
        String A0H = A0H(textStartIndex);
        byte[] bArr = new byte[3];
        c0541Hh.A0c(bArr, 0, 3);
        String description = new String(bArr, 0, 3);
        int encoding = i - 4;
        byte[] data = new byte[encoding];
        int encoding2 = i - 4;
        c0541Hh.A0c(data, 0, encoding2);
        int encoding3 = A03(data, 0, textStartIndex);
        String language = new String(data, 0, encoding3, A0H);
        int A00 = A00(textStartIndex) + encoding3;
        int encoding4 = A03(data, A00, textStartIndex);
        String charset = A0K(data, A00, encoding4, A0H);
        return new CommentFrame(description, language, charset);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x008b, code lost:
    
        if (r0 != 0) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static DR A0A(C0541Hh c0541Hh) {
        int A042 = c0541Hh.A04();
        String A0I = A0I(Opcodes.PUTSTATIC, 10, 19);
        if (A042 < 10) {
            Log.w(A0I, A0I(26, 31, 29));
            return null;
        }
        int A0G = c0541Hh.A0G();
        int id = A03;
        if (A0G != id) {
            Log.w(A0I, A0I(376, 48, 19) + A0G);
            return null;
        }
        int A0E = c0541Hh.A0E();
        boolean z = true;
        c0541Hh.A0Z(1);
        int framesSize = c0541Hh.A0E();
        int A0D = c0541Hh.A0D();
        if (A0E == 2) {
            int id2 = framesSize & 64;
            int id3 = id2 != 0 ? 1 : 0;
            if (id3 != 0) {
                Log.w(A0I, A0I(Opcodes.ANEWARRAY, 68, 48));
                return null;
            }
        } else if (A0E == 3) {
            int id4 = framesSize & 64;
            int id5 = id4 != 0 ? 1 : 0;
            if (id5 != 0) {
                int id6 = c0541Hh.A08();
                c0541Hh.A0Z(id6);
                A0D -= id6 + 4;
            }
        } else if (A0E == 4) {
            int id7 = framesSize & 64;
            int id8 = id7 != 0 ? 1 : 0;
            if (id8 != 0) {
                int majorVersion = c0541Hh.A0D();
                int id9 = majorVersion - 4;
                c0541Hh.A0Z(id9);
                A0D -= majorVersion;
            }
            int id10 = framesSize & 16;
            int id11 = id10 != 0 ? 1 : 0;
            if (id11 != 0) {
                A0D -= 10;
            }
        } else {
            Log.w(A0I, A0I(257, 46, 37) + A0E);
            return null;
        }
        if (A0E < 4) {
            int id12 = framesSize & 128;
        }
        z = false;
        return new DR(A0E, z, A0D);
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x01b7, code lost:
    
        if (r7 == 86) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01bc, code lost:
    
        r13 = A0C(r26, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01ba, code lost:
    
        if (r7 == 86) goto L119;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Id3Frame A0B(int flags, C0541Hh c0541Hh, boolean z, int i, DQ dq) {
        int i2;
        int flags2;
        int frameSize;
        Id3Frame A05;
        int frameId1 = c0541Hh.A0E();
        int frameId0 = c0541Hh.A0E();
        int A0E = c0541Hh.A0E();
        if (flags >= 3) {
            i2 = c0541Hh.A0E();
        } else {
            i2 = 0;
        }
        if (flags == 4) {
            int A0H = c0541Hh.A0H();
            if (!z) {
                int frameSize2 = A0H >> 8;
                int i3 = (A0H & 255) | ((frameSize2 & 255) << 7);
                int frameSize3 = A0H >> 16;
                int i4 = i3 | ((frameSize3 & 255) << 14);
                int frameSize4 = A0H >> 24;
                flags2 = i4 | ((frameSize4 & 255) << 21);
            } else {
                flags2 = A0H;
            }
        } else if (flags == 3) {
            flags2 = c0541Hh.A0H();
        } else {
            flags2 = c0541Hh.A0G();
        }
        if (flags >= 3) {
            frameSize = c0541Hh.A0I();
        } else {
            frameSize = 0;
        }
        if (frameId1 == 0 && frameId0 == 0 && A0E == 0 && i2 == 0 && flags2 == 0 && frameSize == 0) {
            c0541Hh.A0Y(c0541Hh.A07());
            return null;
        }
        int nextFramePosition = c0541Hh.A06() + flags2;
        int frameId3 = c0541Hh.A07();
        String A0I = A0I(Opcodes.PUTSTATIC, 10, 19);
        if (nextFramePosition > frameId3) {
            Log.w(A0I, A0I(Opcodes.LOR, 37, 64));
            c0541Hh.A0Y(c0541Hh.A07());
            return null;
        }
        if (dq != null && !dq.A5V(flags, frameId1, frameId0, A0E, i2)) {
            return null;
        }
        int i5 = 0;
        int frameSize5 = 0;
        int nextFramePosition2 = 0;
        int frameId32 = 0;
        boolean z2 = false;
        if (flags == 3) {
            frameId32 = (frameSize & 128) != 0 ? 1 : 0;
            frameSize5 = (frameSize & 64) != 0 ? 1 : 0;
            z2 = (frameSize & 32) != 0;
            i5 = frameId32;
        } else if (flags == 4) {
            z2 = (frameSize & 64) != 0;
            int nextFramePosition3 = frameSize & 8;
            if (A02[7].length() != 9) {
                A02[1] = "HxLFBObUGoObUPku8sA9h7LrWEHKW34t";
                i5 = nextFramePosition3 != 0 ? 1 : 0;
                frameSize5 = (frameSize & 4) != 0 ? 1 : 0;
                nextFramePosition2 = (frameSize & 2) != 0 ? 1 : 0;
                frameId32 = (frameSize & 1) != 0 ? 1 : 0;
                if (A02[7].length() == 9) {
                    throw new RuntimeException();
                }
                A02[1] = "76YFuh7tw8gcxzUEh5emTmdExIUmXPMQ";
            }
            throw new RuntimeException();
        }
        if (i5 != 0 || frameSize5 != 0) {
            Log.w(A0I, A0I(303, 50, 77));
            return null;
        }
        if (z2) {
            flags2--;
            c0541Hh.A0Z(1);
        }
        if (frameId32 != 0) {
            flags2 -= 4;
            c0541Hh.A0Z(4);
        }
        if (nextFramePosition2 != 0) {
            flags2 = A01(c0541Hh, flags2);
        }
        try {
        } catch (UnsupportedEncodingException unused) {
            Log.w(A0I, A0I(TypedValues.CycleType.TYPE_WAVE_OFFSET, 30, 68));
            return null;
        } finally {
            c0541Hh.A0Y(nextFramePosition);
        }
        if (frameId1 == 84 && frameId0 == 88 && A0E == 88 && (flags == 2 || i2 == 88)) {
            A05 = A0D(c0541Hh, flags2);
        } else if (frameId1 == 84) {
            String id = A0J(flags, frameId1, frameId0, A0E, i2);
            A05 = A0E(c0541Hh, flags2, id);
        } else if (frameId1 == 87 && frameId0 == 88 && A0E == 88 && (flags == 2 || i2 == 88)) {
            A05 = A0F(c0541Hh, flags2);
        } else if (frameId1 == 87) {
            String id2 = A0J(flags, frameId1, frameId0, A0E, i2);
            A05 = A0G(c0541Hh, flags2, id2);
        } else {
            if (frameId1 == 80 && frameId0 == 82 && A0E == 73) {
                String[] strArr = A02;
                if (strArr[3].charAt(18) != strArr[2].charAt(18)) {
                    A02[7] = "TpWBQOHSHz";
                }
                Log.w(A0I, A0I(TypedValues.CycleType.TYPE_WAVE_OFFSET, 30, 68));
                return null;
            }
            if (frameId1 != 71 || frameId0 != 69 || A0E != 79 || (i2 != 66 && flags != 2)) {
                String[] strArr2 = A02;
                String str = strArr2[3];
                String str2 = strArr2[2];
                int frameId33 = str.charAt(18);
                if (frameId33 != str2.charAt(18)) {
                    A02[1] = "1pyFPk3tXqgthrOgLBh9Cc6ujVWwqIgx";
                    if (flags != 2 ? !(frameId1 != 65 || frameId0 != 80 || A0E != 73 || i2 != 67) : !(frameId1 != 80 || frameId0 != 73 || A0E != 67)) {
                        A05 = A04(c0541Hh, flags2, flags);
                    } else if (frameId1 != 67 || frameId0 != 79 || A0E != 77 || (i2 != 77 && flags != 2)) {
                        if (frameId1 == 67 && frameId0 == 72 && A0E == 65 && i2 == 80) {
                            A05 = A06(c0541Hh, flags2, flags, z, i, dq);
                        } else if (frameId1 == 67 && frameId0 == 84 && A0E == 79 && i2 == 67) {
                            A05 = A07(c0541Hh, flags2, flags, z, i, dq);
                        } else {
                            String id3 = A0J(flags, frameId1, frameId0, A0E, i2);
                            A05 = A05(c0541Hh, flags2, id3);
                        }
                    } else {
                        A05 = A08(c0541Hh, flags2);
                    }
                }
                throw new RuntimeException();
            }
            A05 = A09(c0541Hh, flags2);
        }
        if (A05 == null) {
            Log.w(A0I, A0I(57, 27, 82) + A0J(flags, frameId1, frameId0, A0E, i2) + A0I(14, 12, 119) + flags2);
        }
        c0541Hh.A0Y(nextFramePosition);
        String[] strArr3 = A02;
        if (strArr3[0].charAt(4) == strArr3[6].charAt(4)) {
            throw new RuntimeException();
        }
        String[] strArr4 = A02;
        strArr4[0] = "Dtpy20dKfpjr6GTNw3SVg8ra0l6IUEaG";
        strArr4[6] = "adhGTkdPtMJ1tGydAzIftpfQfU5S2oNR";
        return A05;
    }

    public static PrivFrame A0C(C0541Hh c0541Hh, int i) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i];
        c0541Hh.A0c(bArr, 0, i);
        int A022 = A02(bArr, 0);
        return new PrivFrame(new String(bArr, 0, A022, A0I(Opcodes.RET, 10, 32)), A0N(bArr, A022 + 1, bArr.length));
    }

    public static TextInformationFrame A0D(C0541Hh c0541Hh, int i) throws UnsupportedEncodingException {
        if (i < 1) {
            return null;
        }
        int valueStartIndex = c0541Hh.A0E();
        String A0H = A0H(valueStartIndex);
        int encoding = i - 1;
        byte[] data = new byte[encoding];
        int encoding2 = i - 1;
        c0541Hh.A0c(data, 0, encoding2);
        int encoding3 = A03(data, 0, valueStartIndex);
        String description = new String(data, 0, encoding3, A0H);
        int A00 = A00(valueStartIndex) + encoding3;
        int encoding4 = A03(data, A00, valueStartIndex);
        String A0K = A0K(data, A00, encoding4, A0H);
        String charset = A0I(353, 4, 104);
        return new TextInformationFrame(charset, description, A0K);
    }

    public static TextInformationFrame A0E(C0541Hh c0541Hh, int i, String str) throws UnsupportedEncodingException {
        if (i < 1) {
            return null;
        }
        int A0E = c0541Hh.A0E();
        String A0H = A0H(A0E);
        int encoding = i - 1;
        byte[] data = new byte[encoding];
        int encoding2 = i - 1;
        c0541Hh.A0c(data, 0, encoding2);
        int encoding3 = A03(data, 0, A0E);
        return new TextInformationFrame(str, null, new String(data, 0, encoding3, A0H));
    }

    public static UrlLinkFrame A0F(C0541Hh c0541Hh, int i) throws UnsupportedEncodingException {
        if (i < 1) {
            return null;
        }
        int descriptionEndIndex = c0541Hh.A0E();
        String A0H = A0H(descriptionEndIndex);
        int encoding = i - 1;
        byte[] bArr = new byte[encoding];
        int encoding2 = i - 1;
        c0541Hh.A0c(bArr, 0, encoding2);
        int encoding3 = A03(bArr, 0, descriptionEndIndex);
        String str = new String(bArr, 0, encoding3, A0H);
        int A00 = A00(descriptionEndIndex) + encoding3;
        String A0K = A0K(bArr, A00, A02(bArr, A00), A0I(Opcodes.RET, 10, 32));
        String charset = A0I(454, 4, 52);
        return new UrlLinkFrame(charset, str, A0K);
    }

    public static UrlLinkFrame A0G(C0541Hh c0541Hh, int i, String str) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i];
        c0541Hh.A0c(bArr, 0, i);
        return new UrlLinkFrame(str, null, new String(bArr, 0, A02(bArr, 0), A0I(Opcodes.RET, 10, 32)));
    }

    public static String A0H(int i) {
        String A0I = A0I(Opcodes.RET, 10, 32);
        switch (i) {
            case 0:
                return A0I;
            case 1:
                return A0I(357, 6, 72);
            case 2:
                return A0I(363, 8, 105);
            case 3:
                String A0I2 = A0I(371, 5, 97);
                String[] strArr = A02;
                if (strArr[0].charAt(4) == strArr[6].charAt(4)) {
                    throw new RuntimeException();
                }
                A02[7] = "WB3CnC";
                return A0I2;
            default:
                return A0I;
        }
    }

    public static String A0J(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, A0I(0, 6, 105), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, A0I(6, 8, 11), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    public static String A0K(byte[] bArr, int i, int i2, String str) throws UnsupportedEncodingException {
        if (i2 > i && i2 <= bArr.length) {
            return new String(bArr, i, i2 - i, str);
        }
        String[] strArr = A02;
        if (strArr[4].length() != strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[0] = "r4Qi0WBzOYfLLA4UC9s9DAK76ksjAQPp";
        strArr2[6] = "c5jPrSHyFK7RFs6Pjjym9ojkSMFCl1O5";
        return A0I(0, 0, 121);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00af, code lost:
    
        if (r8 != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b1, code lost:
    
        r7 = 0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b3, code lost:
    
        if (r9 == 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b5, code lost:
    
        r7 = r7 + 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ba, code lost:
    
        if (r3 >= r7) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e7, code lost:
    
        r0 = r16.A04();
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ee, code lost:
    
        if (r0 >= r3) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f7, code lost:
    
        r16.A0Y(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00fa, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00bc, code lost:
    
        r16.A0Y(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00bf, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00cc, code lost:
    
        if (r8 != false) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean A0M(C0541Hh c0541Hh, int i, int i2, boolean z) {
        int A08;
        long A0M;
        int A0I;
        int A06 = c0541Hh.A06();
        while (true) {
            try {
                if (c0541Hh.A04() >= i2) {
                    if (i >= 3) {
                        try {
                            A08 = c0541Hh.A08();
                            A0M = c0541Hh.A0M();
                            A0I = c0541Hh.A0I();
                        } catch (Throwable th) {
                            th = th;
                            c0541Hh.A0Y(A06);
                            throw th;
                        }
                    } else {
                        A08 = c0541Hh.A0G();
                        A0M = c0541Hh.A0G();
                        A0I = 0;
                    }
                    if (A08 == 0 && A0M == 0 && A0I == 0) {
                        c0541Hh.A0Y(A06);
                        return true;
                    }
                    if (i == 4 && !z) {
                        if ((8421504 & A0M) != 0) {
                            c0541Hh.A0Y(A06);
                            return false;
                        }
                        long j = (A0M & 255) | (((A0M >> 8) & 255) << 7);
                        String[] strArr = A02;
                        if (strArr[4].length() != strArr[5].length()) {
                            throw new RuntimeException();
                        }
                        String[] strArr2 = A02;
                        strArr2[0] = "WW8harr0n1WVcE671SufvW5i3HFI8G3E";
                        strArr2[6] = "cs8JhXohJ41Zu2keAfctBKv0IiLyHEBA";
                        A0M = (((A0M >> 24) & 255) << 21) | j | (((A0M >> 16) & 255) << 14);
                    }
                    boolean z2 = false;
                    int flags = 0;
                    if (i == 4) {
                        z2 = (A0I & 64) != 0;
                        flags = (A0I & 1) == 0 ? 0 : 1;
                    } else if (i == 3) {
                        int minimumFrameSize = A0I & 32;
                        z2 = minimumFrameSize != 0;
                        int minimumFrameSize2 = A0I & 128;
                        flags = minimumFrameSize2 == 0 ? 0 : 1;
                    }
                    int i3 = 0;
                    String[] strArr3 = A02;
                    if (strArr3[4].length() == strArr3[5].length()) {
                        String[] strArr4 = A02;
                        strArr4[3] = "otGI0hsmNkIa4sbMlKQFq5zev1M8Vgvr";
                        strArr4[2] = "hsxwZKJ37TLGlj6U8xTCexdOCMrqimac";
                    }
                } else {
                    c0541Hh.A0Y(A06);
                    return true;
                }
                int minimumFrameSize3 = (int) A0M;
                c0541Hh.A0Z(minimumFrameSize3);
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public static byte[] A0N(byte[] bArr, int i, int i2) {
        if (i2 <= i) {
            return new byte[0];
        }
        return Arrays.copyOfRange(bArr, i, i2);
    }

    public final Metadata A0O(byte[] bArr, int i) {
        int i2;
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        ArrayList arrayList = new ArrayList();
        C0541Hh c0541Hh = new C0541Hh(bArr, i);
        DR A0A = A0A(c0541Hh);
        if (A0A == null) {
            return null;
        }
        int startPosition = c0541Hh.A06();
        i2 = A0A.A01;
        int frameHeaderSize = i2 == 2 ? 6 : 10;
        i3 = A0A.A00;
        z = A0A.A02;
        if (z) {
            i8 = A0A.A00;
            i3 = A01(c0541Hh, i8);
        }
        c0541Hh.A0X(startPosition + i3);
        boolean z2 = false;
        i4 = A0A.A01;
        if (!A0M(c0541Hh, i4, frameHeaderSize, false)) {
            i6 = A0A.A01;
            if (i6 == 4 && A0M(c0541Hh, 4, frameHeaderSize, true)) {
                z2 = true;
            } else {
                StringBuilder append = new StringBuilder().append(A0I(84, 45, 51));
                i7 = A0A.A01;
                Log.w(A0I(Opcodes.PUTSTATIC, 10, 19), append.append(i7).toString());
                return null;
            }
        }
        while (c0541Hh.A04() >= frameHeaderSize) {
            i5 = A0A.A01;
            Id3Frame A0B = A0B(i5, c0541Hh, z2, frameHeaderSize, this.A00);
            if (A0B != null) {
                arrayList.add(A0B);
            }
        }
        return new Metadata(arrayList);
    }

    @Override // com.facebook.ads.redexgen.X.DE
    public final Metadata A4x(D1 d1) {
        ByteBuffer buffer = d1.A01;
        return A0O(buffer.array(), buffer.limit());
    }
}
