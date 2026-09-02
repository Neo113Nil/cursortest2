package o2;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class t extends ArrayAdapter {

    /* renamed from: a, reason: collision with root package name */
    public ColorStateList f2963a;

    /* renamed from: b, reason: collision with root package name */
    public ColorStateList f2964b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u f2965c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(u uVar, Context context, int i, String[] strArr) {
        super(context, i, strArr);
        this.f2965c = uVar;
        a();
    }

    public final void a() {
        ColorStateList colorStateList;
        u uVar = this.f2965c;
        ColorStateList colorStateList2 = uVar.f2973q;
        ColorStateList colorStateList3 = null;
        if (colorStateList2 != null) {
            int[] iArr = {R.attr.state_pressed};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        } else {
            colorStateList = null;
        }
        this.f2964b = colorStateList;
        if (uVar.f2972p != 0 && uVar.f2973q != null) {
            int[] iArr2 = {R.attr.state_hovered, -16842919};
            int[] iArr3 = {R.attr.state_selected, -16842919};
            colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{f0.a.b(uVar.f2973q.getColorForState(iArr3, 0), uVar.f2972p), f0.a.b(uVar.f2973q.getColorForState(iArr2, 0), uVar.f2972p), uVar.f2972p});
        }
        this.f2963a = colorStateList3;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            u uVar = this.f2965c;
            Drawable drawable = null;
            if (uVar.getText().toString().contentEquals(textView.getText()) && uVar.f2972p != 0) {
                ColorDrawable colorDrawable = new ColorDrawable(uVar.f2972p);
                if (this.f2964b != null) {
                    colorDrawable.setTintList(this.f2963a);
                    drawable = new RippleDrawable(this.f2964b, colorDrawable, null);
                } else {
                    drawable = colorDrawable;
                }
            }
            textView.setBackground(drawable);
        }
        return view2;
    }
}
