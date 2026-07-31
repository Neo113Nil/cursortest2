package H2;

import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class b implements G2.a {
    @Override // G2.a
    public void trackOpenedEvent(String notificationId, String campaign) {
        i.e(notificationId, "notificationId");
        i.e(campaign, "campaign");
    }

    @Override // G2.a
    public void trackReceivedEvent(String notificationId, String campaign) {
        i.e(notificationId, "notificationId");
        i.e(campaign, "campaign");
    }

    @Override // G2.a
    public void trackInfluenceOpenEvent() {
    }
}
