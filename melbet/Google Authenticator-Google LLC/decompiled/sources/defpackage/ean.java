package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.authenticator2.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ean extends dza {
    private final ehi a;

    public ean(ehi ehiVar) {
        this.a = ehiVar;
    }

    @Override // defpackage.dza
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        ((iyi) obj).getClass();
        ((jhq) obj2).getClass();
    }

    @Override // defpackage.dza
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        int i;
        iyi iyiVar = (iyi) obj;
        jhq jhqVar = (jhq) obj2;
        iyiVar.getClass();
        jhqVar.getClass();
        Object obj3 = iyiVar.b;
        TextView textView = (TextView) obj3;
        Context context = textView.getContext();
        Object obj4 = iyiVar.a;
        if (obj4 != null) {
            List<jhh> list = jhqVar.a;
            ArrayList arrayList = new ArrayList(ixc.w(list));
            for (jhh jhhVar : list) {
                context.getClass();
                arrayList.add(dih.J(jhhVar, context));
            }
            ((edb) obj4).a(hnu.ac(arrayList));
        } else {
            jhh jhhVar2 = (jhh) ixc.f(jhqVar.a);
            context.getClass();
            textView.setText(dih.J(jhhVar2, context));
        }
        List list2 = jhqVar.d;
        String y = !list2.isEmpty() ? ixc.y(list2, "\n", null, null, new dwd(iyiVar, 10), 30) : null;
        textView.setContentDescription(y);
        yq.o((View) obj3, y);
        switch (jhqVar.e - 1) {
            case 0:
                i = R.style.TextAppearance_GoogleMaterial3_TitleMedium;
                break;
            case 1:
                i = R.style.TextAppearance_GoogleMaterial3_LabelLarge;
                break;
            case 2:
                i = R.style.TextAppearance_GoogleMaterial3_LabelMedium;
                break;
            case 3:
                i = R.style.TextAppearance_GoogleMaterial3_BodyMedium;
                break;
            case 4:
                i = R.style.TextAppearance_GoogleMaterial3_BodySmall;
                break;
            case 5:
                i = R.style.TextAppearance_GoogleMaterial3_TitleSmall;
                break;
            case 6:
                i = R.style.TextAppearance_GoogleMaterial3_TitleLarge;
                break;
            default:
                i = R.style.TextAppearance_GoogleMaterial3_TitleLarge_Emphasized;
                break;
        }
        textView.setTextAppearance(context, i);
        textView.setTextColor(this.a.a(jhqVar.b));
        Integer num = jhqVar.c;
        textView.setMaxLines(num != null ? num.intValue() : Integer.MAX_VALUE);
    }
}
