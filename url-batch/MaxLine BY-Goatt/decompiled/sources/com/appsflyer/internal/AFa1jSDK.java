package com.appsflyer.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.util.Base64;
import com.appsflyer.AFLogger;
import defpackage.dm0;
import defpackage.lh;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
@Deprecated
/* loaded from: classes.dex */
public final class AFa1jSDK implements AFa1fSDK {
    private final AFb1bSDK AFInAppEventType;

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class AFa1wSDK {
        final String AFInAppEventParameterName;
        private final boolean values;

        public AFa1wSDK(String str, boolean z) {
            this.AFInAppEventParameterName = str;
            this.values = z;
        }

        public final boolean AFKeystoreWrapper() {
            return this.values;
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class AFa1zSDK implements IInterface {
        private final IBinder AFKeystoreWrapper;

        public AFa1zSDK(IBinder iBinder) {
            this.AFKeystoreWrapper = iBinder;
        }

        public final boolean AFInAppEventType() {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                obtain.writeInt(1);
                this.AFKeystoreWrapper.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readInt() != 0;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this.AFKeystoreWrapper;
        }

        public final String valueOf() {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.AFKeystoreWrapper.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }

    public AFa1jSDK(AFb1bSDK aFb1bSDK) {
        this.AFInAppEventType = aFb1bSDK;
    }

    public static AFa1wSDK AFInAppEventType(Context context) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            lh.g("Cannot be called from the main thread");
            return null;
        }
        context.getPackageManager().getPackageInfo("com.android.vending", 0);
        AFa1xSDK aFa1xSDK = new AFa1xSDK((byte) 0);
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        try {
            if (!context.bindService(intent, aFa1xSDK, 1)) {
                context.unbindService(aFa1xSDK);
                dm0.j("Google Play connection failed");
                return null;
            }
            if (aFa1xSDK.AFInAppEventParameterName) {
                throw new IllegalStateException("Cannot call get on this connection more than once");
            }
            aFa1xSDK.AFInAppEventParameterName = true;
            IBinder poll = aFa1xSDK.valueOf.poll(10L, TimeUnit.SECONDS);
            if (poll == null) {
                throw new TimeoutException("Timed out waiting for the service connection");
            }
            AFa1zSDK aFa1zSDK = new AFa1zSDK(poll);
            return new AFa1wSDK(aFa1zSDK.valueOf(), aFa1zSDK.AFInAppEventType());
        } finally {
            context.unbindService(aFa1xSDK);
        }
    }

    @Override // com.appsflyer.internal.AFa1fSDK
    public final void AFInAppEventParameterName() {
        try {
            if (new File(this.AFInAppEventType.AFInAppEventParameterName.getFilesDir(), "AFRequestCache").exists()) {
                return;
            }
            new File(this.AFInAppEventType.AFInAppEventParameterName.getFilesDir(), "AFRequestCache").mkdir();
        } catch (Exception e) {
            AFLogger.afErrorLog("CACHE: Could not create cache directory", e);
        }
    }

    @Override // com.appsflyer.internal.AFa1fSDK
    public final List<AFa1rSDK> AFKeystoreWrapper() {
        ArrayList arrayList = new ArrayList();
        try {
            File file = new File(this.AFInAppEventType.AFInAppEventParameterName.getFilesDir(), "AFRequestCache");
            if (!file.exists()) {
                file.mkdir();
            }
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    StringBuilder sb = new StringBuilder("CACHE: Found cached request");
                    sb.append(file2.getName());
                    AFLogger.afInfoLog(sb.toString());
                    arrayList.add(AFInAppEventType(file2));
                }
            }
            return arrayList;
        } catch (Exception e) {
            AFLogger.afErrorLog("CACHE: Could not get cached requests", e);
            return arrayList;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00f1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.appsflyer.internal.AFa1fSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String valueOf(AFa1rSDK aFa1rSDK) {
        OutputStreamWriter outputStreamWriter;
        OutputStreamWriter outputStreamWriter2 = null;
        try {
            File file = new File(this.AFInAppEventType.AFInAppEventParameterName.getFilesDir(), "AFRequestCache");
            if (!file.exists()) {
                file.mkdir();
                return null;
            }
            File[] listFiles = file.listFiles();
            if (listFiles != null && listFiles.length > 40) {
                AFLogger.afInfoLog("CACHE: reached cache limit, not caching request");
                return null;
            }
            StringBuilder sb = new StringBuilder("CACHE: caching request with URL: ");
            sb.append(aFa1rSDK.values);
            AFLogger.afInfoLog(sb.toString());
            String l = Long.toString(System.currentTimeMillis());
            File file2 = new File(new File(this.AFInAppEventType.AFInAppEventParameterName.getFilesDir(), "AFRequestCache"), l);
            file2.createNewFile();
            OutputStreamWriter outputStreamWriter3 = new OutputStreamWriter(new FileOutputStream(file2.getPath(), true), Charset.defaultCharset());
            try {
                outputStreamWriter3.write("version=");
                outputStreamWriter3.write(aFa1rSDK.valueOf);
                outputStreamWriter3.write(10);
                outputStreamWriter3.write("url=");
                outputStreamWriter3.write(aFa1rSDK.values);
                outputStreamWriter3.write(10);
                outputStreamWriter3.write("data=");
                outputStreamWriter3.write(Base64.encodeToString(aFa1rSDK.valueOf(), 2));
                outputStreamWriter3.write(10);
                AFd1vSDK aFd1vSDK = aFa1rSDK.AFInAppEventParameterName;
                if (aFd1vSDK != null) {
                    outputStreamWriter3.write("type=");
                    outputStreamWriter3.write(aFd1vSDK.name());
                    outputStreamWriter3.write(10);
                }
                outputStreamWriter3.flush();
                AFLogger.afInfoLog("CACHE: done, cacheKey: ".concat(String.valueOf(l)));
                try {
                    outputStreamWriter3.close();
                    return l;
                } catch (IOException e) {
                    AFLogger.afErrorLogForExcManagerOnly("could not close cache writer", e);
                    return l;
                }
            } catch (Exception e2) {
                outputStreamWriter = outputStreamWriter3;
                e = e2;
                try {
                    AFLogger.afErrorLog("CACHE: Could not cache request", e);
                    if (outputStreamWriter != null) {
                        try {
                            outputStreamWriter.close();
                        } catch (IOException e3) {
                            AFLogger.afErrorLogForExcManagerOnly("could not close cache writer", e3);
                        }
                    }
                    return null;
                } catch (Throwable th) {
                    th = th;
                    outputStreamWriter2 = outputStreamWriter;
                    if (outputStreamWriter2 != null) {
                        try {
                            outputStreamWriter2.close();
                        } catch (IOException e4) {
                            AFLogger.afErrorLogForExcManagerOnly("could not close cache writer", e4);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                outputStreamWriter2 = outputStreamWriter3;
                th = th2;
                if (outputStreamWriter2 != null) {
                }
                throw th;
            }
        } catch (Exception e5) {
            e = e5;
            outputStreamWriter = null;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public AFa1jSDK() {
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class AFa1xSDK implements ServiceConnection {
        boolean AFInAppEventParameterName;
        final LinkedBlockingQueue<IBinder> valueOf;

        private AFa1xSDK() {
            this.valueOf = new LinkedBlockingQueue<>(1);
            this.AFInAppEventParameterName = false;
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.valueOf.put(iBinder);
            } catch (InterruptedException e) {
                AFLogger.afErrorLogForExcManagerOnly("onServiceConnected Interrupted", e);
            }
        }

        public /* synthetic */ AFa1xSDK(byte b) {
            this();
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static AFa1rSDK AFInAppEventType(File file) {
        InputStreamReader inputStreamReader;
        InputStreamReader inputStreamReader2 = null;
        try {
            inputStreamReader = new InputStreamReader(new FileInputStream(file), Charset.defaultCharset());
            try {
                try {
                    char[] cArr = new char[(int) file.length()];
                    inputStreamReader.read(cArr);
                    AFa1rSDK aFa1rSDK = new AFa1rSDK(cArr);
                    aFa1rSDK.AFKeystoreWrapper = file.getName();
                    try {
                        inputStreamReader.close();
                        return aFa1rSDK;
                    } catch (IOException e) {
                        AFLogger.afErrorLogForExcManagerOnly("could not close load reader", e);
                        return aFa1rSDK;
                    }
                } catch (Exception e2) {
                    e = e2;
                    AFLogger.afErrorLogForExcManagerOnly("error while loading request from cache", e);
                    if (inputStreamReader != null) {
                        try {
                            inputStreamReader.close();
                        } catch (IOException e3) {
                            AFLogger.afErrorLogForExcManagerOnly("could not close load reader", e3);
                        }
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                inputStreamReader2 = inputStreamReader;
                if (inputStreamReader2 != null) {
                    try {
                        inputStreamReader2.close();
                    } catch (IOException e4) {
                        AFLogger.afErrorLogForExcManagerOnly("could not close load reader", e4);
                    }
                }
                throw th;
            }
        } catch (Exception e5) {
            e = e5;
            inputStreamReader = null;
        } catch (Throwable th2) {
            th = th2;
            if (inputStreamReader2 != null) {
            }
            throw th;
        }
    }

    @Override // com.appsflyer.internal.AFa1fSDK
    public final boolean valueOf(String str) {
        File file = new File(new File(this.AFInAppEventType.AFInAppEventParameterName.getFilesDir(), "AFRequestCache"), str);
        StringBuilder sb = new StringBuilder("CACHE: Deleting ");
        sb.append(str);
        sb.append(" from cache");
        AFLogger.afInfoLog(sb.toString());
        if (!file.exists()) {
            return true;
        }
        try {
            return file.delete();
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder("CACHE: Could not delete ");
            sb2.append(str);
            sb2.append(" from cache");
            AFLogger.afErrorLog(sb2.toString(), e);
            return false;
        }
    }

    @Override // com.appsflyer.internal.AFa1fSDK
    public final void valueOf() {
        try {
            File file = new File(this.AFInAppEventType.AFInAppEventParameterName.getFilesDir(), "AFRequestCache");
            if (!file.exists()) {
                file.mkdir();
                return;
            }
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return;
            }
            for (File file2 : listFiles) {
                StringBuilder sb = new StringBuilder("CACHE: Found cached request");
                sb.append(file2.getName());
                AFLogger.afInfoLog(sb.toString());
                StringBuilder sb2 = new StringBuilder("CACHE: Deleting ");
                sb2.append(file2.getName());
                sb2.append(" from cache");
                AFLogger.afInfoLog(sb2.toString());
                file2.delete();
            }
        } catch (Exception e) {
            AFLogger.afErrorLog("CACHE: Could not cache request", e);
        }
    }
}
