package defpackage;

import android.content.pm.PackageManager;
import android.content.res.Resources;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewl {
    public final String a;
    public final hac b;
    final /* synthetic */ ewm c;

    public ewl(ewm ewmVar, String str, final int i, final int i2) {
        this.c = ewmVar;
        this.a = str;
        this.b = new ewi(new hac() { // from class: ewk
            @Override // defpackage.hac
            public final Object bB() {
                jkj k = iae.a.k();
                ewl ewlVar = ewl.this;
                int i3 = i;
                try {
                    Resources a = ewlVar.c.a();
                    if (a == null) {
                        return null;
                    }
                    ewlVar.a(k, a, i3);
                    long longValue = ((Long) ewlVar.c.b.bB()).longValue();
                    if (!k.b.M()) {
                        k.t();
                    }
                    iae iaeVar = (iae) k.b;
                    iaeVar.b |= 128;
                    iaeVar.n = longValue;
                    String str2 = iaeVar.g;
                    int indexOf = str2.indexOf(35);
                    if (indexOf >= 0) {
                        str2 = str2.substring(0, indexOf);
                    }
                    String str3 = ewlVar.a;
                    hoq.K(str2.equals(str3), "Resource package does not match expected package, expected package: %s", str3);
                    iae iaeVar2 = (iae) k.b;
                    String str4 = iaeVar2.g;
                    ewm ewmVar2 = ewlVar.c;
                    boolean z = iaeVar2.h;
                    if (str4.isEmpty()) {
                        throw new IllegalArgumentException("Empty configuration package");
                    }
                    String str5 = ewmVar2.a;
                    if (z) {
                        if (str4.indexOf(35) >= 0) {
                            throw new IllegalArgumentException(String.format("When %s is present, %s should not contain subpackage separator %s (config package=%s)", "auto-subpackage", "configuration-package", '#', str4));
                        }
                        str4 = a.ag(str5, str4, "#");
                    }
                    if (((iae) k.b).c != 2) {
                        Integer num = (Integer) ewmVar2.c.bB();
                        num.intValue();
                        if (!k.b.M()) {
                            k.t();
                        }
                        iae iaeVar3 = (iae) k.b;
                        iaeVar3.c = 2;
                        iaeVar3.d = num;
                    }
                    if (!k.b.M()) {
                        k.t();
                    }
                    jkp jkpVar = k.b;
                    iae iaeVar4 = (iae) jkpVar;
                    str4.getClass();
                    iaeVar4.b |= 1;
                    iaeVar4.g = str4;
                    if (!jkpVar.M()) {
                        k.t();
                    }
                    jkp jkpVar2 = k.b;
                    iae iaeVar5 = (iae) jkpVar2;
                    str5.getClass();
                    iaeVar5.e = 7;
                    iaeVar5.f = str5;
                    if (!jkpVar2.M()) {
                        k.t();
                    }
                    int i4 = i2;
                    iae iaeVar6 = (iae) k.b;
                    iaeVar6.m = 3;
                    iaeVar6.b |= 32;
                    if (i4 == 0) {
                        return (iae) k.q();
                    }
                    jkj k2 = ewh.a.k();
                    ewlVar.a(k2, a, i4);
                    String str6 = ((ewh) k2.b).c;
                    String str7 = ewlVar.a;
                    hoq.M(str6.equals(str7), "Package in HeterodyneInfo binary %s does not match resource lookup for %s", ((ewh) k2.b).c, str7);
                    if (!k2.b.M()) {
                        k2.t();
                    }
                    ewh ewhVar = (ewh) k2.b;
                    ewhVar.b &= -2;
                    ewhVar.c = ewh.a.c;
                    jjq d = ((ewh) k2.q()).d();
                    if (!k.b.M()) {
                        k.t();
                    }
                    iae iaeVar7 = (iae) k.b;
                    iaeVar7.b |= 256;
                    iaeVar7.o = d;
                    return (iae) k.q();
                } catch (PackageManager.NameNotFoundException | IOException | NullPointerException unused) {
                    return null;
                }
            }
        });
    }

    public final void a(jlk jlkVar, Resources resources, int i) {
        InputStream openRawResource = resources.openRawResource(i);
        try {
            this.c.e.b++;
            ((jkj) jlkVar).g(jju.L(openRawResource, Math.max(512, Math.min(4096, openRawResource.available()))), jkd.a);
            if (openRawResource != null) {
                openRawResource.close();
            }
        } catch (Throwable th) {
            if (openRawResource != null) {
                try {
                    openRawResource.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
