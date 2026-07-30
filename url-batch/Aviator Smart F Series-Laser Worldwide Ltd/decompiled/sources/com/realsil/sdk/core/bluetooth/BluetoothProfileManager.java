package com.realsil.sdk.core.bluetooth;

import android.bluetooth.BluetoothA2dp;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothProfile;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.realsil.sdk.core.RtkCore;
import com.realsil.sdk.core.a.a;
import com.realsil.sdk.core.bluetooth.compat.BluetoothAdapterCompat;
import com.realsil.sdk.core.bluetooth.compat.BluetoothDeviceCompat;
import com.realsil.sdk.core.bluetooth.compat.BluetoothInputDeviceCompat;
import com.realsil.sdk.core.bluetooth.compat.BluetoothProfileCompat;
import com.realsil.sdk.core.bluetooth.utils.BluetoothHelper;
import com.realsil.sdk.core.compat.RtkContextCompat;
import com.realsil.sdk.core.logger.ZLogger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes4.dex */
public final class BluetoothProfileManager {
    public static final String BLUETOOTH_HEADSET_CLASS_NAME = "android.bluetooth.BluetoothHeadset";
    public static final String CLASS_NAME_BLUETOOTH_HID_HOST = "android.bluetooth.BluetoothHidHost";
    public static final int INDICATOR_A2DP = 1;
    public static final int INDICATOR_FULL = 255;
    public static final int INDICATOR_HEADSET = 4;
    public static final int INDICATOR_HID = 8;

    /* renamed from: k, reason: collision with root package name */
    public static BluetoothProfileManager f15417k;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f15418a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f15419b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f15420c;

    /* renamed from: d, reason: collision with root package name */
    public CopyOnWriteArrayList f15421d;

    /* renamed from: e, reason: collision with root package name */
    public final BluetoothAdapter f15422e;

    /* renamed from: i, reason: collision with root package name */
    public ProfileBroadcastReceiver f15426i;

    /* renamed from: f, reason: collision with root package name */
    public BluetoothHeadset f15423f = null;

    /* renamed from: g, reason: collision with root package name */
    public BluetoothA2dp f15424g = null;

    /* renamed from: h, reason: collision with root package name */
    public BluetoothProfile f15425h = null;

    /* renamed from: j, reason: collision with root package name */
    public final a f15427j = new a(this);

