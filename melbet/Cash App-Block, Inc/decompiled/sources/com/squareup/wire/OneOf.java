package com.squareup.wire;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptyList;

/* loaded from: classes4.dex */
public abstract class OneOf {
    public static byte[] concat(byte[]... bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            for (byte[] bArr2 : bArr) {
                if (bArr2 != null) {
                    byteArrayOutputStream.write(bArr2);
                }
            }
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            a$$ExternalSyntheticBUOutline0.m(e.getMessage(), e);
            return null;
        }
    }

    public static byte[] subArray(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    public static Object unwrapNestedValue(List list) {
        Object unwrapNestedValue;
        Object firstOrNull = CollectionsKt.firstOrNull((List<? extends Object>) list);
        if (firstOrNull instanceof List) {
            List list2 = (List) firstOrNull;
            return (list2.size() <= 1 && (unwrapNestedValue = unwrapNestedValue(list2)) != null) ? unwrapNestedValue : list2;
        }
        if (CollectionsKt__CollectionsKt.listOf(null, "", EmptyList.INSTANCE).contains(firstOrNull)) {
            return null;
        }
        return firstOrNull;
    }
}
