package com.instagram.common.viewpoint.core;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.facebook.ads.redexgen.X.Kj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1029Kj {
    public static byte[] A04;
    public static String[] A05 = {"Tlnn5cKjLaIjRpnStB3TtMXpCr", "3ektkjDKhO", "UADsPGxQMgbdHUVZTw2T7TudB6ybNpUs", "wMkteQxfp4DsqI2DXiVAWfh1RT3", "vTGkM2prP14EX1TDx6P9XqiD0Fmww", "sal8paYv5RRrD9uY6TWNX8GISo", "qTpYd1bjPJIA7eigqjtgMToqdlzi", "UsOSpCey7qyyyJdYXs2GK2q4qSEth0kx"};
    public final int A00;
    public final String A01;
    public final String A02;
    public final Set<String> A03;

    public static String A02(int i, int i4, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i4);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ 58);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A04 = new byte[]{2, 73, 59};
        if (A05[2].charAt(0) == 'K') {
            throw new RuntimeException();
        }
        String[] strArr = A05;
        strArr[6] = "WMYi1W8Xbtf0WzjxHgJrZE6ARrtq";
        strArr[1] = "r4jVis15Qe";
    }

    static {
        A03();
    }

    public C1029Kj(String str, int i, String str2, Set<String> classes) {
        this.A00 = i;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = classes;
    }

    public static C1029Kj A00() {
        Set emptySet = Collections.emptySet();
        String A02 = A02(0, 0, 5);
        return new C1029Kj(A02, 0, A02, emptySet);
    }

    /* JADX WARN: Incorrect condition in loop: B:6:0x0039 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C1029Kj A01(String str, int i) {
        String trim;
        String trim2 = str.trim();
        AbstractC06233y.A07(!trim2.isEmpty());
        int indexOf = trim2.indexOf(A02(0, 1, 24));
        if (indexOf == -1) {
            trim = A02(0, 0, 5);
        } else {
            trim = trim2.substring(indexOf).trim();
            trim2 = trim2.substring(0, indexOf);
        }
        String[] A1O = C5C.A1O(trim2, A02(1, 2, 47));
        String str2 = A1O[0];
        HashSet hashSet = new HashSet();
        for (int i4 = 1; i4 < voiceStartIndex; i4++) {
            hashSet.add(A1O[i4]);
        }
        return new C1029Kj(str2, i, trim, hashSet);
    }
}
