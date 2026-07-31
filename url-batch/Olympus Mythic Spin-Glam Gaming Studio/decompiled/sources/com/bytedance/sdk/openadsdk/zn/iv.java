package com.bytedance.sdk.openadsdk.zn;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class iv {
    private int cn;
    private int cyb;
    private String iv;
    private String klz;
    private JSONObject mw;
    private FilterWord olo;
    private String rc;
    private nqi rt;
    public static FilterWord zmn = new FilterWord("", "");
    public static int fs = 1;
    public static int zn = 2;
    public static int fb = 3;
    public static int btk = 4;
    private final Set<zn> hhw = new HashSet();
    private final Set<fs> nps = new HashSet();
    private final Set<fb> zg = new HashSet();
    private final Set<zmn> bvs = new HashSet();

    public interface fb {
        void zmn(String str);
    }

    public interface fs {
        void zmn(int i);
    }

    public interface zmn {
        void zmn(List<FilterWord> list);
    }

    public interface zn {
        void zmn(FilterWord filterWord);
    }

    public void zmn() {
        this.hhw.clear();
        this.nps.clear();
        this.zg.clear();
        this.bvs.clear();
    }

    public void zmn(String str) {
        this.iv = str;
    }

    public void fs(String str) {
        this.rc = str;
    }

    public void zmn(FilterWord filterWord) {
        this.olo = filterWord;
        iv();
    }

    public FilterWord fs() {
        return this.olo;
    }

    public boolean zn() {
        FilterWord filterWord = this.olo;
        return (filterWord == null || filterWord.equals(zmn)) ? false : true;
    }

    private void iv() {
        Iterator<zn> it = this.hhw.iterator();
        while (it.hasNext()) {
            it.next().zmn(this.olo);
        }
    }

    public void zmn(zn znVar) {
        this.hhw.add(znVar);
    }

    public void zmn(fs fsVar) {
        this.nps.add(fsVar);
    }

    public void zmn(fb fbVar) {
        this.zg.add(fbVar);
    }

    public void zmn(zmn zmnVar) {
        this.bvs.add(zmnVar);
    }

    public void fb() {
        nqi nqiVar;
        if (!zn() && !TextUtils.isEmpty(this.klz)) {
            this.olo = new FilterWord("0:00", this.klz);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.olo);
        if (!TextUtils.isEmpty(this.iv)) {
            if (TextUtils.isEmpty(this.klz)) {
                com.bytedance.sdk.openadsdk.zn.fs.zmn().zmn(this.iv, arrayList, this.rc);
            } else {
                if (this.mw == null && (nqiVar = this.rt) != null) {
                    this.mw = nqiVar.mw(true);
                }
                com.bytedance.sdk.openadsdk.zn.fs.zmn().zmn(this.iv, arrayList, this.mw, this.klz, this.rc);
            }
        }
        Iterator<fs> it = this.nps.iterator();
        while (it.hasNext()) {
            it.next().zmn(fs);
        }
        zmn(zmn);
        zn("");
    }

    public void btk() {
        Iterator<fs> it = this.nps.iterator();
        while (it.hasNext()) {
            it.next().zmn(zn);
        }
    }

    public void hhw() {
        Iterator<fs> it = this.nps.iterator();
        while (it.hasNext()) {
            it.next().zmn(btk);
        }
    }

    public void zmn(List<FilterWord> list) {
        Iterator<zmn> it = this.bvs.iterator();
        while (it.hasNext()) {
            it.next().zmn(list);
        }
    }

    public void zn(String str) {
        this.klz = str;
        Iterator<fb> it = this.zg.iterator();
        while (it.hasNext()) {
            it.next().zmn(this.klz);
        }
    }

    public String nps() {
        return this.klz;
    }

    public void zmn(nqi nqiVar) {
        this.rt = nqiVar;
    }

    public void zmn(int i, int i2) {
        this.cn = i;
        this.cyb = i2;
    }

    public int zg() {
        return this.cn;
    }

    public boolean bvs() {
        return this.cn < this.cyb;
    }
}
