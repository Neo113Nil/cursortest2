package c4;

import android.app.Application;
import android.content.SharedPreferences;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private final Application f2034a;

    /* renamed from: b, reason: collision with root package name */
    private final SharedPreferences f2035b;

    /* renamed from: c, reason: collision with root package name */
    private final Set<String> f2036c;

    m(Application application) {
        this.f2034a = application;
        SharedPreferences sharedPreferences = application.getSharedPreferences("__GOOGLE_FUNDING_CHOICE_SDK_INTERNAL__", 0);
        this.f2035b = sharedPreferences;
        this.f2036c = new HashSet(sharedPreferences.getStringSet("written_values", Collections.emptySet()));
    }

    public final int a() {
        return this.f2035b.getInt("consent_status", 0);
    }

    public final void b(int i7) {
        this.f2035b.edit().putInt("consent_status", i7).apply();
    }

    public final void c(Set<String> set) {
        this.f2035b.edit().putStringSet("stored_info", set).apply();
    }

    public final void d(int i7) {
        this.f2035b.edit().putInt("consent_type", i7).apply();
    }

    public final Set<String> e() {
        return this.f2035b.getStringSet("stored_info", Collections.emptySet());
    }

    public final Set<String> f() {
        return this.f2036c;
    }

    public final void g() {
        this.f2035b.edit().putStringSet("written_values", this.f2036c).apply();
    }

    public final void h() {
        f1.b(this.f2034a, this.f2036c);
        this.f2036c.clear();
        this.f2035b.edit().remove("stored_info").remove("consent_status").remove("consent_type").apply();
    }
}
