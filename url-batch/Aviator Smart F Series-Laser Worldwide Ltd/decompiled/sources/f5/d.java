package f5;

import com.baidu.mapapi.http.HttpClient;
import com.github.mikephil.charting.formatter.g;
import com.moyoung.dafit.module.common.utils.n;
import java.util.List;

/* loaded from: classes4.dex */
public class d extends g {
    private final int type;
    private final List values;

    public d(List list, int i8) {
        this.values = list;
        this.type = i8;
    }

    @Override // com.github.mikephil.charting.formatter.g
    public String getAxisLabel(float f8, com.github.mikephil.charting.components.a aVar) {
        int size = (int) (f8 % this.values.size());
        int i8 = this.type;
        if (i8 != -1) {
            if (i8 != 0) {
                return ((i8 == 1 || i8 == 2 || i8 == 3) && size < this.values.size()) ? (String) this.values.get(size) : HttpClient.ENDFLAG;
            }
        } else if (this.values.size() == 1) {
            if (f8 != 0.0f) {
                return "";
            }
            float floatValue = ((Float) this.values.get(0)).floatValue();
            return floatValue != 0.0f ? n.formatWeight(floatValue, 1) : "";
        }
        if (size >= this.values.size()) {
            return HttpClient.ENDFLAG;
        }
        float floatValue2 = ((Float) this.values.get(size)).floatValue();
        return floatValue2 != 0.0f ? n.formatWeight(floatValue2, 1) : HttpClient.ENDFLAG;
    }
}
