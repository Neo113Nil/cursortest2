package defpackage;

import android.widget.TextView;
import com.google.android.apps.authenticator2.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dyo extends dza {
    private final ean a;

    public dyo(ean eanVar) {
        this.a = eanVar;
    }

    @Override // defpackage.dza
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        ((cbp) obj).getClass();
        ((jhi) obj2).getClass();
    }

    @Override // defpackage.dza
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        cbp cbpVar = (cbp) obj;
        jhi jhiVar = (jhi) obj2;
        cbpVar.getClass();
        jhiVar.getClass();
        ean eanVar = this.a;
        Object obj3 = cbpVar.a;
        eanVar.c(obj3, jhiVar.a);
        TextView textView = (TextView) ((iyi) obj3).b;
        textView.setTextSize(0, textView.getResources().getDimension(R.dimen.bento_premium_decoration_text_size));
        textView.setTypeface(textView.getTypeface(), 1);
    }
}
