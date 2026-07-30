package p000createpolar;

import com.adjust.sdk.AdjustTimeoutCallback;
import com.adjust.sdk.OnAdidReadListener;
import com.adjust.sdk.scheduler.TimerOnce;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageSensorManagerEliteTitanFusion6884 implements Runnable {
    public final /* synthetic */ int PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final /* synthetic */ String PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public final /* synthetic */ ArrayList PolarVoyageStrictModeLegendEpic1532;

    public /* synthetic */ PolarVoyageSensorManagerEliteTitanFusion6884(ArrayList arrayList, String str, int i) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
        this.PolarVoyageStrictModeLegendEpic1532 = arrayList;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        String str = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        int i2 = 0;
        ArrayList arrayList = this.PolarVoyageStrictModeLegendEpic1532;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int size = arrayList.size();
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    OnAdidReadListener onAdidReadListener = (OnAdidReadListener) obj;
                    if (onAdidReadListener != null) {
                        onAdidReadListener.onAdidRead(str);
                    }
                }
                break;
            case 1:
                int size2 = arrayList.size();
                while (i2 < size2) {
                    Object obj2 = arrayList.get(i2);
                    i2++;
                    OnAdidReadListener onAdidReadListener2 = (OnAdidReadListener) obj2;
                    if (onAdidReadListener2 != null) {
                        onAdidReadListener2.onAdidRead(str);
                    }
                }
                break;
            case 2:
                int size3 = arrayList.size();
                while (i2 < size3) {
                    Object obj3 = arrayList.get(i2);
                    i2++;
                    AdjustTimeoutCallback adjustTimeoutCallback = (AdjustTimeoutCallback) obj3;
                    if (adjustTimeoutCallback != null) {
                        TimerOnce timeoutTimer = adjustTimeoutCallback.getTimeoutTimer();
                        if (timeoutTimer != null) {
                            timeoutTimer.cancel();
                        }
                        OnAdidReadListener onAdidReadListener3 = adjustTimeoutCallback.getOnAdidReadListener();
                        if (onAdidReadListener3 != null) {
                            onAdidReadListener3.onAdidRead(str);
                        }
                        adjustTimeoutCallback.setOnAdidReadListener(null);
                    }
                }
                break;
            default:
                int size4 = arrayList.size();
                while (i2 < size4) {
                    Object obj4 = arrayList.get(i2);
                    i2++;
                    AdjustTimeoutCallback adjustTimeoutCallback2 = (AdjustTimeoutCallback) obj4;
                    if (adjustTimeoutCallback2 != null) {
                        TimerOnce timeoutTimer2 = adjustTimeoutCallback2.getTimeoutTimer();
                        if (timeoutTimer2 != null) {
                            timeoutTimer2.cancel();
                        }
                        OnAdidReadListener onAdidReadListener4 = adjustTimeoutCallback2.getOnAdidReadListener();
                        if (onAdidReadListener4 != null) {
                            onAdidReadListener4.onAdidRead(str);
                        }
                        adjustTimeoutCallback2.setOnAdidReadListener(null);
                    }
                }
                break;
        }
    }
}
