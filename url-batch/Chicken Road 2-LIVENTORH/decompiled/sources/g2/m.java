package g2;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.oriondriftchasers.arordrft.R;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class m extends FrameLayout implements i {

    /* renamed from: f, reason: collision with root package name */
    public final TextView f1782f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1783g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1784h;
    public k.o i;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f1785j;

    public m(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.m3_navigation_menu_subheader, (ViewGroup) this, true);
        this.f1782f = (TextView) findViewById(R.id.navigation_menu_subheader_label);
    }

    public final void a() {
        k.o oVar = this.i;
        if (oVar != null) {
            setVisibility((!oVar.isVisible() || (!this.f1783g && this.f1784h)) ? 8 : 0);
        }
    }

    @Override // k.z
    public final void b(k.o oVar) {
        this.i = oVar;
        oVar.setCheckable(false);
        this.f1782f.setText(oVar.f2088e);
        a();
    }

    @Override // k.z
    public k.o getItemData() {
        return this.i;
    }

    @Override // g2.i
    public void setExpanded(boolean z3) {
        this.f1783g = z3;
        a();
    }

    @Override // g2.i
    public void setOnlyShowWhenExpanded(boolean z3) {
        this.f1784h = z3;
        a();
    }

    public void setTextAppearance(int i) {
        TextView textView = this.f1782f;
        textView.setTextAppearance(i);
        ColorStateList colorStateList = this.f1785j;
        if (colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f1785j = colorStateList;
        if (colorStateList != null) {
            this.f1782f.setTextColor(colorStateList);
        }
    }

    public void setCheckable(boolean z3) {
    }

    public void setChecked(boolean z3) {
    }

    @Override // android.view.View
    public void setEnabled(boolean z3) {
    }

    public void setIcon(Drawable drawable) {
    }

    public void setTitle(CharSequence charSequence) {
    }
}
