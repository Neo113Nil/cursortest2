package U2;

import H2.b;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a implements T2.a {
    private final b _prefs;

    public a(b _prefs) {
        Intrinsics.checkNotNullParameter(_prefs, "_prefs");
        this._prefs = _prefs;
    }

    @Override // T2.a
    public void cleanInAppMessageClickedClickIds(Set<String> set) {
        Set<String> stringSet;
        if (set == null || set.isEmpty() || (stringSet = this._prefs.getStringSet(com.onesignal.common.threading.a.BASE_THREAD_NAME, "PREFS_OS_CLICKED_CLICK_IDS_IAMS", null)) == null || stringSet.isEmpty()) {
            return;
        }
        LinkedHashSet B7 = CollectionsKt.B(stringSet);
        B7.removeAll(set);
        this._prefs.saveStringSet(com.onesignal.common.threading.a.BASE_THREAD_NAME, "PREFS_OS_CLICKED_CLICK_IDS_IAMS", B7);
    }

    @Override // T2.a
    public void cleanInAppMessageIds(Set<String> set) {
        if (set == null || set.isEmpty()) {
            return;
        }
        Set<String> stringSet = this._prefs.getStringSet(com.onesignal.common.threading.a.BASE_THREAD_NAME, "PREFS_OS_DISPLAYED_IAMS", null);
        Set<String> stringSet2 = this._prefs.getStringSet(com.onesignal.common.threading.a.BASE_THREAD_NAME, "PREFS_OS_IMPRESSIONED_IAMS", null);
        if (stringSet != null && !stringSet.isEmpty()) {
            LinkedHashSet B7 = CollectionsKt.B(stringSet);
            B7.removeAll(set);
            this._prefs.saveStringSet(com.onesignal.common.threading.a.BASE_THREAD_NAME, "PREFS_OS_DISPLAYED_IAMS", B7);
        }
        if (stringSet2 == null || stringSet2.isEmpty()) {
            return;
        }
        LinkedHashSet B8 = CollectionsKt.B(stringSet2);
        B8.removeAll(set);
        this._prefs.saveStringSet(com.onesignal.common.threading.a.BASE_THREAD_NAME, "PREFS_OS_IMPRESSIONED_IAMS", B8);
    }

    @Override // T2.a
    public Set<String> getClickedMessagesId() {
        return this._prefs.getStringSet(com.onesignal.common.threading.a.BASE_THREAD_NAME, "PREFS_OS_CLICKED_CLICK_IDS_IAMS", null);
    }

    @Override // T2.a
    public Set<String> getDismissedMessagesId() {
        return this._prefs.getStringSet(com.onesignal.common.threading.a.BASE_THREAD_NAME, "PREFS_OS_DISPLAYED_IAMS", null);
    }

    @Override // T2.a
    public Set<String> getImpressionesMessagesId() {
        return this._prefs.getStringSet(com.onesignal.common.threading.a.BASE_THREAD_NAME, "PREFS_OS_IMPRESSIONED_IAMS", null);
    }

    @Override // T2.a
    public Long getLastTimeInAppDismissed() {
        return this._prefs.getLong(com.onesignal.common.threading.a.BASE_THREAD_NAME, "PREFS_OS_IAM_LAST_DISMISSED_TIME", null);
    }

    @Override // T2.a
    public String getSavedIAMs() {
        return this._prefs.getString(com.onesignal.common.threading.a.BASE_THREAD_NAME, "PREFS_OS_CACHED_IAMS", null);
    }

    @Override // T2.a
    public Set<String> getViewPageImpressionedIds() {
        return this._prefs.getStringSet(com.onesignal.common.threading.a.BASE_THREAD_NAME, "PREFS_OS_PAGE_IMPRESSIONED_IAMS", null);
    }

    @Override // T2.a
    public void setClickedMessagesId(Set<String> set) {
        this._prefs.saveStringSet(com.onesignal.common.threading.a.BASE_THREAD_NAME, "PREFS_OS_CLICKED_CLICK_IDS_IAMS", set);
    }

    @Override // T2.a
    public void setDismissedMessagesId(Set<String> set) {
        this._prefs.saveStringSet(com.onesignal.common.threading.a.BASE_THREAD_NAME, "PREFS_OS_DISPLAYED_IAMS", set);
    }

    @Override // T2.a
    public void setImpressionesMessagesId(Set<String> set) {
        this._prefs.saveStringSet(com.onesignal.common.threading.a.BASE_THREAD_NAME, "PREFS_OS_IMPRESSIONED_IAMS", set);
    }

    @Override // T2.a
    public void setLastTimeInAppDismissed(Long l7) {
        this._prefs.saveLong(com.onesignal.common.threading.a.BASE_THREAD_NAME, "PREFS_OS_IAM_LAST_DISMISSED_TIME", l7);
    }

    @Override // T2.a
    public void setSavedIAMs(String str) {
        this._prefs.saveString(com.onesignal.common.threading.a.BASE_THREAD_NAME, "PREFS_OS_CACHED_IAMS", str);
    }

    @Override // T2.a
    public void setViewPageImpressionedIds(Set<String> set) {
        this._prefs.saveStringSet(com.onesignal.common.threading.a.BASE_THREAD_NAME, "PREFS_OS_PAGE_IMPRESSIONED_IAMS", set);
    }
}
