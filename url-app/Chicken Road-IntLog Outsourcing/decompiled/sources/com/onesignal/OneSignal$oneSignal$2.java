package com.onesignal;

import com.onesignal.internal.OneSignalImp;
import kotlin.jvm.internal.j;
import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public final class OneSignal$oneSignal$2 extends j implements InterfaceC1430a {
    public static final OneSignal$oneSignal$2 INSTANCE = new OneSignal$oneSignal$2();

    public OneSignal$oneSignal$2() {
        super(0);
    }

    @Override // t4.InterfaceC1430a
    public final OneSignalImp invoke() {
        return new OneSignalImp(null, 1, null);
    }
}
