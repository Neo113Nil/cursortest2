package com.instagram.common.viewpoint.core;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.jy, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1550jy implements GX {
    public static String[] A03 = {"MPtFkEiIPrQJk6C68eapJqoHhp6zbLCW", "P1eCuU1JvuL46IL3Xh4EOSVLMCcJCOjT", "W4WpROs4sm5j6Tf0ztR0Y16lEj4WGQ", "4wLB1kD6U2fJ8LvWKaQYimBngFnzynrL", "j1g6H1G7HHWswscQmxGermXRDRDROF5f", "vYNShvJ8K3s57yIlGqGLfJHMZKUSU02I", "LyEFdcIU17ooQUQ0BZMXWJLXZvdofmIX", "P7XGal"};
    public static final InterfaceC0445Gb A04 = new InterfaceC0445Gb() { // from class: com.facebook.ads.redexgen.X.jz
        @Override // com.instagram.common.viewpoint.core.InterfaceC0445Gb
        public final GX[] A5F() {
            return C1550jy.A00();
        }

        @Override // com.instagram.common.viewpoint.core.InterfaceC0445Gb
        public final /* synthetic */ GX[] A5G(Uri uri, Map map) {
            return AbstractC0444Ga.A01(this, uri, map);
        }
    };
    public boolean A00;
    public final C1549jx A02 = new C1549jx();
    public final C4J A01 = new C4J(16384);

    public static /* synthetic */ GX[] A00() {
        return new GX[]{new C1550jy()};
    }

    @Override // com.instagram.common.viewpoint.core.GX
    public final void AA4(GY gy) {
        this.A02.A5U(gy, new C0551Ke(0, 1));
        gy.A6G();
        gy.AIN(new C1620lI(-9223372036854775807L));
    }

    @Override // com.instagram.common.viewpoint.core.GX
    public final int AGb(InterfaceC1625lN interfaceC1625lN, C0463Gt c0463Gt) throws IOException {
        int read = interfaceC1625lN.read(this.A01.A0l(), 0, 16384);
        if (read == -1) {
            return -1;
        }
        this.A01.A0f(0);
        this.A01.A0e(read);
        if (!this.A00) {
            this.A02.AG6(0L, 4);
            this.A00 = true;
        }
        this.A02.A52(this.A01);
        return 0;
    }

    @Override // com.instagram.common.viewpoint.core.GX
    public final void AGr() {
    }

    @Override // com.instagram.common.viewpoint.core.GX
    public final void AIM(long j, long j2) {
        this.A00 = false;
        this.A02.AIL();
    }

    @Override // com.instagram.common.viewpoint.core.GX
    public final boolean AJL(InterfaceC1625lN interfaceC1625lN) throws IOException {
        C4J c4j = new C4J(10);
        int length = 0;
        while (true) {
            byte[] A0l = c4j.A0l();
            if (A03[3].charAt(10) != 'f') {
                throw new RuntimeException();
            }
            A03[3] = "dKI30oOFAvfBQiacazr45UFgS6k9aj5a";
            interfaceC1625lN.AG9(A0l, 0, 10);
            c4j.A0f(0);
            if (c4j.A0K() != 4801587) {
                interfaceC1625lN.AI1();
                interfaceC1625lN.A3z(length);
                int i = length;
                int syncBytes = 0;
                while (true) {
                    interfaceC1625lN.AG9(c4j.A0l(), 0, 7);
                    c4j.A0f(0);
                    int headerPosition = c4j.A0M();
                    if (headerPosition != 44096 && headerPosition != 44097) {
                        syncBytes = 0;
                        interfaceC1625lN.AI1();
                        i++;
                        if (i - length >= 8192) {
                            return false;
                        }
                        interfaceC1625lN.A3z(i);
                    } else {
                        syncBytes++;
                        if (syncBytes >= 4) {
                            return true;
                        }
                        int headerPosition2 = GI.A02(c4j.A0l(), headerPosition);
                        if (headerPosition2 == -1) {
                            return false;
                        }
                        interfaceC1625lN.A3z(headerPosition2 - 7);
                    }
                }
            } else {
                c4j.A0g(3);
                int A0H = c4j.A0H();
                length += A0H + 10;
                interfaceC1625lN.A3z(A0H);
            }
        }
    }
}
