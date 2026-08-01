package s7;

import android.content.SharedPreferences;
import java.util.Objects;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f8575a;

    /* renamed from: b, reason: collision with root package name */
    public final long f8576b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8577c;

    /* renamed from: d, reason: collision with root package name */
    public long f8578d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f1 f8579e;

    public d1(f1 f1Var, String str, long j) {
        Objects.requireNonNull(f1Var);
        this.f8579e = f1Var;
        c7.c0.d(str);
        this.f8575a = str;
        this.f8576b = j;
    }

    public final long a() {
        if (!this.f8577c) {
            this.f8577c = true;
            this.f8578d = this.f8579e.w().getLong(this.f8575a, this.f8576b);
        }
        return this.f8578d;
    }

    public final void b(long j) {
        SharedPreferences.Editor edit = this.f8579e.w().edit();
        edit.putLong(this.f8575a, j);
        edit.apply();
        this.f8578d = j;
    }
}
