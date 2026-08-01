package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class b80 extends View {
    public final /* synthetic */ ViewGroup f;
    public final /* synthetic */ d80 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b80(d80 d80Var, Context context, ViewGroup viewGroup) {
        super(context);
        this.g = d80Var;
        this.f = viewGroup;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        d80 d80Var = this.g;
        ArrayList arrayList = d80Var.b;
        Drawable background = this.f.getBackground();
        int color = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
        if (d80Var.e != color) {
            d80Var.e = color;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((p00) arrayList.get(size)).b(color);
            }
        }
    }
}
