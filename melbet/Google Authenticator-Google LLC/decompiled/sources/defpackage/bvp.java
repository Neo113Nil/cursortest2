package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.authenticator2.R;
import com.google.android.apps.authenticator2.main.OtpView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bvp extends gfz {
    @Override // defpackage.gfz
    public final /* bridge */ /* synthetic */ View a(ViewGroup viewGroup) {
        return (OtpView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.otp_view, viewGroup, false);
    }

    @Override // defpackage.gfz
    public final /* synthetic */ void b(View view, Object obj) {
        final btw btwVar = (btw) obj;
        bvw z = ((OtpView) view).z();
        Object obj2 = z.a;
        OtpView otpView = (OtpView) obj2;
        ((TextView) otpView.findViewById(R.id.otp_name)).setText(btwVar.a);
        ((TextView) otpView.findViewById(R.id.otp_code)).setText(btwVar.b);
        if (btwVar.c) {
            bvw.a(otpView).setVisibility(0);
            bvw.b(otpView).setVisibility(8);
            ((brn) z.b).r(bvw.a(otpView), new bto(btwVar));
        } else {
            bvw.a(otpView).setVisibility(8);
            bvw.b(otpView).setVisibility(0);
            bvw.b(otpView).z().a();
        }
        View view2 = (View) obj2;
        ((brn) z.b).r(view2, new btp(btwVar));
        otpView.setOnLongClickListener(new guy((gva) z.c, new View.OnLongClickListener() { // from class: bvq
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view3) {
                hoq.ab(new btq(btw.this), view3);
                return true;
            }
        }));
        yq.a(view2, otpView.getContext().getString(R.string.edit), new arm(btwVar, 3));
        yq.a(view2, otpView.getContext().getString(R.string.remove), new arm(btwVar, 4));
    }
}
