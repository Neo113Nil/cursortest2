package com.onesignal.common.modeling;

import com.onesignal.common.events.EventProducer;
import com.onesignal.common.events.IEventNotifier;
import com.onesignal.common.modeling.Model;
import com.onesignal.core.internal.preferences.IPreferencesService;
import com.onesignal.core.internal.preferences.PreferenceOneSignalKeys;
import com.onesignal.debug.internal.logging.Logging;
import g4.AbstractC0465j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
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

    private final void addItem(TModel tmodel, String str, Integer num) {
        synchronized (this.models) {
            try {
                if (num != null) {
                    this.models.add(num.intValue(), tmodel);
                } else {
                    this.models.add(tmodel);
                }
                tmodel.subscribe(this);
                persist();
            } catch (Throwable th) {
                throw th;
            }
        }
        this.changeSubscription.fire(new ModelStore$addItem$2(tmodel, str));
    }

    public static /* synthetic */ void addItem$default(ModelStore modelStore, Model model, String str, Integer num, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addItem");
        }
        if ((i2 & 4) != 0) {
            num = null;
        }
        modelStore.addItem(model, str, num);
    }

    private final void removeItem(TModel tmodel, String str) {
        synchronized (this.models) {
            this.models.remove(tmodel);
            tmodel.unsubscribe(this);
            persist();
        }
        this.changeSubscription.fire(new ModelStore$removeItem$2(tmodel, str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.onesignal.common.modeling.IModelStore
    public void add(TModel model, String tag) {
        Object obj;
        i.e(model, "model");
        i.e(tag, "tag");
        synchronized (this.models) {
            try {
                Iterator<T> it = this.models.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (i.a(((Model) obj).getId(), model.getId())) {
                            break;
                        }
                    }
                }
                Model model2 = (Model) obj;
                if (model2 != null) {
                    removeItem(model2, tag);
                }
                addItem$default(this, model, tag, null, 4, null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.onesignal.common.modeling.IModelStore
    public void clear(String tag) {
        i.e(tag, "tag");
        List<Model> S02 = AbstractC0465j.S0(this.models);
        synchronized (this.models) {
            this.models.clear();
            persist();
        }
        for (Model model : S02) {
            model.unsubscribe((IModelChangedHandler) this);
            this.changeSubscription.fire(new ModelStore$clear$2(model, tag));
        }
    }

    @Override // com.onesignal.common.modeling.IModelStore
    public TModel get(String id) {
        Object obj;
        i.e(id, "id");
        Iterator<T> it = this.models.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (i.a(((Model) obj).getId(), id)) {
                break;
            }
        }
        return (TModel) obj;
    }

    @Override // com.onesignal.common.events.IEventNotifier
    public boolean getHasSubscribers() {
        return this.changeSubscription.getHasSubscribers();
    }

    public final String getName() {
        return this.name;
    }

    @Override // com.onesignal.common.modeling.IModelStore
    public Collection<TModel> list() {
        List S02;
        synchronized (this.models) {
            S02 = AbstractC0465j.S0(this.models);
        }
        return S02;
    }

    public final void load() {
        IPreferencesService iPreferencesService;
        if (this.name == null || (iPreferencesService = this._prefs) == null) {
            return;
        }
        JSONArray jSONArray = new JSONArray(iPreferencesService.getString("OneSignal", PreferenceOneSignalKeys.MODEL_STORE_PREFIX + this.name, "[]"));
        synchronized (this.models) {
            try {
                boolean isEmpty = this.models.isEmpty();
                for (int length = jSONArray.length() - 1; -1 < length; length--) {
                    TModel create = create(jSONArray.getJSONObject(length));
                    if (create != null) {
                        List<TModel> list = this.models;
                        if (list == null || !list.isEmpty()) {
                            Iterator<T> it = list.iterator();
                            while (it.hasNext()) {
                                if (i.a(((Model) it.next()).getId(), create.getId())) {
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
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.onesignal.common.modeling.IModelChangedHandler
    public void onChanged(ModelChangedArgs args, String tag) {
        i.e(args, "args");
        i.e(tag, "tag");
        persist();
        this.changeSubscription.fire(new ModelStore$onChanged$1(args, tag));
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
        }
        this._prefs.saveString("OneSignal", PreferenceOneSignalKeys.MODEL_STORE_PREFIX + this.name, jSONArray.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.onesignal.common.modeling.IModelStore
    public void remove(String id, String tag) {
        Object obj;
        i.e(id, "id");
        i.e(tag, "tag");
        synchronized (this.models) {
            try {
                Iterator<T> it = this.models.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (i.a(((Model) obj).getId(), id)) {
                            break;
                        }
                    }
                }
                Model model = (Model) obj;
                if (model == null) {
                    return;
                }
                removeItem(model, tag);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.onesignal.common.modeling.IModelStore
    public void replaceAll(List<? extends TModel> models, String tag) {
        i.e(models, "models");
        i.e(tag, "tag");
        synchronized (models) {
            clear(tag);
            Iterator<? extends TModel> it = models.iterator();
            while (it.hasNext()) {
                add(it.next(), tag);
            }
        }
    }

    public JSONObject transformJsonForPersistence(TModel model, JSONObject json) {
        i.e(model, "model");
        i.e(json, "json");
        return json;
    }

    public ModelStore(String str, IPreferencesService iPreferencesService) {
        this.name = str;
        this._prefs = iPreferencesService;
        this.changeSubscription = new EventProducer<>();
        this.models = new ArrayList();
    }

    @Override // com.onesignal.common.events.IEventNotifier
    public void subscribe(IModelStoreChangeHandler<TModel> handler) {
        i.e(handler, "handler");
        this.changeSubscription.subscribe(handler);
    }

    @Override // com.onesignal.common.events.IEventNotifier
    public void unsubscribe(IModelStoreChangeHandler<TModel> handler) {
        i.e(handler, "handler");
        this.changeSubscription.unsubscribe(handler);
    }

    public /* synthetic */ ModelStore(String str, IPreferencesService iPreferencesService, int i2, e eVar) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : iPreferencesService);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.onesignal.common.modeling.IModelStore
    public void add(int i2, TModel model, String tag) {
        Object obj;
        i.e(model, "model");
        i.e(tag, "tag");
        synchronized (this.models) {
            try {
                Iterator<T> it = this.models.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (i.a(((Model) obj).getId(), model.getId())) {
                            break;
                        }
                    }
                }
                Model model2 = (Model) obj;
                if (model2 != null) {
                    removeItem(model2, tag);
                }
                addItem(model, tag, Integer.valueOf(i2));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
