package p1;

import android.util.Log;
import java.util.Objects;

/* renamed from: p1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0821d extends ClassLoader {
    @Override // java.lang.ClassLoader
    public final Class loadClass(String str, boolean z7) {
        if (!Objects.equals(str, "com.google.android.gms.iid.MessengerCompat")) {
            return super.loadClass(str, z7);
        }
        if (!Log.isLoggable("CloudMessengerCompat", 3)) {
            return C0822e.class;
        }
        Log.d("CloudMessengerCompat", "Using renamed FirebaseIidMessengerCompat class");
        return C0822e.class;
    }
}
