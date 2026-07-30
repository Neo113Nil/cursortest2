package k0;

import com.crrepa.band.my.model.db.BloodOxygen;
import java.util.Date;

/* loaded from: classes2.dex */
public class a {
    private static final int BLOOD_PRESSURE_MAX = 100;
    private static final int BLOOD_PRESSURE_MIN = 0;

    private a() {
    }

    public static BloodOxygen convert(int i8) {
        if (i8 <= 0 || i8 >= 100) {
            return null;
        }
        BloodOxygen bloodOxygen = new BloodOxygen();
        bloodOxygen.setDate(new Date());
        bloodOxygen.setBloodOxygen(Integer.valueOf(i8));
        return bloodOxygen;
    }
}
