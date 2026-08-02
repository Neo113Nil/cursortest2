package com.stripe.android.financialconnections;

import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.fillr.core.utilities.AppPreferenceStore;
import com.stripe.android.financialconnections.di.FinancialConnectionsSingletonSharedModule;
import com.stripe.android.financialconnections.domain.IntegrityVerdictManager;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes8.dex */
public final class FinancialConnectionsSheetRedirectActivity extends AppCompatActivity {
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d2, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r6.getHost(), "native-redirect") != false) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00d6  */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        Class cls;
        Intent intent;
        Intent flags;
        super.onCreate(bundle);
        Uri data = getIntent().getData();
        if (data != null) {
            Application application = getApplication();
            application.getClass();
            Boolean overriddenNative$financial_connections_release = new AppPreferenceStore(application).getOverriddenNative$financial_connections_release();
            if (Intrinsics.areEqual(overriddenNative$financial_connections_release, Boolean.TRUE)) {
                String uri = data.toString();
                uri.getClass();
                data = Uri.parse(StringsKt__StringsJVMKt.replace$default(uri, "link-accounts", "link-native-accounts"));
                data.getClass();
            } else if (Intrinsics.areEqual(overriddenNative$financial_connections_release, Boolean.FALSE)) {
                String uri2 = data.toString();
                uri2.getClass();
                data = Uri.parse(StringsKt__StringsJVMKt.replace$default(uri2, "link-native-accounts", "link-accounts"));
                data.getClass();
            } else if (overriddenNative$financial_connections_release != null) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            Application application2 = getApplication();
            application2.getClass();
            if (((IntegrityVerdictManager) FinancialConnectionsSingletonSharedModule.INSTANCE.getComponent(application2).sdkFilesManagerProvider.get()).verdictFailed) {
                String uri3 = data.toString();
                uri3.getClass();
                data = Uri.parse(StringsKt__StringsJVMKt.replace$default(uri3, "link-native-accounts", "link-accounts"));
                data.getClass();
            }
            if (Intrinsics.areEqual(data.getScheme(), "stripe-auth") || Intrinsics.areEqual(data.getScheme(), "stripe")) {
                cls = FinancialConnectionsSheetNativeActivity.class;
                if (!Intrinsics.areEqual(data.getHost(), "auth-redirect") && !Intrinsics.areEqual(data.getHost(), "link-native-accounts")) {
                    cls = FinancialConnectionsSheetActivity.class;
                    if (!Intrinsics.areEqual(data.getHost(), "link-accounts")) {
                    }
                }
                intent = cls != null ? new Intent(this, (Class<?>) cls) : null;
                if (intent != null && (flags = intent.setFlags(603979776)) != null) {
                    flags.setData(data);
                    startActivity(flags);
                }
            }
            cls = null;
            if (cls != null) {
            }
            if (intent != null) {
                flags.setData(data);
                startActivity(flags);
            }
        }
        finish();
    }
}
