package kotlin.text;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class h extends g {

    static final class a extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f41279i = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull String line) {
            Intrinsics.checkNotNullParameter(line, "line");
            return line;
        }
    }

    static final class b extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ String f41280i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(1);
            this.f41280i = str;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull String line) {
            Intrinsics.checkNotNullParameter(line, "line");
            return this.f41280i + line;
        }
    }

    private static final Function1 b(String str) {
        return str.length() == 0 ? a.f41279i : new b(str);
    }

    private static final int c(String str) {
        int length = str.length();
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                i4 = -1;
                break;
            }
            if (!CharsKt__CharJVMKt.b(str.charAt(i4))) {
                break;
            }
            i4++;
        }
        return i4 == -1 ? str.length() : i4;
    }

    public static final String d(String str, String newIndent) {
        Appendable joinTo;
        String str2;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(newIndent, "newIndent");
        List k02 = StringsKt__StringsKt.k0(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : k02) {
            if (!n.z((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        int size = arrayList.size();
        int i4 = 0;
        int i5 = 0;
        while (i5 < size) {
            Object obj2 = arrayList.get(i5);
            i5++;
            arrayList2.add(Integer.valueOf(c((String) obj2)));
        }
        Integer num = (Integer) CollectionsKt.minOrNull((Iterable) arrayList2);
        int intValue = num != null ? num.intValue() : 0;
        int length = str.length() + (newIndent.length() * k02.size());
        Function1 b4 = b(newIndent);
        int lastIndex = CollectionsKt.getLastIndex(k02);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : k02) {
            int i6 = i4 + 1;
            if (i4 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            String str3 = (String) obj3;
            if ((i4 == 0 || i4 == lastIndex) && n.z(str3)) {
                str3 = null;
            } else {
                String a12 = p.a1(str3, intValue);
                if (a12 != null && (str2 = (String) b4.invoke(a12)) != null) {
                    str3 = str2;
                }
            }
            if (str3 != null) {
                arrayList3.add(str3);
            }
            i4 = i6;
        }
        joinTo = CollectionsKt___CollectionsKt.joinTo(arrayList3, new StringBuilder(length), (r14 & 2) != 0 ? ", " : "\n", (r14 & 4) != 0 ? "" : null, (r14 & 8) == 0 ? null : "", (r14 & 16) != 0 ? -1 : 0, (r14 & 32) != 0 ? "..." : null, (r14 & 64) != 0 ? null : null);
        String sb = ((StringBuilder) joinTo).toString();
        Intrinsics.checkNotNullExpressionValue(sb, "toString(...)");
        return sb;
    }

    public static final String e(String str, String newIndent, String marginPrefix) {
        Appendable joinTo;
        String str2;
        String str3;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(newIndent, "newIndent");
        Intrinsics.checkNotNullParameter(marginPrefix, "marginPrefix");
        if (n.z(marginPrefix)) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        List k02 = StringsKt__StringsKt.k0(str);
        int length = str.length() + (newIndent.length() * k02.size());
        Function1 b4 = b(newIndent);
        int lastIndex = CollectionsKt.getLastIndex(k02);
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        for (Object obj : k02) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            String str4 = (String) obj;
            String str5 = null;
            if ((i4 == 0 || i4 == lastIndex) && n.z(str4)) {
                str2 = marginPrefix;
                str4 = null;
            } else {
                int length2 = str4.length();
                int i6 = 0;
                while (true) {
                    if (i6 >= length2) {
                        i6 = -1;
                        break;
                    }
                    if (!CharsKt__CharJVMKt.b(str4.charAt(i6))) {
                        break;
                    }
                    i6++;
                }
                if (i6 == -1) {
                    str2 = marginPrefix;
                } else {
                    int i7 = i6;
                    str2 = marginPrefix;
                    if (n.J(str4, str2, i7, false, 4, null)) {
                        int length3 = str2.length() + i7;
                        Intrinsics.checkNotNull(str4, "null cannot be cast to non-null type java.lang.String");
                        str5 = str4.substring(length3);
                        Intrinsics.checkNotNullExpressionValue(str5, "substring(...)");
                    }
                }
                if (str5 != null && (str3 = (String) b4.invoke(str5)) != null) {
                    str4 = str3;
                }
            }
            if (str4 != null) {
                arrayList.add(str4);
            }
            i4 = i5;
            marginPrefix = str2;
        }
        joinTo = CollectionsKt___CollectionsKt.joinTo(arrayList, new StringBuilder(length), (r14 & 2) != 0 ? ", " : "\n", (r14 & 4) != 0 ? "" : null, (r14 & 8) == 0 ? null : "", (r14 & 16) != 0 ? -1 : 0, (r14 & 32) != 0 ? "..." : null, (r14 & 64) != 0 ? null : null);
        String sb = ((StringBuilder) joinTo).toString();
        Intrinsics.checkNotNullExpressionValue(sb, "toString(...)");
        return sb;
    }

    public static String f(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return d(str, "");
    }

    public static final String g(String str, String marginPrefix) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(marginPrefix, "marginPrefix");
        return e(str, "", marginPrefix);
    }

    public static /* synthetic */ String h(String str, String str2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str2 = HiAnalyticsConstant.REPORT_VAL_SEPARATOR;
        }
        return g(str, str2);
    }
}
