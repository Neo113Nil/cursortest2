package u1;

import B0.f;
import B4.k;
import B4.r;
import C4.c;
import I.l;
import I.m;
import I.n;
import I.o;
import N1.g;
import N1.h;
import N1.j;
import N1.q;
import T4.B;
import T4.y;
import T4.z;
import V2.e;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.view.View;
import android.widget.TextView;
import f4.C0430g;
import g4.AbstractC0476u;
import java.io.Closeable;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.i;
import l.C1246s;
import l.p0;
import n4.C1345b;
import s0.s;
import s3.d;
import t0.C1422a;
import w.C1501c;

/* renamed from: u1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1477a {

    /* renamed from: a, reason: collision with root package name */
    public static Context f12045a;

    /* renamed from: b, reason: collision with root package name */
    public static Boolean f12046b;

    public AbstractC1477a() {
        new ConcurrentHashMap();
    }

    public static final z A(z zVar) {
        i.e(zVar, "<this>");
        y a6 = zVar.a();
        B b6 = zVar.f3021g;
        a6.f3006g = new U4.a(b6.c(), b6.b());
        return a6.a();
    }

    public static final long B(long j2, c unit) {
        i.e(unit, "unit");
        c cVar = c.f395b;
        long l2 = f.l(4611686018426999999L, cVar, unit);
        if ((-l2) <= j2 && j2 <= l2) {
            return m(f.l(j2, unit, cVar));
        }
        c targetUnit = c.f396c;
        i.e(targetUnit, "targetUnit");
        return k(K1.b.K(targetUnit.f402a.convert(j2, unit.f402a)));
    }

    public static ActionMode.Callback C(ActionMode.Callback callback, TextView textView) {
        int i2 = Build.VERSION.SDK_INT;
        return (i2 < 26 || i2 > 27 || (callback instanceof o) || callback == null) ? callback : new o(callback, textView);
    }

    public static final long a(String str) {
        c cVar;
        long l2;
        char charAt;
        int length = str.length();
        if (length == 0) {
            throw new IllegalArgumentException("The string is empty");
        }
        int i2 = C4.a.f392d;
        char charAt2 = str.charAt(0);
        int i3 = (charAt2 == '+' || charAt2 == '-') ? 1 : 0;
        boolean z = (i3 > 0) && k.j0(str, '-');
        if (length <= i3) {
            throw new IllegalArgumentException("No components");
        }
        if (str.charAt(i3) != 'P') {
            throw new IllegalArgumentException();
        }
        int i6 = i3 + 1;
        if (i6 == length) {
            throw new IllegalArgumentException();
        }
        c cVar2 = null;
        long j2 = 0;
        boolean z5 = false;
        while (i6 < length) {
            if (str.charAt(i6) != 'T') {
                int i7 = i6;
                while (i7 < str.length() && (('0' <= (charAt = str.charAt(i7)) && charAt < ':') || k.S("+-.", charAt))) {
                    i7++;
                }
                String substring = str.substring(i6, i7);
                i.d(substring, "substring(...)");
                if (substring.length() == 0) {
                    throw new IllegalArgumentException();
                }
                int length2 = substring.length() + i6;
                if (length2 < 0 || length2 >= str.length()) {
                    throw new IllegalArgumentException("Missing unit for value ".concat(substring));
                }
                char charAt3 = str.charAt(length2);
                int i8 = length2 + 1;
                if (z5) {
                    if (charAt3 == 'H') {
                        cVar = c.f399f;
                    } else if (charAt3 == 'M') {
                        cVar = c.f398e;
                    } else {
                        if (charAt3 != 'S') {
                            throw new IllegalArgumentException("Invalid duration ISO time unit: " + charAt3);
                        }
                        cVar = c.f397d;
                    }
                } else {
                    if (charAt3 != 'D') {
                        throw new IllegalArgumentException("Invalid or unsupported duration ISO non-time unit: " + charAt3);
                    }
                    cVar = c.f400g;
                }
                if (cVar2 != null && cVar2.compareTo(cVar) <= 0) {
                    throw new IllegalArgumentException("Unexpected order of duration components");
                }
                int W5 = k.W(substring, '.', 0, false, 6);
                if (cVar != c.f397d || W5 <= 0) {
                    j2 = C4.a.e(j2, B(u(substring), cVar));
                } else {
                    String substring2 = substring.substring(0, W5);
                    i.d(substring2, "substring(...)");
                    long e3 = C4.a.e(j2, B(u(substring2), cVar));
                    String substring3 = substring.substring(W5);
                    i.d(substring3, "substring(...)");
                    double parseDouble = Double.parseDouble(substring3);
                    double k3 = f.k(parseDouble, cVar, c.f395b);
                    if (Double.isNaN(k3)) {
                        throw new IllegalArgumentException("Duration value cannot be NaN.");
                    }
                    if (Double.isNaN(k3)) {
                        throw new IllegalArgumentException("Cannot round NaN value.");
                    }
                    long round = Math.round(k3);
                    if (-4611686018426999999L > round || round >= 4611686018427000000L) {
                        double k6 = f.k(parseDouble, cVar, c.f396c);
                        if (Double.isNaN(k6)) {
                            throw new IllegalArgumentException("Cannot round NaN value.");
                        }
                        l2 = l(Math.round(k6));
                    } else {
                        l2 = m(round);
                    }
                    j2 = C4.a.e(e3, l2);
                }
                cVar2 = cVar;
                i6 = i8;
            } else {
                if (z5 || (i6 = i6 + 1) == length) {
                    throw new IllegalArgumentException();
                }
                z5 = true;
            }
        }
        if (!z) {
            return j2;
        }
        long j6 = ((-(j2 >> 1)) << 1) + (((int) j2) & 1);
        int i9 = C4.b.f394a;
        return j6;
    }

    public static B4.i b(Map map) {
        if (map == null) {
            return null;
        }
        String str = (String) map.get("toolbarColor");
        Integer valueOf = str != null ? Integer.valueOf(Color.parseColor(str) | (-16777216)) : null;
        String str2 = (String) map.get("navigationBarColor");
        Integer valueOf2 = str2 != null ? Integer.valueOf((-16777216) | Color.parseColor(str2)) : null;
        String str3 = (String) map.get("navigationBarDividerColor");
        return new B4.i(valueOf, valueOf2, str3 != null ? Integer.valueOf(Color.parseColor(str3)) : null, 22);
    }

    public static void c(int i2, int i3, int i6) {
        if (i2 >= 0 && i3 <= i6) {
            if (i2 > i3) {
                throw new IllegalArgumentException(B0.o.h("startIndex: ", i2, i3, " > endIndex: "));
            }
            return;
        }
        throw new IndexOutOfBoundsException("startIndex: " + i2 + ", endIndex: " + i3 + ", size: " + i6);
    }

    public static void d(int i2, int i3, int i6) {
        if (i2 >= 0 && i3 <= i6) {
            if (i2 > i3) {
                throw new IllegalArgumentException(B0.o.h("fromIndex: ", i2, i3, " > toIndex: "));
            }
            return;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i2 + ", toIndex: " + i3 + ", size: " + i6);
    }

    public static final void e(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                K1.b.C(th, th2);
            }
        }
    }

    public static void j(ArrayList arrayList) {
        HashMap hashMap = new HashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (true) {
            int i2 = 0;
            if (!it.hasNext()) {
                Iterator it2 = hashMap.values().iterator();
                while (it2.hasNext()) {
                    for (g gVar : (Set) it2.next()) {
                        for (N1.i iVar : gVar.f2014a.f1998c) {
                            if (iVar.f2021c == 0) {
                                Set<g> set = (Set) hashMap.get(new h(iVar.f2019a, iVar.f2020b == 2));
                                if (set != null) {
                                    for (g gVar2 : set) {
                                        gVar.f2015b.add(gVar2);
                                        gVar2.f2016c.add(gVar);
                                    }
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                Iterator it3 = hashMap.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                HashSet hashSet2 = new HashSet();
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    g gVar3 = (g) it4.next();
                    if (gVar3.f2016c.isEmpty()) {
                        hashSet2.add(gVar3);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    g gVar4 = (g) hashSet2.iterator().next();
                    hashSet2.remove(gVar4);
                    i2++;
                    Iterator it5 = gVar4.f2015b.iterator();
                    while (it5.hasNext()) {
                        g gVar5 = (g) it5.next();
                        gVar5.f2016c.remove(gVar4);
                        if (gVar5.f2016c.isEmpty()) {
                            hashSet2.add(gVar5);
                        }
                    }
                }
                if (i2 == arrayList.size()) {
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it6 = hashSet.iterator();
                while (it6.hasNext()) {
                    g gVar6 = (g) it6.next();
                    if (!gVar6.f2016c.isEmpty() && !gVar6.f2015b.isEmpty()) {
                        arrayList2.add(gVar6.f2014a);
                    }
                }
                throw new j("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()));
            }
            N1.a aVar = (N1.a) it.next();
            g gVar7 = new g(aVar);
            for (q qVar : aVar.f1997b) {
                boolean z = aVar.f2000e == 0;
                h hVar = new h(qVar, !z);
                if (!hashMap.containsKey(hVar)) {
                    hashMap.put(hVar, new HashSet());
                }
                Set set2 = (Set) hashMap.get(hVar);
                if (!set2.isEmpty() && z) {
                    throw new IllegalArgumentException("Multiple components provide " + qVar + ".");
                }
                set2.add(gVar7);
            }
        }
    }

    public static final long k(long j2) {
        long j6 = (j2 << 1) + 1;
        int i2 = C4.a.f392d;
        int i3 = C4.b.f394a;
        return j6;
    }

    public static final long l(long j2) {
        return (-4611686018426L > j2 || j2 >= 4611686018427L) ? k(K1.b.K(j2)) : m(j2 * 1000000);
    }

    public static final long m(long j2) {
        long j6 = j2 << 1;
        int i2 = C4.a.f392d;
        int i3 = C4.b.f394a;
        return j6;
    }

    public static final C1345b n(Enum[] entries) {
        i.e(entries, "entries");
        return new C1345b(entries);
    }

    public static final B0.j p(B0.q qVar) {
        i.e(qVar, "<this>");
        return new B0.j(qVar.f173a, qVar.f192t);
    }

    public static C.b q(C1246s c1246s) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            return new C.b(n.c(c1246s));
        }
        TextPaint textPaint = new TextPaint(c1246s.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int a6 = l.a(c1246s);
        int d6 = l.d(c1246s);
        if (c1246s.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else {
            if (i2 < 28 || (c1246s.getInputType() & 15) != 3) {
                boolean z = c1246s.getLayoutDirection() == 1;
                switch (c1246s.getTextDirection()) {
                    case 2:
                        textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                        break;
                    case 3:
                        textDirectionHeuristic = TextDirectionHeuristics.LTR;
                        break;
                    case 4:
                        textDirectionHeuristic = TextDirectionHeuristics.RTL;
                        break;
                    case 5:
                        textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                        break;
                    case 6:
                        break;
                    case 7:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                    default:
                        if (z) {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                            break;
                        }
                        break;
                }
            } else {
                byte directionality = Character.getDirectionality(n.b(m.a(c1246s.getTextLocale()))[0].codePointAt(0));
                textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            }
        }
        return new C.b(textPaint, textDirectionHeuristic, a6, d6);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void r(Context context) {
        boolean z;
        Context applicationContext;
        PackageManager packageManager;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        if (f.v(context).getBoolean("proxy_notification_initialized", false)) {
            return;
        }
        try {
            applicationContext = context.getApplicationContext();
            packageManager = applicationContext.getPackageManager();
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_messaging_notification_delegation_enabled")) {
            z = applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
            if (Build.VERSION.SDK_INT < 29) {
                new f2.q(context, z, new I1.h()).run();
                return;
            } else {
                f.r(null);
                return;
            }
        }
        z = true;
        if (Build.VERSION.SDK_INT < 29) {
        }
    }

    public static String s(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i2 = 0; i2 < str.length(); i2++) {
            sb.append(str.charAt(i2));
            if (str2.length() > i2) {
                sb.append(str2.charAt(i2));
            }
        }
        return sb.toString();
    }

    public static final void t(Context context) {
        i.e(context, "context");
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        i.d(databasePath, "context.getDatabasePath(WORK_DATABASE_NAME)");
        if (databasePath.exists()) {
            s.d().a(t0.m.f11877a, "Migrating WorkDatabase to the no-backup directory");
            File databasePath2 = context.getDatabasePath("androidx.work.workdb");
            i.d(databasePath2, "context.getDatabasePath(WORK_DATABASE_NAME)");
            File file = new File(C1422a.f11839a.a(context), "androidx.work.workdb");
            String[] strArr = t0.m.f11878b;
            int W5 = AbstractC0476u.W(strArr.length);
            if (W5 < 16) {
                W5 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(W5);
            for (String str : strArr) {
                linkedHashMap.put(new File(databasePath2.getPath() + str), new File(file.getPath() + str));
            }
            for (Map.Entry entry : AbstractC0476u.Z(linkedHashMap, new C0430g(databasePath2, file)).entrySet()) {
                File file2 = (File) entry.getKey();
                File file3 = (File) entry.getValue();
                if (file2.exists()) {
                    if (file3.exists()) {
                        s.d().g(t0.m.f11877a, "Over-writing contents of " + file3);
                    }
                    s.d().a(t0.m.f11877a, file2.renameTo(file3) ? "Migrated " + file2 + "to " + file3 : "Renaming " + file2 + " to " + file3 + " failed");
                }
            }
        }
    }

    public static final long u(String str) {
        char charAt;
        int length = str.length();
        int i2 = (length <= 0 || !k.S("+-", str.charAt(0))) ? 0 : 1;
        if (length - i2 > 16) {
            int i3 = i2;
            while (true) {
                if (i2 < length) {
                    char charAt2 = str.charAt(i2);
                    if (charAt2 != '0') {
                        if ('1' > charAt2 || charAt2 >= ':') {
                            break;
                        }
                    } else if (i3 == i2) {
                        i3++;
                    }
                    i2++;
                } else if (length - i3 > 16) {
                    return str.charAt(0) == '-' ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
            }
        }
        if (r.O(str, "+", false) && length > 1 && '0' <= (charAt = str.charAt(1)) && charAt < ':') {
            str = k.T(1, str);
        }
        return Long.parseLong(str);
    }

    public static final boolean v(String method) {
        i.e(method, "method");
        return (method.equals("GET") || method.equals("HEAD")) ? false : true;
    }

    public static Q2.a w(List list) {
        L3.j jVar = new L3.j(1);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            s3.j jVar2 = (s3.j) it.next();
            String str = jVar2.f11833c;
            s3.b bVar = jVar2.f11834d;
            String str2 = bVar.f11813c;
            Q2.b bVar2 = Q2.b.f2476a;
            if (str2 != null) {
                jVar.e(e.a(bVar2, str), bVar.f11813c);
            } else {
                Boolean bool = bVar.f11814d;
                if (bool != null) {
                    jVar.e(e.a(Q2.b.f2477b, str), bool);
                } else {
                    Long l2 = bVar.f11815e;
                    if (l2 != null) {
                        jVar.e(e.a(Q2.b.f2478c, str), l2);
                    } else {
                        Double d6 = bVar.f11816f;
                        if (d6 != null) {
                            jVar.e(e.a(Q2.b.f2479d, str), d6);
                        } else {
                            d dVar = bVar.f11817g;
                            if (dVar != null) {
                                List list2 = dVar.f11821c;
                                s3.b bVar3 = (s3.b) list2.get(0);
                                if (bVar3.f11813c != null) {
                                    e a6 = e.a(Q2.b.f2480e, str);
                                    ArrayList arrayList = new ArrayList(list2.size());
                                    Iterator it2 = list2.iterator();
                                    while (it2.hasNext()) {
                                        arrayList.add(((s3.b) it2.next()).f11813c);
                                    }
                                    jVar.e(a6, arrayList);
                                } else if (bVar3.f11814d != null) {
                                    e a7 = e.a(Q2.b.f2481f, str);
                                    ArrayList arrayList2 = new ArrayList(list2.size());
                                    Iterator it3 = list2.iterator();
                                    while (it3.hasNext()) {
                                        arrayList2.add(((s3.b) it3.next()).f11814d);
                                    }
                                    jVar.e(a7, arrayList2);
                                } else if (bVar3.f11815e != null) {
                                    e a8 = e.a(Q2.b.f2482g, str);
                                    ArrayList arrayList3 = new ArrayList(list2.size());
                                    Iterator it4 = list2.iterator();
                                    while (it4.hasNext()) {
                                        arrayList3.add(((s3.b) it4.next()).f11815e);
                                    }
                                    jVar.e(a8, arrayList3);
                                } else {
                                    if (bVar3.f11816f == null) {
                                        throw new UnsupportedOperationException();
                                    }
                                    e a9 = e.a(Q2.b.f2483h, str);
                                    ArrayList arrayList4 = new ArrayList(list2.size());
                                    Iterator it5 = list2.iterator();
                                    while (it5.hasNext()) {
                                        arrayList4.add(((s3.b) it5.next()).f11816f);
                                    }
                                    jVar.e(a9, arrayList4);
                                }
                            } else {
                                jVar.e(e.a(bVar2, str), "");
                            }
                        }
                    }
                }
            }
        }
        return jVar.b();
    }

    public static void x(TextView textView, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException();
        }
        if (Build.VERSION.SDK_INT >= 28) {
            n.d(textView, i2);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i3 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i2 > Math.abs(i3)) {
            textView.setPadding(textView.getPaddingLeft(), i2 + i3, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void y(TextView textView, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException();
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i3 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i2 > Math.abs(i3)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i2 - i3);
        }
    }

    public static void z(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
            return;
        }
        p0 p0Var = p0.f10930j;
        if (p0Var != null && p0Var.f10932a == view) {
            p0.b(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new p0(view, charSequence);
            return;
        }
        p0 p0Var2 = p0.f10931k;
        if (p0Var2 != null && p0Var2.f10932a == view) {
            p0Var2.a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    public abstract void D(byte[] bArr, int i2, int i3);

    public abstract Typeface f(Context context, C1501c c1501c, Resources resources, int i2);

    public abstract Typeface g(Context context, B.i[] iVarArr, int i2);

    public Typeface h(Context context, InputStream inputStream) {
        File x5 = f.x(context);
        if (x5 == null) {
            return null;
        }
        try {
            if (f.o(x5, inputStream)) {
                return Typeface.createFromFile(x5.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            x5.delete();
        }
    }

    public Typeface i(Context context, Resources resources, int i2, String str, int i3) {
        File x5 = f.x(context);
        if (x5 == null) {
            return null;
        }
        try {
            if (f.n(x5, resources, i2)) {
                return Typeface.createFromFile(x5.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            x5.delete();
        }
    }

    public B.i o(B.i[] iVarArr, int i2) {
        int i3 = (i2 & 1) == 0 ? 400 : 700;
        boolean z = (i2 & 2) != 0;
        B.i iVar = null;
        int i6 = Integer.MAX_VALUE;
        for (B.i iVar2 : iVarArr) {
            int abs = (Math.abs(iVar2.f126c - i3) * 2) + (iVar2.f127d == z ? 0 : 1);
            if (iVar == null || i6 > abs) {
                iVar = iVar2;
                i6 = abs;
            }
        }
        return iVar;
    }
}
