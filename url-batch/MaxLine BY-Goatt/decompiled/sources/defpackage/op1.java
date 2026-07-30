package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class op1 {
    public static final /* synthetic */ int u = 0;
    public final String m;
    public rp1 n;
    public final ArrayList o;
    public final yn2 p;
    public final LinkedHashMap q;
    public int r;
    public String s;
    public y91 t;

    static {
        new LinkedHashMap();
    }

    public op1(cr1 cr1Var) {
        cr1Var.getClass();
        LinkedHashMap linkedHashMap = dr1.b;
        this.m = bd3.w(cr1Var.getClass());
        this.o = new ArrayList();
        this.p = new yn2(0);
        this.q = new LinkedHashMap();
    }

    public final Bundle a(Bundle bundle) {
        LinkedHashMap linkedHashMap = this.q;
        if (bundle == null && linkedHashMap.isEmpty()) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            ((yo1) entry.getValue()).getClass();
            str.getClass();
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String str2 = (String) entry2.getKey();
                yo1 yo1Var = (yo1) entry2.getValue();
                yo1Var.getClass();
                iq1 iq1Var = yo1Var.a;
                str2.getClass();
                if (!bundle2.containsKey(str2) || bundle2.get(str2) != null) {
                    try {
                        iq1Var.a(bundle2, str2);
                    } catch (ClassCastException unused) {
                    }
                }
                b71.s("Wrong argument type for '", str2, "' in argument bundle. ", iq1Var.b(), " expected.");
                return null;
            }
        }
        return bundle2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0093, code lost:
    
        if (defpackage.bd3.F(r3, new defpackage.kp1(1, r15)).isEmpty() != false) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public mp1 b(mh mhVar) {
        Bundle bundle;
        int i;
        boolean z;
        op1 op1Var = this;
        ArrayList arrayList = op1Var.o;
        Bundle bundle2 = null;
        if (arrayList.isEmpty()) {
            return null;
        }
        int size = arrayList.size();
        mp1 mp1Var = null;
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            lp1 lp1Var = (lp1) arrayList.get(i2);
            Uri uri = (Uri) mhVar.n;
            LinkedHashMap linkedHashMap = op1Var.q;
            Bundle d = uri != null ? lp1Var.d(uri, linkedHashMap) : bundle2;
            int b = lp1Var.b(uri);
            String str = (String) mhVar.o;
            if (str == null || !str.equals(bundle2)) {
                bundle = d;
                i = b;
                z = false;
            } else {
                bundle = d;
                i = b;
                z = true;
            }
            if (bundle == null) {
                if (z) {
                    linkedHashMap.getClass();
                    Bundle bundle3 = new Bundle();
                    if (uri != null) {
                        Pattern pattern = (Pattern) lp1Var.d.getValue();
                        Matcher matcher = pattern != null ? pattern.matcher(uri.toString()) : null;
                        if (matcher != null && matcher.matches()) {
                            lp1Var.e(matcher, bundle3, linkedHashMap);
                            if (((Boolean) lp1Var.e.getValue()).booleanValue()) {
                                lp1Var.f(uri, bundle3, linkedHashMap);
                            }
                        }
                    }
                }
                bundle2 = null;
                op1Var = this;
                i2 = i3;
            }
            mp1 mp1Var2 = new mp1(op1Var, bundle, lp1Var.l, i, z);
            if (mp1Var == null || mp1Var2.compareTo(mp1Var) > 0) {
                bundle2 = null;
                op1Var = this;
                mp1Var = mp1Var2;
                i2 = i3;
            }
            bundle2 = null;
            op1Var = this;
            i2 = i3;
        }
        return mp1Var;
    }

    public final mp1 c(String str) {
        lp1 lp1Var;
        str.getClass();
        y91 y91Var = this.t;
        if (y91Var == null || (lp1Var = (lp1) y91Var.getValue()) == null) {
            return null;
        }
        Uri parse = Uri.parse("android-app://androidx.navigation/".concat(str));
        parse.getClass();
        Bundle d = lp1Var.d(parse, this.q);
        if (d == null) {
            return null;
        }
        return new mp1(this, d, lp1Var.l, lp1Var.b(parse), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(Object obj) {
        boolean z;
        LinkedHashMap linkedHashMap;
        boolean z2;
        if (this != obj) {
            if (obj != null && (obj instanceof op1)) {
                op1 op1Var = (op1) obj;
                yn2 yn2Var = op1Var.p;
                LinkedHashMap linkedHashMap2 = op1Var.q;
                boolean b = Intrinsics.b(this.o, op1Var.o);
                yn2 yn2Var2 = this.p;
                if (yn2Var2.f() == yn2Var.f()) {
                    Iterator it = aj2.b(new zn2(yn2Var2)).iterator();
                    while (it.hasNext()) {
                        int intValue = ((Number) it.next()).intValue();
                        if (!Intrinsics.b(yn2Var2.c(intValue), yn2Var.c(intValue))) {
                        }
                    }
                    z = true;
                    linkedHashMap = this.q;
                    if (linkedHashMap.size() == linkedHashMap2.size()) {
                        Set<Map.Entry> entrySet = linkedHashMap.entrySet();
                        entrySet.getClass();
                        for (Map.Entry entry : entrySet) {
                            if (linkedHashMap2.containsKey(entry.getKey()) && Intrinsics.b(linkedHashMap2.get(entry.getKey()), entry.getValue())) {
                            }
                        }
                        z2 = true;
                        if (this.r == op1Var.r || !Intrinsics.b(this.s, op1Var.s) || !b || !z || !z2) {
                        }
                    }
                    z2 = false;
                    if (this.r == op1Var.r) {
                    }
                }
                z = false;
                linkedHashMap = this.q;
                if (linkedHashMap.size() == linkedHashMap2.size()) {
                }
                z2 = false;
                if (this.r == op1Var.r) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = this.r * 31;
        String str = this.s;
        int hashCode = i + (str != null ? str.hashCode() : 0);
        ArrayList arrayList = this.o;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            hashCode = (((lp1) obj).a.hashCode() + (hashCode * 31)) * 961;
        }
        yn2 yn2Var = this.p;
        yn2Var.getClass();
        if (yn2Var.f() > 0) {
            yn2Var.g(0).getClass();
            b71.o();
            return 0;
        }
        LinkedHashMap linkedHashMap = this.q;
        for (String str2 : linkedHashMap.keySet()) {
            int j = in1.j(str2, hashCode * 31, 31);
            Object obj2 = linkedHashMap.get(str2);
            hashCode = j + (obj2 != null ? obj2.hashCode() : 0);
        }
        return hashCode;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(0x");
        sb.append(Integer.toHexString(this.r));
        sb.append(")");
        String str = this.s;
        if (str != null && !up2.y(str)) {
            sb.append(" route=");
            sb.append(this.s);
        }
        return sb.toString();
    }
}
