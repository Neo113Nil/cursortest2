package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.File;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ri implements pk0 {
    public final /* synthetic */ int a;

    public /* synthetic */ ri(int i) {
        this.a = i;
    }

    @Override // defpackage.pk0
    public final qk0 a(Object obj, uw1 uw1Var) {
        switch (this.a) {
            case 0:
                Uri uri = (Uri) obj;
                if (l.c(uri)) {
                    return new si(uri, uw1Var, 0);
                }
                return null;
            case 1:
                return new jo((Bitmap) obj, uw1Var, 0);
            case 2:
                return new jo((ByteBuffer) obj, uw1Var, 1);
            case 3:
                Uri uri2 = (Uri) obj;
                if (Intrinsics.b(uri2.getScheme(), FirebaseAnalytics.Param.CONTENT)) {
                    return new u20(uri2, uw1Var);
                }
                return null;
            case 4:
                return new jo((Drawable) obj, uw1Var, 2);
            case 5:
                return new uk0((File) obj);
            default:
                Uri uri3 = (Uri) obj;
                if (Intrinsics.b(uri3.getScheme(), "android.resource")) {
                    return new si(uri3, uw1Var, 1);
                }
                return null;
        }
    }
}
