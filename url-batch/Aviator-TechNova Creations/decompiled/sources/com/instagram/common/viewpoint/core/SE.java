package com.instagram.common.viewpoint.core;

import android.graphics.Bitmap;
import android.net.TrafficStats;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.Callable;
import org.objectweb.asm.Opcodes;

/* loaded from: assets/audience_network.dex */
public class SE implements Callable<Boolean> {
    public static byte[] A02;
    public final SD A00;
    public final /* synthetic */ SF A01;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 2);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-35, -31, -43, -37, -39};
    }

    public SE(SF sf, SD sd) {
        this.A01 = sf;
        this.A00 = sd;
    }

    private final Boolean A00() {
        SQ sq;
        boolean z;
        SG sg;
        boolean z2;
        boolean z3;
        SQ sq2;
        InterfaceC0562Kp A03;
        Map map;
        if (AbstractC0838Vl.A02(this)) {
            return null;
        }
        try {
            TrafficStats.setThreadStatsTag(61453);
            C0568Kv c0568Kv = new C0568Kv(this.A00.A08, this.A00.A07, this.A00.A06, A01(0, 5, Opcodes.FREM), this.A00.A02, this.A00.A03);
            c0568Kv.A01 = this.A00.A05;
            c0568Kv.A00 = this.A00.A04;
            sq = this.A01.A04;
            if (SI.A06(sq)) {
                map = SF.A0F;
                map.put(this.A00.A08, c0568Kv);
            }
            z = this.A01.A08;
            boolean precacheResult = false;
            if (!z) {
                sg = this.A01.A03;
                if (sg.A0F(this.A00) != null) {
                    precacheResult = true;
                }
            } else {
                sq2 = this.A01.A04;
                A03 = SF.A03(sq2.A02());
                precacheResult = A03.AHu(c0568Kv, false).A01();
            }
            SL sl = this.A00.A01;
            if (sl != null && sl.A02()) {
                int A00 = sl.A00();
                int A01 = sl.A01();
                if (A00 <= 0 || A01 <= 0) {
                    z2 = this.A01.A08;
                    if (z2) {
                        A04(this.A00.A08, c0568Kv);
                    } else {
                        A03(this.A00.A04, this.A00.A05);
                    }
                } else {
                    z3 = this.A01.A08;
                    if (z3) {
                        c0568Kv.A00 = A00;
                        c0568Kv.A01 = A01;
                        A04(this.A00.A08, c0568Kv);
                    } else {
                        A03(A00, A01);
                    }
                }
            }
            return Boolean.valueOf(precacheResult);
        } catch (Throwable th) {
            AbstractC0838Vl.A00(th, this);
            return null;
        }
    }

    private void A03(int i, int i2) {
        SG sg;
        SQ sq;
        Map map;
        sg = this.A01.A03;
        sq = this.A01.A04;
        Bitmap A0G = sg.A0G(sq, this.A00.A08, i, i2, this.A00.A02);
        if (A0G == null) {
            return;
        }
        map = this.A01.A07;
        map.put(this.A00.A08, A0G);
    }

    private void A04(String str, C0568Kv c0568Kv) {
        SQ sq;
        InterfaceC0562Kp A03;
        Map map;
        sq = this.A01.A04;
        A03 = SF.A03(sq.A02());
        Bitmap A00 = A03.AHu(c0568Kv, true).A00();
        if (A00 == null) {
            return;
        }
        map = this.A01.A07;
        map.put(str, A00);
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Boolean call() throws Exception {
        if (AbstractC0838Vl.A02(this)) {
            return null;
        }
        try {
            return A00();
        } catch (Throwable th) {
            AbstractC0838Vl.A00(th, this);
            return null;
        }
    }
}
