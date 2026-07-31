package coil.map;

import android.content.res.Resources;
import android.net.Uri;
import coil.request.Options;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: ResourceUriMapper.kt */
/* loaded from: classes5.dex */
public final class ResourceUriMapper implements Mapper {
    @Override // coil.map.Mapper
    public Uri map(Uri uri, Options options) {
        if (!isApplicable(uri)) {
            return null;
        }
        String authority = uri.getAuthority();
        if (authority == null) {
            authority = "";
        }
        Resources resourcesForApplication = options.getContext().getPackageManager().getResourcesForApplication(authority);
        List<String> pathSegments = uri.getPathSegments();
        int identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
        if (identifier == 0) {
            throw new IllegalStateException(("Invalid android.resource URI: " + uri).toString());
        }
        Uri parse = Uri.parse("android.resource://" + authority + '/' + identifier);
        Intrinsics.checkNotNullExpressionValue(parse, "parse(this)");
        return parse;
    }

    private final boolean isApplicable(Uri uri) {
        String authority;
        return Intrinsics.areEqual(uri.getScheme(), "android.resource") && (authority = uri.getAuthority()) != null && !StringsKt.isBlank(authority) && uri.getPathSegments().size() == 2;
    }
}
