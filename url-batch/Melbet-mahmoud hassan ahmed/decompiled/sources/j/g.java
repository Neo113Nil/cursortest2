package j;

import android.app.Notification;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import androidx.core.graphics.drawable.IconCompat;
import j.e;
import java.lang.reflect.Field;
import java.util.List;

/* loaded from: classes.dex */
class g {

    /* renamed from: b, reason: collision with root package name */
    private static Field f18034b;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f18035c;

    /* renamed from: a, reason: collision with root package name */
    private static final Object f18033a = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static final Object f18036d = new Object();

    public static SparseArray<Bundle> a(List<Bundle> list) {
        int size = list.size();
        SparseArray<Bundle> sparseArray = null;
        for (int i7 = 0; i7 < size; i7++) {
            Bundle bundle = list.get(i7);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                sparseArray.put(i7, bundle);
            }
        }
        return sparseArray;
    }

    static Bundle b(e.a aVar) {
        Bundle bundle = new Bundle();
        IconCompat f7 = aVar.f();
        bundle.putInt("icon", f7 != null ? f7.i() : 0);
        bundle.putCharSequence("title", aVar.j());
        bundle.putParcelable("actionIntent", aVar.a());
        Bundle bundle2 = aVar.d() != null ? new Bundle(aVar.d()) : new Bundle();
        bundle2.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        bundle.putBundle("extras", bundle2);
        bundle.putParcelableArray("remoteInputs", e(aVar.g()));
        bundle.putBoolean("showsUserInterface", aVar.i());
        bundle.putInt("semanticAction", aVar.h());
        return bundle;
    }

    public static Bundle c(Notification notification) {
        String str;
        String str2;
        synchronized (f18033a) {
            if (f18035c) {
                return null;
            }
            try {
                if (f18034b == null) {
                    Field declaredField = Notification.class.getDeclaredField("extras");
                    if (!Bundle.class.isAssignableFrom(declaredField.getType())) {
                        Log.e("NotificationCompat", "Notification.extras field is not of type Bundle");
                        f18035c = true;
                        return null;
                    }
                    declaredField.setAccessible(true);
                    f18034b = declaredField;
                }
                Bundle bundle = (Bundle) f18034b.get(notification);
                if (bundle == null) {
                    bundle = new Bundle();
                    f18034b.set(notification, bundle);
                }
                return bundle;
            } catch (IllegalAccessException e7) {
                e = e7;
                str = "NotificationCompat";
                str2 = "Unable to access notification extras";
                Log.e(str, str2, e);
                f18035c = true;
                return null;
            } catch (NoSuchFieldException e8) {
                e = e8;
                str = "NotificationCompat";
                str2 = "Unable to access notification extras";
                Log.e(str, str2, e);
                f18035c = true;
                return null;
            }
        }
    }

    private static Bundle d(j jVar) {
        new Bundle();
        throw null;
    }

    private static Bundle[] e(j[] jVarArr) {
        if (jVarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[jVarArr.length];
        for (int i7 = 0; i7 < jVarArr.length; i7++) {
            bundleArr[i7] = d(jVarArr[i7]);
        }
        return bundleArr;
    }

    public static Bundle f(Notification.Builder builder, e.a aVar) {
        IconCompat f7 = aVar.f();
        builder.addAction(f7 != null ? f7.i() : 0, aVar.j(), aVar.a());
        Bundle bundle = new Bundle(aVar.d());
        if (aVar.g() != null) {
            bundle.putParcelableArray("android.support.remoteInputs", e(aVar.g()));
        }
        if (aVar.c() != null) {
            bundle.putParcelableArray("android.support.dataRemoteInputs", e(aVar.c()));
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        return bundle;
    }
}
