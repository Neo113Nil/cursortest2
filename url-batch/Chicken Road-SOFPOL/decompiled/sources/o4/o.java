package o4;

import a0.g1;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import o.u0;
import o.v0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f5669h = 0;

    /* renamed from: d, reason: collision with root package name */
    public final String f5670d;

    /* renamed from: e, reason: collision with root package name */
    public final l.n f5671e;

    /* renamed from: f, reason: collision with root package name */
    public q f5672f;

    /* renamed from: g, reason: collision with root package name */
    public final u0 f5673g;

    static {
        new LinkedHashMap();
    }

    public o(y yVar) {
        q6.i.e(yVar, "navigator");
        LinkedHashMap linkedHashMap = z.f5705b;
        this.f5670d = m.a.C(yVar.getClass());
        l.n nVar = new l.n();
        nVar.f4349b = this;
        nVar.f4350c = new ArrayList();
        nVar.f4351d = new LinkedHashMap();
        this.f5671e = nVar;
        this.f5673g = new u0(0);
    }

    public final Bundle a(Bundle bundle) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f5671e.f4351d;
        if (bundle == null && linkedHashMap.isEmpty()) {
            return null;
        }
        Bundle j7 = h0.a.j((c6.f[]) Arrays.copyOf(new c6.f[0], 0));
        Iterator it = linkedHashMap.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getValue().getClass();
            throw new ClassCastException();
        }
        if (bundle != null) {
            j7.putAll(bundle);
            Iterator it2 = linkedHashMap.entrySet().iterator();
            if (it2.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it2.next();
                entry2.getValue().getClass();
                throw new ClassCastException();
            }
        }
        return j7;
    }

    public final Map b() {
        return d6.y.G((LinkedHashMap) this.f5671e.f4351d);
    }

    public n c(g1 g1Var) {
        boolean matches;
        y6.c cVar;
        g1 b8;
        l.n nVar = this.f5671e;
        LinkedHashMap linkedHashMap = (LinkedHashMap) nVar.f4351d;
        Uri uri = (Uri) g1Var.f84b;
        ArrayList arrayList = (ArrayList) nVar.f4350c;
        if (arrayList.isEmpty()) {
            return null;
        }
        int size = arrayList.size();
        n nVar2 = null;
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            m mVar = (m) obj;
            mVar.getClass();
            c6.k kVar = mVar.f5656d;
            if (((y6.c) kVar.getValue()) == null) {
                matches = true;
            } else if (uri == null) {
                matches = false;
            } else {
                y6.c cVar2 = (y6.c) kVar.getValue();
                q6.i.b(cVar2);
                String uri2 = uri.toString();
                q6.i.e(uri2, "input");
                matches = cVar2.f8993d.matcher(uri2).matches();
            }
            if (matches) {
                Bundle d8 = uri != null ? mVar.d(uri, linkedHashMap) : null;
                int b9 = mVar.b(uri);
                String str = (String) g1Var.f85c;
                boolean z3 = str != null && str.equals(null);
                if (d8 == null) {
                    if (z3) {
                        q6.i.e(linkedHashMap, "arguments");
                        Bundle j7 = h0.a.j((c6.f[]) Arrays.copyOf(new c6.f[0], 0));
                        if (uri != null && (cVar = (y6.c) kVar.getValue()) != null && (b8 = cVar.b(uri.toString())) != null) {
                            mVar.e(b8, j7, linkedHashMap);
                            if (((Boolean) mVar.f5657e.getValue()).booleanValue()) {
                                mVar.f(uri, j7, linkedHashMap);
                            }
                        }
                        if (h0.a.N(linkedHashMap, new k(j7, 1)).isEmpty()) {
                        }
                    }
                }
                n nVar3 = new n((o) nVar.f4349b, d8, mVar.f5663l, b9, z3);
                if (nVar2 == null || nVar3.compareTo(nVar2) > 0) {
                    nVar2 = nVar3;
                }
            }
        }
        return nVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(Object obj) {
        boolean z3;
        boolean z7;
        if (this != obj) {
            if (obj != null && (obj instanceof o)) {
                l.n nVar = this.f5671e;
                ArrayList arrayList = (ArrayList) nVar.f4350c;
                o oVar = (o) obj;
                u0 u0Var = oVar.f5673g;
                l.n nVar2 = oVar.f5671e;
                boolean a8 = q6.i.a(arrayList, (ArrayList) nVar2.f4350c);
                u0 u0Var2 = this.f5673g;
                if (u0Var2.f() == u0Var.f()) {
                    Iterator it = ((x6.a) x6.g.a0(new v0(u0Var2))).iterator();
                    while (it.hasNext()) {
                        int intValue = ((Number) it.next()).intValue();
                        if (!q6.i.a(u0Var2.c(intValue), u0Var.c(intValue))) {
                        }
                    }
                    z3 = true;
                    if (b().size() == oVar.b().size()) {
                        Set<Map.Entry> entrySet = b().entrySet();
                        q6.i.e(entrySet, "<this>");
                        for (Map.Entry entry : entrySet) {
                            if (oVar.b().containsKey(entry.getKey()) && q6.i.a(oVar.b().get(entry.getKey()), entry.getValue())) {
                            }
                        }
                        z7 = true;
                        if (nVar.f4348a == nVar2.f4348a || !q6.i.a((String) nVar.f4352e, (String) nVar2.f4352e) || !a8 || !z3 || !z7) {
                        }
                    }
                    z7 = false;
                    if (nVar.f4348a == nVar2.f4348a) {
                    }
                }
                z3 = false;
                if (b().size() == oVar.b().size()) {
                }
                z7 = false;
                if (nVar.f4348a == nVar2.f4348a) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        l.n nVar = this.f5671e;
        int i = nVar.f4348a * 31;
        String str = (String) nVar.f4352e;
        int hashCode = i + (str != null ? str.hashCode() : 0);
        ArrayList arrayList = (ArrayList) nVar.f4350c;
        int size = arrayList.size();
        int i8 = 0;
        while (i8 < size) {
            Object obj = arrayList.get(i8);
            i8++;
            hashCode = (((m) obj).f5653a.hashCode() + (hashCode * 31)) * 961;
        }
        u0 u0Var = this.f5673g;
        q6.i.e(u0Var, "<this>");
        if (u0Var.f() > 0) {
            u0Var.g(0).getClass();
            throw new ClassCastException();
        }
        for (String str2 : b().keySet()) {
            int hashCode2 = (str2.hashCode() + (hashCode * 31)) * 31;
            Object obj2 = b().get(str2);
            hashCode = (obj2 != null ? obj2.hashCode() : 0) + hashCode2;
        }
        return hashCode;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(0x");
        l.n nVar = this.f5671e;
        nVar.getClass();
        sb.append(Integer.toHexString(nVar.f4348a));
        sb.append(")");
        String str = (String) nVar.f4352e;
        if (str != null && !y6.j.e0(str)) {
            sb.append(" route=");
            sb.append((String) nVar.f4352e);
        }
        String sb2 = sb.toString();
        q6.i.d(sb2, "toString(...)");
        return sb2;
    }
}
