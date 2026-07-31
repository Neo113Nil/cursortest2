package x3;

import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.RecentlyNonNull;

/* loaded from: classes.dex */
public interface a extends IInterface {

    /* renamed from: x3.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0153a extends b4.b implements a {
        public AbstractBinderC0153a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        @RecentlyNonNull
        public static a q0(@RecentlyNonNull IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return queryLocalInterface instanceof a ? (a) queryLocalInterface : new d(iBinder);
        }
    }
}
