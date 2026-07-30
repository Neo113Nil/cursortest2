package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class rc2 extends View {
    public final /* synthetic */ uc2 OPXfSBeufaJ8;
    public final /* synthetic */ ViewGroup rtx2ld2ELZv4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rc2(uc2 uc2Var, Context context, ViewGroup viewGroup) {
        super(context);
        this.OPXfSBeufaJ8 = uc2Var;
        this.rtx2ld2ELZv4 = viewGroup;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        uc2 uc2Var = this.OPXfSBeufaJ8;
        ArrayList arrayList = uc2Var.lS5Rgt96tfkO;
        Drawable background = this.rtx2ld2ELZv4.getBackground();
        int color = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
        if (uc2Var.e9gEMXR7LXtO != color) {
            uc2Var.e9gEMXR7LXtO = color;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((br1) arrayList.get(size)).lS5Rgt96tfkO(color);
            }
        }
    }
}
