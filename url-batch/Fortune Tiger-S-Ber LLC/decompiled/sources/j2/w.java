package j2;

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

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class w extends ArrayAdapter {

    /* renamed from: a, reason: collision with root package name */
    public ColorStateList f2386a;

    /* renamed from: b, reason: collision with root package name */
    public ColorStateList f2387b;
    public final /* synthetic */ x c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(x xVar, Context context, int i4, String[] strArr) {
        super(context, i4, strArr);
        this.c = xVar;
        a();
    }

    public final void a() {
        ColorStateList colorStateList;
        x xVar = this.c;
        ColorStateList colorStateList2 = xVar.f2396r;
        ColorStateList colorStateList3 = null;
        if (colorStateList2 != null) {
            int[] iArr = {R.attr.state_pressed};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        } else {
            colorStateList = null;
        }
        this.f2387b = colorStateList;
        if (xVar.f2395q != 0 && xVar.f2396r != null) {
            int[] iArr2 = {R.attr.state_hovered, -16842919};
            int[] iArr3 = {R.attr.state_selected, -16842919};
            colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{c0.a.b(xVar.f2396r.getColorForState(iArr3, 0), xVar.f2395q), c0.a.b(xVar.f2396r.getColorForState(iArr2, 0), xVar.f2395q), xVar.f2395q});
        }
        this.f2386a = colorStateList3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i4, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i4, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            x xVar = this.c;
            ColorDrawable colorDrawable = null;
            if (xVar.getText().toString().contentEquals(textView.getText()) && xVar.f2395q != 0) {
                ColorDrawable colorDrawable2 = new ColorDrawable(xVar.f2395q);
                if (this.f2387b != null) {
                    colorDrawable2.setTintList(this.f2386a);
                    RippleDrawable rippleDrawable = new RippleDrawable(this.f2387b, colorDrawable2, null);
                    FocusRingDrawable e4 = FocusRingDrawable.e(getContext(), rippleDrawable, null);
                    if (e4 != null) {
                        e4.f1361t.f3680x = xVar.f2390l;
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
