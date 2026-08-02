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

/* compiled from: PG */
/* loaded from: classes2.dex */
final class fqx extends ArrayAdapter {
    final /* synthetic */ fqy a;
    private final ColorStateList b;
    private final ColorStateList c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fqx(fqy fqyVar, Context context, int i, String[] strArr) {
        super(context, i, strArr);
        ColorStateList colorStateList;
        this.a = fqyVar;
        ColorStateList colorStateList2 = null;
        if (b()) {
            int[] iArr = {R.attr.state_pressed};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{fqyVar.f.getColorForState(iArr, 0), 0});
        } else {
            colorStateList = null;
        }
        this.c = colorStateList;
        if (a() && b()) {
            int[] iArr2 = {R.attr.state_hovered, -16842919};
            int[] iArr3 = {R.attr.state_selected, -16842919};
            colorStateList2 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{va.b(fqyVar.f.getColorForState(iArr3, 0), fqyVar.e), va.b(fqyVar.f.getColorForState(iArr2, 0), fqyVar.e), fqyVar.e});
        }
        this.b = colorStateList2;
    }

    private final boolean a() {
        return this.a.e != 0;
    }

    private final boolean b() {
        return this.a.f != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.graphics.drawable.LayerDrawable, android.graphics.drawable.RippleDrawable] */
    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            fqy fqyVar = this.a;
            ColorDrawable colorDrawable = null;
            if (fqyVar.getText().toString().contentEquals(textView.getText()) && a()) {
                ColorDrawable colorDrawable2 = new ColorDrawable(fqyVar.e);
                ColorStateList colorStateList = this.c;
                if (colorStateList != null) {
                    colorDrawable2.setTintList(this.b);
                    ?? rippleDrawable = new RippleDrawable(colorStateList, colorDrawable2, null);
                    FocusRingDrawable a = FocusRingDrawable.a(getContext(), rippleDrawable, null);
                    if (a != null) {
                        a.c.x = fqyVar.b;
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
