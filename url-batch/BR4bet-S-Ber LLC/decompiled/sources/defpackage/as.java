package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public abstract class as implements qo, Serializable {
    @Override // defpackage.qo
    public final int b() {
        return 0;
    }

    public final String toString() {
        u20.a.getClass();
        String obj = getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }
}
