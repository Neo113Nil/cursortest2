package io.ktor.util.collections;

import androidx.exifinterface.media.ExifInterface;
import io.ktor.util.InternalAPI;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CopyOnWriteHashMap.kt */
@InternalAPI
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J8\u0010\t\u001a\u00028\u00012\u0006\u0010\u0004\u001a\u00028\u00002!\u0010\b\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0004\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\r\u001a\u00028\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\fJ \u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\r\u001a\u00028\u0001H\u0086\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lio/ktor/util/collections/CopyOnWriteHashMap;", "", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "key", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "producer", "computeIfAbsent", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "value", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove", "", "set", "(Ljava/lang/Object;Ljava/lang/Object;)V", "<init>", "()V", "ktor-utils"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CopyOnWriteHashMap<K, V> {
    private static final /* synthetic */ AtomicReferenceFieldUpdater current$FU = AtomicReferenceFieldUpdater.newUpdater(CopyOnWriteHashMap.class, Object.class, "current");
    private volatile /* synthetic */ Object current = MapsKt.emptyMap();

    public final V put(K key, V value) {
        Map map;
        HashMap hashMap;
        V v;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        do {
            map = (Map) this.current;
            if (map.get(key) == value) {
                return value;
            }
            hashMap = new HashMap(map);
            v = (V) hashMap.put(key, value);
        } while (!UByte$$ExternalSyntheticBackport0.m(current$FU, this, map, hashMap));
        return v;
    }

    public final V get(K key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (V) ((Map) this.current).get(key);
    }

    public final void set(K key, V value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        put(key, value);
    }

    public final V remove(K key) {
        Map map;
        HashMap hashMap;
        V v;
        Intrinsics.checkNotNullParameter(key, "key");
        do {
            map = (Map) this.current;
            if (map.get(key) == null) {
                return null;
            }
            hashMap = new HashMap(map);
            v = (V) hashMap.remove(key);
        } while (!UByte$$ExternalSyntheticBackport0.m(current$FU, this, map, hashMap));
        return v;
    }

    public final V computeIfAbsent(K key, Function1<? super K, ? extends V> producer) {
        Map map;
        HashMap hashMap;
        V invoke;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(producer, "producer");
        do {
            map = (Map) this.current;
            V v = (V) map.get(key);
            if (v != null) {
                return v;
            }
            hashMap = new HashMap(map);
            invoke = producer.invoke(key);
            hashMap.put(key, invoke);
        } while (!UByte$$ExternalSyntheticBackport0.m(current$FU, this, map, hashMap));
        return invoke;
    }
}
