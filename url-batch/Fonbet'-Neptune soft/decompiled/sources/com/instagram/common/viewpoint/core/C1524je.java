package com.instagram.common.viewpoint.core;

import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseArray;
import androidx.core.view.InputDeviceCompat;
import java.io.IOException;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.jacoco.core.runtime.AgentOptions;

/* renamed from: com.facebook.ads.redexgen.X.je, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1524je implements GX {
    public static String[] A0B = {"UBvRkgXOGDkhiRviOullp8V", "VkNaXMTzU8N2w", "EmncOItxREzVuvRcJiesLUTUZ", "GKNHQwhZeE13dvoU8lLSXwuEJRZ0Rb8T", "UfDFEQBLtd8kFCM7fNQpR1e2paOBi7mP", "RVi2VPuM0SECIbGMRSZvlBLvqxfM7S", "lPCpjqdMUX8JsRnbL9v7kcIYKByBL6xe", "JprIbG5eTccKgwX6h6kDKt0luN"};
    public static final InterfaceC0439Gb A0C = new InterfaceC0439Gb() { // from class: com.facebook.ads.redexgen.X.jf
        @Override // com.instagram.common.viewpoint.core.InterfaceC0439Gb
        public final GX[] A5F() {
            return C1524je.A01();
        }

        @Override // com.instagram.common.viewpoint.core.InterfaceC0439Gb
        public final /* synthetic */ GX[] A5G(Uri uri, Map map) {
            return AbstractC0438Ga.A01(this, uri, map);
        }
    };
    public long A00;
    public GY A01;
    public C1526jg A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final SparseArray<KV> A07;
    public final C4J A08;
    public final C4R A09;
    public final KU A0A;

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0191, code lost:
    
        if (r10 == 192) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0193, code lost:
    
        r3 = new com.instagram.common.viewpoint.core.C1530jk();
        r11.A04 = true;
        r11.A00 = r12.A8f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01b5, code lost:
    
        if ((r5 & 240) != 224) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01b7, code lost:
    
        r3 = new com.instagram.common.viewpoint.core.C1536jq();
        r11.A05 = true;
        r11.A00 = r12.A8f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01ae, code lost:
    
        if (r10 == 192) goto L73;
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.instagram.common.viewpoint.core.GX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int AGb(InterfaceC1619lN interfaceC1619lN, C0457Gt c0457Gt) throws IOException {
        C3M.A02(this.A01);
        long A8G = interfaceC1619lN.A8G();
        if ((A8G != -1) && !this.A0A.A0E()) {
            return this.A0A.A0B(interfaceC1619lN, c0457Gt);
        }
        A00(A8G);
        if (this.A02 != null && this.A02.A09()) {
            return this.A02.A06(interfaceC1619lN, c0457Gt);
        }
        interfaceC1619lN.AI1();
        long A8a = A8G != -1 ? A8G - interfaceC1619lN.A8a() : -1L;
        if ((A8a != -1 && A8a < 4) || !interfaceC1619lN.AGA(this.A08.A0l(), 0, 4, true)) {
            return -1;
        }
        this.A08.A0f(0);
        int A0C2 = this.A08.A0C();
        if (A0C2 == 441) {
            return -1;
        }
        if (A0B[2].length() == 2) {
            throw new RuntimeException();
        }
        String[] strArr = A0B;
        strArr[5] = "kMhOTVhRWN36SIdb7fVpbVP8KQK8iP";
        strArr[1] = "K6CIMfQf5fCJv";
        if (A0C2 == 442) {
            interfaceC1619lN.AG9(this.A08.A0l(), 0, 10);
            this.A08.A0f(9);
            interfaceC1619lN.AJJ((this.A08.A0I() & 7) + 14);
            return 0;
        }
        if (A0C2 == 443) {
            interfaceC1619lN.AG9(this.A08.A0l(), 0, 2);
            this.A08.A0f(0);
            interfaceC1619lN.AJJ(this.A08.A0M() + 6);
            return 0;
        }
        if (((A0C2 & InputDeviceCompat.SOURCE_ANY) >> 8) != 1) {
            interfaceC1619lN.AJJ(1);
            return 0;
        }
        int i = A0C2 & 255;
        KV kv = this.A07.get(i);
        if (!this.A03) {
            if (kv == null) {
                KJ kj = null;
                if (i == 189) {
                    kj = new C1546k0();
                    this.A04 = true;
                    this.A00 = interfaceC1619lN.A8f();
                } else {
                    int i2 = i & 224;
                    if (A0B[7].length() != 26) {
                        A0B[7] = "MD0211Yr4bYXM5L9ZkPBjN7rOQ";
                    } else {
                        String[] strArr2 = A0B;
                        strArr2[6] = "PIHtVurnoe8IajroMJlyufhIBiisymoK";
                        strArr2[4] = "tbo4qyhyaN86Rqnk6vLIVirgmw8EdsC9";
                    }
                }
                if (kj != null) {
                    kj.A5U(this.A01, new C0545Ke(i, 256));
                    kv = new KV(kj, this.A09);
                    this.A07.put(i, kv);
                }
            }
            if (interfaceC1619lN.A8f() > ((this.A04 && this.A05) ? this.A00 + PlaybackStateCompat.ACTION_PLAY_FROM_URI : 1048576L)) {
                this.A03 = true;
                this.A01.A6G();
            }
        }
        interfaceC1619lN.AG9(this.A08.A0l(), 0, 2);
        this.A08.A0f(0);
        int A0M = this.A08.A0M() + 6;
        if (kv == null) {
            interfaceC1619lN.AJJ(A0M);
            return 0;
        }
        this.A08.A0d(A0M);
        interfaceC1619lN.readFully(this.A08.A0l(), 0, A0M);
        this.A08.A0f(6);
        kv.A03(this.A08);
        this.A08.A0e(this.A08.A08());
        return 0;
    }

    public C1524je() {
        this(new C4R(0L));
    }

    public C1524je(C4R c4r) {
        this.A09 = c4r;
        this.A08 = new C4J(4096);
        this.A07 = new SparseArray<>();
        this.A0A = new KU();
    }

    @RequiresNonNull({AgentOptions.OUTPUT})
    private void A00(long j) {
        if (!this.A06) {
            this.A06 = true;
            if (this.A0A.A0C() != -9223372036854775807L) {
                this.A02 = new C1526jg(this.A0A.A0D(), this.A0A.A0C(), j);
                this.A01.AIN(this.A02.A07());
            } else {
                this.A01.AIN(new C1614lI(this.A0A.A0C()));
            }
        }
    }

    public static /* synthetic */ GX[] A01() {
        return new GX[]{new C1524je()};
    }

    @Override // com.instagram.common.viewpoint.core.GX
    public final void AA4(GY gy) {
        this.A01 = gy;
    }

    @Override // com.instagram.common.viewpoint.core.GX
    public final void AGr() {
    }

    @Override // com.instagram.common.viewpoint.core.GX
    public final void AIM(long j, long j2) {
        boolean z = false;
        boolean resetTimestampAdjuster = this.A09.A04() == -9223372036854775807L;
        if (!resetTimestampAdjuster) {
            long A02 = this.A09.A02();
            if (A02 != -9223372036854775807L && A02 != 0 && A02 != j2) {
                z = true;
            }
            resetTimestampAdjuster = z;
        }
        if (resetTimestampAdjuster) {
            this.A09.A07(j2);
        }
        if (this.A02 != null) {
            this.A02.A08(j2);
        }
        for (int i = 0; i < this.A07.size(); i++) {
            this.A07.valueAt(i).A02();
        }
    }

    @Override // com.instagram.common.viewpoint.core.GX
    public final boolean AJL(InterfaceC1619lN interfaceC1619lN) throws IOException {
        byte[] bArr = new byte[14];
        interfaceC1619lN.AG9(bArr, 0, 14);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        byte b = bArr[13];
        if (A0B[3].charAt(12) == 'n') {
            throw new RuntimeException();
        }
        A0B[2] = "VV5ZPjEmtEUa5x1ycfEwWXr";
        int packStuffingLength = b & 7;
        interfaceC1619lN.A3z(packStuffingLength);
        interfaceC1619lN.AG9(bArr, 0, 3);
        int packStuffingLength2 = bArr[0];
        int i = (packStuffingLength2 & 255) << 16;
        int packStuffingLength3 = bArr[1];
        int i2 = i | ((packStuffingLength3 & 255) << 8);
        int packStuffingLength4 = bArr[2];
        return 1 == ((packStuffingLength4 & 255) | i2);
    }
}
