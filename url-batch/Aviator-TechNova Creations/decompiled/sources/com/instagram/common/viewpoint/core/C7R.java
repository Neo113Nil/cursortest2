package com.instagram.common.viewpoint.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;
import kotlin.io.encoding.Base64;
import okio.Utf8;

@MetaExoPlayerCustomization("Exo version is final but in Meta code HeroLeastRecentlyUsedCacheEvictor extends this")
/* renamed from: com.facebook.ads.redexgen.X.7R, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C7R implements InterfaceC1488iw {
    public static byte[] A03;
    public static String[] A04 = {"jtWHdC1JS00IQCACyTEvOJEMPrvoo3Ob", "eCCt1HwS4IToKXyi1WzLFL1R4PlgsDM4", "yXgy4dLxj37Ni2Ba12KifyhgeRBIXCXp", "5p7nRT0g4n3u8StY", "28aCkGMBHBRgMUJ0i4knnGO", "XAmyqmpuCXa4X38XkweYk7F1knbiAlXr", "krkFdswQPRExlipS29WIEjh8hbH7SBjj", "jb"};

    @MetaExoPlayerCustomization("Exo version is private but in Meta code HeroLeastRecentlyUsedCacheEvictor extends this")
    public long A00;

    @MetaExoPlayerCustomization("Exo version is private but in Meta code HeroLeastRecentlyUsedCacheEvictor extends this")
    public final long A01;

    @MetaExoPlayerCustomization("Exo version is private but in Meta code HeroLeastRecentlyUsedCacheEvictor extends this")
    public final TreeSet<C0596Lx> A02 = new TreeSet<>(new Comparator() { // from class: com.facebook.ads.redexgen.X.MB
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return C7R.A00((C0596Lx) obj, (C0596Lx) obj2);
        }
    });

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 28);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{46, Base64.padSymbol, 34, 40, Utf8.REPLACEMENT_BYTE, 8, 42, 40, 35, 46};
    }

    static {
        A02();
    }

    public C7R(long j) {
        this.A01 = j;
    }

    @MetaExoPlayerCustomization("Exo version is private but in Meta code HeroLeastRecentlyUsedCacheEvictor extends this")
    public static int A00(C0596Lx c0596Lx, C0596Lx c0596Lx2) {
        if (c0596Lx.A00 - c0596Lx2.A00 == 0) {
            return c0596Lx.compareTo(c0596Lx2);
        }
        return c0596Lx.A00 < c0596Lx2.A00 ? -1 : 1;
    }

    private void A03(InterfaceC0586Ln interfaceC0586Ln, long j) {
        C4S.A02(A01(0, 10, 87));
        while (this.A00 + j > this.A01 && !this.A02.isEmpty()) {
            C0596Lx first = this.A02.first();
            if (A04[1].charAt(10) != 'T') {
                throw new RuntimeException();
            }
            A04[4] = "DjrmhsDHxGC2SVigK1e7Rl2";
            interfaceC0586Ln.AHl(first);
        }
        C4S.A00();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0585Lm
    public final void AFJ(InterfaceC0586Ln interfaceC0586Ln, C0596Lx c0596Lx) {
        this.A02.add(c0596Lx);
        this.A00 += c0596Lx.A01;
        A03(interfaceC0586Ln, 0L);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0585Lm
    public final void AFK(InterfaceC0586Ln interfaceC0586Ln, C0596Lx c0596Lx) {
        this.A02.remove(c0596Lx);
        this.A00 -= c0596Lx.A01;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0585Lm
    public final void AFL(InterfaceC0586Ln interfaceC0586Ln, C0596Lx c0596Lx, C0596Lx c0596Lx2) {
        AFK(interfaceC0586Ln, c0596Lx);
        AFJ(interfaceC0586Ln, c0596Lx2);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1488iw
    public final void AFM(InterfaceC0586Ln interfaceC0586Ln, String str, long j, long j2) {
        if (j2 != -1) {
            A03(interfaceC0586Ln, j2);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1488iw
    public final boolean AHz() {
        return true;
    }
}
