package com.google.android.gms.internal.measurement;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class l3 implements f5 {

    /* renamed from: d, reason: collision with root package name */
    public final Double f2496d;

    public l3(Double d10) {
        if (d10 == null) {
            this.f2496d = Double.valueOf(Double.NaN);
        } else {
            this.f2496d = d10;
        }
    }

    @Override // com.google.android.gms.internal.measurement.f5
    public final Boolean b() {
        Double d10 = this.f2496d;
        boolean z10 = false;
        if (!Double.isNaN(d10.doubleValue()) && d10.doubleValue() != 0.0d) {
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }

    @Override // com.google.android.gms.internal.measurement.f5
    public final Iterator e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l3) {
            return this.f2496d.equals(((l3) obj).f2496d);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.f5
    public final String f() {
        Double d10 = this.f2496d;
        if (Double.isNaN(d10.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(d10.doubleValue())) {
            return d10.doubleValue() > 0.0d ? "Infinity" : "-Infinity";
        }
        BigDecimal valueOf = BigDecimal.valueOf(d10.doubleValue());
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

    @Override // com.google.android.gms.internal.measurement.f5
    public final Double g() {
        return this.f2496d;
    }

    public final int hashCode() {
        return this.f2496d.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.f5
    public final f5 i(String str, e7 e7Var, ArrayList arrayList) {
        if ("toString".equals(str)) {
            return new i5(f());
        }
        throw new IllegalArgumentException(f() + "." + str + " is not a function.");
    }

    @Override // com.google.android.gms.internal.measurement.f5
    public final f5 n() {
        return new l3(this.f2496d);
    }

    public final String toString() {
        return f();
    }
}
