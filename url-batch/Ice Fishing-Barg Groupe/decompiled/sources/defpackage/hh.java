package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class hh implements pr0 {
    public static final gh Companion = new gh();

    /* JADX WARN: Removed duplicated region for block: B:12:0x0064  */
    @Override // defpackage.pr0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final nv1 PxuCJdSBwIXG(ps1 ps1Var) {
        jh jhVar;
        nv1 nv1Var;
        int i;
        int i2;
        jh jhVar2;
        int i3;
        String str;
        System.currentTimeMillis();
        xb xbVar = ps1Var.e9gEMXR7LXtO;
        jh jhVar3 = new jh(xbVar, null);
        ch chVar = (ch) xbVar.a92UlCVFR9N8;
        if (chVar == null) {
            bh bhVar = ch.Companion;
            hj0 hj0Var = (hj0) xbVar.Y1f8riQaR6yg;
            bhVar.getClass();
            hj0Var.getClass();
            int size = hj0Var.size();
            String str2 = null;
            int i4 = 0;
            boolean z = true;
            boolean z2 = false;
            boolean z3 = false;
            int i5 = -1;
            int i6 = -1;
            boolean z4 = false;
            boolean z5 = false;
            boolean z6 = false;
            int i7 = -1;
            int i8 = -1;
            boolean z7 = false;
            boolean z8 = false;
            boolean z9 = false;
            while (i4 < size) {
                String lS5Rgt96tfkO = hj0Var.lS5Rgt96tfkO(i4);
                String Y1f8riQaR6yg = hj0Var.Y1f8riQaR6yg(i4);
                if (lS5Rgt96tfkO.equalsIgnoreCase("Cache-Control")) {
                    if (str2 == null) {
                        str2 = Y1f8riQaR6yg;
                        i2 = 0;
                        while (i2 < Y1f8riQaR6yg.length()) {
                            int length = Y1f8riQaR6yg.length();
                            int i9 = i2;
                            while (true) {
                                if (i9 >= length) {
                                    jhVar2 = jhVar3;
                                    i3 = size;
                                    i9 = Y1f8riQaR6yg.length();
                                    break;
                                }
                                jhVar2 = jhVar3;
                                i3 = size;
                                if (ia2.D0aTLcX6Uhyo("=,;", Y1f8riQaR6yg.charAt(i9))) {
                                    break;
                                }
                                i9++;
                                jhVar3 = jhVar2;
                                size = i3;
                            }
                            String obj = ia2.GlTbNTgfSMqy(Y1f8riQaR6yg.substring(i2, i9)).toString();
                            if (i9 == Y1f8riQaR6yg.length() || Y1f8riQaR6yg.charAt(i9) == ',' || Y1f8riQaR6yg.charAt(i9) == ';') {
                                i2 = i9 + 1;
                                str = null;
                            } else {
                                int i10 = i9 + 1;
                                byte[] bArr = kv2.PxuCJdSBwIXG;
                                int length2 = Y1f8riQaR6yg.length();
                                while (true) {
                                    if (i10 >= length2) {
                                        i10 = Y1f8riQaR6yg.length();
                                        break;
                                    }
                                    char charAt = Y1f8riQaR6yg.charAt(i10);
                                    if (charAt != ' ' && charAt != '\t') {
                                        break;
                                    }
                                    i10++;
                                }
                                if (i10 >= Y1f8riQaR6yg.length() || Y1f8riQaR6yg.charAt(i10) != '\"') {
                                    int length3 = Y1f8riQaR6yg.length();
                                    int i11 = i10;
                                    while (true) {
                                        if (i11 >= length3) {
                                            i11 = Y1f8riQaR6yg.length();
                                            break;
                                        }
                                        int i12 = length3;
                                        if (ia2.D0aTLcX6Uhyo(",;", Y1f8riQaR6yg.charAt(i11))) {
                                            break;
                                        }
                                        i11++;
                                        length3 = i12;
                                    }
                                    int i13 = i11;
                                    str = ia2.GlTbNTgfSMqy(Y1f8riQaR6yg.substring(i10, i11)).toString();
                                    i2 = i13;
                                } else {
                                    int i14 = i10 + 1;
                                    int rxipThha848g = ia2.rxipThha848g(Y1f8riQaR6yg, '\"', i14, 4);
                                    str = Y1f8riQaR6yg.substring(i14, rxipThha848g);
                                    i2 = rxipThha848g + 1;
                                }
                            }
                            if ("no-cache".equalsIgnoreCase(obj)) {
                                z2 = true;
                            } else if ("no-store".equalsIgnoreCase(obj)) {
                                z3 = true;
                            } else if ("max-age".equalsIgnoreCase(obj)) {
                                i5 = kv2.cpQdD2nAriOS(str, -1);
                            } else if ("s-maxage".equalsIgnoreCase(obj)) {
                                i6 = kv2.cpQdD2nAriOS(str, -1);
                            } else if ("private".equalsIgnoreCase(obj)) {
                                z4 = true;
                            } else if ("public".equalsIgnoreCase(obj)) {
                                z5 = true;
                            } else if ("must-revalidate".equalsIgnoreCase(obj)) {
                                z6 = true;
                            } else if ("max-stale".equalsIgnoreCase(obj)) {
                                i7 = kv2.cpQdD2nAriOS(str, Integer.MAX_VALUE);
                            } else if ("min-fresh".equalsIgnoreCase(obj)) {
                                i8 = kv2.cpQdD2nAriOS(str, -1);
                            } else if ("only-if-cached".equalsIgnoreCase(obj)) {
                                z7 = true;
                            } else if ("no-transform".equalsIgnoreCase(obj)) {
                                z8 = true;
                            } else if ("immutable".equalsIgnoreCase(obj)) {
                                z9 = true;
                            }
                            jhVar3 = jhVar2;
                            size = i3;
                        }
                        i4++;
                        jhVar3 = jhVar3;
                        size = size;
                    }
                } else if (!lS5Rgt96tfkO.equalsIgnoreCase("Pragma")) {
                    i4++;
                    jhVar3 = jhVar3;
                    size = size;
                }
                z = false;
                i2 = 0;
                while (i2 < Y1f8riQaR6yg.length()) {
                }
                i4++;
                jhVar3 = jhVar3;
                size = size;
            }
            jhVar = jhVar3;
            ch chVar2 = new ch(z2, z3, i5, i6, z4, z5, z6, i7, i8, z7, z8, z9, !z ? null : str2);
            xbVar.a92UlCVFR9N8 = chVar2;
            chVar = chVar2;
        } else {
            jhVar = jhVar3;
        }
        jh jhVar4 = chVar.wdg6QnbFHrFF ? new jh(null, null) : jhVar;
        xb xbVar2 = jhVar4.PxuCJdSBwIXG;
        nv1 nv1Var2 = jhVar4.lS5Rgt96tfkO;
        if (xbVar2 == null && nv1Var2 == null) {
            nv1 nv1Var3 = new nv1(ps1Var.e9gEMXR7LXtO, fr1.wdg6QnbFHrFF, "Unsatisfiable Request (only-if-cached)", 504, null, new hj0((String[]) new ArrayList(20).toArray(new String[0])), qv1.rtx2ld2ELZv4, null, null, null, null, -1L, System.currentTimeMillis(), null, pk2.RAsUl2FVSrh6);
            ps1Var.PxuCJdSBwIXG.dgRBjINgWbAK.getClass();
            return nv1Var3;
        }
        if (xbVar2 == null) {
            nv1Var2.getClass();
            mv1 lS5Rgt96tfkO2 = nv1Var2.lS5Rgt96tfkO();
            nv1 ozEBbv0hFTAB = ng0.ozEBbv0hFTAB(nv1Var2);
            mv1.lS5Rgt96tfkO("cacheResponse", ozEBbv0hFTAB);
            lS5Rgt96tfkO2.wdg6QnbFHrFF = ozEBbv0hFTAB;
            nv1 PxuCJdSBwIXG = lS5Rgt96tfkO2.PxuCJdSBwIXG();
            ps1Var.PxuCJdSBwIXG.dgRBjINgWbAK.getClass();
            return PxuCJdSBwIXG;
        }
        if (nv1Var2 != null) {
            ps1Var.PxuCJdSBwIXG.dgRBjINgWbAK.getClass();
        }
        nv1 lS5Rgt96tfkO3 = ps1Var.lS5Rgt96tfkO(xbVar2);
        if (nv1Var2 == null) {
            nv1Var = null;
        } else {
            if (lS5Rgt96tfkO3.dgRBjINgWbAK == 304) {
                mv1 lS5Rgt96tfkO4 = nv1Var2.lS5Rgt96tfkO();
                gh ghVar = Companion;
                hj0 hj0Var2 = nv1Var2.cpQdD2nAriOS;
                hj0 hj0Var3 = lS5Rgt96tfkO3.cpQdD2nAriOS;
                ghVar.getClass();
                ArrayList arrayList = new ArrayList(20);
                int i15 = 0;
                for (int size2 = hj0Var2.size(); i15 < size2; size2 = i) {
                    String lS5Rgt96tfkO5 = hj0Var2.lS5Rgt96tfkO(i15);
                    String Y1f8riQaR6yg2 = hj0Var2.Y1f8riQaR6yg(i15);
                    if ("Warning".equalsIgnoreCase(lS5Rgt96tfkO5)) {
                        i = size2;
                        if (pa2.yQRudnv4La6p(Y1f8riQaR6yg2, "1", false)) {
                            i15++;
                        }
                    } else {
                        i = size2;
                    }
                    if ("Content-Length".equalsIgnoreCase(lS5Rgt96tfkO5) || "Content-Encoding".equalsIgnoreCase(lS5Rgt96tfkO5) || "Content-Type".equalsIgnoreCase(lS5Rgt96tfkO5) || !gh.PxuCJdSBwIXG(lS5Rgt96tfkO5) || hj0Var3.PxuCJdSBwIXG(lS5Rgt96tfkO5) == null) {
                        arrayList.add(lS5Rgt96tfkO5);
                        arrayList.add(ia2.GlTbNTgfSMqy(Y1f8riQaR6yg2).toString());
                    }
                    i15++;
                }
                int size3 = hj0Var3.size();
                for (int i16 = 0; i16 < size3; i16++) {
                    String lS5Rgt96tfkO6 = hj0Var3.lS5Rgt96tfkO(i16);
                    if (!"Content-Length".equalsIgnoreCase(lS5Rgt96tfkO6) && !"Content-Encoding".equalsIgnoreCase(lS5Rgt96tfkO6) && !"Content-Type".equalsIgnoreCase(lS5Rgt96tfkO6) && gh.PxuCJdSBwIXG(lS5Rgt96tfkO6)) {
                        String Y1f8riQaR6yg3 = hj0Var3.Y1f8riQaR6yg(i16);
                        arrayList.add(lS5Rgt96tfkO6);
                        arrayList.add(ia2.GlTbNTgfSMqy(Y1f8riQaR6yg3).toString());
                    }
                }
                lS5Rgt96tfkO4.a92UlCVFR9N8 = new hj0((String[]) arrayList.toArray(new String[0])).TSizfFm2Yiuu();
                lS5Rgt96tfkO4.x50lh2ztY7Y5 = lS5Rgt96tfkO3.RfyTYNmI9Srp;
                lS5Rgt96tfkO4.cpQdD2nAriOS = lS5Rgt96tfkO3.EcgxDIVH5in8;
                nv1 ozEBbv0hFTAB2 = ng0.ozEBbv0hFTAB(nv1Var2);
                mv1.lS5Rgt96tfkO("cacheResponse", ozEBbv0hFTAB2);
                lS5Rgt96tfkO4.wdg6QnbFHrFF = ozEBbv0hFTAB2;
                nv1 ozEBbv0hFTAB3 = ng0.ozEBbv0hFTAB(lS5Rgt96tfkO3);
                mv1.lS5Rgt96tfkO("networkResponse", ozEBbv0hFTAB3);
                lS5Rgt96tfkO4.OPXfSBeufaJ8 = ozEBbv0hFTAB3;
                lS5Rgt96tfkO4.PxuCJdSBwIXG();
                lS5Rgt96tfkO3.r3s1LDPKFs1S.close();
                throw null;
            }
            nv1Var = null;
            kv2.PxuCJdSBwIXG(nv1Var2.r3s1LDPKFs1S);
        }
        mv1 lS5Rgt96tfkO7 = lS5Rgt96tfkO3.lS5Rgt96tfkO();
        nv1 ozEBbv0hFTAB4 = nv1Var2 != null ? ng0.ozEBbv0hFTAB(nv1Var2) : nv1Var;
        mv1.lS5Rgt96tfkO("cacheResponse", ozEBbv0hFTAB4);
        lS5Rgt96tfkO7.wdg6QnbFHrFF = ozEBbv0hFTAB4;
        nv1 ozEBbv0hFTAB5 = ng0.ozEBbv0hFTAB(lS5Rgt96tfkO3);
        mv1.lS5Rgt96tfkO("networkResponse", ozEBbv0hFTAB5);
        lS5Rgt96tfkO7.OPXfSBeufaJ8 = ozEBbv0hFTAB5;
        return lS5Rgt96tfkO7.PxuCJdSBwIXG();
    }
}
