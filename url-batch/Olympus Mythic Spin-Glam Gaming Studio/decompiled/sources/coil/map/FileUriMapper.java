package coil.map;

import android.net.Uri;
import coil.request.Options;
import coil.util.Utils;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: FileUriMapper.kt */
/* loaded from: classes9.dex */
public final class FileUriMapper implements Mapper {
    @Override // coil.map.Mapper
    public File map(Uri uri, Options options) {
        if (!isApplicable(uri)) {
            return null;
        }
        if (uri.getScheme() != null) {
            uri = uri.buildUpon().scheme(null).build();
        }
        return new File(uri.toString());
    }

    private final boolean isApplicable(Uri uri) {
        if (Utils.isAssetUri(uri)) {
            return false;
        }
        String scheme = uri.getScheme();
        if (scheme != null && !Intrinsics.areEqual(scheme, "file")) {
            return false;
        }
        String path = uri.getPath();
        if (path == null) {
            path = "";
        }
        return StringsKt.startsWith$default((CharSequence) path, '/', false, 2, (Object) null) && Utils.getFirstPathSegment(uri) != null;
    }
}
