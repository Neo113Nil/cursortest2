package f5;

import com.github.mikephil.charting.formatter.g;
import java.util.List;

/* loaded from: classes4.dex */
public class b extends g {
    private List<Float> values;

    public b(List<Float> list) {
        this.values = list;
    }

    @Override // com.github.mikephil.charting.formatter.g
    public String getAxisLabel(float f8, com.github.mikephil.charting.components.a aVar) {
        int intValue = this.values.get((int) (f8 % this.values.size())).intValue();
        if (intValue == 0) {
            return "";
        }
        return intValue + "%";
    }
}
