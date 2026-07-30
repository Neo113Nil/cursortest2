package com.crrepa.band.my.model.user.provider;

import android.content.Context;
import com.crrepa.band.aviator.R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class WeightUnitProvider {
    private WeightUnitProvider() {
    }

    public static List<String> getWeightUnitList(Context context) {
        ArrayList arrayList = new ArrayList();
        String string = context.getString(R.string.weight_unit_kg);
        String string2 = context.getString(R.string.weight_unit_lb);
        arrayList.add(string);
        arrayList.add(string2);
        return arrayList;
    }
}
