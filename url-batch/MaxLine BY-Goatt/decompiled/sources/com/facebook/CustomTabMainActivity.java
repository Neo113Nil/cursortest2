package com.facebook;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.internal.CustomTab;
import com.facebook.internal.InstagramCustomTab;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.Utility;
import com.facebook.login.LoginTargetApp;
import defpackage.kf1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class CustomTabMainActivity extends Activity {
    private BroadcastReceiver redirectReceiver;
    private boolean shouldCloseCustomTab = true;
    public static final Companion Companion = new Companion(null);
    public static final String EXTRA_ACTION = "CustomTabMainActivity.extra_action";
    public static final String EXTRA_PARAMS = "CustomTabMainActivity.extra_params";
    public static final String EXTRA_CHROME_PACKAGE = "CustomTabMainActivity.extra_chromePackage";
    public static final String EXTRA_URL = "CustomTabMainActivity.extra_url";
    public static final String EXTRA_TARGET_APP = "CustomTabMainActivity.extra_targetApp";
    public static final String REFRESH_ACTION = "CustomTabMainActivity.action_refresh";
    public static final String NO_ACTIVITY_EXCEPTION = "CustomTabMainActivity.no_activity_exception";

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoginTargetApp.values().length];
            try {
                iArr[LoginTargetApp.INSTAGRAM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final void sendResult(int i, Intent intent) {
        BroadcastReceiver broadcastReceiver = this.redirectReceiver;
        if (broadcastReceiver != null) {
            kf1.a(this).d(broadcastReceiver);
        }
        if (intent != null) {
            String stringExtra = intent.getStringExtra(EXTRA_URL);
            Bundle parseResponseUri = stringExtra != null ? Companion.parseResponseUri(stringExtra) : new Bundle();
            Intent intent2 = getIntent();
            intent2.getClass();
            Intent createProtocolResultIntent = NativeProtocol.createProtocolResultIntent(intent2, parseResponseUri, null);
            if (createProtocolResultIntent != null) {
                intent = createProtocolResultIntent;
            }
            setResult(i, intent);
        } else {
            Intent intent3 = getIntent();
            intent3.getClass();
            setResult(i, NativeProtocol.createProtocolResultIntent(intent3, null, null));
        }
        finish();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        String stringExtra;
        super.onCreate(bundle);
        String str = CustomTabActivity.CUSTOM_TAB_REDIRECT_ACTION;
        if (Intrinsics.b(str, getIntent().getAction())) {
            setResult(0);
            finish();
            return;
        }
        if (bundle != null || (stringExtra = getIntent().getStringExtra(EXTRA_ACTION)) == null) {
            return;
        }
        Bundle bundleExtra = getIntent().getBundleExtra(EXTRA_PARAMS);
        boolean openCustomTab = (WhenMappings.$EnumSwitchMapping$0[LoginTargetApp.Companion.fromString(getIntent().getStringExtra(EXTRA_TARGET_APP)).ordinal()] == 1 ? new InstagramCustomTab(stringExtra, bundleExtra) : new CustomTab(stringExtra, bundleExtra)).openCustomTab(this, getIntent().getStringExtra(EXTRA_CHROME_PACKAGE));
        this.shouldCloseCustomTab = false;
        if (!openCustomTab) {
            setResult(0, getIntent().putExtra(NO_ACTIVITY_EXCEPTION, true));
            finish();
        } else {
            BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.facebook.CustomTabMainActivity$onCreate$redirectReceiver$1
                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    context.getClass();
                    intent.getClass();
                    Intent intent2 = new Intent(CustomTabMainActivity.this, (Class<?>) CustomTabMainActivity.class);
                    intent2.setAction(CustomTabMainActivity.REFRESH_ACTION);
                    String str2 = CustomTabMainActivity.EXTRA_URL;
                    intent2.putExtra(str2, intent.getStringExtra(str2));
                    intent2.addFlags(603979776);
                    CustomTabMainActivity.this.startActivity(intent2);
                }
            };
            this.redirectReceiver = broadcastReceiver;
            kf1.a(this).b(broadcastReceiver, new IntentFilter(str));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        if (Intrinsics.b(REFRESH_ACTION, intent.getAction())) {
            kf1.a(this).c(new Intent(CustomTabActivity.DESTROY_ACTION));
            sendResult(-1, intent);
        } else if (Intrinsics.b(CustomTabActivity.CUSTOM_TAB_REDIRECT_ACTION, intent.getAction())) {
            sendResult(-1, intent);
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.shouldCloseCustomTab) {
            sendResult(0, null);
        }
        this.shouldCloseCustomTab = true;
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Bundle parseResponseUri(String str) {
            Uri parse = Uri.parse(str);
            Bundle parseUrlQueryString = Utility.parseUrlQueryString(parse.getQuery());
            parseUrlQueryString.putAll(Utility.parseUrlQueryString(parse.getFragment()));
            return parseUrlQueryString;
        }

        private Companion() {
        }
    }
}
