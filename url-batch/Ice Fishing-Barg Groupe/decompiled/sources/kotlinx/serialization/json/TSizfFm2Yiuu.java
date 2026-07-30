package kotlinx.serialization.json;

import defpackage.cs0;
import defpackage.fu0;
import defpackage.h42;
import defpackage.wnqUPcAvl7HT;
import defpackage.zk;
import defpackage.zt0;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
@h42(with = zt0.class)
/* loaded from: classes.dex */
public final class TSizfFm2Yiuu extends lS5Rgt96tfkO implements Map<String, lS5Rgt96tfkO>, fu0 {
    public static final JsonObject$Companion Companion = new JsonObject$Companion();
    public final Map rtx2ld2ELZv4;

    public TSizfFm2Yiuu(Map map) {
        map.getClass();
        this.rtx2ld2ELZv4 = map;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ lS5Rgt96tfkO compute(String str, BiFunction<? super String, ? super lS5Rgt96tfkO, ? extends lS5Rgt96tfkO> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ lS5Rgt96tfkO computeIfAbsent(String str, Function<? super String, ? extends lS5Rgt96tfkO> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ lS5Rgt96tfkO computeIfPresent(String str, BiFunction<? super String, ? super lS5Rgt96tfkO, ? extends lS5Rgt96tfkO> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return this.rtx2ld2ELZv4.containsKey((String) obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (!(obj instanceof lS5Rgt96tfkO)) {
            return false;
        }
        return this.rtx2ld2ELZv4.containsValue((lS5Rgt96tfkO) obj);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<String, lS5Rgt96tfkO>> entrySet() {
        return this.rtx2ld2ELZv4.entrySet();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return cs0.wdg6QnbFHrFF(this.rtx2ld2ELZv4, obj);
    }

    @Override // java.util.Map
    public final lS5Rgt96tfkO get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return (lS5Rgt96tfkO) this.rtx2ld2ELZv4.get((String) obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.rtx2ld2ELZv4.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.rtx2ld2ELZv4.isEmpty();
    }

    @Override // java.util.Map
    public final Set<String> keySet() {
        return this.rtx2ld2ELZv4.keySet();
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ lS5Rgt96tfkO merge(String str, lS5Rgt96tfkO ls5rgt96tfko, BiFunction<? super lS5Rgt96tfkO, ? super lS5Rgt96tfkO, ? extends lS5Rgt96tfkO> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ lS5Rgt96tfkO put(String str, lS5Rgt96tfkO ls5rgt96tfko) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends String, ? extends lS5Rgt96tfkO> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ lS5Rgt96tfkO putIfAbsent(String str, lS5Rgt96tfkO ls5rgt96tfko) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final lS5Rgt96tfkO remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ lS5Rgt96tfkO replace(String str, lS5Rgt96tfkO ls5rgt96tfko) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction<? super String, ? super lS5Rgt96tfkO, ? extends lS5Rgt96tfkO> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.rtx2ld2ELZv4.size();
    }

    public final String toString() {
        return zk.ctD2u3GUHhtA(this.rtx2ld2ELZv4.entrySet(), ",", "{", "}", new wnqUPcAvl7HT(29), 24);
    }

    @Override // java.util.Map
    public final Collection<lS5Rgt96tfkO> values() {
        return this.rtx2ld2ELZv4.values();
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ boolean replace(String str, lS5Rgt96tfkO ls5rgt96tfko, lS5Rgt96tfkO ls5rgt96tfko2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
