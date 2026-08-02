package com.stripe.android.financialconnections.lite;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class FinancialConnectionsSheetLiteRedirectActivity extends ComponentActivity {
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Intent flags;
        super.onCreate(bundle);
        Uri data = getIntent().getData();
        if (data != null) {
            Class cls = !Intrinsics.areEqual(data.getScheme(), "stripe") ? null : FinancialConnectionsSheetLiteActivity.class;
            Intent intent = cls != null ? new Intent(this, cls) : null;
            if (intent == null || (flags = intent.setFlags(603979776)) == null) {
                return;
            }
            flags.setData(data);
            startActivity(flags);
        }
    }
}
