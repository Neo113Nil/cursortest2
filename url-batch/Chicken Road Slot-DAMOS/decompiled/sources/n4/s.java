package n4;

import android.net.Uri;
import android.os.Bundle;
import c2.w1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.k0;
import kotlin.collections.p0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import s.s0;
import s.t0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f7113s = 0;

    /* renamed from: d, reason: collision with root package name */
    public final String f7114d;

    /* renamed from: e, reason: collision with root package name */
    public final w1 f7115e;

    /* renamed from: i, reason: collision with root package name */
    public u f7116i;

    /* renamed from: r, reason: collision with root package name */
    public final s0 f7117r;

    static {
        new LinkedHashMap();
    }

    public s(h0 h0Var) {
        h0Var.getClass();
        LinkedHashMap linkedHashMap = i0.f7073b;
        this.f7114d = cf.c.x(h0Var.getClass());
        w1 w1Var = new w1();
        w1Var.f1695b = this;
        w1Var.f1696c = new ArrayList();
        w1Var.f1697d = new LinkedHashMap();
        this.f7115e = w1Var;
        this.f7117r = new s0(0);
    }

    public final Bundle b(Bundle bundle) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f7115e.f1697d;
        if (bundle == null && linkedHashMap.isEmpty()) {
            return null;
        }
        k0.f5575d.getClass();
        Bundle h10 = z4.w.h((Pair[]) Arrays.copyOf(new Pair[0], 0));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            ((g) entry.getValue()).getClass();
            str.getClass();
        }
        if (bundle != null) {
            h10.putAll(bundle);
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String str2 = (String) entry2.getKey();
                g gVar = (g) entry2.getValue();
                boolean z10 = gVar.f7061d;
                f0 f0Var = gVar.f7058a;
                if (!z10) {
                    str2.getClass();
                    if (gVar.f7059b || !h10.containsKey(str2) || !a.a.N(str2, h10)) {
                        try {
                            f0Var.a(str2, h10);
                        } catch (IllegalStateException unused) {
                        }
                    }
                    kotlin.collections.i0.i(v4.a.q("Wrong argument type for '", str2, "' in argument savedState. "), f0Var.b(), " expected.");
                    return null;
                }
            }
        }
        return h10;
    }

    public final Map c() {
        return p0.h((LinkedHashMap) this.f7115e.f1697d);
    }

    public r e(a1.n nVar) {
        boolean c10;
        Regex regex;
        a1.n b10;
        w1 w1Var = this.f7115e;
        LinkedHashMap linkedHashMap = (LinkedHashMap) w1Var.f1697d;
        Uri uri = (Uri) nVar.f41i;
        ArrayList arrayList = (ArrayList) w1Var.f1696c;
        if (arrayList.isEmpty()) {
            return null;
        }
        int size = arrayList.size();
        r rVar = null;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            q qVar = (q) obj;
            qVar.getClass();
            hd.q qVar2 = qVar.f7101d;
            if (((Regex) qVar2.getValue()) == null) {
                c10 = true;
            } else if (uri == null) {
                c10 = false;
            } else {
                Regex regex2 = (Regex) qVar2.getValue();
                regex2.getClass();
                c10 = regex2.c(uri.toString());
            }
            if (c10) {
                Bundle d10 = uri != null ? qVar.d(uri, linkedHashMap) : null;
                int b11 = qVar.b(uri);
                String str = (String) nVar.f40e;
                boolean z10 = str != null && str.equals(null);
                if (d10 == null) {
                    if (z10) {
                        linkedHashMap.getClass();
                        k0.f5575d.getClass();
                        Bundle h10 = z4.w.h((Pair[]) Arrays.copyOf(new Pair[0], 0));
                        if (uri != null && (regex = (Regex) qVar2.getValue()) != null && (b10 = regex.b(uri.toString())) != null) {
                            qVar.e(b10, h10, linkedHashMap);
                            if (((Boolean) qVar.f7102e.getValue()).booleanValue()) {
                                qVar.f(uri, h10, linkedHashMap);
                            }
                        }
                        if (k7.e.z(linkedHashMap, new o(h10, 1)).isEmpty()) {
                        }
                    }
                }
                r rVar2 = new r((s) w1Var.f1695b, d10, qVar.f7107l, b11, z10);
                if (rVar == null || rVar2.compareTo(rVar) > 0) {
                    rVar = rVar2;
                }
            }
        }
        return rVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        if (this != obj) {
            if (obj != null && (obj instanceof s)) {
                w1 w1Var = this.f7115e;
                ArrayList arrayList = (ArrayList) w1Var.f1696c;
                s sVar = (s) obj;
                s0 s0Var = sVar.f7117r;
                w1 w1Var2 = sVar.f7115e;
                boolean a9 = Intrinsics.a(arrayList, (ArrayList) w1Var2.f1696c);
                s0 s0Var2 = this.f7117r;
                if (s0Var2.f() == s0Var.f()) {
                    Iterator it = de.k.b(new t0(s0Var2)).iterator();
                    while (it.hasNext()) {
                        int intValue = ((Number) it.next()).intValue();
                        if (!Intrinsics.a(s0Var2.c(intValue), s0Var.c(intValue))) {
                        }
                    }
                    z10 = true;
                    if (c().size() == sVar.c().size()) {
                        Set<Map.Entry> entrySet = c().entrySet();
                        entrySet.getClass();
                        for (Map.Entry entry : entrySet) {
                            if (sVar.c().containsKey(entry.getKey()) && Intrinsics.a(sVar.c().get(entry.getKey()), entry.getValue())) {
                            }
                        }
                        z11 = true;
                        if (w1Var.f1694a == w1Var2.f1694a || !Intrinsics.a((String) w1Var.f1698e, (String) w1Var2.f1698e) || !a9 || !z10 || !z11) {
                        }
                    }
                    z11 = false;
                    if (w1Var.f1694a == w1Var2.f1694a) {
                    }
                }
                z10 = false;
                if (c().size() == sVar.c().size()) {
                }
                z11 = false;
                if (w1Var.f1694a == w1Var2.f1694a) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        w1 w1Var = this.f7115e;
        int i3 = w1Var.f1694a * 31;
        String str = (String) w1Var.f1698e;
        int hashCode = i3 + (str != null ? str.hashCode() : 0);
        ArrayList arrayList = (ArrayList) w1Var.f1696c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            hashCode = (((q) obj).f7098a.hashCode() + (hashCode * 31)) * 961;
        }
        s0 s0Var = this.f7117r;
        s0Var.getClass();
        if (s0Var.f() > 0) {
            s0Var.g(0).getClass();
            kotlin.collections.i0.j();
            return 0;
        }
        for (String str2 : c().keySet()) {
            int hashCode2 = (str2.hashCode() + (hashCode * 31)) * 31;
            Object obj2 = c().get(str2);
            hashCode = (obj2 != null ? obj2.hashCode() : 0) + hashCode2;
        }
        return hashCode;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append("(0x");
        w1 w1Var = this.f7115e;
        w1Var.getClass();
        sb2.append(Integer.toHexString(w1Var.f1694a));
        sb2.append(")");
        String str = (String) w1Var.f1698e;
        if (str != null && !StringsKt.r(str)) {
            sb2.append(" route=");
            sb2.append((String) w1Var.f1698e);
        }
        return sb2.toString();
    }
}
