package a3;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.bo0;
import com.google.android.gms.internal.ads.m10;
import com.google.android.gms.internal.ads.qw;
import com.google.android.gms.internal.ads.sw;

@TargetApi(24)
/* loaded from: classes.dex */
public class m2 extends l2 {
    static final boolean t(int i7, int i8, int i9) {
        return Math.abs(i7 - i8) <= i9;
    }

    @Override // a3.f
    public final boolean o(Activity activity, Configuration configuration) {
        if (!((Boolean) sw.c().b(m10.f8292r3)).booleanValue()) {
            return false;
        }
        if (((Boolean) sw.c().b(m10.f8308t3)).booleanValue()) {
            return activity.isInMultiWindowMode();
        }
        qw.b();
        int s7 = bo0.s(activity, configuration.screenHeightDp);
        int s8 = bo0.s(activity, configuration.screenWidthDp);
        WindowManager windowManager = (WindowManager) activity.getApplicationContext().getSystemService("window");
        y2.t.q();
        DisplayMetrics g02 = g2.g0(windowManager);
        int i7 = g02.heightPixels;
        int i8 = g02.widthPixels;
        int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
        int dimensionPixelSize = identifier > 0 ? activity.getResources().getDimensionPixelSize(identifier) : 0;
        double d7 = activity.getResources().getDisplayMetrics().density;
        Double.isNaN(d7);
        int round = ((int) Math.round(d7 + 0.5d)) * ((Integer) sw.c().b(m10.f8276p3)).intValue();
        return (t(i7, s7 + dimensionPixelSize, round) && t(i8, s8, round)) ? false : true;
    }
}
