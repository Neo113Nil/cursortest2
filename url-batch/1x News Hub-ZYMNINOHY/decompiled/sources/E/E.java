package E;

import android.telephony.CellIdentityNr;
import android.telephony.CellInfo;
import android.telephony.CellInfoNr;
import android.telephony.CellInfoTdscdma;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public abstract /* synthetic */ class E {
    public static /* bridge */ /* synthetic */ CellIdentityNr f(Object obj) {
        return (CellIdentityNr) obj;
    }

    public static /* bridge */ /* synthetic */ CellInfoNr h(CellInfo cellInfo) {
        return (CellInfoNr) cellInfo;
    }

    public static /* bridge */ /* synthetic */ CellInfoTdscdma i(CellInfo cellInfo) {
        return (CellInfoTdscdma) cellInfo;
    }

    public static /* synthetic */ WindowInsets.Builder l() {
        return new WindowInsets.Builder();
    }

    public static /* synthetic */ WindowInsets.Builder m(WindowInsets windowInsets) {
        return new WindowInsets.Builder(windowInsets);
    }

    public static /* bridge */ /* synthetic */ boolean u(CellInfo cellInfo) {
        return cellInfo instanceof CellInfoNr;
    }

    public static /* bridge */ /* synthetic */ boolean y(CellInfo cellInfo) {
        return cellInfo instanceof CellInfoTdscdma;
    }
}
