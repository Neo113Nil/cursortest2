package f5;

import com.github.mikephil.charting.formatter.g;
import com.moyoung.dafit.module.common.utils.n;
import java.util.List;

/* loaded from: classes4.dex */
public class c extends g {
    private List<Float> values;

    public c(List<Float> list) {
        this.values = list;
    }

    @Override // com.github.mikephil.charting.formatter.g
    public String getAxisLabel(float f8, com.github.mikephil.charting.components.a aVar) {
        float floatValue = this.values.get((int) (f8 % this.values.size())).floatValue();
        return floatValue == 0.0f ? "" : n.formatTemp(floatValue);
    }
}
