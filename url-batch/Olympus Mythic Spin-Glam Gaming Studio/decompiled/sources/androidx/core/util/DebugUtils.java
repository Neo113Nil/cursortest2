package androidx.core.util;

import androidx.annotation.RestrictTo;
import com.pubmatic.sdk.common.POBCommonConstants;

@RestrictTo
/* loaded from: classes14.dex */
public class DebugUtils {
    public static void buildShortClassTag(Object obj, StringBuilder sb) {
        int lastIndexOf;
        if (obj == null) {
            sb.append(POBCommonConstants.NULL_VALUE);
            return;
        }
        String simpleName = obj.getClass().getSimpleName();
        if (simpleName.length() <= 0 && (lastIndexOf = (simpleName = obj.getClass().getName()).lastIndexOf(46)) > 0) {
            simpleName = simpleName.substring(lastIndexOf + 1);
        }
        sb.append(simpleName);
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
    }
}
