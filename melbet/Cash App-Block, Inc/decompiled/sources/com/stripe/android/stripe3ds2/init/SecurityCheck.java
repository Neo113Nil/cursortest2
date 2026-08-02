package com.stripe.android.stripe3ds2.init;

import android.os.Build;
import android.os.Debug;
import android.os.Environment;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.stripe.android.stripe3ds2.init.Warning;
import com.stripe.android.stripe3ds2.service.StripeThreeDs2ServiceImpl;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes8.dex */
public abstract class SecurityCheck {
    public final Warning warning;

    public final class DebuggerAttached extends SecurityCheck {
        public static final Warning WARNING = new Warning("SW04", "A debugger is attached to the App.", Warning.Severity.MEDIUM);
        public final boolean isDebuggerConnected;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DebuggerAttached() {
            super(WARNING);
            boolean isDebuggerConnected = Debug.isDebuggerConnected();
            this.isDebuggerConnected = isDebuggerConnected;
        }

        @Override // com.stripe.android.stripe3ds2.init.SecurityCheck
        public final boolean check() {
            return this.isDebuggerConnected;
        }
    }

    public final class Emulator extends SecurityCheck {
        public static final Warning WARNING = new Warning("SW02", "An emulator is being used to run the App.", Warning.Severity.HIGH);

        @Override // com.stripe.android.stripe3ds2.init.SecurityCheck
        public final boolean check() {
            String str = Build.FINGERPRINT;
            str.getClass();
            if (StringsKt__StringsJVMKt.startsWith(str, "generic", false) || StringsKt__StringsJVMKt.startsWith(str, "unknown", false)) {
                return true;
            }
            String str2 = Build.MODEL;
            str2.getClass();
            if (StringsKt.contains((CharSequence) str2, (CharSequence) "Emulator", false) || StringsKt.contains((CharSequence) str2, (CharSequence) "Android SDK built for x86", false) || StringsKt.contains((CharSequence) str2, (CharSequence) "google_sdk", false)) {
                return true;
            }
            String str3 = Build.MANUFACTURER;
            str3.getClass();
            if (StringsKt.contains((CharSequence) str3, (CharSequence) "Genymotion", false)) {
                return true;
            }
            String str4 = Build.BRAND;
            str4.getClass();
            if (StringsKt__StringsJVMKt.startsWith(str4, "generic", false)) {
                String str5 = Build.DEVICE;
                str5.getClass();
                if (StringsKt__StringsJVMKt.startsWith(str5, "generic", false)) {
                    return true;
                }
            }
            return "google_sdk".equals(Build.PRODUCT);
        }
    }

    public final class RootedCheck extends SecurityCheck {
        public static final List BINARY_PATHS = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"/sbin/", "/system/bin/", "/system/xbin/", "/data/local/xbin/", "/data/local/bin/", "/system/sd/xbin/", "/system/bin/failsafe/", "/data/local/"});
        public static final Warning WARNING = new Warning("SW01", "The device is jailbroken.", Warning.Severity.HIGH);

        @Override // com.stripe.android.stripe3ds2.init.SecurityCheck
        public final boolean check() {
            List list = BINARY_PATHS;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (new File(Recorder$$ExternalSyntheticOutline2.m$1((String) it.next(), "su")).exists()) {
                        return true;
                    }
                }
            }
            return new File(Recorder$$ExternalSyntheticOutline2.m$1(Environment.getRootDirectory().toString(), "/Superuser")).isDirectory();
        }
    }

    public final class Tampered extends SecurityCheck {
        public static final Warning WARNING = new Warning("SW02", "The integrity of the SDK has been tampered.", Warning.Severity.HIGH);

        @Override // com.stripe.android.stripe3ds2.init.SecurityCheck
        public final boolean check() {
            Field[] declaredFields = StripeThreeDs2ServiceImpl.class.getDeclaredFields();
            declaredFields.getClass();
            ArrayList arrayList = new ArrayList();
            for (Field field : declaredFields) {
                if (!field.isSynthetic()) {
                    arrayList.add(field);
                }
            }
            if (arrayList.size() != 8) {
                return true;
            }
            Method[] declaredMethods = StripeThreeDs2ServiceImpl.class.getDeclaredMethods();
            declaredMethods.getClass();
            ArrayList arrayList2 = new ArrayList();
            for (Method method : declaredMethods) {
                if (!method.isSynthetic()) {
                    arrayList2.add(method);
                }
            }
            return arrayList2.size() != 5;
        }
    }

    public final class UnsupportedOS extends SecurityCheck {
        public static final Warning WARNING = new Warning("SW05", "The OS or the OS version is not supported.", Warning.Severity.HIGH);

        @Override // com.stripe.android.stripe3ds2.init.SecurityCheck
        public final boolean check() {
            return false;
        }
    }

    public SecurityCheck(Warning warning) {
        this.warning = warning;
    }

    public abstract boolean check();
}
