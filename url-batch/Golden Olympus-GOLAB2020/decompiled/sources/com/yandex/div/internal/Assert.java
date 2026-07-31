package com.yandex.div.internal;

import android.os.Looper;
import androidx.annotation.NonNull;
import com.yandex.div.internal.Assert;

/* loaded from: classes2.dex */
public abstract class Assert {

    @NonNull
    private static AssertionErrorHandler sAssertionErrorHandler = new AssertionErrorHandler() { // from class: F1.a
        @Override // com.yandex.div.internal.AssertionErrorHandler
        public final void handleError(AssertionError assertionError) {
            Assert.a(assertionError);
        }
    };
    private static volatile boolean sEnabled = false;

    public static void assertEquals(String str, Object obj, Object obj2) {
        if (obj == null && obj2 == null) {
            return;
        }
        if (obj == null || !obj.equals(obj2)) {
            if (!(obj instanceof String) || !(obj2 instanceof String)) {
                failNotEquals(str, obj, obj2);
                return;
            }
            if (str == null) {
                str = "";
            }
            performFail(new ComparisonFailure(str, (String) obj, (String) obj2));
        }
    }

    public static void assertMainThread() {
        assertSame("Code run not in main thread!", Looper.getMainLooper(), Looper.myLooper());
    }

    public static void assertNull(String str, Object obj) {
        assertTrue(str, obj == null);
    }

    public static void assertSame(String str, Object obj, Object obj2) {
        if (obj == obj2) {
            return;
        }
        failNotSame(str, obj, obj2);
    }

    public static void assertTrue(String str, boolean z4) {
        if (z4) {
            return;
        }
        fail(str);
    }

    public static void fail(String str) {
        if (sEnabled) {
            if (str == null) {
                str = "";
            }
            performFail(new AssertionError(str));
        }
    }

    private static void failNotEquals(String str, Object obj, Object obj2) {
        fail(format(str, obj, obj2));
    }

    private static void failNotSame(String str, Object obj, Object obj2) {
        String str2;
        if (str != null) {
            str2 = str + " ";
        } else {
            str2 = "";
        }
        fail(str2 + "expected same:<" + obj + "> was not:<" + obj2 + ">");
    }

    static String format(String str, Object obj, Object obj2) {
        String str2 = "";
        if (str != null && !str.equals("")) {
            str2 = str + " ";
        }
        String valueOf = String.valueOf(obj);
        String valueOf2 = String.valueOf(obj2);
        if (valueOf.equals(valueOf2)) {
            return str2 + "expected: " + formatClassAndValue(obj, valueOf) + " but was: " + formatClassAndValue(obj2, valueOf2);
        }
        return str2 + "expected:<" + valueOf + "> but was:<" + valueOf2 + ">";
    }

    private static String formatClassAndValue(Object obj, String str) {
        return (obj == null ? "null" : obj.getClass().getName()) + "<" + str + ">";
    }

    public static boolean isEnabled() {
        return sEnabled;
    }

    private static void performFail(@NonNull AssertionError assertionError) {
        if (isEnabled()) {
            sAssertionErrorHandler.handleError(assertionError);
        }
    }

    public static void assertNull(Object obj) {
        assertNull(null, obj);
    }

    public static void assertTrue(boolean z4) {
        assertTrue(null, z4);
    }

    public static void fail(String str, Throwable th) {
        if (sEnabled) {
            AssertionError assertionError = new AssertionError(str);
            assertionError.initCause(th);
            performFail(assertionError);
        }
    }

    public static /* synthetic */ void a(AssertionError assertionError) {
        throw assertionError;
    }
}
