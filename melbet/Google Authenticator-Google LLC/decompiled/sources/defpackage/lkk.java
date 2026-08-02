package defpackage;

import android.icu.text.IDNA;
import internal.org.jni_zero.JNINamespace;

/* compiled from: PG */
@JNINamespace("url::android")
/* loaded from: classes2.dex */
public final class lkk {
    public static final IDNA a;

    static {
        IDNA uTS46Instance;
        uTS46Instance = IDNA.getUTS46Instance(48);
        if (uTS46Instance == null) {
            throw new IllegalStateException("Failed to create IDNA instance");
        }
        a = uTS46Instance;
    }
}
