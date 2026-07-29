package com.cmplay.gppay;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;

/* loaded from: classes.dex */
public class UnityPayActivity extends Activity {
    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        if (b.a().a(i, i2, intent)) {
            super.onActivityResult(i, i2, intent);
        }
        finish();
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        b.a().f4109c = this;
        String string = getIntent().getExtras().getString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
        b.a().a(this, getIntent().getExtras().getString("platformType"), getIntent().getExtras().getString("userId"), string);
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
    }
}
