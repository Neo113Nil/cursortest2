package a3;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.WebSettings;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class j1 implements Callable<String> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f96a;

    j1(l1 l1Var, Context context) {
        this.f96a = context;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ String call() {
        SharedPreferences sharedPreferences = this.f96a.getSharedPreferences("admob_user_agent", 0);
        String string = sharedPreferences.getString("user_agent", "");
        if (!TextUtils.isEmpty(string)) {
            r1.k("User agent is already initialized on Google Play Services.");
            return string;
        }
        r1.k("User agent is not initialized on Google Play Services. Initializing.");
        String defaultUserAgent = WebSettings.getDefaultUserAgent(this.f96a);
        v3.n.a(this.f96a, sharedPreferences.edit().putString("user_agent", defaultUserAgent), "admob_user_agent");
        return defaultUserAgent;
    }
}
