package U0;

import K.Q;
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
public final class v extends ArrayAdapter {

    /* renamed from: a, reason: collision with root package name */
    public ColorStateList f1224a;

    /* renamed from: b, reason: collision with root package name */
    public ColorStateList f1225b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w f1226c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(w wVar, Context context, int i, String[] strArr) {
        super(context, i, strArr);
        this.f1226c = wVar;
        a();
    }

    public final void a() {
        ColorStateList colorStateList;
        w wVar = this.f1226c;
        ColorStateList colorStateList2 = wVar.f1232l;
        ColorStateList colorStateList3 = null;
        if (colorStateList2 != null) {
            int[] iArr = {R.attr.state_pressed};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        } else {
            colorStateList = null;
        }
        this.f1225b = colorStateList;
        if (wVar.f1231k != 0 && wVar.f1232l != null) {
            int[] iArr2 = {R.attr.state_hovered, -16842919};
            int[] iArr3 = {R.attr.state_selected, -16842919};
            colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{C.a.b(wVar.f1232l.getColorForState(iArr3, 0), wVar.f1231k), C.a.b(wVar.f1232l.getColorForState(iArr2, 0), wVar.f1231k), wVar.f1231k});
        }
        this.f1224a = colorStateList3;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            w wVar = this.f1226c;
            Drawable drawable = null;
            if (wVar.getText().toString().contentEquals(textView.getText()) && wVar.f1231k != 0) {
                ColorDrawable colorDrawable = new ColorDrawable(wVar.f1231k);
                if (this.f1225b != null) {
                    D.a.h(colorDrawable, this.f1224a);
                    drawable = new RippleDrawable(this.f1225b, colorDrawable, null);
                } else {
                    drawable = colorDrawable;
                }
            }
            WeakHashMap weakHashMap = Q.f578a;
            textView.setBackground(drawable);
        }
        return view2;
    }
}
