package com.bykv.vk.openvk.component.video.pvs.icD;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: Urls.java */
/* loaded from: classes.dex */
public class kj {
    private final int Jd;
    private int NB = -1;
    private int sUS;
    private final ArrayList<pvs> vG;
    private final int yiw;
    private static final Set<String> pvs = new HashSet();
    private static final Set<String> icD = new HashSet();

    kj(List<String> list) {
        int i;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("urls can't be empty");
        }
        int size = list.size();
        this.Jd = size;
        this.vG = new ArrayList<>(size);
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        for (String str : list) {
            pvs pvsVar = new pvs(str);
            if (pvs.contains(str)) {
                arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                arrayList2.add(pvsVar);
            } else if (icD.contains(str)) {
                arrayList = arrayList == null ? new ArrayList() : arrayList;
                arrayList.add(pvsVar);
            } else {
                this.vG.add(pvsVar);
            }
        }
        if (arrayList != null) {
            this.vG.addAll(arrayList);
        }
        if (arrayList2 != null) {
            this.vG.addAll(arrayList2);
        }
        Integer num = NB.Mxy;
        if (num == null || num.intValue() <= 0) {
            i = this.Jd >= 2 ? 1 : 2;
        } else {
            i = num.intValue();
        }
        this.yiw = i;
    }

    kj(String str) {
        ArrayList<pvs> arrayList = new ArrayList<>(1);
        this.vG = arrayList;
        arrayList.add(new pvs(str));
        this.Jd = 1;
        this.yiw = 1;
    }

    boolean pvs() {
        return this.sUS < this.yiw;
    }

    pvs icD() {
        if (!pvs()) {
            throw new NoSuchElementException();
        }
        int i = this.NB + 1;
        if (i >= this.Jd - 1) {
            this.NB = -1;
            this.sUS++;
        } else {
            this.NB = i;
        }
        pvs pvsVar = this.vG.get(i);
        pvsVar.icD = (this.sUS * this.Jd) + this.NB;
        return pvsVar;
    }

    /* compiled from: Urls.java */
    public class pvs {
        int icD;
        final String pvs;

        pvs(String str) {
            this.pvs = str;
        }

        void pvs() {
            kj.pvs.add(this.pvs);
        }

        void icD() {
            kj.icD.add(this.pvs);
        }

        public String toString() {
            return this.pvs;
        }
    }
}
