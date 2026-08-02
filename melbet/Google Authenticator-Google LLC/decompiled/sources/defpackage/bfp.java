package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bfp implements bge {
    private final /* synthetic */ int a;
    private final Object b;
    private final Object c;

    public bfp(Context context, bfo bfoVar, int i) {
        this.a = i;
        this.b = context.getApplicationContext();
        this.c = bfoVar;
    }

    private final Uri c(Integer num) {
        try {
            return Uri.parse("android.resource://" + ((Resources) this.b).getResourcePackageName(num.intValue()) + "/" + num);
        } catch (Resources.NotFoundException e) {
            if (!Log.isLoggable("ResourceLoader", 5)) {
                return null;
            }
            Objects.toString(num);
            Log.w("ResourceLoader", "Received invalid resource id: ".concat(String.valueOf(num)), e);
            return null;
        }
    }

    @Override // defpackage.bge
    public final /* synthetic */ boolean a(Object obj) {
        int i = this.a;
        if (i == 0) {
            return true;
        }
        if (i == 1) {
            Uri uri = (Uri) obj;
            return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
        }
        if (i != 2) {
            Uri uri2 = (Uri) obj;
            return "android.resource".equals(uri2.getScheme()) && ((Context) this.b).getPackageName().equals(uri2.getAuthority());
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r10v4, types: [bfd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [bfo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v17, types: [bge, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v5, types: [bge, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v8, types: [bge, java.lang.Object] */
    @Override // defpackage.bge
    public final /* synthetic */ bvw b(Object obj, int i, int i2, bbl bblVar) {
        int i3 = this.a;
        if (i3 == 0) {
            Integer num = (Integer) obj;
            Resources.Theme theme = (Resources.Theme) bblVar.b(bjf.a);
            return new bvw(new bls(num), new bfn(theme, theme != null ? theme.getResources() : ((Context) this.b).getResources(), this.c, num.intValue()));
        }
        if (i3 == 1) {
            Uri uri = (Uri) obj;
            return new bvw(new bls(uri), this.c.a((AssetManager) this.b, uri.toString().substring(22)));
        }
        if (i3 == 2) {
            Uri c = c((Integer) obj);
            if (c == null) {
                return null;
            }
            return this.c.b(c, i, i2, bblVar);
        }
        Uri uri2 = (Uri) obj;
        List<String> pathSegments = uri2.getPathSegments();
        if (pathSegments.size() == 1) {
            try {
                int parseInt = Integer.parseInt(uri2.getPathSegments().get(0));
                if (parseInt != 0) {
                    return this.c.b(Integer.valueOf(parseInt), i, i2, bblVar);
                }
                if (Log.isLoggable("ResourceUriLoader", 5)) {
                    Log.w("ResourceUriLoader", "Failed to parse a valid non-0 resource id from: " + String.valueOf(uri2));
                }
                return null;
            } catch (NumberFormatException e) {
                if (Log.isLoggable("ResourceUriLoader", 5)) {
                    Log.w("ResourceUriLoader", "Failed to parse resource id from: ".concat(String.valueOf(String.valueOf(uri2))), e);
                }
                return null;
            }
        }
        if (pathSegments.size() != 2) {
            if (Log.isLoggable("ResourceUriLoader", 5)) {
                Log.w("ResourceUriLoader", "Failed to parse resource uri: ".concat(String.valueOf(String.valueOf(uri2))));
            }
            return null;
        }
        List<String> pathSegments2 = uri2.getPathSegments();
        String str = pathSegments2.get(0);
        String str2 = pathSegments2.get(1);
        Context context = (Context) this.b;
        int identifier = context.getResources().getIdentifier(str2, str, context.getPackageName());
        if (identifier != 0) {
            return this.c.b(Integer.valueOf(identifier), i, i2, bblVar);
        }
        if (Log.isLoggable("ResourceUriLoader", 5)) {
            Log.w("ResourceUriLoader", "Failed to find resource id for: ".concat(String.valueOf(String.valueOf(uri2))));
        }
        return null;
    }

    public bfp(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public bfp(Context context, bge bgeVar, int i) {
        this.a = i;
        this.b = context.getApplicationContext();
        this.c = bgeVar;
    }
}
