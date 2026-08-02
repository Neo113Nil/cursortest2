package defpackage;

import android.content.Context;
import android.hardware.biometrics.BiometricManager;
import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.util.Log;
import com.google.android.apps.authenticator2.R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pb {
    public final BiometricManager a;
    public final brn b;
    private Boolean c = null;
    private final xi d;

    public pb(brn brnVar) {
        this.b = brnVar;
        this.a = Build.VERSION.SDK_INT >= 29 ? ow.d((Context) brnVar.a) : null;
        this.d = Build.VERSION.SDK_INT <= 29 ? new xi((Context) brnVar.a) : null;
    }

    public static pb b(Context context) {
        return new pb(new brn(context, (byte[]) null));
    }

    private final int d() {
        xi xiVar = this.d;
        if (xiVar == null) {
            Log.e("BiometricManager", "Failure in canAuthenticate(). FingerprintManager was null.");
            return 1;
        }
        if (xiVar.b()) {
            return !xiVar.a() ? 11 : 0;
        }
        return 12;
    }

    private final int e() {
        return !this.b.V() ? d() : d() == 0 ? 0 : -1;
    }

    private final int f() {
        BiometricManager biometricManager = this.a;
        if (biometricManager != null) {
            return ow.c(biometricManager);
        }
        Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
        return 1;
    }

    public final int a(int i) {
        BiometricPrompt.CryptoObject f;
        c();
        if (Build.VERSION.SDK_INT >= 30) {
            BiometricManager biometricManager = this.a;
            if (biometricManager == null) {
                Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
                return 1;
            }
            int a = ox.a(biometricManager, i);
            if (a == 7) {
                return 0;
            }
            if (a != 21) {
                return a;
            }
            return 1;
        }
        if (!pj.e(i)) {
            return -2;
        }
        brn brnVar = this.b;
        if (oy.h((Context) brnVar.a) == null) {
            return 12;
        }
        if (pj.c(i)) {
            return !brnVar.V() ? 11 : 0;
        }
        if (Build.VERSION.SDK_INT != 29) {
            if (Build.VERSION.SDK_INT != 28) {
                return d();
            }
            if (this.b.W()) {
                return e();
            }
            return 12;
        }
        if (pj.f(i)) {
            return f();
        }
        Method e = ow.e();
        if (e != null && (f = ow.f(ow.g())) != null) {
            try {
                Object invoke = Build.VERSION.SDK_INT == 29 ? e.invoke(this.a, f) : null;
                if (invoke instanceof Integer) {
                    return ((Integer) invoke).intValue();
                }
                Log.w("BiometricManager", "Invalid return type for canAuthenticate(CryptoObject).");
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
                Log.w("BiometricManager", "Failed to invoke canAuthenticate(CryptoObject).", e2);
            }
        }
        int f2 = f();
        return ((Build.VERSION.SDK_INT < 30 && ox.e((Context) this.b.a, Build.MODEL, R.array.assume_strong_biometrics_models)) || f2 != 0) ? f2 : e();
    }

    public final boolean c() {
        Boolean bool;
        BiometricManager biometricManager;
        Boolean bool2 = this.c;
        if (bool2 != null) {
            return bool2.booleanValue();
        }
        if (Build.VERSION.SDK_INT < 35 || (biometricManager = this.a) == null) {
            bool = false;
            this.c = bool;
        } else {
            try {
                ox.a(biometricManager, 65536);
                bool = true;
                this.c = bool;
            } catch (SecurityException unused) {
                bool = false;
                this.c = bool;
            }
        }
        return bool.booleanValue();
    }
}
