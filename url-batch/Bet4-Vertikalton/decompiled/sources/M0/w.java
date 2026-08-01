package M0;

import K.T;
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
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class w extends ArrayAdapter {

    /* renamed from: a, reason: collision with root package name */
    public ColorStateList f658a;

    /* renamed from: b, reason: collision with root package name */
    public ColorStateList f659b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f660c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(x xVar, Context context, int i, String[] strArr) {
        super(context, i, strArr);
        this.f660c = xVar;
        a();
    }

    public final void a() {
        ColorStateList colorStateList;
        x xVar = this.f660c;
        ColorStateList colorStateList2 = xVar.f666l;
        ColorStateList colorStateList3 = null;
        if (colorStateList2 != null) {
            int[] iArr = {R.attr.state_pressed};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        } else {
            colorStateList = null;
        }
        this.f659b = colorStateList;
        if (xVar.f665k != 0 && xVar.f666l != null) {
            int[] iArr2 = {R.attr.state_hovered, -16842919};
            int[] iArr3 = {R.attr.state_selected, -16842919};
            colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{C.a.b(xVar.f666l.getColorForState(iArr3, 0), xVar.f665k), C.a.b(xVar.f666l.getColorForState(iArr2, 0), xVar.f665k), xVar.f665k});
        }
        this.f658a = colorStateList3;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            x xVar = this.f660c;
            Drawable drawable = null;
            if (xVar.getText().toString().contentEquals(textView.getText()) && xVar.f665k != 0) {
                ColorDrawable colorDrawable = new ColorDrawable(xVar.f665k);
                if (this.f659b != null) {
                    D.a.h(colorDrawable, this.f658a);
                    drawable = new RippleDrawable(this.f659b, colorDrawable, null);
                } else {
                    drawable = colorDrawable;
                }
            }
            WeakHashMap weakHashMap = T.f423a;
            textView.setBackground(drawable);
        }
        return view2;
    }
}
