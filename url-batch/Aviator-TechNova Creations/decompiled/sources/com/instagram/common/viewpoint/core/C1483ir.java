package com.instagram.common.viewpoint.core;

import android.os.ConditionVariable;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.google.common.base.Ascii;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Random;
import java.util.TreeSet;
import kotlin.io.encoding.Base64;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.ir, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1483ir implements InterfaceC0586Ln {
    public static byte[] A0B;
    public static String[] A0C = {"", "bCiwVY89t3fNm3gVh5Cta1r1ex617UD6", "2pbQHFWCVx6Uhmp9EyO9uCwpcu4x9Dl0", "32tJ4jyYWOzcf72n5Wgg62", "i6oCPG91V", "KagoX429g1hrk2zqYLocuLLyf0lslURo", "DhZpyS71VRHuUy7Qk1AUkZm91VAyIgrZ", "oeCQOWeJcqbtbEq5qioytyhoePvaJg5Z"};
    public static final HashSet<File> A0D;
    public long A00;
    public long A01;
    public C0583Lk A02;
    public boolean A03;
    public final InterfaceC1488iw A04;
    public final C0592Lt A05;
    public final M6 A06;
    public final File A07;
    public final HashMap<String, ArrayList<InterfaceC0585Lm>> A08;
    public final Random A09;
    public final boolean A0A;

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0B, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A0C;
            if (strArr[3].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0C;
            strArr2[6] = "f7QnNjNC08rjnWmNVHuGYagSWe5Lcp9o";
            strArr2[7] = "r0Bisby3rM4igG5oRpf6tXDb0tjiDQ2I";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 43);
            i4++;
        }
    }

    public static void A07() {
        A0B = new byte[]{110, 53, 41, 36, 99, 76, 77, 86, 74, 71, 80, 2, 113, 75, 79, 82, 78, 71, 97, 67, 65, 74, 71, 2, 75, 76, 81, 86, 67, 76, 65, 71, 2, 87, 81, 71, 81, 2, 86, 74, 71, 2, 68, 77, 78, 70, 71, 80, Ascii.CAN, 2, 114, 79, 88, 103, 91, 86, 78, 82, 69, Ascii.CR, 100, 94, 90, 71, 91, 82, 116, 86, 84, 95, 82, 126, 89, 94, 67, 35, 4, Ascii.FF, 9, 0, 1, 69, 17, 10, 69, 6, Ascii.ETB, 0, 4, 17, 0, 69, 48, 44, 33, 69, 3, Ascii.FF, 9, 0, 95, 69, Ascii.US, 56, 48, 53, 60, Base64.padSymbol, 121, 45, 54, 121, 58, 43, 60, 56, 45, 60, 121, 58, 56, 58, 49, 60, 121, Ascii.FF, 16, Ascii.GS, 99, 121, 108, 75, 67, 70, 79, 78, 10, 94, 69, 10, 73, 88, 79, 75, 94, 79, 10, 73, 75, 73, 66, 79, 10, 78, 67, 88, 79, 73, 94, 69, 88, 83, 16, 10, 112, 87, 95, 90, 83, 82, Ascii.SYN, 66, 89, Ascii.SYN, 95, 88, 95, 66, 95, 87, 90, 95, 76, 83, Ascii.SYN, 85, 87, 85, 94, 83, Ascii.SYN, 95, 88, 82, 95, 85, 83, 69, Ascii.FF, Ascii.SYN, 43, Ascii.FF, 4, 1, 8, 9, 77, Ascii.EM, 2, 77, 1, 4, Ascii.RS, Ascii.EM, 77, Ascii.SO, Ascii.FF, Ascii.SO, 5, 8, 77, 9, 4, Ascii.US, 8, Ascii.SO, Ascii.EM, 2, Ascii.US, Ascii.DC4, 77, Ascii.VT, 4, 1, 8, Ascii.RS, 87, 77, 48, Ascii.ETB, Ascii.US, Ascii.SUB, 19, Ascii.DC2, 86, 2, Ascii.EM, 86, 4, 19, Ascii.ESC, Ascii.EM, 0, 19, 86, 16, Ascii.US, Ascii.SUB, 19, 86, Ascii.US, Ascii.CAN, Ascii.DC2, 19, Ascii.SO, 86, 19, Ascii.CAN, 2, 4, Ascii.SI, 86, 16, Ascii.EM, 4, 76, 86, 56, Ascii.DC4, Ascii.EM, 19, Ascii.SUB, 7, Ascii.CAN, 16, 17, 85, 32, 60, 49, 85, 19, Ascii.FS, Ascii.EM, 16, 79, 85, 102, 92, 88, 69, 89, 80, 118, 84, 86, 93, 80, 97, 70, 93, 64, 91, 92, 85, Ascii.DC2, 91, 92, 86, 87, 74, Ascii.DC2, 84, 91, 94, 87, Ascii.DC2, 84, 83, 91, 94, 87, 86};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 23 out of bounds for length 22
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private void A0G(File file, boolean z, File[] fileArr, Map<String, C0591Ls> map) {
        if (fileArr == null || fileArr.length == 0) {
            if (z) {
                return;
            }
            file.delete();
            return;
        }
        for (File file2 : fileArr) {
            if (A0C[2].charAt(26) != '8') {
                String[] strArr = A0C;
                strArr[6] = "8aOt5QXsfRNGpIpRxoAxSAZDoaRpec1S";
                strArr[7] = "wFGX3oecQoVuPclALoyOBFGO19d1hLj7";
                String name = file2.getName();
                if (z && name.indexOf(46) == -1) {
                    A0G(file2, false, file2.listFiles(), map);
                } else {
                    if (z) {
                        boolean A0A = M6.A0A(name);
                        if (A0C[0].length() != 2) {
                            String[] strArr2 = A0C;
                            strArr2[3] = "SjNVVRrUmgTFjXqPeyNmbh";
                            strArr2[4] = "SAWP83LvD";
                            if (!A0A) {
                                if (name.endsWith(A04(0, 4, 107))) {
                                }
                            }
                        }
                    }
                    long j = -1;
                    long j2 = -9223372036854775807L;
                    C0591Ls remove = map != null ? map.remove(name) : null;
                    if (remove != null) {
                        j = remove.A01;
                        j2 = remove.A00;
                    }
                    C1482iq A01 = C1482iq.A01(file2, j, j2, this.A06);
                    if (A01 != null) {
                        A0C(A01);
                    } else {
                        file2.delete();
                    }
                }
            }
            throw new RuntimeException();
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized NavigableSet<C0596Lx> A0I(String str) {
        M4 A0C2;
        C3M.A08(!this.A03);
        A0C2 = this.A06.A0C(str);
        return (A0C2 == null || A0C2.A09()) ? new TreeSet() : new TreeSet((Collection) A0C2.A06());
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.instagram.common.viewpoint.core.InterfaceC0586Ln
    public final synchronized long A73(String str, long j, long j2) {
        long j3;
        long j4 = j;
        synchronized (this) {
            long j5 = j2 == -1 ? Long.MAX_VALUE : j4 + j2;
            if (j5 < 0) {
                j5 = Long.MAX_VALUE;
            }
            j3 = 0;
            while (j4 < j5) {
                long A74 = A74(str, j4, j5 - j4);
                if (A74 > 0) {
                    j3 += A74;
                } else {
                    A74 = -A74;
                }
                j4 += A74;
            }
        }
        return j3;
    }

    static {
        A07();
        A0D = new HashSet<>();
    }

    @Deprecated
    public C1483ir(File file, InterfaceC1488iw interfaceC1488iw) {
        this(file, interfaceC1488iw, (byte[]) null, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1483ir(File file, InterfaceC1488iw interfaceC1488iw, InterfaceC01604m interfaceC01604m, byte[] bArr, boolean z, boolean z2) {
        this(file, interfaceC1488iw, r1, r0);
        C0592Lt c0592Lt;
        M6 m6 = new M6(interfaceC01604m, file, bArr, z, z2);
        if (interfaceC01604m != null && !z2) {
            c0592Lt = new C0592Lt(interfaceC01604m);
        } else {
            c0592Lt = null;
        }
    }

    public C1483ir(File file, InterfaceC1488iw interfaceC1488iw, M6 m6, C0592Lt c0592Lt) {
        if (A0H(file)) {
            this.A07 = file;
            this.A04 = interfaceC1488iw;
            this.A06 = m6;
            this.A05 = c0592Lt;
            this.A08 = new HashMap<>();
            this.A09 = new Random();
            this.A0A = interfaceC1488iw.AHz();
            this.A01 = -1L;
            ConditionVariable conditionVariable = new ConditionVariable();
            new MD(this, A04(50, 25, 28), conditionVariable).start();
            conditionVariable.block();
            return;
        }
        throw new IllegalStateException(A04(4, 46, 9) + file);
    }

    @Deprecated
    public C1483ir(File file, InterfaceC1488iw interfaceC1488iw, byte[] bArr, boolean z) {
        this(file, interfaceC1488iw, null, bArr, z, true);
    }

    public static long A00(File file) throws IOException {
        long nextLong = new SecureRandom().nextLong();
        long abs = nextLong == Long.MIN_VALUE ? 0L : Math.abs(nextLong);
        File file2 = new File(file, Long.toString(abs, 16) + A04(0, 4, 107));
        if (file2.createNewFile()) {
            return abs;
        }
        throw new IOException(A04(75, 27, 78) + file2);
    }

    public static long A01(String str) {
        return Long.parseLong(str.substring(0, str.indexOf(46)), 16);
    }

    public static long A02(File[] fileArr) {
        for (File file : fileArr) {
            String fileName = file.getName();
            if (fileName.endsWith(A04(0, 4, 107))) {
                try {
                    return A01(fileName);
                } catch (NumberFormatException unused) {
                    AnonymousClass44.A05(A04(297, 11, 30), A04(277, 20, 94) + file);
                    file.delete();
                }
            }
        }
        return -1L;
    }

    private C1482iq A03(String str, long j, long j2) {
        C1482iq A04;
        M4 A0C2 = this.A06.A0C(str);
        if (A0C2 == null) {
            return C1482iq.A04(str, j, j2);
        }
        while (true) {
            A04 = A0C2.A04(j, j2);
            if (!A04.A05 || A04.A03.length() == A04.A01) {
                break;
            }
            A06();
        }
        return A04;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05() {
        if (!this.A07.exists()) {
            try {
                A0F(this.A07);
            } catch (C0583Lk e) {
                this.A02 = e;
                return;
            }
        }
        File file = this.A07;
        String[] strArr = A0C;
        if (strArr[6].charAt(20) == strArr[7].charAt(20)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0C;
        strArr2[1] = "a7bsaZYeTJGewaTpvlEBtyxkDQTMEU8W";
        strArr2[5] = "kn4PmWwOChlyCy8qyQNRjkcz1fm49U24";
        File[] listFiles = file.listFiles();
        String A04 = A04(297, 11, 30);
        if (listFiles == null) {
            String str = A04(200, 38, 70) + this.A07;
            AnonymousClass44.A05(A04, str);
            this.A02 = new C0583Lk(str);
            return;
        }
        this.A01 = A02(listFiles);
        if (this.A01 == -1) {
            try {
                this.A01 = A00(this.A07);
            } catch (IOException e2) {
                String str2 = A04(102, 28, Opcodes.FREM) + this.A07;
                AnonymousClass44.A08(A04, str2, e2);
                this.A02 = new C0583Lk(str2, e2);
                return;
            }
        }
        try {
            this.A06.A0J(this.A01);
            if (this.A05 != null) {
                this.A05.A06(this.A01);
                Map<String, C0591Ls> A05 = this.A05.A05();
                A0G(this.A07, true, listFiles, A05);
                this.A05.A09(A05.keySet());
            } else {
                A0G(this.A07, true, listFiles, null);
            }
            this.A06.A0H();
            try {
                this.A06.A0I();
            } catch (IOException e3) {
                AnonymousClass44.A08(A04, A04(308, 25, 25), e3);
            }
        } catch (IOException e4) {
            String str3 = A04(Opcodes.IF_ICMPLE, 36, 29) + this.A07;
            AnonymousClass44.A08(A04, str3, e4);
            this.A02 = new C0583Lk(str3, e4);
        }
    }

    private void A06() {
        ArrayList arrayList = new ArrayList();
        Iterator<M4> it = this.A06.A0G().iterator();
        while (it.hasNext()) {
            Iterator<C1482iq> it2 = it.next().A06().iterator();
            while (it2.hasNext()) {
                C1482iq next = it2.next();
                if (next.A03.length() != next.A01) {
                    arrayList.add(next);
                }
            }
        }
        int i = 0;
        while (true) {
            int size = arrayList.size();
            String[] strArr = A0C;
            String str = strArr[1];
            String str2 = strArr[5];
            int i2 = str.charAt(29);
            if (i2 != str2.charAt(29)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0C;
            strArr2[1] = "aqjjwslhzF6rAKukFAflKhlVTVCMUUBi";
            strArr2[5] = "oi6ATHfePUfqMvf6S7GQLdSJgMPLAUWw";
            if (i < size) {
                A0A((C0596Lx) arrayList.get(i));
                i++;
            } else {
                return;
            }
        }
    }

    private final synchronized void A08() throws C0583Lk {
        if (this.A02 != null) {
            throw this.A02;
        }
    }

    private void A09(C0596Lx c0596Lx) {
        ArrayList<InterfaceC0585Lm> arrayList = this.A08.get(c0596Lx.A04);
        if (arrayList != null) {
            for (int i = arrayList.size() - 1; i >= 0; i--) {
                arrayList.get(i).AFK(this, c0596Lx);
            }
        }
        this.A04.AFK(this, c0596Lx);
    }

    private void A0A(C0596Lx c0596Lx) {
        M4 A0C2 = this.A06.A0C(c0596Lx.A04);
        if (A0C2 == null || !A0C2.A0D(c0596Lx)) {
            return;
        }
        this.A00 -= c0596Lx.A01;
        if (this.A05 != null) {
            String name = c0596Lx.A03.getName();
            try {
                this.A05.A07(name);
            } catch (IOException unused) {
                AnonymousClass44.A07(A04(297, 11, 30), A04(238, 39, 93) + name);
            }
        }
        this.A06.A0K(A0C2.A02);
        A09(c0596Lx);
    }

    private void A0C(C1482iq c1482iq) {
        this.A06.A0D(c1482iq.A04).A08(c1482iq);
        this.A00 += c1482iq.A01;
        A0D(c1482iq);
    }

    private void A0D(C1482iq c1482iq) {
        ArrayList<InterfaceC0585Lm> arrayList = this.A08.get(c1482iq.A04);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                InterfaceC0585Lm interfaceC0585Lm = arrayList.get(size);
                int i = A0C[0].length();
                if (i == 2) {
                    throw new RuntimeException();
                }
                A0C[0] = "Z81vyiSZneiyPRnyPjjjzGlAG4UB";
                interfaceC0585Lm.AFJ(this, c1482iq);
            }
        }
        this.A04.AFJ(this, c1482iq);
    }

    private void A0E(C1482iq c1482iq, C0596Lx c0596Lx) {
        ArrayList<InterfaceC0585Lm> arrayList = this.A08.get(c1482iq.A04);
        if (arrayList != null) {
            for (int i = arrayList.size() - 1; i >= 0; i--) {
                arrayList.get(i).AFL(this, c1482iq, c0596Lx);
            }
        }
        this.A04.AFL(this, c1482iq, c0596Lx);
    }

    public static void A0F(File file) throws C0583Lk {
        if (file.mkdirs() || file.isDirectory()) {
            return;
        }
        String str = A04(130, 34, 1) + file;
        String message = A04(297, 11, 30);
        AnonymousClass44.A05(message, str);
        throw new C0583Lk(str);
    }

    public static synchronized boolean A0H(File file) {
        boolean add;
        synchronized (C1483ir.class) {
            add = A0D.add(file.getAbsoluteFile());
        }
        return add;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0586Ln
    public final synchronized void A46(String str, M9 m9) throws C0583Lk {
        C3M.A08(!this.A03);
        A08();
        this.A06.A0L(str, m9);
        try {
            this.A06.A0I();
        } catch (IOException e) {
            throw new C0583Lk(e);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0586Ln
    public final synchronized void A4x(File file, long j) throws C0583Lk {
        C3M.A08(!this.A03);
        if (file.exists()) {
            if (j == 0) {
                file.delete();
                return;
            }
            C1482iq c1482iq = (C1482iq) C3M.A01(C1482iq.A02(file, j, this.A06));
            M4 m4 = (M4) C3M.A01(this.A06.A0C(c1482iq.A04));
            C3M.A08(m4.A0B(c1482iq.A02, c1482iq.A01));
            long A00 = M7.A00(m4.A03());
            if (A00 != -1) {
                C3M.A08(c1482iq.A02 + c1482iq.A01 <= A00);
            }
            if (this.A05 != null) {
                try {
                    this.A05.A08(file.getName(), c1482iq.A01, c1482iq.A00);
                } catch (IOException e) {
                    throw new C0583Lk(e);
                }
            }
            A0C(c1482iq);
            try {
                this.A06.A0I();
                notifyAll();
            } catch (IOException e2) {
                throw new C0583Lk(e2);
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0586Ln
    public final synchronized long A72() {
        C3M.A08(!this.A03);
        return this.A00;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0586Ln
    @MetaExoPlayerCustomization
    public final synchronized long A74(String str, long j, long j2) {
        M4 cachedContent;
        C3M.A08(!this.A03);
        if (j2 == -1) {
            j2 = Long.MAX_VALUE;
        }
        cachedContent = this.A06.A0C(str);
        return cachedContent != null ? cachedContent.A02(j, j2) : -j2;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0586Ln
    public final synchronized M8 A7K(String str) {
        C3M.A08(!this.A03);
        return this.A06.A0E(str);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0586Ln
    public final synchronized void AGw(C0596Lx c0596Lx) {
        C3M.A08(!this.A03);
        M4 m4 = (M4) C3M.A01(this.A06.A0C(c0596Lx.A04));
        m4.A07(c0596Lx.A02);
        this.A06.A0K(m4.A02);
        notifyAll();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0586Ln
    public final synchronized void AHk(String str) {
        C3M.A08(!this.A03);
        Iterator<C0596Lx> it = A0I(str).iterator();
        while (it.hasNext()) {
            A0A(it.next());
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0586Ln
    public final synchronized void AHl(C0596Lx c0596Lx) {
        C3M.A08(!this.A03);
        A0A(c0596Lx);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0586Ln
    public final synchronized File AJN(String str, long lastTouchTimestamp, long j) throws C0583Lk {
        M4 A0C2;
        File file;
        C3M.A08(!this.A03);
        A08();
        A0C2 = this.A06.A0C(str);
        C3M.A01(A0C2);
        C3M.A08(A0C2.A0B(lastTouchTimestamp, j));
        if (!this.A07.exists()) {
            A0F(this.A07);
            A06();
        }
        this.A04.AFM(this, str, lastTouchTimestamp, j);
        file = new File(this.A07, Integer.toString(this.A09.nextInt(10)));
        if (!file.exists()) {
            A0F(file);
        }
        return C1482iq.A05(file, A0C2.A01, lastTouchTimestamp, System.currentTimeMillis());
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0586Ln
    public final synchronized C0596Lx AJP(String str, long j, long j2, EnumC0584Ll enumC0584Ll) throws InterruptedException, C0583Lk {
        C0596Lx span;
        C3M.A08(!this.A03);
        A08();
        while (true) {
            span = AJQ(str, j, j2, enumC0584Ll);
            if (span == null) {
                wait();
            }
        }
        return span;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0586Ln
    public final synchronized C1482iq AJQ(String str, long j, long j2, EnumC0584Ll enumC0584Ll) throws C0583Lk {
        C3M.A08(!this.A03);
        A08();
        C1482iq A03 = A03(str, j, j2);
        if (A03.A05) {
            C1482iq span = this.A06.A0C(str).A05(A03, A03.A00, false);
            A0E(A03, span);
            return span;
        }
        if (this.A06.A0D(str).A0C(j, A03.A01)) {
            return A03;
        }
        return null;
    }
}
