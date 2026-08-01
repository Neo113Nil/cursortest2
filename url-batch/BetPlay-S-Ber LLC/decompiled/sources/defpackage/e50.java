package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class e50 extends View {
    public final /* synthetic */ ViewGroup f;
    public final /* synthetic */ h50 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e50(h50 h50Var, Context context, ViewGroup viewGroup) {
        super(context);
        this.g = h50Var;
        this.f = viewGroup;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        h50 h50Var = this.g;
        ArrayList arrayList = h50Var.b;
        Drawable background = this.f.getBackground();
        int color = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
        if (h50Var.e != color) {
            h50Var.e = color;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ArrayList arrayList2 = ((cy) arrayList.get(size)).a;
                for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                    ((ay) arrayList2.get(size2)).a(color);
                }
            }
        }
    }
}
