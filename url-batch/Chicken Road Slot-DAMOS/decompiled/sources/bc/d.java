package bc;

import android.net.Uri;
import java.security.SecureRandom;
import org.json.JSONObject;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d {
    private boolean isNotificationToDisplay;
    private boolean isRestoring;
    private JSONObject jsonPayload;
    private final com.onesignal.notifications.internal.c notification;
    private Integer orgFlags;
    private Uri orgSound;
    private CharSequence overriddenBodyFromExtender;
    private Integer overriddenFlags;
    private Uri overriddenSound;
    private CharSequence overriddenTitleFromExtender;
    private Long shownTimeStamp;

    public d(com.onesignal.notifications.internal.c cVar, JSONObject jSONObject) {
        cVar.getClass();
        jSONObject.getClass();
        this.jsonPayload = jSONObject;
        this.notification = setAndroidNotificationId(cVar);
    }

    private final com.onesignal.notifications.internal.c setAndroidNotificationId(com.onesignal.notifications.internal.c cVar) {
        if (cVar != null && !cVar.hasNotificationId()) {
            cVar.setAndroidNotificationId(new SecureRandom().nextInt());
        }
        return cVar;
    }

    public final JSONObject getAdditionalData() {
        com.onesignal.notifications.internal.c cVar = this.notification;
        cVar.getClass();
        JSONObject additionalData = cVar.getAdditionalData();
        return additionalData == null ? new JSONObject() : additionalData;
    }

    public final int getAndroidId() {
        com.onesignal.notifications.internal.c cVar = this.notification;
        cVar.getClass();
        return cVar.getAndroidNotificationId();
    }

    public final String getApiNotificationId() {
        String notificationIdFromFCMJson = e.INSTANCE.getNotificationIdFromFCMJson(this.jsonPayload);
        return notificationIdFromFCMJson == null ? "" : notificationIdFromFCMJson;
    }

    public final CharSequence getBody() {
        CharSequence charSequence = this.overriddenBodyFromExtender;
        if (charSequence != null) {
            return charSequence;
        }
        com.onesignal.notifications.internal.c cVar = this.notification;
        cVar.getClass();
        return cVar.getBody();
    }

    public final JSONObject getJsonPayload() {
        return this.jsonPayload;
    }

    public final com.onesignal.notifications.internal.c getNotification() {
        return this.notification;
    }

    public final Integer getOrgFlags() {
        return this.orgFlags;
    }

    public final Uri getOrgSound() {
        return this.orgSound;
    }

    public final CharSequence getOverriddenBodyFromExtender() {
        return this.overriddenBodyFromExtender;
    }

    public final Integer getOverriddenFlags() {
        return this.overriddenFlags;
    }

    public final Uri getOverriddenSound() {
        return this.overriddenSound;
    }

    public final CharSequence getOverriddenTitleFromExtender() {
        return this.overriddenTitleFromExtender;
    }

    public final Long getShownTimeStamp() {
        return this.shownTimeStamp;
    }

    public final CharSequence getTitle() {
        CharSequence charSequence = this.overriddenTitleFromExtender;
        if (charSequence != null) {
            return charSequence;
        }
        com.onesignal.notifications.internal.c cVar = this.notification;
        cVar.getClass();
        return cVar.getTitle();
    }

    public final boolean hasExtender() {
        com.onesignal.notifications.internal.c cVar = this.notification;
        cVar.getClass();
        cVar.getNotificationExtender();
        return false;
    }

    public final boolean isNotificationToDisplay() {
        return this.isNotificationToDisplay;
    }

    public final boolean isRestoring() {
        return this.isRestoring;
    }

    public final void setJsonPayload(JSONObject jSONObject) {
        jSONObject.getClass();
        this.jsonPayload = jSONObject;
    }

    public final void setNotificationToDisplay(boolean z10) {
        this.isNotificationToDisplay = z10;
    }

    public final void setOrgFlags(Integer num) {
        this.orgFlags = num;
    }

    public final void setOrgSound(Uri uri) {
        this.orgSound = uri;
    }

    public final void setOverriddenBodyFromExtender(CharSequence charSequence) {
        this.overriddenBodyFromExtender = charSequence;
    }

    public final void setOverriddenFlags(Integer num) {
        this.overriddenFlags = num;
    }

    public final void setOverriddenSound(Uri uri) {
        this.overriddenSound = uri;
    }

    public final void setOverriddenTitleFromExtender(CharSequence charSequence) {
        this.overriddenTitleFromExtender = charSequence;
    }

    public final void setRestoring(boolean z10) {
        this.isRestoring = z10;
    }

    public final void setShownTimeStamp(Long l10) {
        this.shownTimeStamp = l10;
    }

    public String toString() {
        return "NotificationGenerationJob{jsonPayload=" + this.jsonPayload + ", isRestoring=" + this.isRestoring + ", isNotificationToDisplay=" + this.isNotificationToDisplay + ", shownTimeStamp=" + this.shownTimeStamp + ", overriddenBodyFromExtender=" + ((Object) this.overriddenBodyFromExtender) + ", overriddenTitleFromExtender=" + ((Object) this.overriddenTitleFromExtender) + ", overriddenSound=" + this.overriddenSound + ", overriddenFlags=" + this.overriddenFlags + ", orgFlags=" + this.orgFlags + ", orgSound=" + this.orgSound + ", notification=" + this.notification + '}';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(JSONObject jSONObject, sa.a aVar) {
        this(new com.onesignal.notifications.internal.c(jSONObject, aVar), jSONObject);
        jSONObject.getClass();
        aVar.getClass();
    }
}
