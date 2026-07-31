package a3;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.WebSettings;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class k1 implements Callable<String> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f98a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f99b;

    k1(l1 l1Var, Context context, Context context2) {
        this.f98a = context;
        this.f99b = context2;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ String call() {
        SharedPreferences sharedPreferences;
        boolean z6 = false;
        if (this.f98a != null) {
            r1.k("Attempting to read user agent from Google Play Services.");
            sharedPreferences = this.f98a.getSharedPreferences("admob_user_agent", 0);
        } else {
            r1.k("Attempting to read user agent from local cache.");
            sharedPreferences = this.f99b.getSharedPreferences("admob_user_agent", 0);
            z6 = true;
        }
        String string = sharedPreferences.getString("user_agent", "");
        if (TextUtils.isEmpty(string)) {
            r1.k("Reading user agent from WebSettings");
            string = WebSettings.getDefaultUserAgent(this.f99b);
            if (z6) {
                sharedPreferences.edit().putString("user_agent", string).apply();
                r1.k("Persisting user agent.");
            }
        }
        return string;
    }
}
