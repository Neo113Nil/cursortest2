package kotlin.reflect.jvm.internal;

import kotlin.Result;

/* loaded from: classes3.dex */
public abstract class SystemPropertiesKt {
    public static final boolean loadMetadataDirectly;
    public static final boolean newFakeOverridesImplementation;
    public static final boolean useK1Implementation;

    static {
        Object failure;
        Object failure2;
        Object failure3;
        try {
            Result.Companion companion = Result.Companion;
            failure = System.getProperty("kotlin.reflect.jvm.useK1Implementation");
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        String str = (String) failure;
        boolean z = false;
        useK1Implementation = str != null && Boolean.parseBoolean(str);
        try {
            failure2 = System.getProperty("kotlin.reflect.jvm.newFakeOverridesImplementation");
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.Companion;
            failure2 = new Result.Failure(th2);
        }
        if (failure2 instanceof Result.Failure) {
            failure2 = null;
        }
        String str2 = (String) failure2;
        newFakeOverridesImplementation = str2 != null && Boolean.parseBoolean(str2);
        try {
            failure3 = System.getProperty("kotlin.reflect.jvm.loadMetadataDirectly");
        } catch (Throwable th3) {
            Result.Companion companion4 = Result.Companion;
            failure3 = new Result.Failure(th3);
        }
        String str3 = (String) (failure3 instanceof Result.Failure ? null : failure3);
        if (str3 != null && Boolean.parseBoolean(str3)) {
            z = true;
        }
        loadMetadataDirectly = z;
    }
}
