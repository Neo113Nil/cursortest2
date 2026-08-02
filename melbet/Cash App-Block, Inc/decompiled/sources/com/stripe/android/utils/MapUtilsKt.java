package com.stripe.android.utils;

import com.google.android.gms.internal.mlkit_vision_text_common.zzu;
import com.google.common.collect.Lists$TransformingRandomAccessList;
import com.google.common.collect.Lists$TransformingSequentialList;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import kotlin.Pair;
import kotlin.collections.MapsKt__MapsKt;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes4.dex */
public abstract class MapUtilsKt {
    public static final Map filterNotNullValues(Map map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            Pair pair = value != null ? new Pair(key, value) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        return MapsKt__MapsKt.toMap(arrayList);
    }

    public static final float readFloat32LE(InputStream inputStream) {
        inputStream.getClass();
        byte[] bArr = new byte[4];
        inputStream.read(bArr, 0, 4);
        return ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).getFloat();
    }

    public static final long readUIntLE(InputStream inputStream) {
        inputStream.getClass();
        inputStream.getClass();
        return (((inputStream.read() & 255) << 24) | (inputStream.read() & 255) | ((inputStream.read() & 255) << 8) | ((inputStream.read() & 255) << 16)) & BodyPartID.bodyIdMax;
    }

    public static AbstractList zza(List list, zzu zzuVar) {
        return list instanceof RandomAccess ? new Lists$TransformingRandomAccessList(list, zzuVar) : new Lists$TransformingSequentialList(list, zzuVar);
    }
}
