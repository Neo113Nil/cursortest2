package L1;

import F2.n;
import android.content.Context;
import g3.InterfaceC0392a;
import i2.InterfaceC0425a;
import l2.j;
import o5.InterfaceC0564d;
import x2.InterfaceC0728a;

/* loaded from: classes.dex */
public interface b {
    InterfaceC0425a getDebug();

    j getInAppMessages();

    InterfaceC0728a getLocation();

    n getNotifications();

    InterfaceC0392a getSession();

    m3.a getUser();

    Object initWithContext(Context context, InterfaceC0564d interfaceC0564d);

    boolean initWithContext(Context context, String str);

    boolean isInitialized();

    void login(String str);

    void login(String str, String str2);

    void logout();

    void setConsentGiven(boolean z5);

    void setConsentRequired(boolean z5);
}
