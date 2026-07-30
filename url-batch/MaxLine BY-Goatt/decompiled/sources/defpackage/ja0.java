package defpackage;

import android.view.View;
import android.widget.Toast;
import com.facebook.FacebookButtonBase;
import com.facebook.internal.WebDialog;
import com.facebook.login.DeviceAuthDialog;
import com.facebook.login.widget.ToolTipPopup;
import com.majelw.libystne.MainActivity;
import com.majelw.libystne.R;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class ja0 implements View.OnClickListener {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;

    public /* synthetic */ ja0(int i, Object obj) {
        this.m = i;
        this.n = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.m;
        Object obj = this.n;
        switch (i) {
            case 0:
                DeviceAuthDialog.initializeContentView$lambda$2((DeviceAuthDialog) obj, view);
                break;
            case 1:
                FacebookButtonBase.setupOnClickListener$lambda$0((FacebookButtonBase) obj, view);
                break;
            case 2:
                MainActivity mainActivity = (MainActivity) obj;
                int i2 = MainActivity.w;
                if (!mainActivity.l()) {
                    Toast.makeText(mainActivity, mainActivity.getString(R.string.no_internet_message), 0).show();
                    break;
                } else {
                    mainActivity.recreate();
                    break;
                }
            case 3:
                ToolTipPopup.show$lambda$3((ToolTipPopup) obj, view);
                break;
            default:
                WebDialog.createCrossImage$lambda$5((WebDialog) obj, view);
                break;
        }
    }
}
