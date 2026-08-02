package defpackage;

import android.view.View;
import com.google.android.apps.authenticator2.R;
import com.google.android.material.internal.NavigationMenuItemView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fja extends wv {
    final /* synthetic */ NavigationMenuItemView a;

    public fja(NavigationMenuItemView navigationMenuItemView) {
        this.a = navigationMenuItemView;
    }

    @Override // defpackage.wv
    public final void c(View view, aah aahVar) {
        super.c(view, aahVar);
        NavigationMenuItemView navigationMenuItemView = this.a;
        aahVar.n(navigationMenuItemView.e);
        aahVar.z(navigationMenuItemView.getResources().getString(R.string.item_view_role_description));
    }
}
