package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dvi {
    private static final List e = ixc.D(new ije[]{ije.BADGE_SOURCE_G1, ije.BADGE_SOURCE_LEGACY_AO});
    public final cvd a;
    public final Optional b;
    public final ConcurrentHashMap c = new ConcurrentHashMap();
    public final bst d;
    private final jiw f;
    private final Context g;
    private final iyh h;

    public dvi(jiw jiwVar, iyh iyhVar, cvd cvdVar, Optional optional, Context context, bst bstVar) {
        this.f = jiwVar;
        this.h = iyhVar;
        this.a = cvdVar;
        this.b = optional;
        this.g = context;
        this.d = bstVar;
    }

    private static final jhb e(int i) {
        int i2 = i - 1;
        return i2 != 0 ? i2 != 2 ? jhb.e : jhb.f : jhb.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final jgn f(ijh ijhVar, int i, boolean z) {
        jgm jglVar;
        jiu a = this.f.a(new aya(this, ijhVar, 13, 0 == true ? 1 : 0));
        int x = a.x(ijhVar.g);
        if (x == 0) {
            x = 1;
        }
        jhb e2 = e(x);
        int i2 = ijhVar.b;
        if (i2 == 3) {
            e2 = jhb.d;
        }
        jhb jhbVar = e2;
        if (i2 == 3) {
            int x2 = a.x(((ijf) ijhVar.c).b);
            if (x2 == 0) {
                x2 = 1;
            }
            jglVar = new jgk(e(x2));
        } else if (i2 == 4) {
            jglVar = new jgl(((ijg) ijhVar.c).b ? jhb.b : null);
        } else {
            jglVar = new jgl(null);
        }
        jgm jgmVar = jglVar;
        int i3 = i + (-1) == 1 ? z ? 101073 : 117119 : -1;
        jkx jkxVar = ijhVar.f;
        jkxVar.getClass();
        String str = (String) ixc.g(jkxVar);
        if (str == null) {
            str = "";
        }
        return new jgn(ixc.b(new jhh(str)), a, i3, jhbVar, jgmVar, null, 1);
    }

    public final kzq a() {
        return new kzl(new akn(this, (kqj) null, 4));
    }

    public final void b(hpq hpqVar) {
        String str = hpr.a(hpqVar).a;
        if (str.length() > 0) {
            Uri parse = Uri.parse(str);
            parse.getClass();
            this.h.e(new Intent("android.intent.action.VIEW", parse), new dtn(dul.a, jiv.a), 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(List list, List list2, boolean z, ehr ehrVar) {
        eba ebaVar;
        jig jigVar;
        int i;
        jhq jhqVar;
        jgn jgnVar;
        jij jijVar;
        jgn jgnVar2;
        jgn jgnVar3;
        int i2;
        int i3;
        int H;
        int H2;
        int i4;
        Iterator it = list.iterator();
        boolean z2 = z;
        while (it.hasNext()) {
            ijp ijpVar = (ijp) it.next();
            List list3 = e;
            ije b = ije.b(ijpVar.o);
            if (b == null) {
                b = ije.BADGE_SOURCE_UNDEFINED;
            }
            if (list3.contains(b)) {
                if ((ijpVar.b & 1) != 0) {
                    String str = ijpVar.i;
                    str.getClass();
                    jhq jhqVar2 = new jhq(new jhh(str), (jhb) null, 0, (Integer) 2, 22);
                    int i5 = ijpVar.c;
                    int i6 = i5 != 0 ? i5 != 14 ? i5 != 15 ? 0 : 2 : 1 : 3;
                    int i7 = i6 - 1;
                    if (i6 == 0) {
                        throw null;
                    }
                    if (i7 != 0) {
                        if (i7 == 1) {
                            jigVar = dja.B(ijpVar);
                            if (jigVar != null) {
                                ebaVar = null;
                            } else {
                                if ((ijpVar.b & 16) != 0) {
                                    i = -1;
                                    String str2 = ijpVar.m;
                                    str2.getClass();
                                    jhqVar = new jhq(new jhh(str2), (jhb) null, 0, (Integer) 3, 22);
                                } else {
                                    i = -1;
                                    jhqVar = null;
                                }
                                if ((ijpVar.b & 4) != 0) {
                                    if (ijpVar.c != 15 || (i4 = a.H(((Integer) ijpVar.d).intValue())) == 0) {
                                        i4 = 1;
                                    }
                                    int i8 = i4 - 1;
                                    jhb jhbVar = i8 != 2 ? i8 != 3 ? jhb.e : jhb.f : jhb.p;
                                    jgnVar = null;
                                    ijn ijnVar = ijpVar.k;
                                    if (ijnVar == null) {
                                        ijnVar = ijn.a;
                                    }
                                    float f = ijnVar.c;
                                    ijn ijnVar2 = ijpVar.k;
                                    if (ijnVar2 == null) {
                                        ijnVar2 = ijn.a;
                                    }
                                    String str3 = ijnVar2.d;
                                    str3.getClass();
                                    if (str3.length() <= 0) {
                                        str3 = null;
                                    }
                                    jijVar = dja.D(f, jhbVar, str3 != null ? new jhh(str3) : null);
                                } else {
                                    jgnVar = null;
                                    jijVar = null;
                                }
                                ijm ijmVar = ijpVar.q;
                                if (ijmVar == null) {
                                    ijmVar = ijm.a;
                                }
                                ijmVar.getClass();
                                iji ijiVar = ijmVar.b;
                                if (ijiVar == null) {
                                    ijiVar = iji.a;
                                }
                                jkx jkxVar = ijiVar.b;
                                jkxVar.getClass();
                                ijh ijhVar = (ijh) ixc.g(jkxVar);
                                if (ijhVar != null) {
                                    int y = a.y(ijpVar.l);
                                    if (y == 0) {
                                        y = 1;
                                    }
                                    jgnVar2 = f(ijhVar, y, true);
                                } else {
                                    jgnVar2 = jgnVar;
                                }
                                iji ijiVar2 = ijmVar.c;
                                if (ijiVar2 == null) {
                                    ijiVar2 = iji.a;
                                }
                                jkx jkxVar2 = ijiVar2.b;
                                jkxVar2.getClass();
                                ijh ijhVar2 = (ijh) ixc.g(jkxVar2);
                                if (ijhVar2 != null) {
                                    int y2 = a.y(ijpVar.l);
                                    if (y2 == 0) {
                                        y2 = 1;
                                    }
                                    jgnVar3 = f(ijhVar2, y2, false);
                                } else {
                                    jgnVar3 = jgnVar;
                                }
                                jiu a = this.f.a(new aya(ijpVar, this, 12));
                                boolean z3 = false;
                                jim jimVar = new jim(jigVar, jhqVar2, jhqVar, jijVar, null, jgnVar2, jgnVar3, 0, 0, 1840);
                                int y3 = a.y(ijpVar.l);
                                if (y3 == 0) {
                                    y3 = 1;
                                }
                                int i9 = y3 - 1;
                                if (i9 == 1) {
                                    i2 = 101072;
                                } else if (i9 == 2 || i9 == 3) {
                                    i2 = 160133;
                                } else {
                                    i3 = i;
                                    jhy jhyVar = new jhy(jimVar, View.generateViewId(), (jhb) null, a, (kri) null, i3, 84);
                                    boolean z4 = (ijpVar.c == 15 || (H2 = a.H(((Integer) ijpVar.d).intValue())) == 0 || H2 != 3) ? false : true;
                                    if (ijpVar.c == 15 && (H = a.H(((Integer) ijpVar.d).intValue())) != 0 && H == 4) {
                                        z3 = true;
                                    }
                                    ebaVar = new eba(jhyVar, new eax(z4, z3));
                                }
                                i3 = i2;
                                jhy jhyVar2 = new jhy(jimVar, View.generateViewId(), (jhb) null, a, (kri) null, i3, 84);
                                if (ijpVar.c == 15) {
                                }
                                if (ijpVar.c == 15) {
                                    z3 = true;
                                }
                                ebaVar = new eba(jhyVar2, new eax(z4, z3));
                            }
                        } else if (i7 != 2) {
                            throw new koj();
                        }
                    }
                    jigVar = null;
                    if (jigVar != null) {
                    }
                } else {
                    ebaVar = null;
                }
                if (ebaVar != null) {
                    int y4 = a.y(ijpVar.n);
                    if (y4 == 0) {
                        y4 = 1;
                    }
                    int i10 = y4 - 1;
                    if (i10 == 1) {
                        list2.add(ebaVar.a);
                    } else if (i10 == 2) {
                        list2.add(ebaVar.a);
                    } else if (i10 == 3 && !z2) {
                        list2.add(ebaVar.a);
                    }
                    z2 = true;
                }
            }
        }
    }

    public final void d(String str, int i) {
        jkj k = ijw.b.k();
        k.getClass();
        ikg.e(k);
        ikg.d(ije.ALL, k);
        jkj k2 = ijv.a.k();
        k2.getClass();
        jkj k3 = ijt.a.k();
        k3.getClass();
        ikg.j(Build.VERSION.SDK_INT, k3);
        cll cllVar = cll.a;
        Context context = this.g;
        ikg.l(cmd.a(context), k3);
        String packageName = context.getPackageName();
        packageName.getClass();
        ikg.k(packageName, k3);
        ikg.g(ikg.i(k3), k2);
        ikg.h(i, k2);
        ikg.c(ikg.f(k2), k);
        ijw b = ikg.b(k);
        String languageTag = Locale.getDefault().toLanguageTag();
        languageTag.getClass();
        this.a.a(str, b, languageTag);
    }
}
