package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dyu extends dza {
    private final dzd a;
    private final ldt b;

    public dyu(dzd dzdVar, ldt ldtVar) {
        this.a = dzdVar;
        this.b = ldtVar;
    }

    private static final void d(edb edbVar, List list, Context context) {
        ArrayList arrayList = new ArrayList(ixc.w(list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(dih.J((jhh) it.next(), context));
        }
        edbVar.a(hnu.ac(arrayList));
    }

    @Override // defpackage.dza
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        ldt ldtVar = (ldt) obj;
        jhn jhnVar = (jhn) obj2;
        ldtVar.getClass();
        jhnVar.getClass();
        jgw jgwVar = new jgw(jhnVar.a);
        Object obj3 = ldtVar.b;
        ldt ldtVar2 = this.b;
        ldtVar2.p((View) obj3, 90139, jgwVar);
        Object obj4 = ldtVar.a;
        jiu jiuVar = jhnVar.e;
        if (jiuVar != null) {
            View view = (View) obj4;
            ldtVar2.o(view, 111271, jiuVar, null);
            ((FrameLayout) obj4).setImportantForAccessibility(1);
            dih.I(view, Button.class.getName());
            return;
        }
        FrameLayout frameLayout = (FrameLayout) obj4;
        frameLayout.setClickable(false);
        frameLayout.setImportantForAccessibility(4);
        dih.I((View) obj4, null);
    }

    @Override // defpackage.dza
    public final /* synthetic */ void b(Object obj, Object obj2) {
        ldt ldtVar = (ldt) obj;
        jhn jhnVar = (jhn) obj2;
        ldtVar.getClass();
        jhnVar.getClass();
        this.a.c(ldtVar.e, new dzc(jhnVar.a, jhnVar.b, 1));
        Button button = (Button) ldtVar.b;
        Context context = button.getContext();
        context.getClass();
        d((edb) ldtVar.d, jhnVar.c, context);
        List list = jhnVar.d;
        d((edb) ldtVar.c, list, context);
        button.setVisibility(true != list.isEmpty() ? 0 : 8);
    }
}
