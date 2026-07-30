package w5;

import com.onesignal.common.events.d;
import v7.InterfaceC5133d;

/* renamed from: w5.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC5173b extends d {
    boolean getCanRequestPermission();

    @Override // com.onesignal.common.events.d
    /* synthetic */ boolean getHasSubscribers();

    Object prompt(boolean z8, InterfaceC5133d interfaceC5133d);

    @Override // com.onesignal.common.events.d
    /* synthetic */ void subscribe(Object obj);

    @Override // com.onesignal.common.events.d
    /* synthetic */ void unsubscribe(Object obj);
}
