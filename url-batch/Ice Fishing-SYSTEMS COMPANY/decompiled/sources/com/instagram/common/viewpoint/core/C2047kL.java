package com.instagram.common.viewpoint.core;

import com.anythink.basead.exoplayer.b;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.File;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@MetaExoPlayerCustomization(type = {"NON_FINAL"}, value = "D54147219: For usage in Hero Simple Cache")
/* renamed from: com.facebook.ads.redexgen.X.kL, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2047kL extends MZ {
    public static byte[] A00;
    public static String[] A01 = {"OfRtwvXctRBBw9gKY8TWbFYEyrfTWUJ5", "O6KpU7VzQb47vbeRDg05X09dlcjSdrsx", "cGvb3Ixjw9glBryIXlKjYbTfS5Fhfs8X", "N3q9w52q7yAs4MQ92KFgaGGqaH957eGg", "tjYOyBogfVGQWArOceKhNo0cgBZwypsu", "xmSgRcjNSrQyzCd8Uu5cYZa5hRrGr9a8", "10tums6VyruOnAjrgpE7eJ8", "dQkd96lx4iAtJg2k9NqdAtWwc5SxpqrB"};
    public static final Pattern A02;
    public static final Pattern A03;
    public static final Pattern A04;

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a8, code lost:
    
        if (r12 == com.anythink.basead.exoplayer.b.f6539b) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00aa, code lost:
    
        r12 = java.lang.Long.parseLong((java.lang.String) com.instagram.common.viewpoint.core.AbstractC06233y.A01(r3.group(3)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00be, code lost:
    
        return new com.instagram.common.viewpoint.core.C2047kL(r7, r8, r10, r12, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d7, code lost:
    
        if (r12 == com.anythink.basead.exoplayer.b.f6539b) goto L26;
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C2047kL A01(File file, long j9, long j10, C1080Mi c1080Mi) {
        long parseLong;
        long j11 = j10;
        long j12 = j9;
        String name = file.getName();
        if (!name.endsWith(A07(1, 7, 86))) {
            file = A06(file, c1080Mi);
            if (file == null) {
                return null;
            }
            name = file.getName();
        }
        Matcher matcher = A04.matcher(name);
        if (!matcher.matches() || (r7 = c1080Mi.A0F(Integer.parseInt((String) AbstractC06233y.A01(matcher.group(1))))) == null) {
            return null;
        }
        if (j12 == -1) {
            j12 = file.length();
        }
        String[] strArr = A01;
        if (strArr[0].charAt(16) == strArr[2].charAt(16)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[0] = "3kLuDF7WddxsAuj74YBqy147zLEiHTF0";
        strArr2[2] = "yBKAMqN1ItuNGOhP7OCxzG9BVSMF66iW";
        if (j12 == 0) {
            return null;
        }
        String group = matcher.group(2);
        if (A01[7].charAt(17) != 'N') {
            String[] strArr3 = A01;
            strArr3[4] = "3kqdJGKw3CP8mm7UdAcKh0LFQ5WJAflS";
            strArr3[3] = "ycjOreuQW9uSgeP7cymbjNDk2aBjdnIT";
            parseLong = Long.parseLong((String) AbstractC06233y.A01(group));
        } else {
            A01[7] = "aSANG9oSWduq5GFK5NdZXfdN35yUyqYg";
            parseLong = Long.parseLong((String) AbstractC06233y.A01(group));
        }
    }

    public static String A07(int i, int i4, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i4);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] - i9) - 31);
        }
        return new String(copyOfRange);
    }

    public static void A08() {
        A00 = new byte[]{93, -93, -21, -88, -93, -38, -19, -28, -28, -82, -76, -79, -81, -30, -76, -82, -30, -22, -79, -81, -30, -76, -82, -30, -22, -79, -81, -30, -76, -4, -73, -30, -76, -21, -2, -11, -86, -13, -67, -61, -64, -66, -15, -61, -67, -15, -7, -64, -66, -15, -61, -67, -15, -7, -64, -66, -15, -61, 11, -57, -15, -61, -6, 13, 4, -71, -40, -94, -42, -34, -91, -93, -42, -88, -94, -42, -34, -91, -93, -42, -88, -94, -42, -34, -91, -93, -42, -88, -16, -83, -42, -88, -33, -14, -23, -98};
    }

    static {
        A08();
        A02 = Pattern.compile(A07(8, 29, 103), 32);
        A03 = Pattern.compile(A07(37, 29, 118), 32);
        A04 = Pattern.compile(A07(66, 30, 91), 32);
    }

    public C2047kL(String str, long j9, long j10, long j11, File file) {
        super(str, j9, j10, j11, file);
    }

    public static C2047kL A02(File file, long j9, C1080Mi c1080Mi) {
        return A01(file, j9, b.f6539b, c1080Mi);
    }

    public static C2047kL A03(String str, long j9) {
        return new C2047kL(str, j9, -1L, b.f6539b, null);
    }

    public static C2047kL A04(String str, long j9, long j10) {
        return new C2047kL(str, j9, j10, b.f6539b, null);
    }

    public static File A05(File file, int i, long j9, long j10) {
        StringBuilder append = new StringBuilder().append(i);
        String A07 = A07(0, 1, 16);
        return new File(file, append.append(A07).append(j9).append(A07).append(j10).append(A07(1, 7, 86)).toString());
    }

    public static File A06(File file, C1080Mi c1080Mi) {
        String str = null;
        String name = file.getName();
        Matcher matcher = A03.matcher(name);
        if (matcher.matches()) {
            String key = matcher.group(1);
            str = C5C.A0l((String) AbstractC06233y.A01(key));
        } else {
            matcher = A02.matcher(name);
            if (matcher.matches()) {
                String key2 = matcher.group(1);
                Object A012 = AbstractC06233y.A01(key2);
                String[] strArr = A01;
                String filename = strArr[0];
                if (filename.charAt(16) == strArr[2].charAt(16)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A01;
                strArr2[0] = "SH9gvm8hJK4XlSeUgFI9DN0CGl9RiOAn";
                strArr2[2] = "6Y4JW5a7TLCjGmr1nVotQhjybpiv9cHJ";
                str = (String) A012;
            }
        }
        if (str == null) {
            return null;
        }
        File file2 = (File) AbstractC06233y.A02(file.getParentFile());
        int A0B = c1080Mi.A0B(str);
        String key3 = matcher.group(2);
        long parseLong = Long.parseLong((String) AbstractC06233y.A01(key3));
        String key4 = matcher.group(3);
        File A05 = A05(file2, A0B, parseLong, Long.parseLong((String) AbstractC06233y.A01(key4)));
        if (!file.renameTo(A05)) {
            return null;
        }
        return A05;
    }

    public final C2047kL A09(File file, long j9) {
        AbstractC06233y.A08(this.A05);
        return new C2047kL(this.A04, this.A02, this.A01, j9, file);
    }
}
