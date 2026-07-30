package k3;

import com.github.mikephil.charting.formatter.g;
import com.moyoung.dafit.module.common.utils.n;

/* loaded from: classes2.dex */
public class c extends g {
    private int maxValue;
    private int unit;

    public c(int i8) {
        this.maxValue = i8;
        if (i8 % 100 == 0) {
            this.unit = 100;
        } else {
            this.unit = 50;
        }
    }

    @Override // com.github.mikephil.charting.formatter.g
    public String getAxisLabel(float f8, com.github.mikephil.charting.components.a aVar) {
        return f8 % ((float) this.unit) != 0.0f ? "" : n.format(f8, "0");
    }
}
