package f5;

import com.github.mikephil.charting.formatter.g;
import com.moyoung.dafit.module.common.utils.n;
import java.util.List;

/* loaded from: classes4.dex */
public class a extends g {
    private List<Float> values;

    public a(List<Float> list) {
        this.values = list;
    }

    @Override // com.github.mikephil.charting.formatter.g
    public String getAxisLabel(float f8, com.github.mikephil.charting.components.a aVar) {
        int intValue = this.values.get((int) (f8 % this.values.size())).intValue();
        return intValue == 0 ? "" : n.format(intValue);
    }
}
