package defpackage;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class xb3 implements kc3 {
    public final Double m;

    public xb3(Double d) {
        if (d == null) {
            this.m = Double.valueOf(Double.NaN);
        } else {
            this.m = d;
        }
    }

    @Override // defpackage.kc3
    public final Boolean a() {
        Double d = this.m;
        boolean z = false;
        if (!Double.isNaN(d.doubleValue()) && d.doubleValue() != 0.0d) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.kc3
    public final Iterator e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xb3) {
            return this.m.equals(((xb3) obj).m);
        }
        return false;
    }

    @Override // defpackage.kc3
    public final Double f() {
        return this.m;
    }

    public final int hashCode() {
        return this.m.hashCode();
    }

    @Override // defpackage.kc3
    public final kc3 j(String str, js0 js0Var, ArrayList arrayList) {
        if (InAppPurchaseConstants.METHOD_TO_STRING.equals(str)) {
            return new pc3(zzc());
        }
        throw new IllegalArgumentException(zzc() + "." + str + " is not a function.");
    }

    @Override // defpackage.kc3
    public final kc3 k() {
        return new xb3(this.m);
    }

    public final String toString() {
        return zzc();
    }

    @Override // defpackage.kc3
    public final String zzc() {
        Double d = this.m;
        if (Double.isNaN(d.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(d.doubleValue())) {
            return d.doubleValue() > 0.0d ? "Infinity" : "-Infinity";
        }
        BigDecimal valueOf = BigDecimal.valueOf(d.doubleValue());
        BigDecimal bigDecimal = valueOf.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : valueOf.stripTrailingZeros();
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        decimalFormat.setMinimumFractionDigits((bigDecimal.scale() > 0 ? bigDecimal.precision() : bigDecimal.scale()) - 1);
        String format = decimalFormat.format(bigDecimal);
        int indexOf = format.indexOf("E");
        if (indexOf <= 0) {
            return format;
        }
        int parseInt = Integer.parseInt(format.substring(indexOf + 1));
        return ((parseInt >= 0 || parseInt <= -7) && (parseInt < 0 || parseInt >= 21)) ? format.replace("E-", "e-").replace("E", "e+") : bigDecimal.toPlainString();
    }
}
