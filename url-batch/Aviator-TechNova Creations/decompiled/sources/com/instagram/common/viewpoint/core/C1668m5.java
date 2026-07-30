package com.instagram.common.viewpoint.core;

import com.facebook.ads.androidx.media3.common.Timeline;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;

/* renamed from: com.facebook.ads.redexgen.X.m5, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1668m5 implements EA {
    public static String[] A0B = {"ziZaTeBfSFNnIBcgtlZExnB4uOVj2q5B", "5IZt5NWgPCitKNTqtiA", "aLHVXVzU6ljMUMq9dZgrDfQ8JzHl8MF", "mvLcqO7QF6VGSUKAdCZC8bhhp8aLucng", "FQUZNhR4lN6thgMMBkcdaTgoY6ZzypcM", "72R8UBsha86AOqtb805OpiOBiH7oe8El", "AjNBccUrYW9zDFgtuo7TyJwkSvkBJU7y", "GkSBWsvGG5dBFRJxqtw9GV4lDtiTWOM"};
    public final float A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final long A07;
    public final C3T A08;

    @MetaExoPlayerCustomization("This is no longer set in the constructor")
    public final EU A09;
    public final int A0A;

    public C1668m5() {
        this(10000, 25000, 25000, 0.75f);
    }

    public C1668m5(int i, int i2, int i3, float f) {
        this(null, -1, i, i2, i3, 1279, 719, f, 0.75f, 2000L, C3T.A00);
    }

    public C1668m5(EU eu) {
        this(eu, -1, 10000, 25000, 25000, 1279, 719, 0.75f, 0.75f, 2000L, C3T.A00);
    }

    public C1668m5(@MetaExoPlayerCustomization("No longer set through factory") EU eu, @MetaExoPlayerCustomization("Non standard variable; used in oculus") int i, @MetaExoPlayerCustomization("Removed from upstream") int i2, int i3, int i4, int i5, int i6, float f, float f2, long j, C3T c3t) {
        this.A09 = eu;
        this.A0A = i;
        this.A05 = i2;
        this.A02 = i3;
        this.A06 = i4;
        this.A04 = i5;
        this.A03 = i6;
        this.A00 = f;
        this.A01 = f2;
        this.A07 = j;
        this.A08 = c3t;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Am != com.google.common.collect.ImmutableList<com.facebook.ads.androidx.media3.exoplayer.trackselection.AdaptiveTrackSelection$AdaptationCheckpoint> */
    private final C00700y A00(C1802oH c1802oH, int[] iArr, int i, EU eu, AbstractC0303Am<C0384Ds> abstractC0303Am) {
        return new C00700y(c1802oH, iArr, i, eu, this.A0A, this.A05, this.A02, this.A06, this.A04, this.A03, this.A00, this.A01, this.A07, abstractC0303Am, this.A08);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Am != com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableList<com.facebook.ads.androidx.media3.exoplayer.trackselection.AdaptiveTrackSelection$AdaptationCheckpoint>> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.instagram.common.viewpoint.core.EA
    public final InterfaceC1646lj[] A5T(E9[] e9Arr, EU eu, C1683mL c1683mL, Timeline timeline) {
        AbstractC0303Am A00;
        InterfaceC1646lj A002;
        A00 = C00700y.A00(e9Arr);
        InterfaceC1646lj[] interfaceC1646ljArr = new InterfaceC1646lj[e9Arr.length];
        for (int i = 0; i < e9Arr.length; i++) {
            E9 e9 = e9Arr[i];
            if (e9 != null && e9.A02.length != 0) {
                int length = e9.A02.length;
                if (A0B[3].length() != 32) {
                    throw new RuntimeException();
                }
                A0B[1] = "4JDRhnBkti3";
                if (length == 1) {
                    A002 = new C00690x(e9.A01, e9.A02[0], e9.A00);
                } else {
                    A002 = A00(e9.A01, e9.A02, e9.A00, eu, (AbstractC0303Am) A00.get(i));
                }
                interfaceC1646ljArr[i] = A002;
            }
        }
        return interfaceC1646ljArr;
    }
}
