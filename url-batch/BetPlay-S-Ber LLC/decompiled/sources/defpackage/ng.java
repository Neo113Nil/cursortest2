package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.view.Window;
import com.awerser.monnit.betplay.MainActivity;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final /* synthetic */ class ng implements Runnable {
    public final /* synthetic */ qg f;
    public final /* synthetic */ i50 g;
    public final /* synthetic */ i50 h;
    public final /* synthetic */ MainActivity i;
    public final /* synthetic */ View j;

    public /* synthetic */ ng(qg qgVar, i50 i50Var, i50 i50Var2, MainActivity mainActivity, View view) {
        this.f = qgVar;
        this.g = i50Var;
        this.h = i50Var2;
        this.i = mainActivity;
        this.j = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Window window = this.i.getWindow();
        window.getClass();
        i50 i50Var = this.g;
        gm gmVar = i50Var.c;
        View view = this.j;
        Resources resources = view.getResources();
        resources.getClass();
        boolean booleanValue = ((Boolean) gmVar.a(resources)).booleanValue();
        i50 i50Var2 = this.h;
        gm gmVar2 = i50Var2.c;
        Resources resources2 = view.getResources();
        resources2.getClass();
        this.f.b(i50Var, i50Var2, window, view, booleanValue, ((Boolean) gmVar2.a(resources2)).booleanValue());
    }
}
