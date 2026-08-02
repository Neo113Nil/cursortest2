package E;

import android.telephony.CellInfo;
import android.telephony.CellInfoNr;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public abstract /* synthetic */ class M {
    public static /* bridge */ /* synthetic */ CellInfoNr e(CellInfo cellInfo) {
        return (CellInfoNr) cellInfo;
    }

    public static /* synthetic */ WindowInsets.Builder f() {
        return new WindowInsets.Builder();
    }

    public static /* bridge */ /* synthetic */ boolean v(CellInfo cellInfo) {
        return cellInfo instanceof CellInfoNr;
    }
}
