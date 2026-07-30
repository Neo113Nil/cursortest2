package k3;

import android.content.Context;
import com.crrepa.band.aviator.R;
import com.github.mikephil.charting.formatter.g;

/* loaded from: classes2.dex */
public class f extends g {
    private String[] axisValueArray;

    public f(Context context) {
        this.axisValueArray = getAxisValues(context);
    }

    private String[] getAxisValues(Context context) {
        return new String[]{context.getString(R.string.sunday), context.getString(R.string.monday), context.getString(R.string.tuesday), context.getString(R.string.wednesday), context.getString(R.string.thursday), context.getString(R.string.friday), context.getString(R.string.saturday)};
    }

    @Override // com.github.mikephil.charting.formatter.g
    public String getAxisLabel(float f8, com.github.mikephil.charting.components.a aVar) {
        return this.axisValueArray[(int) (f8 % r3.length)];
    }
}
