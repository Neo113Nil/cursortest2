package defpackage;

import android.content.Context;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dyr extends dza {
    @Override // defpackage.dza
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        ((fwm) obj).getClass();
        ((jhk) obj2).getClass();
    }

    @Override // defpackage.dza
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        fwm fwmVar = (fwm) obj;
        jhk jhkVar = (jhk) obj2;
        fwmVar.getClass();
        jhkVar.getClass();
        TextView textView = (TextView) fwmVar.a;
        Context context = textView.getContext();
        context.getClass();
        textView.setText(dih.J(jhkVar.a, context));
        ((ehm) fwmVar.b).t(jhkVar.b);
    }
}
