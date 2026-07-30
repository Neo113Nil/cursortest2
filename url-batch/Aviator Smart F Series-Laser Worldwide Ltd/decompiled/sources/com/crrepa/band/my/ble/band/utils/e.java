package com.crrepa.band.my.ble.band.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.os.IBinder;
import android.telecom.TelecomManager;
import android.telephony.TelephonyManager;
import androidx.core.content.ContextCompat;
import com.android.internal.telephony.ITelephony;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public class e {
    private e() {
    }

    @SuppressLint({"PrivateApi"})
    public static boolean endCall(Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            TelecomManager telecomManager = (TelecomManager) context.getSystemService("telecom");
            if (telecomManager == null || ContextCompat.checkSelfPermission(context, "android.permission.ANSWER_PHONE_CALLS") != 0) {
                return false;
            }
            telecomManager.endCall();
            return true;
        }
        try {
            Class<?> cls = ITelephony.class.getClasses()[0];
            Class<?> cls2 = Class.forName("android.os.ServiceManager");
            Class<?> cls3 = Class.forName("android.os.ServiceManagerNative");
            Method method = cls2.getMethod("getService", String.class);
            Method method2 = cls3.getMethod("asInterface", IBinder.class);
            Binder binder = new Binder();
            binder.attachInterface(null, "fake");
            ITelephony.class.getMethod("endCall", new Class[0]).invoke(cls.getMethod("asInterface", IBinder.class).invoke(null, (IBinder) method.invoke(method2.invoke(null, binder), "phone")), new Object[0]);
            return true;
        } catch (Exception e8) {
            e8.printStackTrace();
            return false;
        }
    }

    public static void rejectCall(Context context) {
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                ITelephony.Stub.asInterface((IBinder) Class.forName("android.os.ServiceManager").getMethod("getService", String.class).invoke(null, "phone")).endCall();
                return;
            } catch (Exception e8) {
                e8.printStackTrace();
                return;
            }
        }
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        try {
            Method declaredMethod = TelephonyManager.class.getDeclaredMethod("getITelephony", null);
            declaredMethod.setAccessible(true);
            ((ITelephony) declaredMethod.invoke(telephonyManager, null)).endCall();
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }
}
