package com.onesignal.common.modeling;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.z;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class h extends i implements Map, xd.e {
    public /* synthetic */ h(i iVar, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? null : iVar, (i3 & 2) != 0 ? null : str);
    }

    @Override // java.util.Map
    public void clear() {
        Iterator<String> it = getData().keySet().iterator();
        while (it.hasNext()) {
            i.setOptAnyProperty$default(this, it.next(), null, null, false, 12, null);
        }
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof String) {
            return containsKey((String) obj);
        }
        return false;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return getData().containsValue(obj);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<String, Object>> entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof String) {
            return get((String) obj);
        }
        return null;
    }

    public Set<Map.Entry<String, Object>> getEntries() {
        Set<Map.Entry<String, Object>> entrySet = getData().entrySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : entrySet) {
            if ((obj instanceof Map.Entry) && (!(obj instanceof xd.a) || (obj instanceof xd.d))) {
                arrayList.add(obj);
            }
        }
        return CollectionsKt.S(arrayList);
    }

    public Set<String> getKeys() {
        return getData().keySet();
    }

    public int getSize() {
        return getData().size();
    }

    public Collection<Object> getValues() {
        Collection<Object> values = getData().values();
        ArrayList arrayList = new ArrayList(z.j(values, 10));
        Iterator<T> it = values.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return new ArrayList(arrayList);
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return getData().isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<String> keySet() {
        return getKeys();
    }

    @Override // java.util.Map
    public Object put(String str, Object obj) {
        str.getClass();
        i.setOptAnyProperty$default(this, str, obj, null, false, 12, null);
        return obj;
    }

    @Override // java.util.Map
    public void putAll(Map<? extends String, Object> map) {
        map.getClass();
        for (Map.Entry<? extends String, Object> entry : map.entrySet()) {
            i.setOptAnyProperty$default(this, entry.getKey(), entry.getValue(), null, false, 12, null);
        }
    }

    public Object remove(String str) {
        str.getClass();
        Object optAnyProperty$default = i.getOptAnyProperty$default(this, str, null, 2, null);
        i.setOptAnyProperty$default(this, str, null, null, false, 12, null);
        return optAnyProperty$default;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<Object> values() {
        return getValues();
    }

    public boolean containsKey(String str) {
        str.getClass();
        return getData().containsKey(str);
    }

    public Object get(String str) {
        str.getClass();
        return i.getOptAnyProperty$default(this, str, null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public h(i iVar, String str) {
        super(iVar, str);
    }

    @Override // java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof String) {
            return remove((String) obj);
        }
        return null;
    }
}
