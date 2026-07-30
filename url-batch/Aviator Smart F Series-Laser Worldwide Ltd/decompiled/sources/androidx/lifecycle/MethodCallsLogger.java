package androidx.lifecycle;

import androidx.annotation.RestrictTo;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.s;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class MethodCallsLogger {
    private final Map<String, Integer> calledMethods = new HashMap();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean approveCall(String name, int i8) {
        s.checkNotNullParameter(name, "name");
        Integer num = this.calledMethods.get(name);
        int intValue = num != null ? num.intValue() : 0;
        boolean z7 = (intValue & i8) != 0;
        this.calledMethods.put(name, Integer.valueOf(i8 | intValue));
        return !z7;
    }
}
