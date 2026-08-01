package na;

import com.onesignal.common.modeling.i;
import java.util.Map;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class g extends i {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g(String str) {
        super(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        str.getClass();
        setName(str);
    }

    private final void setName(String str) {
        i.setStringProperty$default(this, "name", str, null, false, 12, null);
    }

    public abstract String getApplyToRecordId();

    public abstract boolean getCanStartExecute();

    public abstract String getCreateComparisonKey();

    public abstract c getGroupComparisonType();

    public abstract String getModifyComparisonKey();

    public final String getName() {
        return i.getStringProperty$default(this, "name", null, 2, null);
    }

    public String toString() {
        String jSONObject = toJSON().toString();
        jSONObject.getClass();
        return jSONObject;
    }

    public void translateIds(Map<String, String> map) {
        map.getClass();
    }
}
