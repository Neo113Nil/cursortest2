package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import com.google.android.apps.authenticator2.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dfd extends bd {
    public Button a;
    public ekx b;

    @Override // defpackage.bd
    public final View I(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        CharSequence charSequence;
        layoutInflater.getClass();
        View inflate = layoutInflater.inflate(R.layout.aag_privacy_lock_fragment, viewGroup, false);
        Bundle bundle2 = this.n;
        int i = bundle2 != null ? bundle2.getInt("app_icon_res") : 0;
        if (i == 0) {
            throw new IllegalArgumentException("App icon resource ID argument was missing or zero");
        }
        ((ImageView) inflate.findViewById(R.id.aag_privacy_lock_app_icon)).setImageResource(i);
        Button button = (Button) inflate.findViewById(R.id.aag_privacy_lock_auth_button);
        ekx ekxVar = this.b;
        if (ekxVar != null) {
            Context context = button.getContext();
            context.getClass();
            charSequence = ekxVar.g(context);
        } else {
            charSequence = null;
        }
        button.setText(charSequence);
        button.setOnClickListener(new cx(this, 5, null));
        this.a = button;
        return inflate;
    }
}
