package defpackage;

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

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class ds extends ArrayAdapter {
    public ColorStateList a;
    public ColorStateList b;
    public final /* synthetic */ es c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ds(es esVar, Context context, int i, String[] strArr) {
        super(context, i, strArr);
        this.c = esVar;
        a();
    }

    public final void a() {
        ColorStateList colorStateList;
        es esVar = this.c;
        ColorStateList colorStateList2 = esVar.r;
        ColorStateList colorStateList3 = null;
        if (colorStateList2 != null) {
            int[] iArr = {R.attr.state_pressed};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        } else {
            colorStateList = null;
        }
        this.b = colorStateList;
        if (esVar.q != 0 && esVar.r != null) {
            int[] iArr2 = {R.attr.state_hovered, -16842919};
            int[] iArr3 = {R.attr.state_selected, -16842919};
            colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{nb.b(esVar.r.getColorForState(iArr3, 0), esVar.q), nb.b(esVar.r.getColorForState(iArr2, 0), esVar.q), esVar.q});
        }
        this.a = colorStateList3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.graphics.drawable.LayerDrawable, android.graphics.drawable.RippleDrawable] */
    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            es esVar = this.c;
            ColorDrawable colorDrawable = null;
            if (esVar.getText().toString().contentEquals(textView.getText()) && esVar.q != 0) {
                ColorDrawable colorDrawable2 = new ColorDrawable(esVar.q);
                if (this.b != null) {
                    colorDrawable2.setTintList(this.a);
                    ?? rippleDrawable = new RippleDrawable(this.b, colorDrawable2, null);
                    FocusRingDrawable e = FocusRingDrawable.e(getContext(), rippleDrawable, null);
                    if (e != null) {
                        e.t.x = esVar.l;
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
