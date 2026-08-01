package defpackage;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.LinearLayout;
import com.derinko.gbini.n1casino.MainActivity2;
import java.util.ArrayList;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final /* synthetic */ class nr implements View.OnClickListener {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ nr(Object obj, Object obj2, int i) {
        this.f = i;
        this.h = obj;
        this.g = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f;
        int i2 = 0;
        Object obj = this.g;
        Object obj2 = this.h;
        switch (i) {
            case 0:
                MainActivity2 mainActivity2 = (MainActivity2) obj2;
                fv fvVar = (fv) obj;
                mr mrVar = mainActivity2.G;
                if (mrVar == null) {
                    zo.O("repository");
                    throw null;
                }
                fvVar.getClass();
                ArrayList arrayList = new ArrayList(mrVar.e());
                arrayList.add(0, fvVar);
                mrVar.f(arrayList);
                mainActivity2.q();
                return;
            case 1:
                ((jv) obj2).e.a((fv) obj);
                return;
            case 2:
                lv lvVar = (lv) obj2;
                lvVar.s0 = (String) obj;
                int i3 = (int) (3.0f * lvVar.k().getDisplayMetrics().density);
                n8 n8Var = lvVar.o0;
                n8Var.getClass();
                LinearLayout linearLayout = n8Var.d;
                for (Object obj3 : fv.h) {
                    int i4 = i2 + 1;
                    if (i2 < 0) {
                        throw new ArithmeticException("Index overflow has happened.");
                    }
                    String str = (String) obj3;
                    View childAt = linearLayout.getChildAt(i2);
                    if (childAt != null) {
                        boolean b = zo.b(str, lvVar.s0);
                        GradientDrawable gradientDrawable = new GradientDrawable();
                        gradientDrawable.setShape(1);
                        gradientDrawable.setColor(Color.parseColor(str));
                        if (b) {
                            gradientDrawable.setStroke(i3, -16777216);
                        }
                        childAt.setBackground(gradientDrawable);
                    }
                    i2 = i4;
                }
                return;
            default:
                ((nr) obj).onClick(view);
                ((w20) obj2).a(1);
                return;
        }
    }
}
