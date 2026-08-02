package com.google.mlkit.vision.codescanner.internal;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import defpackage.fsa;
import defpackage.ng;
import defpackage.om;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class GmsBarcodeScanningDelegateActivity extends ng {
    @Override // defpackage.ng, defpackage.cp, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent action = new Intent().setPackage("com.google.android.gms").setAction("com.google.android.gms.mlkit.ACTION_SCAN_BARCODE");
        ApplicationInfo applicationInfo = getApplicationInfo();
        int i = applicationInfo.labelRes;
        q(new om(), new fsa(this, 3)).b(action.putExtra("extra_calling_app_name", i != 0 ? getString(i) : getPackageManager().getApplicationLabel(applicationInfo).toString()).putExtra("extra_supported_formats", getIntent().getIntExtra("extra_supported_formats", 0)).putExtra("extra_allow_manual_input", getIntent().getBooleanExtra("extra_allow_manual_input", false)).putExtra("extra_enable_auto_zoom", getIntent().getBooleanExtra("extra_enable_auto_zoom", false)));
    }
}
