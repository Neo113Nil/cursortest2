package defpackage;

import j$.util.Optional;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dvp implements kzr {
    final /* synthetic */ kzr a;
    final /* synthetic */ ehr b;
    final /* synthetic */ dvq c;

    public dvp(kzr kzrVar, ehr ehrVar, dvq dvqVar) {
        this.a = kzrVar;
        this.b = ehrVar;
        this.c = dvqVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01a3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0188 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ba A[ADDED_TO_REGION] */
    @Override // defpackage.kzr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object cg(Object obj, kqj kqjVar) {
        int i;
        eba ebaVar;
        bst bstVar;
        dvl dvlVar;
        ijl ijlVar;
        ijy ijyVar;
        ijk ijkVar;
        eba ebaVar2;
        ijc ijcVar;
        jkx jkxVar;
        ijp ijpVar;
        int y;
        jir jirVar;
        jij jijVar;
        bst bstVar2;
        int i2;
        jiu jiuVar;
        int i3;
        dvx dvxVar;
        jim jimVar;
        int H;
        jhh jhhVar;
        jkx jkxVar2;
        String str = this.b.c;
        cvc cvcVar = (cvc) ((Map) obj).get(str);
        dvq dvqVar = this.c;
        Optional optional = dvqVar.c;
        byte[] bArr = null;
        if (optional.isPresent() && cvcVar != null) {
            ijx D = dih.D(cvcVar);
            ijp ijpVar2 = (D == null || (jkxVar2 = D.c) == null) ? null : (ijp) ixc.g(jkxVar2);
            if (ijpVar2 != null && (y = a.y(ijpVar2.l)) != 0 && y == 2) {
                jiw jiwVar = dvqVar.b;
                jiu jiuVar2 = dvqVar.i;
                jiwVar.c(jiuVar2, new aya(dvqVar, ijpVar2, 15, bArr));
                jig B = dja.B(ijpVar2);
                if (B != null) {
                    String str2 = ijpVar2.i;
                    str2.getClass();
                    jhq jhqVar = new jhq(new jhh(str2), jhb.b, 2, Integer.valueOf((ijpVar2.b & 4) == 0 ? 2 : 1), 16);
                    if ((ijpVar2.g == 5 ? (ijo) ijpVar2.h : ijo.a).e) {
                        if (((ijpVar2.g == 5 ? (ijo) ijpVar2.h : ijo.a).b & 1) != 0) {
                            dva dvaVar = (dva) optional.get();
                            jjd jjdVar = (ijpVar2.g == 5 ? (ijo) ijpVar2.h : ijo.a).c;
                            if (jjdVar == null) {
                                jjdVar = jjd.a;
                            }
                            jjdVar.getClass();
                            jirVar = new jir(dvaVar.b(), null);
                            if ((ijpVar2.b & 4) == 0) {
                                ijn ijnVar = ijpVar2.k;
                                if (ijnVar == null) {
                                    ijnVar = ijn.a;
                                }
                                float f = ijnVar.c;
                                int H2 = a.H(ijpVar2.j);
                                if (H2 == 0) {
                                    H2 = 1;
                                }
                                int i4 = H2 - 1;
                                jhb jhbVar = i4 != 2 ? i4 != 3 ? jhb.e : jhb.f : jhb.p;
                                ijn ijnVar2 = ijpVar2.k;
                                if (((ijnVar2 == null ? ijn.a : ijnVar2).b & 2) != 0) {
                                    if (ijnVar2 == null) {
                                        ijnVar2 = ijn.a;
                                    }
                                    String str3 = ijnVar2.d;
                                    str3.getClass();
                                    jhhVar = new jhh(str3);
                                } else {
                                    jhhVar = null;
                                }
                                jijVar = dja.D(f, jhbVar, jhhVar);
                            } else {
                                jijVar = null;
                            }
                            jim jimVar2 = new jim(B, jhqVar, null, jijVar, jirVar, dvqVar.a(ijpVar2, true), dvqVar.a(ijpVar2, false), 0, 0, 1812);
                            int i5 = dvqVar.k;
                            bstVar2 = dvqVar.o;
                            if (!bstVar2.f()) {
                                i2 = i5;
                                jiuVar = jiuVar2;
                                i = 2;
                                i3 = 3;
                                dvxVar = null;
                            } else {
                                if (bstVar2.g()) {
                                    i2 = i5;
                                    jiuVar = jiuVar2;
                                    i = 2;
                                    dvxVar = null;
                                    jimVar = jimVar2;
                                    i3 = 3;
                                    jhy jhyVar = new jhy(jimVar, i2, (jhb) null, jiuVar, dvxVar, 101072, 68);
                                    int H3 = a.H(ijpVar2.j);
                                    boolean z = (H3 != 0 && H3 == i3) || ((H = a.H(ijpVar2.j)) != 0 && H == 4);
                                    int H4 = a.H(ijpVar2.j);
                                    ebaVar = new eba(jhyVar, new eax(z, H4 != 0 && H4 == 4));
                                    bstVar = dvqVar.o;
                                    if (bstVar.f() || cvcVar == null) {
                                        dvlVar = new dvl(null, null, null);
                                    } else {
                                        ijx D2 = dih.D(cvcVar);
                                        if (D2 == null || (jkxVar = D2.c) == null || (ijpVar = (ijp) ixc.g(jkxVar)) == null || (ijpVar.b & 512) == 0) {
                                            ijlVar = null;
                                        } else {
                                            ijlVar = ijpVar.p;
                                            if (ijlVar == null) {
                                                ijlVar = ijl.a;
                                            }
                                        }
                                        if (ijlVar != null) {
                                            if ((ijlVar.b & 2) != 0) {
                                                ijcVar = ijlVar.d;
                                                if (ijcVar == null) {
                                                    ijcVar = ijc.a;
                                                }
                                            } else {
                                                ijcVar = null;
                                            }
                                            if (ijcVar != null && (ijcVar.b & 4) != 0) {
                                                ijyVar = ijcVar.c;
                                                if (ijyVar == null) {
                                                    ijyVar = ijy.a;
                                                }
                                                if (ijlVar != null || (ijlVar.b & 1) == 0) {
                                                    ijkVar = null;
                                                } else {
                                                    ijkVar = ijlVar.c;
                                                    if (ijkVar == null) {
                                                        ijkVar = ijk.a;
                                                    }
                                                }
                                                if (ijkVar != null) {
                                                    if (true == bstVar.k()) {
                                                        ijkVar = null;
                                                    }
                                                    if (ijkVar != null && (ijkVar.b & 1) != 0) {
                                                        int H5 = a.H(ijkVar.d);
                                                        jha jhaVar = (H5 != 0 ? H5 : 1) + (-1) != 5 ? new jha(22, null) : new jha(22, null);
                                                        jiw jiwVar2 = dvqVar.b;
                                                        jiu jiuVar3 = dvqVar.j;
                                                        jiwVar2.c(jiuVar3, new aya(dvqVar, ijkVar, 14, bArr));
                                                        jig jigVar = new jig(jhaVar);
                                                        String str4 = ijkVar.c;
                                                        str4.getClass();
                                                        ebaVar2 = new eba(new jhy(new jim(jigVar, new jhq(new jhh(str4), (jhb) null, 0, Integer.valueOf(i), 22), null, null, null, null, null, 0, 0, 2044), dvqVar.l, (jhb) null, jiuVar3, (kri) null, 326364, 84), new eax(false, false));
                                                        dvlVar = new dvl(null, ebaVar2, ijyVar);
                                                    }
                                                }
                                                ebaVar2 = null;
                                                dvlVar = new dvl(null, ebaVar2, ijyVar);
                                            }
                                        }
                                        ijyVar = null;
                                        if (ijlVar != null) {
                                        }
                                        ijkVar = null;
                                        if (ijkVar != null) {
                                        }
                                        ebaVar2 = null;
                                        dvlVar = new dvl(null, ebaVar2, ijyVar);
                                    }
                                    Object cg = this.a.cg(new dvl(ebaVar, dvlVar.b, dvlVar.c), kqjVar);
                                    return cg != kqp.a ? cg : kow.a;
                                }
                                dvx dvxVar2 = dvqVar.h;
                                i2 = i5;
                                jiuVar = jiuVar2;
                                i = 2;
                                i3 = 3;
                                dvxVar2.a = new dvn(str, dvqVar.n, 2, dvqVar.e, 0);
                                dvxVar = dvxVar2;
                            }
                            jimVar = jimVar2;
                            jhy jhyVar2 = new jhy(jimVar, i2, (jhb) null, jiuVar, dvxVar, 101072, 68);
                            int H32 = a.H(ijpVar2.j);
                            if (H32 != 0) {
                                int H42 = a.H(ijpVar2.j);
                                if (H42 != 0) {
                                    ebaVar = new eba(jhyVar2, new eax(z, H42 != 0 && H42 == 4));
                                    bstVar = dvqVar.o;
                                    if (bstVar.f()) {
                                    }
                                    dvlVar = new dvl(null, null, null);
                                    Object cg2 = this.a.cg(new dvl(ebaVar, dvlVar.b, dvlVar.c), kqjVar);
                                    if (cg2 != kqp.a) {
                                    }
                                }
                                ebaVar = new eba(jhyVar2, new eax(z, H42 != 0 && H42 == 4));
                                bstVar = dvqVar.o;
                                if (bstVar.f()) {
                                }
                                dvlVar = new dvl(null, null, null);
                                Object cg22 = this.a.cg(new dvl(ebaVar, dvlVar.b, dvlVar.c), kqjVar);
                                if (cg22 != kqp.a) {
                                }
                            }
                            int H422 = a.H(ijpVar2.j);
                            ebaVar = new eba(jhyVar2, new eax(z, H422 != 0 && H422 == 4));
                            bstVar = dvqVar.o;
                            if (bstVar.f()) {
                            }
                            dvlVar = new dvl(null, null, null);
                            Object cg222 = this.a.cg(new dvl(ebaVar, dvlVar.b, dvlVar.c), kqjVar);
                            if (cg222 != kqp.a) {
                            }
                        }
                    }
                    jirVar = null;
                    if ((ijpVar2.b & 4) == 0) {
                    }
                    jim jimVar22 = new jim(B, jhqVar, null, jijVar, jirVar, dvqVar.a(ijpVar2, true), dvqVar.a(ijpVar2, false), 0, 0, 1812);
                    int i52 = dvqVar.k;
                    bstVar2 = dvqVar.o;
                    if (!bstVar2.f()) {
                    }
                    jimVar = jimVar22;
                    jhy jhyVar22 = new jhy(jimVar, i2, (jhb) null, jiuVar, dvxVar, 101072, 68);
                    int H322 = a.H(ijpVar2.j);
                    if (H322 != 0) {
                    }
                    int H4222 = a.H(ijpVar2.j);
                    ebaVar = new eba(jhyVar22, new eax(z, H4222 != 0 && H4222 == 4));
                    bstVar = dvqVar.o;
                    if (bstVar.f()) {
                    }
                    dvlVar = new dvl(null, null, null);
                    Object cg2222 = this.a.cg(new dvl(ebaVar, dvlVar.b, dvlVar.c), kqjVar);
                    if (cg2222 != kqp.a) {
                    }
                }
            }
        }
        i = 2;
        ebaVar = null;
        bstVar = dvqVar.o;
        if (bstVar.f()) {
        }
        dvlVar = new dvl(null, null, null);
        Object cg22222 = this.a.cg(new dvl(ebaVar, dvlVar.b, dvlVar.c), kqjVar);
        if (cg22222 != kqp.a) {
        }
    }
}
