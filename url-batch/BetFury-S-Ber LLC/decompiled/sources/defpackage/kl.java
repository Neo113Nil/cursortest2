package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.view.Window;
import com.trembin.nirefon.betfury.MainActivity;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final /* synthetic */ class kl implements Runnable {
    public final /* synthetic */ nl f;
    public final /* synthetic */ ah0 g;
    public final /* synthetic */ ah0 h;
    public final /* synthetic */ MainActivity i;
    public final /* synthetic */ View j;

    public /* synthetic */ kl(nl nlVar, ah0 ah0Var, ah0 ah0Var2, MainActivity mainActivity, View view) {
        this.f = nlVar;
        this.g = ah0Var;
        this.h = ah0Var2;
        this.i = mainActivity;
        this.j = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Window window = this.i.getWindow();
        window.getClass();
        ah0 ah0Var = this.g;
        tr trVar = ah0Var.c;
        View view = this.j;
        Resources resources = view.getResources();
        resources.getClass();
        boolean booleanValue = ((Boolean) trVar.h(resources)).booleanValue();
        ah0 ah0Var2 = this.h;
        tr trVar2 = ah0Var2.c;
        Resources resources2 = view.getResources();
        resources2.getClass();
        this.f.b(ah0Var, ah0Var2, window, view, booleanValue, ((Boolean) trVar2.h(resources2)).booleanValue());
    }
}
