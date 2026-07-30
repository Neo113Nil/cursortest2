package t3;

import android.net.Uri;
import android.os.Bundle;
import i.i0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class v {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f8856n = 0;

    /* renamed from: f, reason: collision with root package name */
    public final String f8857f;

    /* renamed from: g, reason: collision with root package name */
    public y f8858g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f8859h;

    /* renamed from: i, reason: collision with root package name */
    public final i.h0 f8860i;

    /* renamed from: j, reason: collision with root package name */
    public final LinkedHashMap f8861j;

    /* renamed from: k, reason: collision with root package name */
    public int f8862k;

    /* renamed from: l, reason: collision with root package name */
    public String f8863l;

    /* renamed from: m, reason: collision with root package name */
    public d6.o f8864m;

    static {
        new LinkedHashMap();
    }

    public v(g0 g0Var) {
        r6.k.f(g0Var, "navigator");
        LinkedHashMap linkedHashMap = h0.f8803b;
        this.f8857f = a8.d.H(g0Var.getClass());
        this.f8859h = new ArrayList();
        this.f8860i = new i.h0();
        this.f8861j = new LinkedHashMap();
    }

    public final Bundle a(Bundle bundle) {
        LinkedHashMap linkedHashMap = this.f8861j;
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

    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(Object obj) {
        boolean z8;
        LinkedHashMap linkedHashMap;
        boolean z9;
        if (this != obj) {
            if (obj != null && (obj instanceof v)) {
                v vVar = (v) obj;
                i.h0 h0Var = vVar.f8860i;
                LinkedHashMap linkedHashMap2 = vVar.f8861j;
                boolean a3 = r6.k.a(this.f8859h, vVar.f8859h);
                i.h0 h0Var2 = this.f8860i;
                if (h0Var2.e() == h0Var.e()) {
                    Iterator it = ((y6.a) y6.h.m(new i0(h0Var2))).iterator();
                    while (it.hasNext()) {
                        int intValue = ((Number) it.next()).intValue();
                        if (!r6.k.a(h0Var2.b(intValue), h0Var.b(intValue))) {
                        }
                    }
                    z8 = true;
                    linkedHashMap = this.f8861j;
                    if (linkedHashMap.size() == linkedHashMap2.size()) {
                        Set<Map.Entry> entrySet = linkedHashMap.entrySet();
                        r6.k.f(entrySet, "<this>");
                        for (Map.Entry entry : entrySet) {
                            if (linkedHashMap2.containsKey(entry.getKey()) && r6.k.a(linkedHashMap2.get(entry.getKey()), entry.getValue())) {
                            }
                        }
                        z9 = true;
                        if (this.f8862k == vVar.f8862k || !r6.k.a(this.f8863l, vVar.f8863l) || !a3 || !z8 || !z9) {
                        }
                    }
                    z9 = false;
                    if (this.f8862k == vVar.f8862k) {
                    }
                }
                z8 = false;
                linkedHashMap = this.f8861j;
                if (linkedHashMap.size() == linkedHashMap2.size()) {
                }
                z9 = false;
                if (this.f8862k == vVar.f8862k) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0092, code lost:
    
        if (j1.c.i0(r3, new t3.r(r14, 1)).isEmpty() != false) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public t g(b1.b bVar) {
        v vVar = this;
        ArrayList arrayList = vVar.f8859h;
        Bundle bundle = null;
        if (arrayList.isEmpty()) {
            return null;
        }
        int size = arrayList.size();
        t tVar = null;
        int i7 = 0;
        while (i7 < size) {
            int i8 = i7 + 1;
            s sVar = (s) arrayList.get(i7);
            Uri uri = (Uri) bVar.f1230g;
            LinkedHashMap linkedHashMap = vVar.f8861j;
            Bundle d8 = uri != null ? sVar.d(uri, linkedHashMap) : bundle;
            int b9 = sVar.b(uri);
            String str = (String) bVar.f1231h;
            boolean z8 = str != null && str.equals(bundle);
            if (d8 == null) {
                if (z8) {
                    r6.k.f(linkedHashMap, "arguments");
                    Bundle bundle2 = new Bundle();
                    if (uri != null) {
                        Pattern pattern = (Pattern) sVar.f8840d.getValue();
                        Matcher matcher = pattern != null ? pattern.matcher(uri.toString()) : null;
                        if (matcher != null && matcher.matches()) {
                            sVar.e(matcher, bundle2, linkedHashMap);
                            if (((Boolean) sVar.f8841e.getValue()).booleanValue()) {
                                sVar.f(uri, bundle2, linkedHashMap);
                            }
                        }
                    }
                }
                bundle = null;
                vVar = this;
                i7 = i8;
            }
            t tVar2 = new t(vVar, d8, sVar.f8848l, b9, z8);
            if (tVar == null || tVar2.compareTo(tVar) > 0) {
                bundle = null;
                vVar = this;
                tVar = tVar2;
                i7 = i8;
            }
            bundle = null;
            vVar = this;
            i7 = i8;
        }
        return tVar;
    }

    public int hashCode() {
        int i7 = this.f8862k * 31;
        String str = this.f8863l;
        int hashCode = i7 + (str != null ? str.hashCode() : 0);
        ArrayList arrayList = this.f8859h;
        int size = arrayList.size();
        int i8 = 0;
        while (i8 < size) {
            Object obj = arrayList.get(i8);
            i8++;
            hashCode = (((s) obj).f8837a.hashCode() + (hashCode * 31)) * 961;
        }
        i.h0 h0Var = this.f8860i;
        r6.k.f(h0Var, "<this>");
        if (h0Var.e() > 0) {
            h0Var.f(0).getClass();
            throw new ClassCastException();
        }
        LinkedHashMap linkedHashMap = this.f8861j;
        for (String str2 : linkedHashMap.keySet()) {
            int a3 = r6.i.a(hashCode * 31, 31, str2);
            Object obj2 = linkedHashMap.get(str2);
            hashCode = a3 + (obj2 != null ? obj2.hashCode() : 0);
        }
        return hashCode;
    }

    public final t m(String str) {
        s sVar;
        r6.k.f(str, "route");
        d6.o oVar = this.f8864m;
        if (oVar == null || (sVar = (s) oVar.getValue()) == null) {
            return null;
        }
        Uri parse = Uri.parse("android-app://androidx.navigation/".concat(str));
        r6.k.b(parse);
        Bundle d8 = sVar.d(parse, this.f8861j);
        if (d8 == null) {
            return null;
        }
        return new t(this, d8, sVar.f8848l, sVar.b(parse), false);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(0x");
        sb.append(Integer.toHexString(this.f8862k));
        sb.append(")");
        String str = this.f8863l;
        if (str != null && !z6.h.G(str)) {
            sb.append(" route=");
            sb.append(this.f8863l);
        }
        String sb2 = sb.toString();
        r6.k.e(sb2, "sb.toString()");
        return sb2;
    }
}
