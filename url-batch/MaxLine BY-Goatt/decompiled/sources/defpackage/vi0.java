package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class vi0 implements ek0 {
    public final /* synthetic */ int m;
    public final w52 n;

    public /* synthetic */ vi0(w52 w52Var, int i) {
        this.m = i;
        this.n = w52Var;
    }

    @Override // defpackage.w52
    public final Object get() {
        int i = this.m;
        w52 w52Var = this.n;
        switch (i) {
            case 0:
                String packageName = ((Context) w52Var.get()).getPackageName();
                if (packageName != null) {
                    return packageName;
                }
                ch2.l("Cannot return null from a non-@Nullable @Provides method");
                return null;
            default:
                return new ue2((Context) w52Var.get(), "com.google.android.datatransport.events", Integer.valueOf(ue2.p).intValue());
        }
    }
}
