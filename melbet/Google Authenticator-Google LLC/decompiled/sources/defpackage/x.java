package defpackage;

import java.text.ParseException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class x extends bkv {
    public Map b;
    public Map c;
    private final Map e = new HashMap();
    private static final ResourceBundle d = new g();
    public static final x a = new x();

    private x() {
    }

    public final w a(String str) {
        boolean containsKey;
        u uVar;
        w wVar;
        Object[][] objArr;
        boolean z;
        Map map = this.e;
        synchronized (map) {
            containsKey = map.containsKey(str);
            uVar = null;
            wVar = containsKey ? (w) map.get(str) : null;
        }
        if (containsKey) {
            return wVar;
        }
        try {
            Object[][] objArr2 = (Object[][]) d.getObject("rules");
            int length = objArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    objArr = null;
                    break;
                }
                Object[] objArr3 = objArr2[i];
                if (str.equals(objArr3[0])) {
                    objArr = (Object[][]) objArr3[1];
                    break;
                }
                i++;
            }
            StringBuilder sb = new StringBuilder();
            for (Object[] objArr4 : objArr) {
                if (sb.length() > 0) {
                    sb.append("; ");
                }
                sb.append((String) objArr4[0]);
                sb.append(": ");
                sb.append((String) objArr4[1]);
            }
            String sb2 = sb.toString();
            w wVar2 = w.a;
            String trim = sb2.trim();
            if (trim.length() == 0) {
                wVar = w.a;
            } else {
                v vVar = new v();
                if (trim.endsWith(";")) {
                    trim = trim.substring(0, trim.length() - 1);
                }
                for (String str2 : w.g.split(trim)) {
                    u a2 = w.a(str2.trim());
                    boolean z2 = vVar.a;
                    if (a2.c == null && a2.d == null) {
                        z = false;
                        vVar.a = z2 | z;
                        vVar.a(a2);
                    }
                    z = true;
                    vVar.a = z2 | z;
                    vVar.a(a2);
                }
                List list = vVar.b;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    u uVar2 = (u) it.next();
                    if ("other".equals(uVar2.a)) {
                        it.remove();
                        uVar = uVar2;
                    }
                }
                if (uVar == null) {
                    uVar = w.a("other:");
                }
                list.add(uVar);
                wVar = new w(vVar);
            }
        } catch (ParseException | MissingResourceException unused) {
        }
        Map map2 = this.e;
        synchronized (map2) {
            if (map2.containsKey(str)) {
                wVar = (w) map2.get(str);
            } else {
                map2.put(str, wVar);
            }
        }
        return wVar;
    }

    public final void b() {
        Map map;
        Map map2;
        Map map3;
        synchronized (this) {
            map = this.b;
        }
        if (map == null) {
            try {
                ResourceBundle resourceBundle = d;
                Object[][] objArr = (Object[][]) resourceBundle.getObject("locales");
                map2 = new TreeMap();
                for (Object[] objArr2 : objArr) {
                    map2.put((String) objArr2[0], (String) objArr2[1]);
                }
                Object[][] objArr3 = (Object[][]) resourceBundle.getObject("locales_ordinals");
                map3 = new TreeMap();
                for (Object[] objArr4 : objArr3) {
                    map3.put((String) objArr4[0], (String) objArr4[1]);
                }
            } catch (MissingResourceException unused) {
                map2 = Collections.EMPTY_MAP;
                map3 = Collections.EMPTY_MAP;
            }
            synchronized (this) {
                if (this.b == null) {
                    this.b = map2;
                    this.c = map3;
                }
            }
        }
    }
}
