package k1;

import android.util.Log;
import java.util.Objects;

/* renamed from: k1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1210f extends ClassLoader {
    @Override // java.lang.ClassLoader
    public final Class loadClass(String str, boolean z) {
        if (!Objects.equals(str, "com.google.android.gms.iid.MessengerCompat")) {
            return super.loadClass(str, z);
        }
        if (!Log.isLoggable("CloudMessengerCompat", 3)) {
            return C1211g.class;
        }
        Log.d("CloudMessengerCompat", "Using renamed FirebaseIidMessengerCompat class");
        return C1211g.class;
    }
}
