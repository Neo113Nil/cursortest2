package com.instagram.common.viewpoint.core;

import android.net.Uri;
import android.util.Log;
import com.facebook.ads.AdError;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.google.common.base.Ascii;
import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.io.encoding.Base64;
import okio.Utf8;

/* renamed from: com.facebook.ads.redexgen.X.7S, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C7S implements InterfaceC1771nl {
    public static byte[] A0M;
    public static String[] A0N = {"gtbAICrdQ5OiLd8QtlGJkysA4GOuQAyl", "NB4BeTTq5ijHDPStUBIG2cd4hjVw3Rms", "uuMr3aWTfRr6VJnGuPPVK2CIrmsp3XMP", "Eb6am5ksZvZ5Hz0HFQHbX0NWivmHdCO7", "qnDH", "QayiUw4ouBPhcoxDO7fR8OixzHh3DuJf", "V84YazX1IDZHbq2m95FMlzDl0u9g04ST", "S22pIk311xlkEmMZRooVtOw4dNPxaWRF"};
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public Uri A05;
    public InterfaceC1771nl A06;
    public AnonymousClass56 A07;
    public AnonymousClass56 A08;

    @MetaExoPlayerCustomization
    public C0582Lj A09;
    public C0596Lx A0A;
    public boolean A0B;
    public boolean A0C;
    public final InterfaceC1771nl A0D;
    public final InterfaceC1771nl A0E;
    public final InterfaceC1771nl A0F;
    public final InterfaceC0586Ln A0G;
    public final InterfaceC0589Lq A0H;
    public final InterfaceC0595Lw A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0M, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            byte b = copyOfRange[i4];
            if (A0N[4].length() == 12) {
                throw new RuntimeException();
            }
            A0N[4] = "VXYuEglycDYgl";
            copyOfRange[i4] = (byte) ((b ^ i3) ^ 28);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A0M = new byte[]{Ascii.EM, 59, 57, 50, Utf8.REPLACEMENT_BYTE, Ascii.RS, 59, 46, 59, 9, 53, 47, 40, 57, Utf8.REPLACEMENT_BYTE, Ascii.SYN, 58, 32, 57, 49, 59, 114, 33, 117, 32, 37, 49, 52, 33, 48, 117, 39, 48, 49, 60, 39, 48, 54, 33, 48, 49, 117, 0, 7, Ascii.FS, 123, 117, 1, Base64.padSymbol, 60, 38, 117, 56, 60, 50, Base64.padSymbol, 33, 117, 54, 52, 32, 38, 48, 117, 39, 48, 57, 52, 33, 60, 35, 48, 117, 0, 7, Ascii.FS, 38, 117, 50, 48, 33, 117, 39, 48, 38, 58, 57, 35, 48, 49, 117, 60, 59, 54, 58, 39, 39, 48, 54, 33, 57, 44, 123, 95, 94, 115, 81, 83, 88, 85, 84, 114, 73, 68, 85, 67, 98, 85, 81, 84};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 13
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @Override // com.instagram.common.viewpoint.core.InterfaceC1771nl
    @MetaExoPlayerCustomization("usage of fbDataSpecExtension and the check for isInitSegment")
    public final long AFy(AnonymousClass56 anonymousClass56) throws IOException {
        try {
            String A4d = this.A0I.A4d(anonymousClass56);
            AnonymousClass56 A09 = anonymousClass56.A04().A08(A4d).A09();
            this.A08 = A09;
            this.A05 = A01(this.A0G, A4d, A09.A06);
            this.A03 = anonymousClass56.A04;
            this.A09 = new C0582Lj(anonymousClass56.A07);
            this.A0B = A00(anonymousClass56) != -1;
            boolean z = this.A0B;
            if (this.A0B) {
                this.A00 = -1L;
            } else {
                this.A00 = M7.A00(this.A0G.A7K(A4d));
                if (this.A00 != -1) {
                    this.A00 -= anonymousClass56.A04;
                    if (this.A00 < 0) {
                        throw new C01734z(AdError.REMOTE_ADS_SERVICE_ERROR);
                    }
                }
            }
            boolean z2 = anonymousClass56.A07.A08 <= 0 && anonymousClass56.A07.A07 <= 0;
            if (anonymousClass56.A03 != -1) {
                this.A00 = this.A00 == -1 ? anonymousClass56.A03 : Math.min(this.A00, anonymousClass56.A03);
            }
            if (this.A00 > 0 || this.A00 == -1) {
                A06(A09, false, z2);
            }
            return anonymousClass56.A03 != -1 ? anonymousClass56.A03 : this.A00;
        } catch (Throwable th) {
            A09(th);
            throw th;
        }
    }

    static {
        A05();
    }

    public C7S(InterfaceC0586Ln interfaceC0586Ln, final InterfaceC1771nl interfaceC1771nl, InterfaceC1771nl interfaceC1771nl2, final InterfaceC01684u interfaceC01684u, InterfaceC0595Lw interfaceC0595Lw, int i, final AnonymousClass31 anonymousClass31, final int i2, InterfaceC0589Lq interfaceC0589Lq) {
        this.A0G = interfaceC0586Ln;
        this.A0D = interfaceC1771nl2;
        this.A0I = interfaceC0595Lw == null ? InterfaceC0595Lw.A00 : interfaceC0595Lw;
        this.A0J = (i & 1) != 0;
        this.A0L = (i & 2) != 0;
        this.A0K = (i & 4) != 0;
        if (interfaceC1771nl != null) {
            interfaceC1771nl = anonymousClass31 != null ? new InterfaceC1771nl(interfaceC1771nl, anonymousClass31, i2) { // from class: com.facebook.ads.redexgen.X.9c
                public static byte[] A03;
                public final int A00;
                public final AnonymousClass31 A01;
                public final InterfaceC1771nl A02;

                static {
                    A01();
                }

                public static String A00(int i3, int i4, int i5) {
                    byte[] copyOfRange = Arrays.copyOfRange(A03, i3, i3 + i4);
                    for (int i6 = 0; i6 < copyOfRange.length; i6++) {
                        copyOfRange[i6] = (byte) ((copyOfRange[i6] - i5) - 41);
                    }
                    return new String(copyOfRange);
                }

                public static void A01() {
                    A03 = new byte[]{1, 3, 0, -12, -10, -10, -11, -32, 3, -27, -7, 3, 0, 8};
                }

                {
                    this.A02 = (InterfaceC1771nl) C3M.A01(interfaceC1771nl);
                    C3M.A01(anonymousClass31);
                    this.A01 = null;
                    this.A00 = i2;
                }

                @Override // com.instagram.common.viewpoint.core.InterfaceC1771nl
                public final void A3v(C5H c5h) {
                    C3M.A01(c5h);
                    this.A02.A3v(c5h);
                }

                @Override // com.instagram.common.viewpoint.core.InterfaceC1771nl
                public final Map<String, List<String>> A8l() {
                    return this.A02.A8l();
                }

                @Override // com.instagram.common.viewpoint.core.InterfaceC1771nl
                public final Uri A9H() {
                    return this.A02.A9H();
                }

                @Override // com.instagram.common.viewpoint.core.InterfaceC1771nl
                public final long AFy(AnonymousClass56 anonymousClass56) throws IOException {
                    throw new NullPointerException(A00(0, 14, 104));
                }

                @Override // com.instagram.common.viewpoint.core.InterfaceC1771nl
                public final void close() throws IOException {
                    this.A02.close();
                }

                @Override // com.instagram.common.viewpoint.core.AnonymousClass20
                public final int read(byte[] bArr, int i3, int i4) throws IOException {
                    throw new NullPointerException(A00(0, 14, 104));
                }
            } : interfaceC1771nl;
            this.A0F = interfaceC1771nl;
            this.A0E = interfaceC01684u != null ? new InterfaceC1771nl(interfaceC1771nl, interfaceC01684u) { // from class: com.facebook.ads.redexgen.X.9a
                public static String[] A04 = {"wbGAhFLyG1O1BXRQkdAsuvRwjcG0JvdY", "WIGHUXkmdMwjKtYrGQHAEajnCcLVhsJc", "71g9TI5vzncmEyYDsqHRZQ5IIDSVhuCU", "Of7gEliA8dohBLU5UePsnNPr9luYUKIX", "Ip7oB5coOYYSe2wQ3nHh7WYhGK", "mFyxGR7YA7Uh54mquru9LT9AFg", "iYrL5ZFnNwboLBDSkDK7D5rnh7HwI2GN", "DEMvAgZEfGNSxO1Scy7Mz579azioI4xU"};
                public long A00;
                public boolean A01;
                public final InterfaceC01684u A02;
                public final InterfaceC1771nl A03;

                {
                    this.A03 = (InterfaceC1771nl) C3M.A01(interfaceC1771nl);
                    this.A02 = (InterfaceC01684u) C3M.A01(interfaceC01684u);
                }

                @Override // com.instagram.common.viewpoint.core.InterfaceC1771nl
                public final void A3v(C5H c5h) {
                    C3M.A01(c5h);
                    this.A03.A3v(c5h);
                }

                @Override // com.instagram.common.viewpoint.core.InterfaceC1771nl
                public final Map<String, List<String>> A8l() {
                    return this.A03.A8l();
                }

                @Override // com.instagram.common.viewpoint.core.InterfaceC1771nl
                public final Uri A9H() {
                    return this.A03.A9H();
                }

                @Override // com.instagram.common.viewpoint.core.InterfaceC1771nl
                public final long AFy(AnonymousClass56 anonymousClass56) throws IOException {
                    this.A00 = this.A03.AFy(anonymousClass56);
                    if (this.A00 == 0) {
                        return 0L;
                    }
                    long j = anonymousClass56.A03;
                    String[] strArr = A04;
                    if (strArr[4].length() != strArr[5].length()) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A04;
                    strArr2[2] = "8JYiy7Q3QOgUU9IJtNo1oEeVZYLkhQA2";
                    strArr2[1] = "C3hXJiAszWGMEEgz1C8EzdfpsF4hhGij";
                    if (j == -1 && this.A00 != -1) {
                        anonymousClass56 = anonymousClass56.A05(0L, this.A00);
                    }
                    this.A01 = true;
                    this.A02.AG0(anonymousClass56);
                    return this.A00;
                }

                @Override // com.instagram.common.viewpoint.core.InterfaceC1771nl
                public final void close() throws IOException {
                    try {
                        this.A03.close();
                    } finally {
                        if (this.A01) {
                            this.A01 = false;
                            this.A02.close();
                        }
                    }
                }

                @Override // com.instagram.common.viewpoint.core.AnonymousClass20
                public final int read(byte[] bArr, int i3, int i4) throws IOException {
                    if (this.A00 != 0) {
                        int read = this.A03.read(bArr, i3, i4);
                        if (read > 0) {
                            this.A02.write(bArr, i3, read);
                            if (this.A00 != -1) {
                                this.A00 -= read;
                            }
                        }
                        return read;
                    }
                    String[] strArr = A04;
                    if (strArr[4].length() != strArr[5].length()) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A04;
                    strArr2[0] = "tTmOA5hODgmGBNxF0mS11dvWTNwifcB6";
                    strArr2[3] = "mpSZqupnUd3dBB1VIyplsxMvqiIWybTS";
                    return -1;
                }
            } : null;
        } else {
            this.A0F = C02689d.A02;
            this.A0E = null;
        }
        this.A0H = interfaceC0589Lq;
    }

    private int A00(AnonymousClass56 anonymousClass56) {
        if (this.A0L && this.A0C) {
            return 0;
        }
        if (this.A0K && anonymousClass56.A03 == -1) {
            return 1;
        }
        return -1;
    }

    public static Uri A01(InterfaceC0586Ln interfaceC0586Ln, String str, Uri redirectedUri) {
        Uri redirectedUri2 = M7.A01(interfaceC0586Ln.A7K(str));
        return redirectedUri2 != null ? redirectedUri2 : redirectedUri;
    }

    private void A03() throws IOException {
        if (this.A06 == null) {
            return;
        }
        try {
            this.A06.close();
            this.A07 = null;
            this.A06 = null;
            if (A0N[5].charAt(3) == 'i') {
                String[] strArr = A0N;
                strArr[2] = "vHGwoIowQcJHPzt2zHibHrQYTuNv4ZzT";
                strArr[1] = "k7MJrtNgTHKuOTKhmFADSg5K1rHaIFar";
                if (this.A0A != null) {
                    InterfaceC0586Ln interfaceC0586Ln = this.A0G;
                    if (A0N[6].charAt(29) == '4') {
                        String[] strArr2 = A0N;
                        strArr2[2] = "npCyc8crYVBLSlKGvChDlZdzdxvHOR7S";
                        strArr2[1] = "yWpl1AKn1flVHx0rOJ2JJIdMQnxjFkRn";
                        interfaceC0586Ln.AGw(this.A0A);
                        this.A0A = null;
                        return;
                    }
                } else {
                    return;
                }
            }
            throw new RuntimeException();
        } catch (Throwable th) {
            this.A07 = null;
            this.A06 = null;
            if (this.A0A != null) {
                this.A0G.AGw(this.A0A);
                this.A0A = null;
            }
            throw th;
        }
    }

    private void A04() {
        if (0 != 0 && this.A04 > 0) {
            this.A0G.A72();
            throw new NullPointerException(A02(103, 17, 44));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c9, code lost:
    
        if (r2 != (-1)) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00cb, code lost:
    
        r21.A00 = r2;
        r2 = r21.A03 + r21.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00de, code lost:
    
        if (com.instagram.common.viewpoint.core.C7S.A0N[5].charAt(3) == 'i') goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e5, code lost:
    
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e9, code lost:
    
        com.instagram.common.viewpoint.core.C7S.A0N[3] = "iUSWGyHOgLgD9ZjfpDxtLA9tGfi2lrY2";
        com.instagram.common.viewpoint.core.M9.A00(r5, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e6, code lost:
    
        if (r2 != (-1)) goto L39;
     */
    @MetaExoPlayerCustomization("Parameter isInitSegment and all ot is usages. Setting mFbDataSpecExtension in nextDataSpec. Call to maybeUpdateRedirectedUriMetadata at the end")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A06(AnonymousClass56 anonymousClass56, boolean z, boolean z2) throws IOException {
        C0596Lx AJP;
        long j;
        AnonymousClass56 A09;
        InterfaceC1771nl interfaceC1771nl;
        long j2;
        Uri uri;
        String str = (String) AbstractC01484a.A0f(anonymousClass56.A08);
        EnumC0584Ll enumC0584Ll = z2 ? EnumC0584Ll.A03 : EnumC0584Ll.A06;
        if (this.A0B) {
            AJP = null;
        } else if (this.A0J) {
            try {
                AJP = this.A0G.AJP(str, this.A03, this.A00, enumC0584Ll);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            str = str;
            AJP = this.A0G.AJQ(str, this.A03, this.A00, enumC0584Ll);
        }
        if (AJP == null) {
            interfaceC1771nl = this.A0F;
            A09 = anonymousClass56.A04().A04(this.A03).A03(this.A00).A07(this.A09).A09();
        } else {
            boolean z3 = AJP.A05;
            String[] strArr = A0N;
            if (strArr[0].charAt(4) == strArr[7].charAt(4)) {
                A0N[5] = "u32inRltH66jjh9yXIb3cYFcwSkjtAHW";
                if (z3) {
                    Uri fromFile = Uri.fromFile((File) AbstractC01484a.A0f(AJP.A03));
                    long j3 = AJP.A02;
                    long j4 = this.A03 - j3;
                    long j5 = AJP.A01 - j4;
                    if (this.A00 != -1) {
                        j5 = Math.min(j5, this.A00);
                    }
                    A09 = anonymousClass56.A04().A06(fromFile).A05(j3).A04(j4).A03(j5).A07(this.A09).A09();
                    interfaceC1771nl = this.A0D;
                } else {
                    if (AJP.A04()) {
                        j = this.A00;
                    } else {
                        j = AJP.A01;
                        if (this.A00 != -1) {
                            j = Math.min(j, this.A00);
                        }
                    }
                    A09 = anonymousClass56.A04().A04(this.A03).A03(j).A07(this.A09).A09();
                    if (this.A0E != null) {
                        interfaceC1771nl = this.A0E;
                    } else {
                        interfaceC1771nl = this.A0F;
                        this.A0G.AGw(AJP);
                        AJP = null;
                    }
                }
            }
            throw new RuntimeException();
        }
        boolean z4 = this.A0B;
        if (A0N[5].charAt(3) == 'i') {
            String[] strArr2 = A0N;
            strArr2[0] = "KvC0Ia1A4x1eGi9X8aRBDgkMlzCJszIJ";
            strArr2[7] = "nNrFIIpUFsn1fqvNydhqNDEn907tEQAg";
            if (!z4 && interfaceC1771nl == this.A0F) {
                j2 = this.A03 + 102400;
            } else {
                j2 = Long.MAX_VALUE;
            }
            this.A01 = j2;
            if (z) {
                C3M.A08(A0A());
                InterfaceC1771nl interfaceC1771nl2 = this.A0F;
                if (A0N[3].charAt(26) == 'u') {
                    Throwable e = new RuntimeException();
                    throw e;
                }
                A0N[5] = "8XoiTPgLcR8ApVu7jrAIE2ygde6TsOz1";
                if (interfaceC1771nl == interfaceC1771nl2) {
                    return;
                }
                try {
                    A03();
                } catch (Throwable th) {
                    if (((C0596Lx) AbstractC01484a.A0f(AJP)).A03()) {
                        this.A0G.AGw(AJP);
                    }
                    throw th;
                }
            }
            if (AJP != null && AJP.A03()) {
                this.A0A = AJP;
            }
            this.A06 = interfaceC1771nl;
            this.A07 = A09;
            this.A02 = 0L;
            long AFy = interfaceC1771nl.AFy(A09);
            M9 m9 = new M9();
            if (A09.A03 == -1) {
                if (A0N[4].length() != 12) {
                    A0N[3] = "AihO48tXyqmUqd3oId9EAGnNfKcJ6kuS";
                }
            }
            if (A0C()) {
                this.A05 = interfaceC1771nl.A9H();
                boolean isRedirected = !anonymousClass56.A06.equals(this.A05);
                if (A0N[4].length() != 12) {
                    A0N[4] = "aty3owKlrPhsH";
                    if (isRedirected) {
                        uri = this.A05;
                    } else {
                        uri = null;
                    }
                    M9.A01(m9, uri);
                }
            }
            if (A0D()) {
                this.A0G.A46(str, m9);
            }
            A08(str, this.A05);
            return;
        }
        throw new RuntimeException();
    }

    private void A07(String str) throws IOException {
        this.A00 = 0L;
        if (A0D()) {
            M9 m9 = new M9();
            M9.A00(m9, this.A03);
            this.A0G.A46(str, m9);
        }
    }

    @MetaExoPlayerCustomization
    private void A08(String str, Uri uri) {
        if (!A0D()) {
            return;
        }
        M9 m9 = new M9();
        if (!uri.equals(this.A05)) {
            Uri uri2 = this.A05;
            if (A0N[6].charAt(29) != '4') {
                throw new RuntimeException();
            }
            String[] strArr = A0N;
            strArr[0] = "HwBuIJEC6JIKumxqgSDJ0pUKIwQFYzQv";
            strArr[7] = "1FgFIXgVQckXZ73NbznNhujKeCbi6Slt";
            M9.A01(m9, uri2);
        } else {
            M9.A01(m9, null);
        }
        try {
            this.A0G.A46(str, m9);
        } catch (C0583Lk e) {
            String message = A02(15, 88, 73);
            Log.w(A02(0, 15, 70), message, e);
        }
    }

    private void A09(Throwable th) {
        if (A0B() || (th instanceof C0583Lk)) {
            this.A0C = true;
        }
    }

    private boolean A0A() {
        return this.A06 == this.A0F;
    }

    private boolean A0B() {
        return this.A06 == this.A0D;
    }

    private boolean A0C() {
        return !A0B();
    }

    private boolean A0D() {
        return this.A06 == this.A0E;
    }

    public final InterfaceC0586Ln A0E() {
        return this.A0G;
    }

    public final InterfaceC0595Lw A0F() {
        return this.A0I;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1771nl
    public final void A3v(C5H c5h) {
        C3M.A01(c5h);
        this.A0D.A3v(c5h);
        this.A0F.A3v(c5h);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1771nl
    public final Map<String, List<String>> A8l() {
        if (A0C()) {
            return this.A0F.A8l();
        }
        return Collections.emptyMap();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1771nl
    public final Uri A9H() {
        return this.A05;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1771nl
    public final void close() throws IOException {
        this.A08 = null;
        this.A05 = null;
        this.A03 = 0L;
        A04();
        try {
            A03();
        } catch (Throwable e) {
            A09(e);
            throw e;
        }
    }

    @Override // com.instagram.common.viewpoint.core.AnonymousClass20
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        if (this.A00 == 0) {
            return -1;
        }
        AnonymousClass56 currentDataSpec = (AnonymousClass56) C3M.A01(this.A08);
        AnonymousClass56 anonymousClass56 = (AnonymousClass56) C3M.A01(this.A07);
        try {
            if (this.A03 >= this.A01) {
                A06(currentDataSpec, true, false);
            }
            try {
                int bytesRead = ((InterfaceC1771nl) C3M.A01(this.A06)).read(bArr, i, i2);
                if (bytesRead != -1) {
                    if (A0B()) {
                        this.A04 += bytesRead;
                    }
                    this.A03 += bytesRead;
                    this.A02 += bytesRead;
                    if (this.A00 != -1) {
                        this.A00 -= bytesRead;
                    }
                } else if (A0C() && (anonymousClass56.A03 == -1 || this.A02 < anonymousClass56.A03)) {
                    A07((String) AbstractC01484a.A0f(currentDataSpec.A08));
                } else if (this.A00 > 0 || this.A00 == -1) {
                    A03();
                    A06(currentDataSpec, false, false);
                    return read(bArr, i, i2);
                }
                return bytesRead;
            } catch (Throwable th) {
                e = th;
                A09(e);
                throw e;
            }
        } catch (Throwable th2) {
            e = th2;
        }
    }
}
