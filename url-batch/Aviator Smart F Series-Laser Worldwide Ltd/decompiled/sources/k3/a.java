package k3;

import com.github.mikephil.charting.formatter.g;
import com.moyoung.dafit.module.common.utils.n;

/* loaded from: classes2.dex */
public class a extends g {
    private String formatLabel(int i8) {
        return n.format(i8 / 2, n.TWO_INTEGERS_PATTERN) + ":00";
    }

    @Override // com.github.mikephil.charting.formatter.g
    public String getAxisLabel(float f8, com.github.mikephil.charting.components.a aVar) {
        int intValue = Float.valueOf(f8).intValue();
        return (intValue == 0 || intValue == 46) ? formatLabel(0) : intValue % 12 == 0 ? formatLabel(intValue) : "";
    }
}
