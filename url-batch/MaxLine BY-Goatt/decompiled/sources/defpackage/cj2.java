package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class cj2 implements Iterable, k71 {
    public final /* synthetic */ aa0 m;

    public cj2(aa0 aa0Var) {
        this.m = aa0Var;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new z90(this.m);
    }
}
