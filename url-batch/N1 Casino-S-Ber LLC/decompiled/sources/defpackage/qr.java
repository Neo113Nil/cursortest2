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

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class qr extends ArrayAdapter {
    public ColorStateList f;
    public ColorStateList g;
    public final /* synthetic */ rr h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qr(rr rrVar, Context context, int i, String[] strArr) {
        super(context, i, strArr);
        this.h = rrVar;
        a();
    }

    public final void a() {
        ColorStateList colorStateList;
        rr rrVar = this.h;
        ColorStateList colorStateList2 = rrVar.r;
        ColorStateList colorStateList3 = null;
        if (colorStateList2 != null) {
            int[] iArr = {R.attr.state_pressed};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        } else {
            colorStateList = null;
        }
        this.g = colorStateList;
        if (rrVar.q != 0 && rrVar.r != null) {
            int[] iArr2 = {R.attr.state_hovered, -16842919};
            int[] iArr3 = {R.attr.state_selected, -16842919};
            colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{lb.b(rrVar.r.getColorForState(iArr3, 0), rrVar.q), lb.b(rrVar.r.getColorForState(iArr2, 0), rrVar.q), rrVar.q});
        }
        this.f = colorStateList3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.graphics.drawable.LayerDrawable, android.graphics.drawable.RippleDrawable] */
    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            rr rrVar = this.h;
            ColorDrawable colorDrawable = null;
            if (rrVar.getText().toString().contentEquals(textView.getText()) && rrVar.q != 0) {
                ColorDrawable colorDrawable2 = new ColorDrawable(rrVar.q);
                if (this.g != null) {
                    colorDrawable2.setTintList(this.f);
                    ?? rippleDrawable = new RippleDrawable(this.g, colorDrawable2, null);
                    FocusRingDrawable e = FocusRingDrawable.e(getContext(), rippleDrawable, null);
                    if (e != null) {
                        e.t.x = rrVar.l;
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
