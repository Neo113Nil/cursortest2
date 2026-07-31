package com.ironsource.mediationsdk.logger;

import com.android.billingclient.BuildConfig;
import com.ironsource.ll;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class IronSourceLoggerManager extends IronSourceLogger implements LogListener {

    /* renamed from: d, reason: collision with root package name */
    private static IronSourceLoggerManager f17652d;

    /* renamed from: c, reason: collision with root package name */
    private ArrayList<IronSourceLogger> f17653c;

    private IronSourceLoggerManager(String str) {
        super(str);
        this.f17653c = new ArrayList<>();
        c();
    }

    private IronSourceLogger a(String str) {
        ArrayList<IronSourceLogger> arrayList = this.f17653c;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            IronSourceLogger ironSourceLogger = arrayList.get(i4);
            i4++;
            IronSourceLogger ironSourceLogger2 = ironSourceLogger;
            if (ironSourceLogger2.b().equals(str)) {
                return ironSourceLogger2;
            }
        }
        return null;
    }

    private void c() {
        this.f17653c.add(new a(0));
    }

    public static synchronized IronSourceLoggerManager getLogger() {
        IronSourceLoggerManager ironSourceLoggerManager;
        synchronized (IronSourceLoggerManager.class) {
            try {
                if (f17652d == null) {
                    f17652d = new IronSourceLoggerManager(IronSourceLoggerManager.class.getSimpleName());
                }
                ironSourceLoggerManager = f17652d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ironSourceLoggerManager;
    }

    public void addLogger(IronSourceLogger ironSourceLogger) {
        this.f17653c.add(ironSourceLogger);
    }

    @Override // com.ironsource.mediationsdk.logger.IronSourceLogger
    @Deprecated(forRemoval = true, since = BuildConfig.VERSION_NAME)
    public synchronized void log(IronSourceLogger.IronSourceTag ironSourceTag, String str, int i4) {
        if (a(i4)) {
            return;
        }
        a(ironSourceTag, str, i4);
    }

    @Override // com.ironsource.mediationsdk.logger.IronSourceLogger
    public synchronized void logException(IronSourceLogger.IronSourceTag ironSourceTag, String str, Throwable th) {
        int i4 = 0;
        try {
            if (th == null) {
                ArrayList<IronSourceLogger> arrayList = this.f17653c;
                int size = arrayList.size();
                while (i4 < size) {
                    IronSourceLogger ironSourceLogger = arrayList.get(i4);
                    i4++;
                    ironSourceLogger.log(ironSourceTag, str, 3);
                }
            } else {
                ArrayList<IronSourceLogger> arrayList2 = this.f17653c;
                int size2 = arrayList2.size();
                while (i4 < size2) {
                    IronSourceLogger ironSourceLogger2 = arrayList2.get(i4);
                    i4++;
                    ironSourceLogger2.logException(ironSourceTag, str, th);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.ironsource.mediationsdk.logger.LogListener
    public synchronized void onLog(IronSourceLogger.IronSourceTag ironSourceTag, String str, int i4) {
        log(ironSourceTag, str, i4);
    }

    public void setLoggerDebugLevel(String str, int i4) {
        if (str == null) {
            return;
        }
        IronSourceLogger a4 = a(str);
        if (a4 == null) {
            log(IronSourceLogger.IronSourceTag.NATIVE, "Failed to find logger:setLoggerDebugLevel(loggerName:" + str + " ,debugLevel:" + i4 + ")", 0);
            return;
        }
        if (i4 < 0 || i4 > 3) {
            this.f17653c.remove(a4);
            return;
        }
        log(IronSourceLogger.IronSourceTag.NATIVE, "setLoggerDebugLevel(loggerName:" + str + " ,debugLevel:" + i4 + ")", 0);
        a4.setDebugLevel(i4);
    }

    private IronSourceLoggerManager(String str, int i4) {
        super(str, i4);
        this.f17653c = new ArrayList<>();
        c();
    }

    public static synchronized IronSourceLoggerManager getLogger(int i4) {
        IronSourceLoggerManager ironSourceLoggerManager;
        synchronized (IronSourceLoggerManager.class) {
            try {
                IronSourceLoggerManager ironSourceLoggerManager2 = f17652d;
                if (ironSourceLoggerManager2 == null) {
                    f17652d = new IronSourceLoggerManager(IronSourceLoggerManager.class.getSimpleName());
                } else {
                    ironSourceLoggerManager2.f17648a = i4;
                }
                ironSourceLoggerManager = f17652d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ironSourceLoggerManager;
    }

    synchronized void a(IronSourceLogger.IronSourceTag ironSourceTag, ll llVar) {
        if (a(llVar.a())) {
            return;
        }
        a(ironSourceTag, llVar.c(), llVar.a());
    }

    private void a(IronSourceLogger.IronSourceTag ironSourceTag, String str, int i4) {
        ArrayList<IronSourceLogger> arrayList = this.f17653c;
        int size = arrayList.size();
        int i5 = 0;
        while (i5 < size) {
            IronSourceLogger ironSourceLogger = arrayList.get(i5);
            i5++;
            IronSourceLogger ironSourceLogger2 = ironSourceLogger;
            if (ironSourceLogger2.a() <= i4) {
                ironSourceLogger2.log(ironSourceTag, str, i4);
            }
        }
    }

    private boolean a(int i4) {
        return i4 < this.f17648a;
    }
}
