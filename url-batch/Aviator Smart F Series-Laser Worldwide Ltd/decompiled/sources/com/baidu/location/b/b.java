package com.baidu.location.b;

import android.annotation.TargetApi;
import android.location.GnssNavigationMessage;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static Object f4472a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static b f4473b;

    /* renamed from: c, reason: collision with root package name */
    private HandlerThread f4474c;

    /* renamed from: d, reason: collision with root package name */
    private Handler f4475d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f4476e = false;

    class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i8 = message.what;
            if (i8 == 1) {
                Bundle data = message.getData();
                try {
                    Location location = (Location) data.getParcelable("loc");
                    data.getInt("satnum");
                    if (location != null) {
                        k.a().a(location);
                        return;
                    }
                    return;
                } catch (Exception e8) {
                    e8.printStackTrace();
                    return;
                }
            }
            if (i8 == 2) {
                b0.a(x.c(), com.baidu.location.c.h.a().r(), x.d(), x.a(), x.e());
                return;
            }
            if (i8 == 3) {
                b0.a(x.c(), (com.baidu.location.c.m) null, x.d(), d.a().c(), x.e());
                return;
            }
            if (i8 == 4) {
                boolean l8 = com.baidu.location.c.h.a().l();
                if (!com.baidu.location.e.i.b() && l8) {
                    m.a().d();
                }
                try {
                    if (b.this.f4475d != null) {
                        b.this.f4475d.sendEmptyMessageDelayed(4, com.baidu.location.e.i.f5291u);
                    }
                } catch (Exception e9) {
                    e9.printStackTrace();
                }
                a0.a().b();
                return;
            }
            if (i8 == 7) {
                b0.a().c();
                return;
            }
            if (i8 == 8 || i8 == 9) {
                message.getData();
                return;
            }
            if (i8 != 11) {
                return;
            }
            Bundle data2 = message.getData();
            try {
                a0.a().a(c0.a(data2.getParcelable("gnss_navigation_message")), data2.getLong("gps_time"));
            } catch (Exception unused) {
            }
        }
    }

    b() {
    }

    public void b() {
        if (this.f4476e) {
            try {
                Handler handler = this.f4475d;
                if (handler != null) {
                    handler.obtainMessage(3).sendToTarget();
                }
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
    }

    public void c() {
        if (this.f4476e) {
            try {
                Handler handler = this.f4475d;
                if (handler != null) {
                    handler.obtainMessage(2).sendToTarget();
                }
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
    }

    public void d() {
        if (this.f4476e) {
            try {
                Handler handler = this.f4475d;
                if (handler != null) {
                    handler.obtainMessage(7).sendToTarget();
                }
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
    }

    public void e() {
        if (this.f4476e) {
            return;
        }
        this.f4476e = true;
        if (this.f4474c == null) {
            HandlerThread handlerThread = new HandlerThread("LocUploadThreadManager");
            this.f4474c = handlerThread;
            handlerThread.start();
            if (this.f4474c != null) {
                this.f4475d = new a(this.f4474c.getLooper());
            }
        }
        try {
            Handler handler = this.f4475d;
            if (handler != null) {
                handler.obtainMessage(5).sendToTarget();
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        try {
            Handler handler2 = this.f4475d;
            if (handler2 != null) {
                handler2.sendEmptyMessageDelayed(4, com.baidu.location.e.i.f5291u);
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    public void f() {
        if (this.f4476e) {
            k.a().b();
            try {
                Handler handler = this.f4475d;
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                }
            } catch (Exception e8) {
                e8.printStackTrace();
            }
            this.f4475d = null;
            try {
                HandlerThread handlerThread = this.f4474c;
                if (handlerThread != null) {
                    handlerThread.quit();
                    this.f4474c.interrupt();
                }
            } catch (Exception e9) {
                e9.printStackTrace();
            }
            this.f4474c = null;
            this.f4476e = false;
        }
    }

    public static b a() {
        b bVar;
        synchronized (f4472a) {
            try {
                if (f4473b == null) {
                    f4473b = new b();
                }
                bVar = f4473b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }

    @TargetApi(24)
    public void a(GnssNavigationMessage gnssNavigationMessage, long j8) {
        if (!this.f4476e || gnssNavigationMessage == null) {
            return;
        }
        try {
            Handler handler = this.f4475d;
            if (handler != null) {
                Message obtainMessage = handler.obtainMessage(11);
                Bundle bundle = new Bundle();
                bundle.putParcelable("gnss_navigation_message", gnssNavigationMessage);
                bundle.putLong("gps_time", j8);
                obtainMessage.setData(bundle);
                obtainMessage.sendToTarget();
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public void a(Location location, int i8) {
        if (!this.f4476e || location == null) {
            return;
        }
        try {
            Handler handler = this.f4475d;
            if (handler != null) {
                Message obtainMessage = handler.obtainMessage(1);
                Bundle bundle = new Bundle();
                bundle.putParcelable("loc", new Location(location));
                bundle.putInt("satnum", i8);
                obtainMessage.setData(bundle);
                obtainMessage.sendToTarget();
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }
}
