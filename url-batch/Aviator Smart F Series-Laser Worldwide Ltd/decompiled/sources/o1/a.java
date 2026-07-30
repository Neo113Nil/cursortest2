package o1;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.crrepa.band.my.device.pushmessage.notification.notification.e;
import com.google.android.exoplayer2.C;

/* loaded from: classes2.dex */
public class a implements n1.c {
    private final Class<?> mActivity;
    private final Bundle mBundle;
    private final int mIdentifier;

    public a(Class<?> cls, Bundle bundle, int i8) {
        this.mActivity = cls;
        this.mBundle = bundle;
        this.mIdentifier = i8;
    }

    @Override // n1.c
    public PendingIntent onSettingPendingIntent() {
        Intent intent = new Intent(e.mSingleton.mContext, this.mActivity);
        intent.setAction("br.com.goncalves.pugnotification.action.click.intent");
        intent.addFlags(536870912);
        intent.setPackage(e.mSingleton.mContext.getPackageName());
        Bundle bundle = this.mBundle;
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        return Build.VERSION.SDK_INT < 31 ? PendingIntent.getActivity(e.mSingleton.mContext, this.mIdentifier, intent, C.BUFFER_FLAG_FIRST_SAMPLE) : PendingIntent.getActivity(e.mSingleton.mContext, this.mIdentifier, intent, AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
    }
}
