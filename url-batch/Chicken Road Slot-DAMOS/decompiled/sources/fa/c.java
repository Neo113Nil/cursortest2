package fa;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c {
    private final Integer iamLimit;
    private final Integer indirectIAMAttributionWindow;
    private final Integer indirectNotificationAttributionWindow;
    private final Boolean isDirectEnabled;
    private final Boolean isIndirectEnabled;
    private final Boolean isUnattributedEnabled;
    private final Integer notificationLimit;

    public /* synthetic */ c(Integer num, Integer num2, Integer num3, Integer num4, Boolean bool, Boolean bool2, Boolean bool3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? null : num, (i3 & 2) != 0 ? null : num2, (i3 & 4) != 0 ? null : num3, (i3 & 8) != 0 ? null : num4, (i3 & 16) != 0 ? null : bool, (i3 & 32) != 0 ? null : bool2, (i3 & 64) != 0 ? null : bool3);
    }

    public final Integer getIamLimit() {
        return this.iamLimit;
    }

    public final Integer getIndirectIAMAttributionWindow() {
        return this.indirectIAMAttributionWindow;
    }

    public final Integer getIndirectNotificationAttributionWindow() {
        return this.indirectNotificationAttributionWindow;
    }

    public final Integer getNotificationLimit() {
        return this.notificationLimit;
    }

    public final Boolean isDirectEnabled() {
        return this.isDirectEnabled;
    }

    public final Boolean isIndirectEnabled() {
        return this.isIndirectEnabled;
    }

    public final Boolean isUnattributedEnabled() {
        return this.isUnattributedEnabled;
    }

    public c(Integer num, Integer num2, Integer num3, Integer num4, Boolean bool, Boolean bool2, Boolean bool3) {
        this.indirectNotificationAttributionWindow = num;
        this.notificationLimit = num2;
        this.indirectIAMAttributionWindow = num3;
        this.iamLimit = num4;
        this.isDirectEnabled = bool;
        this.isIndirectEnabled = bool2;
        this.isUnattributedEnabled = bool3;
    }

    public c() {
        this(null, null, null, null, null, null, null, 127, null);
    }
}
