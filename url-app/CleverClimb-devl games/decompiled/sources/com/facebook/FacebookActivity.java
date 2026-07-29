package com.facebook;

import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.util.Log;
import com.facebook.internal.FacebookDialogFragment;
import com.facebook.internal.ab;
import com.facebook.login.LoginFragment;
import com.facebook.share.internal.DeviceShareDialogFragment;
import com.facebook.share.model.ShareContent;

/* loaded from: classes.dex */
public class FacebookActivity extends FragmentActivity {

    /* renamed from: a, reason: collision with root package name */
    public static String f4688a = "PassThrough";

    /* renamed from: b, reason: collision with root package name */
    private static String f4689b = "SingleFragment";

    /* renamed from: c, reason: collision with root package name */
    private static final String f4690c = "com.facebook.FacebookActivity";

    /* renamed from: d, reason: collision with root package name */
    private Fragment f4691d;

    private static final String b() {
        return "fb" + l.i() + "://authorize";
    }

    @Override // android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!l.a()) {
            Log.d(f4690c, "Facebook SDK not initialized. Make sure you call sdkInitialize inside your Application's onCreate method.");
            l.a(getApplicationContext());
        }
        setContentView(R.layout.com_facebook_activity_layout);
        Intent intent = getIntent();
        if (f4688a.equals(intent.getAction())) {
            c();
            return;
        }
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag(f4689b);
        Fragment fragment = findFragmentByTag;
        if (findFragmentByTag == null) {
            if ("FacebookDialogFragment".equals(intent.getAction())) {
                FacebookDialogFragment facebookDialogFragment = new FacebookDialogFragment();
                facebookDialogFragment.setRetainInstance(true);
                facebookDialogFragment.show(supportFragmentManager, f4689b);
                fragment = facebookDialogFragment;
            } else if ("DeviceShareDialogFragment".equals(intent.getAction())) {
                DeviceShareDialogFragment deviceShareDialogFragment = new DeviceShareDialogFragment();
                deviceShareDialogFragment.setRetainInstance(true);
                deviceShareDialogFragment.a((ShareContent) intent.getParcelableExtra("content"));
                deviceShareDialogFragment.show(supportFragmentManager, f4689b);
                fragment = deviceShareDialogFragment;
            } else {
                LoginFragment loginFragment = new LoginFragment();
                loginFragment.setRetainInstance(true);
                supportFragmentManager.beginTransaction().add(R.id.com_facebook_fragment_container, loginFragment, f4689b).commit();
                fragment = loginFragment;
            }
        }
        this.f4691d = fragment;
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f4691d != null) {
            this.f4691d.onConfigurationChanged(configuration);
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        a(intent.getStringExtra("url"));
    }

    public Fragment a() {
        return this.f4691d;
    }

    private void c() {
        a(null, com.facebook.internal.w.a(com.facebook.internal.w.d(getIntent())));
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(String str) {
        int parseInt;
        if (str == null || !str.startsWith(b())) {
            return;
        }
        Uri parse = Uri.parse(str);
        Bundle c2 = ab.c(parse.getQuery());
        c2.putAll(ab.c(parse.getFragment()));
        if (!(this.f4691d instanceof LoginFragment) || !((LoginFragment) this.f4691d).a(c2)) {
            a(null, new j("Invalid state parameter"));
        }
        String string = c2.getString("error");
        if (string == null) {
            string = c2.getString("error_type");
        }
        String string2 = c2.getString("error_msg");
        if (string2 == null) {
            string2 = c2.getString("error_message");
        }
        if (string2 == null) {
            string2 = c2.getString("error_description");
        }
        String string3 = c2.getString("error_code");
        if (!ab.a(string3)) {
            try {
                parseInt = Integer.parseInt(string3);
            } catch (NumberFormatException unused) {
            }
            if (!ab.a(string) && ab.a(string2) && parseInt == -1) {
                a(c2, null);
                return;
            }
            if (string == null && (string.equals("access_denied") || string.equals("OAuthAccessDeniedException"))) {
                a(null, new k());
                return;
            } else if (parseInt != 4201) {
                a(null, new k());
                return;
            } else {
                a(null, new n(new FacebookRequestError(parseInt, string, string2), string2));
                return;
            }
        }
        parseInt = -1;
        if (!ab.a(string)) {
        }
        if (string == null) {
        }
        if (parseInt != 4201) {
        }
    }

    public void a(Bundle bundle, j jVar) {
        int i;
        Intent intent = getIntent();
        if (jVar == null) {
            i = -1;
            com.facebook.login.f.a(intent, bundle);
        } else {
            intent = com.facebook.internal.w.a(intent, bundle, jVar);
            i = 0;
        }
        setResult(i, intent);
        finish();
    }
}
