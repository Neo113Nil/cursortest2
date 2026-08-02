package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.authenticator2.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class fji extends lp {
    public fji(LayoutInflater layoutInflater, ViewGroup viewGroup, View.OnClickListener onClickListener) {
        super(layoutInflater.inflate(R.layout.design_navigation_item, viewGroup, false));
        this.a.setOnClickListener(onClickListener);
    }
}
