package f4;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import androidx.annotation.Nullable;
import java.util.Set;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final BluetoothAdapter f16658a;

    public a(@Nullable BluetoothAdapter bluetoothAdapter) {
        this.f16658a = bluetoothAdapter;
    }

    public BluetoothDevice a(String str) {
        return this.f16658a.getRemoteDevice(str);
    }

    public boolean b() {
        return this.f16658a != null;
    }

    public boolean c() {
        BluetoothAdapter bluetoothAdapter = this.f16658a;
        return bluetoothAdapter != null && bluetoothAdapter.isEnabled();
    }

    public Set<BluetoothDevice> a() {
        return this.f16658a.getBondedDevices();
    }
}
