package defpackage;

import android.animation.Animator;
import android.view.View;
import com.google.android.apps.authenticator2.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dms {
    public int a = 0;
    public int b = 0;
    public Animator c;
    public View d;
    public View e;

    private dms() {
    }

    public static dms a(FloatingActionButton floatingActionButton) {
        dms dmsVar = (dms) floatingActionButton.getTag(R.id.mtrl_fab_transition_state);
        if (dmsVar != null) {
            return dmsVar;
        }
        dms dmsVar2 = new dms();
        floatingActionButton.setTag(R.id.mtrl_fab_transition_state, dmsVar2);
        return dmsVar2;
    }
}
