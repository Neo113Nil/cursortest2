package com.crrepa.band.my.health.base;

import com.crrepa.band.aviator.R;
import com.crrepa.band.my.model.band.provider.BandUnitSystemProvider;
import com.moyoung.dafit.module.common.utils.n;
import com.moyoung.dafit.module.common.utils.u0;

/* loaded from: classes2.dex */
public class a {
    private a() {
    }

    public static String getActionDistance(int i8) {
        return getActionDistance(i8, BandUnitSystemProvider.getUnitSystem());
    }

    public static int getActionDistanceUnit(float f8, int i8) {
        return i8 == 1 ? ((double) f8) > 1609.0d ? R.string.distance_unit_miles : R.string.distance_unit_yd : ((double) f8) > 1000.0d ? R.string.distance_unit_km : R.string.distance_unit_m;
    }

    public static int getActionDistanceUnit(float f8) {
        return getActionDistanceUnit(f8, BandUnitSystemProvider.getUnitSystem());
    }

    public static String getActionDistance(int i8, int i9) {
        if (i8 <= 0) {
            return com.moyoung.dafit.module.common.utils.d.get().getString(R.string.data_blank);
        }
        double d8 = i8;
        if (i9 == 1) {
            if (d8 > 1609.0d) {
                d8 = u0.m2Miles(i8);
            } else {
                d8 = (int) u0.m2Yds(i8);
            }
        } else if (d8 > 1000.0d) {
            d8 /= 1000.0d;
        }
        return n.format(d8, n.TWO_DECIMAL_PATTERN);
    }
}
