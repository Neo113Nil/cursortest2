package T3;

import com.onesignal.common.modeling.h;
import com.onesignal.common.modeling.i;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a extends h {
    public a() {
        super(null, null, 3, null);
    }

    @Override // com.onesignal.common.modeling.h, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof String) {
            return containsValue((String) obj);
        }
        return false;
    }

    @Override // com.onesignal.common.modeling.h, java.util.Map
    public final /* bridge */ String get(Object obj) {
        if (obj instanceof String) {
            return get((String) obj);
        }
        return null;
    }

    public final String getExternalId() {
        return i.getOptStringProperty$default(this, "external_id", null, 2, null);
    }

    public final String getOnesignalId() {
        return i.getStringProperty$default(this, "onesignal_id", null, 2, null);
    }

    public final /* bridge */ String getOrDefault(Object obj, String str) {
        return !(obj instanceof String) ? str : getOrDefault((String) obj, str);
    }

    @Override // com.onesignal.common.modeling.h, java.util.Map
    public final /* bridge */ String remove(Object obj) {
        if (obj instanceof String) {
            return remove((String) obj);
        }
        return null;
    }

    public final void setExternalId(String str) {
        i.setOptStringProperty$default(this, "external_id", str, null, false, 12, null);
    }

    public final void setOnesignalId(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        i.setStringProperty$default(this, "onesignal_id", value, null, false, 12, null);
    }

    public /* bridge */ boolean containsValue(String str) {
        return super.containsValue((Object) str);
    }

    @Override // com.onesignal.common.modeling.h
    public /* bridge */ String get(String str) {
        return (String) super.get(str);
    }

    public /* bridge */ String getOrDefault(String str, String str2) {
        return (String) super.getOrDefault((Object) str, str2);
    }

    @Override // com.onesignal.common.modeling.h
    public /* bridge */ String remove(String str) {
        return (String) super.remove(str);
    }
}
