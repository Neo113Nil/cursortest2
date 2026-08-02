package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.android.apps.authenticator2.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dzs extends lp {
    public final View t;
    public final Object u;

    public dzs(View view) {
        super(view);
        this.u = (FloatingActionButton) view.findViewById(R.id.mtrl_internal_speed_dial_item_fab);
        this.t = (TextView) view.findViewById(R.id.mtrl_internal_speed_dial_item_label);
    }

    public dzs(View view, dzo dzoVar) {
        super(view);
        this.t = view;
        this.u = dzoVar;
    }
}
