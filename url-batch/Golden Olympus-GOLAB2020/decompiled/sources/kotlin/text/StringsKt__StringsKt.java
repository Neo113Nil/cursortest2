package kotlin.text;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.AbstractC3219i;
import kotlin.collections.CollectionsKt;
import kotlin.collections.E;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata
/* loaded from: classes3.dex */
public class StringsKt__StringsKt extends n {

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ char[] f41257i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f41258j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(char[] cArr, boolean z4) {
            super(2);
            this.f41257i = cArr;
            this.f41258j = z4;
        }

        @Nullable
        public final Pair<Integer, Integer> a(@NotNull CharSequence $receiver, int i4) {
            Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
            int d02 = StringsKt__StringsKt.d0($receiver, this.f41257i, i4, this.f41258j);
            if (d02 < 0) {
                return null;
            }
            return TuplesKt.to(Integer.valueOf(d02), 1);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((CharSequence) obj, ((Number) obj2).intValue());
        }
    }

    static final class b extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ List f41259i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f41260j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(List list, boolean z4) {
            super(2);
            this.f41259i = list;
            this.f41260j = z4;
        }

        @Nullable
        public final Pair<Integer, Integer> a(@NotNull CharSequence $receiver, int i4) {
            Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
            Pair U3 = StringsKt__StringsKt.U($receiver, this.f41259i, i4, this.f41260j, false);
            if (U3 != null) {
                return TuplesKt.to(U3.getFirst(), Integer.valueOf(((String) U3.getSecond()).length()));
            }
            return null;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((CharSequence) obj, ((Number) obj2).intValue());
        }
    }

    static final class c extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ CharSequence f41261i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(CharSequence charSequence) {
            super(1);
            this.f41261i = charSequence;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull IntRange it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return StringsKt__StringsKt.K0(this.f41261i, it);
        }
    }

    public static final List A0(CharSequence charSequence, char[] delimiters, boolean z4, int i4) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        if (delimiters.length == 1) {
            return C0(charSequence, String.valueOf(delimiters[0]), z4, i4);
        }
        Iterable l4 = kotlin.sequences.k.l(s0(charSequence, delimiters, 0, z4, i4, 2, null));
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(l4, 10));
        Iterator it = l4.iterator();
        while (it.hasNext()) {
            arrayList.add(K0(charSequence, (IntRange) it.next()));
        }
        return arrayList;
    }

    public static final List B0(CharSequence charSequence, String[] delimiters, boolean z4, int i4) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        if (delimiters.length == 1) {
            String str = delimiters[0];
            if (str.length() != 0) {
                return C0(charSequence, str, z4, i4);
            }
        }
        Iterable l4 = kotlin.sequences.k.l(t0(charSequence, delimiters, 0, z4, i4, 2, null));
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(l4, 10));
        Iterator it = l4.iterator();
        while (it.hasNext()) {
            arrayList.add(K0(charSequence, (IntRange) it.next()));
        }
        return arrayList;
    }

    private static final List C0(CharSequence charSequence, String str, boolean z4, int i4) {
        z0(i4);
        int i5 = 0;
        int Y3 = Y(charSequence, str, 0, z4);
        if (Y3 == -1 || i4 == 1) {
            return CollectionsKt.listOf(charSequence.toString());
        }
        boolean z5 = i4 > 0;
        ArrayList arrayList = new ArrayList(z5 ? kotlin.ranges.g.g(i4, 10) : 10);
        do {
            arrayList.add(charSequence.subSequence(i5, Y3).toString());
            i5 = str.length() + Y3;
            if (z5 && arrayList.size() == i4 - 1) {
                break;
            }
            Y3 = Y(charSequence, str, i5, z4);
        } while (Y3 != -1);
        arrayList.add(charSequence.subSequence(i5, charSequence.length()).toString());
        return arrayList;
    }

    public static /* synthetic */ List D0(CharSequence charSequence, char[] cArr, boolean z4, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            z4 = false;
        }
        if ((i5 & 4) != 0) {
            i4 = 0;
        }
        return A0(charSequence, cArr, z4, i4);
    }

    public static final Sequence E0(CharSequence charSequence, String[] delimiters, boolean z4, int i4) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        return kotlin.sequences.k.y(t0(charSequence, delimiters, 0, z4, i4, 2, null), new c(charSequence));
    }

    public static /* synthetic */ Sequence F0(CharSequence charSequence, String[] strArr, boolean z4, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            z4 = false;
        }
        if ((i5 & 4) != 0) {
            i4 = 0;
        }
        return E0(charSequence, strArr, z4, i4);
    }

    public static final boolean G0(CharSequence charSequence, char c4, boolean z4) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return charSequence.length() > 0 && kotlin.text.a.e(charSequence.charAt(0), c4, z4);
    }

    public static final boolean H0(CharSequence charSequence, CharSequence prefix, boolean z4) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return (!z4 && (charSequence instanceof String) && (prefix instanceof String)) ? n.K((String) charSequence, (String) prefix, false, 2, null) : u0(charSequence, 0, prefix, 0, prefix.length(), z4);
    }

    public static /* synthetic */ boolean I0(CharSequence charSequence, char c4, boolean z4, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z4 = false;
        }
        return G0(charSequence, c4, z4);
    }

    public static /* synthetic */ boolean J0(CharSequence charSequence, CharSequence charSequence2, boolean z4, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z4 = false;
        }
        return H0(charSequence, charSequence2, z4);
    }

    public static final String K0(CharSequence charSequence, IntRange range) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        return charSequence.subSequence(range.l().intValue(), range.k().intValue() + 1).toString();
    }

    public static final String L0(String str, char c4, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int b02 = b0(str, c4, 0, false, 6, null);
        if (b02 == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(b02 + 1, str.length());
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public static final boolean M(CharSequence charSequence, char c4, boolean z4) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return b0(charSequence, c4, 0, z4, 2, null) >= 0;
    }

    public static String M0(String str, String delimiter, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int c02 = c0(str, delimiter, 0, false, 6, null);
        if (c02 == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(c02 + delimiter.length(), str.length());
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public static boolean N(CharSequence charSequence, CharSequence other, boolean z4) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return other instanceof String ? c0(charSequence, (String) other, 0, z4, 2, null) >= 0 : a0(charSequence, other, 0, charSequence.length(), z4, false, 16, null) >= 0;
    }

    public static /* synthetic */ String N0(String str, char c4, String str2, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            str2 = str;
        }
        return L0(str, c4, str2);
    }

    public static /* synthetic */ boolean O(CharSequence charSequence, char c4, boolean z4, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z4 = false;
        }
        return M(charSequence, c4, z4);
    }

    public static /* synthetic */ String O0(String str, String str2, String str3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            str3 = str;
        }
        return M0(str, str2, str3);
    }

    public static /* synthetic */ boolean P(CharSequence charSequence, CharSequence charSequence2, boolean z4, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z4 = false;
        }
        return N(charSequence, charSequence2, z4);
    }

    public static final String P0(String str, char c4, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int g02 = g0(str, c4, 0, false, 6, null);
        if (g02 == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(g02 + 1, str.length());
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public static final boolean Q(CharSequence charSequence, char c4, boolean z4) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return charSequence.length() > 0 && kotlin.text.a.e(charSequence.charAt(W(charSequence)), c4, z4);
    }

    public static final String Q0(String str, String delimiter, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int h02 = h0(str, delimiter, 0, false, 6, null);
        if (h02 == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(h02 + delimiter.length(), str.length());
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public static final boolean R(CharSequence charSequence, CharSequence suffix, boolean z4) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        return (!z4 && (charSequence instanceof String) && (suffix instanceof String)) ? n.v((String) charSequence, (String) suffix, false, 2, null) : u0(charSequence, charSequence.length() - suffix.length(), suffix, 0, suffix.length(), z4);
    }

    public static /* synthetic */ String R0(String str, char c4, String str2, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            str2 = str;
        }
        return P0(str, c4, str2);
    }

    public static /* synthetic */ boolean S(CharSequence charSequence, char c4, boolean z4, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z4 = false;
        }
        return Q(charSequence, c4, z4);
    }

    public static /* synthetic */ String S0(String str, String str2, String str3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            str3 = str;
        }
        return Q0(str, str2, str3);
    }

    public static /* synthetic */ boolean T(CharSequence charSequence, CharSequence charSequence2, boolean z4, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z4 = false;
        }
        return R(charSequence, charSequence2, z4);
    }

    public static String T0(String str, String delimiter, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int c02 = c0(str, delimiter, 0, false, 6, null);
        if (c02 == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(0, c02);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair U(CharSequence charSequence, Collection collection, int i4, boolean z4, boolean z5) {
        CharSequence charSequence2;
        Object obj;
        boolean z6;
        Object obj2;
        if (!z4 && collection.size() == 1) {
            String str = (String) CollectionsKt.single(collection);
            int c02 = !z5 ? c0(charSequence, str, i4, false, 4, null) : h0(charSequence, str, i4, false, 4, null);
            if (c02 < 0) {
                return null;
            }
            return TuplesKt.to(Integer.valueOf(c02), str);
        }
        CharSequence charSequence3 = charSequence;
        kotlin.ranges.d intRange = !z5 ? new IntRange(kotlin.ranges.g.d(i4, 0), charSequence3.length()) : kotlin.ranges.g.m(kotlin.ranges.g.g(i4, W(charSequence3)), 0);
        if (charSequence3 instanceof String) {
            int b4 = intRange.b();
            int d4 = intRange.d();
            int e4 = intRange.e();
            if ((e4 > 0 && b4 <= d4) || (e4 < 0 && d4 <= b4)) {
                int i5 = b4;
                while (true) {
                    Iterator it = collection.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z6 = z4;
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        String str2 = (String) obj2;
                        z6 = z4;
                        if (n.A(str2, 0, (String) charSequence3, i5, str2.length(), z6)) {
                            break;
                        }
                        z4 = z6;
                    }
                    String str3 = (String) obj2;
                    if (str3 == null) {
                        if (i5 == d4) {
                            break;
                        }
                        i5 += e4;
                        z4 = z6;
                    } else {
                        return TuplesKt.to(Integer.valueOf(i5), str3);
                    }
                }
            }
        } else {
            boolean z7 = z4;
            int b5 = intRange.b();
            int d5 = intRange.d();
            int e5 = intRange.e();
            if ((e5 > 0 && b5 <= d5) || (e5 < 0 && d5 <= b5)) {
                int i6 = b5;
                while (true) {
                    Iterator it2 = collection.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            charSequence2 = charSequence3;
                            obj = null;
                            break;
                        }
                        obj = it2.next();
                        String str4 = (String) obj;
                        boolean z8 = z7;
                        charSequence2 = charSequence3;
                        z7 = z8;
                        if (u0(str4, 0, charSequence2, i6, str4.length(), z8)) {
                            break;
                        }
                        charSequence3 = charSequence2;
                    }
                    String str5 = (String) obj;
                    if (str5 == null) {
                        if (i6 == d5) {
                            break;
                        }
                        i6 += e5;
                        charSequence3 = charSequence2;
                    } else {
                        return TuplesKt.to(Integer.valueOf(i6), str5);
                    }
                }
            }
        }
        return null;
    }

    public static /* synthetic */ String U0(String str, String str2, String str3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            str3 = str;
        }
        return T0(str, str2, str3);
    }

    public static final IntRange V(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return new IntRange(0, charSequence.length() - 1);
    }

    public static Boolean V0(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (Intrinsics.areEqual(str, com.ironsource.mediationsdk.metadata.a.f17681g)) {
            return Boolean.TRUE;
        }
        if (Intrinsics.areEqual(str, "false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static int W(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static CharSequence W0(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i4 = 0;
        boolean z4 = false;
        while (i4 <= length) {
            boolean b4 = CharsKt__CharJVMKt.b(charSequence.charAt(!z4 ? i4 : length));
            if (z4) {
                if (!b4) {
                    break;
                }
                length--;
            } else if (b4) {
                i4++;
            } else {
                z4 = true;
            }
        }
        return charSequence.subSequence(i4, length + 1);
    }

    public static final int X(CharSequence charSequence, char c4, int i4, boolean z4) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return (z4 || !(charSequence instanceof String)) ? d0(charSequence, new char[]{c4}, i4, z4) : ((String) charSequence).indexOf(c4, i4);
    }

    public static CharSequence X0(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length() - 1;
        if (length < 0) {
            return "";
        }
        while (true) {
            int i4 = length - 1;
            if (!CharsKt__CharJVMKt.b(charSequence.charAt(length))) {
                return charSequence.subSequence(0, length + 1);
            }
            if (i4 < 0) {
                return "";
            }
            length = i4;
        }
    }

    public static final int Y(CharSequence charSequence, String string, int i4, boolean z4) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(string, "string");
        return (z4 || !(charSequence instanceof String)) ? a0(charSequence, string, i4, charSequence.length(), z4, false, 16, null) : ((String) charSequence).indexOf(string, i4);
    }

    public static String Y0(String str, char... chars) {
        CharSequence charSequence;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        int length = str.length() - 1;
        if (length >= 0) {
            while (true) {
                int i4 = length - 1;
                if (!AbstractC3219i.x(chars, str.charAt(length))) {
                    charSequence = str.subSequence(0, length + 1);
                    break;
                }
                if (i4 < 0) {
                    break;
                }
                length = i4;
            }
            return charSequence.toString();
        }
        charSequence = "";
        return charSequence.toString();
    }

    private static final int Z(CharSequence charSequence, CharSequence charSequence2, int i4, int i5, boolean z4, boolean z5) {
        kotlin.ranges.d intRange = !z5 ? new IntRange(kotlin.ranges.g.d(i4, 0), kotlin.ranges.g.g(i5, charSequence.length())) : kotlin.ranges.g.m(kotlin.ranges.g.g(i4, W(charSequence)), kotlin.ranges.g.d(i5, 0));
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int b4 = intRange.b();
            int d4 = intRange.d();
            int e4 = intRange.e();
            if ((e4 <= 0 || b4 > d4) && (e4 >= 0 || d4 > b4)) {
                return -1;
            }
            int i6 = b4;
            while (true) {
                boolean z6 = z4;
                if (n.A((String) charSequence2, 0, (String) charSequence, i6, charSequence2.length(), z6)) {
                    return i6;
                }
                if (i6 == d4) {
                    return -1;
                }
                i6 += e4;
                z4 = z6;
            }
        } else {
            boolean z7 = z4;
            int b5 = intRange.b();
            int d5 = intRange.d();
            int e5 = intRange.e();
            if ((e5 <= 0 || b5 > d5) && (e5 >= 0 || d5 > b5)) {
                return -1;
            }
            int i7 = b5;
            while (true) {
                boolean z8 = z7;
                CharSequence charSequence3 = charSequence;
                CharSequence charSequence4 = charSequence2;
                z7 = z8;
                if (u0(charSequence4, 0, charSequence3, i7, charSequence2.length(), z8)) {
                    return i7;
                }
                if (i7 == d5) {
                    return -1;
                }
                i7 += e5;
                charSequence2 = charSequence4;
                charSequence = charSequence3;
            }
        }
    }

    public static CharSequence Z0(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length();
        for (int i4 = 0; i4 < length; i4++) {
            if (!CharsKt__CharJVMKt.b(charSequence.charAt(i4))) {
                return charSequence.subSequence(i4, charSequence.length());
            }
        }
        return "";
    }

    static /* synthetic */ int a0(CharSequence charSequence, CharSequence charSequence2, int i4, int i5, boolean z4, boolean z5, int i6, Object obj) {
        if ((i6 & 16) != 0) {
            z5 = false;
        }
        return Z(charSequence, charSequence2, i4, i5, z4, z5);
    }

    public static /* synthetic */ int b0(CharSequence charSequence, char c4, int i4, boolean z4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = 0;
        }
        if ((i5 & 4) != 0) {
            z4 = false;
        }
        return X(charSequence, c4, i4, z4);
    }

    public static /* synthetic */ int c0(CharSequence charSequence, String str, int i4, boolean z4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = 0;
        }
        if ((i5 & 4) != 0) {
            z4 = false;
        }
        return Y(charSequence, str, i4, z4);
    }

    public static final int d0(CharSequence charSequence, char[] chars, int i4, boolean z4) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        if (!z4 && chars.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(AbstractC3219i.t0(chars), i4);
        }
        E it = new IntRange(kotlin.ranges.g.d(i4, 0), W(charSequence)).iterator();
        while (it.hasNext()) {
            int a4 = it.a();
            char charAt = charSequence.charAt(a4);
            for (char c4 : chars) {
                if (kotlin.text.a.e(c4, charAt, z4)) {
                    return a4;
                }
            }
        }
        return -1;
    }

    public static final int e0(CharSequence charSequence, char c4, int i4, boolean z4) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return (z4 || !(charSequence instanceof String)) ? i0(charSequence, new char[]{c4}, i4, z4) : ((String) charSequence).lastIndexOf(c4, i4);
    }

    public static final int f0(CharSequence charSequence, String string, int i4, boolean z4) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(string, "string");
        return (z4 || !(charSequence instanceof String)) ? Z(charSequence, string, i4, 0, z4, true) : ((String) charSequence).lastIndexOf(string, i4);
    }

    public static /* synthetic */ int g0(CharSequence charSequence, char c4, int i4, boolean z4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = W(charSequence);
        }
        if ((i5 & 4) != 0) {
            z4 = false;
        }
        return e0(charSequence, c4, i4, z4);
    }

    public static /* synthetic */ int h0(CharSequence charSequence, String str, int i4, boolean z4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = W(charSequence);
        }
        if ((i5 & 4) != 0) {
            z4 = false;
        }
        return f0(charSequence, str, i4, z4);
    }

    public static final int i0(CharSequence charSequence, char[] chars, int i4, boolean z4) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        if (!z4 && chars.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(AbstractC3219i.t0(chars), i4);
        }
        for (int g4 = kotlin.ranges.g.g(i4, W(charSequence)); -1 < g4; g4--) {
            char charAt = charSequence.charAt(g4);
            for (char c4 : chars) {
                if (kotlin.text.a.e(c4, charAt, z4)) {
                    return g4;
                }
            }
        }
        return -1;
    }

    public static final Sequence j0(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return F0(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0, 6, null);
    }

    public static final List k0(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return kotlin.sequences.k.D(j0(charSequence));
    }

    public static final CharSequence l0(CharSequence charSequence, int i4, char c4) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (i4 < 0) {
            throw new IllegalArgumentException("Desired length " + i4 + " is less than zero.");
        }
        if (i4 <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb = new StringBuilder(i4);
        sb.append(charSequence);
        E it = new IntRange(1, i4 - charSequence.length()).iterator();
        while (it.hasNext()) {
            it.a();
            sb.append(c4);
        }
        return sb;
    }

    public static final String m0(String str, int i4, char c4) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return l0(str, i4, c4).toString();
    }

    public static /* synthetic */ String n0(String str, int i4, char c4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            c4 = ' ';
        }
        return m0(str, i4, c4);
    }

    public static final CharSequence o0(CharSequence charSequence, int i4, char c4) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (i4 < 0) {
            throw new IllegalArgumentException("Desired length " + i4 + " is less than zero.");
        }
        if (i4 <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb = new StringBuilder(i4);
        E it = new IntRange(1, i4 - charSequence.length()).iterator();
        while (it.hasNext()) {
            it.a();
            sb.append(c4);
        }
        sb.append(charSequence);
        return sb;
    }

    public static String p0(String str, int i4, char c4) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return o0(str, i4, c4).toString();
    }

    private static final Sequence q0(CharSequence charSequence, char[] cArr, int i4, boolean z4, int i5) {
        z0(i5);
        return new kotlin.text.b(charSequence, i4, i5, new a(cArr, z4));
    }

    private static final Sequence r0(CharSequence charSequence, String[] strArr, int i4, boolean z4, int i5) {
        z0(i5);
        return new kotlin.text.b(charSequence, i4, i5, new b(AbstractC3219i.e(strArr), z4));
    }

    static /* synthetic */ Sequence s0(CharSequence charSequence, char[] cArr, int i4, boolean z4, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i4 = 0;
        }
        if ((i6 & 4) != 0) {
            z4 = false;
        }
        if ((i6 & 8) != 0) {
            i5 = 0;
        }
        return q0(charSequence, cArr, i4, z4, i5);
    }

    public static /* synthetic */ List split$default(CharSequence charSequence, String[] strArr, boolean z4, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            z4 = false;
        }
        if ((i5 & 4) != 0) {
            i4 = 0;
        }
        return B0(charSequence, strArr, z4, i4);
    }

    static /* synthetic */ Sequence t0(CharSequence charSequence, String[] strArr, int i4, boolean z4, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i4 = 0;
        }
        if ((i6 & 4) != 0) {
            z4 = false;
        }
        if ((i6 & 8) != 0) {
            i5 = 0;
        }
        return r0(charSequence, strArr, i4, z4, i5);
    }

    public static final boolean u0(CharSequence charSequence, int i4, CharSequence other, int i5, int i6, boolean z4) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (i5 < 0 || i4 < 0 || i4 > charSequence.length() - i6 || i5 > other.length() - i6) {
            return false;
        }
        for (int i7 = 0; i7 < i6; i7++) {
            if (!kotlin.text.a.e(charSequence.charAt(i4 + i7), other.charAt(i5 + i7), z4)) {
                return false;
            }
        }
        return true;
    }

    public static String v0(String str, CharSequence prefix) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        if (!J0(str, prefix, false, 2, null)) {
            return str;
        }
        String substring = str.substring(prefix.length());
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public static String w0(String str, CharSequence suffix) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        if (!T(str, suffix, false, 2, null)) {
            return str;
        }
        String substring = str.substring(0, str.length() - suffix.length());
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public static String x0(String str, CharSequence delimiter) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        return y0(str, delimiter, delimiter);
    }

    public static final String y0(String str, CharSequence prefix, CharSequence suffix) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        if (str.length() < prefix.length() + suffix.length() || !J0(str, prefix, false, 2, null) || !T(str, suffix, false, 2, null)) {
            return str;
        }
        String substring = str.substring(prefix.length(), str.length() - suffix.length());
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public static final void z0(int i4) {
        if (i4 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i4).toString());
    }
}
