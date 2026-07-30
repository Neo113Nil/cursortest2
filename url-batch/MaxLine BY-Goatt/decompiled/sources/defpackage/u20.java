package defpackage;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.facebook.share.internal.ShareConstants;
import java.io.InputStream;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class u20 implements qk0 {
    public final Uri a;
    public final uw1 b;

    public u20(Uri uri, uw1 uw1Var) {
        this.a = uri;
        this.b = uw1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b5  */
    @Override // defpackage.qk0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(o30 o30Var) {
        InputStream openInputStream;
        List<String> pathSegments;
        int size;
        Bundle bundle;
        uw1 uw1Var = this.b;
        ContentResolver contentResolver = uw1Var.a.getContentResolver();
        Uri uri = this.a;
        if (Intrinsics.b(uri.getAuthority(), "com.android.contacts") && Intrinsics.b(uri.getLastPathSegment(), "display_photo")) {
            AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
            openInputStream = openAssetFileDescriptor != null ? openAssetFileDescriptor.createInputStream() : null;
            if (openInputStream == null) {
                ey.f(uri, "'.", "Unable to find a contact photo associated with '");
                return null;
            }
        } else if (Build.VERSION.SDK_INT >= 29 && Intrinsics.b(uri.getAuthority(), ShareConstants.WEB_DIALOG_PARAM_MEDIA) && (size = (pathSegments = uri.getPathSegments()).size()) >= 3 && Intrinsics.b(pathSegments.get(size - 3), "audio") && Intrinsics.b(pathSegments.get(size - 2), "albums")) {
            pl2 pl2Var = uw1Var.d;
            zm3 zm3Var = pl2Var.a;
            gb0 gb0Var = zm3Var instanceof gb0 ? (gb0) zm3Var : null;
            if (gb0Var != null) {
                int i = gb0Var.o;
                zm3 zm3Var2 = pl2Var.b;
                gb0 gb0Var2 = zm3Var2 instanceof gb0 ? (gb0) zm3Var2 : null;
                if (gb0Var2 != null) {
                    int i2 = gb0Var2.o;
                    bundle = new Bundle(1);
                    bundle.putParcelable("android.content.extra.SIZE", new Point(i, i2));
                    AssetFileDescriptor openTypedAssetFile = contentResolver.openTypedAssetFile(uri, "image/*", bundle, null);
                    openInputStream = openTypedAssetFile == null ? openTypedAssetFile.createInputStream() : null;
                    if (openInputStream == null) {
                        ey.f(uri, "'.", "Unable to find a music thumbnail associated with '");
                        return null;
                    }
                }
            }
            bundle = null;
            AssetFileDescriptor openTypedAssetFile2 = contentResolver.openTypedAssetFile(uri, "image/*", bundle, null);
            if (openTypedAssetFile2 == null) {
            }
            if (openInputStream == null) {
            }
        } else {
            openInputStream = contentResolver.openInputStream(uri);
            if (openInputStream == null) {
                ey.f(uri, "'.", "Unable to open '");
                return null;
            }
        }
        return new tn2(new qn2(new p62(o70.J(openInputStream)), new u01(uw1Var.a, 0), new qi()), contentResolver.getType(uri), m60.o);
    }
}
