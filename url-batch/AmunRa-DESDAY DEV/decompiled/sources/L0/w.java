package L0;

import K.S;
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
    public ColorStateList f583a;

    /* renamed from: b, reason: collision with root package name */
    public ColorStateList f584b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f585c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(x xVar, Context context, int i, String[] strArr) {
        super(context, i, strArr);
        this.f585c = xVar;
        a();
    }

    public final void a() {
        ColorStateList colorStateList;
        x xVar = this.f585c;
        ColorStateList colorStateList2 = xVar.f591l;
        ColorStateList colorStateList3 = null;
        if (colorStateList2 != null) {
            int[] iArr = {R.attr.state_pressed};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        } else {
            colorStateList = null;
        }
        this.f584b = colorStateList;
        if (xVar.f590k != 0 && xVar.f591l != null) {
            int[] iArr2 = {R.attr.state_hovered, -16842919};
            int[] iArr3 = {R.attr.state_selected, -16842919};
            colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{C.a.b(xVar.f591l.getColorForState(iArr3, 0), xVar.f590k), C.a.b(xVar.f591l.getColorForState(iArr2, 0), xVar.f590k), xVar.f590k});
        }
        this.f583a = colorStateList3;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            x xVar = this.f585c;
            Drawable drawable = null;
            if (xVar.getText().toString().contentEquals(textView.getText()) && xVar.f590k != 0) {
                ColorDrawable colorDrawable = new ColorDrawable(xVar.f590k);
                if (this.f584b != null) {
                    D.a.h(colorDrawable, this.f583a);
                    drawable = new RippleDrawable(this.f584b, colorDrawable, null);
                } else {
                    drawable = colorDrawable;
                }
            }
            WeakHashMap weakHashMap = S.f362a;
            textView.setBackground(drawable);
        }
        return view2;
    }
}
