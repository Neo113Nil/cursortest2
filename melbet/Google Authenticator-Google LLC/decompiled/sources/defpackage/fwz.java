package defpackage;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class fwz implements fww {
    public final iyi a;
    private final Executor b;

    public fwz(Executor executor, iyi iyiVar) {
        this.b = executor;
        this.a = iyiVar;
    }

    @Override // defpackage.fww
    public final /* bridge */ /* synthetic */ hvi a(jll jllVar, final ikm ikmVar) {
        final fxd fxdVar = (fxd) jllVar;
        return hnu.aM(gvx.i(new Callable() { // from class: fwy
            /* JADX WARN: Type inference failed for: r8v9, types: [android.content.SharedPreferences, java.lang.Object] */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                char c;
                String str;
                jkj C = fxd.this.C();
                ikm ikmVar2 = ikmVar;
                int h = ikmVar2.h();
                if (!C.b.M()) {
                    C.t();
                }
                fxd fxdVar2 = (fxd) C.b;
                fxdVar2.b |= 1;
                fxdVar2.c = h;
                int h2 = ikmVar2.h();
                int i = hel.d;
                char c2 = 4;
                heg hegVar = new heg(4);
                for (int i2 = 0; i2 < h2; i2++) {
                    if (ikmVar2.a.contains(ikm.j(i2, "created"))) {
                        hegVar.h(frv.a(i2));
                    }
                }
                hel g = hegVar.g();
                int i3 = ((his) g).c;
                int i4 = 0;
                while (i4 < i3) {
                    frv frvVar = (frv) g.get(i4);
                    String[] strArr = {"display_name", "account_name", "effective_gaia_id", "gaia_id", "profile_photo_url", "is_managed_account", "display_name", "avatar_url", "gaia_id", "email_gaia_id", "logged_in", "logged_out"};
                    for (int i5 = 0; i5 < 12; i5++) {
                        ((ArrayList) ikmVar2.b).add(ikm.k(frvVar, strArr[i5]));
                    }
                    jkl jklVar = (jkl) ful.a.k();
                    if (!jklVar.b.M()) {
                        jklVar.t();
                    }
                    ful fulVar = (ful) jklVar.b;
                    fulVar.b |= 256;
                    fulVar.k = "google";
                    if (ikmVar2.l(frvVar, "is_managed_account")) {
                        if (!jklVar.b.M()) {
                            jklVar.t();
                        }
                        ful fulVar2 = (ful) jklVar.b;
                        fulVar2.b |= 64;
                        fulVar2.i = true;
                        String i6 = ikmVar2.i(frvVar, "account_name");
                        if (!jklVar.b.M()) {
                            jklVar.t();
                        }
                        ful fulVar3 = (ful) jklVar.b;
                        i6.getClass();
                        fulVar3.b |= 16;
                        fulVar3.g = i6;
                        String i7 = ikmVar2.i(frvVar, "display_name");
                        if (!jklVar.b.M()) {
                            jklVar.t();
                        }
                        ful fulVar4 = (ful) jklVar.b;
                        i7.getClass();
                        fulVar4.b |= 2;
                        fulVar4.d = i7;
                        String i8 = ikmVar2.i(frvVar, "effective_gaia_id");
                        if (!jklVar.b.M()) {
                            jklVar.t();
                        }
                        ful fulVar5 = (ful) jklVar.b;
                        i8.getClass();
                        fulVar5.b |= 1;
                        fulVar5.c = i8;
                        String i9 = ikmVar2.i(frvVar, "gaia_id");
                        if (!jklVar.b.M()) {
                            jklVar.t();
                        }
                        ful fulVar6 = (ful) jklVar.b;
                        i9.getClass();
                        fulVar6.b |= 128;
                        fulVar6.j = i9;
                        String i10 = ikmVar2.i(frvVar, "avatar_url");
                        if (i10 != null) {
                            if (!jklVar.b.M()) {
                                jklVar.t();
                            }
                            ful fulVar7 = (ful) jklVar.b;
                            fulVar7.b |= 32;
                            fulVar7.h = i10;
                        }
                        c = c2;
                    } else {
                        String i11 = ikmVar2.i(frvVar, "account_name");
                        if (!jklVar.b.M()) {
                            jklVar.t();
                        }
                        ful fulVar8 = (ful) jklVar.b;
                        i11.getClass();
                        c = c2;
                        fulVar8.b |= 16;
                        fulVar8.g = i11;
                        String[] strArr2 = {"display_name", "account_name"};
                        int i12 = 0;
                        while (true) {
                            if (i12 >= 2) {
                                str = null;
                                break;
                            }
                            str = ikmVar2.i(frvVar, strArr2[i12]);
                            if (str != null) {
                                break;
                            }
                            i12++;
                        }
                        if (!jklVar.b.M()) {
                            jklVar.t();
                        }
                        ful fulVar9 = (ful) jklVar.b;
                        str.getClass();
                        fulVar9.b |= 2;
                        fulVar9.d = str;
                        String i13 = ikmVar2.i(frvVar, "gaia_id");
                        if (!jklVar.b.M()) {
                            jklVar.t();
                        }
                        ful fulVar10 = (ful) jklVar.b;
                        i13.getClass();
                        fulVar10.b |= 1;
                        fulVar10.c = i13;
                        String i14 = ikmVar2.i(frvVar, "profile_photo_url");
                        if (i14 != null) {
                            if (!jklVar.b.M()) {
                                jklVar.t();
                            }
                            ful fulVar11 = (ful) jklVar.b;
                            fulVar11.b |= 32;
                            fulVar11.h = i14;
                        }
                    }
                    boolean l = ikmVar2.l(frvVar, "logged_in");
                    boolean l2 = ikmVar2.l(frvVar, "logged_out");
                    jkj k = fxf.a.k();
                    int i15 = frvVar.a;
                    if (!k.b.M()) {
                        k.t();
                    }
                    jkp jkpVar = k.b;
                    fxf fxfVar = (fxf) jkpVar;
                    fxfVar.b |= 1;
                    fxfVar.c = i15;
                    if (!jkpVar.M()) {
                        k.t();
                    }
                    fxf fxfVar2 = (fxf) k.b;
                    ful fulVar12 = (ful) jklVar.q();
                    fulVar12.getClass();
                    fxfVar2.d = fulVar12;
                    fxfVar2.b |= 2;
                    int i16 = l ? 2 : l2 ? 3 : 1;
                    if (!k.b.M()) {
                        k.t();
                    }
                    fxf fxfVar3 = (fxf) k.b;
                    fxfVar3.e = i16 - 1;
                    fxfVar3.b |= 4;
                    fxf fxfVar4 = (fxf) k.q();
                    C.B(fxfVar4.c, fxfVar4);
                    i4++;
                    c2 = c;
                }
                return (fxd) C.q();
            }
        }), this.b);
    }
}
