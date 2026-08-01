package s7;

import android.content.SharedPreferences;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f8550a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f8551b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8552c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f8553d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f1 f8554e;

    public c1(f1 f1Var, String str, boolean z10) {
        this.f8554e = f1Var;
        c7.c0.d(str);
        this.f8550a = str;
        this.f8551b = z10;
    }

    public final boolean a() {
        if (!this.f8552c) {
            this.f8552c = true;
            this.f8553d = this.f8554e.w().getBoolean(this.f8550a, this.f8551b);
        }
        return this.f8553d;
    }

    public final void b(boolean z10) {
        SharedPreferences.Editor edit = this.f8554e.w().edit();
        edit.putBoolean(this.f8550a, z10);
        edit.apply();
        this.f8553d = z10;
    }
}
