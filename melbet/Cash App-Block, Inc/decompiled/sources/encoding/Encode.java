package encoding;

import androidx.camera.camera2.pipe.core.Debug;
import java.net.URLEncoder;
import kotlin.text.Charsets;
import operation.StandardLogicOperation;

/* loaded from: classes9.dex */
public final class Encode implements StandardLogicOperation {
    public static final Encode INSTANCE = new Encode();

    @Override // operation.StandardLogicOperation
    public final Object evaluateLogic(Object obj, Object obj2) {
        String unwrapValueAsString = Debug.unwrapValueAsString(obj);
        if (unwrapValueAsString != null) {
            return URLEncoder.encode(unwrapValueAsString, Charsets.UTF_8.name());
        }
        return null;
    }
}
