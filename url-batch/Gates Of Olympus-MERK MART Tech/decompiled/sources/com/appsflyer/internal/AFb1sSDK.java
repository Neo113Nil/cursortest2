package com.appsflyer.internal;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/appsflyer/internal/AFb1sSDK;", "", "", "afInfoLog", "()V", "Lcom/appsflyer/internal/AFa1rSDK;", "valueOf", "Lcom/appsflyer/internal/AFa1rSDK;", "AFInAppEventType", "p0", "<init>", "(Lcom/appsflyer/internal/AFa1rSDK;)V"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AFb1sSDK {

    /* renamed from: valueOf, reason: from kotlin metadata */
    private final AFa1rSDK AFInAppEventType;

    public AFb1sSDK(AFa1rSDK aFa1rSDK) {
        Intrinsics.checkNotNullParameter(aFa1rSDK, "");
        this.AFInAppEventType = aFa1rSDK;
    }

    public final void afInfoLog() {
        try {
            Object obj = AFc1gSDK.afErrorLog.get(866272988);
            if (obj == null) {
                obj = ((Class) AFc1gSDK.values(Color.green(0) + 89, 37 - Color.green(0), (char) (65149 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))))).getDeclaredConstructor(null);
                AFc1gSDK.afErrorLog.put(866272988, obj);
            }
            Object newInstance = ((Constructor) obj).newInstance(null);
            try {
                Object[] objArr = {this.AFInAppEventType};
                Object obj2 = AFc1gSDK.afErrorLog.get(-1619579641);
                if (obj2 == null) {
                    obj2 = ((Class) AFc1gSDK.values((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 88, TextUtils.indexOf("", "") + 37, (char) (KeyEvent.normalizeMetaState(0) + 65149))).getMethod("values", AFa1rSDK.class);
                    AFc1gSDK.afErrorLog.put(-1619579641, obj2);
                }
                ((Method) obj2).invoke(newInstance, objArr);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }
}
