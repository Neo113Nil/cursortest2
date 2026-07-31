package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.hc;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* loaded from: classes10.dex */
public final class ic {
    public static final ic a = new ic();
    public static final Set b = SetsKt.setOf((Object[]) new String[]{"application/javascript", "application/x-javascript"});
    public static final Map c;

    static {
        Pair pair = TuplesKt.to("video/mp4", Double.valueOf(1.5d));
        Pair pair2 = TuplesKt.to("video/3gpp2", Double.valueOf(1.25d));
        Double valueOf = Double.valueOf(1.0d);
        c = MapsKt.mapOf(pair, pair2, TuplesKt.to("video/3gpp", valueOf), TuplesKt.to("video/webm", valueOf), TuplesKt.to("video/x-matroska", valueOf), TuplesKt.to("video/x-m4v", valueOf), TuplesKt.to("video/quicktime", Double.valueOf(0.75d)));
    }

    public final double a(double d, double d2, double d3, double d4) {
        return d * (1.0d / ((d2 + 1.0d) + d3)) * d4;
    }

    public final double a(Integer num) {
        if (num == null) {
            return 0.5d;
        }
        if (num.intValue() < 0) {
            num = null;
        }
        if (num == null) {
            return 0.5d;
        }
        int intValue = num.intValue();
        if (700 > intValue || intValue >= 1501) {
            return Math.min(Math.abs(700 - intValue) / 700, Math.abs(1500 - intValue) / 1500);
        }
        return 0.0d;
    }

    public final double a(cg cgVar, fc fcVar) {
        double d = cgVar.d();
        double b2 = cgVar.b();
        Integer f = fcVar.f();
        if (f != null) {
            double intValue = f.intValue();
            Integer b3 = fcVar.b();
            if (b3 != null) {
                double intValue2 = b3.intValue();
                float a2 = cgVar.a();
                if (d > 0.0d && b2 > 0.0d && intValue > 0.0d && intValue2 > 0.0d) {
                    double d2 = a2 * d;
                    return Math.abs((d / b2) - (intValue / intValue2)) + (d2 != 0.0d ? Math.abs(d2 - intValue) / d2 : Double.MAX_VALUE);
                }
            }
        }
        return Double.MAX_VALUE;
    }

    public final double a(Double d) {
        if (d == null) {
            return 1.0d;
        }
        double doubleValue = d.doubleValue();
        if (Double.isInfinite(doubleValue) || Double.isNaN(doubleValue) || d.doubleValue() <= 0.0d) {
            return 1.0d;
        }
        return RangesKt.coerceAtMost(d.doubleValue(), 100.0d);
    }

    public final hc a(List mediaFiles, cg renderingContainer) {
        Intrinsics.checkNotNullParameter(mediaFiles, "mediaFiles");
        Intrinsics.checkNotNullParameter(renderingContainer, "renderingContainer");
        if (mediaFiles.isEmpty()) {
            return hc.a.c.a;
        }
        Iterator it = mediaFiles.iterator();
        boolean z = false;
        boolean z2 = false;
        fc fcVar = null;
        double d = Double.NEGATIVE_INFINITY;
        while (it.hasNext()) {
            fc fcVar2 = (fc) it.next();
            if (b.contains(fcVar2.c())) {
                z2 = true;
            } else {
                double a2 = a(fcVar2.c());
                if (a2 != 0.0d) {
                    double a3 = a(a2, a(renderingContainer, fcVar2), a(fcVar2.a()), a(fcVar2.e()));
                    if (a3 > d) {
                        d = a3;
                        z = true;
                        fcVar = fcVar2;
                    }
                }
                z = true;
            }
        }
        if (fcVar != null) {
            return new hc.b(fcVar);
        }
        if (!z && z2) {
            return hc.a.b.a;
        }
        return hc.a.C0222a.a;
    }

    public final double a(String str) {
        return ((Number) c.getOrDefault(str, Double.valueOf(0.0d))).doubleValue();
    }
}
