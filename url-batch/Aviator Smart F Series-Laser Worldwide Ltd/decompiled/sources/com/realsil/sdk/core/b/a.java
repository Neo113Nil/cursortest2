package com.realsil.sdk.core.b;

import com.realsil.sdk.core.bluetooth.RtkBluetoothManagerCallback;

/* loaded from: classes4.dex */
public final class a extends RtkBluetoothManagerCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f15398a;

    public a(c cVar) {
        this.f15398a = cVar;
    }

    @Override // com.realsil.sdk.core.bluetooth.RtkBluetoothManagerCallback
    public final void onBluetoothStateChanged(int i8) {
        super.onBluetoothStateChanged(i8);
        c.a(this.f15398a, i8);
    }
}
