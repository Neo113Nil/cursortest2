package com.realsil.sdk.core.b;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import com.realsil.sdk.core.bluetooth.compat.BluetoothProfileCompat;
import com.realsil.sdk.core.bluetooth.connection.le.BluetoothGattCallbackCompat;
import com.realsil.sdk.core.bluetooth.connection.le.GattError;
import com.realsil.sdk.core.bluetooth.utils.BluetoothHelper;
import com.realsil.sdk.core.logger.ZLogger;
import com.realsil.sdk.core.utility.DataConverter;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

/* loaded from: classes4.dex */
public final class b extends BluetoothGattCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f15399a;

    public b(c cVar) {
        this.f15399a = cVar;
    }

    public final void a(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
        String address = bluetoothGatt.getDevice().getAddress();
        if (this.f15399a.f15401b) {
            ZLogger.d(String.format(Locale.US, ">> onCharacteristicChanged(%s):0x%02X-%s\n\t(%d)%s", BluetoothHelper.formatAddress(address, true), Integer.valueOf(bluetoothGattCharacteristic.getInstanceId()), bluetoothGattCharacteristic.getUuid(), Integer.valueOf(bArr.length), DataConverter.bytes2Hex(bArr)));
        }
        List list = (List) this.f15399a.f15407h.get(address);
        if (list == null || list.size() <= 0) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((BluetoothGattCallbackCompat) it.next()).onCharacteristicChanged(bluetoothGatt, bluetoothGattCharacteristic, bArr);
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        byte[] value = bluetoothGattCharacteristic.getValue();
        if (value == null) {
            value = new byte[0];
        }
        a(bluetoothGatt, bluetoothGattCharacteristic, value);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i8) {
        byte[] value = bluetoothGattCharacteristic.getValue();
        if (value == null) {
            value = new byte[0];
        }
        a(bluetoothGatt, bluetoothGattCharacteristic, value, i8);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i8) {
        String address = bluetoothGatt.getDevice().getAddress();
        if (this.f15399a.f15401b) {
            ZLogger.d(String.format(Locale.US, "<< onCharacteristicWrite(%s):%s 0x%02X-%s", BluetoothHelper.formatAddress(address, true), GattError.parse(i8), Integer.valueOf(bluetoothGattCharacteristic.getInstanceId()), bluetoothGattCharacteristic.getUuid()));
            byte[] value = bluetoothGattCharacteristic.getValue();
            if (value != null) {
                ZLogger.d("<<(" + value.length + ")" + DataConverter.bytes2Hex(value));
            }
        }
        synchronized (this.f15399a.f15410k) {
            this.f15399a.f15409j = true;
            this.f15399a.f15410k.notifyAll();
        }
        List list = (List) this.f15399a.f15407h.get(address);
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((BluetoothGattCallbackCompat) it.next()).onCharacteristicWrite(bluetoothGatt, bluetoothGattCharacteristic, i8);
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i8, int i9) {
        BluetoothDevice device = bluetoothGatt.getDevice();
        if (device == null) {
            return;
        }
        String address = device.getAddress();
        boolean z7 = this.f15399a.f15400a;
        Locale locale = Locale.US;
        ZLogger.v(z7, ">> onConnectionStateChange(" + BluetoothHelper.formatAddress(address, true) + "), status: " + GattError.parseConnectionError(i8) + " , newState: " + BluetoothProfileCompat.parseProfileState(i9));
        if (i8 == 0 && i9 == 2) {
            this.f15399a.f15408i.put(address, 2);
            this.f15399a.f15406g.put(address, bluetoothGatt);
        } else {
            this.f15399a.f15408i.put(address, 0);
        }
        this.f15399a.a(address, bluetoothGatt, i8, i9);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onDescriptorRead(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i8) {
        byte[] value = bluetoothGattDescriptor.getValue();
        if (value == null) {
            value = new byte[0];
        }
        a(bluetoothGatt, bluetoothGattDescriptor, i8, value);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i8) {
        String str;
        String address = bluetoothGatt.getDevice().getAddress();
        UUID uuid = bluetoothGattDescriptor.getCharacteristic().getUuid();
        if (this.f15399a.f15401b) {
            byte[] value = bluetoothGattDescriptor.getValue();
            if (value != null) {
                Locale locale = Locale.US;
                str = "<< onDescriptorWrite(" + BluetoothHelper.formatAddress(address, true) + "):" + GattError.parse(i8) + " {\n\tCharacteristic:" + uuid + "\n\tDescriptor:" + bluetoothGattDescriptor.getUuid() + "\n\tvalue:(" + value.length + ")" + DataConverter.bytes2Hex(value) + "\n}";
            } else {
                Locale locale2 = Locale.US;
                str = "<< onDescriptorWrite(" + BluetoothHelper.formatAddress(address, true) + "):" + GattError.parse(i8) + " {\n\tCharacteristic:" + uuid + "\n\tDescriptor:" + bluetoothGattDescriptor.getUuid() + "}";
            }
            ZLogger.d(str);
        }
        synchronized (this.f15399a.f15410k) {
            this.f15399a.f15409j = true;
            this.f15399a.f15410k.notifyAll();
        }
        List list = (List) this.f15399a.f15407h.get(address);
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((BluetoothGattCallbackCompat) it.next()).onDescriptorWrite(bluetoothGatt, bluetoothGattDescriptor, i8);
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onMtuChanged(BluetoothGatt bluetoothGatt, int i8, int i9) {
        String address = bluetoothGatt.getDevice().getAddress();
        Locale locale = Locale.US;
        ZLogger.d(">> onMtuChanged(" + GattError.parse(i9) + ") mtu=" + i8 + ", addr=" + BluetoothHelper.formatAddress(address, true));
        List list = (List) this.f15399a.f15407h.get(address);
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((BluetoothGattCallbackCompat) it.next()).onMtuChanged(bluetoothGatt, i8, i9);
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onPhyRead(BluetoothGatt bluetoothGatt, int i8, int i9, int i10) {
        super.onPhyRead(bluetoothGatt, i8, i9, i10);
        String address = bluetoothGatt.getDevice().getAddress();
        if (this.f15399a.f15400a) {
            Locale locale = Locale.US;
            ZLogger.d("<< onPhyRead(" + BluetoothHelper.formatAddress(address, true) + ") " + GattError.parse(i10) + ": txPhy=" + i8 + ", rxPhy=" + i9);
        }
        List list = (List) this.f15399a.f15407h.get(address);
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((BluetoothGattCallbackCompat) it.next()).onPhyRead(bluetoothGatt, i8, i9, i10);
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onPhyUpdate(BluetoothGatt bluetoothGatt, int i8, int i9, int i10) {
        super.onPhyUpdate(bluetoothGatt, i8, i9, i10);
        String address = bluetoothGatt.getDevice().getAddress();
        boolean z7 = this.f15399a.f15400a;
        Locale locale = Locale.US;
        ZLogger.d(z7, ">> onPhyUpdate(" + BluetoothHelper.formatAddress(address, true) + ") " + GattError.parse(i10) + ": txPhy=" + i8 + ", rxPhy=" + i9);
        List list = (List) this.f15399a.f15407h.get(address);
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((BluetoothGattCallbackCompat) it.next()).onPhyUpdate(bluetoothGatt, i8, i9, i10);
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onReadRemoteRssi(BluetoothGatt bluetoothGatt, int i8, int i9) {
        super.onReadRemoteRssi(bluetoothGatt, i8, i9);
        if (this.f15399a.f15400a) {
            String address = bluetoothGatt.getDevice().getAddress();
            Locale locale = Locale.US;
            ZLogger.v("onReadRemoteRssi(" + BluetoothHelper.formatAddress(address, true) + "):rssi=" + i8 + ", status=" + i9);
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onReliableWriteCompleted(BluetoothGatt bluetoothGatt, int i8) {
        super.onReliableWriteCompleted(bluetoothGatt, i8);
        if (this.f15399a.f15400a) {
            String address = bluetoothGatt.getDevice().getAddress();
            Locale locale = Locale.US;
            ZLogger.v("onReliableWriteCompleted(" + BluetoothHelper.formatAddress(address, true) + "):status=" + i8);
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onServiceChanged(BluetoothGatt bluetoothGatt) {
        super.onServiceChanged(bluetoothGatt);
        String address = bluetoothGatt.getDevice().getAddress();
        if (this.f15399a.f15400a) {
            ZLogger.v("onServiceChanged(" + BluetoothHelper.formatAddress(address, true) + ")");
        }
        List list = (List) this.f15399a.f15407h.get(address);
        if (list == null || list.size() <= 0) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((BluetoothGattCallbackCompat) it.next()).onServiceChanged(bluetoothGatt);
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i8) {
        String address = bluetoothGatt.getDevice().getAddress();
        Locale locale = Locale.US;
        ZLogger.d(">> onServicesDiscovered(" + BluetoothHelper.formatAddress(address, true) + "), status=" + GattError.parse(i8));
        if (c.DUMP_SERVICE) {
            ZLogger.v(BluetoothHelper.dumpBluetoothGattService(bluetoothGatt));
        }
        List list = (List) this.f15399a.f15407h.get(address);
        if (list == null || list.size() <= 0) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((BluetoothGattCallbackCompat) it.next()).onServicesDiscovered(bluetoothGatt, i8);
        }
    }

    public final void a(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr, int i8) {
        String address = bluetoothGatt.getDevice().getAddress();
        if (this.f15399a.f15400a) {
            ZLogger.d(String.format(Locale.US, "<< onCharacteristicRead(%s): 0x%02X-%s, %s \n\t(%d)%s", BluetoothHelper.formatAddress(address, true), Integer.valueOf(bluetoothGattCharacteristic.getInstanceId()), bluetoothGattCharacteristic.getUuid(), GattError.parse(i8), Integer.valueOf(bArr.length), DataConverter.bytes2Hex(bArr)));
        }
        synchronized (this.f15399a.f15410k) {
            this.f15399a.f15409j = true;
            this.f15399a.f15410k.notifyAll();
        }
        List list = (List) this.f15399a.f15407h.get(address);
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((BluetoothGattCallbackCompat) it.next()).onCharacteristicRead(bluetoothGatt, bluetoothGattCharacteristic, bArr, i8);
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
        a(bluetoothGatt, bluetoothGattCharacteristic, bArr);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr, int i8) {
        a(bluetoothGatt, bluetoothGattCharacteristic, bArr, i8);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onDescriptorRead(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i8, byte[] bArr) {
        a(bluetoothGatt, bluetoothGattDescriptor, i8, bArr);
    }

    public final void a(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i8, byte[] bArr) {
        String address = bluetoothGatt.getDevice().getAddress();
        if (this.f15399a.f15401b) {
            Locale locale = Locale.US;
            ZLogger.d("<< onDescriptorRead(" + BluetoothHelper.formatAddress(address, true) + "):" + GattError.parse(i8) + ", " + bluetoothGattDescriptor.getUuid() + "\n\t(" + bArr.length + ")" + DataConverter.bytes2Hex(bArr));
        }
        List list = (List) this.f15399a.f15407h.get(address);
        if (list == null || list.size() <= 0) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((BluetoothGattCallbackCompat) it.next()).onDescriptorRead(bluetoothGatt, bluetoothGattDescriptor, i8, bArr);
        }
    }
}
