package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.os.VibratorManager;
import android.util.Log;
import kotlin.Unit;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class rj0 implements n31 {
    public boolean d;
    public boolean e;
    public boolean g;
    public final Object h;

    public rj0(Context context) {
        Vibrator vibrator;
        context.getClass();
        if (Build.VERSION.SDK_INT >= 31) {
            VibratorManager d = o3.d(context.getSystemService(o3.n()));
            vibrator = d != null ? d.getDefaultVibrator() : null;
        } else {
            vibrator = (Vibrator) context.getSystemService(Vibrator.class);
        }
        this.h = vibrator;
        this.e = true;
        this.g = true;
    }

    public void a(long j) {
        Object j31Var;
        if (this.d && this.e && this.g) {
            try {
                i31 i31Var = k31.d;
                VibrationEffect createOneShot = VibrationEffect.createOneShot(j, -1);
                Vibrator vibrator = (Vibrator) this.h;
                if (vibrator != null) {
                    vibrator.vibrate(createOneShot);
                    j31Var = Unit.a;
                } else {
                    j31Var = null;
                }
            } catch (Throwable th) {
                i31 i31Var2 = k31.d;
                j31Var = new j31(th);
            }
            Throwable a = k31.a(j31Var);
            if (a != null) {
                Log.w("VibrationController", "Vibration ignored", a);
            }
        }
    }

    public void c() {
        vn0 vn0Var = (vn0) this.h;
        Object[] objArr = vn0Var.c;
        long[] jArr = vn0Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i << 3) + i3];
                            if (obj instanceof mn0) {
                                mn0 mn0Var = (mn0) obj;
                                Object[] objArr2 = mn0Var.a;
                                int i4 = mn0Var.b;
                                for (int i5 = 0; i5 < i4; i5++) {
                                    Object obj2 = objArr2[i5];
                                }
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        vn0Var.a();
    }

    public rj0() {
        this.d = true;
        this.h = new vn0();
    }
}
