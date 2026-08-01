package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* renamed from: com.facebook.ads.redexgen.X.4D, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C4D implements Runnable {
    public static Comparator<C4C> A04;
    public static byte[] A05;
    public static String[] A06 = {"C", "g", "thIgEQWd9nx", "UJ", "nKFIv9xSQBz", "WKzZJ6F0j2u08DpGCnjDR9E", "2Nt4JwZoKXCf4OpJNcF1oxTto7W5gJbD", "RW"};
    public static final ThreadLocal<C4D> A07;
    public long A00;
    public long A01;
    public ArrayList<ED> A02 = new ArrayList<>();
    public ArrayList<C4C> A03 = new ArrayList<>();

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 8);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A05 = new byte[]{97, 101, 47, 93, 116, -126, -125, 116, 115, 47, 95, -127, 116, 117, 116, -125, 114, 119, 92, 96, 42, 90, 124, 111, 112, 111, 126, 109, 114};
    }

    static {
        A03();
        A07 = new ThreadLocal<>();
        A04 = new Comparator<C4C>() { // from class: com.facebook.ads.redexgen.X.4B
            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.Comparator
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final int compare(C4C c4c, C4C c4c2) {
                if ((c4c.A03 == null) != (c4c2.A03 == null)) {
                    return c4c.A03 == null ? 1 : -1;
                }
                if (c4c.A04 != c4c2.A04) {
                    return c4c.A04 ? -1 : 1;
                }
                int i = c4c2.A02 - c4c.A02;
                if (i != 0) {
                    return i;
                }
                int i2 = c4c.A00;
                int deltaViewVelocity = c4c2.A00;
                int i3 = i2 - deltaViewVelocity;
                if (i3 != 0) {
                    return i3;
                }
                return 0;
            }
        };
    }

    private AbstractC02504u A00(ED ed, int i, long j) {
        if (A08(ed, i)) {
            return null;
        }
        C02404k c02404k = ed.A0r;
        try {
            ed.A1L();
            AbstractC02504u A0I = c02404k.A0I(i, false, j);
            if (A0I != null) {
                if (A0I.A0a() && !A0I.A0b()) {
                    c02404k.A0X(A0I.A0H);
                } else {
                    c02404k.A0d(A0I, false);
                }
            }
            return A0I;
        } finally {
            ed.A1r(false);
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:22:0x0078 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A02() {
        C4C c4c;
        int size = this.A02.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            ED ed = this.A02.get(i2);
            int viewCount = ed.getWindowVisibility();
            if (viewCount == 0) {
                ed.A02.A04(ed, false);
                int viewCount2 = ed.A02.A00;
                i += viewCount2;
            }
        }
        this.A03.ensureCapacity(i);
        int j = 0;
        String[] strArr = A06;
        String str = strArr[3];
        String str2 = strArr[7];
        int totalTaskCount = str.length();
        int viewCount3 = str2.length();
        if (totalTaskCount != viewCount3) {
            throw new RuntimeException();
        }
        String[] strArr2 = A06;
        strArr2[3] = "OH";
        strArr2[7] = "7S";
        for (int i3 = 0; i3 < size; i3++) {
            ED ed2 = this.A02.get(i3);
            int viewCount4 = ed2.getWindowVisibility();
            if (viewCount4 == 0) {
                ZD zd = ed2.A02;
                int viewCount5 = zd.A01;
                int i4 = Math.abs(viewCount5);
                int viewCount6 = zd.A02;
                int i5 = i4 + Math.abs(viewCount6);
                for (int i6 = 0; i6 < viewCount * 2; i6 += 2) {
                    int viewCount7 = this.A03.size();
                    if (j >= viewCount7) {
                        c4c = new C4C();
                        this.A03.add(c4c);
                    } else {
                        c4c = this.A03.get(j);
                    }
                    int totalTaskCount2 = i6 + 1;
                    int totalTaskIndex = zd.A03[totalTaskCount2];
                    c4c.A04 = totalTaskIndex <= i5;
                    c4c.A02 = i5;
                    c4c.A00 = totalTaskIndex;
                    c4c.A03 = ed2;
                    int totalTaskCount3 = zd.A03[i6];
                    c4c.A01 = totalTaskCount3;
                    j++;
                }
            }
        }
        Collections.sort(this.A03, A04);
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0007 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A04(long j) {
        for (int i = 0; i < i; i++) {
            C4C task = this.A03.get(i);
            if (task.A03 == null) {
                return;
            }
            A06(task, j);
            task.A00();
        }
    }

    private final void A05(long j) {
        A02();
        A04(j);
    }

    private void A06(C4C c4c, long j) {
        AbstractC02504u A00 = A00(c4c.A03, c4c.A01, c4c.A04 ? Long.MAX_VALUE : j);
        if (A00 != null && A00.A09 != null && A00.A0a() && !A00.A0b()) {
            A07(A00.A09.get(), j);
        }
    }

    private void A07(ED ed, long j) {
        if (ed == null) {
            return;
        }
        if (ed.A0C) {
            AnonymousClass40 anonymousClass40 = ed.A01;
            if (A06[5].length() != 17) {
                A06[6] = "t2x0aSlbBonOFe0N5m1ttILNz4IaYpUW";
                if (anonymousClass40.A06() != 0) {
                    ed.A1O();
                }
            }
            throw new RuntimeException();
        }
        ZD zd = ed.A02;
        zd.A04(ed, true);
        if (zd.A00 != 0) {
            try {
                C01852e.A01(A01(0, 18, 7));
                ed.A0s.A05(ed.A04);
                int i = 0;
                while (true) {
                    int i2 = zd.A00 * 2;
                    int i3 = A06[6].charAt(8);
                    if (i3 == 73) {
                        break;
                    }
                    String[] strArr = A06;
                    strArr[3] = "nG";
                    strArr[7] = "TD";
                    if (i < i2) {
                        A00(ed, zd.A03[i], j);
                        i += 2;
                    } else {
                        return;
                    }
                }
                throw new RuntimeException();
            } finally {
                C01852e.A00();
            }
        }
    }

    public static boolean A08(ED ed, int i) {
        int A062 = ed.A01.A06();
        for (int i2 = 0; i2 < A062; i2++) {
            AbstractC02504u A0F = ED.A0F(ed.A01.A0A(i2));
            int childCount = A0F.A03;
            if (childCount == i && !A0F.A0b()) {
                return true;
            }
        }
        return false;
    }

    public final void A09(ED ed) {
        this.A02.add(ed);
    }

    public final void A0A(ED ed) {
        this.A02.remove(ed);
    }

    public final void A0B(ED ed, int i, int i2) {
        if (ed.isAttachedToWindow() && this.A01 == 0) {
            this.A01 = ed.getNanoTime();
            ed.post(this);
        }
        ed.A02.A03(i, i2);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            C01852e.A01(A01(18, 11, 2));
            if (this.A02.isEmpty()) {
                return;
            }
            int size = this.A02.size();
            long j = 0;
            for (int i = 0; i < size; i++) {
                ED ed = this.A02.get(i);
                if (ed.getWindowVisibility() == 0) {
                    j = Math.max(ed.getDrawingTime(), j);
                }
            }
            if (j == 0) {
                this.A01 = 0L;
                if (A06[5].length() == 17) {
                    throw new RuntimeException();
                }
                A06[5] = "H4nD1dOrFb1";
                C01852e.A00();
                return;
            }
            A05(TimeUnit.MILLISECONDS.toNanos(j) + this.A00);
        } finally {
            this.A01 = 0L;
            C01852e.A00();
        }
    }
}
