package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import com.facebook.share.internal.ShareInternalUtility;
import com.google.firebase.encoders.json.BuildConfig;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class xq {
    public final /* synthetic */ int a;

    public /* synthetic */ xq(int i) {
        this.a = i;
    }

    public final Object a(Object obj, uw1 uw1Var) {
        String authority;
        int i = this.a;
        String str = BuildConfig.FLAVOR;
        switch (i) {
            case 0:
                return ByteBuffer.wrap((byte[]) obj);
            case 1:
                Uri uri = (Uri) obj;
                if (l.c(uri)) {
                    return null;
                }
                String scheme = uri.getScheme();
                if (scheme != null && !scheme.equals(ShareInternalUtility.STAGING_PARAM)) {
                    return null;
                }
                String path = uri.getPath();
                if (path != null) {
                    str = path;
                }
                if (str.length() <= 0 || !a.a(str.charAt(0), '/', false) || ((String) zv.v(uri.getPathSegments())) == null) {
                    return null;
                }
                if (!Intrinsics.b(uri.getScheme(), ShareInternalUtility.STAGING_PARAM)) {
                    return new File(uri.toString());
                }
                String path2 = uri.getPath();
                if (path2 != null) {
                    return new File(path2);
                }
                return null;
            case 2:
                return ((kz0) obj).h;
            case 3:
                int intValue = ((Number) obj).intValue();
                Context context = uw1Var.a;
                try {
                    if (context.getResources().getResourceEntryName(intValue) == null) {
                        return null;
                    }
                    return Uri.parse("android.resource://" + context.getPackageName() + '/' + intValue);
                } catch (Resources.NotFoundException unused) {
                    return null;
                }
            case 4:
                Uri uri2 = (Uri) obj;
                if (!Intrinsics.b(uri2.getScheme(), "android.resource") || (authority = uri2.getAuthority()) == null || up2.y(authority) || uri2.getPathSegments().size() != 2) {
                    return null;
                }
                String authority2 = uri2.getAuthority();
                if (authority2 != null) {
                    str = authority2;
                }
                Resources resourcesForApplication = uw1Var.a.getPackageManager().getResourcesForApplication(str);
                List<String> pathSegments = uri2.getPathSegments();
                int identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), str);
                if (identifier == 0) {
                    b71.u(uri2, "Invalid android.resource URI: ");
                    return null;
                }
                return Uri.parse("android.resource://" + str + '/' + identifier);
            default:
                return Uri.parse((String) obj);
        }
    }
}
