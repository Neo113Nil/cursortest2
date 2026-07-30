package v0;

import android.net.Uri;

/* loaded from: classes.dex */
public final class E extends C0958b {
    @Override // v0.AbstractC0959c
    public final boolean b() {
        if (!super.b() || !u0.d.a("MULTI_PROCESS")) {
            return false;
        }
        Uri uri = u0.y.f8069a;
        if (F.f8141F.b()) {
            return H.f8177a.getStatics().isMultiProcessEnabled();
        }
        throw F.a();
    }
}
