package defpackage;

import android.content.DialogInterface;
import com.facebook.login.DeviceAuthDialog;
import com.facebook.login.LoginManager;
import com.facebook.login.widget.LoginButton;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class ka0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;

    public /* synthetic */ ka0(int i, Object obj) {
        this.m = i;
        this.n = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.m;
        Object obj = this.n;
        switch (i2) {
            case 0:
                DeviceAuthDialog.presentConfirmation$lambda$8((DeviceAuthDialog) obj, dialogInterface, i);
                break;
            default:
                LoginButton.LoginClickListener.performLogout$lambda$2((LoginManager) obj, dialogInterface, i);
                break;
        }
    }
}
