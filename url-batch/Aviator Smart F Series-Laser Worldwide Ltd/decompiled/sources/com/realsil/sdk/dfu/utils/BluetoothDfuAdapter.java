package com.realsil.sdk.dfu.utils;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.exoplayer2.C;
import com.realsil.sdk.core.bluetooth.BluetoothProfileCallback;
import com.realsil.sdk.core.bluetooth.BluetoothProfileManager;
import com.realsil.sdk.core.bluetooth.RtkBluetoothManager;
import com.realsil.sdk.core.bluetooth.RtkBluetoothManagerCallback;
import com.realsil.sdk.core.bluetooth.compat.BluetoothDeviceCompat;
import com.realsil.sdk.core.logger.ZLogger;
import com.realsil.sdk.core.utility.StringUtils;
import com.realsil.sdk.dfu.DfuException;
import com.realsil.sdk.dfu.exception.LoadFileException;
import com.realsil.sdk.dfu.image.FirmwareLoaderX;
import com.realsil.sdk.dfu.image.LoadParams;
import com.realsil.sdk.dfu.model.BinInfo;
import com.realsil.sdk.dfu.model.BinParameters;
import com.realsil.sdk.dfu.model.DfuConfig;
import com.realsil.sdk.dfu.model.OtaDeviceInfo;
import com.realsil.sdk.dfu.utils.ConnectParams;
import com.realsil.sdk.dfu.utils.DfuAdapter;
import java.io.File;
import java.util.Locale;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public abstract class BluetoothDfuAdapter extends DfuAdapter {
    public RtkBluetoothManager A;
    public BluetoothDevice B;
    public final Object C;
    public String D;
    public ThreadPoolExecutor E;
    public final Runnable F;
    public final RtkBluetoothManagerCallback G;
    public BluetoothProfileCallback H;

    /* renamed from: y, reason: collision with root package name */
    public BluetoothAdapter f16350y;

    /* renamed from: z, reason: collision with root package name */
    public BluetoothProfileManager f16351z;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BluetoothDfuAdapter bluetoothDfuAdapter = BluetoothDfuAdapter.this;
            if (bluetoothDfuAdapter.f16388o != 512) {
                bluetoothDfuAdapter.f16388o = 512;
            }
            bluetoothDfuAdapter.processConnectRunnable();
        }
    }

    public class b extends RtkBluetoothManagerCallback {
        public b() {
        }

        @Override // com.realsil.sdk.core.bluetooth.RtkBluetoothManagerCallback
        public void onBondStateChanged(BluetoothDevice bluetoothDevice, int i8) {
            super.onBondStateChanged(bluetoothDevice, i8);
            BluetoothDevice bluetoothDevice2 = BluetoothDfuAdapter.this.B;
            if (bluetoothDevice2 == null || !bluetoothDevice2.equals(bluetoothDevice)) {
                ZLogger.v(BluetoothDfuAdapter.this.f16382i, "bonded device not match with current device");
            } else {
                BluetoothDfuAdapter.this.processBondStateChanged(i8);
            }
        }
    }

    public BluetoothDfuAdapter(Context context) {
        this(context, null);
    }

    @Override // com.realsil.sdk.dfu.utils.DfuAdapter
    public void a() {
        super.a();
        this.f16350y = BluetoothAdapter.getDefaultAdapter();
        getOtaDeviceInfo().setMode(2);
        this.H = getBluetoothProfileCallback();
        BluetoothProfileManager bluetoothProfileManager = BluetoothProfileManager.getInstance();
        this.f16351z = bluetoothProfileManager;
        if (bluetoothProfileManager == null) {
            BluetoothProfileManager.initial(this.mContext);
            this.f16351z = BluetoothProfileManager.getInstance();
        }
        BluetoothProfileManager bluetoothProfileManager2 = this.f16351z;
        if (bluetoothProfileManager2 != null) {
            bluetoothProfileManager2.addManagerCallback(this.H);
        } else {
            ZLogger.w(this.f16381h, "BluetoothProfileManager not initialized");
        }
        RtkBluetoothManager rtkBluetoothManager = RtkBluetoothManager.getInstance();
        this.A = rtkBluetoothManager;
        if (rtkBluetoothManager == null) {
            RtkBluetoothManager.initial(this.mContext);
            this.A = RtkBluetoothManager.getInstance();
        }
        RtkBluetoothManager rtkBluetoothManager2 = this.A;
        if (rtkBluetoothManager2 != null) {
            rtkBluetoothManager2.addManagerCallback(this.G);
        } else {
            ZLogger.w("BluetoothProfileManager not initialized");
        }
        this.E = new ThreadPoolExecutor(10, 10, 1000L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new ThreadPoolExecutor.AbortPolicy());
    }

    public final int b(BluetoothDevice bluetoothDevice) {
        if (bluetoothDevice == null) {
            return 2;
        }
        return this.f16351z.getConnectionState(4, bluetoothDevice);
    }

    public void c() {
        int connectionState = this.f16351z.getConnectionState(2, this.B);
        ZLogger.v(this.f16382i, String.format("a2dpState = 0x%02X", Integer.valueOf(connectionState)));
        if (connectionState == 0 && !this.f16351z.connectA2dpSource(this.D)) {
            ZLogger.w("connect A2DP failed");
        }
        int connectionState2 = this.f16351z.getConnectionState(1, this.B);
        ZLogger.v(this.f16382i, String.format("hfpState = 0x%02X", Integer.valueOf(connectionState2)));
        if (connectionState2 != 0 || this.f16351z.connectHfpAg(this.D)) {
            return;
        }
        ZLogger.w("connect Hfp failed");
    }

    public boolean checkImage(int i8, String str, boolean z7, boolean z8, boolean z9, OtaDeviceInfo otaDeviceInfo) {
        BinInfo loadImageBinInfo = FirmwareLoaderX.loadImageBinInfo(new LoadParams.Builder().with(this.mContext).binParameters(new BinParameters.Builder().filePath(str).storageType(i8).build()).setOtaDeviceInfo(otaDeviceInfo).setSectionSizeCheckEnabled(z8).setIcCheckEnabled(z9).versionCheckEnabled(z7).build());
        return loadImageBinInfo != null && loadImageBinInfo.status == 4096;
    }

    public boolean checkUpgrade(File file, int i8) {
        return checkUpgrade(file, true, i8);
    }

    public boolean connectDevice(BluetoothDevice bluetoothDevice, boolean z7) {
        return connectDevice(new ConnectParams.Builder().address(bluetoothDevice.getAddress()).hid(z7).build());
    }

    public void d() {
        int connectionState = this.f16351z.getConnectionState(2, this.B);
        if (2 == connectionState) {
            ZLogger.v("A2DP already connected");
            return;
        }
        if (1 == connectionState) {
            ZLogger.d(this.f16381h, "A2DP already connecting..., wait create A2DP result");
            notifyStateChanged(this.f16388o, 18);
            a(30000L);
            int connectionState2 = this.f16351z.getConnectionState(2, this.B);
            ZLogger.v(this.f16382i, String.format("a2dpState = 0x%02X", Integer.valueOf(connectionState2)));
            if (connectionState2 != 0) {
                return;
            } else {
                ZLogger.d("A2DP back connect failed");
            }
        } else {
            ZLogger.v(this.f16382i, String.format("a2dpState = 0x%02X", Integer.valueOf(connectionState)));
        }
        notifyStateChanged(this.f16388o, 18);
        if (!this.f16351z.connectA2dpSource(this.D)) {
            ZLogger.w("connect A2DP failed");
            return;
        }
        ZLogger.v(this.f16382i, "wait create A2DP result");
        a(30000L);
        int connectionState3 = this.f16351z.getConnectionState(2, this.B);
        ZLogger.v(this.f16382i, String.format("a2dpState = 0x%02X", Integer.valueOf(connectionState3)));
        if (2 != connectionState3) {
            ZLogger.d("A2DP connect failed");
        }
    }

    @Override // com.realsil.sdk.dfu.utils.DfuAdapter
    public void destroy() {
        super.destroy();
        this.B = null;
        this.D = null;
        RtkBluetoothManager rtkBluetoothManager = this.A;
        if (rtkBluetoothManager != null) {
            rtkBluetoothManager.removeManagerCallback(this.G);
        }
        BluetoothProfileManager bluetoothProfileManager = this.f16351z;
        if (bluetoothProfileManager != null) {
            bluetoothProfileManager.removeManagerCallback(this.H);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void e() {
        boolean z7;
        int connectionState = this.f16351z.getConnectionState(1, this.B);
        if (2 != connectionState) {
            if (1 == connectionState) {
                ZLogger.v(this.f16382i, "HFP already connecting..., wait create hfp result");
                notifyStateChanged(this.f16388o, 19);
                a(30000L);
                connectionState = this.f16351z.getConnectionState(1, this.B);
                ZLogger.v(this.f16382i, String.format("hfpState = 0x%02X", Integer.valueOf(connectionState)));
                if (connectionState == 0) {
                    ZLogger.d(this.f16381h, "HFP back connect failed");
                }
            }
            z7 = true;
            if (z7) {
                return;
            }
            ZLogger.v(this.f16382i, String.format("hfpState = 0x%02X", Integer.valueOf(connectionState)));
            notifyStateChanged(this.f16388o, 19);
            if (!this.f16351z.connectHfpAg(this.D)) {
                ZLogger.w("connect HFP failed");
                return;
            }
            ZLogger.v(this.f16382i, "wait connect HFP result");
            a(30000L);
            int connectionState2 = this.f16351z.getConnectionState(1, this.B);
            ZLogger.v(this.f16382i, String.format("hfpState = 0x%02X", Integer.valueOf(connectionState2)));
            if (2 != connectionState2) {
                ZLogger.d(this.f16381h, "hfp connect failed");
                return;
            }
            return;
        }
        ZLogger.d(this.f16381h, "HFP already connected");
        z7 = false;
        if (z7) {
        }
    }

    public boolean f() {
        int bondState = getBondState(this.D);
        if (bondState == 11) {
            ZLogger.v(this.f16382i, "wait bonding result");
            a(30000L);
            bondState = getBondState(this.D);
            if (bondState != 12) {
                ZLogger.d(this.f16381h, "bonding failed, maybe link key lost, force to remove bond here");
                BluetoothDeviceCompat.removeBond(this.B);
                a(1000L);
                bondState = getBondState(this.D);
            }
        }
        if (bondState == 10) {
            notifyStateChanged(this.f16388o, 20);
            if (BluetoothDeviceCompat.createBond(this.B)) {
                ZLogger.v(this.f16382i, "wait create bond result");
                a(30000L);
            } else {
                ZLogger.w(this.f16381h, "createBond failed");
            }
            bondState = getBondState(this.D);
        }
        ZLogger.v(this.f16382i, String.format(Locale.US, ">> bondState: %d", Integer.valueOf(bondState)));
        return bondState == 12;
    }

    public void g() {
        this.E.execute(this.F);
    }

    public BluetoothProfileCallback getBluetoothProfileCallback() {
        return null;
    }

    public int getBondState(BluetoothDevice bluetoothDevice) {
        if (this.f16350y == null || bluetoothDevice == null) {
            return 10;
        }
        return bluetoothDevice.getBondState();
    }

    public OtaDeviceInfo getOtaDeviceInfo() {
        return new OtaDeviceInfo(2);
    }

    public BluetoothDevice getRemoteDevice(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        BluetoothAdapter bluetoothAdapter = this.f16350y;
        if (bluetoothAdapter == null) {
            ZLogger.w("mBluetoothAdapter == null");
            return null;
        }
        try {
            return bluetoothAdapter.getRemoteDevice(str);
        } catch (Exception e8) {
            ZLogger.e(e8.toString());
            return null;
        }
    }

    public void h() {
        this.E.remove(this.F);
    }

    public void i() {
        ThreadPoolExecutor threadPoolExecutor = this.E;
        if (threadPoolExecutor != null) {
            threadPoolExecutor.shutdown();
        }
    }

    public boolean isBluetoothSupported() {
        return this.f16350y != null;
    }

    public boolean isHidConnect(BluetoothDevice bluetoothDevice) {
        return b(bluetoothDevice) == 2;
    }

    public boolean j() {
        int connectionState = this.f16351z.getConnectionState(1, this.B);
        if (2 == connectionState) {
            ZLogger.d(this.f16381h, "HFP already connected");
            return true;
        }
        if (1 == connectionState) {
            ZLogger.v(this.f16382i, "HFP connecting...");
            notifyStateChanged(this.f16388o, 19);
        } else {
            if (3 == connectionState) {
                notifyStateChanged(this.f16388o, 19);
                ZLogger.v(this.f16382i, "HFP disconnecting...");
                b(30000L);
            } else {
                notifyStateChanged(this.f16388o, 19);
            }
            ZLogger.v(this.f16381h, "wait HFP profile connect back");
        }
        b(30000L);
        int connectionState2 = this.f16351z.getConnectionState(1, this.B);
        ZLogger.v(this.f16382i, String.format("hfpState = 0x%02X", Integer.valueOf(connectionState2)));
        if (connectionState2 != 0) {
            return true;
        }
        ZLogger.w(this.f16381h, "HFP back connect failed");
        return false;
    }

    public void notifyHfpLock() {
        try {
            synchronized (this.C) {
                this.C.notifyAll();
            }
        } catch (Exception e8) {
            ZLogger.w(e8.toString());
        }
    }

    public int preCheck(OtaDeviceInfo otaDeviceInfo, DfuConfig dfuConfig) {
        boolean z7;
        String format;
        try {
            BinInfo loadImageBinInfo = FirmwareLoaderX.loadImageBinInfo(new LoadParams.Builder().with(this.mContext).binParameters(dfuConfig.getBinParameters()).setSectionSizeCheckEnabled(dfuConfig.isSectionSizeCheckEnabled()).setIcCheckEnabled(dfuConfig.isIcCheckEnabled()).versionCheckEnabled(dfuConfig.isVersionCheckEnabled(), dfuConfig.getVersionCheckMode()).setWorkMode(dfuConfig.getOtaWorkMode()).setOtaDeviceInfo(otaDeviceInfo).build());
            if (loadImageBinInfo == null) {
                ZLogger.w("load binInfo failed");
                return 4097;
            }
            if (loadImageBinInfo.status != 4096) {
                ZLogger.w("checkImage failed");
                return loadImageBinInfo.status;
            }
            if (dfuConfig.isBatteryCheckEnabled() && otaDeviceInfo.isBasSupported()) {
                if (otaDeviceInfo.isRwsEnabled()) {
                    if (otaDeviceInfo.getPrimaryBat() > 0 && otaDeviceInfo.getPrimaryBat() < dfuConfig.getLowBatteryThreshold()) {
                        z7 = this.f16381h;
                        format = String.format("primary battery can not be less thant %d", Integer.valueOf(dfuConfig.getLowBatteryThreshold()));
                    } else if (otaDeviceInfo.getSecondaryBat() > 0 && otaDeviceInfo.getSecondaryBat() < dfuConfig.getLowBatteryThreshold()) {
                        z7 = this.f16381h;
                        format = String.format("secondary battery can not be less thant %d", Integer.valueOf(dfuConfig.getLowBatteryThreshold()));
                    }
                    ZLogger.d(z7, format);
                    return DfuException.ERROR_BATTERY_LEVEL_LOW;
                }
                if (otaDeviceInfo.getPrimaryBat() < dfuConfig.getLowBatteryThreshold()) {
                    z7 = this.f16381h;
                    format = String.format("battery can not be less thant %d", Integer.valueOf(dfuConfig.getLowBatteryThreshold()));
                    ZLogger.d(z7, format);
                    return DfuException.ERROR_BATTERY_LEVEL_LOW;
                }
            }
            return 0;
        } catch (LoadFileException e8) {
            return e8.getErrCode();
        }
    }

    public void processBondStateChanged(int i8) {
        switch (i8) {
            case 10:
                ZLogger.v(this.f16382i, "BOND_NONE");
                if (checkState(this.f16388o, 20)) {
                    notifyLock();
                    break;
                }
                break;
            case 11:
                ZLogger.v(this.f16382i, "BOND_BONDING");
                break;
            case 12:
                ZLogger.v(this.f16381h, "BOND_BONDED");
                if (checkState(this.f16388o, 20)) {
                    notifyLock();
                    break;
                }
                break;
        }
    }

    public void processConnectRunnable() {
    }

    public void processHidStateChanged(int i8) {
    }

    @Deprecated
    public boolean startOtaProcedure(DfuConfig dfuConfig) {
        return startOtaProcedure(dfuConfig, getOtaDeviceInfo(), true);
    }

    @Deprecated
    public boolean startOtaProcess(DfuConfig dfuConfig) {
        return startOtaProcedure(dfuConfig, getOtaDeviceInfo(), true);
    }

    public BluetoothDfuAdapter(Context context, DfuAdapter.DfuHelperCallback dfuHelperCallback) {
        this.C = new Object();
        this.F = new a();
        this.G = new b();
        ZLogger.v(this.f16381h, "create BluetoothDfuAdapter");
        this.mContext = context;
        a();
        this.f16386m = dfuHelperCallback;
    }

    public void a(DfuException dfuException, boolean z7) {
        if (z7) {
            return;
        }
        disconnect();
        notifyError(dfuException.getErrType(), dfuException.getErrCode());
    }

    public void b(long j8) {
        synchronized (this.C) {
            try {
                this.C.wait(j8);
            } catch (InterruptedException unused) {
            }
        }
    }

    public boolean checkImage(DfuConfig dfuConfig, OtaDeviceInfo otaDeviceInfo) {
        BinInfo loadImageBinInfo = FirmwareLoaderX.loadImageBinInfo(new LoadParams.Builder().with(this.mContext).binParameters(dfuConfig.getBinParameters()).setSectionSizeCheckEnabled(dfuConfig.isSectionSizeCheckEnabled()).setIcCheckEnabled(dfuConfig.isIcCheckEnabled()).versionCheckEnabled(dfuConfig.isVersionCheckEnabled(), dfuConfig.getVersionCheckMode()).setWorkMode(dfuConfig.getOtaWorkMode()).setOtaDeviceInfo(otaDeviceInfo).build());
        return loadImageBinInfo != null && loadImageBinInfo.status == 4096;
    }

    public boolean checkUpgrade(File file, boolean z7, int i8) {
        String obj;
        if (getOtaDeviceInfo() == null) {
            obj = "please reConnectToDevice() method to connect and get otaDeviceInfo first.";
        } else {
            try {
                if (checkImage(0, file.getPath(), z7, false, false, getOtaDeviceInfo())) {
                    return !getOtaDeviceInfo().isBasSupported() || getOtaDeviceInfo().getPrimaryBat() >= i8;
                }
                return false;
            } catch (DfuException e8) {
                obj = e8.toString();
            }
        }
        ZLogger.w(obj);
        return false;
    }

    @Override // com.realsil.sdk.dfu.utils.DfuAdapter
    public boolean connectDevice(ConnectParams connectParams) {
        if (!super.connectDevice(connectParams)) {
            return false;
        }
        if (!StringUtils.isEmpty(this.f16384k.getAddress())) {
            return true;
        }
        ZLogger.w("address is null or empty");
        return false;
    }

    public int getBondState(String str) {
        return getBondState(getRemoteDevice(str));
    }

    public boolean startOtaProcedure(DfuConfig dfuConfig, OtaDeviceInfo otaDeviceInfo, boolean z7) {
        int preCheck;
        if (dfuConfig == null) {
            ZLogger.w("dfuConfig cannot be null");
            throw new IllegalArgumentException("dfuConfig cannot be null");
        }
        if (otaDeviceInfo != null) {
            dfuConfig.setProtocolType(otaDeviceInfo.getProtocolType());
        }
        if (z7 && otaDeviceInfo != null && (preCheck = preCheck(otaDeviceInfo, dfuConfig)) != 0) {
            notifyError(preCheck);
            return false;
        }
        this.f16392s = otaDeviceInfo;
        this.f16393t = dfuConfig;
        return true;
    }

    public boolean a(BluetoothDevice bluetoothDevice) {
        if (bluetoothDevice == null) {
            return false;
        }
        int b8 = b(bluetoothDevice);
        if (2 == b8) {
            ZLogger.v(this.f16381h, "HID already connected");
            return false;
        }
        if (1 == b8) {
            ZLogger.d(this.f16382i, "HID already connecting..., wait create HID result");
            notifyStateChanged(this.f16388o | 17);
            a(C.DEFAULT_SEEK_FORWARD_INCREMENT_MS);
            int b9 = b(bluetoothDevice);
            ZLogger.v(this.f16382i, String.format("hidState = 0x%02X", Integer.valueOf(b9)));
            if (b9 != 0) {
                return false;
            }
            ZLogger.d(this.f16381h, "HID back connect failed");
        } else {
            ZLogger.v(this.f16382i, String.format("hidState = 0x%02X", Integer.valueOf(b8)));
        }
        notifyStateChanged(this.f16388o | 17);
        boolean connectHid = this.f16351z.connectHid(bluetoothDevice);
        if (!connectHid) {
            ZLogger.w("connect HID failed");
            return connectHid;
        }
        ZLogger.v(this.f16382i, "wait connect HID result");
        a(C.DEFAULT_SEEK_FORWARD_INCREMENT_MS);
        int b10 = b(bluetoothDevice);
        ZLogger.v(this.f16382i, String.format("hidState = 0x%02X", Integer.valueOf(b10)));
        if (2 != b10) {
            ZLogger.d(this.f16381h, "HID connect failed");
        }
        return connectHid;
    }

    public boolean checkImage(String str, boolean z7, OtaDeviceInfo otaDeviceInfo) {
        BinInfo loadImageBinInfo = FirmwareLoaderX.loadImageBinInfo(new LoadParams.Builder().with(this.mContext).binParameters(new BinParameters.Builder().filePath(str).build()).setOtaDeviceInfo(otaDeviceInfo).setSectionSizeCheckEnabled(false).setIcCheckEnabled(false).versionCheckEnabled(z7).build());
        return loadImageBinInfo != null && loadImageBinInfo.status == 4096;
    }

    public boolean connectDevice(String str) {
        return connectDevice(new ConnectParams.Builder().address(str).hid(false).build());
    }

    @Deprecated
    public boolean startOtaProcedure(DfuConfig dfuConfig, boolean z7) {
        return startOtaProcedure(dfuConfig, getOtaDeviceInfo(), z7);
    }

    public boolean connectDevice(String str, boolean z7) {
        return connectDevice(new ConnectParams.Builder().address(str).hid(z7).build());
    }

    @Deprecated
    public boolean startOtaProcedure(OtaDeviceInfo otaDeviceInfo, DfuConfig dfuConfig) {
        return startOtaProcedure(dfuConfig, otaDeviceInfo, true);
    }

    public boolean connectDevice(String str, boolean z7, int i8) {
        return connectDevice(new ConnectParams.Builder().address(str).hid(z7).reconnectTimes(i8).build());
    }
}
