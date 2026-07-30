package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class sr implements Serializable {
    public static final sr m = new sr();

    private Object readResolve() {
        return m;
    }
}
