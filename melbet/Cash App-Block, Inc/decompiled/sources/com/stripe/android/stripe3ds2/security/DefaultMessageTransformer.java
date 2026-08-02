package com.stripe.android.stripe3ds2.security;

import com.nimbusds.jose.EncryptionMethod;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.Serializable;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import org.slf4j.Marker;

/* loaded from: classes8.dex */
public final class DefaultMessageTransformer implements Serializable {
    public static final EncryptionMethod ENCRYPTION_METHOD = EncryptionMethod.A128CBC_HS256;
    public final boolean isLiveMode;
    public byte counterSdkToAcs = 0;
    public byte counterAcsToSdk = 0;

    public DefaultMessageTransformer(boolean z) {
        this.isLiveMode = z;
    }

    public static boolean isValidPayloadPart(String str) {
        return (StringsKt__StringsJVMKt.endsWith(str, "=", false) || StringsKt.contains((CharSequence) str, (CharSequence) " ", false) || StringsKt.contains((CharSequence) str, (CharSequence) Marker.ANY_NON_NULL_MARKER, false) || StringsKt.contains((CharSequence) str, (CharSequence) "\n", false) || StringsKt.contains((CharSequence) str, (CharSequence) "/", false)) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DefaultMessageTransformer)) {
            return false;
        }
        DefaultMessageTransformer defaultMessageTransformer = (DefaultMessageTransformer) obj;
        return this.isLiveMode == defaultMessageTransformer.isLiveMode && this.counterSdkToAcs == defaultMessageTransformer.counterSdkToAcs && this.counterAcsToSdk == defaultMessageTransformer.counterAcsToSdk;
    }

    public final int hashCode() {
        return Byte.hashCode(this.counterAcsToSdk) + ((Byte.hashCode(this.counterSdkToAcs) + (Boolean.hashCode(this.isLiveMode) * 31)) * 31);
    }

    public final String toString() {
        byte b = this.counterSdkToAcs;
        byte b2 = this.counterAcsToSdk;
        StringBuilder sb = new StringBuilder("DefaultMessageTransformer(isLiveMode=");
        sb.append(this.isLiveMode);
        sb.append(", counterSdkToAcs=");
        sb.append((int) b);
        sb.append(", counterAcsToSdk=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(b2, ")", sb);
    }
}
