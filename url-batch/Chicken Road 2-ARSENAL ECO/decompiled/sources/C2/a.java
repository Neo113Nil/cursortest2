package C2;

import android.location.Location;
import com.onesignal.common.events.d;
import o5.InterfaceC0564d;

/* loaded from: classes.dex */
public interface a extends d {
    @Override // com.onesignal.common.events.d
    /* synthetic */ boolean getHasSubscribers();

    Location getLastLocation();

    Object start(InterfaceC0564d interfaceC0564d);

    Object stop(InterfaceC0564d interfaceC0564d);

    @Override // com.onesignal.common.events.d
    /* synthetic */ void subscribe(Object obj);

    @Override // com.onesignal.common.events.d
    /* synthetic */ void unsubscribe(Object obj);
}
