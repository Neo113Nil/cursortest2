package defpackage;

import android.view.View;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ecv implements View.OnClickListener {
    public boolean a;
    final /* synthetic */ cka b;

    public ecv(cka ckaVar) {
        this.b = ckaVar;
    }

    public final void a() {
        fao.e(new ect(this, 0));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Executor mainExecutor;
        if (this.a) {
            return;
        }
        this.a = true;
        view.getContext();
        hvi aJ = hnu.aJ(true);
        ecu ecuVar = new ecu(this, view, 0);
        mainExecutor = view.getContext().getMainExecutor();
        hnu.aS(aJ, ecuVar, mainExecutor);
    }
}
