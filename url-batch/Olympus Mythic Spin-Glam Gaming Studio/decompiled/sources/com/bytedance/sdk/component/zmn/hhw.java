package com.bytedance.sdk.component.zmn;

import com.bytedance.sdk.component.zmn.zn;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.json.JSONException;

/* loaded from: classes15.dex */
class hhw {
    private final rc nps;
    private final com.bytedance.sdk.component.zmn.zmn zg;
    private final nps zmn;
    private final Map<String, fs> fs = new HashMap();
    private final olo<String, kgc> zn = new olo<>();
    private final Map<String, zn.fs> fb = new HashMap();
    private final List<rt> btk = new ArrayList();
    private final Set<zn> hhw = new HashSet();

    hhw(bvs bvsVar, com.bytedance.sdk.component.zmn.zmn zmnVar) {
        this.zg = zmnVar;
        this.zmn = bvsVar.fb;
        this.nps = bvsVar.zg;
    }

    zmn zmn(rt rtVar, btk btkVar) throws Exception {
        fs fsVar = this.fs.get(rtVar.fb);
        if (fsVar != null) {
            try {
                if (fsVar instanceof fb) {
                    rtVar.toString();
                    return zmn(rtVar, (fb) fsVar, btkVar);
                }
            } catch (IllegalStateException unused) {
                rtVar.toString();
                this.btk.add(rtVar);
                return new zmn(false, kw.zmn());
            }
        }
        kgc zmn2 = this.zn.zmn(rtVar.fb);
        if (zmn2 != null) {
            rtVar.toString();
            return zmn(rtVar, zmn2, btkVar);
        }
        zn.fs fsVar2 = this.fb.get(rtVar.fb);
        if (fsVar2 != null) {
            zn zmn3 = fsVar2.zmn();
            zmn3.zmn(rtVar.fb);
            rtVar.toString();
            return zmn(rtVar, zmn3, btkVar);
        }
        rtVar.toString();
        return null;
    }

    void zmn(String str, fb<?, ?> fbVar) {
        fbVar.zmn(str);
        this.fs.put(str, fbVar);
    }

    void zmn(Set<String> set, kgc<?, ?> kgcVar) {
        kgcVar.zmn(set);
        this.zn.zmn(set, kgcVar);
        Objects.toString(set);
    }

    void zmn(String str, zn.fs fsVar) {
        this.fb.put(str, fsVar);
    }

    void zmn() {
        Iterator<zn> it = this.hhw.iterator();
        while (it.hasNext()) {
            it.next().btk();
        }
        this.hhw.clear();
        this.fs.clear();
        this.fb.clear();
        this.zn.zmn();
    }

    private zmn zmn(rt rtVar, fb fbVar, btk btkVar) throws Exception {
        return new zmn(true, kw.zmn(this.zmn.zmn((nps) fbVar.zmn(rtVar.fb, zmn(rtVar.btk, (fs) fbVar), btkVar)), fbVar.fs()));
    }

    private zmn zmn(final rt rtVar, final zn znVar, btk btkVar) throws Exception {
        this.hhw.add(znVar);
        znVar.zmn(zmn(rtVar.btk, znVar), btkVar, new zn.zmn() { // from class: com.bytedance.sdk.component.zmn.hhw.1
            @Override // com.bytedance.sdk.component.zmn.zn.zmn
            public void zmn(Object obj) {
                if (hhw.this.zg == null) {
                    return;
                }
                hhw.this.zg.fs(kw.zmn(hhw.this.zmn.zmn((nps) obj), znVar.fs()), rtVar);
                hhw.this.hhw.remove(znVar);
            }

            @Override // com.bytedance.sdk.component.zmn.zn.zmn
            public void zmn(Throwable th) {
                if (hhw.this.zg == null) {
                    return;
                }
                hhw.this.zg.fs(kw.zmn(th), rtVar);
                hhw.this.hhw.remove(znVar);
            }
        });
        return new zmn(false, kw.zmn());
    }

    private Object zmn(String str, fs fsVar) throws JSONException {
        return this.zmn.zmn(str, zmn(fsVar)[0]);
    }

    private static Type[] zmn(Object obj) {
        Type genericSuperclass = obj.getClass().getGenericSuperclass();
        if (genericSuperclass == null) {
            throw new IllegalStateException("Method is not parameterized?!");
        }
        return ((ParameterizedType) genericSuperclass).getActualTypeArguments();
    }

    static final class zmn {
        String fs;
        boolean zmn;

        private zmn(boolean z, String str) {
            this.zmn = z;
            this.fs = str;
        }
    }
}
