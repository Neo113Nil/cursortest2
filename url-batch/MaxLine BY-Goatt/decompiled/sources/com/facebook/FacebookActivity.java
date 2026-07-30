package com.facebook;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import com.facebook.internal.FacebookDialogFragment;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.facebook.internal.logging.dumpsys.EndToEndDumper;
import com.facebook.login.LoginFragment;
import defpackage.as0;
import defpackage.fr0;
import defpackage.kr0;
import defpackage.wm;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class FacebookActivity extends kr0 {
    private static final String FRAGMENT_TAG = "SingleFragment";
    public static final String PASS_THROUGH_CANCEL_ACTION = "PassThrough";
    private fr0 currentFragment;
    public static final Companion Companion = new Companion(null);
    private static final String TAG = FacebookActivity.class.getName();

    private final void handlePassThroughError() {
        Intent intent = getIntent();
        intent.getClass();
        FacebookException exceptionFromErrorData = NativeProtocol.getExceptionFromErrorData(NativeProtocol.getMethodArgumentsFromIntent(intent));
        Intent intent2 = getIntent();
        intent2.getClass();
        setResult(0, NativeProtocol.createProtocolResultIntent(intent2, null, exceptionFromErrorData));
        finish();
    }

    @Override // defpackage.kr0, android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            str.getClass();
            printWriter.getClass();
            EndToEndDumper companion = EndToEndDumper.Companion.getInstance();
            if (companion == null || !companion.maybeDump(str, printWriter, strArr)) {
                super.dump(str, fileDescriptor, printWriter, strArr);
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final fr0 getCurrentFragment() {
        return this.currentFragment;
    }

    public fr0 getFragment() {
        Intent intent = getIntent();
        as0 supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        fr0 B = supportFragmentManager.B(FRAGMENT_TAG);
        if (B != null) {
            return B;
        }
        if (FacebookDialogFragment.TAG.equals(intent.getAction())) {
            FacebookDialogFragment facebookDialogFragment = new FacebookDialogFragment();
            facebookDialogFragment.setRetainInstance(true);
            facebookDialogFragment.show(supportFragmentManager, FRAGMENT_TAG);
            return facebookDialogFragment;
        }
        LoginFragment loginFragment = new LoginFragment();
        loginFragment.setRetainInstance(true);
        wm wmVar = new wm(supportFragmentManager);
        wmVar.c(com.facebook.common.R.id.com_facebook_fragment_container, loginFragment, FRAGMENT_TAG);
        wmVar.e(false);
        return loginFragment;
    }

    @Override // defpackage.xx, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        fr0 fr0Var = this.currentFragment;
        if (fr0Var != null) {
            fr0Var.onConfigurationChanged(configuration);
        }
    }

    @Override // defpackage.kr0, defpackage.xx, defpackage.wx, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (!FacebookSdk.isInitialized()) {
            Utility.logd(TAG, "Facebook SDK not initialized. Make sure you call sdkInitialize inside your Application's onCreate method.");
            Context applicationContext = getApplicationContext();
            applicationContext.getClass();
            FacebookSdk.sdkInitialize(applicationContext);
        }
        setContentView(com.facebook.common.R.layout.com_facebook_activity_layout);
        if (PASS_THROUGH_CANCEL_ACTION.equals(intent.getAction())) {
            handlePassThroughError();
        } else {
            this.currentFragment = getFragment();
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
