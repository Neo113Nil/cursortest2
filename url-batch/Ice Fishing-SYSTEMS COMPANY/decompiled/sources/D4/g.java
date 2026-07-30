package D4;

import com.onesignal.common.modeling.i;
import java.util.Map;
import kotlin.jvm.internal.h;

/* loaded from: classes2.dex */
public abstract class g extends i {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g(String name) {
        super(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        h.e(name, "name");
        setName(name);
    }

    private final void setName(String str) {
        i.setStringProperty$default(this, "name", str, null, false, 12, null);
    }

    public abstract String getApplyToRecordId();

    public abstract boolean getCanStartExecute();

    public abstract String getCreateComparisonKey();

    public final String getExternalId() {
        return i.getOptStringProperty$default(this, "externalId", null, 2, null);
    }

    public abstract c getGroupComparisonType();

    public abstract String getModifyComparisonKey();

    public final String getName() {
        return i.getStringProperty$default(this, "name", null, 2, null);
    }

    public boolean getRequiresJwt() {
        return true;
    }

    public final void setExternalId$com_onesignal_core(String str) {
        i.setOptStringProperty$default(this, "externalId", str, null, false, 12, null);
    }

    public String toString() {
        String jSONObject = toJSON().toString();
        h.d(jSONObject, "toString(...)");
        return jSONObject;
    }

    public void translateIds(Map<String, String> map) {
        h.e(map, "map");
    }
}
