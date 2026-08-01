package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.view.Window;
import com.derinko.gbini.n1casino.MainActivity;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final /* synthetic */ class vg implements Runnable {
    public final /* synthetic */ yg f;
    public final /* synthetic */ b50 g;
    public final /* synthetic */ b50 h;
    public final /* synthetic */ MainActivity i;
    public final /* synthetic */ View j;

    public /* synthetic */ vg(yg ygVar, b50 b50Var, b50 b50Var2, MainActivity mainActivity, View view) {
        this.f = ygVar;
        this.g = b50Var;
        this.h = b50Var2;
        this.i = mainActivity;
        this.j = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Window window = this.i.getWindow();
        window.getClass();
        b50 b50Var = this.g;
        xl xlVar = b50Var.c;
        View view = this.j;
        Resources resources = view.getResources();
        resources.getClass();
        boolean booleanValue = ((Boolean) xlVar.a(resources)).booleanValue();
        b50 b50Var2 = this.h;
        xl xlVar2 = b50Var2.c;
        Resources resources2 = view.getResources();
        resources2.getClass();
        this.f.b(b50Var, b50Var2, window, view, booleanValue, ((Boolean) xlVar2.a(resources2)).booleanValue());
    }
}
