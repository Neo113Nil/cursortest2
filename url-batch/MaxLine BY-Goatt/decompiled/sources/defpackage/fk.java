package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class fk extends ll3 {
    public final /* synthetic */ int i;

    public fk(hk hkVar) {
        this.i = 0;
    }

    @Override // defpackage.ll3
    public final void k(uc2 uc2Var, Object obj) {
        switch (this.i) {
            case 0:
                ik ikVar = (ik) obj;
                uc2Var.getClass();
                uc2Var.w(1, ikVar.a);
                jk jkVar = ikVar.b;
                jkVar.getClass();
                uc2Var.w(2, jkVar.name());
                uc2Var.w(3, ikVar.c);
                uc2Var.w(4, ikVar.d);
                String str = ikVar.e;
                if (str == null) {
                    uc2Var.c(5);
                } else {
                    uc2Var.w(5, str);
                }
                uc2Var.w(6, ikVar.f);
                uc2Var.w(7, ikVar.g);
                Double d = ikVar.h;
                if (d == null) {
                    uc2Var.c(8);
                } else {
                    uc2Var.a(d.doubleValue(), 8);
                }
                Double d2 = ikVar.i;
                if (d2 == null) {
                    uc2Var.c(9);
                } else {
                    uc2Var.a(d2.doubleValue(), 9);
                }
                uc2Var.w(10, ikVar.j);
                uc2Var.w(11, ikVar.k);
                uc2Var.w(12, ikVar.l);
                uc2Var.w(13, ikVar.m);
                uc2Var.w(14, ikVar.n);
                uc2Var.w(15, ikVar.o);
                uc2Var.w(16, ikVar.p);
                uc2Var.w(17, ikVar.q);
                uc2Var.w(18, u30.o(ikVar.r));
                uc2Var.w(19, u30.o(ikVar.s));
                if (ikVar.t == null) {
                    uc2Var.c(20);
                } else {
                    uc2Var.d(r2.intValue(), 20);
                }
                String str2 = ikVar.u;
                if (str2 == null) {
                    uc2Var.c(21);
                } else {
                    uc2Var.w(21, str2);
                }
                uc2Var.w(22, u30.o(ikVar.v));
                break;
            case 1:
                kk kkVar = (kk) obj;
                uc2Var.getClass();
                uc2Var.w(1, kkVar.a);
                uc2Var.d(kkVar.b ? 1L : 0L, 2);
                uc2Var.d(kkVar.c ? 1L : 0L, 3);
                uc2Var.d(kkVar.d ? 1L : 0L, 4);
                break;
            case 2:
                kk kkVar2 = (kk) obj;
                uc2Var.getClass();
                uc2Var.w(1, kkVar2.a);
                uc2Var.d(kkVar2.b ? 1L : 0L, 2);
                uc2Var.d(kkVar2.c ? 1L : 0L, 3);
                uc2Var.d(kkVar2.d ? 1L : 0L, 4);
                break;
            case 3:
                a61 a61Var = (a61) obj;
                uc2Var.getClass();
                a61Var.getClass();
                uc2Var.d(a61Var.a, 1);
                uc2Var.w(2, a61Var.b);
                uc2Var.w(3, a61Var.c);
                uc2Var.w(4, a61Var.d);
                String str3 = a61Var.e;
                if (str3 == null) {
                    uc2Var.c(5);
                } else {
                    uc2Var.w(5, str3);
                }
                Double d3 = a61Var.f;
                if (d3 == null) {
                    uc2Var.c(6);
                } else {
                    uc2Var.a(d3.doubleValue(), 6);
                }
                Long l = a61Var.g;
                if (l == null) {
                    uc2Var.c(7);
                } else {
                    uc2Var.d(l.longValue(), 7);
                }
                String str4 = a61Var.h;
                if (str4 == null) {
                    uc2Var.c(8);
                } else {
                    uc2Var.w(8, str4);
                }
                Double d4 = a61Var.i;
                if (d4 == null) {
                    uc2Var.c(9);
                } else {
                    uc2Var.a(d4.doubleValue(), 9);
                }
                String str5 = a61Var.j;
                if (str5 == null) {
                    uc2Var.c(10);
                } else {
                    uc2Var.w(10, str5);
                }
                String str6 = a61Var.k;
                if (str6 == null) {
                    uc2Var.c(11);
                } else {
                    uc2Var.w(11, str6);
                }
                uc2Var.d(a61Var.l ? 1L : 0L, 12);
                uc2Var.d(a61Var.m, 13);
                break;
            default:
                h51 h51Var = (h51) obj;
                uc2Var.getClass();
                uc2Var.d(h51Var.a, 1);
                uc2Var.w(2, h51Var.b);
                break;
        }
    }

    @Override // defpackage.ll3
    public final String z() {
        switch (this.i) {
            case 0:
                return "INSERT OR REPLACE INTO `atlas_entry` (`slug`,`kind`,`nameRu`,`nameEn`,`formula`,`colorRu`,`colorEn`,`mohsMin`,`mohsMax`,`lustreRu`,`lustreEn`,`originRu`,`originEn`,`symbolismRu`,`symbolismEn`,`careRu`,`careEn`,`factsRu`,`factsEn`,`birthMonth`,`zodiac`,`sources`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 1:
                return "INSERT OR IGNORE INTO `atlas_progress` (`slug`,`studied`,`favourite`,`owned`) VALUES (?,?,?,?)";
            case 2:
                return "INSERT OR REPLACE INTO `atlas_progress` (`slug`,`studied`,`favourite`,`owned`) VALUES (?,?,?,?)";
            case 3:
                return "INSERT OR REPLACE INTO `jewelry_item` (`id`,`name`,`type`,`metal`,`fineness`,`weightGrams`,`purchaseDateEpochDay`,`place`,`valueEntered`,`notes`,`photoUri`,`favourite`,`createdAt`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?)";
            default:
                return "INSERT OR IGNORE INTO `item_stone` (`itemId`,`atlasSlug`) VALUES (?,?)";
        }
    }

    public /* synthetic */ fk(int i) {
        this.i = i;
    }
}
