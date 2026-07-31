package r2;

import java.util.Set;

/* renamed from: r2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC0616a {
    void cleanInAppMessageClickedClickIds(Set<String> set);

    void cleanInAppMessageIds(Set<String> set);

    Set<String> getClickedMessagesId();

    Set<String> getDismissedMessagesId();

    Set<String> getImpressionesMessagesId();

    Long getLastTimeInAppDismissed();

    String getSavedIAMs();

    Set<String> getViewPageImpressionedIds();

    void setClickedMessagesId(Set<String> set);

    void setDismissedMessagesId(Set<String> set);

    void setImpressionesMessagesId(Set<String> set);

    void setLastTimeInAppDismissed(Long l7);

    void setSavedIAMs(String str);

    void setViewPageImpressionedIds(Set<String> set);
}
