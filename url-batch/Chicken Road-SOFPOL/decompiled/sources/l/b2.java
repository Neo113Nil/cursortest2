package l;

import android.view.View;
import androidx.appcompat.widget.Toolbar;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class b2 implements View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4222d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4223e;

    public b2(i2 i2Var) {
        this.f4223e = i2Var;
        i2Var.f4278a.getContext();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f4222d) {
            case 0:
                e2 e2Var = ((Toolbar) this.f4223e).N;
                k.j jVar = e2Var == null ? null : e2Var.f4228e;
                if (jVar != null) {
                    jVar.collapseActionView();
                    break;
                }
                break;
            default:
                i2 i2Var = (i2) this.f4223e;
                if (i2Var.f4287k != null) {
                    i2Var.getClass();
                    break;
                }
                break;
        }
    }

    public b2(Toolbar toolbar) {
        this.f4223e = toolbar;
    }
}
