package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.view.Window;
import com.moontiko.really.admiralcasino.MainActivity;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final /* synthetic */ class wi implements Runnable {
    public final /* synthetic */ zi f;
    public final /* synthetic */ e80 g;
    public final /* synthetic */ e80 h;
    public final /* synthetic */ MainActivity i;
    public final /* synthetic */ View j;

    public /* synthetic */ wi(zi ziVar, e80 e80Var, e80 e80Var2, MainActivity mainActivity, View view) {
        this.f = ziVar;
        this.g = e80Var;
        this.h = e80Var2;
        this.i = mainActivity;
        this.j = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Window window = this.i.getWindow();
        window.getClass();
        e80 e80Var = this.g;
        co coVar = e80Var.c;
        View view = this.j;
        Resources resources = view.getResources();
        resources.getClass();
        boolean booleanValue = ((Boolean) coVar.g(resources)).booleanValue();
        e80 e80Var2 = this.h;
        co coVar2 = e80Var2.c;
        Resources resources2 = view.getResources();
        resources2.getClass();
        this.f.b(e80Var, e80Var2, window, view, booleanValue, ((Boolean) coVar2.g(resources2)).booleanValue());
    }
}
