package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class xg0 extends View {
    public final /* synthetic */ ViewGroup f;
    public final /* synthetic */ zg0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xg0(zg0 zg0Var, Context context, ViewGroup viewGroup) {
        super(context);
        this.g = zg0Var;
        this.f = viewGroup;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        zg0 zg0Var = this.g;
        ArrayList arrayList = zg0Var.b;
        Drawable background = this.f.getBackground();
        int color = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
        if (zg0Var.e != color) {
            zg0Var.e = color;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((s60) arrayList.get(size)).b(color);
            }
        }
    }
}
