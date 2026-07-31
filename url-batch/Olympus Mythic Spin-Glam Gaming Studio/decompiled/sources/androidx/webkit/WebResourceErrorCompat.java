package androidx.webkit;

import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes12.dex */
public abstract class WebResourceErrorCompat {

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface NetErrorCode {
    }

    public abstract CharSequence getDescription();

    public abstract int getErrorCode();
}
