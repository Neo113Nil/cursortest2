package j3;

import i3.InterfaceC0544a;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: j3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0571b implements InterfaceC0544a {
    @Override // i3.InterfaceC0544a
    public void trackOpenedEvent(String notificationId, String campaign) {
        Intrinsics.checkNotNullParameter(notificationId, "notificationId");
        Intrinsics.checkNotNullParameter(campaign, "campaign");
    }

    @Override // i3.InterfaceC0544a
    public void trackReceivedEvent(String notificationId, String campaign) {
        Intrinsics.checkNotNullParameter(notificationId, "notificationId");
        Intrinsics.checkNotNullParameter(campaign, "campaign");
    }

    @Override // i3.InterfaceC0544a
    public void trackInfluenceOpenEvent() {
    }
}
