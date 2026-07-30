package defpackage;

import android.app.PendingIntent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class fe1 {
    public final Bundle PxuCJdSBwIXG;
    public final PendingIntent RAsUl2FVSrh6;
    public final boolean TSizfFm2Yiuu;
    public final boolean Y1f8riQaR6yg;
    public final CharSequence a92UlCVFR9N8;
    public final int e9gEMXR7LXtO;
    public IconCompat lS5Rgt96tfkO;

    /* JADX WARN: Removed duplicated region for block: B:20:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public fe1(String str, PendingIntent pendingIntent) {
        IconCompat PxuCJdSBwIXG = IconCompat.PxuCJdSBwIXG(2131099648);
        Bundle bundle = new Bundle();
        this.Y1f8riQaR6yg = true;
        this.lS5Rgt96tfkO = PxuCJdSBwIXG;
        if (PxuCJdSBwIXG != null) {
            int i = PxuCJdSBwIXG.PxuCJdSBwIXG;
            if (i == -1) {
                Object obj = PxuCJdSBwIXG.lS5Rgt96tfkO;
                if (Build.VERSION.SDK_INT >= 28) {
                    i = k00.OPXfSBeufaJ8(obj);
                } else {
                    try {
                        i = ((Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
                    } catch (IllegalAccessException e) {
                        Log.e("IconCompat", "Unable to get icon type " + obj, e);
                        i = -1;
                        if (i == 2) {
                        }
                        this.a92UlCVFR9N8 = ge1.PxuCJdSBwIXG(str);
                        this.RAsUl2FVSrh6 = pendingIntent;
                        this.PxuCJdSBwIXG = bundle;
                        this.TSizfFm2Yiuu = true;
                        this.Y1f8riQaR6yg = true;
                    } catch (NoSuchMethodException e2) {
                        Log.e("IconCompat", "Unable to get icon type " + obj, e2);
                        i = -1;
                        if (i == 2) {
                        }
                        this.a92UlCVFR9N8 = ge1.PxuCJdSBwIXG(str);
                        this.RAsUl2FVSrh6 = pendingIntent;
                        this.PxuCJdSBwIXG = bundle;
                        this.TSizfFm2Yiuu = true;
                        this.Y1f8riQaR6yg = true;
                    } catch (InvocationTargetException e3) {
                        Log.e("IconCompat", "Unable to get icon type " + obj, e3);
                        i = -1;
                        if (i == 2) {
                        }
                        this.a92UlCVFR9N8 = ge1.PxuCJdSBwIXG(str);
                        this.RAsUl2FVSrh6 = pendingIntent;
                        this.PxuCJdSBwIXG = bundle;
                        this.TSizfFm2Yiuu = true;
                        this.Y1f8riQaR6yg = true;
                    }
                }
            }
            if (i == 2) {
                this.e9gEMXR7LXtO = PxuCJdSBwIXG.lS5Rgt96tfkO();
            }
        }
        this.a92UlCVFR9N8 = ge1.PxuCJdSBwIXG(str);
        this.RAsUl2FVSrh6 = pendingIntent;
        this.PxuCJdSBwIXG = bundle;
        this.TSizfFm2Yiuu = true;
        this.Y1f8riQaR6yg = true;
    }
}
