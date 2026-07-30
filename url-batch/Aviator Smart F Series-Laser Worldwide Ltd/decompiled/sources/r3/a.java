package r3;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.model.band.BaseBandModel;
import com.moyoung.dafit.module.common.utils.b;

/* loaded from: classes2.dex */
public class a {
    private static final String MAILTO = "mailto:";

    private a() {
    }

    private static String getPhoneModel() {
        return b.getManufacturer() + "-" + b.getSystemModel() + "-" + b.getSystemVersion();
    }

    public static Intent sendFeedback(Context context, String str) {
        String str2;
        Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("mailto:" + str));
        String string = context.getString(R.string.feedback_email_content);
        String string2 = context.getString(R.string.unknown);
        String phoneModel = getPhoneModel();
        BaseBandModel connectBand = com.crrepa.band.my.ble.band.utils.a.getInstance().getConnectBand();
        if (connectBand != null) {
            String bandName = connectBand.getBandName();
            str2 = connectBand.getFirmwareVersion();
            if (TextUtils.isEmpty(str2)) {
                str2 = string2;
            }
            string2 = bandName;
        } else {
            str2 = string2;
        }
        intent.putExtra("android.intent.extra.TEXT", String.format(string, phoneModel, string2, str2));
        return Intent.createChooser(intent, "");
    }
}
