package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import defpackage.dg3;
import defpackage.ef3;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class GoogleAnalyticsServerPreviewActivity extends Activity {
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        dg3 e = dg3.e(this, null);
        Intent intent = getIntent();
        e.getClass();
        e.c(new ef3(e, intent, 3));
        finish();
    }
}
