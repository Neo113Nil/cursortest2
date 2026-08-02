package org.chromium.support_lib_boundary;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public interface PrefetchOperationCallbackBoundaryInterface extends FeatureFlagHolderBoundaryInterface {

    @Retention(RetentionPolicy.SOURCE)
    public @interface PrefetchExceptionTypeBoundaryInterface {
        public static final int GENERIC = 0;
        public static final int NETWORK = 1;
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface PrefetchResultTypeBoundaryInterface {
        public static final int DUPLICATE = 1;
        public static final int SUCCESS = 0;
    }

    void onFailure(int i4, String str, int i5);

    void onResult(int i4);

    @Deprecated
    default void onSuccess() {
        throw new UnsupportedOperationException("http://crbug.com/483041824 Replaced by onResult.");
    }
}
