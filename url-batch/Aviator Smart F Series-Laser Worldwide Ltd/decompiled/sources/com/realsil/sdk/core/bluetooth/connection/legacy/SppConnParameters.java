package com.realsil.sdk.core.bluetooth.connection.legacy;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import androidx.annotation.NonNull;
import com.realsil.sdk.core.bluetooth.utils.BluetoothHelper;
import java.util.UUID;

/* loaded from: classes4.dex */
public final class SppConnParameters {

    /* renamed from: a, reason: collision with root package name */
    public final String f15518a;

    /* renamed from: b, reason: collision with root package name */
    public final BluetoothSocket f15519b;

    /* renamed from: c, reason: collision with root package name */
    public final UUID f15520c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f15521d;
    public static final UUID WELL_KNOWN_SPP_UUID = UUID.fromString("00001101-0000-1000-8000-00805F9B34FB");
    public static final UUID VENDOR_SPP_UUID = UUID.fromString("6A24EEAB-4B65-4693-986B-3C26C352264F");

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public final String f15522a;

        /* renamed from: b, reason: collision with root package name */
        public BluetoothSocket f15523b;

        /* renamed from: c, reason: collision with root package name */
        public UUID f15524c = SppConnParameters.VENDOR_SPP_UUID;

        /* renamed from: d, reason: collision with root package name */
        public boolean f15525d = false;

        @Deprecated
        public Builder(@NonNull BluetoothDevice bluetoothDevice) {
            this.f15522a = bluetoothDevice.getAddress();
        }

        public Builder bluetoothSocket(BluetoothSocket bluetoothSocket) {
            this.f15523b = bluetoothSocket;
            return this;
        }

        public SppConnParameters build() {
            return new SppConnParameters(this.f15522a, this.f15523b, this.f15524c, this.f15525d);
        }

        public Builder freshUuid(boolean z7) {
            this.f15525d = z7;
            return this;
        }

        public Builder uuid(UUID uuid) {
            if (uuid != null) {
                this.f15524c = uuid;
            }
            return this;
        }

        public Builder(@NonNull String str) {
            this.f15522a = str;
        }
    }

    public SppConnParameters(String str, BluetoothSocket bluetoothSocket, UUID uuid, boolean z7) {
        this.f15518a = str;
        this.f15519b = bluetoothSocket;
        this.f15520c = uuid;
        this.f15521d = z7;
    }

    public BluetoothSocket getBluetoothSocket() {
        return this.f15519b;
    }

    public String getDeviceAddress() {
        return this.f15518a;
    }

    public UUID getUuid() {
        return this.f15520c;
    }

    public boolean isFreshUuid() {
        return this.f15521d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SppConnParameters{\n\tdevice:");
        sb.append(BluetoothHelper.formatAddress(this.f15518a, true));
        if (this.f15520c != null) {
            sb.append("\n\tuuid:");
            sb.append(this.f15520c.toString());
        }
        sb.append("\n\tfreshUuid:");
        sb.append(this.f15521d);
        if (this.f15519b != null) {
            sb.append("\n\tsocket:");
            sb.append(this.f15519b.getRemoteDevice());
        }
        sb.append("\n}");
        return sb.toString();
    }
}
