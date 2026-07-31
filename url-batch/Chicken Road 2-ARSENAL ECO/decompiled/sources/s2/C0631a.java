package s2;

import f2.InterfaceC0365b;
import java.util.Set;
import kotlin.jvm.internal.i;
import l5.AbstractC0506j;
import r2.InterfaceC0616a;

/* renamed from: s2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0631a implements InterfaceC0616a {
    private final InterfaceC0365b _prefs;

    public C0631a(InterfaceC0365b _prefs) {
        i.e(_prefs, "_prefs");
        this._prefs = _prefs;
    }

    @Override // r2.InterfaceC0616a
    public void cleanInAppMessageClickedClickIds(Set<String> set) {
        Set<String> stringSet;
        if (set == null || set.isEmpty() || (stringSet = this._prefs.getStringSet(com.onesignal.common.threading.a.BASE_THREAD_NAME, "PREFS_OS_CLICKED_CLICK_IDS_IAMS", null)) == null || stringSet.isEmpty()) {
            return;
        }
        Set<String> S3 = AbstractC0506j.S(stringSet);
        S3.removeAll(set);
        this._prefs.saveStringSet(com.onesignal.common.threading.a.BASE_THREAD_NAME, "PREFS_OS_CLICKED_CLICK_IDS_IAMS", S3);
    }

    @Override // r2.InterfaceC0616a
    public void cleanInAppMessageIds(Set<String> set) {
        if (set == null || set.isEmpty()) {
            return;
        }
        Set<String> stringSet = this._prefs.getStringSet(com.onesignal.common.threading.a.BASE_THREAD_NAME, "PREFS_OS_DISPLAYED_IAMS", null);
        Set<String> stringSet2 = this._prefs.getStringSet(com.onesignal.common.threading.a.BASE_THREAD_NAME, "PREFS_OS_IMPRESSIONED_IAMS", null);
        if (stringSet != null && !stringSet.isEmpty()) {
            Set<String> S3 = AbstractC0506j.S(stringSet);
            S3.removeAll(set);
            this._prefs.saveStringSet(com.onesignal.common.threading.a.BASE_THREAD_NAME, "PREFS_OS_DISPLAYED_IAMS", S3);
        }
        if (stringSet2 == null || stringSet2.isEmpty()) {
            return;
        }
        Set<String> S6 = AbstractC0506j.S(stringSet2);
        S6.removeAll(set);
        this._prefs.saveStringSet(com.onesignal.common.threading.a.BASE_THREAD_NAME, "PREFS_OS_IMPRESSIONED_IAMS", S6);
    }

    @Override // r2.InterfaceC0616a
    public Set<String> getClickedMessagesId() {
        return this._prefs.getStringSet(com.onesignal.common.threading.a.BASE_THREAD_NAME, "PREFS_OS_CLICKED_CLICK_IDS_IAMS", null);
    }

    @Override // r2.InterfaceC0616a
    public Set<String> getDismissedMessagesId() {
        return this._prefs.getStringSet(com.onesignal.common.threading.a.BASE_THREAD_NAME, "PREFS_OS_DISPLAYED_IAMS", null);
    }

    @Override // r2.InterfaceC0616a
    public Set<String> getImpressionesMessagesId() {
        return this._prefs.getStringSet(com.onesignal.common.threading.a.BASE_THREAD_NAME, "PREFS_OS_IMPRESSIONED_IAMS", null);
    }

    @Override // r2.InterfaceC0616a
    public Long getLastTimeInAppDismissed() {
        return this._prefs.getLong(com.onesignal.common.threading.a.BASE_THREAD_NAME, "PREFS_OS_IAM_LAST_DISMISSED_TIME", null);
    }

    @Override // r2.InterfaceC0616a
    public String getSavedIAMs() {
        return this._prefs.getString(com.onesignal.common.threading.a.BASE_THREAD_NAME, "PREFS_OS_CACHED_IAMS", null);
    }

    @Override // r2.InterfaceC0616a
    public Set<String> getViewPageImpressionedIds() {
        return this._prefs.getStringSet(com.onesignal.common.threading.a.BASE_THREAD_NAME, "PREFS_OS_PAGE_IMPRESSIONED_IAMS", null);
    }

    @Override // r2.InterfaceC0616a
    public void setClickedMessagesId(Set<String> set) {
        this._prefs.saveStringSet(com.onesignal.common.threading.a.BASE_THREAD_NAME, "PREFS_OS_CLICKED_CLICK_IDS_IAMS", set);
    }

    @Override // r2.InterfaceC0616a
    public void setDismissedMessagesId(Set<String> set) {
        this._prefs.saveStringSet(com.onesignal.common.threading.a.BASE_THREAD_NAME, "PREFS_OS_DISPLAYED_IAMS", set);
    }

    @Override // r2.InterfaceC0616a
    public void setImpressionesMessagesId(Set<String> set) {
        this._prefs.saveStringSet(com.onesignal.common.threading.a.BASE_THREAD_NAME, "PREFS_OS_IMPRESSIONED_IAMS", set);
    }

    @Override // r2.InterfaceC0616a
    public void setLastTimeInAppDismissed(Long l7) {
        this._prefs.saveLong(com.onesignal.common.threading.a.BASE_THREAD_NAME, "PREFS_OS_IAM_LAST_DISMISSED_TIME", l7);
    }

    @Override // r2.InterfaceC0616a
    public void setSavedIAMs(String str) {
        this._prefs.saveString(com.onesignal.common.threading.a.BASE_THREAD_NAME, "PREFS_OS_CACHED_IAMS", str);
    }

    @Override // r2.InterfaceC0616a
    public void setViewPageImpressionedIds(Set<String> set) {
        this._prefs.saveStringSet(com.onesignal.common.threading.a.BASE_THREAD_NAME, "PREFS_OS_PAGE_IMPRESSIONED_IAMS", set);
    }
}
