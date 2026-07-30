package com.instagram.common.viewpoint.core;

import com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView;
import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public abstract class QK {
    public static byte[] A06;
    public static String[] A07 = {"7", "BOchn05cOqPQPKgaZhD7MWqYHqoCKx7o", "EPTevQXo6AzOyuxFlfcAvx5eJdnVP8", "v", "6fNY9lNhy7nUhuOGP7YDUX6WqdzgNzMN", "SLjIMlZrt8LApw5SyAUFDc4ipDag7tTu", "zXvx6U5xIRhnU3fWG5rnYTWUnq20aSrc", "c4GOdlXhzm3270NA43EFNLoVECdVoF38"};
    public QI A04 = null;
    public ArrayList<RecyclerView.ItemAnimator.ItemAnimatorFinishedListener> A05 = new ArrayList<>();
    public long A00 = 120;
    public long A03 = 120;
    public long A02 = 250;
    public long A01 = 250;

    public static String A08(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            byte b = (byte) ((copyOfRange[i4] - i3) - 109);
            String[] strArr = A07;
            if (strArr[6].charAt(25) == strArr[5].charAt(25)) {
                throw new RuntimeException();
            }
            A07[2] = "awpTB9u15TkHVvPjjOCd09Fy8dol99E";
            copyOfRange[i4] = b;
        }
        return new String(copyOfRange);
    }

    public static void A09() {
        A06 = new byte[]{76, 75, Ascii.RS, 75, 70, 74, 62, 81, 70, 76, 75, 80, 35, 70, 75, 70, 80, 69, 66, 65};
    }

    public abstract void A0H();

    public abstract void A0I();

    public abstract void A0L(AbstractC0706Qg abstractC0706Qg);

    public abstract boolean A0M();

    public abstract boolean A0N(AbstractC0706Qg abstractC0706Qg);

    public abstract boolean A0O(AbstractC0706Qg abstractC0706Qg, QJ qj, QJ qj2);

    public abstract boolean A0P(AbstractC0706Qg abstractC0706Qg, QJ qj, QJ qj2);

    public abstract boolean A0Q(AbstractC0706Qg abstractC0706Qg, QJ qj, QJ qj2);

    public abstract boolean A0R(AbstractC0706Qg abstractC0706Qg, AbstractC0706Qg abstractC0706Qg2, QJ qj, QJ qj2);

    static {
        A09();
    }

    public static int A06(AbstractC0706Qg abstractC0706Qg) {
        int i;
        i = abstractC0706Qg.A0C;
        int i2 = i & 14;
        if (abstractC0706Qg.A0f()) {
            return 4;
        }
        int flags = i2 & 4;
        if (flags == 0) {
            int pos = abstractC0706Qg.A0P();
            int oldPos = abstractC0706Qg.A0M();
            if (pos != -1 && oldPos != -1 && pos != oldPos) {
                return i2 | 2048;
            }
            return i2;
        }
        return i2;
    }

    private final QJ A07() {
        return new QJ();
    }

    public final long A0A() {
        return this.A00;
    }

    public final long A0B() {
        return this.A01;
    }

    public final long A0C() {
        return this.A02;
    }

    public final long A0D() {
        return this.A03;
    }

    public final QJ A0E(C0703Qd c0703Qd, AbstractC0706Qg abstractC0706Qg) {
        return A07().A01(abstractC0706Qg);
    }

    public final QJ A0F(C0703Qd c0703Qd, AbstractC0706Qg abstractC0706Qg, int i, List<Object> payloads) {
        return A07().A01(abstractC0706Qg);
    }

    public final void A0G() {
        int count = this.A05.size();
        if (0 < count) {
            this.A05.get(0);
            throw new NullPointerException(A08(0, 20, 112));
        }
        this.A05.clear();
    }

    public final void A0J(QI qi) {
        this.A04 = qi;
    }

    public final void A0K(AbstractC0706Qg abstractC0706Qg) {
        if (this.A04 != null) {
            this.A04.ACK(abstractC0706Qg);
        }
    }

    public boolean A0S(AbstractC0706Qg abstractC0706Qg, List<Object> payloads) {
        return A0N(abstractC0706Qg);
    }
}
