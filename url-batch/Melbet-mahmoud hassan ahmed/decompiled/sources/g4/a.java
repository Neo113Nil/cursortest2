package g4;

import android.content.Context;
import android.content.res.Resources;
import o3.l;

/* loaded from: classes.dex */
public final class a {
    public static String a(Context context) {
        try {
            return context.getResources().getResourcePackageName(l.f19866a);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    public static final String b(String str, Resources resources, String str2) {
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        try {
            return resources.getString(identifier);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }
}
