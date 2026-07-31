package f4;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import d4.g0;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final g0 f16201a;

    public a(g0 g0Var) {
        this.f16201a = g0Var;
    }

    @RecentlyNonNull
    public static a k(@RecentlyNonNull Context context, @RecentlyNonNull String str, @RecentlyNonNull String str2, String str3, @RecentlyNonNull Bundle bundle) {
        return g0.s(context, str, str2, str3, bundle).t();
    }

    public void a(@RecentlyNonNull String str) {
        this.f16201a.C(str);
    }

    public void b(@RecentlyNonNull String str, String str2, Bundle bundle) {
        this.f16201a.y(str, str2, bundle);
    }

    public void c(@RecentlyNonNull String str) {
        this.f16201a.D(str);
    }

    public long d() {
        return this.f16201a.G();
    }

    @RecentlyNullable
    public String e() {
        return this.f16201a.f();
    }

    @RecentlyNullable
    public String f() {
        return this.f16201a.F();
    }

    @RecentlyNonNull
    public List<Bundle> g(String str, String str2) {
        return this.f16201a.z(str, str2);
    }

    @RecentlyNullable
    public String h() {
        return this.f16201a.a();
    }

    @RecentlyNullable
    public String i() {
        return this.f16201a.H();
    }

    @RecentlyNullable
    public String j() {
        return this.f16201a.E();
    }

    public int l(@RecentlyNonNull String str) {
        return this.f16201a.e(str);
    }

    @RecentlyNonNull
    public Map<String, Object> m(String str, String str2, boolean z6) {
        return this.f16201a.b(str, str2, z6);
    }

    public void n(@RecentlyNonNull String str, @RecentlyNonNull String str2, @RecentlyNonNull Bundle bundle) {
        this.f16201a.v(str, str2, bundle);
    }

    @RecentlyNullable
    public void o(@RecentlyNonNull Bundle bundle) {
        this.f16201a.d(bundle, false);
    }

    @RecentlyNullable
    public Bundle p(@RecentlyNonNull Bundle bundle) {
        return this.f16201a.d(bundle, true);
    }

    public void q(@RecentlyNonNull Bundle bundle) {
        this.f16201a.x(bundle);
    }

    public void r(@RecentlyNonNull Bundle bundle) {
        this.f16201a.B(bundle);
    }

    public void s(@RecentlyNonNull Activity activity, String str, String str2) {
        this.f16201a.A(activity, str, str2);
    }

    public void t(@RecentlyNonNull String str, @RecentlyNonNull String str2, @RecentlyNonNull Object obj) {
        this.f16201a.w(str, str2, obj, true);
    }
}
