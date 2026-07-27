package com.onesignal.common.modeling;

import com.onesignal.common.modeling.Model;
import com.onesignal.core.internal.preferences.IPreferencesService;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import org.json.JSONObject;
import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public class SimpleModelStore<TModel extends Model> extends ModelStore<TModel> {
    private final InterfaceC1430a _create;

    public /* synthetic */ SimpleModelStore(InterfaceC1430a interfaceC1430a, String str, IPreferencesService iPreferencesService, int i2, e eVar) {
        this(interfaceC1430a, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : iPreferencesService);
    }

    @Override // com.onesignal.common.modeling.IModelStore
    public TModel create(JSONObject jSONObject) {
        TModel tmodel = (TModel) this._create.invoke();
        if (jSONObject != null) {
            tmodel.initializeFromJson(jSONObject);
        }
        return tmodel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleModelStore(InterfaceC1430a _create, String str, IPreferencesService iPreferencesService) {
        super(str, iPreferencesService);
        i.e(_create, "_create");
        this._create = _create;
        load();
    }
}
