package db;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import qa.b;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a implements cb.a {
    private final b _prefs;

    public a(b bVar) {
        bVar.getClass();
        this._prefs = bVar;
    }

    @Override // cb.a
    public void cleanInAppMessageClickedClickIds(Set<String> set) {
        Set<String> stringSet;
        if (set != null) {
            Set<String> set2 = set;
            if (set2.isEmpty() || (stringSet = this._prefs.getStringSet("OneSignal", "PREFS_OS_CLICKED_CLICK_IDS_IAMS", null)) == null || stringSet.isEmpty()) {
                return;
            }
            LinkedHashSet S = CollectionsKt.S(stringSet);
            S.removeAll(set2);
            this._prefs.saveStringSet("OneSignal", "PREFS_OS_CLICKED_CLICK_IDS_IAMS", S);
        }
    }

    @Override // cb.a
    public void cleanInAppMessageIds(Set<String> set) {
        if (set != null) {
            Set<String> set2 = set;
            if (set2.isEmpty()) {
                return;
            }
            Set<String> stringSet = this._prefs.getStringSet("OneSignal", "PREFS_OS_DISPLAYED_IAMS", null);
            Set<String> stringSet2 = this._prefs.getStringSet("OneSignal", "PREFS_OS_IMPRESSIONED_IAMS", null);
            if (stringSet != null && !stringSet.isEmpty()) {
                LinkedHashSet S = CollectionsKt.S(stringSet);
                S.removeAll(set2);
                this._prefs.saveStringSet("OneSignal", "PREFS_OS_DISPLAYED_IAMS", S);
            }
            if (stringSet2 == null || stringSet2.isEmpty()) {
                return;
            }
            LinkedHashSet S2 = CollectionsKt.S(stringSet2);
            S2.removeAll(set2);
            this._prefs.saveStringSet("OneSignal", "PREFS_OS_IMPRESSIONED_IAMS", S2);
        }
    }

    @Override // cb.a
    public Set<String> getClickedMessagesId() {
        return this._prefs.getStringSet("OneSignal", "PREFS_OS_CLICKED_CLICK_IDS_IAMS", null);
    }

    @Override // cb.a
    public Set<String> getDismissedMessagesId() {
        return this._prefs.getStringSet("OneSignal", "PREFS_OS_DISPLAYED_IAMS", null);
    }

    @Override // cb.a
    public Set<String> getImpressionesMessagesId() {
        return this._prefs.getStringSet("OneSignal", "PREFS_OS_IMPRESSIONED_IAMS", null);
    }

    @Override // cb.a
    public Long getLastTimeInAppDismissed() {
        return this._prefs.getLong("OneSignal", "PREFS_OS_IAM_LAST_DISMISSED_TIME", null);
    }

    @Override // cb.a
    public String getSavedIAMs() {
        return this._prefs.getString("OneSignal", "PREFS_OS_CACHED_IAMS", null);
    }

    @Override // cb.a
    public Set<String> getViewPageImpressionedIds() {
        return this._prefs.getStringSet("OneSignal", "PREFS_OS_PAGE_IMPRESSIONED_IAMS", null);
    }

    @Override // cb.a
    public void setClickedMessagesId(Set<String> set) {
        this._prefs.saveStringSet("OneSignal", "PREFS_OS_CLICKED_CLICK_IDS_IAMS", set);
    }

    @Override // cb.a
    public void setDismissedMessagesId(Set<String> set) {
        this._prefs.saveStringSet("OneSignal", "PREFS_OS_DISPLAYED_IAMS", set);
    }

    @Override // cb.a
    public void setImpressionesMessagesId(Set<String> set) {
        this._prefs.saveStringSet("OneSignal", "PREFS_OS_IMPRESSIONED_IAMS", set);
    }

    @Override // cb.a
    public void setLastTimeInAppDismissed(Long l10) {
        this._prefs.saveLong("OneSignal", "PREFS_OS_IAM_LAST_DISMISSED_TIME", l10);
    }

    @Override // cb.a
    public void setSavedIAMs(String str) {
        this._prefs.saveString("OneSignal", "PREFS_OS_CACHED_IAMS", str);
    }

    @Override // cb.a
    public void setViewPageImpressionedIds(Set<String> set) {
        this._prefs.saveStringSet("OneSignal", "PREFS_OS_PAGE_IMPRESSIONED_IAMS", set);
    }
}
