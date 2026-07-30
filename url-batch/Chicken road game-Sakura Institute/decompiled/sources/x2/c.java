package x2;

import android.content.res.Configuration;
import android.os.LocaleList;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class c {
    public static LocaleList a(Configuration configuration) {
        return configuration.getLocales();
    }

    public static void b(Configuration configuration, f fVar) {
        fVar.getClass();
        configuration.setLocales(null);
    }
}
