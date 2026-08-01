package com.onesignal.common.modeling;

import a2.r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;
import wd.p;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class k implements com.onesignal.common.events.d, com.onesignal.common.modeling.c, com.onesignal.common.modeling.a {
    private final qa.b _prefs;
    private final com.onesignal.common.events.b changeSubscription;
    private boolean hasLoadedFromCache;
    private final List<i> models;
    private final String name;

    public k(String str, qa.b bVar) {
        this.name = str;
        this._prefs = bVar;
        this.changeSubscription = new com.onesignal.common.events.b();
        this.models = new ArrayList();
    }

    private final void addItem(i iVar, String str, Integer num) {
        synchronized (this.models) {
            List<i> list = this.models;
            try {
                if (num != null) {
                    list.add(num.intValue(), iVar);
                } else {
                    list.add(iVar);
                }
                iVar.subscribe((com.onesignal.common.modeling.a) this);
                persist();
            } catch (Throwable th) {
                throw th;
            }
        }
        this.changeSubscription.fire(new a(iVar, str));
    }

    public static /* synthetic */ void addItem$default(k kVar, i iVar, String str, Integer num, int i3, Object obj) {
        if (obj != null) {
            r.r("Super calls with default arguments not supported in this target, function: addItem");
            return;
        }
        if ((i3 & 4) != 0) {
            num = null;
        }
        kVar.addItem(iVar, str, num);
    }

    private final void removeItem(i iVar, String str) {
        synchronized (this.models) {
            this.models.remove(iVar);
            iVar.unsubscribe((com.onesignal.common.modeling.a) this);
            persist();
        }
        this.changeSubscription.fire(new d(iVar, str));
    }

    @Override // com.onesignal.common.modeling.c
    public void add(i iVar, String str) {
        Object obj;
        iVar.getClass();
        str.getClass();
        synchronized (this.models) {
            try {
                Iterator<T> it = this.models.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (Intrinsics.a(((i) obj).getId(), iVar.getId())) {
                            break;
                        }
                    }
                }
                i iVar2 = (i) obj;
                if (iVar2 != null) {
                    removeItem(iVar2, str);
                }
                addItem$default(this, iVar, str, null, 4, null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.onesignal.common.modeling.c
    public void clear(String str) {
        str.getClass();
        List<i> Q = CollectionsKt.Q(this.models);
        synchronized (this.models) {
            this.models.clear();
            persist();
        }
        for (i iVar : Q) {
            iVar.unsubscribe((com.onesignal.common.modeling.a) this);
            this.changeSubscription.fire(new b(iVar, str));
        }
    }

    @Override // com.onesignal.common.modeling.c
    public abstract /* synthetic */ i create(JSONObject jSONObject);

    @Override // com.onesignal.common.modeling.c
    public i get(String str) {
        Object obj;
        str.getClass();
        Iterator<T> it = this.models.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.a(((i) obj).getId(), str)) {
                break;
            }
        }
        return (i) obj;
    }

    @Override // com.onesignal.common.events.d
    public boolean getHasSubscribers() {
        return this.changeSubscription.getHasSubscribers();
    }

    public final String getName() {
        return this.name;
    }

    @Override // com.onesignal.common.modeling.c
    public Collection<i> list() {
        List Q;
        synchronized (this.models) {
            Q = CollectionsKt.Q(this.models);
        }
        return Q;
    }

    public final void load() {
        qa.b bVar;
        if (this.name == null || (bVar = this._prefs) == null) {
            return;
        }
        JSONArray jSONArray = new JSONArray(bVar.getString("OneSignal", "MODEL_STORE_" + this.name, "[]"));
        synchronized (this.models) {
            try {
                boolean isEmpty = this.models.isEmpty();
                for (int length = jSONArray.length() - 1; -1 < length; length--) {
                    i create = create(jSONArray.getJSONObject(length));
                    if (create != null) {
                        List<i> list = this.models;
                        if (list == null || !list.isEmpty()) {
                            Iterator<T> it = list.iterator();
                            while (it.hasNext()) {
                                if (Intrinsics.a(((i) it.next()).getId(), create.getId())) {
                                    com.onesignal.debug.internal.logging.b.debug$default("ModelStore<" + this.name + ">: load - operation.id: " + create.getId() + " already exists in the store.", null, 2, null);
                                    break;
                                }
                            }
                        }
                        this.models.add(0, create);
                        create.subscribe((com.onesignal.common.modeling.a) this);
                    }
                }
                this.hasLoadedFromCache = true;
                if (!isEmpty) {
                    persist();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.onesignal.common.modeling.a
    public void onChanged(j jVar, String str) {
        jVar.getClass();
        str.getClass();
        persist();
        this.changeSubscription.fire(new c(jVar, str));
    }

    public final void persist() {
        if (this.name == null || this._prefs == null || !this.hasLoadedFromCache) {
            return;
        }
        JSONArray jSONArray = new JSONArray();
        synchronized (this.models) {
            Iterator<i> it = this.models.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().toJSON());
            }
        }
        this._prefs.saveString("OneSignal", "MODEL_STORE_" + this.name, jSONArray.toString());
    }

    @Override // com.onesignal.common.modeling.c
    public void remove(String str, String str2) {
        Object obj;
        str.getClass();
        str2.getClass();
        synchronized (this.models) {
            try {
                Iterator<T> it = this.models.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (Intrinsics.a(((i) obj).getId(), str)) {
                            break;
                        }
                    }
                }
                i iVar = (i) obj;
                if (iVar == null) {
                    return;
                }
                removeItem(iVar, str2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.onesignal.common.modeling.c
    public void replaceAll(List<i> list, String str) {
        list.getClass();
        str.getClass();
        synchronized (list) {
            clear(str);
            Iterator<i> it = list.iterator();
            while (it.hasNext()) {
                add(it.next(), str);
            }
        }
    }

    @Override // com.onesignal.common.events.d
    public void subscribe(com.onesignal.common.modeling.d dVar) {
        dVar.getClass();
        this.changeSubscription.subscribe(dVar);
    }

    @Override // com.onesignal.common.events.d
    public void unsubscribe(com.onesignal.common.modeling.d dVar) {
        dVar.getClass();
        this.changeSubscription.unsubscribe(dVar);
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class a extends p implements Function1 {
        final /* synthetic */ i $model;
        final /* synthetic */ String $tag;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(i iVar, String str) {
            super(1);
            this.$model = iVar;
            this.$tag = str;
        }

        public final void invoke(com.onesignal.common.modeling.d dVar) {
            dVar.getClass();
            dVar.onModelAdded(this.$model, this.$tag);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.onesignal.common.modeling.d) obj);
            return Unit.f5554a;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class b extends p implements Function1 {
        final /* synthetic */ i $item;
        final /* synthetic */ String $tag;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(i iVar, String str) {
            super(1);
            this.$item = iVar;
            this.$tag = str;
        }

        public final void invoke(com.onesignal.common.modeling.d dVar) {
            dVar.getClass();
            dVar.onModelRemoved(this.$item, this.$tag);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.onesignal.common.modeling.d) obj);
            return Unit.f5554a;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class c extends p implements Function1 {
        final /* synthetic */ j $args;
        final /* synthetic */ String $tag;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(j jVar, String str) {
            super(1);
            this.$args = jVar;
            this.$tag = str;
        }

        public final void invoke(com.onesignal.common.modeling.d dVar) {
            dVar.getClass();
            dVar.onModelUpdated(this.$args, this.$tag);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.onesignal.common.modeling.d) obj);
            return Unit.f5554a;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class d extends p implements Function1 {
        final /* synthetic */ i $model;
        final /* synthetic */ String $tag;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(i iVar, String str) {
            super(1);
            this.$model = iVar;
            this.$tag = str;
        }

        public final void invoke(com.onesignal.common.modeling.d dVar) {
            dVar.getClass();
            dVar.onModelRemoved(this.$model, this.$tag);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.onesignal.common.modeling.d) obj);
            return Unit.f5554a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public /* synthetic */ k(String str, qa.b bVar, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? null : str, (i3 & 2) != 0 ? null : bVar);
    }

    @Override // com.onesignal.common.modeling.c
    public void add(int i3, i iVar, String str) {
        Object obj;
        iVar.getClass();
        str.getClass();
        synchronized (this.models) {
            try {
                Iterator<T> it = this.models.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (Intrinsics.a(((i) obj).getId(), iVar.getId())) {
                            break;
                        }
                    }
                }
                i iVar2 = (i) obj;
                if (iVar2 != null) {
                    removeItem(iVar2, str);
                }
                addItem(iVar, str, Integer.valueOf(i3));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
