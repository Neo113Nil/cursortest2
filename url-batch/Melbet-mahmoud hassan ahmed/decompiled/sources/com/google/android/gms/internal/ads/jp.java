package com.google.android.gms.internal.ads;

import java.util.PriorityQueue;

/* loaded from: classes.dex */
public final class jp {
    static long a(long j7, int i7) {
        if (i7 == 1) {
            return j7;
        }
        return ((i7 & 1) == 0 ? a((j7 * j7) % 1073807359, i7 >> 1) : j7 * (a((j7 * j7) % 1073807359, i7 >> 1) % 1073807359)) % 1073807359;
    }

    static String b(String[] strArr, int i7, int i8) {
        int i9 = i8 + i7;
        if (strArr.length < i9) {
            io0.d("Unable to construct shingle");
            return "";
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i10 = i9 - 1;
            if (i7 >= i10) {
                sb.append(strArr[i10]);
                return sb.toString();
            }
            sb.append(strArr[i7]);
            sb.append(' ');
            i7++;
        }
    }

    public static void c(String[] strArr, int i7, int i8, PriorityQueue<ip> priorityQueue) {
        int length = strArr.length;
        if (length < 6) {
            d(i7, e(strArr, 0, length), b(strArr, 0, length), length, priorityQueue);
            return;
        }
        long e7 = e(strArr, 0, 6);
        d(i7, e7, b(strArr, 0, 6), 6, priorityQueue);
        long a7 = a(16785407L, 5);
        int i9 = 1;
        while (true) {
            int length2 = strArr.length;
            if (i9 >= length2 - 5) {
                return;
            }
            e7 = ((((((e7 + 1073807359) - ((((fp.a(strArr[i9 - 1]) + 2147483647L) % 1073807359) * a7) % 1073807359)) % 1073807359) * 16785407) % 1073807359) + ((fp.a(strArr[i9 + 5]) + 2147483647L) % 1073807359)) % 1073807359;
            d(i7, e7, b(strArr, i9, 6), length2, priorityQueue);
            i9++;
        }
    }

    static void d(int i7, long j7, String str, int i8, PriorityQueue<ip> priorityQueue) {
        ip ipVar = new ip(j7, str, i8);
        if ((priorityQueue.size() != i7 || (priorityQueue.peek().f6733c <= ipVar.f6733c && priorityQueue.peek().f6731a <= ipVar.f6731a)) && !priorityQueue.contains(ipVar)) {
            priorityQueue.add(ipVar);
            if (priorityQueue.size() > i7) {
                priorityQueue.poll();
            }
        }
    }

    private static long e(String[] strArr, int i7, int i8) {
        long a7 = (fp.a(strArr[0]) + 2147483647L) % 1073807359;
        for (int i9 = 1; i9 < i8; i9++) {
            a7 = (((a7 * 16785407) % 1073807359) + ((fp.a(strArr[i9]) + 2147483647L) % 1073807359)) % 1073807359;
        }
        return a7;
    }
}
