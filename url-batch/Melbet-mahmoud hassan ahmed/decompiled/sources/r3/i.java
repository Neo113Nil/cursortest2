package r3;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.RecentlyNonNull;

/* loaded from: classes.dex */
public interface i extends IInterface {

    public static abstract class a extends b4.b implements i {
        @RecentlyNonNull
        public static i q0(@RecentlyNonNull IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            return queryLocalInterface instanceof i ? (i) queryLocalInterface : new h1(iBinder);
        }
    }

    @RecentlyNonNull
    Account a();
}
