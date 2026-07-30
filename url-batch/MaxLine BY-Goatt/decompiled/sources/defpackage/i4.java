package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class i4 {
    public final LinkedHashMap a = new LinkedHashMap();
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap c = new LinkedHashMap();
    public final ArrayList d = new ArrayList();
    public final transient LinkedHashMap e = new LinkedHashMap();
    public final LinkedHashMap f = new LinkedHashMap();
    public final Bundle g = new Bundle();

    public final boolean a(int i, int i2, Intent intent) {
        String str = (String) this.a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        f4 f4Var = (f4) this.e.get(str);
        if ((f4Var != null ? f4Var.a : null) != null) {
            ArrayList arrayList = this.d;
            if (arrayList.contains(str)) {
                f4Var.a.a(f4Var.b.parseResult(i2, intent));
                arrayList.remove(str);
                return true;
            }
        }
        this.f.remove(str);
        this.g.putParcelable(str, new t3(i2, intent));
        return true;
    }

    public abstract void b(int i, w3 w3Var, Object obj);

    public final h4 c(String str, w3 w3Var, u3 u3Var) {
        str.getClass();
        w3Var.getClass();
        e(str);
        this.e.put(str, new f4(w3Var, u3Var));
        LinkedHashMap linkedHashMap = this.f;
        if (linkedHashMap.containsKey(str)) {
            Object obj = linkedHashMap.get(str);
            linkedHashMap.remove(str);
            u3Var.a(obj);
        }
        Bundle bundle = this.g;
        t3 t3Var = (t3) yj1.B(bundle, str);
        if (t3Var != null) {
            bundle.remove(str);
            u3Var.a(w3Var.parseResult(t3Var.m, t3Var.n));
        }
        return new h4(this, str, w3Var, 1);
    }

    public final h4 d(final String str, id1 id1Var, final w3 w3Var, final u3 u3Var) {
        str.getClass();
        w3Var.getClass();
        u3Var.getClass();
        ad1 lifecycle = id1Var.getLifecycle();
        if (lifecycle.b().compareTo(zc1.p) >= 0) {
            StringBuilder sb = new StringBuilder("LifecycleOwner ");
            sb.append(id1Var);
            zc1 b = lifecycle.b();
            sb.append(" is attempting to register while current state is ");
            sb.append(b);
            sb.append(". LifecycleOwners must call register before they are STARTED.");
            throw new IllegalStateException(sb.toString().toString());
        }
        e(str);
        LinkedHashMap linkedHashMap = this.c;
        g4 g4Var = (g4) linkedHashMap.get(str);
        if (g4Var == null) {
            g4Var = new g4(lifecycle);
        }
        fd1 fd1Var = new fd1() { // from class: d4
            @Override // defpackage.fd1
            public final void o(id1 id1Var2, yc1 yc1Var) {
                yc1 yc1Var2 = yc1.ON_START;
                i4 i4Var = i4.this;
                String str2 = str;
                if (yc1Var2 != yc1Var) {
                    if (yc1.ON_STOP == yc1Var) {
                        i4Var.e.remove(str2);
                        return;
                    } else {
                        if (yc1.ON_DESTROY == yc1Var) {
                            i4Var.f(str2);
                            return;
                        }
                        return;
                    }
                }
                LinkedHashMap linkedHashMap2 = i4Var.e;
                Bundle bundle = i4Var.g;
                LinkedHashMap linkedHashMap3 = i4Var.f;
                w3 w3Var2 = w3Var;
                u3 u3Var2 = u3Var;
                linkedHashMap2.put(str2, new f4(w3Var2, u3Var2));
                if (linkedHashMap3.containsKey(str2)) {
                    Object obj = linkedHashMap3.get(str2);
                    linkedHashMap3.remove(str2);
                    u3Var2.a(obj);
                }
                t3 t3Var = (t3) yj1.B(bundle, str2);
                if (t3Var != null) {
                    bundle.remove(str2);
                    u3Var2.a(w3Var2.parseResult(t3Var.m, t3Var.n));
                }
            }
        };
        g4Var.a.a(fd1Var);
        g4Var.b.add(fd1Var);
        linkedHashMap.put(str, g4Var);
        return new h4(this, str, w3Var, 0);
    }

    public final void e(String str) {
        LinkedHashMap linkedHashMap = this.b;
        if (((Integer) linkedHashMap.get(str)) != null) {
            return;
        }
        e4 e4Var = new e4(0);
        Iterator it = new t10(new ps2(e4Var, new a0(12, e4Var))).iterator();
        while (it.hasNext()) {
            Number number = (Number) it.next();
            Integer valueOf = Integer.valueOf(number.intValue());
            LinkedHashMap linkedHashMap2 = this.a;
            if (!linkedHashMap2.containsKey(valueOf)) {
                int intValue = number.intValue();
                linkedHashMap2.put(Integer.valueOf(intValue), str);
                linkedHashMap.put(str, Integer.valueOf(intValue));
                return;
            }
        }
        ch2.k("Sequence contains no element matching the predicate.");
    }

    public final void f(String str) {
        Integer num;
        str.getClass();
        if (!this.d.contains(str) && (num = (Integer) this.b.remove(str)) != null) {
            this.a.remove(num);
        }
        this.e.remove(str);
        LinkedHashMap linkedHashMap = this.f;
        if (linkedHashMap.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + linkedHashMap.get(str));
            linkedHashMap.remove(str);
        }
        Bundle bundle = this.g;
        if (bundle.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((t3) yj1.B(bundle, str)));
            bundle.remove(str);
        }
        LinkedHashMap linkedHashMap2 = this.c;
        g4 g4Var = (g4) linkedHashMap2.get(str);
        if (g4Var != null) {
            ArrayList arrayList = g4Var.b;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                g4Var.a.c((fd1) obj);
            }
            arrayList.clear();
            linkedHashMap2.remove(str);
        }
    }
}
