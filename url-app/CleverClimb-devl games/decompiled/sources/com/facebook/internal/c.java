package com.facebook.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.mopub.common.GpsHelper;
import com.tapjoy.TapjoyConstants;
import java.lang.reflect.Method;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: AttributionIdentifiers.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static final String f6100a = c.class.getCanonicalName();
    private static c g;

    /* renamed from: b, reason: collision with root package name */
    private String f6101b;

    /* renamed from: c, reason: collision with root package name */
    private String f6102c;

    /* renamed from: d, reason: collision with root package name */
    private String f6103d;
    private boolean e;
    private long f;

    private static c b(Context context) {
        c c2 = c(context);
        if (c2 != null) {
            return c2;
        }
        c d2 = d(context);
        return d2 == null ? new c() : d2;
    }

    private static c c(Context context) {
        Method a2;
        Object a3;
        try {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                throw new com.facebook.j("getAndroidId cannot be called on the main thread.");
            }
            Method a4 = ab.a("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", (Class<?>[]) new Class[]{Context.class});
            if (a4 == null) {
                return null;
            }
            Object a5 = ab.a((Object) null, a4, context);
            if (!(a5 instanceof Integer) || ((Integer) a5).intValue() != 0 || (a2 = ab.a("com.google.android.gms.ads.identifier.AdvertisingIdClient", "getAdvertisingIdInfo", (Class<?>[]) new Class[]{Context.class})) == null || (a3 = ab.a((Object) null, a2, context)) == null) {
                return null;
            }
            Method a6 = ab.a(a3.getClass(), "getId", (Class<?>[]) new Class[0]);
            Method a7 = ab.a(a3.getClass(), GpsHelper.IS_LIMIT_AD_TRACKING_ENABLED_KEY, (Class<?>[]) new Class[0]);
            if (a6 != null && a7 != null) {
                c cVar = new c();
                cVar.f6102c = (String) ab.a(a3, a6, new Object[0]);
                cVar.e = ((Boolean) ab.a(a3, a7, new Object[0])).booleanValue();
                return cVar;
            }
            return null;
        } catch (Exception e) {
            ab.a(TapjoyConstants.TJC_ANDROID_ID, e);
            return null;
        }
    }

    private static c d(Context context) {
        b bVar = new b();
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        if (context.bindService(intent, bVar, 1)) {
            try {
                a aVar = new a(bVar.a());
                c cVar = new c();
                cVar.f6102c = aVar.a();
                cVar.e = aVar.b();
                return cVar;
            } catch (Exception e) {
                ab.a(TapjoyConstants.TJC_ANDROID_ID, e);
            } finally {
                context.unbindService(bVar);
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005c A[Catch: all -> 0x00c8, Exception -> 0x00ca, TryCatch #4 {Exception -> 0x00ca, all -> 0x00c8, blocks: (B:10:0x001d, B:12:0x003a, B:14:0x0056, B:16:0x005c, B:18:0x0060, B:20:0x0065, B:55:0x0042, B:57:0x004e), top: B:9:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060 A[Catch: all -> 0x00c8, Exception -> 0x00ca, TryCatch #4 {Exception -> 0x00ca, all -> 0x00c8, blocks: (B:10:0x001d, B:12:0x003a, B:14:0x0056, B:16:0x005c, B:18:0x0060, B:20:0x0065, B:55:0x0042, B:57:0x004e), top: B:9:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065 A[Catch: all -> 0x00c8, Exception -> 0x00ca, TRY_LEAVE, TryCatch #4 {Exception -> 0x00ca, all -> 0x00c8, blocks: (B:10:0x001d, B:12:0x003a, B:14:0x0056, B:16:0x005c, B:18:0x0060, B:20:0x0065, B:55:0x0042, B:57:0x004e), top: B:9:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static c a(Context context) {
        Cursor cursor;
        Uri uri;
        Uri parse;
        String e;
        if (g != null && System.currentTimeMillis() - g.f < 3600000) {
            return g;
        }
        c b2 = b(context);
        Cursor cursor2 = null;
        try {
            String[] strArr = {"aid", "androidid", "limit_tracking"};
            if (context.getPackageManager().resolveContentProvider("com.facebook.katana.provider.AttributionIdProvider", 0) != null) {
                parse = Uri.parse("content://com.facebook.katana.provider.AttributionIdProvider");
            } else if (context.getPackageManager().resolveContentProvider("com.facebook.wakizashi.provider.AttributionIdProvider", 0) != null) {
                parse = Uri.parse("content://com.facebook.wakizashi.provider.AttributionIdProvider");
            } else {
                uri = null;
                e = e(context);
                if (e != null) {
                    b2.f6103d = e;
                }
                if (uri != null) {
                    return a(b2);
                }
                Cursor query = context.getContentResolver().query(uri, strArr, null, null, null);
                if (query != null) {
                    try {
                        if (query.moveToFirst()) {
                            int columnIndex = query.getColumnIndex("aid");
                            int columnIndex2 = query.getColumnIndex("androidid");
                            int columnIndex3 = query.getColumnIndex("limit_tracking");
                            b2.f6101b = query.getString(columnIndex);
                            if (columnIndex2 > 0 && columnIndex3 > 0 && b2.b() == null) {
                                b2.f6102c = query.getString(columnIndex2);
                                b2.e = Boolean.parseBoolean(query.getString(columnIndex3));
                            }
                            if (query != null) {
                                query.close();
                            }
                            return a(b2);
                        }
                    } catch (Exception e2) {
                        cursor = query;
                        e = e2;
                        try {
                            Log.d(f6100a, "Caught unexpected exception in getAttributionId(): " + e.toString());
                            if (cursor != null) {
                                cursor.close();
                            }
                            return null;
                        } catch (Throwable th) {
                            th = th;
                            cursor2 = cursor;
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        cursor2 = query;
                        th = th2;
                        if (cursor2 != null) {
                        }
                        throw th;
                    }
                }
                c a2 = a(b2);
                if (query != null) {
                    query.close();
                }
                return a2;
            }
            uri = parse;
            e = e(context);
            if (e != null) {
            }
            if (uri != null) {
            }
        } catch (Exception e3) {
            e = e3;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private static c a(c cVar) {
        cVar.f = System.currentTimeMillis();
        g = cVar;
        return cVar;
    }

    public String a() {
        return this.f6101b;
    }

    public String b() {
        return this.f6102c;
    }

    public String c() {
        return this.f6103d;
    }

    public boolean d() {
        return this.e;
    }

    private static String e(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            return packageManager.getInstallerPackageName(context.getPackageName());
        }
        return null;
    }

    /* compiled from: AttributionIdentifiers.java */
    private static final class b implements ServiceConnection {

        /* renamed from: a, reason: collision with root package name */
        private AtomicBoolean f6105a;

        /* renamed from: b, reason: collision with root package name */
        private final BlockingQueue<IBinder> f6106b;

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }

        private b() {
            this.f6105a = new AtomicBoolean(false);
            this.f6106b = new LinkedBlockingDeque();
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f6106b.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        public IBinder a() throws InterruptedException {
            if (this.f6105a.compareAndSet(true, true)) {
                throw new IllegalStateException("Binder already consumed");
            }
            return this.f6106b.take();
        }
    }

    /* compiled from: AttributionIdentifiers.java */
    private static final class a implements IInterface {

        /* renamed from: a, reason: collision with root package name */
        private IBinder f6104a;

        a(IBinder iBinder) {
            this.f6104a = iBinder;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.f6104a;
        }

        public String a() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f6104a.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        public boolean b() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                obtain.writeInt(1);
                this.f6104a.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readInt() != 0;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }
}
