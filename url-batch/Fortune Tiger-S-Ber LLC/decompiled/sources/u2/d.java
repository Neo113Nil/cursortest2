package u2;

import java.io.Serializable;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public abstract class d implements Serializable {
    public final String toString() {
        f.f3430a.getClass();
        String obj = getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            obj = obj.substring(21);
        }
        c.d(obj, "renderLambdaToString(...)");
        return obj;
    }
}
