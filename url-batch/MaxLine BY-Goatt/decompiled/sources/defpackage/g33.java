package defpackage;

import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class g33 implements i81 {
    @Override // defpackage.i81
    public final String a(Object obj, uw1 uw1Var) {
        Uri uri = (Uri) obj;
        if (!Intrinsics.b(uri.getScheme(), "android.resource")) {
            return uri.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(uri);
        sb.append('-');
        Configuration configuration = uw1Var.a.getResources().getConfiguration();
        Bitmap.Config[] configArr = l.a;
        sb.append(configuration.uiMode & 48);
        return sb.toString();
    }
}
