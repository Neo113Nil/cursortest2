package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public final class es<E> implements Iterable<E> {

    /* renamed from: b, reason: collision with root package name */
    private final Object f25402b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap f25403c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private Set<E> f25404d = Collections.EMPTY_SET;

    /* renamed from: e, reason: collision with root package name */
    private List<E> f25405e = Collections.EMPTY_LIST;

    public final void a(E e4) {
        synchronized (this.f25402b) {
            try {
                ArrayList arrayList = new ArrayList(this.f25405e);
                arrayList.add(e4);
                this.f25405e = Collections.unmodifiableList(arrayList);
                Integer num = (Integer) this.f25403c.get(e4);
                if (num == null) {
                    HashSet hashSet = new HashSet(this.f25404d);
                    hashSet.add(e4);
                    this.f25404d = Collections.unmodifiableSet(hashSet);
                }
                this.f25403c.put(e4, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int b(E e4) {
        int intValue;
        synchronized (this.f25402b) {
            try {
                intValue = this.f25403c.containsKey(e4) ? ((Integer) this.f25403c.get(e4)).intValue() : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return intValue;
    }

    public final void c(E e4) {
        synchronized (this.f25402b) {
            try {
                Integer num = (Integer) this.f25403c.get(e4);
                if (num == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList(this.f25405e);
                arrayList.remove(e4);
                this.f25405e = Collections.unmodifiableList(arrayList);
                if (num.intValue() == 1) {
                    this.f25403c.remove(e4);
                    HashSet hashSet = new HashSet(this.f25404d);
                    hashSet.remove(e4);
                    this.f25404d = Collections.unmodifiableSet(hashSet);
                } else {
                    this.f25403c.put(e4, Integer.valueOf(num.intValue() - 1));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Iterable
    public final Iterator<E> iterator() {
        Iterator<E> it;
        synchronized (this.f25402b) {
            it = this.f25405e.iterator();
        }
        return it;
    }

    public final Set<E> a() {
        Set<E> set;
        synchronized (this.f25402b) {
            set = this.f25404d;
        }
        return set;
    }
}
