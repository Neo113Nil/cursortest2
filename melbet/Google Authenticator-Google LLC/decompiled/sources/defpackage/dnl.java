package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import com.google.android.apps.authenticator2.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dnl extends kr {
    final /* synthetic */ bvm a;
    private final LayoutInflater e;
    private final int f;

    public dnl(bvm bvmVar, Context context) {
        this.a = bvmVar;
        this.e = LayoutInflater.from(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, dnr.a, R.attr.floatingSpeedDialAdapterStyle, 0);
        this.f = obtainStyledAttributes.getResourceId(0, R.layout.mtrl_internal_speed_dial_item);
        obtainStyledAttributes.recycle();
    }

    @Override // defpackage.kr
    public final int a() {
        return ((his) this.a.D).c;
    }

    @Override // defpackage.kr
    public final int b(int i) {
        return R.id.mtrl_internal_speed_dial_item;
    }

    @Override // defpackage.kr
    public final /* bridge */ /* synthetic */ lp d(ViewGroup viewGroup, int i) {
        dzs dzsVar = new dzs(this.e.inflate(this.f, viewGroup, false));
        dzsVar.a.setOnClickListener(new dxu(1));
        return dzsVar;
    }

    @Override // defpackage.kr
    public final /* synthetic */ void k(lp lpVar, int i) {
        bvm bvmVar = this.a;
        dzs dzsVar = (dzs) lpVar;
        buy buyVar = (buy) bvmVar.D.get(i);
        int i2 = buyVar.a;
        TextView textView = (TextView) dzsVar.t;
        int i3 = 0;
        textView.setVisibility(0);
        textView.setText(i2);
        FloatingActionButton floatingActionButton = (FloatingActionButton) dzsVar.u;
        floatingActionButton.setImageResource(buyVar.b);
        ViewParent parent = floatingActionButton.getParent();
        if (parent instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) parent;
            while (true) {
                if (i3 >= viewGroup.getChildCount()) {
                    break;
                }
                if (viewGroup.getChildAt(i3) instanceof TextView) {
                    TextView textView2 = (TextView) viewGroup.getChildAt(i3);
                    textView2.setBackground(bvmVar.c.x().getDrawable(R.drawable.rounded_fab_label_background));
                    textView2.setTextAppearance(R.style.fabLabelStyle);
                    break;
                }
                i3++;
            }
        }
        bvmVar.aa.r(dzsVar.a, buyVar.d);
        floatingActionButton.setTag(buyVar.c, Integer.valueOf(i2));
    }
}
