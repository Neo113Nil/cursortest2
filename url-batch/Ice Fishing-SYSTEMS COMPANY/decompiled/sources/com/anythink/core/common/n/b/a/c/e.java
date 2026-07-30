package com.anythink.core.common.n.b.a.c;

import com.anythink.core.common.n.b.ad;
import com.anythink.core.common.n.b.af;
import com.anythink.core.common.n.b.m;
import com.anythink.core.common.n.b.n;
import com.anythink.core.common.n.b.u;
import com.anythink.core.common.n.b.v;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private static final com.anythink.core.common.n.c.f f15212a = com.anythink.core.common.n.c.f.a("\"\\");

    /* renamed from: b, reason: collision with root package name */
    private static final com.anythink.core.common.n.c.f f15213b = com.anythink.core.common.n.c.f.a("\t ,=");

    private e() {
    }

    public static long a(af afVar) {
        return a(afVar.f().a("Content-Length"));
    }

    public static boolean b(af afVar) {
        return c(afVar.f()).contains("*");
    }

    private static Set<String> c(u uVar) {
        Set<String> set = Collections.EMPTY_SET;
        int a9 = uVar.a();
        for (int i = 0; i < a9; i++) {
            if ("Vary".equalsIgnoreCase(uVar.a(i))) {
                String b9 = uVar.b(i);
                if (set.isEmpty()) {
                    set = new TreeSet<>((Comparator<? super String>) String.CASE_INSENSITIVE_ORDER);
                }
                for (String str : b9.split(",")) {
                    set.add(str.trim());
                }
            }
        }
        return set;
    }

    private static String d(com.anythink.core.common.n.c.c cVar) {
        try {
            long c4 = cVar.c(f15213b);
            if (c4 == -1) {
                c4 = cVar.b();
            }
            if (c4 != 0) {
                return cVar.e(c4);
            }
            return null;
        } catch (EOFException unused) {
            throw new AssertionError();
        }
    }

    private static Set<String> e(af afVar) {
        return c(afVar.f());
    }

    private static long a(u uVar) {
        return a(uVar.a("Content-Length"));
    }

    private static boolean b(u uVar) {
        return c(uVar).contains("*");
    }

    private static long a(String str) {
        if (str == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    private static int b(com.anythink.core.common.n.c.c cVar) {
        int i = 0;
        while (!cVar.g() && cVar.c(0L) == 61) {
            i++;
            cVar.k();
        }
        return i;
    }

    private static u a(u uVar, u uVar2) {
        Set<String> c4 = c(uVar2);
        if (c4.isEmpty()) {
            return com.anythink.core.common.n.b.a.c.f15196c;
        }
        u.a aVar = new u.a();
        int a9 = uVar.a();
        for (int i = 0; i < a9; i++) {
            String a10 = uVar.a(i);
            if (c4.contains(a10)) {
                aVar.a(a10, uVar.b(i));
            }
        }
        return aVar.a();
    }

    public static boolean d(af afVar) {
        if (afVar.a().b().equals("HEAD")) {
            return false;
        }
        int c4 = afVar.c();
        return (((c4 >= 100 && c4 < 200) || c4 == 204 || c4 == 304) && a(afVar) == -1 && !"chunked".equalsIgnoreCase(afVar.a("Transfer-Encoding"))) ? false : true;
    }

    public static int b(String str, int i) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (parseLong < 0) {
                return 0;
            }
            return (int) parseLong;
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public static u c(af afVar) {
        u c4 = afVar.i().a().c();
        Set<String> c9 = c(afVar.f());
        if (c9.isEmpty()) {
            return com.anythink.core.common.n.b.a.c.f15196c;
        }
        u.a aVar = new u.a();
        int a9 = c4.a();
        for (int i = 0; i < a9; i++) {
            String a10 = c4.a(i);
            if (c9.contains(a10)) {
                aVar.a(a10, c4.b(i));
            }
        }
        return aVar.a();
    }

    public static List<com.anythink.core.common.n.b.h> a(u uVar, String str) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < uVar.a(); i++) {
            if (str.equalsIgnoreCase(uVar.a(i))) {
                a(arrayList, new com.anythink.core.common.n.c.c().b(uVar.b(i)));
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b6, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00b6, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(List<com.anythink.core.common.n.b.h> list, com.anythink.core.common.n.c.c cVar) {
        String d2;
        int b9;
        LinkedHashMap linkedHashMap;
        String d3;
        while (true) {
            String str = null;
            while (true) {
                if (str == null) {
                    a(cVar);
                    str = d(cVar);
                    if (str == null) {
                        return;
                    }
                }
                boolean a9 = a(cVar);
                d2 = d(cVar);
                if (d2 == null) {
                    if (cVar.g()) {
                        list.add(new com.anythink.core.common.n.b.h(str, (Map<String, String>) Collections.EMPTY_MAP));
                        return;
                    }
                    return;
                }
                b9 = b(cVar);
                boolean a10 = a(cVar);
                if (a9 || (!a10 && !cVar.g())) {
                    linkedHashMap = new LinkedHashMap();
                    int b10 = b9 + b(cVar);
                    while (true) {
                        if (d2 == null) {
                            d2 = d(cVar);
                            if (!a(cVar)) {
                                b10 = b(cVar);
                            }
                        }
                        if (b10 != 0) {
                            if (b10 > 1 || a(cVar)) {
                                return;
                            }
                            if (!cVar.g() && cVar.c(0L) == 34) {
                                d3 = c(cVar);
                            } else {
                                d3 = d(cVar);
                            }
                            if (d3 == null || ((String) linkedHashMap.put(d2, d3)) != null) {
                                return;
                            }
                            if (!a(cVar) && !cVar.g()) {
                                return;
                            } else {
                                d2 = null;
                            }
                        }
                    }
                }
                list.add(new com.anythink.core.common.n.b.h(str, linkedHashMap));
                str = d2;
            }
            char[] cArr = new char[b9];
            Arrays.fill(cArr, '=');
            list.add(new com.anythink.core.common.n.b.h(str, (Map<String, String>) Collections.singletonMap(null, d2.concat(new String(cArr)))));
        }
    }

    private static String c(com.anythink.core.common.n.c.c cVar) {
        if (cVar.k() == 34) {
            com.anythink.core.common.n.c.c cVar2 = new com.anythink.core.common.n.c.c();
            while (true) {
                long c4 = cVar.c(f15212a);
                if (c4 == -1) {
                    return null;
                }
                if (cVar.c(c4) == 34) {
                    cVar2.a(cVar, c4);
                    cVar.k();
                    return cVar2.u();
                }
                if (cVar.b() == c4 + 1) {
                    return null;
                }
                cVar2.a(cVar, c4);
                cVar.k();
                cVar2.a(cVar, 1L);
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    private static boolean a(com.anythink.core.common.n.c.c cVar) {
        boolean z8 = false;
        while (!cVar.g()) {
            byte c4 = cVar.c(0L);
            if (c4 != 44) {
                if (c4 != 32 && c4 != 9) {
                    break;
                }
                cVar.k();
            } else {
                cVar.k();
                z8 = true;
            }
        }
        return z8;
    }

    private static String a(int i) {
        char[] cArr = new char[i];
        Arrays.fill(cArr, '=');
        return new String(cArr);
    }

    public static void a(n nVar, v vVar, u uVar) {
        if (nVar == n.f15857a) {
            return;
        }
        m.a(vVar, uVar).isEmpty();
    }

    public static int a(String str, int i, String str2) {
        while (i < str.length() && str2.indexOf(str.charAt(i)) == -1) {
            i++;
        }
        return i;
    }

    public static int a(String str, int i) {
        char charAt;
        while (i < str.length() && ((charAt = str.charAt(i)) == ' ' || charAt == '\t')) {
            i++;
        }
        return i;
    }

    public static boolean a(af afVar, u uVar, ad adVar) {
        for (String str : c(afVar.f())) {
            if (!Objects.equals(uVar.b(str), adVar.b(str))) {
                return false;
            }
        }
        return true;
    }
}
