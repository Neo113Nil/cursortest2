package com.onesignal.user;

import com.onesignal.user.state.IUserStateObserver;
import com.onesignal.user.subscriptions.IPushSubscription;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes.dex */
public interface IUserManager {

    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void trackEvent$default(IUserManager iUserManager, String str, Map map, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackEvent");
            }
            if ((i2 & 2) != 0) {
                map = null;
            }
            iUserManager.trackEvent(str, map);
        }
    }

    void addAlias(String str, String str2);

    void addAliases(Map<String, String> map);

    void addEmail(String str);

    void addObserver(IUserStateObserver iUserStateObserver);

    void addSms(String str);

    void addTag(String str, String str2);

    void addTags(Map<String, String> map);

    String getExternalId();

    String getOnesignalId();

    IPushSubscription getPushSubscription();

    Map<String, String> getTags();

    void removeAlias(String str);

    void removeAliases(Collection<String> collection);

    void removeEmail(String str);

    void removeObserver(IUserStateObserver iUserStateObserver);

    void removeSms(String str);

    void removeTag(String str);

    void removeTags(Collection<String> collection);

    void setLanguage(String str);

    void trackEvent(String str, Map<String, ? extends Object> map);
}
