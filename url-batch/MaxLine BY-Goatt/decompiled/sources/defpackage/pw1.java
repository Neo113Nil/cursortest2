package defpackage;

import com.google.firebase.encoders.json.BuildConfig;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class pw1 {
    public final int a;
    public final int b;

    public /* synthetic */ pw1(int i, int i2, int i3) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }

    public abstract void a(gn gnVar, rh rhVar, zl2 zl2Var, q82 q82Var, qw1 qw1Var);

    public m6 b(gn gnVar) {
        return null;
    }

    public final String toString() {
        String c = d82.a(getClass()).c();
        return c == null ? BuildConfig.FLAVOR : c;
    }

    public pw1(int i, int i2) {
        this.a = i;
        this.b = i2;
    }
}
