package kotlin.reflect.jvm.internal.impl.km.jvm.internal;

import kotlin.Metadata;
import kotlin.reflect.jvm.internal.impl.km.InconsistentKotlinMetadataException;

/* loaded from: classes9.dex */
public final class JvmExceptionUtilsKt {
    public static final String[] requireNotEmpty(Metadata metadata) {
        metadata.getClass();
        String[] d1 = metadata.d1();
        if (d1.length == 0) {
            d1 = null;
        }
        if (d1 != null) {
            return d1;
        }
        throw new InconsistentKotlinMetadataException("Metadata is missing: kotlin.Metadata.data1 must not be an empty array", null, 2, null);
    }
}
