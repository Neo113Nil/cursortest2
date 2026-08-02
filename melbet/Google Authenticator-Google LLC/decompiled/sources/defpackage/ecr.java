package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.authenticator2.R;
import com.google.android.libraries.onegoogle.actions.SimpleActionView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ecr extends lp {
    public final ImageView t;
    public final TextView u;
    public final int v;
    public final efu w;
    public final SimpleActionView x;

    public ecr(Context context, efu efuVar, ViewGroup viewGroup) {
        super(LayoutInflater.from(context).inflate(R.layout.action_list_item, viewGroup, false));
        View view = this.a;
        this.x = (SimpleActionView) view;
        this.w = efuVar;
        this.t = (ImageView) view.findViewById(R.id.icon);
        this.u = (TextView) this.a.findViewById(R.id.text);
        this.v = dih.am(context, R.attr.ogIconColor);
    }
}
