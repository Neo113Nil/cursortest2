package defpackage;

import android.content.SharedPreferences;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ii3 {
    public final String a;
    public final boolean b;
    public boolean c;
    public boolean d;
    public final /* synthetic */ qi3 e;

    public ii3(qi3 qi3Var, String str, boolean z) {
        this.e = qi3Var;
        ll3.s(str);
        this.a = str;
        this.b = z;
    }

    public final boolean a() {
        if (!this.c) {
            this.c = true;
            this.d = this.e.A().getBoolean(this.a, this.b);
        }
        return this.d;
    }

    public final void b(boolean z) {
        SharedPreferences.Editor edit = this.e.A().edit();
        edit.putBoolean(this.a, z);
        edit.apply();
        this.d = z;
    }
}
