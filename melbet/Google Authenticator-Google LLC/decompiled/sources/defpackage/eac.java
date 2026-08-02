package defpackage;

import android.widget.TextView;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eac extends dza {
    private final ean a;
    private final jpt b;

    public eac(ean eanVar, jpt jptVar) {
        jptVar.getClass();
        this.a = eanVar;
        this.b = jptVar;
    }

    @Override // defpackage.dza
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        ((fwm) obj).getClass();
        ((jik) obj2).getClass();
    }

    @Override // defpackage.dza
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        fwm fwmVar = (fwm) obj;
        jik jikVar = (jik) obj2;
        fwmVar.getClass();
        jikVar.getClass();
        Object obj3 = fwmVar.a;
        LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) obj3;
        linearProgressIndicator.setMax(100);
        jil jilVar = jikVar.a;
        fla flaVar = (fla) obj3;
        flaVar.setProgress(jilVar.b);
        int[] iArr = {((ehi) this.b.b()).a(jilVar.c)};
        flb flbVar = flaVar.a;
        if (!Arrays.equals(flbVar.e, iArr)) {
            flbVar.e = iArr;
            flaVar.getIndeterminateDrawable().b.b();
            flaVar.invalidate();
        }
        ((fmg) linearProgressIndicator.a).b();
        linearProgressIndicator.setContentDescription(null);
        Object obj4 = fwmVar.b;
        jhq jhqVar = jikVar.b;
        if (jhqVar == null) {
            ((TextView) ((iyi) obj4).b).setVisibility(8);
        } else {
            ((TextView) ((iyi) obj4).b).setVisibility(0);
            this.a.c(obj4, jhqVar);
        }
    }
}
