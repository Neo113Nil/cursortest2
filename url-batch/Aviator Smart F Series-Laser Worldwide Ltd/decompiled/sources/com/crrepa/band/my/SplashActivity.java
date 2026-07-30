package com.crrepa.band.my;

import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.home.PrivacyPolicyActivity;
import com.crrepa.band.my.model.band.provider.BandUnitSystemProvider;
import com.crrepa.band.my.model.storage.BaseParamNames;
import com.moyoung.dafit.module.common.network.provider.g;
import com.moyoung.dafit.module.common.utils.k0;
import com.moyoung.dafit.module.common.utils.u;

/* loaded from: classes2.dex */
public class SplashActivity extends AppCompatActivity {
    public static final int DEFAULT_UNIT_SYSTEM = -1;
    private static final int DELAY_SHOW_TIME = 1;

    private void setDefaultUnitSystem(boolean z7) {
        int i8 = 0;
        if (z7) {
            if (u.isUS()) {
                i8 = 1;
            }
        } else if (!u.isZH()) {
            i8 = -1;
        }
        if (i8 != -1) {
            BandUnitSystemProvider.saveUnitSystem(i8);
        }
    }

    private void startNotificationCollectorMonitor() {
        new com.crrepa.band.my.device.pushmessage.notify.d().startMonitor(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if ((getIntent().getFlags() & 4194304) != 0) {
            finish();
            return;
        }
        setContentView(R.layout.activity_splash);
        k0.setTranslucent(this, 0);
        k0.setDarkMode(this);
        startNotificationCollectorMonitor();
        startApp();
    }

    public void startApp() {
        boolean z7 = g.getInstance().getBoolean(BaseParamNames.FIRST_OPEN_APP, true);
        Intent intent = z7 ? new Intent(this, (Class<?>) PrivacyPolicyActivity.class) : MainActivity.getCallingIntent(this);
        setDefaultUnitSystem(z7);
        startActivity(intent);
        finish();
    }
}
