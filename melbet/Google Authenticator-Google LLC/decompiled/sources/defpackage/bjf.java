package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bjf implements bbn {
    public static final bbk a = new bbk("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme", null, bbk.a);
    private final Context b;

    public bjf(Context context) {
        this.b = context.getApplicationContext();
    }

    @Override // defpackage.bbn
    public final /* bridge */ /* synthetic */ bdv a(Object obj, int i, int i2, bbl bblVar) {
        return c((Uri) obj, bblVar);
    }

    @Override // defpackage.bbn
    public final /* bridge */ /* synthetic */ boolean b(Object obj, bbl bblVar) {
        String scheme = ((Uri) obj).getScheme();
        return scheme != null && scheme.equals("android.resource");
    }

    public final bdv c(Uri uri, bbl bblVar) {
        int parseInt;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new IllegalStateException(a.aj(uri, "Package name for ", " is null or empty"));
        }
        Context context = this.b;
        if (!authority.equals(context.getPackageName())) {
            try {
                context = context.createPackageContext(authority, 0);
            } catch (PackageManager.NameNotFoundException e) {
                Context context2 = this.b;
                if (!authority.contains(context2.getPackageName())) {
                    throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: ".concat(String.valueOf(String.valueOf(uri))), e);
                }
                context = context2;
            }
        }
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            List<String> pathSegments2 = uri.getPathSegments();
            String authority2 = uri.getAuthority();
            String str = pathSegments2.get(0);
            String str2 = pathSegments2.get(1);
            parseInt = context.getResources().getIdentifier(str2, str, authority2);
            if (parseInt == 0) {
                parseInt = Resources.getSystem().getIdentifier(str2, str, "android");
            }
            if (parseInt == 0) {
                throw new IllegalArgumentException("Failed to find resource id for: ".concat(String.valueOf(String.valueOf(uri))));
            }
        } else {
            if (pathSegments.size() != 1) {
                throw new IllegalArgumentException("Unrecognized Uri format: ".concat(String.valueOf(String.valueOf(uri))));
            }
            try {
                parseInt = Integer.parseInt(uri.getPathSegments().get(0));
            } catch (NumberFormatException e2) {
                throw new IllegalArgumentException("Unrecognized Uri format: ".concat(String.valueOf(String.valueOf(uri))), e2);
            }
        }
        a.v(authority, "Argument must not be null");
        Context context3 = this.b;
        Resources.Theme theme = authority.equals(context3.getPackageName()) ? (Resources.Theme) bblVar.b(a) : null;
        return bje.g(theme == null ? bjc.a(context3, context, parseInt, null) : bjc.a(context3, context3, parseInt, theme));
    }
}
