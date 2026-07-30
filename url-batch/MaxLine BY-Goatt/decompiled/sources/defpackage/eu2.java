package defpackage;

import com.google.firebase.messaging.ServiceStarter;
import kotlin.Unit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class eu2 {
    public static final float a;

    static {
        zm1 zm1Var = r31.a;
        zm1 zm1Var2 = new zm1();
        Float valueOf = Float.valueOf(1.0f);
        zm1Var2.h(0, new j81(valueOf, cf0.b));
        zm1Var2.h(499, new j81(valueOf, cf0.b));
        Float valueOf2 = Float.valueOf(0.0f);
        zm1Var2.h(ServiceStarter.ERROR_UNKNOWN, new j81(valueOf2, cf0.b));
        zm1Var2.h(999, new j81(valueOf2, cf0.b));
        Unit unit = Unit.a;
        a = 2.0f;
    }
}
