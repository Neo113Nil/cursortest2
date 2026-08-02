package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.authenticator2.R;
import com.google.android.apps.authenticator2.migration.exports.OtpForExportView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class byk extends gfz {
    @Override // defpackage.gfz
    public final /* bridge */ /* synthetic */ View a(ViewGroup viewGroup) {
        return (OtpForExportView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.otp_for_export_view, viewGroup, false);
    }

    @Override // defpackage.gfz
    public final /* synthetic */ void b(View view, Object obj) {
        OtpForExportView otpForExportView = (OtpForExportView) view;
        byj byjVar = (byj) obj;
        byo z = otpForExportView.z();
        Object obj2 = z.a;
        OtpForExportView otpForExportView2 = (OtpForExportView) obj2;
        ((TextView) otpForExportView2.findViewById(R.id.otp_name)).setText(byjVar.a);
        byo.a(otpForExportView2).setChecked(byjVar.c);
        brn brnVar = (brn) z.c;
        brnVar.r((View) obj2, new bym());
        brnVar.r(byo.a(otpForExportView2), new byl());
        otpForExportView.z().b = byjVar;
    }
}
