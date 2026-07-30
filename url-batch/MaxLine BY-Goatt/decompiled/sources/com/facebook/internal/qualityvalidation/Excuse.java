package com.facebook.internal.qualityvalidation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
@Target({})
@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes.dex */
public @interface Excuse {
    String reason();

    String type();
}
