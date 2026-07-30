package b5;

import android.location.Location;
import com.onesignal.common.events.d;
import v7.InterfaceC5133d;

/* renamed from: b5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC0528a extends d {
    @Override // com.onesignal.common.events.d
    /* synthetic */ boolean getHasSubscribers();

    Location getLastLocation();

    Object start(InterfaceC5133d interfaceC5133d);

    Object stop(InterfaceC5133d interfaceC5133d);

    @Override // com.onesignal.common.events.d
    /* synthetic */ void subscribe(Object obj);

    @Override // com.onesignal.common.events.d
    /* synthetic */ void unsubscribe(Object obj);
}
