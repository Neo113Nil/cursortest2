package e3;

import android.location.Location;
import com.onesignal.common.events.d;

/* renamed from: e3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC0373a extends d {
    @Override // com.onesignal.common.events.d
    /* synthetic */ boolean getHasSubscribers();

    Location getLastLocation();

    Object start(V5.b bVar);

    Object stop(V5.b bVar);

    @Override // com.onesignal.common.events.d
    /* synthetic */ void subscribe(Object obj);

    @Override // com.onesignal.common.events.d
    /* synthetic */ void unsubscribe(Object obj);
}
