package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dsp implements kzr {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public dsp(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r8v7, types: [avx, java.lang.Object] */
    @Override // defpackage.kzr
    public final /* synthetic */ Object cg(Object obj, kqj kqjVar) {
        Drawable a;
        String str;
        if (this.c != 0) {
            this.a.e((axt) this.b, (zy) obj);
            return kow.a;
        }
        dwc dwcVar = (dwc) obj;
        dpo dpoVar = null;
        if (dwcVar != null) {
            Object obj2 = this.b;
            jfh jfhVar = dwcVar.a.a;
            if (jfhVar != null) {
                int i = dwcVar.b;
                iyi iyiVar = (iyi) obj2;
                Object obj3 = iyiVar.a;
                jha jhaVar = (jha) jfhVar.a;
                int i2 = jhaVar.b;
                int i3 = i2 - 1;
                if (i3 == 0) {
                    fwm fwmVar = (fwm) obj3;
                    a = ebt.a((Context) fwmVar.a, fwmVar.I().b(), fwmVar.I().a(jhb.f));
                } else {
                    if (i3 != 1) {
                        Objects.toString(ilg.a(i2));
                        throw new IllegalArgumentException("Unsupported OgImage type: ".concat(ilg.a(i2)));
                    }
                    fwm fwmVar2 = (fwm) obj3;
                    a = ebt.b((Context) fwmVar2.a, fwmVar2.I().a(jhb.p));
                }
                jhh jhhVar = jhaVar.a;
                if (jhhVar == null || (str = dih.J(jhhVar, (Context) iyiVar.c)) == null) {
                    str = "";
                }
                dpoVar = new dpo(gzp.g(new dpn(a, null, str, i)), gzp.g(null));
            }
        }
        ((dpp) this.a).a.i(gzp.g(dpoVar));
        return kow.a;
    }
}
