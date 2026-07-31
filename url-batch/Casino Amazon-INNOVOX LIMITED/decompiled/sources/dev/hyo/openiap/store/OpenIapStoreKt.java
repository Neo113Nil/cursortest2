package dev.hyo.openiap.store;

import android.content.Context;
import android.util.Log;
import dev.hyo.openiap.OpenIapLog;
import dev.hyo.openiap.OpenIapProtocol;
import java.lang.reflect.Constructor;
import java.util.Locale;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OpenIapStore.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a$\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002\u001a\u0010\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\u0010\u0010\b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002¨\u0006\t"}, d2 = {"buildModule", "Ldev/hyo/openiap/OpenIapProtocol;", "context", "Landroid/content/Context;", "store", "", "appId", "loadHorizonModule", "loadPlayModule", "openiap_playRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OpenIapStoreKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final OpenIapProtocol buildModule(Context context, String str, String str2) {
        String str3 = "play";
        try {
            Object obj = Class.forName("io.github.hyochan.openiap.BuildConfig").getField("OPENIAP_STORE").get(null);
            String str4 = obj instanceof String ? (String) obj : null;
            if (str4 == null) {
                str4 = "play";
            }
            Log.i("OpenIapStore", "BuildConfig.OPENIAP_STORE = " + str4);
            str3 = str4;
        } catch (Throwable th) {
            Log.w("OpenIapStore", "Failed to read BuildConfig.OPENIAP_STORE: " + th.getMessage());
        }
        if (str == null) {
            str = str3;
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        Log.i("OpenIapStore", "buildModule: selected=" + lowerCase + ", defaultStore=" + str3);
        OpenIapLog.INSTANCE.d("buildModule: selected=" + lowerCase + ", defaultStore=" + str3, "OpenIapStore");
        int hashCode = lowerCase.hashCode();
        if (hashCode == 3347973 ? lowerCase.equals("meta") : hashCode == 107944162 ? lowerCase.equals("quest") : hashCode == 1097468315 && lowerCase.equals("horizon")) {
            OpenIapLog.INSTANCE.d("Loading OpenIapModule (Horizon flavor)", "OpenIapStore");
            return loadHorizonModule(context);
        }
        OpenIapLog.INSTANCE.d("Loading OpenIapModule (Play flavor)", "OpenIapStore");
        return loadPlayModule(context);
    }

    private static final OpenIapProtocol loadHorizonModule(Context context) {
        Object obj;
        try {
            Class<?> cls = Class.forName("dev.hyo.openiap.OpenIapModule");
            Class<?> cls2 = Class.forName("dev.hyo.openiap.AlternativeBillingMode");
            Constructor<?> constructor = cls.getConstructor(Context.class, cls2, Class.forName("dev.hyo.openiap.listener.UserChoiceBillingListener"));
            Object[] enumConstants = cls2.getEnumConstants();
            if (enumConstants != null) {
                int length = enumConstants.length;
                for (int i = 0; i < length; i++) {
                    obj = enumConstants[i];
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Enum<*>");
                    if (!Intrinsics.areEqual(((Enum) obj).name(), "NONE")) {
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
            obj = null;
            Object newInstance = constructor.newInstance(context, obj, null);
            Intrinsics.checkNotNull(newInstance, "null cannot be cast to non-null type dev.hyo.openiap.OpenIapProtocol");
            OpenIapProtocol openIapProtocol = (OpenIapProtocol) newInstance;
            OpenIapLog.INSTANCE.d("Successfully loaded OpenIapModule (Horizon flavor)", "OpenIapStore");
            return openIapProtocol;
        } catch (Throwable th) {
            throw new IllegalStateException("Failed to load OpenIapModule (Horizon flavor). Make sure you're using the Horizon flavor.", th);
        }
    }

    private static final OpenIapProtocol loadPlayModule(Context context) {
        Object obj;
        try {
            Class<?> cls = Class.forName("dev.hyo.openiap.OpenIapModule");
            Class<?> cls2 = Class.forName("dev.hyo.openiap.AlternativeBillingMode");
            Constructor<?> constructor = cls.getConstructor(Context.class, cls2, Class.forName("dev.hyo.openiap.listener.UserChoiceBillingListener"), Class.forName("dev.hyo.openiap.listener.DeveloperProvidedBillingListener"));
            Object[] enumConstants = cls2.getEnumConstants();
            if (enumConstants != null) {
                int length = enumConstants.length;
                for (int i = 0; i < length; i++) {
                    obj = enumConstants[i];
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Enum<*>");
                    if (!Intrinsics.areEqual(((Enum) obj).name(), "NONE")) {
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
            obj = null;
            Object newInstance = constructor.newInstance(context, obj, null, null);
            Intrinsics.checkNotNull(newInstance, "null cannot be cast to non-null type dev.hyo.openiap.OpenIapProtocol");
            return (OpenIapProtocol) newInstance;
        } catch (Throwable th) {
            throw new IllegalStateException("Failed to load OpenIapModule. Make sure you're using the Play flavor.", th);
        }
    }
}
