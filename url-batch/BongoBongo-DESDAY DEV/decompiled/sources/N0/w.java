package N0;

import L.T;
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
    public ColorStateList f734a;

    /* renamed from: b, reason: collision with root package name */
    public ColorStateList f735b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f736c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(x xVar, Context context, int i, String[] strArr) {
        super(context, i, strArr);
        this.f736c = xVar;
        a();
    }

    public final void a() {
        ColorStateList colorStateList;
        x xVar = this.f736c;
        ColorStateList colorStateList2 = xVar.f743l;
        ColorStateList colorStateList3 = null;
        if (colorStateList2 != null) {
            int[] iArr = {R.attr.state_pressed};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        } else {
            colorStateList = null;
        }
        this.f735b = colorStateList;
        if (xVar.f742k != 0 && xVar.f743l != null) {
            int[] iArr2 = {R.attr.state_hovered, -16842919};
            int[] iArr3 = {R.attr.state_selected, -16842919};
            colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{D.a.b(xVar.f743l.getColorForState(iArr3, 0), xVar.f742k), D.a.b(xVar.f743l.getColorForState(iArr2, 0), xVar.f742k), xVar.f742k});
        }
        this.f734a = colorStateList3;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            x xVar = this.f736c;
            Drawable drawable = null;
            if (xVar.getText().toString().contentEquals(textView.getText()) && xVar.f742k != 0) {
                ColorDrawable colorDrawable = new ColorDrawable(xVar.f742k);
                if (this.f735b != null) {
                    E.a.h(colorDrawable, this.f734a);
                    drawable = new RippleDrawable(this.f735b, colorDrawable, null);
                } else {
                    drawable = colorDrawable;
                }
            }
            WeakHashMap weakHashMap = T.f490a;
            textView.setBackground(drawable);
        }
        return view2;
    }
}
