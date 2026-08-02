package defpackage;

import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dyt extends dza {
    @Override // defpackage.dza
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        ((gfx) obj).getClass();
        ((jfg) obj2).getClass();
    }

    @Override // defpackage.dza
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        gfx gfxVar = (gfx) obj;
        jfg jfgVar = (jfg) obj2;
        gfxVar.getClass();
        jfgVar.getClass();
        int i = jfgVar.b;
        int i2 = jfgVar.a;
        int i3 = (i - i2) + 1;
        String valueOf = i2 == 1 ? String.valueOf(i3) : a.Y(i3, "+");
        TextView textView = (TextView) gfxVar.t;
        textView.setText(valueOf);
        textView.setImportantForAccessibility(2);
    }
}
