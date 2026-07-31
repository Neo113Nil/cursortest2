package t1;

import android.net.Uri;
import android.os.Bundle;
import j.C0525G;
import j.C0526H;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import m2.C0651a;
import n.t0;
import n.z0;
import n2.AbstractC0730j;

/* loaded from: classes.dex */
public abstract class u {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f8930l = 0;

    /* renamed from: d, reason: collision with root package name */
    public final String f8931d;

    /* renamed from: e, reason: collision with root package name */
    public x f8932e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f8933f;

    /* renamed from: g, reason: collision with root package name */
    public final C0525G f8934g;

    /* renamed from: h, reason: collision with root package name */
    public final LinkedHashMap f8935h;

    /* renamed from: i, reason: collision with root package name */
    public int f8936i;

    /* renamed from: j, reason: collision with root package name */
    public String f8937j;

    /* renamed from: k, reason: collision with root package name */
    public R1.n f8938k;

    static {
        new LinkedHashMap();
    }

    public u(AbstractC1019G abstractC1019G) {
        f2.j.f(abstractC1019G, "navigator");
        LinkedHashMap linkedHashMap = C1020H.f8853b;
        this.f8931d = t0.m(abstractC1019G.getClass());
        this.f8933f = new ArrayList();
        this.f8934g = new C0525G();
        this.f8935h = new LinkedHashMap();
    }

    public final Bundle b(Bundle bundle) {
        LinkedHashMap linkedHashMap = this.f8935h;
        if (bundle == null && linkedHashMap.isEmpty()) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        Iterator it = linkedHashMap.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getValue().getClass();
            throw new ClassCastException();
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
            Iterator it2 = linkedHashMap.entrySet().iterator();
            if (it2.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it2.next();
                entry2.getValue().getClass();
                throw new ClassCastException();
            }
        }
        return bundle2;
    }

    public s c(G1.m mVar) {
        ArrayList arrayList = this.f8933f;
        if (arrayList.isEmpty()) {
            return null;
        }
        Iterator it = arrayList.iterator();
        s sVar = null;
        while (it.hasNext()) {
            r rVar = (r) it.next();
            LinkedHashMap linkedHashMap = this.f8935h;
            Uri uri = (Uri) mVar.f2116b;
            Bundle d3 = uri != null ? rVar.d(uri, linkedHashMap) : null;
            int b3 = rVar.b(uri);
            String str = (String) mVar.f2117c;
            boolean z3 = str != null && str.equals(null);
            if (d3 == null) {
                if (z3) {
                    f2.j.f(linkedHashMap, "arguments");
                    Bundle bundle = new Bundle();
                    if (uri != null) {
                        Pattern pattern = (Pattern) rVar.f8914d.getValue();
                        Matcher matcher = pattern != null ? pattern.matcher(uri.toString()) : null;
                        if (matcher != null && matcher.matches()) {
                            rVar.e(matcher, bundle, linkedHashMap);
                            if (((Boolean) rVar.f8915e.getValue()).booleanValue()) {
                                rVar.f(uri, bundle, linkedHashMap);
                            }
                        }
                    }
                    if (z0.k(linkedHashMap, new q(bundle, 1)).isEmpty()) {
                    }
                }
            }
            s sVar2 = new s(this, d3, rVar.f8922l, b3, z3);
            if (sVar == null || sVar2.compareTo(sVar) > 0) {
                sVar = sVar2;
            }
        }
        return sVar;
    }

    public final s d(String str) {
        r rVar;
        f2.j.f(str, "route");
        R1.n nVar = this.f8938k;
        if (nVar == null || (rVar = (r) nVar.getValue()) == null) {
            return null;
        }
        Uri parse = Uri.parse("android-app://androidx.navigation/".concat(str));
        f2.j.b(parse);
        Bundle d3 = rVar.d(parse, this.f8935h);
        if (d3 == null) {
            return null;
        }
        return new s(this, d3, rVar.f8922l, rVar.b(parse), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(Object obj) {
        boolean z3;
        int size;
        LinkedHashMap linkedHashMap;
        boolean z4;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        boolean a3 = f2.j.a(this.f8933f, uVar.f8933f);
        C0525G c0525g = this.f8934g;
        int e3 = c0525g.e();
        C0525G c0525g2 = uVar.f8934g;
        if (e3 == c0525g2.e()) {
            Iterator it = ((C0651a) m2.h.R(new C0526H(c0525g))).iterator();
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                if (!f2.j.a(c0525g.b(intValue), c0525g2.b(intValue))) {
                }
            }
            z3 = true;
            LinkedHashMap linkedHashMap2 = this.f8935h;
            size = linkedHashMap2.size();
            linkedHashMap = uVar.f8935h;
            if (size == linkedHashMap.size()) {
                Set<Map.Entry> entrySet = linkedHashMap2.entrySet();
                f2.j.f(entrySet, "<this>");
                for (Map.Entry entry : entrySet) {
                    if (linkedHashMap.containsKey(entry.getKey()) && f2.j.a(linkedHashMap.get(entry.getKey()), entry.getValue())) {
                    }
                }
                z4 = true;
                return this.f8936i != uVar.f8936i && f2.j.a(this.f8937j, uVar.f8937j) && a3 && z3 && z4;
            }
            z4 = false;
            if (this.f8936i != uVar.f8936i) {
            }
        }
        z3 = false;
        LinkedHashMap linkedHashMap22 = this.f8935h;
        size = linkedHashMap22.size();
        linkedHashMap = uVar.f8935h;
        if (size == linkedHashMap.size()) {
        }
        z4 = false;
        if (this.f8936i != uVar.f8936i) {
        }
    }

    public int hashCode() {
        int i3 = this.f8936i * 31;
        String str = this.f8937j;
        int hashCode = i3 + (str != null ? str.hashCode() : 0);
        Iterator it = this.f8933f.iterator();
        while (it.hasNext()) {
            hashCode = (((r) it.next()).f8911a.hashCode() + (hashCode * 31)) * 961;
        }
        C0525G c0525g = this.f8934g;
        f2.j.f(c0525g, "<this>");
        if (c0525g.e() > 0) {
            c0525g.f(0).getClass();
            throw new ClassCastException();
        }
        LinkedHashMap linkedHashMap = this.f8935h;
        for (String str2 : linkedHashMap.keySet()) {
            int d3 = A.k.d(hashCode * 31, 31, str2);
            Object obj = linkedHashMap.get(str2);
            hashCode = d3 + (obj != null ? obj.hashCode() : 0);
        }
        return hashCode;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(0x");
        sb.append(Integer.toHexString(this.f8936i));
        sb.append(")");
        String str = this.f8937j;
        if (str != null && !AbstractC0730j.K(str)) {
            sb.append(" route=");
            sb.append(this.f8937j);
        }
        String sb2 = sb.toString();
        f2.j.e(sb2, "sb.toString()");
        return sb2;
    }
}
