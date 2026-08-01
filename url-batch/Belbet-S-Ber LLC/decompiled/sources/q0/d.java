package q0;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class d extends View {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f3132f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f f3133g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, Context context, ViewGroup viewGroup) {
        super(context);
        this.f3133g = fVar;
        this.f3132f = viewGroup;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        Drawable background = this.f3132f.getBackground();
        int color = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
        f fVar = this.f3133g;
        if (fVar.f3139e != color) {
            fVar.f3139e = color;
            for (int size = fVar.f3137b.size() - 1; size >= 0; size--) {
                ((c) fVar.f3137b.get(size)).b(color);
            }
        }
    }
}
