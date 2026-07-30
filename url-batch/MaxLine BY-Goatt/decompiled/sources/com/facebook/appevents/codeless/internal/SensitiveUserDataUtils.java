package com.facebook.appevents.codeless.internal;

import android.text.method.PasswordTransformationMethod;
import android.util.Patterns;
import android.view.View;
import android.widget.TextView;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.google.firebase.encoders.json.BuildConfig;
import kotlin.text.Regex;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class SensitiveUserDataUtils {
    public static final SensitiveUserDataUtils INSTANCE = new SensitiveUserDataUtils();

    private SensitiveUserDataUtils() {
    }

    private final boolean isCreditCard(TextView textView) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            String replace = new Regex("\\s").replace(ViewHierarchy.getTextOfView(textView), BuildConfig.FLAVOR);
            int length = replace.length();
            if (length >= 12 && length <= 19) {
                int i = 0;
                boolean z = false;
                for (int i2 = length - 1; -1 < i2; i2--) {
                    char charAt = replace.charAt(i2);
                    if (!Character.isDigit(charAt)) {
                        return false;
                    }
                    int digit = Character.digit((int) charAt, 10);
                    if (digit < 0) {
                        throw new IllegalArgumentException("Char " + charAt + " is not a decimal digit");
                    }
                    if (z && (digit = digit * 2) > 9) {
                        digit = (digit % 10) + 1;
                    }
                    i += digit;
                    z = !z;
                }
                if (i % 10 == 0) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    private final boolean isEmail(TextView textView) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            if (textView.getInputType() == 32) {
                return true;
            }
            String textOfView = ViewHierarchy.getTextOfView(textView);
            if (textOfView != null && textOfView.length() != 0) {
                return Patterns.EMAIL_ADDRESS.matcher(textOfView).matches();
            }
            return false;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    private final boolean isPassword(TextView textView) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            if (textView.getInputType() == 128) {
                return true;
            }
            return textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    private final boolean isPersonName(TextView textView) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            return textView.getInputType() == 96;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    private final boolean isPhoneNumber(TextView textView) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            return textView.getInputType() == 3;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    private final boolean isPostalAddress(TextView textView) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            return textView.getInputType() == 112;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    public static final boolean isSensitiveUserData(View view) {
        if (CrashShieldHandler.isObjectCrashing(SensitiveUserDataUtils.class)) {
            return false;
        }
        try {
            if (!(view instanceof TextView)) {
                return false;
            }
            SensitiveUserDataUtils sensitiveUserDataUtils = INSTANCE;
            if (sensitiveUserDataUtils.isPassword((TextView) view) || sensitiveUserDataUtils.isCreditCard((TextView) view) || sensitiveUserDataUtils.isPersonName((TextView) view) || sensitiveUserDataUtils.isPostalAddress((TextView) view) || sensitiveUserDataUtils.isPhoneNumber((TextView) view)) {
                return true;
            }
            return sensitiveUserDataUtils.isEmail((TextView) view);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, SensitiveUserDataUtils.class);
            return false;
        }
    }
}
