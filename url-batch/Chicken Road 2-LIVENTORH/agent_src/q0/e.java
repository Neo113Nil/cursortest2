package q0;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class e extends View {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f3062f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g f3063g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, Context context, ViewGroup viewGroup) {
        super(context);
        this.f3063g = gVar;
        this.f3062f = viewGroup;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        Drawable background = this.f3062f.getBackground();
        int color = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
        g gVar = this.f3063g;
        if (gVar.f3069e != color) {
            gVar.f3069e = color;
            for (int size = gVar.f3067b.size() - 1; size >= 0; size--) {
                ((c) gVar.f3067b.get(size)).b(color);
            }
        }
    }
}
