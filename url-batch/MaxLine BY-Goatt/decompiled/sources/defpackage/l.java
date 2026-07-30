package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.webkit.MimeTypeMap;
import com.facebook.share.internal.ShareInternalUtility;
import com.google.firebase.encoders.json.BuildConfig;
import java.io.Closeable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class l {
    public static final Bitmap.Config[] a;
    public static final Bitmap.Config b;
    public static final mx0 c;

    static {
        Bitmap.Config[] configArr;
        Bitmap.Config config;
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            config = Bitmap.Config.RGBA_F16;
            configArr = new Bitmap.Config[]{Bitmap.Config.ARGB_8888, config};
        } else {
            configArr = new Bitmap.Config[]{Bitmap.Config.ARGB_8888};
        }
        a = configArr;
        b = i >= 26 ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
        c = new mx0((String[]) new ArrayList(20).toArray(new String[0]));
    }

    public static final void a(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public static final String b(MimeTypeMap mimeTypeMap, String str) {
        if (str == null || up2.y(str)) {
            return null;
        }
        String J = up2.J(up2.J(str, '#'), '?');
        return mimeTypeMap.getMimeTypeFromExtension(up2.I(up2.I(J, '/', J), '.', BuildConfig.FLAVOR));
    }

    public static final boolean c(Uri uri) {
        return Intrinsics.b(uri.getScheme(), ShareInternalUtility.STAGING_PARAM) && Intrinsics.b((String) zv.v(uri.getPathSegments()), "android_asset");
    }

    public static final int d(zm3 zm3Var, me2 me2Var) {
        if (zm3Var instanceof gb0) {
            return ((gb0) zm3Var).o;
        }
        int ordinal = me2Var.ordinal();
        if (ordinal == 0) {
            return Integer.MIN_VALUE;
        }
        if (ordinal == 1) {
            return Integer.MAX_VALUE;
        }
        a.b();
        return 0;
    }
}
