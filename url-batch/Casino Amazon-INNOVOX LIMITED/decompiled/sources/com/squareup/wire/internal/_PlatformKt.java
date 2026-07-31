package com.squareup.wire.internal;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: -Platform.kt */
@Metadata(d1 = {"\u0000T\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010%\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u001a\u001f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00100\u000f\"\u0004\b\u0000\u0010\u0010*\b\u0012\u0004\u0012\u0002H\u00100\u0011H\u0086\b\u001a1\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u0002H\u0014\u0012\u0004\u0012\u0002H\u00150\u0013\"\u0004\b\u0000\u0010\u0014\"\u0004\b\u0001\u0010\u0015*\u000e\u0012\u0004\u0012\u0002H\u0014\u0012\u0004\u0012\u0002H\u00150\u0016H\u0086\b\u001a\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u001b*\n\u0010\u0000\"\u00020\u00012\u00020\u0001*\n\u0010\u0002\"\u00020\u00032\u00020\u0003*\n\u0010\u0004\"\u00020\u00052\u00020\u0005*\n\u0010\u0006\"\u00020\u00072\u00020\u0007*\n\u0010\b\"\u00020\t2\u00020\t*\n\u0010\n\"\u00020\u000b2\u00020\u000b*\n\u0010\f\"\u00020\r2\u00020\r¨\u0006\u001c"}, d2 = {"Serializable", "Ljava/io/Serializable;", "JvmDefaultWithCompatibility", "Lkotlin/jvm/JvmDefaultWithCompatibility;", "JvmField", "Lkotlin/jvm/JvmField;", "JvmSynthetic", "Lkotlin/jvm/JvmSynthetic;", "JvmStatic", "Lkotlin/jvm/JvmStatic;", "ObjectStreamException", "Ljava/io/ObjectStreamException;", "ProtocolException", "Ljava/net/ProtocolException;", "toUnmodifiableList", "", "T", "", "toUnmodifiableMap", "", "K", "V", "", "camelCase", "", TypedValues.Custom.S_STRING, "upperCamel", "", "wire-runtime"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class _PlatformKt {
    public static final <T> List<T> toUnmodifiableList(List<T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<T> unmodifiableList = Collections.unmodifiableList(list);
        Intrinsics.checkNotNullExpressionValue(unmodifiableList, "unmodifiableList(...)");
        return unmodifiableList;
    }

    public static final <K, V> Map<K, V> toUnmodifiableMap(Map<K, V> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Map<K, V> unmodifiableMap = Collections.unmodifiableMap(map);
        Intrinsics.checkNotNullExpressionValue(unmodifiableMap, "unmodifiableMap(...)");
        return unmodifiableMap;
    }

    public static /* synthetic */ String camelCase$default(String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return camelCase(str, z);
    }

    public static final String camelCase(String string, boolean z) {
        Intrinsics.checkNotNullParameter(string, "string");
        StringBuilder sb = new StringBuilder(string.length());
        int i = 0;
        while (i < string.length()) {
            int codePointAt = string.codePointAt(i);
            i += Character.charCount(codePointAt);
            if (codePointAt == 95) {
                z = true;
            } else {
                if (z && 97 <= codePointAt && codePointAt < 123) {
                    codePointAt -= 32;
                }
                sb.appendCodePoint(codePointAt);
                z = false;
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }
}
