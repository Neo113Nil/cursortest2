package defpackage;

import android.content.Context;
import android.util.Log;
import j$.util.Objects;
import java.lang.reflect.Field;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class csz implements ctd {
    @Override // defpackage.ctd
    public final int a(Context context, String str) {
        ctf ctfVar = ctg.a;
        try {
            Class<?> loadClass = context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (Objects.equals(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            Log.e("DynamiteModule", "Module descriptor id '" + String.valueOf(declaredField.get(null)) + "' didn't match expected id '" + str + "'");
            return 0;
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e.getMessage())));
            return 0;
        }
    }

    @Override // defpackage.ctd
    public final int b(Context context, String str, boolean z) {
        return ctg.a(context, str, z);
    }
}
