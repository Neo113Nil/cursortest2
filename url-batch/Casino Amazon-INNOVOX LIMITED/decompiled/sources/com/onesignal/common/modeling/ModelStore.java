package com.onesignal.common.modeling;

import com.onesignal.common.events.EventProducer;
import com.onesignal.common.events.IEventNotifier;
import com.onesignal.common.modeling.Model;
import com.onesignal.core.BuildConfig;
import com.onesignal.core.internal.preferences.IPreferencesService;
import com.onesignal.core.internal.preferences.PreferenceOneSignalKeys;
import com.onesignal.debug.internal.logging.Logging;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: ModelStore.kt */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00040\u00032\b\u0012\u0004\u0012\u0002H\u00010\u00052\u00020\u0006B\u001d\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\u001d\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\u001bJ%\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\u001eJ)\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00020\b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0002\u0010 J\u0010\u0010!\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\bH\u0016J\u0017\u0010\"\u001a\u0004\u0018\u00018\u00002\u0006\u0010#\u001a\u00020\bH\u0016¢\u0006\u0002\u0010$J\u000e\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000&H\u0016J\b\u0010'\u001a\u00020\u0018H\u0004J\u0018\u0010(\u001a\u00020\u00182\u0006\u0010)\u001a\u00020*2\u0006\u0010\u001a\u001a\u00020\bH\u0016J\u0006\u0010+\u001a\u00020\u0018J\u0018\u0010,\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\bH\u0016J\u001d\u0010-\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00020\bH\u0002¢\u0006\u0002\u0010\u001bJ\u001e\u0010.\u001a\u00020\u00182\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000/2\u0006\u0010\u001a\u001a\u00020\bH\u0016J\u0016\u00100\u001a\u00020\u00182\f\u00101\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016J\u001d\u00102\u001a\u0002032\u0006\u0010\u0019\u001a\u00028\u00002\u0006\u00104\u001a\u000203H\u0014¢\u0006\u0002\u00105J\u0016\u00106\u001a\u00020\u00182\f\u00101\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u00067"}, d2 = {"Lcom/onesignal/common/modeling/ModelStore;", "TModel", "Lcom/onesignal/common/modeling/Model;", "Lcom/onesignal/common/events/IEventNotifier;", "Lcom/onesignal/common/modeling/IModelStoreChangeHandler;", "Lcom/onesignal/common/modeling/IModelStore;", "Lcom/onesignal/common/modeling/IModelChangedHandler;", "name", "", "_prefs", "Lcom/onesignal/core/internal/preferences/IPreferencesService;", "(Ljava/lang/String;Lcom/onesignal/core/internal/preferences/IPreferencesService;)V", "changeSubscription", "Lcom/onesignal/common/events/EventProducer;", "hasLoadedFromCache", "", "hasSubscribers", "getHasSubscribers", "()Z", "models", "", "getName", "()Ljava/lang/String;", "add", "", CommonUrlParts.MODEL, "tag", "(Lcom/onesignal/common/modeling/Model;Ljava/lang/String;)V", "index", "", "(ILcom/onesignal/common/modeling/Model;Ljava/lang/String;)V", "addItem", "(Lcom/onesignal/common/modeling/Model;Ljava/lang/String;Ljava/lang/Integer;)V", "clear", "get", "id", "(Ljava/lang/String;)Lcom/onesignal/common/modeling/Model;", "list", "", "load", "onChanged", "args", "Lcom/onesignal/common/modeling/ModelChangedArgs;", "persist", "remove", "removeItem", "replaceAll", "", "subscribe", "handler", "transformJsonForPersistence", "Lorg/json/JSONObject;", "json", "(Lcom/onesignal/common/modeling/Model;Lorg/json/JSONObject;)Lorg/json/JSONObject;", "unsubscribe", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class ModelStore<TModel extends Model> implements IEventNotifier<IModelStoreChangeHandler<TModel>>, IModelStore<TModel>, IModelChangedHandler {
    private final IPreferencesService _prefs;
    private final EventProducer<IModelStoreChangeHandler<TModel>> changeSubscription;
    private boolean hasLoadedFromCache;
    private final List<TModel> models;
    private final String name;

    /* JADX WARN: Multi-variable type inference failed */
    public ModelStore() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    protected JSONObject transformJsonForPersistence(TModel model, JSONObject json) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(json, "json");
        return json;
    }

    public ModelStore(String str, IPreferencesService iPreferencesService) {
        this.name = str;
        this._prefs = iPreferencesService;
        this.changeSubscription = new EventProducer<>();
        this.models = new ArrayList();
    }

    public /* synthetic */ ModelStore(String str, IPreferencesService iPreferencesService, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : iPreferencesService);
    }

    public final String getName() {
        return this.name;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.onesignal.common.modeling.IModelStore
    public void add(TModel model, String tag) {
        Object obj;
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(tag, "tag");
        synchronized (this.models) {
            Iterator<T> it = this.models.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (Intrinsics.areEqual(((Model) obj).getId(), model.getId())) {
                        break;
                    }
                }
            }
            Model model2 = (Model) obj;
            if (model2 != null) {
                removeItem(model2, tag);
            }
            addItem$default(this, model, tag, null, 4, null);
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.onesignal.common.modeling.IModelStore
    public void add(int index, TModel model, String tag) {
        Object obj;
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(tag, "tag");
        synchronized (this.models) {
            Iterator<T> it = this.models.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (Intrinsics.areEqual(((Model) obj).getId(), model.getId())) {
                        break;
                    }
                }
            }
            Model model2 = (Model) obj;
            if (model2 != null) {
                removeItem(model2, tag);
            }
            addItem(model, tag, Integer.valueOf(index));
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // com.onesignal.common.modeling.IModelStore
    public Collection<TModel> list() {
        List list;
        synchronized (this.models) {
            list = CollectionsKt.toList(this.models);
        }
        return list;
    }

    @Override // com.onesignal.common.modeling.IModelStore
    public TModel get(String id) {
        Object obj;
        Intrinsics.checkNotNullParameter(id, "id");
        Iterator<T> it = this.models.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual(((Model) obj).getId(), id)) {
                break;
            }
        }
        return (TModel) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.onesignal.common.modeling.IModelStore
    public void remove(String id, String tag) {
        Object obj;
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(tag, "tag");
        synchronized (this.models) {
            Iterator<T> it = this.models.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (Intrinsics.areEqual(((Model) obj).getId(), id)) {
                        break;
                    }
                }
            }
            Model model = (Model) obj;
            if (model == null) {
                return;
            }
            removeItem(model, tag);
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // com.onesignal.common.modeling.IModelChangedHandler
    public void onChanged(final ModelChangedArgs args, final String tag) {
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(tag, "tag");
        persist();
        this.changeSubscription.fire(new Function1<IModelStoreChangeHandler<TModel>, Unit>() { // from class: com.onesignal.common.modeling.ModelStore$onChanged$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke((IModelStoreChangeHandler) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(IModelStoreChangeHandler<TModel> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                it.onModelUpdated(ModelChangedArgs.this, tag);
            }
        });
    }

    @Override // com.onesignal.common.modeling.IModelStore
    public void replaceAll(List<? extends TModel> models, String tag) {
        Intrinsics.checkNotNullParameter(models, "models");
        Intrinsics.checkNotNullParameter(tag, "tag");
        synchronized (models) {
            clear(tag);
            Iterator<? extends TModel> it = models.iterator();
            while (it.hasNext()) {
                add(it.next(), tag);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // com.onesignal.common.modeling.IModelStore
    public void clear(final String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        List<Model> list = CollectionsKt.toList(this.models);
        synchronized (this.models) {
            this.models.clear();
            persist();
            Unit unit = Unit.INSTANCE;
        }
        for (final Model model : list) {
            model.unsubscribe((IModelChangedHandler) this);
            this.changeSubscription.fire(new Function1<IModelStoreChangeHandler<TModel>, Unit>() { // from class: com.onesignal.common.modeling.ModelStore$clear$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Incorrect types in method signature: (TTModel;Ljava/lang/String;)V */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                    invoke((IModelStoreChangeHandler) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(IModelStoreChangeHandler<TModel> it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    it.onModelRemoved(Model.this, tag);
                }
            });
        }
    }

    static /* synthetic */ void addItem$default(ModelStore modelStore, Model model, String str, Integer num, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addItem");
        }
        if ((i & 4) != 0) {
            num = null;
        }
        modelStore.addItem(model, str, num);
    }

    private final void addItem(final TModel model, final String tag, Integer index) {
        synchronized (this.models) {
            if (index != null) {
                this.models.add(index.intValue(), model);
            } else {
                this.models.add(model);
            }
            model.subscribe(this);
            persist();
            Unit unit = Unit.INSTANCE;
        }
        this.changeSubscription.fire(new Function1<IModelStoreChangeHandler<TModel>, Unit>() { // from class: com.onesignal.common.modeling.ModelStore$addItem$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Incorrect types in method signature: (TTModel;Ljava/lang/String;)V */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke((IModelStoreChangeHandler) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(IModelStoreChangeHandler<TModel> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                it.onModelAdded(Model.this, tag);
            }
        });
    }

    private final void removeItem(final TModel model, final String tag) {
        synchronized (this.models) {
            this.models.remove(model);
            model.unsubscribe(this);
            persist();
            Unit unit = Unit.INSTANCE;
        }
        this.changeSubscription.fire(new Function1<IModelStoreChangeHandler<TModel>, Unit>() { // from class: com.onesignal.common.modeling.ModelStore$removeItem$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Incorrect types in method signature: (TTModel;Ljava/lang/String;)V */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke((IModelStoreChangeHandler) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(IModelStoreChangeHandler<TModel> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                it.onModelRemoved(Model.this, tag);
            }
        });
    }

    protected final void load() {
        IPreferencesService iPreferencesService;
        if (this.name == null || (iPreferencesService = this._prefs) == null) {
            return;
        }
        JSONArray jSONArray = new JSONArray(iPreferencesService.getString("OneSignal", PreferenceOneSignalKeys.MODEL_STORE_PREFIX + this.name, HttpUrl.PATH_SEGMENT_ENCODE_SET_URI));
        synchronized (this.models) {
            boolean isEmpty = this.models.isEmpty();
            for (int length = jSONArray.length() - 1; -1 < length; length--) {
                TModel create = create(jSONArray.getJSONObject(length));
                if (create != null) {
                    List<TModel> list = this.models;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            if (Intrinsics.areEqual(((Model) it.next()).getId(), create.getId())) {
                                Logging.debug$default("ModelStore<" + this.name + ">: load - operation.id: " + create.getId() + " already exists in the store.", null, 2, null);
                                break;
                            }
                        }
                    }
                    this.models.add(0, create);
                    create.subscribe(this);
                }
            }
            this.hasLoadedFromCache = true;
            if (!isEmpty) {
                persist();
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void persist() {
        if (this.name == null || this._prefs == null || !this.hasLoadedFromCache) {
            return;
        }
        JSONArray jSONArray = new JSONArray();
        synchronized (this.models) {
            for (TModel tmodel : this.models) {
                jSONArray.put(transformJsonForPersistence(tmodel, tmodel.toJSON()));
            }
            Unit unit = Unit.INSTANCE;
        }
        this._prefs.saveString("OneSignal", PreferenceOneSignalKeys.MODEL_STORE_PREFIX + this.name, jSONArray.toString());
    }

    @Override // com.onesignal.common.events.IEventNotifier
    public void subscribe(IModelStoreChangeHandler<TModel> handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.changeSubscription.subscribe(handler);
    }

    @Override // com.onesignal.common.events.IEventNotifier
    public void unsubscribe(IModelStoreChangeHandler<TModel> handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.changeSubscription.unsubscribe(handler);
    }

    @Override // com.onesignal.common.events.IEventNotifier
    public boolean getHasSubscribers() {
        return this.changeSubscription.getHasSubscribers();
    }
}
