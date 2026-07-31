package Q2;

import android.net.Uri;
import g2.InterfaceC0391a;
import java.security.SecureRandom;
import org.json.JSONObject;

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

    public d(com.onesignal.notifications.internal.c inNotification, JSONObject jsonPayload) {
        kotlin.jvm.internal.i.e(inNotification, "inNotification");
        kotlin.jvm.internal.i.e(jsonPayload, "jsonPayload");
        this.jsonPayload = jsonPayload;
        this.notification = setAndroidNotificationId(inNotification);
    }

    private final com.onesignal.notifications.internal.c setAndroidNotificationId(com.onesignal.notifications.internal.c cVar) {
        if (cVar != null && !cVar.hasNotificationId()) {
            cVar.setAndroidNotificationId(new SecureRandom().nextInt());
        }
        return cVar;
    }

    public final JSONObject getAdditionalData() {
        com.onesignal.notifications.internal.c cVar = this.notification;
        kotlin.jvm.internal.i.b(cVar);
        JSONObject additionalData = cVar.getAdditionalData();
        return additionalData == null ? new JSONObject() : additionalData;
    }

    public final int getAndroidId() {
        com.onesignal.notifications.internal.c cVar = this.notification;
        kotlin.jvm.internal.i.b(cVar);
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
        kotlin.jvm.internal.i.b(cVar);
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
        kotlin.jvm.internal.i.b(cVar);
        return cVar.getTitle();
    }

    public final boolean hasExtender() {
        com.onesignal.notifications.internal.c cVar = this.notification;
        kotlin.jvm.internal.i.b(cVar);
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
        kotlin.jvm.internal.i.e(jSONObject, "<set-?>");
        this.jsonPayload = jSONObject;
    }

    public final void setNotificationToDisplay(boolean z5) {
        this.isNotificationToDisplay = z5;
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

    public final void setRestoring(boolean z5) {
        this.isRestoring = z5;
    }

    public final void setShownTimeStamp(Long l7) {
        this.shownTimeStamp = l7;
    }

    public String toString() {
        return "NotificationGenerationJob{jsonPayload=" + this.jsonPayload + ", isRestoring=" + this.isRestoring + ", isNotificationToDisplay=" + this.isNotificationToDisplay + ", shownTimeStamp=" + this.shownTimeStamp + ", overriddenBodyFromExtender=" + ((Object) this.overriddenBodyFromExtender) + ", overriddenTitleFromExtender=" + ((Object) this.overriddenTitleFromExtender) + ", overriddenSound=" + this.overriddenSound + ", overriddenFlags=" + this.overriddenFlags + ", orgFlags=" + this.orgFlags + ", orgSound=" + this.orgSound + ", notification=" + this.notification + '}';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(JSONObject jsonPayload, InterfaceC0391a time) {
        this(new com.onesignal.notifications.internal.c(jsonPayload, time), jsonPayload);
        kotlin.jvm.internal.i.e(jsonPayload, "jsonPayload");
        kotlin.jvm.internal.i.e(time, "time");
    }
}