    public class ProfileBroadcastReceiver extends BroadcastReceiver {
        public ProfileBroadcastReceiver() {
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            char c8;
            String action = intent.getAction();
            action.getClass();
            switch (action.hashCode()) {
                case -1435586571:
                    if (action.equals("android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED")) {
                        c8 = 0;
                        break;
                    }
                    c8 = 65535;
                    break;
                case -1021360715:
                    if (action.equals(BluetoothInputDeviceCompat.ACTION_CONNECTION_STATE_CHANGED)) {
                        c8 = 1;
                        break;
                    }
                    c8 = 65535;
                    break;
                case -855499628:
                    if (action.equals("android.bluetooth.a2dp.profile.action.PLAYING_STATE_CHANGED")) {
                        c8 = 2;
                        break;
                    }
                    c8 = 65535;
                    break;
                case 545516589:
                    if (action.equals("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED")) {
                        c8 = 3;
                        break;
                    }
                    c8 = 65535;
                    break;
                case 1244161670:
                    if (action.equals("android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED")) {
                        c8 = 4;
                        break;
                    }
                    c8 = 65535;
                    break;
                default:
                    c8 = 65535;
                    break;
            }
            switch (c8) {
                case 0:
                    BluetoothDevice bluetoothDevice = (BluetoothDevice) com.realsil.sdk.core.f.a.a(intent, BluetoothDevice.class);
                    if (bluetoothDevice == null) {
                        return;
                    }
                    int intExtra = intent.getIntExtra("android.bluetooth.profile.extra.STATE", -1);
                    int intExtra2 = intent.getIntExtra("android.bluetooth.profile.extra.PREVIOUS_STATE", -1);
                    if (BluetoothProfileManager.this.f15418a) {
                        Locale locale = Locale.US;
                        ZLogger.d(BluetoothHelper.formatAddress(bluetoothDevice.getAddress(), true) + ": action=" + action + ", state: " + intExtra2 + "->" + intExtra);
                    }
                    CopyOnWriteArrayList copyOnWriteArrayList = BluetoothProfileManager.this.f15421d;
                    if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
                        Iterator it = BluetoothProfileManager.this.f15421d.iterator();
                        while (it.hasNext()) {
                            ((BluetoothProfileCallback) it.next()).onHfpAudioStateChanged(bluetoothDevice, intExtra);
                        }
                        return;
                    }
                    break;
                case 1:
                    BluetoothDevice bluetoothDevice2 = (BluetoothDevice) com.realsil.sdk.core.f.a.a(intent, BluetoothDevice.class);
                    int intExtra3 = intent.getIntExtra("android.bluetooth.profile.extra.STATE", -1);
                    int intExtra4 = intent.getIntExtra("android.bluetooth.profile.extra.PREVIOUS_STATE", -1);
                    if (bluetoothDevice2 == null) {
                        return;
                    }
                    if (BluetoothProfileManager.this.f15418a) {
                        Locale locale2 = Locale.US;
                        ZLogger.d(BluetoothHelper.formatAddress(bluetoothDevice2.getAddress(), true) + ": action=" + action + ", state: " + intExtra4 + "->" + intExtra3);
                    }
                    CopyOnWriteArrayList copyOnWriteArrayList2 = BluetoothProfileManager.this.f15421d;
                    if (copyOnWriteArrayList2 != null && copyOnWriteArrayList2.size() > 0) {
                        Iterator it2 = BluetoothProfileManager.this.f15421d.iterator();
                        while (it2.hasNext()) {
                            ((BluetoothProfileCallback) it2.next()).onHidStateChanged(bluetoothDevice2, intExtra3);
                        }
                        return;
                    }
                    break;
                case 2:
                    BluetoothDevice bluetoothDevice3 = (BluetoothDevice) com.realsil.sdk.core.f.a.a(intent, BluetoothDevice.class);
                    int intExtra5 = intent.getIntExtra("android.bluetooth.profile.extra.STATE", -1);
                    int intExtra6 = intent.getIntExtra("android.bluetooth.profile.extra.PREVIOUS_STATE", -1);
                    if (bluetoothDevice3 == null) {
                        return;
                    }
                    if (BluetoothProfileManager.this.f15418a) {
                        Locale locale3 = Locale.US;
                        ZLogger.d(BluetoothHelper.formatAddress(bluetoothDevice3.getAddress(), true) + ": action=" + action + ", state: " + intExtra6 + "->" + intExtra5);
                    }
                    CopyOnWriteArrayList copyOnWriteArrayList3 = BluetoothProfileManager.this.f15421d;
                    if (copyOnWriteArrayList3 != null && copyOnWriteArrayList3.size() > 0) {
                        Iterator it3 = BluetoothProfileManager.this.f15421d.iterator();
                        while (it3.hasNext()) {
                            ((BluetoothProfileCallback) it3.next()).onA2dpPlayingStateChanged(bluetoothDevice3, intExtra5);
                        }
                        return;
                    }
                    break;
                case 3:
                    BluetoothDevice bluetoothDevice4 = (BluetoothDevice) com.realsil.sdk.core.f.a.a(intent, BluetoothDevice.class);
                    int intExtra7 = intent.getIntExtra("android.bluetooth.profile.extra.STATE", -1);
                    int intExtra8 = intent.getIntExtra("android.bluetooth.profile.extra.PREVIOUS_STATE", -1);
                    if (bluetoothDevice4 == null) {
                        return;
                    }
                    if (BluetoothProfileManager.this.f15418a) {
                        Locale locale4 = Locale.US;
                        ZLogger.d("action=" + action + ", device:" + BluetoothHelper.formatAddress(bluetoothDevice4.getAddress(), true) + ", state: " + intExtra8 + "->" + intExtra7);
                    }
                    CopyOnWriteArrayList copyOnWriteArrayList4 = BluetoothProfileManager.this.f15421d;
                    if (copyOnWriteArrayList4 != null && copyOnWriteArrayList4.size() > 0) {
                        Iterator it4 = BluetoothProfileManager.this.f15421d.iterator();
                        while (it4.hasNext()) {
                            ((BluetoothProfileCallback) it4.next()).onHfpConnectionStateChanged(bluetoothDevice4, intExtra7);
                        }
                        return;
                    }
                    break;
                case 4:
                    BluetoothDevice bluetoothDevice5 = (BluetoothDevice) com.realsil.sdk.core.f.a.a(intent, BluetoothDevice.class);
                    int intExtra9 = intent.getIntExtra("android.bluetooth.profile.extra.STATE", -1);
                    int intExtra10 = intent.getIntExtra("android.bluetooth.profile.extra.PREVIOUS_STATE", -1);
                    if (bluetoothDevice5 == null) {
                        return;
                    }
                    if (BluetoothProfileManager.this.f15418a) {
                        Locale locale5 = Locale.US;
                        ZLogger.d(BluetoothHelper.formatAddress(bluetoothDevice5.getAddress(), true) + ": action=" + action + ", state: " + intExtra10 + "->" + intExtra9);
                    }
                    CopyOnWriteArrayList copyOnWriteArrayList5 = BluetoothProfileManager.this.f15421d;
                    if (copyOnWriteArrayList5 != null && copyOnWriteArrayList5.size() > 0) {
                        Iterator it5 = BluetoothProfileManager.this.f15421d.iterator();
                        while (it5.hasNext()) {
                            ((BluetoothProfileCallback) it5.next()).onA2dpStateChanged(bluetoothDevice5, intExtra9);
                        }
                        return;
                    }
                    break;
                default:
                    return;
            }
            ZLogger.v(BluetoothProfileManager.this.f15419b, "no callback registered");
        }
    }

    public BluetoothProfileManager(Context context) {
        this.f15418a = false;
        this.f15419b = false;
        this.f15426i = null;
        Context applicationContext = context.getApplicationContext();
        this.f15420c = applicationContext;
        this.f15418a = RtkCore.DEBUG;
        this.f15419b = RtkCore.VDBG;
        if (applicationContext == null) {
            ZLogger.w("not initialized");
            return;
        }
        if (this.f15422e == null) {
            BluetoothAdapter bluetoothAdapter = BluetoothAdapterCompat.getBluetoothAdapter(applicationContext);
            this.f15422e = bluetoothAdapter;
            if (bluetoothAdapter == null) {
                ZLogger.w("Unable to obtain a BluetoothAdapter.");
                return;
            }
        }
        registerProfiles();
        this.f15426i = new ProfileBroadcastReceiver();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.a2dp.profile.action.PLAYING_STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED");
        intentFilter.addAction(BluetoothInputDeviceCompat.ACTION_CONNECTION_STATE_CHANGED);
        RtkContextCompat.registerReceiver(applicationContext, this.f15426i, intentFilter);
    }

    public static BluetoothProfileManager getInstance() {
        return f15417k;
    }

    public static void initial(Context context) {
        if (f15417k == null) {
            synchronized (BluetoothProfileManager.class) {
                try {
                    if (f15417k == null) {
                        f15417k = new BluetoothProfileManager(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final boolean a() {
        BluetoothAdapter bluetoothAdapter = this.f15422e;
        if (bluetoothAdapter == null) {
            return false;
        }
        return bluetoothAdapter.isEnabled();
    }

    public void addManagerCallback(BluetoothProfileCallback bluetoothProfileCallback) {
        if (bluetoothProfileCallback == null) {
            return;
        }
        if (this.f15421d == null) {
            this.f15421d = new CopyOnWriteArrayList();
        }
        if (!this.f15421d.contains(bluetoothProfileCallback)) {
            this.f15421d.add(bluetoothProfileCallback);
        }
        ZLogger.v(this.f15419b, "mManagerCallbacks.size=" + this.f15421d.size());
    }

    public void close() {
        if (this.f15419b) {
            ZLogger.v("close()");
        }
        Context context = this.f15420c;
        if (context != null) {
            try {
                context.unregisterReceiver(this.f15426i);
            } catch (Exception e8) {
                ZLogger.e(e8.toString());
            }
        }
    }

    public void closeProfileProxy(int i8) {
        if (!a()) {
            ZLogger.w("BT not enabled");
            return;
        }
        try {
            Locale locale = Locale.US;
            ZLogger.v("profile=" + i8);
            if (i8 == 1) {
                this.f15422e.closeProfileProxy(i8, this.f15423f);
            } else if (i8 == 2) {
                this.f15422e.closeProfileProxy(i8, this.f15424g);
            } else {
                if (i8 != 4) {
                    return;
                }
                this.f15422e.closeProfileProxy(i8, this.f15425h);
            }
        } catch (Exception e8) {
            ZLogger.e(e8.toString());
        }
    }

    @Deprecated
    public boolean connectA2dpSource(BluetoothDevice bluetoothDevice) {
        return connectA2dpSource(bluetoothDevice, false);
    }

    public boolean connectHfpAg(String str) {
        return connectHfpAg(str, false);
    }

    public boolean connectHid(BluetoothDevice bluetoothDevice) {
        BluetoothProfile bluetoothProfile;
        String str;
        if (Build.VERSION.SDK_INT >= 28) {
            bluetoothProfile = this.f15425h;
            str = CLASS_NAME_BLUETOOTH_HID_HOST;
        } else {
            bluetoothProfile = this.f15425h;
            str = BluetoothInputDeviceCompat.CLASS_NAME;
        }
        return BluetoothProfileCompat.connectProfile(bluetoothProfile, str, bluetoothDevice);
    }

    public boolean connectProfile(int i8, BluetoothDevice bluetoothDevice) {
        BluetoothProfile bluetoothProfile;
        String str;
        if (i8 != 4) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            bluetoothProfile = this.f15425h;
            str = CLASS_NAME_BLUETOOTH_HID_HOST;
        } else {
            bluetoothProfile = this.f15425h;
            str = BluetoothInputDeviceCompat.CLASS_NAME;
        }
        return BluetoothProfileCompat.connectProfile(bluetoothProfile, str, bluetoothDevice);
    }

    public boolean disConnectHid(BluetoothDevice bluetoothDevice) {
        BluetoothProfile bluetoothProfile;
        String str;
        if (Build.VERSION.SDK_INT >= 28) {
            bluetoothProfile = this.f15425h;
            str = CLASS_NAME_BLUETOOTH_HID_HOST;
        } else {
            bluetoothProfile = this.f15425h;
            str = BluetoothInputDeviceCompat.CLASS_NAME;
        }
        return BluetoothProfileCompat.disconnect(bluetoothProfile, str, bluetoothDevice);
    }

    public boolean disconnectA2dpSource(BluetoothDevice bluetoothDevice) {
        return disconnectA2dpSource(bluetoothDevice, false);
    }

    public boolean disconnectHfp(String str) {
        return disconnectHfp(str, false);
    }

    public boolean disconnectProfile(int i8, BluetoothDevice bluetoothDevice) {
        BluetoothProfile bluetoothProfile;
        String str;
        if (i8 != 4) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            bluetoothProfile = this.f15425h;
            str = CLASS_NAME_BLUETOOTH_HID_HOST;
        } else {
            bluetoothProfile = this.f15425h;
            str = BluetoothInputDeviceCompat.CLASS_NAME;
        }
        return BluetoothProfileCompat.disconnect(bluetoothProfile, str, bluetoothDevice);
    }

    public List<BluetoothDevice> getConnectedDevices(int i8) {
        String str;
        if (!a()) {
            ZLogger.w("BT not enabled");
            return new ArrayList();
        }
        int i9 = 1;
        if (i8 != 1) {
            i9 = 2;
            if (i8 != 2) {
                i9 = 4;
                if (i8 == 4) {
                    BluetoothProfile bluetoothProfile = this.f15425h;
                    if (bluetoothProfile != null) {
                        return Build.VERSION.SDK_INT >= 28 ? BluetoothProfileCompat.getConnectedDevices(bluetoothProfile, CLASS_NAME_BLUETOOTH_HID_HOST) : BluetoothProfileCompat.getConnectedDevices(bluetoothProfile, BluetoothInputDeviceCompat.CLASS_NAME);
                    }
                    str = "HID_HOST profile not connected";
                }
                return new ArrayList();
            }
            BluetoothA2dp bluetoothA2dp = this.f15424g;
            if (bluetoothA2dp != null) {
                return bluetoothA2dp.getConnectedDevices();
            }
            str = "A2DP profile not connected";
        } else {
            BluetoothHeadset bluetoothHeadset = this.f15423f;
            if (bluetoothHeadset != null) {
                return bluetoothHeadset.getConnectedDevices();
            }
            str = "HEADSET profile not connected";
        }
        ZLogger.d(str);
        getProfileProxy(i9);
        return new ArrayList();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int getConnectionState(int i8, BluetoothDevice bluetoothDevice) {
        BluetoothProfile bluetoothProfile;
        if (!a()) {
            ZLogger.d("BT not enabled");
            return -1;
        }
        if (i8 == 1) {
            BluetoothHeadset bluetoothHeadset = this.f15423f;
            if (bluetoothHeadset != null) {
                return bluetoothHeadset.getConnectionState(bluetoothDevice);
            }
            ZLogger.d("HEADSET profile not connected");
            getProfileProxy(1);
        } else if (i8 != 2) {
            if (i8 != 4) {
                return 0;
            }
            bluetoothProfile = this.f15425h;
            if (bluetoothProfile == null) {
                return Build.VERSION.SDK_INT >= 28 ? BluetoothProfileCompat.getConnectionState(bluetoothProfile, CLASS_NAME_BLUETOOTH_HID_HOST, bluetoothDevice) : BluetoothProfileCompat.getConnectionState(bluetoothProfile, BluetoothInputDeviceCompat.CLASS_NAME, bluetoothDevice);
            }
            ZLogger.d("HID_HOST profile not connected");
            getProfileProxy(4);
            return 0;
        }
        BluetoothA2dp bluetoothA2dp = this.f15424g;
        if (bluetoothA2dp != null) {
            return bluetoothA2dp.getConnectionState(bluetoothDevice);
        }
        ZLogger.d("A2DP profile not connected");
        getProfileProxy(2);
        bluetoothProfile = this.f15425h;
        if (bluetoothProfile == null) {
        }
    }

    public BluetoothProfile getProfile(int i8) {
        if (i8 == 1) {
            return this.f15423f;
        }
        if (i8 == 2) {
            return this.f15424g;
        }
        if (i8 != 4) {
            return null;
        }
        return this.f15425h;
    }

    public boolean getProfileProxy(int i8) {
        try {
            if (!this.f15422e.getProfileProxy(this.f15420c, this.f15427j, i8)) {
                Locale locale = Locale.US;
                ZLogger.w("getProfileProxy " + i8 + " failed");
                return false;
            }
            if (!this.f15419b) {
                return true;
            }
            Locale locale2 = Locale.US;
            ZLogger.v("getProfileProxy " + i8 + " success");
            return true;
        } catch (Exception e8) {
            Locale locale3 = Locale.US;
            ZLogger.w("getProfileProxy " + i8 + " exception: " + e8.toString());
            return false;
        }
    }

    public int getProfileState(BluetoothProfile bluetoothProfile, BluetoothDevice bluetoothDevice) {
        if (!a()) {
            ZLogger.w("BT not enabled");
            return -1;
        }
        if (bluetoothProfile != null) {
            return bluetoothProfile.getConnectionState(bluetoothDevice);
        }
        ZLogger.d("profile is not supported");
        return -1;
    }

    public BluetoothDevice getRemoteDevice(String str) {
        if (a()) {
            return this.f15422e.getRemoteDevice(str);
        }
        ZLogger.w("BT not enabled");
        return null;
    }

    public boolean isDeviceConnected(BluetoothDevice bluetoothDevice) {
        if (bluetoothDevice == null) {
            ZLogger.d("no activeBluetoothDevice exist");
            return false;
        }
        int connectionState = getInstance().getConnectionState(1, bluetoothDevice);
        int connectionState2 = getInstance().getConnectionState(2, bluetoothDevice);
        boolean isConnected = BluetoothDeviceCompat.isConnected(bluetoothDevice);
        Locale locale = Locale.US;
        ZLogger.v(BluetoothHelper.formatAddress(bluetoothDevice.getAddress(), true) + ", connected=" + isConnected + ", hfpState= " + connectionState + ",a2dpState= " + connectionState2);
        return isConnected || 2 == connectionState || 2 == connectionState2;
    }

    public boolean isHidConnected(BluetoothDevice bluetoothDevice) {
        return bluetoothDevice != null && getInstance().getConnectionState(4, bluetoothDevice) == 2;
    }

    public boolean isProfileSupported(int i8) {
        return i8 != 1 ? i8 != 2 ? i8 == 4 && this.f15425h != null : this.f15424g != null : this.f15423f != null;
    }

    public void registerProfiles() {
        if (this.f15422e == null) {
            ZLogger.w("mBluetoothAdapter == null");
            return;
        }
        this.f15426i = new ProfileBroadcastReceiver();
        IntentFilter intentFilter = new IntentFilter();
        getProfileProxy(2);
        getProfileProxy(1);
        getProfileProxy(4);
        RtkContextCompat.registerReceiver(this.f15420c, this.f15426i, intentFilter);
    }

    public void removeManagerCallback(BluetoothProfileCallback bluetoothProfileCallback) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f15421d;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.remove(bluetoothProfileCallback);
        }
    }

    public boolean connectA2dpSource(BluetoothDevice bluetoothDevice, boolean z7) {
        if (bluetoothDevice == null) {
            ZLogger.w("can't find remote device.");
            return false;
        }
        BluetoothA2dp bluetoothA2dp = this.f15424g;
        if (bluetoothA2dp == null) {
            ZLogger.w("A2DP not initialized");
            getProfileProxy(2);
            return false;
        }
        if (z7 && bluetoothA2dp.getConnectionState(bluetoothDevice) == 2) {
            ZLogger.w("a2dp already connected");
            return true;
        }
        if (!a()) {
            ZLogger.w("BT not enabled");
            return false;
        }
        if (!BluetoothProfileCompat.setPriority(this.f15424g, bluetoothDevice, 100)) {
            ZLogger.v(this.f15419b, "setPriority failed");
        }
        return BluetoothProfileCompat.connectProfile(this.f15424g, bluetoothDevice);
    }

    public boolean connectHfpAg(String str, boolean z7) {
        BluetoothDevice remoteDevice = getRemoteDevice(str);
        if (remoteDevice == null) {
            return false;
        }
        BluetoothHeadset bluetoothHeadset = this.f15423f;
        if (bluetoothHeadset == null) {
            ZLogger.w("BluetoothHeadset service is not connected");
            getProfileProxy(1);
            return false;
        }
        if (!z7 || bluetoothHeadset.getConnectionState(remoteDevice) != 2) {
            return BluetoothProfileCompat.connectProfile(this.f15423f, remoteDevice);
        }
        ZLogger.w("BluetoothHeadset profile is already connected");
        return true;
    }

    public boolean disconnectA2dpSource(BluetoothDevice bluetoothDevice, boolean z7) {
        if (bluetoothDevice == null) {
            ZLogger.w("device is null");
            return false;
        }
        BluetoothA2dp bluetoothA2dp = this.f15424g;
        if (bluetoothA2dp == null) {
            ZLogger.w("A2DP not initialized");
            getProfileProxy(2);
            return false;
        }
        if (z7 && bluetoothA2dp.getConnectionState(bluetoothDevice) != 2) {
            ZLogger.w("A2DP already disconnected");
            return false;
        }
        if (!BluetoothProfileCompat.setPriority(this.f15424g, bluetoothDevice, 100)) {
            ZLogger.v(this.f15419b, "setPriority failed");
        }
        return BluetoothProfileCompat.disconnect(this.f15424g, bluetoothDevice);
    }

    public boolean disconnectHfp(String str, boolean z7) {
        BluetoothDevice remoteDevice = getRemoteDevice(str);
        if (remoteDevice == null) {
            return false;
        }
        BluetoothHeadset bluetoothHeadset = this.f15423f;
        if (bluetoothHeadset == null) {
            ZLogger.w("BluetoothHeadset service is not connected");
            getProfileProxy(1);
            return false;
        }
        if (!z7 || bluetoothHeadset.getConnectionState(remoteDevice) == 2) {
            return BluetoothProfileCompat.disconnect(this.f15423f, remoteDevice);
        }
        ZLogger.w("BluetoothHeadset profile is not connected");
        return false;
    }

    public int getConnectionState(int i8, String str) {
        return getConnectionState(i8, getRemoteDevice(str));
    }

    @Deprecated
    public boolean connectA2dpSource(String str) {
        return connectA2dpSource(getRemoteDevice(str), false);
    }

    public boolean connectHfpAg(byte[] bArr) {
        return connectHfpAg(BluetoothHelper.convertMac(bArr));
    }

    public boolean disconnectA2dpSource(String str) {
        return disconnectA2dpSource(getRemoteDevice(str));
    }

    public boolean disconnectHfp(byte[] bArr) {
        return disconnectHfp(BluetoothHelper.convertMac(bArr));
    }

    @Deprecated
    public boolean connectA2dpSource(String str, boolean z7) {
        return connectA2dpSource(getRemoteDevice(str), z7);
    }

    public boolean disconnectA2dpSource(byte[] bArr) {
        return disconnectA2dpSource(getRemoteDevice(BluetoothHelper.convertMac(bArr)));
    }

    public boolean connectA2dpSource(byte[] bArr) {
        return connectA2dpSource(getRemoteDevice(BluetoothHelper.convertMac(bArr)));
    }
}
