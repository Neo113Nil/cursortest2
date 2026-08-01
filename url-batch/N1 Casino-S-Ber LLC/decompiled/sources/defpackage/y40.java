package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class y40 extends View {
    public final /* synthetic */ ViewGroup f;
    public final /* synthetic */ a50 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y40(a50 a50Var, Context context, ViewGroup viewGroup) {
        super(context);
        this.g = a50Var;
        this.f = viewGroup;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        a50 a50Var = this.g;
        ArrayList arrayList = a50Var.b;
        Drawable background = this.f.getBackground();
        int color = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
        if (a50Var.e != color) {
            a50Var.e = color;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((mx) arrayList.get(size)).b(color);
            }
        }
    }
}
