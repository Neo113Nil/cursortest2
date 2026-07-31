package com.appsflyer.internal;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class AFi1iSDKI22864$AFa1tSDK implements OnCompleteListener<IntegrityTokenResponse> {
    private /* synthetic */ AFi1fSDK AFAdRevenueData;
    private final long getMediationNetwork;

    public AFi1iSDKI22864$AFa1tSDK(AFi1fSDK aFi1fSDK, long j4) {
        this.AFAdRevenueData = aFi1fSDK;
        this.getMediationNetwork = j4;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task<IntegrityTokenResponse> task) {
        Object invoke;
        String str;
        Intrinsics.checkNotNullParameter(task, "");
        if (task.isSuccessful()) {
            str = task.getResult().token();
            invoke = null;
        } else {
            try {
                Object[] objArr = {this.AFAdRevenueData, task.getException()};
                Map map = AFi1jSDK.f13373e;
                Object obj = map.get(1949440882);
                if (obj == null) {
                    obj = ((Class) AFi1jSDK.AFAdRevenueData(ViewConfiguration.getPressedStateDuration() >> 16, (char) (ViewConfiguration.getEdgeSlop() >> 16), 37 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)))).getMethod("AFAdRevenueData", (Class) AFi1jSDK.AFAdRevenueData(1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 37 - TextUtils.indexOf("", "", 0)), Exception.class);
                    map.put(1949440882, obj);
                }
                invoke = ((Method) obj).invoke(null, objArr);
                str = null;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        Object[] objArr2 = {this.AFAdRevenueData, Long.valueOf(this.getMediationNetwork), str, invoke};
        Map map2 = AFi1jSDK.f13373e;
        Object obj2 = map2.get(-1326367481);
        if (obj2 == null) {
            obj2 = ((Class) AFi1jSDK.AFAdRevenueData(View.MeasureSpec.getMode(0), (char) (ViewConfiguration.getTouchSlop() >> 8), 37 - View.MeasureSpec.getMode(0))).getMethod("getMonetizationNetwork", (Class) AFi1jSDK.AFAdRevenueData(ViewConfiguration.getTapTimeout() >> 16, (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 37 - (ViewConfiguration.getLongPressTimeout() >> 16)), Long.TYPE, String.class, String.class);
            map2.put(-1326367481, obj2);
        }
        ((Method) obj2).invoke(null, objArr2);
        Object[] objArr3 = {this.AFAdRevenueData};
        Object obj3 = map2.get(-2030000374);
        if (obj3 == null) {
            obj3 = ((Class) AFi1jSDK.AFAdRevenueData(View.MeasureSpec.makeMeasureSpec(0, 0), (char) Color.red(0), 36 - TextUtils.lastIndexOf("", '0', 0, 0))).getMethod("getRevenue", (Class) AFi1jSDK.AFAdRevenueData(TextUtils.getOffsetBefore("", 0), (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 36 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)));
            map2.put(-2030000374, obj3);
        }
        ((CountDownLatch) ((Method) obj3).invoke(null, objArr3)).countDown();
    }
}
