package s2;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.google.android.material.focus.FocusRingDrawable;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class t extends ArrayAdapter {

    /* renamed from: a, reason: collision with root package name */
    public ColorStateList f3322a;

    /* renamed from: b, reason: collision with root package name */
    public ColorStateList f3323b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u f3324c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(u uVar, Context context, int i, String[] strArr) {
        super(context, i, strArr);
        this.f3324c = uVar;
        a();
    }

    public final void a() {
        ColorStateList colorStateList;
        u uVar = this.f3324c;
        ColorStateList colorStateList2 = uVar.f3333r;
        ColorStateList colorStateList3 = null;
        if (colorStateList2 != null) {
            int[] iArr = {R.attr.state_pressed};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        } else {
            colorStateList = null;
        }
        this.f3323b = colorStateList;
        if (uVar.f3332q != 0 && uVar.f3333r != null) {
            int[] iArr2 = {R.attr.state_hovered, -16842919};
            int[] iArr3 = {R.attr.state_selected, -16842919};
            colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{f0.a.b(uVar.f3333r.getColorForState(iArr3, 0), uVar.f3332q), f0.a.b(uVar.f3333r.getColorForState(iArr2, 0), uVar.f3332q), uVar.f3332q});
        }
        this.f3322a = colorStateList3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.graphics.drawable.LayerDrawable, android.graphics.drawable.RippleDrawable] */
    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            u uVar = this.f3324c;
            ColorDrawable colorDrawable = null;
            if (uVar.getText().toString().contentEquals(textView.getText()) && uVar.f3332q != 0) {
                ColorDrawable colorDrawable2 = new ColorDrawable(uVar.f3332q);
                if (this.f3323b != null) {
                    colorDrawable2.setTintList(this.f3322a);
                    ?? rippleDrawable = new RippleDrawable(this.f3323b, colorDrawable2, null);
                    FocusRingDrawable e4 = FocusRingDrawable.e(getContext(), rippleDrawable, null);
                    if (e4 != null) {
                        e4.f1168t.f1994x = uVar.f3327l;
                    }
                    colorDrawable = rippleDrawable;
                } else {
                    colorDrawable = colorDrawable2;
                }
            }
            textView.setBackground(colorDrawable);
        }
        return view2;
    }
}
