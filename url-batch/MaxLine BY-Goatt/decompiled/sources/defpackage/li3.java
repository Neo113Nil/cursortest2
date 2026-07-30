package defpackage;

import android.content.SharedPreferences;
import java.util.Objects;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class li3 {
    public final String a;
    public final long b;
    public boolean c;
    public long d;
    public final /* synthetic */ qi3 e;

    public li3(qi3 qi3Var, String str, long j) {
        Objects.requireNonNull(qi3Var);
        this.e = qi3Var;
        ll3.s(str);
        this.a = str;
        this.b = j;
    }

    public final long a() {
        if (!this.c) {
            this.c = true;
            this.d = this.e.A().getLong(this.a, this.b);
        }
        return this.d;
    }

    public final void b(long j) {
        SharedPreferences.Editor edit = this.e.A().edit();
        edit.putLong(this.a, j);
        edit.apply();
        this.d = j;
    }
}
