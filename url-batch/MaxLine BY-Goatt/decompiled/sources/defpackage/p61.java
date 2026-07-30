package defpackage;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes.dex */
public @interface p61 {
    boolean nullSafe() default true;

    Class value();
}
