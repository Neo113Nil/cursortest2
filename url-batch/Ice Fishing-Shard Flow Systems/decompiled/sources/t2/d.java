package t2;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.r;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d implements b {
    public static final a Companion = new a(null);
    private static String indent = "";
    private final Map<Class<?>, List<e>> serviceMap;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getIndent() {
            return d.indent;
        }

        public final void setIndent(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            d.indent = str;
        }

        private a() {
        }
    }

    public d(List<? extends e> registrations) {
        Intrinsics.checkNotNullParameter(registrations, "registrations");
        this.serviceMap = new LinkedHashMap();
        for (e eVar : registrations) {
            for (Class<?> cls : eVar.getServices()) {
                if (this.serviceMap.containsKey(cls)) {
                    List<e> list = this.serviceMap.get(cls);
                    Intrinsics.b(list);
                    list.add(eVar);
                } else {
                    this.serviceMap.put(cls, r.e(eVar));
                }
            }
        }
    }

    @Override // t2.b
    public <T> List<T> getAllServices(Class<T> c7) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(c7, "c");
        synchronized (this.serviceMap) {
            try {
                arrayList = new ArrayList();
                if (this.serviceMap.containsKey(c7)) {
                    Map<Class<?>, List<e>> map = this.serviceMap;
                    Intrinsics.b(map);
                    List<e> list = map.get(c7);
                    Intrinsics.b(list);
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
        Intrinsics.f();
        throw null;
    }

    @Override // t2.b
    public <T> T getService(Class<T> c7) {
        Intrinsics.checkNotNullParameter(c7, "c");
        T t6 = (T) getServiceOrNull(c7);
        if (t6 != null) {
            return t6;
        }
        throw new Exception("Service " + c7 + " could not be instantiated");
    }

    public final /* synthetic */ <T> T getService$com_onesignal_core() {
        Intrinsics.f();
        throw null;
    }

    @Override // t2.b
    public <T> T getServiceOrNull(Class<T> c7) {
        T t6;
        e eVar;
        Intrinsics.checkNotNullParameter(c7, "c");
        synchronized (this.serviceMap) {
            List<e> list = this.serviceMap.get(c7);
            t6 = (list == null || (eVar = (e) CollectionsKt.t(list)) == null) ? null : (T) eVar.resolve(this);
        }
        return t6;
    }

    public final /* synthetic */ <T> T getServiceOrNull$com_onesignal_core() {
        Intrinsics.f();
        throw null;
    }

    @Override // t2.b
    public <T> boolean hasService(Class<T> c7) {
        boolean containsKey;
        Intrinsics.checkNotNullParameter(c7, "c");
        synchronized (this.serviceMap) {
            containsKey = this.serviceMap.containsKey(c7);
        }
        return containsKey;
    }

    public final /* synthetic */ <T> boolean hasService$com_onesignal_core() {
        Intrinsics.f();
        throw null;
    }
}
