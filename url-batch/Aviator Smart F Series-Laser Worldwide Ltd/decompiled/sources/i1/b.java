package i1;

import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.band.my.device.muslim.model.BandMuslimPrayerCompensationChangeEvent;
import com.crrepa.ble.conn.callback.CRPMuslimPrayerCompensationCallback;
import com.orhanobut.logger.f;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class b implements CRPMuslimPrayerCompensationCallback {
    private static final int ARRAY_LENGTH = 7;
    public static final int COMPENSATION_MAX_VALUE = 120;
    public static final int COMPENSATION_MIN_VALUE = -120;

    private static int[] byteArrayToIntArray(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return new int[7];
        }
        int[] iArr = new int[bArr.length];
        for (int i8 = 0; i8 < bArr.length; i8++) {
            iArr[i8] = bArr[i8];
        }
        return iArr;
    }

    private static byte[] intArrayToByteArray(int[] iArr) {
        if (iArr == null || iArr.length == 0) {
            return new byte[7];
        }
        byte[] bArr = new byte[iArr.length];
        for (int i8 = 0; i8 < iArr.length; i8++) {
            int i9 = iArr[i8];
            if (i9 > 120 || i9 < -120) {
                bArr[i8] = 0;
            } else {
                bArr[i8] = Integer.valueOf(i9).byteValue();
            }
        }
        return bArr;
    }

    public static void sendCompensationArray(int[] iArr) {
        f.d("穆斯林补偿值发送到手表: " + Arrays.toString(iArr));
        if (iArr == null || iArr.length != 7) {
            return;
        }
        i4.getInstance().sendMuslimPrayerCompensation(intArrayToByteArray(iArr));
    }

    @Override // com.crrepa.ble.conn.callback.CRPMuslimPrayerCompensationCallback
    public void onCompensationArray(byte[] bArr) {
        f.d("穆斯林补偿值手表回调: " + Arrays.toString(bArr));
        if (bArr == null || bArr.length != 7) {
            return;
        }
        com.crrepa.band.my.device.muslim.utils.c.savePrayerCompensation(byteArrayToIntArray(bArr));
        org.greenrobot.eventbus.c.getDefault().post(new BandMuslimPrayerCompensationChangeEvent());
    }
}
