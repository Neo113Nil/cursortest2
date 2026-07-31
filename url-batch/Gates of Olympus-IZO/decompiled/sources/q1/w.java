package q1;

import D1.C0014b;
import H2.AbstractC0080b;
import android.net.Uri;
import android.os.Bundle;
import f.AbstractC0382a;
import g2.C0405a;
import h2.AbstractC0447i;
import j.C0481G;
import j.C0482H;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f6961l = 0;

    /* renamed from: d, reason: collision with root package name */
    public final String f6962d;

    /* renamed from: e, reason: collision with root package name */
    public z f6963e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f6964f;

    /* renamed from: g, reason: collision with root package name */
    public final C0481G f6965g;

    /* renamed from: h, reason: collision with root package name */
    public final LinkedHashMap f6966h;

    /* renamed from: i, reason: collision with root package name */
    public int f6967i;

    /* renamed from: j, reason: collision with root package name */
    public String f6968j;

    /* renamed from: k, reason: collision with root package name */
    public L1.o f6969k;

    static {
        new LinkedHashMap();
    }

    public w(J j3) {
        Z1.i.f(j3, "navigator");
        LinkedHashMap linkedHashMap = K.f6874b;
        this.f6962d = AbstractC0382a.p(j3.getClass());
        this.f6964f = new ArrayList();
        this.f6965g = new C0481G();
        this.f6966h = new LinkedHashMap();
    }

    public final Bundle b(Bundle bundle) {
        LinkedHashMap linkedHashMap = this.f6966h;
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

    public u c(C0014b c0014b) {
        ArrayList arrayList = this.f6964f;
        if (arrayList.isEmpty()) {
            return null;
        }
        Iterator it = arrayList.iterator();
        u uVar = null;
        while (it.hasNext()) {
            t tVar = (t) it.next();
            LinkedHashMap linkedHashMap = this.f6966h;
            Uri uri = (Uri) c0014b.f536b;
            Bundle d3 = uri != null ? tVar.d(uri, linkedHashMap) : null;
            int b2 = tVar.b(uri);
            String str = (String) c0014b.f537c;
            boolean z3 = str != null && str.equals(null);
            if (d3 == null) {
                if (z3) {
                    Z1.i.f(linkedHashMap, "arguments");
                    Bundle bundle = new Bundle();
                    if (uri != null) {
                        Pattern pattern = (Pattern) tVar.f6945d.getValue();
                        Matcher matcher = pattern != null ? pattern.matcher(uri.toString()) : null;
                        if (matcher != null && matcher.matches()) {
                            tVar.e(matcher, bundle, linkedHashMap);
                            if (((Boolean) tVar.f6946e.getValue()).booleanValue()) {
                                tVar.f(uri, bundle, linkedHashMap);
                            }
                        }
                    }
                    if (AbstractC0382a.t(linkedHashMap, new s(bundle, 1)).isEmpty()) {
                    }
                }
            }
            u uVar2 = new u(this, d3, tVar.f6953l, b2, z3);
            if (uVar == null || uVar2.compareTo(uVar) > 0) {
                uVar = uVar2;
            }
        }
        return uVar;
    }

    public final u d(String str) {
        t tVar;
        Z1.i.f(str, "route");
        L1.o oVar = this.f6969k;
        if (oVar == null || (tVar = (t) oVar.getValue()) == null) {
            return null;
        }
        Uri parse = Uri.parse("android-app://androidx.navigation/".concat(str));
        Z1.i.b(parse);
        Bundle d3 = tVar.d(parse, this.f6966h);
        if (d3 == null) {
            return null;
        }
        return new u(this, d3, tVar.f6953l, tVar.b(parse), false);
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
        if (obj == null || !(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        boolean a3 = Z1.i.a(this.f6964f, wVar.f6964f);
        C0481G c0481g = this.f6965g;
        int e3 = c0481g.e();
        C0481G c0481g2 = wVar.f6965g;
        if (e3 == c0481g2.e()) {
            Iterator it = ((C0405a) g2.h.a0(new C0482H(c0481g))).iterator();
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                if (!Z1.i.a(c0481g.b(intValue), c0481g2.b(intValue))) {
                }
            }
            z3 = true;
            LinkedHashMap linkedHashMap2 = this.f6966h;
            size = linkedHashMap2.size();
            linkedHashMap = wVar.f6966h;
            if (size == linkedHashMap.size()) {
                Set<Map.Entry> entrySet = linkedHashMap2.entrySet();
                Z1.i.f(entrySet, "<this>");
                for (Map.Entry entry : entrySet) {
                    if (linkedHashMap.containsKey(entry.getKey()) && Z1.i.a(linkedHashMap.get(entry.getKey()), entry.getValue())) {
                    }
                }
                z4 = true;
                return this.f6967i != wVar.f6967i && Z1.i.a(this.f6968j, wVar.f6968j) && a3 && z3 && z4;
            }
            z4 = false;
            if (this.f6967i != wVar.f6967i) {
            }
        }
        z3 = false;
        LinkedHashMap linkedHashMap22 = this.f6966h;
        size = linkedHashMap22.size();
        linkedHashMap = wVar.f6966h;
        if (size == linkedHashMap.size()) {
        }
        z4 = false;
        if (this.f6967i != wVar.f6967i) {
        }
    }

    public int hashCode() {
        int i3 = this.f6967i * 31;
        String str = this.f6968j;
        int hashCode = i3 + (str != null ? str.hashCode() : 0);
        Iterator it = this.f6964f.iterator();
        while (it.hasNext()) {
            hashCode = (((t) it.next()).f6942a.hashCode() + (hashCode * 31)) * 961;
        }
        C0481G c0481g = this.f6965g;
        Z1.i.f(c0481g, "<this>");
        if (c0481g.e() > 0) {
            c0481g.f(0).getClass();
            throw new ClassCastException();
        }
        LinkedHashMap linkedHashMap = this.f6966h;
        for (String str2 : linkedHashMap.keySet()) {
            int e3 = AbstractC0080b.e(hashCode * 31, 31, str2);
            Object obj = linkedHashMap.get(str2);
            hashCode = e3 + (obj != null ? obj.hashCode() : 0);
        }
        return hashCode;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(0x");
        sb.append(Integer.toHexString(this.f6967i));
        sb.append(")");
        String str = this.f6968j;
        if (str != null && !AbstractC0447i.t0(str)) {
            sb.append(" route=");
            sb.append(this.f6968j);
        }
        String sb2 = sb.toString();
        Z1.i.e(sb2, "sb.toString()");
        return sb2;
    }
}
