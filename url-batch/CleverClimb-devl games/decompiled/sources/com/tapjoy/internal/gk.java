package com.tapjoy.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Observable;

/* loaded from: classes.dex */
public class gk extends Observable {

    /* renamed from: b, reason: collision with root package name */
    public final List f8204b = new ArrayList();

    /* loaded from: classes2.dex */
    public class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f8205a;

        /* renamed from: b, reason: collision with root package name */
        public volatile Map f8206b;

        a(String str) {
            this.f8205a = str;
        }

        public final Object a(String str) {
            Map map = this.f8206b;
            if (map != null) {
                return map.get(str);
            }
            return null;
        }
    }

    protected final a a(String str) {
        a aVar = new a(str);
        this.f8204b.add(aVar);
        return aVar;
    }

    @Override // java.util.Observable
    protected void setChanged() {
        super.setChanged();
        notifyObservers();
    }

    public final boolean b(String str) {
        return a(str, false);
    }

    public final boolean a(String str, boolean z) {
        Iterator it = this.f8204b.iterator();
        while (it.hasNext()) {
            Object a2 = ((a) it.next()).a(str);
            if (a2 != null) {
                if (a2 instanceof Boolean) {
                    return ((Boolean) a2).booleanValue();
                }
                if (!(a2 instanceof String)) {
                    continue;
                } else {
                    if ("true".equals(a2)) {
                        return true;
                    }
                    if ("false".equals(a2)) {
                        return false;
                    }
                }
            }
        }
        return z;
    }

    public final long c(String str) {
        Iterator it = this.f8204b.iterator();
        while (it.hasNext()) {
            Object a2 = ((a) it.next()).a(str);
            if (a2 != null) {
                if (a2 instanceof Number) {
                    return ((Number) a2).longValue();
                }
                if (a2 instanceof String) {
                    try {
                        return Long.parseLong((String) a2);
                    } catch (IllegalArgumentException unused) {
                        continue;
                    }
                } else {
                    continue;
                }
            }
        }
        return 0L;
    }

    private static long a(Object obj) {
        if (obj instanceof Number) {
            return ((Number) obj).longValue();
        }
        if (obj instanceof String) {
            return Long.parseLong((String) obj);
        }
        throw new IllegalArgumentException();
    }

    public final gj d(String str) {
        double parseDouble;
        Iterator it = this.f8204b.iterator();
        while (it.hasNext()) {
            Object a2 = ((a) it.next()).a(str);
            if (a2 instanceof List) {
                List list = (List) a2;
                try {
                    long a3 = a(list.get(0));
                    long a4 = a(list.get(1));
                    long a5 = a(list.get(2));
                    Object obj = list.get(3);
                    if (obj instanceof Number) {
                        parseDouble = ((Number) obj).doubleValue();
                    } else if (obj instanceof String) {
                        parseDouble = Double.parseDouble((String) obj);
                    } else {
                        throw new IllegalArgumentException();
                    }
                    return new gj(a3, a4, a5, parseDouble);
                } catch (RuntimeException unused) {
                }
            }
        }
        return gj.f8200a;
    }
}
