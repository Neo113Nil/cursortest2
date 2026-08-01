package m;

import android.view.View;
import androidx.appcompat.widget.Toolbar;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class u1 implements View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Toolbar f6199d;

    public u1(Toolbar toolbar) {
        this.f6199d = toolbar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        x1 x1Var = this.f6199d.f442b0;
        l.j jVar = x1Var == null ? null : x1Var.f6204e;
        if (jVar != null) {
            jVar.collapseActionView();
        }
    }
}
