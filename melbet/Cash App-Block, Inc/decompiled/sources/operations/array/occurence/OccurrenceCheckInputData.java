package operations.array.occurence;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class OccurrenceCheckInputData {
    public final Map mappingOperation;
    public final List operationData;
    public final Object operationDefault;

    public OccurrenceCheckInputData(List list, Map map, Object obj) {
        list.getClass();
        map.getClass();
        this.operationData = list;
        this.mappingOperation = map;
        this.operationDefault = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OccurrenceCheckInputData)) {
            return false;
        }
        OccurrenceCheckInputData occurrenceCheckInputData = (OccurrenceCheckInputData) obj;
        return Intrinsics.areEqual(this.operationData, occurrenceCheckInputData.operationData) && Intrinsics.areEqual(this.mappingOperation, occurrenceCheckInputData.mappingOperation) && Intrinsics.areEqual(this.operationDefault, occurrenceCheckInputData.operationDefault);
    }

    public final int hashCode() {
        int m = CameraState$Type$EnumUnboxingLocalUtility.m(this.operationData.hashCode() * 31, this.mappingOperation, 31);
        Object obj = this.operationDefault;
        return m + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OccurrenceCheckInputData(operationData=");
        sb.append(this.operationData);
        sb.append(", mappingOperation=");
        sb.append(this.mappingOperation);
        sb.append(", operationDefault=");
        return Recorder$$ExternalSyntheticOutline1.m(sb, this.operationDefault, ")");
    }
}
