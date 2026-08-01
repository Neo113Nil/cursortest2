package n0;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.w0;
import java.util.ArrayList;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class b extends View {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f2940f;
    public final /* synthetic */ d g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, Context context, ViewGroup viewGroup) {
        super(context);
        this.g = dVar;
        this.f2940f = viewGroup;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        d dVar = this.g;
        ArrayList arrayList = dVar.f2943b;
        Drawable background = this.f2940f.getBackground();
        int color = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
        if (dVar.f2945e != color) {
            dVar.f2945e = color;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ArrayList arrayList2 = ((a) arrayList.get(size)).f2937a;
                int size2 = arrayList2.size() - 1;
                if (size2 >= 0) {
                    throw w0.d(arrayList2, size2);
                }
            }
        }
    }
}
