package u1;

import com.crrepa.band.my.model.BandFunctionModel;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class a {
    private a() {
    }

    public static List<BandFunctionModel> convert(String[] strArr, List<Integer> list, boolean z7) {
        ArrayList arrayList = new ArrayList();
        byte b8 = 0;
        for (int i8 = 0; i8 < list.size(); i8++) {
            int intValue = list.get(i8).intValue();
            if (isAdded(intValue)) {
                BandFunctionModel bandFunctionModel = new BandFunctionModel();
                bandFunctionModel.setEnable(z7);
                bandFunctionModel.setFunction(intValue);
                bandFunctionModel.setIndex(b8);
                bandFunctionModel.setName(strArr[intValue - 1]);
                arrayList.add(bandFunctionModel);
                b8 = (byte) (b8 + 1);
            }
        }
        return arrayList;
    }

    private static boolean isAdded(int i8) {
        return i8 > 2;
    }
}
