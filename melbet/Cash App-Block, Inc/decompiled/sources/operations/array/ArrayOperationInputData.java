package operations.array;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class ArrayOperationInputData {
    public final java.util.Map mappingOperation;
    public final List operationData;
    public final Object operationDefault;

    public ArrayOperationInputData(List list, java.util.Map map, Object obj) {
        this.operationData = list;
        this.mappingOperation = map;
        this.operationDefault = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ArrayOperationInputData)) {
            return false;
        }
        ArrayOperationInputData arrayOperationInputData = (ArrayOperationInputData) obj;
        return Intrinsics.areEqual(this.operationData, arrayOperationInputData.operationData) && Intrinsics.areEqual(this.mappingOperation, arrayOperationInputData.mappingOperation) && Intrinsics.areEqual(this.operationDefault, arrayOperationInputData.operationDefault);
    }

    public final int hashCode() {
        List list = this.operationData;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        java.util.Map map = this.mappingOperation;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        Object obj = this.operationDefault;
        return hashCode2 + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ArrayOperationInputData(operationData=");
        sb.append(this.operationData);
        sb.append(", mappingOperation=");
        sb.append(this.mappingOperation);
        sb.append(", operationDefault=");
        return Recorder$$ExternalSyntheticOutline1.m(sb, this.operationDefault, ")");
    }
}
