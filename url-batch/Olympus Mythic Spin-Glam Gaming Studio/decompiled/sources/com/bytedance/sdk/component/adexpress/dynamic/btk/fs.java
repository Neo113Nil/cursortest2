package com.bytedance.sdk.component.adexpress.dynamic.btk;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.fs.mw;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class fs {
    private double btk;
    private mw bvs;
    private int hhw;
    private double nps;
    private String zg;
    public Map<String, zn> zmn = new HashMap();
    public Map<String, zn> fs = new HashMap();
    public Map<String, zn> zn = new HashMap();
    private double fb = Math.random();

    public fs(double d, int i, double d2, String str, mw mwVar) {
        this.btk = d;
        this.hhw = i;
        this.nps = d2;
        this.zg = str;
        this.bvs = mwVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zn zmn(com.bytedance.sdk.component.adexpress.dynamic.fb.zg zgVar, float f, float f2) {
        float f3;
        if (TextUtils.isEmpty(zgVar.iv().zn()) && zgVar.iv().btk().hwg() == null) {
            return new zn(0.0f, 0.0f);
        }
        if (TextUtils.equals(zgVar.iv().fs(), "creative-playable-bait")) {
            return new zn(0.0f, 0.0f);
        }
        float zg = zgVar.zg();
        float bvs = zgVar.bvs();
        com.bytedance.sdk.component.adexpress.dynamic.fb.hhw btk = zgVar.iv().btk();
        String zak = btk.zak();
        String kjb = btk.kjb();
        float mw = zgVar.mw();
        float rt = zgVar.rt();
        float cn = zgVar.cn();
        float cyb = zgVar.cyb();
        if (TextUtils.equals(zak, "fixed")) {
            f = Math.min(zg, f);
            if (TextUtils.equals(kjb, "auto")) {
                f3 = fs(zgVar, f - cn, f2 - cyb).fs;
                bvs = f3 + cyb;
            }
            if (TextUtils.equals(kjb, "scale")) {
                float round = Math.round((f - mw) / bvs) + rt;
                if (round > f2) {
                    f = Math.round((f2 - rt) * bvs) + mw;
                } else {
                    f2 = round;
                }
            } else if (TextUtils.equals(kjb, "fixed")) {
                f2 = Math.min(bvs + rt, f2);
            } else if (!TextUtils.equals(kjb, "flex")) {
                f2 = bvs;
            }
            zn znVar = new zn();
            znVar.zmn = f;
            znVar.fs = f2;
            return znVar;
        }
        if (TextUtils.equals(zak, "auto")) {
            zn fs = fs(zgVar, f - cn, f2 - cyb);
            f = fs.zmn + cn;
            if (TextUtils.equals(kjb, "auto")) {
                f3 = fs.fs;
                bvs = f3 + cyb;
            }
            if (TextUtils.equals(kjb, "scale")) {
            }
            zn znVar2 = new zn();
            znVar2.zmn = f;
            znVar2.fs = f2;
            return znVar2;
        }
        if (!TextUtils.equals(zak, "flex")) {
            f = zg;
        } else if (TextUtils.equals(kjb, "auto")) {
            f3 = fs(zgVar, f - cn, f2 - cyb).fs;
            bvs = f3 + cyb;
        }
        if (TextUtils.equals(kjb, "scale")) {
        }
        zn znVar22 = new zn();
        znVar22.zmn = f;
        znVar22.fs = f2;
        return znVar22;
    }

    public zn fs(com.bytedance.sdk.component.adexpress.dynamic.fb.zg zgVar, float f, float f2) {
        zn znVar = new zn();
        if (zgVar.iv().btk() == null) {
            return znVar;
        }
        zn btk = btk(zgVar, f, f2);
        float f3 = btk.zmn;
        float f4 = btk.fs;
        znVar.zmn = Math.min(f3, f);
        znVar.fs = Math.min(f4, f2);
        return znVar;
    }

    private zn btk(com.bytedance.sdk.component.adexpress.dynamic.fb.zg zgVar, float f, float f2) {
        String str = zgVar.zn() + "_" + f + "_" + f2;
        if (this.zn.containsKey(str)) {
            return this.zn.get(str);
        }
        zn hhw = hhw(zgVar, f, f2);
        this.zn.put(str, hhw);
        return hhw;
    }

    private zn hhw(com.bytedance.sdk.component.adexpress.dynamic.fb.zg zgVar, float f, float f2) {
        new zn();
        com.bytedance.sdk.component.adexpress.dynamic.fb.hhw btk = zgVar.iv().btk();
        zgVar.iv().zn();
        btk.bxw();
        float kgc = btk.kgc();
        int mhu = btk.mhu();
        double na = btk.na();
        int tet = btk.tet();
        boolean yof = btk.yof();
        boolean yo = btk.yo();
        int dgt = btk.dgt();
        C0119fs c0119fs = new C0119fs();
        c0119fs.zmn = kgc;
        c0119fs.fs = mhu;
        c0119fs.zn = tet;
        c0119fs.fb = na;
        c0119fs.btk = f;
        return zmn(zgVar.iv().zn(), c0119fs, yof, yo, dgt, zgVar);
    }

    private zn zmn(String str, C0119fs c0119fs, boolean z, boolean z2, int i, com.bytedance.sdk.component.adexpress.dynamic.fb.zg zgVar) {
        return rc.zmn(str, zgVar.iv().fs(), C0119fs.zmn(c0119fs).toString(), z, z2, i, zgVar, this.btk, this.hhw, this.nps, this.zg, this.bvs);
    }

    public zn zn(com.bytedance.sdk.component.adexpress.dynamic.fb.zg zgVar, float f, float f2) {
        if (zgVar == null) {
            return null;
        }
        zn zmn2 = zmn(zgVar);
        if (zmn2 != null && (zmn2.zmn != 0.0f || zmn2.fs != 0.0f)) {
            return zmn2;
        }
        zn fb = fb(zgVar, f, f2);
        zmn(zgVar, fb);
        return fb;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zn fb(com.bytedance.sdk.component.adexpress.dynamic.fb.zg zgVar, float f, float f2) {
        float min;
        Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.fb.zg>> it;
        zn znVar = new zn();
        float f3 = 0.0f;
        if (f2 <= 0.0f || f <= 0.0f) {
            znVar.zmn = 0.0f;
            znVar.fs = 0.0f;
            return znVar;
        }
        if (zgVar.kgc()) {
            return zmn(zgVar, f, f2);
        }
        float zg = zgVar.zg();
        float bvs = zgVar.bvs();
        float cn = zgVar.cn();
        float cyb = zgVar.cyb();
        com.bytedance.sdk.component.adexpress.dynamic.fb.hhw btk = zgVar.iv().btk();
        String zak = btk.zak();
        String kjb = btk.kjb();
        float min2 = ((TextUtils.equals(zak, "flex") || TextUtils.equals(zak, "auto")) ? f : Math.min(zg, f)) - cn;
        if (TextUtils.equals(kjb, "scale")) {
            min = Math.round(min2 / bvs) + cyb;
            if (min > f2) {
                min2 = Math.round((f2 - cyb) * bvs);
                min = f2;
            }
            float f4 = min - cyb;
            List<List<com.bytedance.sdk.component.adexpress.dynamic.fb.zg>> olo = zgVar.olo();
            it = olo.iterator();
            float f5 = 0.0f;
            float f6 = 0.0f;
            while (it.hasNext()) {
                Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.fb.zg>> it2 = it;
                List<com.bytedance.sdk.component.adexpress.dynamic.fb.zg> next = it.next();
                zn znVar2 = znVar;
                zn fs = fs(next, min2, f4);
                if (fs(next)) {
                    f3 += 1.0f;
                } else {
                    f5 = Math.max(f5, fs.zmn);
                }
                float f7 = f3;
                if (zgVar.iv().fs().equals("carousel")) {
                    f6 = Math.max(zgVar.bvs(), fs.fs);
                } else {
                    f6 += fs.fs;
                }
                znVar = znVar2;
                it = it2;
                f3 = f7;
            }
            zn znVar3 = znVar;
            if (TextUtils.equals(zak, "auto")) {
                if (f3 == olo.size()) {
                    min2 = f;
                } else {
                    for (List<com.bytedance.sdk.component.adexpress.dynamic.fb.zg> list : olo) {
                        zn(list);
                        fs(list, f5, f4);
                    }
                    min2 = f5;
                }
            }
            if (TextUtils.equals(kjb, "auto")) {
                if (f6 <= f2) {
                    f4 = f6;
                } else {
                    zmn(olo, min2, f4);
                }
            } else if ((TextUtils.equals(kjb, "fixed") || TextUtils.equals(kjb, "flex")) && f4 < f6) {
                zmn(olo, min2, f4);
            }
            znVar3.zmn = Math.min(min2 + cn, f);
            znVar3.fs = Math.min(f4 + cyb, f2);
            return znVar3;
        }
        if (!TextUtils.equals(kjb, "auto") && !TextUtils.equals(kjb, "flex")) {
            min = Math.min(bvs, f2);
            float f42 = min - cyb;
            List<List<com.bytedance.sdk.component.adexpress.dynamic.fb.zg>> olo2 = zgVar.olo();
            it = olo2.iterator();
            float f52 = 0.0f;
            float f62 = 0.0f;
            while (it.hasNext()) {
            }
            zn znVar32 = znVar;
            if (TextUtils.equals(zak, "auto")) {
            }
            if (TextUtils.equals(kjb, "auto")) {
            }
            znVar32.zmn = Math.min(min2 + cn, f);
            znVar32.fs = Math.min(f42 + cyb, f2);
            return znVar32;
        }
        min = f2;
        float f422 = min - cyb;
        List<List<com.bytedance.sdk.component.adexpress.dynamic.fb.zg>> olo22 = zgVar.olo();
        it = olo22.iterator();
        float f522 = 0.0f;
        float f622 = 0.0f;
        while (it.hasNext()) {
        }
        zn znVar322 = znVar;
        if (TextUtils.equals(zak, "auto")) {
        }
        if (TextUtils.equals(kjb, "auto")) {
        }
        znVar322.zmn = Math.min(min2 + cn, f);
        znVar322.fs = Math.min(f422 + cyb, f2);
        return znVar322;
    }

    private void zmn(List<List<com.bytedance.sdk.component.adexpress.dynamic.fb.zg>> list, float f, float f2) {
        if (list == null || list.size() <= 0) {
            return;
        }
        Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.fb.zg>> it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (zmn(it.next(), false)) {
                z = true;
            }
        }
        ArrayList arrayList = new ArrayList();
        for (List<com.bytedance.sdk.component.adexpress.dynamic.fb.zg> list2 : list) {
            zmn zmnVar = new zmn();
            boolean zmn2 = zmn(list2, !z);
            zmnVar.zmn = zmn2 ? 1.0f : fs(list2, f, f2).fs;
            zmnVar.fs = !zmn2;
            arrayList.add(zmnVar);
        }
        List<zmn> zmn3 = iv.zmn(f2, arrayList);
        for (int i = 0; i < list.size(); i++) {
            if (((zmn) arrayList.get(i)).zmn != zmn3.get(i).zmn) {
                List<com.bytedance.sdk.component.adexpress.dynamic.fb.zg> list3 = list.get(i);
                zn(list3);
                fs(list3, f, zmn3.get(i).zmn);
            }
        }
    }

    private boolean fs(List<com.bytedance.sdk.component.adexpress.dynamic.fb.zg> list) {
        List<List<com.bytedance.sdk.component.adexpress.dynamic.fb.zg>> olo;
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.fb.zg> it = list.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(it.next().iv().btk().zak(), "flex")) {
                return true;
            }
        }
        while (true) {
            boolean z = false;
            for (com.bytedance.sdk.component.adexpress.dynamic.fb.zg zgVar : list) {
                if (TextUtils.equals(zgVar.iv().btk().zak(), "auto") && (olo = zgVar.olo()) != null) {
                    int i = 0;
                    for (List<com.bytedance.sdk.component.adexpress.dynamic.fb.zg> list2 : olo) {
                        i++;
                        if (!fs(list2)) {
                            break;
                        }
                        if (i == list2.size()) {
                            z = true;
                        }
                    }
                }
            }
            return z;
        }
    }

    private zn fs(List<com.bytedance.sdk.component.adexpress.dynamic.fb.zg> list, float f, float f2) {
        zn zmn2 = zmn(list);
        if (zmn2 != null && (zmn2.zmn != 0.0f || zmn2.fs != 0.0f)) {
            return zmn2;
        }
        zn zn2 = zn(list, f, f2);
        zmn(list, zn2);
        return zn2;
    }

    private zn zn(List<com.bytedance.sdk.component.adexpress.dynamic.fb.zg> list, float f, float f2) {
        float f3;
        fb(list);
        zn znVar = new zn();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (com.bytedance.sdk.component.adexpress.dynamic.fb.zg zgVar : list) {
            com.bytedance.sdk.component.adexpress.dynamic.fb.hhw btk = zgVar.iv().btk();
            if (btk.xrr() == 1 || btk.xrr() == 2) {
                arrayList.add(zgVar);
            }
            if (btk.xrr() != 1 && btk.xrr() != 2) {
                arrayList2.add(zgVar);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            zn((com.bytedance.sdk.component.adexpress.dynamic.fb.zg) it.next(), f, f2);
        }
        if (arrayList2.size() <= 0) {
            return znVar;
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.fb.zg> it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(Float.valueOf(zn(it2.next(), f, f2).zmn));
        }
        ArrayList arrayList4 = new ArrayList();
        int i = 0;
        while (true) {
            if (i >= arrayList2.size()) {
                break;
            }
            com.bytedance.sdk.component.adexpress.dynamic.fb.zg zgVar2 = arrayList2.get(i);
            String zak = zgVar2.iv().btk().zak();
            float zg = zgVar2.zg();
            boolean equals = TextUtils.equals(zak, "flex");
            if (TextUtils.equals(zak, "auto")) {
                List<List<com.bytedance.sdk.component.adexpress.dynamic.fb.zg>> olo = zgVar2.olo();
                if (olo != null && olo.size() > 0) {
                    Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.fb.zg>> it3 = olo.iterator();
                    while (it3.hasNext()) {
                        if (fs(it3.next())) {
                            equals = true;
                            break;
                        }
                    }
                }
                equals = false;
            }
            zmn zmnVar = new zmn();
            if (!equals) {
                zg = ((Float) arrayList3.get(i)).floatValue();
            }
            zmnVar.zmn = zg;
            zmnVar.fs = !equals;
            if (equals) {
                f3 = ((Float) arrayList3.get(i)).floatValue();
            }
            zmnVar.zn = f3;
            arrayList4.add(zmnVar);
            i++;
        }
        zmn(arrayList4, f, arrayList2);
        List<zmn> zmn2 = iv.zmn(f, arrayList4);
        float f4 = 0.0f;
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            f4 += zmn2.get(i2).zmn;
            if (((Float) arrayList3.get(i2)).floatValue() != zmn2.get(i2).zmn) {
                fb(arrayList2.get(i2));
            }
        }
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.fb.zg> it4 = arrayList2.iterator();
        int i3 = 0;
        boolean z = false;
        while (true) {
            if (!it4.hasNext()) {
                break;
            }
            i3++;
            if (!fs(it4.next())) {
                z = false;
                break;
            }
            if (i3 == arrayList2.size()) {
                z = true;
            }
        }
        f3 = z ? f2 : 0.0f;
        ArrayList arrayList5 = new ArrayList();
        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
            com.bytedance.sdk.component.adexpress.dynamic.fb.zg zgVar3 = arrayList2.get(i4);
            zn zn2 = zn(zgVar3, zmn2.get(i4).zmn, f2);
            if (!fs(zgVar3)) {
                f3 = Math.max(f3, zn2.fs);
            }
            arrayList5.add(zn2);
        }
        ArrayList arrayList6 = new ArrayList();
        Iterator it5 = arrayList5.iterator();
        while (it5.hasNext()) {
            arrayList6.add(Float.valueOf(((zn) it5.next()).fs));
        }
        if (!z) {
            for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                com.bytedance.sdk.component.adexpress.dynamic.fb.zg zgVar4 = arrayList2.get(i5);
                if (fs(zgVar4) && ((Float) arrayList6.get(i5)).floatValue() != f3) {
                    fb(zgVar4);
                    zn(zgVar4, zmn2.get(i5).zmn, f3);
                }
            }
        }
        znVar.zmn = f4;
        znVar.fs = f3;
        return znVar;
    }

    private boolean fs(com.bytedance.sdk.component.adexpress.dynamic.fb.zg zgVar) {
        if (zgVar == null) {
            return false;
        }
        if (TextUtils.equals(zgVar.iv().btk().kjb(), "flex")) {
            return true;
        }
        return zn(zgVar);
    }

    private boolean zn(com.bytedance.sdk.component.adexpress.dynamic.fb.zg zgVar) {
        List<List<com.bytedance.sdk.component.adexpress.dynamic.fb.zg>> olo;
        if (!zgVar.kgc() && TextUtils.equals(zgVar.iv().btk().kjb(), "auto") && (olo = zgVar.olo()) != null && olo.size() > 0) {
            if (olo.size() == 1) {
                Iterator<com.bytedance.sdk.component.adexpress.dynamic.fb.zg> it = olo.get(0).iterator();
                while (it.hasNext()) {
                    if (!fs(it.next())) {
                        return false;
                    }
                }
                return true;
            }
            Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.fb.zg>> it2 = olo.iterator();
            while (it2.hasNext()) {
                if (zmn(it2.next(), true)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean zmn(List<com.bytedance.sdk.component.adexpress.dynamic.fb.zg> list, boolean z) {
        for (com.bytedance.sdk.component.adexpress.dynamic.fb.zg zgVar : list) {
            com.bytedance.sdk.component.adexpress.dynamic.fb.hhw btk = zgVar.iv().btk();
            String kjb = btk.kjb();
            if (TextUtils.equals(kjb, "flex") || (z && ((TextUtils.equals(btk.zak(), "flex") && TextUtils.equals(btk.kjb(), "scale") && com.bytedance.sdk.component.adexpress.dynamic.fb.btk.zmn.get(zgVar.iv().fs()).intValue() == 7) || TextUtils.equals(kjb, "flex")))) {
                return true;
            }
        }
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.fb.zg> it = list.iterator();
        while (it.hasNext()) {
            if (zn(it.next())) {
                return true;
            }
        }
        return false;
    }

    private void zmn(List<zmn> list, float f, List<com.bytedance.sdk.component.adexpress.dynamic.fb.zg> list2) {
        float f2 = 0.0f;
        for (zmn zmnVar : list) {
            if (zmnVar.fs) {
                f2 += zmnVar.zmn;
            }
        }
        if (f2 > f) {
            int i = 0;
            for (int i2 = 0; i2 < list2.size(); i2++) {
                if (list.get(i2).fs && list2.get(i2).doe()) {
                    i++;
                }
            }
            if (i > 0) {
                float ceil = (float) (Math.ceil(((f2 - f) / i) * 1000.0f) / 1000.0d);
                for (int i3 = 0; i3 < list2.size(); i3++) {
                    zmn zmnVar2 = list.get(i3);
                    if (zmnVar2.fs && list2.get(i3).doe()) {
                        zmnVar2.zmn -= ceil;
                    }
                }
            }
        }
    }

    public void zmn() {
        this.zn.clear();
        this.zmn.clear();
        this.fs.clear();
    }

    public zn zmn(com.bytedance.sdk.component.adexpress.dynamic.fb.zg zgVar) {
        return this.zmn.get(btk(zgVar));
    }

    public zn zmn(List<com.bytedance.sdk.component.adexpress.dynamic.fb.zg> list) {
        return this.fs.get(fb(list));
    }

    private void fb(com.bytedance.sdk.component.adexpress.dynamic.fb.zg zgVar) {
        this.zmn.remove(btk(zgVar));
        List<List<com.bytedance.sdk.component.adexpress.dynamic.fb.zg>> olo = zgVar.olo();
        if (olo == null || olo.size() <= 0) {
            return;
        }
        Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.fb.zg>> it = olo.iterator();
        while (it.hasNext()) {
            zn(it.next());
        }
    }

    private void zn(List<com.bytedance.sdk.component.adexpress.dynamic.fb.zg> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        this.fs.remove(fb(list));
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.fb.zg> it = list.iterator();
        while (it.hasNext()) {
            fb(it.next());
        }
    }

    private String btk(com.bytedance.sdk.component.adexpress.dynamic.fb.zg zgVar) {
        return zgVar.zn();
    }

    private String fb(List<com.bytedance.sdk.component.adexpress.dynamic.fb.zg> list) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            String zn2 = list.get(i).zn();
            if (i < list.size() - 1) {
                sb.append(zn2);
                sb.append("-");
            } else {
                sb.append(zn2);
            }
        }
        return sb.toString();
    }

    private void zmn(com.bytedance.sdk.component.adexpress.dynamic.fb.zg zgVar, zn znVar) {
        this.zmn.put(btk(zgVar), znVar);
    }

    private void zmn(List<com.bytedance.sdk.component.adexpress.dynamic.fb.zg> list, zn znVar) {
        this.fs.put(fb(list), znVar);
    }

    static class zn {
        float fs;
        float zmn;

        public zn() {
        }

        public zn(float f, float f2) {
            this.zmn = f;
            this.fs = f2;
        }

        public String toString() {
            return "UnitSize{width=" + this.zmn + ", height=" + this.fs + '}';
        }
    }

    /* renamed from: com.bytedance.sdk.component.adexpress.dynamic.btk.fs$fs, reason: collision with other inner class name */
    static class C0119fs {
        float btk;
        double fb;
        int fs;
        float zmn;
        int zn;

        C0119fs() {
        }

        static JSONObject zmn(C0119fs c0119fs) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("fontSize", c0119fs.zmn);
                jSONObject.put("letterSpacing", c0119fs.fs);
                jSONObject.put("lineHeight", c0119fs.fb);
                jSONObject.put("maxWidth", c0119fs.btk);
                jSONObject.put("fontWeight", c0119fs.zn);
            } catch (JSONException unused) {
            }
            return jSONObject;
        }
    }

    static class zmn implements Cloneable {
        boolean fs;
        float zmn;
        float zn;

        zmn() {
        }

        public Object clone() {
            try {
                return (zmn) super.clone();
            } catch (CloneNotSupportedException unused) {
                return null;
            }
        }
    }
}
