package com.realsil.sdk.core.a;

import android.bluetooth.BluetoothA2dp;
import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothProfile;
import com.realsil.sdk.core.bluetooth.BluetoothProfileManager;
import com.realsil.sdk.core.bluetooth.compat.BluetoothProfileCompat;
import com.realsil.sdk.core.logger.ZLogger;

/* loaded from: classes4.dex */
public final class a implements BluetoothProfile.ServiceListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BluetoothProfileManager f15397a;

    public a(BluetoothProfileManager bluetoothProfileManager) {
        this.f15397a = bluetoothProfileManager;
    }

    @Override // android.bluetooth.BluetoothProfile.ServiceListener
    public final void onServiceConnected(int i8, BluetoothProfile bluetoothProfile) {
        ZLogger.d(BluetoothProfileCompat.parseProfile(i8) + "(" + bluetoothProfile.getClass().getName() + ") profile connected");
        if (i8 == 1) {
            this.f15397a.f15423f = (BluetoothHeadset) bluetoothProfile;
        } else if (i8 == 2) {
            this.f15397a.f15424g = (BluetoothA2dp) bluetoothProfile;
        } else {
            if (i8 != 4) {
                return;
            }
            this.f15397a.f15425h = bluetoothProfile;
        }
    }

    @Override // android.bluetooth.BluetoothProfile.ServiceListener
    public final void onServiceDisconnected(int i8) {
        ZLogger.d(BluetoothProfileCompat.parseProfile(i8) + " profile disconnected");
        if (i8 == 1) {
            this.f15397a.f15423f = null;
        } else if (i8 == 2) {
            this.f15397a.f15424g = null;
        } else if (i8 == 4) {
            this.f15397a.f15425h = null;
        }
    }
}
