package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.authenticator2.R;
import com.google.android.apps.authenticator2.editotp.AccountView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bpz extends gfz {
    @Override // defpackage.gfz
    public final /* bridge */ /* synthetic */ View a(ViewGroup viewGroup) {
        return (AccountView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.account_view, viewGroup, false);
    }

    @Override // defpackage.gfz
    public final /* synthetic */ void b(View view, Object obj) {
        bqz bqzVar = (bqz) obj;
        bqd z = ((AccountView) view).z();
        z.d = bqzVar;
        Object obj2 = z.a;
        AccountView accountView = (AccountView) obj2;
        ((TextView) accountView.findViewById(R.id.account_name)).setText(bqzVar.a);
        baf a = ((gnh) z.c).a(new fxy(bqzVar.b));
        if (gna.r == null) {
            gna.r = new gna().e().j();
        }
        a.f(gna.r).h((ImageView) accountView.findViewById(R.id.account_avatar_image_view));
        bqd.a(accountView).setChecked(bqzVar.c);
        brn brnVar = (brn) z.b;
        brnVar.r((View) obj2, new bqm(accountView));
        brnVar.r(bqd.a(accountView), new bqn(accountView));
    }
}
