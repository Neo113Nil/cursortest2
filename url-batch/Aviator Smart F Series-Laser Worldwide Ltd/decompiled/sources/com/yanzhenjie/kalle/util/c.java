package com.yanzhenjie.kalle.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public class c {
    private Map<Object, List<Object>> mSource;

    public c(Map<Object, List<Object>> map) {
        this.mSource = map;
    }

    public void add(Object obj, Object obj2) {
        if (!this.mSource.containsKey(obj)) {
            this.mSource.put(obj, new ArrayList(1));
        }
        this.mSource.get(obj).add(obj2);
    }

    public void clear() {
        this.mSource.clear();
    }

    public boolean containsKey(Object obj) {
        return this.mSource.containsKey(obj);
    }

    public Set<Map.Entry<Object, List<Object>>> entrySet() {
        return this.mSource.entrySet();
    }

    public List<Object> get(Object obj) {
        return this.mSource.get(obj);
    }

    public Object getFirst(Object obj) {
        List<Object> list = this.mSource.get(obj);
        if (list == null || list.size() <= 0) {
            return null;
        }
        return list.get(0);
    }

    public boolean isEmpty() {
        return this.mSource.isEmpty();
    }

    public Set<Object> keySet() {
        return this.mSource.keySet();
    }

    public List<Object> remove(Object obj) {
        return this.mSource.remove(obj);
    }

    public void set(Object obj, Object obj2) {
        this.mSource.remove(obj);
        add(obj, obj2);
    }

    public int size() {
        return this.mSource.size();
    }

    public Map<Object, List<Object>> toMap() {
        return this.mSource;
    }

    public void set(Object obj, List<Object> list) {
        this.mSource.put(obj, list);
    }

    public void add(Object obj, List<Object> list) {
        Iterator<Object> it = list.iterator();
        while (it.hasNext()) {
            add(obj, it.next());
        }
    }
}
