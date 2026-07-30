package n2;

import N2.j;
import android.content.Context;
import h3.n;

/* renamed from: n2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC0751b {
    K2.a getDebug();

    j getInAppMessages();

    Z2.a getLocation();

    n getNotifications();

    I3.a getSession();

    O3.a getUser();

    Object initWithContext(Context context, V5.b bVar);

    boolean initWithContext(Context context, String str);

    boolean isInitialized();

    void login(String str);

    void login(String str, String str2);

    void logout();

    void setConsentGiven(boolean z7);

    void setConsentRequired(boolean z7);
}
