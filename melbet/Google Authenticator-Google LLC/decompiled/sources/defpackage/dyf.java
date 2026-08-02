package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.material.button.MaterialButton;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dyf extends dza {
    private final ldt a;

    public dyf(ldt ldtVar) {
        this.a = ldtVar;
    }

    @Override // defpackage.dza
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        ekx ekxVar = (ekx) obj;
        jfx jfxVar = (jfx) obj2;
        ekxVar.getClass();
        jfxVar.getClass();
        jit jitVar = jfxVar.a;
        jhj jhjVar = new jhj(jitVar);
        Object obj3 = ekxVar.c;
        ldt ldtVar = this.a;
        ldtVar.p((View) obj3, 90532, jhjVar);
        ldtVar.p((View) ekxVar.d, 90533, new jhp(jitVar));
        ldtVar.p((View) ekxVar.b, 90534, new jgt(jitVar));
    }

    @Override // defpackage.dza
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        ekx ekxVar = (ekx) obj;
        jfx jfxVar = (jfx) obj2;
        ekxVar.getClass();
        jfxVar.getClass();
        dym dymVar = (dym) ekxVar.a;
        if (ksp.b(jfxVar, dymVar.m)) {
            return;
        }
        dymVar.m = jfxVar;
        dymVar.l = null;
        jhh jhhVar = jfxVar.b;
        MaterialButton materialButton = dymVar.i;
        Context context = materialButton.getContext();
        context.getClass();
        jhh jhhVar2 = jfxVar.c;
        MaterialButton materialButton2 = dymVar.j;
        String J = dih.J(jhhVar, context);
        Context context2 = materialButton2.getContext();
        context2.getClass();
        String J2 = dih.J(jhhVar2, context2);
        if (!ksp.b(materialButton.getText(), J)) {
            materialButton.setText(J);
        }
        if (!ksp.b(materialButton2.getText(), J2)) {
            materialButton2.setText(J2);
        }
        dymVar.k.setText((CharSequence) null);
        dymVar.o = dymVar.n;
    }
}
