package j2;

import com.crrepa.band.my.model.db.BloodPressure;
import java.util.Date;

/* loaded from: classes2.dex */
public class a {
    private static final int MAX_BLOOD_PRESSURE = 250;
    private static final int MIN_BLOOD_PRESSURE = 0;

    private a() {
    }

    public static BloodPressure convert(int i8, int i9) {
        if (i8 <= 0 || 250 <= i8 || i9 <= 0 || 250 <= i9) {
            return null;
        }
        BloodPressure bloodPressure = new BloodPressure();
        bloodPressure.setDate(new Date());
        bloodPressure.setDbp(Integer.valueOf(i8));
        bloodPressure.setSbp(Integer.valueOf(i9));
        return bloodPressure;
    }
}
