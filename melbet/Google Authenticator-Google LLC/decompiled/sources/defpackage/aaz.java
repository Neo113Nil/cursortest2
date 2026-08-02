package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aaz extends View {
    final /* synthetic */ ViewGroup a;
    final /* synthetic */ abc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aaz(abc abcVar, Context context, ViewGroup viewGroup) {
        super(context);
        this.b = abcVar;
        this.a = viewGroup;
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        Drawable background = this.a.getBackground();
        int color = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
        abc abcVar = this.b;
        if (abcVar.e == color) {
            return;
        }
        abcVar.e = color;
        ArrayList arrayList = abcVar.b;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((aay) arrayList.get(size)).c();
            }
        }
    }
}
