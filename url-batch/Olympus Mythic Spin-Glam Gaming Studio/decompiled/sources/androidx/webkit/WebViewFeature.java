package androidx.webkit;

import androidx.annotation.RestrictTo;
import androidx.webkit.internal.WebViewFeatureInternal;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* loaded from: classes3.dex */
public class WebViewFeature {

    @Target({ElementType.PARAMETER, ElementType.METHOD})
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface WebViewStartupFeature {
    }

    @Target({ElementType.PARAMETER, ElementType.METHOD})
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface WebViewSupportFeature {
    }

    public static boolean isFeatureSupported(String str) {
        return WebViewFeatureInternal.isSupported(str);
    }
}
