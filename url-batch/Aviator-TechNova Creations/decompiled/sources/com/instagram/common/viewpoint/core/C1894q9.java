package com.instagram.common.viewpoint.core;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: com.facebook.ads.redexgen.X.q9, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1894q9 extends AbstractList<Integer> implements RandomAccess, Serializable {
    public static byte[] A03;
    public static String[] A04 = {"YU1VDkaJfx0npt5ZCy0wfRWqTvB0gzrf", "HnEPzK", "p4nBQ52ikpMWjKifemE03jhF", "yEe4449S5FSBazETcjdBTZewZPLdBAWq", "Xlyhv", "2ScPcgGnYkk5iwJP9xeXeJNhXWw9hNmB", "BfGEj8ajDZOUDr9MhSeGOx8aXIdVpKot", "7ounehwY5pAPt7bmg9fcb1FAHFBm19vl"};
    public static final long serialVersionUID = 0;
    public final int A00;
    public final int A01;
    public final int[] A02;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 102);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A03 = new byte[]{-87, -99};
    }

    static {
        A03();
    }

    public C1894q9(int[] array) {
        this(array, 0, array.length);
    }

    public C1894q9(int[] array, int start, int end) {
        this.A02 = array;
        this.A01 = start;
        this.A00 = end;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.AbstractList, java.util.List
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final Integer get(int index) {
        AbstractC1501jA.A00(index, size());
        return Integer.valueOf(this.A02[this.A01 + index]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.AbstractList, java.util.List
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final Integer set(int index, Integer element) {
        AbstractC1501jA.A00(index, size());
        int i = this.A02[this.A01 + index];
        int[] iArr = this.A02;
        int i2 = this.A01 + index;
        int oldValue = ((Integer) AbstractC1501jA.A04(element)).intValue();
        iArr[i2] = oldValue;
        return Integer.valueOf(i);
    }

    public final int[] A04() {
        return Arrays.copyOfRange(this.A02, this.A01, this.A00);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(@CheckForNull Object target) {
        int A05;
        if (target instanceof Integer) {
            A05 = AD.A05(this.A02, ((Integer) target).intValue(), this.A01, this.A00);
            if (A05 != -1) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(@CheckForNull Object object) {
        if (object == this) {
            return true;
        }
        boolean z = object instanceof C1894q9;
        if (A04[2].length() != 24) {
            throw new RuntimeException();
        }
        A04[2] = "hkNtVJfoNZugUfjtOIkeX8Ri";
        if (z) {
            C1894q9 c1894q9 = (C1894q9) object;
            int size = size();
            if (c1894q9.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                int size2 = this.A02[this.A01 + i];
                if (size2 != c1894q9.A02[c1894q9.A01 + i]) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(object);
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0005 */
    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int hashCode() {
        int i = 1;
        for (int i2 = this.A01; i2 < result; i2++) {
            int result = this.A02[i2];
            i = (i * 31) + AD.A00(result);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(@CheckForNull Object target) {
        int i;
        if (target instanceof Integer) {
            int[] iArr = this.A02;
            String[] strArr = A04;
            if (strArr[6].charAt(15) == strArr[5].charAt(15)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[6] = "lB9Ee3UdEb1Lo8jQSlnhxnRY63rogU68";
            strArr2[5] = "23HXI0mrZUyV0MEjy70kUSUiY9qLKHl0";
            i = AD.A05(iArr, ((Integer) target).intValue(), this.A01, this.A00);
            if (i >= 0) {
                return i - this.A01;
            }
            return -1;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0004, code lost:
    
        r1 = com.instagram.common.viewpoint.core.AD.A06(r4.A02, ((java.lang.Integer) r5).intValue(), r4.A01, r4.A00);
     */
    @Override // java.util.AbstractList, java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int lastIndexOf(@CheckForNull Object target) {
        int A06;
        if ((target instanceof Integer) && A06 >= 0) {
            int i = this.A01;
            return A06 - i;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.A00 - this.A01;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List<Integer> subList(int fromIndex, int toIndex) {
        int size = size();
        AbstractC1501jA.A0B(fromIndex, toIndex, size);
        if (fromIndex == toIndex) {
            return Collections.emptyList();
        }
        return new C1894q9(this.A02, this.A01 + fromIndex, this.A01 + toIndex);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb = new StringBuilder(size() * 5);
        sb.append(AbstractJsonLexerKt.BEGIN_LIST).append(this.A02[this.A01]);
        for (int i = this.A01 + 1; i < this.A00; i++) {
            sb.append(A02(0, 2, 23)).append(this.A02[i]);
        }
        StringBuilder builder = sb.append(AbstractJsonLexerKt.END_LIST);
        return builder.toString();
    }
}
