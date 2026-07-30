package defpackage;

import com.google.firebase.encoders.json.BuildConfig;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class v90 implements pf0 {
    @Override // defpackage.pf0
    public final void a(qf0 qf0Var) {
        qf0Var.d(BuildConfig.FLAVOR, 0, qf0Var.a.c());
    }

    public final boolean equals(Object obj) {
        return obj instanceof v90;
    }

    public final int hashCode() {
        return d82.a(v90.class).hashCode();
    }

    public final String toString() {
        return "DeleteAllCommand()";
    }
}
