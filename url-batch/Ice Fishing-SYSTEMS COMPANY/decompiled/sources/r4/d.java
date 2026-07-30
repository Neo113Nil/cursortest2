package r4;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import r7.AbstractC4979j;
import r7.AbstractC4980k;

/* loaded from: classes2.dex */
public final class d implements b {
    public static final a Companion = new a(null);
    private static String indent = "";
    private final Map<Class<?>, List<e>> serviceMap;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        public final String getIndent() {
            return d.indent;
        }

        public final void setIndent(String str) {
            kotlin.jvm.internal.h.e(str, "<set-?>");
            d.indent = str;
        }

        private a() {
        }
    }

    public d(List<? extends e> registrations) {
        kotlin.jvm.internal.h.e(registrations, "registrations");
        this.serviceMap = new LinkedHashMap();
        for (e eVar : registrations) {
            for (Class<?> cls : eVar.getServices()) {
                if (this.serviceMap.containsKey(cls)) {
                    List<e> list = this.serviceMap.get(cls);
                    kotlin.jvm.internal.h.b(list);
                    list.add(eVar);
                } else {
                    this.serviceMap.put(cls, AbstractC4980k.C(eVar));
                }
            }
        }
    }

    @Override // r4.b
    public <T> List<T> getAllServices(Class<T> c4) {
        ArrayList arrayList;
        kotlin.jvm.internal.h.e(c4, "c");
        synchronized (this.serviceMap) {
            try {
                arrayList = new ArrayList();
                if (this.serviceMap.containsKey(c4)) {
                    Map<Class<?>, List<e>> map = this.serviceMap;
                    kotlin.jvm.internal.h.b(map);
                    List<e> list = map.get(c4);
                    kotlin.jvm.internal.h.b(list);
                    for (e eVar : list) {
                        Object resolve = eVar.resolve(this);
                        if (resolve == null) {
                            throw new Exception("Could not instantiate service: " + eVar);
                        }
                        arrayList.add(resolve);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList;
    }

    public final /* synthetic */ <T> List<T> getAllServices$com_onesignal_core() {
        kotlin.jvm.internal.h.h();
        throw null;
    }

    @Override // r4.b
    public <T> T getService(Class<T> c4) {
        kotlin.jvm.internal.h.e(c4, "c");
        T t9 = (T) getServiceOrNull(c4);
        if (t9 != null) {
            return t9;
        }
        throw new Exception("Service " + c4 + " could not be instantiated");
    }

    public final /* synthetic */ <T> T getService$com_onesignal_core() {
        kotlin.jvm.internal.h.h();
        throw null;
    }

    @Override // r4.b
    public <T> T getServiceOrNull(Class<T> c4) {
        T t9;
        e eVar;
        kotlin.jvm.internal.h.e(c4, "c");
        synchronized (this.serviceMap) {
            List<e> list = this.serviceMap.get(c4);
            t9 = (list == null || (eVar = (e) AbstractC4979j.L(list)) == null) ? null : (T) eVar.resolve(this);
        }
        return t9;
    }

    public final /* synthetic */ <T> T getServiceOrNull$com_onesignal_core() {
        kotlin.jvm.internal.h.h();
        throw null;
    }

    @Override // r4.b
    public <T> boolean hasService(Class<T> c4) {
        boolean containsKey;
        kotlin.jvm.internal.h.e(c4, "c");
        synchronized (this.serviceMap) {
            containsKey = this.serviceMap.containsKey(c4);
        }
        return containsKey;
    }

    public final /* synthetic */ <T> boolean hasService$com_onesignal_core() {
        kotlin.jvm.internal.h.h();
        throw null;
    }
}
