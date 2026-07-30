package defpackage;

import android.graphics.PathMeasure;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class pa {
    public final PathMeasure a;

    public pa(PathMeasure pathMeasure) {
        this.a = pathMeasure;
    }

    public final void a(float f, float f2, oa oaVar) {
        if (oaVar == null) {
            ch2.h("Unable to obtain android.graphics.Path");
        } else {
            this.a.getSegment(f, f2, oaVar.a, true);
        }
    }
}
