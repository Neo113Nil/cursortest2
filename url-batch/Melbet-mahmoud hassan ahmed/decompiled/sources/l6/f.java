package l6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import w5.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class f extends e {

    static final class a extends kotlin.jvm.internal.j implements f6.l<String, String> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f18818f = new a();

        a() {
            super(1);
        }

        @Override // f6.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String str) {
            kotlin.jvm.internal.i.d(str, "line");
            return str;
        }
    }

    static final class b extends kotlin.jvm.internal.j implements f6.l<String, String> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f18819f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(1);
            this.f18819f = str;
        }

        @Override // f6.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String str) {
            kotlin.jvm.internal.i.d(str, "line");
            return this.f18819f + str;
        }
    }

    private static final f6.l<String, String> b(String str) {
        return str.length() == 0 ? a.f18818f : new b(str);
    }

    private static final int c(String str) {
        int length = str.length();
        int i7 = 0;
        while (true) {
            if (i7 >= length) {
                i7 = -1;
                break;
            }
            if (!l6.a.c(str.charAt(i7))) {
                break;
            }
            i7++;
        }
        return i7 == -1 ? str.length() : i7;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ba A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String d(String str, String str2) {
        int g7;
        Comparable m7;
        int c7;
        boolean l7;
        String invoke;
        boolean l8;
        kotlin.jvm.internal.i.d(str, "<this>");
        kotlin.jvm.internal.i.d(str2, "newIndent");
        List<String> I = n.I(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : I) {
            l8 = m.l((String) obj);
            if (!l8) {
                arrayList.add(obj);
            }
        }
        g7 = w5.j.g(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(g7);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(c((String) it.next())));
        }
        m7 = q.m(arrayList2);
        Integer num = (Integer) m7;
        int i7 = 0;
        int intValue = num != null ? num.intValue() : 0;
        int length = str.length() + (str2.length() * I.size());
        f6.l<String, String> b7 = b(str2);
        c7 = w5.i.c(I);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : I) {
            int i8 = i7 + 1;
            if (i7 < 0) {
                w5.i.f();
            }
            String str3 = (String) obj2;
            if (i7 == 0 || i7 == c7) {
                l7 = m.l(str3);
                if (l7) {
                    str3 = null;
                    if (str3 == null) {
                        arrayList3.add(str3);
                    }
                    i7 = i8;
                }
            }
            String b02 = p.b0(str3, intValue);
            if (b02 != null && (invoke = b7.invoke(b02)) != null) {
                str3 = invoke;
            }
            if (str3 == null) {
            }
            i7 = i8;
        }
        String sb = ((StringBuilder) w5.g.j(arrayList3, new StringBuilder(length), "\n", null, null, 0, null, null, 124, null)).toString();
        kotlin.jvm.internal.i.c(sb, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return sb;
    }

    public static String e(String str) {
        kotlin.jvm.internal.i.d(str, "<this>");
        return d(str, "");
    }
}
