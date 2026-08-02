package com.instagram.common.viewpoint.core;

import android.view.View;
import android.view.ViewGroup;
import com.google.common.base.Ascii;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import okio.Utf8;
import org.objectweb.asm.Opcodes;

/* loaded from: assets/audience_network.dex */
public final class QW {
    public static byte[] A09;
    public static String[] A0A = {"", "d6jyZ4YF4aAx6mY2oyMV8cMH3x1tTmGX", "6ShmsSFKDmdiSeaEbVJI0pMmhv", "Jy6CLSdjiTJVmxisrmhO9od6ZqYVQGpz", "aKDRqPZxmSwbRmY5O7VQCqOvGq0yRVmO", "vr6xx06LqTBYtEPA9ZzozSqPDwzkbNaY", "Y84hViIy7qYskGYmJ3QVEouknT", ""};
    public QV A01;
    public AbstractC0698Qe A04;
    public final /* synthetic */ C02006g A08;
    public final ArrayList<AbstractC0700Qg> A05 = new ArrayList<>();
    public ArrayList<AbstractC0700Qg> A02 = null;
    public final ArrayList<AbstractC0700Qg> A06 = new ArrayList<>();
    public final List<AbstractC0700Qg> A07 = Collections.unmodifiableList(this.A05);
    public int A03 = 2;
    public int A00 = 2;

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A09, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 10);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A09 = new byte[]{113, 56, 34, 16, 37, 37, 48, 50, 57, 52, 53, 107, 56, 86, 17, Ascii.CAN, Ascii.CAN, Ascii.CR, Ascii.ESC, 10, 68, 32, 39, 41, 64, 125, 108, 100, 41, 106, 102, 124, 103, 125, 51, 79, 72, Ascii.NAK, Ascii.DC2, 7, Ascii.DC2, 3, 92, 121, 91, 86, 86, 95, 94, Ascii.SUB, 73, 89, 72, 91, 74, Ascii.SUB, 76, 83, 95, 77, Ascii.SUB, 77, 83, 78, 82, Ascii.SUB, 91, 84, Ascii.SUB, 83, 84, 76, 91, 86, 83, 94, Ascii.SUB, 76, 83, 95, 77, Ascii.DC4, Ascii.SUB, 115, 84, 76, 91, 86, 83, 94, Ascii.SUB, 76, 83, 95, 77, 73, Ascii.SUB, 89, 91, 84, 84, 85, 78, Ascii.SUB, 88, 95, Ascii.SUB, 72, 95, 79, 73, 95, 94, Ascii.SUB, 92, 72, 85, 87, Ascii.SUB, 73, 89, 72, 91, 74, Ascii.SYN, Ascii.SUB, 78, 82, 95, 67, Ascii.SUB, 73, 82, 85, 79, 86, 94, Ascii.SUB, 72, 95, 88, 85, 79, 84, 94, Ascii.SUB, 92, 72, 85, 87, Ascii.SUB, 72, 95, 89, 67, 89, 86, 95, 72, Ascii.SUB, 74, 85, 85, 86, Ascii.DC4, 116, 83, 94, 82, 83, 78, 84, 78, 73, 88, 83, 94, 68, Ascii.GS, 89, 88, 73, 88, 94, 73, 88, 89, 19, Ascii.GS, 116, 83, 75, 92, 81, 84, 89, Ascii.GS, 84, 73, 88, 80, Ascii.GS, 77, 82, 78, 84, 73, 84, 82, 83, Ascii.GS, Ascii.US, 56, 53, 57, 56, 37, Utf8.REPLACEMENT_BYTE, 37, 34, 51, 56, 53, 47, 118, 50, 51, 34, 51, 53, 34, 51, 50, 120, 118, Ascii.US, 56, 32, 55, 58, Utf8.REPLACEMENT_BYTE, 50, 118, 32, Utf8.REPLACEMENT_BYTE, 51, 33, 118, 62, 57, 58, 50, 51, 36, 118, 55, 50, 55, 38, 34, 51, 36, 118, 38, 57, 37, Utf8.REPLACEMENT_BYTE, 34, Utf8.REPLACEMENT_BYTE, 57, 56, 89, 126, 102, 113, 124, 121, 116, 48, 121, 100, 117, 125, 48, 96, Byte.MAX_VALUE, 99, 121, 100, 121, Byte.MAX_VALUE, 126, 48, Ascii.DC2, 34, 51, 32, 49, 49, 36, 37, 97, 46, 51, 97, 32, 53, 53, 32, 34, 41, 36, 37, 97, 55, 40, 36, 54, 50, 97, 44, 32, 56, 97, 47, 46, 53, 97, 35, 36, 97, 51, 36, 34, 56, 34, 45, 36, 37, 111, 97, 40, 50, Ascii.DC2, 34, 51, 32, 49, 123, 108, 85, 72, Ascii.CAN, 92, 93, 76, 89, 91, 80, 93, 92, Ascii.CAN, 78, 81, 93, 79, Ascii.CAN, 75, 80, 87, 77, 84, 92, Ascii.CAN, 90, 93, Ascii.CAN, 74, 93, 85, 87, 78, 93, 92, Ascii.CAN, 94, 74, 87, 85, Ascii.CAN, 106, 93, 91, 65, 91, 84, 93, 74, 110, 81, 93, 79, Ascii.CAN, 90, 93, 94, 87, 74, 93, Ascii.CAN, 81, 76, Ascii.CAN, 91, 89, 86, Ascii.CAN, 90, 93, Ascii.CAN, 74, 93, 91, 65, 91, 84, 93, 92, 2, Ascii.CAN, 87, 113, 122, 106, 109, 100, 35, 119, 108, 35, 113, 102, 96, 122, 96, 111, 102, 35, 98, 109, 35, 106, 100, 109, 108, 113, 102, 103, 35, 117, 106, 102, 116, 35, 107, 108, 111, 103, 102, 113, 45, 35, 90, 108, 118, 35, 112, 107, 108, 118, 111, 103, 35, 101, 106, 113, 112, 119, 35, 96, 98, 111, 111, 35, 112, 119, 108, 115, 74, 100, 109, 108, 113, 106, 109, 100, 85, 106, 102, 116, 43, 117, 106, 102, 116, 42, 35, 97, 102, 101, 108, 113, 102, 35, 96, 98, 111, 111, 106, 109, 100, 35, 113, 102, 96, 122, 96, 111, 102, 45, 48, 50, 35, 1, 62, 50, 32, 17, 56, 37, 7, 56, 36, 62, 35, 62, 56, 57, Ascii.SYN, 57, 51, 3, 46, 39, 50, Ascii.GS, 16, 8, Ascii.RS, 4, 5, 81, Ascii.CAN, Ascii.US, Ascii.NAK, Ascii.DC4, 9, 81, 2, Ascii.EM, Ascii.RS, 4, Ascii.GS, Ascii.NAK, 81, Ascii.US, Ascii.RS, 5, 81, 19, Ascii.DC4, 81, 92, 64, 81, 16, Ascii.ETB, 5, Ascii.DC4, 3, 81, 4, Ascii.US, Ascii.EM, Ascii.CAN, Ascii.NAK, Ascii.CAN, Ascii.US, Ascii.SYN, 81, 16, 81, 7, Ascii.CAN, Ascii.DC4, 6, 75, 69, 68, 124, 67, 79, 93, 120, 79, 73, 83, 73, 70, 79, 78};
    }

    static {
        A05();
    }

    public QW(C02006g c02006g) {
        this.A08 = c02006g;
    }

    private final View A00(int i, boolean z) {
        return A0I(i, z, Long.MAX_VALUE).A0H;
    }

    private final AbstractC0700Qg A01(int i) {
        int size;
        int A04;
        if (this.A02 == null || (size = this.A02.size()) == 0) {
            return null;
        }
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC0700Qg abstractC0700Qg = this.A02.get(i2);
            if (!abstractC0700Qg.A0m()) {
                int i3 = abstractC0700Qg.A0O();
                if (i3 == i) {
                    abstractC0700Qg.A0Z(32);
                    return abstractC0700Qg;
                }
            }
        }
        if (this.A08.A04.A0M() && (A04 = this.A08.A00.A04(i)) > 0) {
            int offsetPosition = this.A08.A04.A0B();
            if (A04 < offsetPosition) {
                long A0D = this.A08.A04.A0D(A04);
                for (int i4 = 0; i4 < size; i4++) {
                    AbstractC0700Qg abstractC0700Qg2 = this.A02.get(i4);
                    if (!abstractC0700Qg2.A0m() && abstractC0700Qg2.A0Q() == A0D) {
                        abstractC0700Qg2.A0Z(32);
                        return abstractC0700Qg2;
                    }
                }
            }
        }
        return null;
    }

    private final AbstractC0700Qg A02(int i, boolean z) {
        View A08;
        int size = this.A05.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC0700Qg abstractC0700Qg = this.A05.get(i2);
            if (!abstractC0700Qg.A0m()) {
                int scrapCount = abstractC0700Qg.A0O();
                if (scrapCount == i && !abstractC0700Qg.A0f() && (this.A08.A0s.A09 || !abstractC0700Qg.A0g())) {
                    abstractC0700Qg.A0Z(32);
                    return abstractC0700Qg;
                }
            }
        }
        if (!z && (A08 = this.A08.A01.A08(i)) != null) {
            AbstractC0700Qg A0F = C02006g.A0F(A08);
            this.A08.A01.A0G(A08);
            int A07 = this.A08.A01.A07(A08);
            if (A07 != -1) {
                this.A08.A01.A0C(A07);
                A0S(A08);
                A0F.A0Z(8224);
                return A0F;
            }
            throw new IllegalStateException(A04(565, 52, 123) + A0F + this.A08.A1J());
        }
        int size2 = this.A06.size();
        for (int i3 = 0; i3 < size2; i3++) {
            AbstractC0700Qg holder = this.A06.get(i3);
            String[] strArr = A0A;
            String str = strArr[7];
            String str2 = strArr[0];
            int cacheSize = str.length();
            int scrapCount2 = str2.length();
            if (cacheSize != scrapCount2) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[4] = "JIr6ryR6hWTh2WYmHdarh5TP4xAypylw";
            strArr2[1] = "npmC62BAQEqZygYceoAiNhkQGghR92x0";
            if (!holder.A0f()) {
                int scrapCount3 = holder.A0O();
                if (scrapCount3 == i) {
                    if (!z) {
                        this.A06.remove(i3);
                    }
                    return holder;
                }
            }
        }
        return null;
    }

    private final AbstractC0700Qg A03(long j, int i, boolean z) {
        int count = this.A05.size();
        for (int i2 = count - 1; i2 >= 0; i2--) {
            AbstractC0700Qg abstractC0700Qg = this.A05.get(i2);
            if (abstractC0700Qg.A0Q() == j && !abstractC0700Qg.A0m()) {
                int count2 = abstractC0700Qg.A0N();
                if (i == count2) {
                    abstractC0700Qg.A0Z(32);
                    boolean A0g = abstractC0700Qg.A0g();
                    String[] strArr = A0A;
                    String str = strArr[2];
                    String str2 = strArr[6];
                    int i3 = str.length();
                    int count3 = str2.length();
                    if (i3 == count3) {
                        String[] strArr2 = A0A;
                        strArr2[4] = "3Wf6vMFZ4V6K3VYEAeXlgILB3Kqn8tmj";
                        strArr2[1] = "2gRFj7AUivxslEY3Do0gPT185jjA6g6i";
                        if (A0g && !this.A08.A0s.A07()) {
                            abstractC0700Qg.A0a(2, 14);
                        }
                        return abstractC0700Qg;
                    }
                } else if (z) {
                    continue;
                } else {
                    this.A05.remove(i2);
                    C02006g c02006g = this.A08;
                    View view = abstractC0700Qg.A0H;
                    String[] strArr3 = A0A;
                    String str3 = strArr3[7];
                    String str4 = strArr3[0];
                    int i4 = str3.length();
                    int count4 = str4.length();
                    if (i4 == count4) {
                        String[] strArr4 = A0A;
                        strArr4[5] = "QSy8SYzj9TGZXONlvrRd2Hl7xNggaX2t";
                        strArr4[3] = "FStY7c67BTbAcWAeNWEJdNOuKPlMCdqH";
                        c02006g.removeDetachedView(view, false);
                        A0R(abstractC0700Qg.A0H);
                    }
                }
                throw new RuntimeException();
            }
        }
        int count5 = this.A06.size();
        for (int i5 = count5 - 1; i5 >= 0; i5--) {
            AbstractC0700Qg abstractC0700Qg2 = this.A06.get(i5);
            if (abstractC0700Qg2.A0Q() == j) {
                int count6 = abstractC0700Qg2.A0N();
                if (i == count6) {
                    if (!z) {
                        this.A06.remove(i5);
                    }
                    return abstractC0700Qg2;
                }
                if (!z) {
                    A07(i5);
                    String[] strArr5 = A0A;
                    String str5 = strArr5[7];
                    String str6 = strArr5[0];
                    int cacheSize = str5.length();
                    int count7 = str6.length();
                    if (cacheSize != count7) {
                        throw new RuntimeException();
                    }
                    String[] strArr6 = A0A;
                    strArr6[2] = "Px4MCeB3tpw5Kws4bgsL6OQ2tD";
                    strArr6[6] = "cZzmTfGm3PDqBsfSjCaAnG9aB7";
                    return null;
                }
            }
        }
        return null;
    }

    private final void A06() {
        boolean z;
        int count = this.A06.size();
        for (int count2 = count - 1; count2 >= 0; count2--) {
            A07(count2);
        }
        this.A06.clear();
        z = C02006g.A1E;
        if (z) {
            this.A08.A02.A02();
        }
    }

    private final void A07(int i) {
        A0Z(this.A06.get(i), true);
        this.A06.remove(i);
    }

    private void A08(ViewGroup viewGroup, boolean z) {
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt instanceof ViewGroup) {
                A08((ViewGroup) childAt, true);
            }
        }
        if (!z) {
            return;
        }
        if (viewGroup.getVisibility() == 4) {
            viewGroup.setVisibility(0);
            viewGroup.setVisibility(4);
        } else {
            int visibility = viewGroup.getVisibility();
            viewGroup.setVisibility(4);
            viewGroup.setVisibility(visibility);
        }
    }

    private void A09(AbstractC0700Qg abstractC0700Qg) {
        if (this.A08.A1q()) {
            View view = abstractC0700Qg.A0H;
            if (P3.A00(view) == 0) {
                P3.A09(view, 1);
            }
            if (P3.A0F(view)) {
                return;
            }
            String[] strArr = A0A;
            if (strArr[4].charAt(14) != strArr[1].charAt(14)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[5] = "r5izwM6EITTd8J0QgfTuliuK3Ylx6gnH";
            strArr2[3] = "CLm8SGIYJT8sX0J5oMrTiG0qZUHKeksn";
            abstractC0700Qg.A0Z(16384);
            P3.A0B(view, this.A08.A09.A0A());
        }
    }

    private void A0A(AbstractC0700Qg abstractC0700Qg) {
        if (abstractC0700Qg.A0H instanceof ViewGroup) {
            A08((ViewGroup) abstractC0700Qg.A0H, false);
        }
    }

    private final void A0B(AbstractC0700Qg abstractC0700Qg) {
        if (0 != 0) {
            throw new NullPointerException(A04(617, 14, 32));
        }
        if (this.A08.A0s != null) {
            this.A08.A0t.A0B(abstractC0700Qg);
        }
    }

    private final boolean A0C(AbstractC0700Qg abstractC0700Qg) {
        if (abstractC0700Qg.A0g()) {
            return this.A08.A0s.A07();
        }
        if (abstractC0700Qg.A03 >= 0 && abstractC0700Qg.A03 < this.A08.A04.A0B()) {
            if (!this.A08.A0s.A07()) {
                int A0C = this.A08.A04.A0C(abstractC0700Qg.A03);
                int type = abstractC0700Qg.A0N();
                if (A0C != type) {
                    return false;
                }
            }
            return !this.A08.A04.A0M() || abstractC0700Qg.A0Q() == this.A08.A04.A0D(abstractC0700Qg.A03);
        }
        throw new IndexOutOfBoundsException(A04(211, 60, 92) + abstractC0700Qg + this.A08.A1J());
    }

    private boolean A0D(AbstractC0700Qg abstractC0700Qg, int i, int i2, long j) {
        abstractC0700Qg.A08 = this.A08;
        int A0N = abstractC0700Qg.A0N();
        long nanoTime = this.A08.getNanoTime();
        if (j != Long.MAX_VALUE && !this.A01.A0A(A0N, nanoTime, j)) {
            return false;
        }
        this.A08.A04.A0J(abstractC0700Qg, i);
        this.A01.A05(abstractC0700Qg.A0N(), this.A08.getNanoTime() - nanoTime);
        A09(abstractC0700Qg);
        if (this.A08.A0s.A07()) {
            abstractC0700Qg.A04 = i2;
            return true;
        }
        return true;
    }

    public final int A0E() {
        return this.A05.size();
    }

    public final View A0F(int i) {
        return this.A05.get(i).A0H;
    }

    public final View A0G(int i) {
        return A00(i, false);
    }

    public final QV A0H() {
        if (this.A01 == null) {
            this.A01 = new QV();
        }
        return this.A01;
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x0242, code lost:
    
        if (r6 == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0244, code lost:
    
        r5 = (com.instagram.common.viewpoint.core.QP) r22.A08.generateLayoutParams(r5);
        r11.A0H.setLayoutParams(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0261, code lost:
    
        r5 = (com.instagram.common.viewpoint.core.QP) r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x025e, code lost:
    
        if (r6 == false) goto L98;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC0700Qg A0I(int i, boolean z, long j) {
        QP qp;
        boolean fromScrapOrHiddenOrCache;
        C02006g A0H;
        if (i >= 0 && i < this.A08.A0s.A03()) {
            boolean z2 = false;
            AbstractC0700Qg abstractC0700Qg = null;
            boolean fromScrapOrHiddenOrCache2 = this.A08.A0s.A07();
            if (fromScrapOrHiddenOrCache2) {
                abstractC0700Qg = A01(i);
                z2 = abstractC0700Qg != null;
            }
            if (abstractC0700Qg == null && (abstractC0700Qg = A02(i, z)) != null) {
                boolean fromScrapOrHiddenOrCache3 = A0C(abstractC0700Qg);
                if (!fromScrapOrHiddenOrCache3) {
                    if (!z) {
                        String[] strArr = A0A;
                        if (strArr[2].length() == strArr[6].length()) {
                            String[] strArr2 = A0A;
                            strArr2[7] = "";
                            strArr2[0] = "";
                            abstractC0700Qg.A0Z(4);
                            boolean fromScrapOrHiddenOrCache4 = abstractC0700Qg.A0h();
                            if (fromScrapOrHiddenOrCache4) {
                                this.A08.removeDetachedView(abstractC0700Qg.A0H, false);
                                abstractC0700Qg.A0Y();
                            } else {
                                boolean fromScrapOrHiddenOrCache5 = abstractC0700Qg.A0m();
                                if (fromScrapOrHiddenOrCache5) {
                                    abstractC0700Qg.A0U();
                                }
                            }
                            A0X(abstractC0700Qg);
                        }
                        throw new RuntimeException();
                    }
                    abstractC0700Qg = null;
                } else {
                    z2 = true;
                }
            }
            if (abstractC0700Qg == null) {
                int A04 = this.A08.A00.A04(i);
                if (A04 < 0 || A04 >= this.A08.A04.A0B()) {
                    throw new IndexOutOfBoundsException(A04(Opcodes.IF_ACMPEQ, 46, 55) + i + A04(13, 8, 116) + A04 + A04(35, 8, 108) + this.A08.A0s.A03() + this.A08.A1J());
                }
                int offsetPosition = this.A08.A04.A0C(A04);
                boolean fromScrapOrHiddenOrCache6 = this.A08.A04.A0M();
                if (fromScrapOrHiddenOrCache6 && (abstractC0700Qg = A03(this.A08.A04.A0D(A04), offsetPosition, z)) != null) {
                    abstractC0700Qg.A03 = A04;
                    z2 = true;
                }
                if (abstractC0700Qg == null && 0 != 0) {
                    throw new NullPointerException(A04(540, 25, 93));
                }
                if (abstractC0700Qg == null && (abstractC0700Qg = A0H().A03(offsetPosition)) != null) {
                    abstractC0700Qg.A0W();
                    boolean fromScrapOrHiddenOrCache7 = C02006g.A1C;
                    if (fromScrapOrHiddenOrCache7) {
                        A0A(abstractC0700Qg);
                    }
                }
                if (abstractC0700Qg == null) {
                    long nanoTime = this.A08.getNanoTime();
                    String[] strArr3 = A0A;
                    if (strArr3[4].charAt(14) == strArr3[1].charAt(14)) {
                        String[] strArr4 = A0A;
                        strArr4[5] = "boNM8OY2bTpFYgdjXbnYcgq0xZrcwPhs";
                        strArr4[3] = "UkhWCoe8HTTYlCSa40rnYF5pqDe823no";
                        if (j != Long.MAX_VALUE) {
                            boolean fromScrapOrHiddenOrCache8 = this.A01.A0B(offsetPosition, nanoTime, j);
                            if (!fromScrapOrHiddenOrCache8) {
                                return null;
                            }
                        }
                        abstractC0700Qg = this.A08.A04.A0E(this.A08, offsetPosition);
                        fromScrapOrHiddenOrCache = C02006g.A1E;
                        if (fromScrapOrHiddenOrCache && (A0H = C02006g.A0H(abstractC0700Qg.A0H)) != null) {
                            abstractC0700Qg.A09 = new WeakReference<>(A0H);
                        }
                        this.A01.A06(offsetPosition, this.A08.getNanoTime() - nanoTime);
                    }
                    throw new RuntimeException();
                }
            }
            if (z2 && !this.A08.A0s.A07() && abstractC0700Qg.A0o(8192)) {
                abstractC0700Qg.A0a(0, 8192);
                if (this.A08.A0s.A0C) {
                    int changeFlags = QK.A06(abstractC0700Qg);
                    QJ info = this.A08.A05.A0F(this.A08.A0s, abstractC0700Qg, changeFlags | 4096, abstractC0700Qg.A0R());
                    this.A08.A1k(abstractC0700Qg, info);
                }
            }
            boolean z3 = false;
            if (this.A08.A0s.A07() && abstractC0700Qg.A0e()) {
                abstractC0700Qg.A04 = i;
            } else if (!abstractC0700Qg.A0e() || abstractC0700Qg.A0k() || abstractC0700Qg.A0f()) {
                z3 = A0D(abstractC0700Qg, this.A08.A00.A04(i), i, j);
            }
            ViewGroup.LayoutParams layoutParams = abstractC0700Qg.A0H.getLayoutParams();
            if (layoutParams == null) {
                qp = (QP) this.A08.generateDefaultLayoutParams();
                abstractC0700Qg.A0H.setLayoutParams(qp);
            } else {
                boolean checkLayoutParams = this.A08.checkLayoutParams(layoutParams);
                String[] strArr5 = A0A;
                if (strArr5[5].charAt(9) != strArr5[3].charAt(9)) {
                    String[] strArr6 = A0A;
                    strArr6[2] = "zCboBEvvN0uPYmtuolLcQSfyvv";
                    strArr6[6] = "oQlbeeNPYINxaBCA8kGLswkn0x";
                } else {
                    String[] strArr7 = A0A;
                    strArr7[7] = "";
                    strArr7[0] = "";
                }
            }
            qp.A00 = abstractC0700Qg;
            qp.A02 = z2 && z3;
            return abstractC0700Qg;
        }
        throw new IndexOutOfBoundsException(A04(271, 22, 26) + i + A04(12, 1, 26) + i + A04(21, 14, 3) + this.A08.A0s.A03() + this.A08.A1J());
    }

    public final List<AbstractC0700Qg> A0J() {
        return this.A07;
    }

    public final void A0K() {
        int size = this.A06.size();
        for (int i = 0; i < size; i++) {
            this.A06.get(i).A0S();
        }
        int i2 = this.A05.size();
        for (int scrapCount = 0; scrapCount < i2; scrapCount++) {
            this.A05.get(scrapCount).A0S();
        }
        if (this.A02 != null) {
            int changedScrapCount = this.A02.size();
            for (int scrapCount2 = 0; scrapCount2 < changedScrapCount; scrapCount2++) {
                this.A02.get(scrapCount2).A0S();
            }
        }
    }

    public final void A0L() {
        this.A05.clear();
        if (this.A02 != null) {
            this.A02.clear();
        }
    }

    public final void A0M() {
        int size = this.A06.size();
        for (int i = 0; i < size; i++) {
            QP qp = (QP) this.A06.get(i).A0H.getLayoutParams();
            if (qp != null) {
                qp.A01 = true;
            }
        }
    }

    public final void A0N() {
        if (this.A08.A04 != null && this.A08.A04.A0M()) {
            int size = this.A06.size();
            for (int i = 0; i < size; i++) {
                AbstractC0700Qg abstractC0700Qg = this.A06.get(i);
                if (abstractC0700Qg != null) {
                    abstractC0700Qg.A0Z(6);
                    abstractC0700Qg.A0c(null);
                }
            }
            return;
        }
        A06();
    }

    public final void A0O() {
        int i = this.A08.A06 != null ? this.A08.A06.A00 : 0;
        int extraCache = this.A03;
        this.A00 = extraCache + i;
        int extraCache2 = this.A06.size();
        for (int i2 = extraCache2 - 1; i2 >= 0; i2--) {
            int size = this.A06.size();
            int i3 = this.A00;
            String[] strArr = A0A;
            String str = strArr[5];
            String str2 = strArr[3];
            int i4 = str.charAt(9);
            int extraCache3 = str2.charAt(9);
            if (i4 != extraCache3) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[5] = "FM5srU9o6TBj8QlSYYqmaX9MZyJMPTMr";
            strArr2[3] = "mnADOFh1HT7Eu0tfTP5EsiAEmob0QgOc";
            if (size > i3) {
                A07(i2);
            } else {
                return;
            }
        }
    }

    public final void A0P() {
        this.A05.clear();
        A06();
    }

    public final void A0Q(int i) {
        this.A03 = i;
        A0O();
    }

    public final void A0R(View view) {
        AbstractC0700Qg A0F = C02006g.A0F(view);
        A0F.A0F = null;
        A0F.A0G = false;
        A0F.A0U();
        A0X(A0F);
    }

    public final void A0S(View view) {
        AbstractC0700Qg A0F = C02006g.A0F(view);
        if (A0F.A0o(12) || !A0F.A0j() || this.A08.A1y(A0F)) {
            if (!A0F.A0f() || A0F.A0g() || this.A08.A04.A0M()) {
                A0F.A0b(this, false);
                this.A05.add(A0F);
                return;
            }
            throw new IllegalArgumentException(A04(43, 122, 48) + this.A08.A1J());
        }
        if (this.A02 == null) {
            this.A02 = new ArrayList<>();
        }
        A0F.A0b(this, true);
        this.A02.add(A0F);
    }

    public final void A0T(View view) {
        AbstractC0700Qg A0F = C02006g.A0F(view);
        if (A0F.A0i()) {
            this.A08.removeDetachedView(view, false);
        }
        if (A0F.A0h()) {
            A0F.A0Y();
        } else if (A0F.A0m()) {
            A0F.A0U();
        }
        A0X(A0F);
    }

    public final void A0U(QC qc, QC qc2, boolean z) {
        A0P();
        A0H().A08(qc, qc2, z);
    }

    public final void A0V(QV qv) {
        if (this.A01 != null) {
            this.A01.A04();
        }
        this.A01 = qv;
        if (qv != null) {
            QV qv2 = this.A01;
            QC adapter = this.A08.getAdapter();
            String[] strArr = A0A;
            if (strArr[2].length() != strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[4] = "lsZK0accpgBQgJYjkQv5Abfcayw6pcR0";
            strArr2[1] = "Z7g3Rn3k4gV3vNYe90sCMa52PcoBzFf1";
            qv2.A07(adapter);
        }
    }

    public final void A0W(AbstractC0698Qe abstractC0698Qe) {
        this.A04 = abstractC0698Qe;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00aa, code lost:
    
        if (r0 != false) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A0X(AbstractC0700Qg abstractC0700Qg) {
        boolean A0F;
        boolean transientStatePreventsRecycling;
        int targetCacheIndex;
        boolean transientStatePreventsRecycling2;
        if (abstractC0700Qg.A0h() || abstractC0700Qg.A0H.getParent() != null) {
            throw new IllegalArgumentException(A04(293, 56, 75) + abstractC0700Qg.A0h() + A04(0, 12, 91) + (abstractC0700Qg.A0H.getParent() != null) + this.A08.A1J());
        }
        boolean A0i = abstractC0700Qg.A0i();
        String[] strArr = A0A;
        if (strArr[4].charAt(14) == strArr[1].charAt(14)) {
            String[] strArr2 = A0A;
            strArr2[2] = "XmVzY8sdohxIZJ5Ojk7HGi6GVO";
            strArr2[6] = "m3xjIJQIi7Ro4dRZ8OgPCgQ0SJ";
            if (!A0i) {
                if (abstractC0700Qg.A0l()) {
                    throw new IllegalArgumentException(A04(430, 110, 9) + this.A08.A1J());
                }
                A0F = abstractC0700Qg.A0F();
                if (this.A08.A04 != null && A0F) {
                    boolean transientStatePreventsRecycling3 = this.A08.A04.A0N(abstractC0700Qg);
                    if (transientStatePreventsRecycling3) {
                        transientStatePreventsRecycling = true;
                        targetCacheIndex = 0;
                        boolean z = false;
                        if (!transientStatePreventsRecycling) {
                            boolean transientStatePreventsRecycling4 = abstractC0700Qg.A0n();
                        }
                        if (this.A00 > 0) {
                            boolean transientStatePreventsRecycling5 = abstractC0700Qg.A0o(526);
                            if (!transientStatePreventsRecycling5) {
                                int size = this.A06.size();
                                if (size >= this.A00 && size > 0) {
                                    A07(0);
                                    size--;
                                }
                                String[] strArr3 = A0A;
                                if (strArr3[5].charAt(9) == strArr3[3].charAt(9)) {
                                    String[] strArr4 = A0A;
                                    strArr4[4] = "Q1OZT6LnkVYbRcYxNkw6Mn7gWXto99yC";
                                    strArr4[1] = "RVxEgLz70808ymY8dF1xTnmhZlFYlEUe";
                                    transientStatePreventsRecycling2 = C02006g.A1E;
                                    if (transientStatePreventsRecycling2 && size > 0) {
                                        boolean transientStatePreventsRecycling6 = this.A08.A02.A05(abstractC0700Qg.A03);
                                        if (!transientStatePreventsRecycling6) {
                                            int i = size - 1;
                                            while (i >= 0) {
                                                boolean transientStatePreventsRecycling7 = this.A08.A02.A05(this.A06.get(i).A03);
                                                if (!transientStatePreventsRecycling7) {
                                                    break;
                                                } else {
                                                    i--;
                                                }
                                            }
                                            size = i + 1;
                                        }
                                    }
                                    this.A06.add(size, abstractC0700Qg);
                                    targetCacheIndex = 1;
                                }
                            }
                        }
                        if (targetCacheIndex == 0) {
                            A0Z(abstractC0700Qg, true);
                            z = true;
                        }
                        this.A08.A0t.A0B(abstractC0700Qg);
                        if (targetCacheIndex != 0 && !z && A0F) {
                            abstractC0700Qg.A08 = null;
                            return;
                        }
                        return;
                    }
                }
                transientStatePreventsRecycling = false;
                targetCacheIndex = 0;
                boolean z2 = false;
                if (!transientStatePreventsRecycling) {
                }
                if (this.A00 > 0) {
                }
                if (targetCacheIndex == 0) {
                }
                this.A08.A0t.A0B(abstractC0700Qg);
                if (targetCacheIndex != 0) {
                    return;
                } else {
                    return;
                }
            }
            throw new IllegalArgumentException(A04(349, 81, 50) + abstractC0700Qg + this.A08.A1J());
        }
        throw new RuntimeException();
    }

    public final void A0Y(AbstractC0700Qg abstractC0700Qg) {
        boolean z;
        z = abstractC0700Qg.A0G;
        if (z) {
            ArrayList<AbstractC0700Qg> arrayList = this.A02;
            String[] strArr = A0A;
            if (strArr[7].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[2] = "g9dUUHlnr2dNWy2bvXbXpUnxFV";
            strArr2[6] = "1VljHDZyW4yQ7QRXruVc6WBcEp";
            arrayList.remove(abstractC0700Qg);
        } else {
            this.A05.remove(abstractC0700Qg);
        }
        abstractC0700Qg.A0F = null;
        abstractC0700Qg.A0G = false;
        abstractC0700Qg.A0U();
    }

    public final void A0Z(AbstractC0700Qg abstractC0700Qg, boolean z) {
        C02006g.A0s(abstractC0700Qg);
        if (abstractC0700Qg.A0o(16384)) {
            abstractC0700Qg.A0a(0, 16384);
            P3.A0B(abstractC0700Qg.A0H, null);
        }
        if (z) {
            A0B(abstractC0700Qg);
        }
        abstractC0700Qg.A08 = null;
        A0H().A09(abstractC0700Qg);
    }
}
