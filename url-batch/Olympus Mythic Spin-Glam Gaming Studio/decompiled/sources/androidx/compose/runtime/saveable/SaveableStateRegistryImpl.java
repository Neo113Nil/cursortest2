package androidx.compose.runtime.saveable;

import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: SaveableStateRegistry.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B9\u0012\u001c\u0010\u0002\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0018\u00010\u0003\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0007\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0006H\u0016J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0012\u001a\u00020\u0004H\u0016J \u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00042\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u000fH\u0016J\u001c\u0010\u0016\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00050\u0003H\u0016R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0002\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0018\u00010\fX\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\r\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u000f0\u000e\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Landroidx/compose/runtime/saveable/SaveableStateRegistryImpl;", "Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "restored", "", "", "", "", "canBeSaved", "Lkotlin/Function1;", "", "<init>", "(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)V", "Landroidx/collection/MutableScatterMap;", "valueProviders", "", "Lkotlin/Function0;", "value", "consumeRestored", "key", "registerProvider", "Landroidx/compose/runtime/saveable/SaveableStateRegistry$Entry;", "valueProvider", "performSave", "runtime-saveable"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class SaveableStateRegistryImpl implements SaveableStateRegistry {
    private final Function1 canBeSaved;
    private final MutableScatterMap restored;
    private MutableScatterMap valueProviders;

    public SaveableStateRegistryImpl(Map map, Function1 function1) {
        this.canBeSaved = function1;
        this.restored = (map == null || map.isEmpty()) ? null : SaveableStateRegistryKt.toMutableScatterMap(map);
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public boolean canBeSaved(Object value) {
        return ((Boolean) this.canBeSaved.invoke(value)).booleanValue();
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public Object consumeRestored(String key) {
        MutableScatterMap mutableScatterMap;
        MutableScatterMap mutableScatterMap2 = this.restored;
        List list = mutableScatterMap2 != null ? (List) mutableScatterMap2.remove(key) : null;
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return null;
        }
        if (list.size() > 1 && (mutableScatterMap = this.restored) != null) {
        }
        return list.get(0);
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public SaveableStateRegistry.Entry registerProvider(final String key, final Function0 valueProvider) {
        boolean fastIsBlank;
        fastIsBlank = SaveableStateRegistryKt.fastIsBlank(key);
        if (fastIsBlank) {
            throw new IllegalArgumentException("Registered key is empty or blank");
        }
        final MutableScatterMap mutableScatterMap = this.valueProviders;
        if (mutableScatterMap == null) {
            mutableScatterMap = ScatterMapKt.mutableScatterMapOf();
            this.valueProviders = mutableScatterMap;
        }
        Object obj = mutableScatterMap.get(key);
        if (obj == null) {
            obj = new ArrayList();
            mutableScatterMap.set(key, obj);
        }
        ((List) obj).add(valueProvider);
        return new SaveableStateRegistry.Entry() { // from class: androidx.compose.runtime.saveable.SaveableStateRegistryImpl$registerProvider$3
            @Override // androidx.compose.runtime.saveable.SaveableStateRegistry.Entry
            public void unregister() {
                List list = (List) MutableScatterMap.this.remove(key);
                if (list != null) {
                    list.remove(valueProvider);
                }
                List list2 = list;
                if (list2 == null || list2.isEmpty()) {
                    return;
                }
                MutableScatterMap.this.set(key, list);
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x009e  */
    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Map performSave() {
        HashMap hashMap;
        MutableScatterMap mutableScatterMap;
        long[] jArr;
        int i;
        long[] jArr2;
        int i2;
        HashMap hashMap2;
        MutableScatterMap mutableScatterMap2 = this.restored;
        if (mutableScatterMap2 == null && this.valueProviders == null) {
            return MapsKt.emptyMap();
        }
        int i3 = mutableScatterMap2 != null ? mutableScatterMap2.get_size() : 0;
        MutableScatterMap mutableScatterMap3 = this.valueProviders;
        HashMap hashMap3 = new HashMap(i3 + (mutableScatterMap3 != null ? mutableScatterMap3.get_size() : 0));
        MutableScatterMap mutableScatterMap4 = this.restored;
        long j = 255;
        char c = 7;
        long j2 = -9187201950435737472L;
        int i4 = 8;
        if (mutableScatterMap4 != null) {
            Object[] objArr = mutableScatterMap4.keys;
            Object[] objArr2 = mutableScatterMap4.values;
            long[] jArr3 = mutableScatterMap4.metadata;
            int length = jArr3.length - 2;
            if (length >= 0) {
                HashMap hashMap4 = hashMap3;
                int i5 = 0;
                while (true) {
                    long j3 = jArr3[i5];
                    if ((((~j3) << 7) & j3 & j2) != j2) {
                        int i6 = 8 - ((~(i5 - length)) >>> 31);
                        int i7 = 0;
                        while (i7 < i6) {
                            if ((j3 & j) < 128) {
                                int i8 = (i5 << 3) + i7;
                                hashMap2 = hashMap4;
                                hashMap2.put((String) objArr[i8], (List) objArr2[i8]);
                            } else {
                                hashMap2 = hashMap4;
                            }
                            j3 >>= 8;
                            i7++;
                            hashMap4 = hashMap2;
                            j = 255;
                        }
                        hashMap = hashMap4;
                        if (i6 != 8) {
                            break;
                        }
                    } else {
                        hashMap = hashMap4;
                    }
                    if (i5 == length) {
                        break;
                    }
                    i5++;
                    hashMap4 = hashMap;
                    j = 255;
                    j2 = -9187201950435737472L;
                }
                mutableScatterMap = this.valueProviders;
                if (mutableScatterMap != null) {
                    Object[] objArr3 = mutableScatterMap.keys;
                    Object[] objArr4 = mutableScatterMap.values;
                    long[] jArr4 = mutableScatterMap.metadata;
                    int length2 = jArr4.length - 2;
                    if (length2 >= 0) {
                        int i9 = 0;
                        while (true) {
                            long j4 = jArr4[i9];
                            if ((((~j4) << c) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i10 = 8 - ((~(i9 - length2)) >>> 31);
                                int i11 = 0;
                                while (i11 < i10) {
                                    if ((j4 & 255) < 128) {
                                        int i12 = (i9 << 3) + i11;
                                        Object obj = objArr3[i12];
                                        List list = (List) objArr4[i12];
                                        String str = (String) obj;
                                        if (list.size() == 1) {
                                            Object mo4828invoke = ((Function0) list.get(0)).mo4828invoke();
                                            if (mo4828invoke != null) {
                                                if (!canBeSaved(mo4828invoke)) {
                                                    throw new IllegalStateException(RememberSaveableKt.generateCannotBeSavedErrorMessage(mo4828invoke).toString());
                                                }
                                                hashMap.put(str, CollectionsKt.arrayListOf(mo4828invoke));
                                            }
                                            jArr2 = jArr4;
                                        } else {
                                            int size = list.size();
                                            ArrayList arrayList = new ArrayList(size);
                                            int i13 = 0;
                                            while (i13 < size) {
                                                long[] jArr5 = jArr4;
                                                Object mo4828invoke2 = ((Function0) list.get(i13)).mo4828invoke();
                                                if (mo4828invoke2 != null && !canBeSaved(mo4828invoke2)) {
                                                    throw new IllegalStateException(RememberSaveableKt.generateCannotBeSavedErrorMessage(mo4828invoke2).toString());
                                                }
                                                arrayList.add(mo4828invoke2);
                                                i13++;
                                                jArr4 = jArr5;
                                            }
                                            jArr2 = jArr4;
                                            hashMap.put(str, arrayList);
                                        }
                                        i2 = 8;
                                    } else {
                                        jArr2 = jArr4;
                                        i2 = i4;
                                    }
                                    j4 >>= i2;
                                    i11++;
                                    i4 = i2;
                                    jArr4 = jArr2;
                                }
                                jArr = jArr4;
                                i = i4;
                                if (i10 != i) {
                                    break;
                                }
                            } else {
                                jArr = jArr4;
                                i = i4;
                            }
                            if (i9 == length2) {
                                break;
                            }
                            i9++;
                            i4 = i;
                            jArr4 = jArr;
                            c = 7;
                        }
                    }
                }
                return hashMap;
            }
        }
        hashMap = hashMap3;
        mutableScatterMap = this.valueProviders;
        if (mutableScatterMap != null) {
        }
        return hashMap;
    }
}
