package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class ca2 {
    public static final ba2 a(Throwable th) {
        th.getClass();
        return new ba2(th);
    }

    public static final void b(Object obj) {
        if (obj instanceof ba2) {
            throw ((ba2) obj).m;
        }
    }
}
