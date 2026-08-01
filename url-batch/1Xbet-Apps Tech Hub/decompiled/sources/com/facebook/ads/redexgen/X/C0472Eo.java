package com.facebook.ads.redexgen.X;

import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.io.encoding.Base64;

/* renamed from: com.facebook.ads.redexgen.X.Eo, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0472Eo extends AbstractC1026a9 {
    public static byte[] A00;
    public static String[] A01 = {"d7tLiGkqyLa7cKOkED7RtvmpIXZH8d0b", "LmA4T64r6T9e", "1EBtOKlPck0twYp3ElEJQmg3d", "uhXcdOUibAChEZNBNQuPqKRIQ2", "Z", "LV0o53GlcsqgEYK9Pr4EwymnJShooL9b", "NLZosIPt4DzrQXhRsvqwWEHVFOTX5bDJ", "MQasnwh7q"};

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 52);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{77, 72, Ascii.FF, 69, 95, Ascii.FF, 66, 67, 88, Ascii.FF, 94, 73, 77, 72, 85, Ascii.FF, 67, 94, Ascii.FF, 77, 64, 94, 73, 77, 72, 85, Ascii.FF, 72, 69, 95, 92, 64, 77, 85, 73, 72, 56, 57, 48, Base64.padSymbol, 37};
    }

    static {
        A03();
    }

    public C0472Eo(YA ya, C01721r c01721r) {
        super(ya, c01721r);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> A01(long j) {
        HashMap hashMap = new HashMap();
        hashMap.put(A00(36, 5, 104), String.valueOf(System.currentTimeMillis() - j));
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05(List<String> trackingUrls, Map<String, String> extraData) {
        if (trackingUrls == null || trackingUrls.isEmpty()) {
            return;
        }
        Iterator<String> it = trackingUrls.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            String[] strArr = A01;
            if (strArr[2].length() == strArr[7].length()) {
                throw new RuntimeException();
            }
            A01[0] = "jDIZMq7wlAdnEmkEGDRuOyHBIh8qxobs";
            if (hasNext) {
                new R1(this.A0B, extraData).execute(it.next());
            } else {
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1026a9
    public final void A0L() {
        C1060ah c1060ah = (C1060ah) this.A01;
        if (c1060ah.A0T()) {
            if (this.A06 != null) {
                this.A06.A0B(c1060ah);
                return;
            }
            return;
        }
        throw new IllegalStateException(A00(0, 36, 24));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1026a9
    public final void A0N(InterfaceC01430o interfaceC01430o, C8F c8f, C8D c8d, C01731s c01731s) {
        C1060ah c1060ah = (C1060ah) interfaceC01430o;
        long currentTimeMillis = System.currentTimeMillis();
        C1022a5 c1022a5 = new C1022a5(this, c01731s, c1060ah, currentTimeMillis, c8d);
        A0E().postDelayed(c1022a5, c8f.A05().A05());
        c1060ah.A0L(this.A0B, new C1021a4(this, c1022a5, currentTimeMillis, c8d), this.A08, c01731s, UJ.A0K());
    }
}
