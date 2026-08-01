package ba;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.y;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d implements b {
    public static final a Companion = new a(null);
    private static String indent = "";
    private final Map<Class<?>, List<e>> serviceMap;

    public d(List<? extends e> list) {
        list.getClass();
        this.serviceMap = new LinkedHashMap();
        for (e eVar : list) {
            for (Class<?> cls : eVar.getServices()) {
                boolean containsKey = this.serviceMap.containsKey(cls);
                Map<Class<?>, List<e>> map = this.serviceMap;
                if (containsKey) {
                    List<e> list2 = map.get(cls);
                    list2.getClass();
                    list2.add(eVar);
                } else {
                    map.put(cls, y.g(eVar));
                }
            }
        }
    }

    @Override // ba.b
    public <T> List<T> getAllServices(Class<T> cls) {
        ArrayList arrayList;
        cls.getClass();
        synchronized (this.serviceMap) {
            try {
                arrayList = new ArrayList();
                if (this.serviceMap.containsKey(cls)) {
                    Map<Class<?>, List<e>> map = this.serviceMap;
                    map.getClass();
                    List<e> list = map.get(cls);
                    list.getClass();
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
        Intrinsics.d();
        throw null;
    }

    @Override // ba.b
    public <T> T getService(Class<T> cls) {
        cls.getClass();
        T t6 = (T) getServiceOrNull(cls);
        if (t6 != null) {
            return t6;
        }
        throw new Exception("Service " + cls + " could not be instantiated");
    }

    public final /* synthetic */ <T> T getService$com_onesignal_core() {
        Intrinsics.d();
        throw null;
    }

    @Override // ba.b
    public <T> T getServiceOrNull(Class<T> cls) {
        T t6;
        e eVar;
        cls.getClass();
        synchronized (this.serviceMap) {
            List<e> list = this.serviceMap.get(cls);
            t6 = (list == null || (eVar = (e) CollectionsKt.C(list)) == null) ? null : (T) eVar.resolve(this);
        }
        return t6;
    }

    public final /* synthetic */ <T> T getServiceOrNull$com_onesignal_core() {
        Intrinsics.d();
        throw null;
    }

    @Override // ba.b
    public <T> boolean hasService(Class<T> cls) {
        boolean containsKey;
        cls.getClass();
        synchronized (this.serviceMap) {
            containsKey = this.serviceMap.containsKey(cls);
        }
        return containsKey;
    }

    public final /* synthetic */ <T> boolean hasService$com_onesignal_core() {
        Intrinsics.d();
        throw null;
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getIndent() {
            return d.indent;
        }

        public final void setIndent(String str) {
            str.getClass();
            d.indent = str;
        }

        private a() {
        }
    }
}
