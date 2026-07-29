package com.youappi.sdk.logic;

import android.util.Log;
import com.youappi.sdk.YouAPPi;
import com.youappi.sdk.logic.model.a;
import com.youappi.sdk.net.a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class Logger {
    private static final long LOG_SEND_INTERVAL_MILLIS = 60000;
    private ScheduledExecutorService _execturor;
    private LogListener _logListener;
    private a _youAPPiAPI;
    private final Object _synObj = new Object();
    private int _serverLogLevel = 6;
    private int _userLogLevel = 6;
    private List<a.C0412a> _queuedLogs = new ArrayList();
    private long _lastSentTime = 0;

    public interface LogListener {
        void log(String str, String str2);
    }

    public Logger(ScheduledExecutorService scheduledExecutorService) {
        this._execturor = scheduledExecutorService;
    }

    private void addToLogQueue(int i, String str, String str2, String str3) {
        a.C0412a c0412a = new a.C0412a();
        c0412a.c(logLevelToString(i));
        c0412a.a(str);
        c0412a.b(str3);
        c0412a.a(System.currentTimeMillis());
        c0412a.d(str2);
        synchronized (this._synObj) {
            if (this._queuedLogs == null) {
                this._queuedLogs = new ArrayList();
            }
            this._queuedLogs.add(c0412a);
        }
        long currentTimeMillis = System.currentTimeMillis() - this._lastSentTime;
        if (this._youAPPiAPI != null) {
            if (currentTimeMillis >= LOG_SEND_INTERVAL_MILLIS) {
                synchronized (this._synObj) {
                    if (this._queuedLogs != null && !this._queuedLogs.isEmpty()) {
                        this._youAPPiAPI.a((a.C0412a[]) this._queuedLogs.toArray(new a.C0412a[this._queuedLogs.size()]));
                        this._queuedLogs.clear();
                        this._lastSentTime = System.currentTimeMillis();
                    }
                }
                return;
            }
            try {
                this._execturor.schedule(new Runnable() { // from class: com.youappi.sdk.logic.Logger.1
                    @Override // java.lang.Runnable
                    public void run() {
                        synchronized (Logger.this._synObj) {
                            if (Logger.this._queuedLogs != null && !Logger.this._queuedLogs.isEmpty() && System.currentTimeMillis() - Logger.this._lastSentTime >= Logger.LOG_SEND_INTERVAL_MILLIS) {
                                Logger.this._youAPPiAPI.a((a.C0412a[]) Logger.this._queuedLogs.toArray(new a.C0412a[Logger.this._queuedLogs.size()]));
                                Logger.this._queuedLogs.clear();
                                Logger.this._lastSentTime = System.currentTimeMillis();
                            }
                        }
                    }
                }, (int) (LOG_SEND_INTERVAL_MILLIS - currentTimeMillis), TimeUnit.MILLISECONDS);
            } catch (Exception e) {
                Log.e(Logger.class.getSimpleName(), "schedule error: " + Log.getStackTraceString(e));
            }
        }
    }

    private static int logLevelToInt(String str) {
        if (str == null || str.isEmpty()) {
            return 6;
        }
        if (str.equalsIgnoreCase("VERBOSE")) {
            return 2;
        }
        if (str.equalsIgnoreCase("DEBUG")) {
            return 3;
        }
        if (str.equalsIgnoreCase("INFO")) {
            return 4;
        }
        if (str.equalsIgnoreCase("WARN")) {
            return 5;
        }
        return (!str.equalsIgnoreCase("ERROR") && str.equalsIgnoreCase("ASSERT")) ? 7 : 6;
    }

    private static String logLevelToString(int i) {
        switch (i) {
            case 2:
                return "VERBOSE";
            case 3:
                return "DEBUG";
            case 4:
                return "INFO";
            case 5:
                return "WARN";
            case 6:
                return "ERROR";
            case 7:
                return "ASSERT";
            default:
                return "NONE";
        }
    }

    public void log(int i, String str, String str2) {
        log(i, str, null, str2);
    }

    public void log(int i, String str, String str2, String str3) {
        if (this._logListener != null) {
            this._logListener.log(str, str3);
        }
        if (i >= Math.min(this._userLogLevel, this._serverLogLevel)) {
            addToLogQueue(i, str, str2, str3);
        }
    }

    public void log(String str, String str2) {
        log(3, str, str2);
    }

    public void log(String str, String str2, String str3) {
        log(3, str, str2, str3);
    }

    public void logException(int i, String str, Throwable th) {
        log(i, str, Log.getStackTraceString(th));
    }

    public void logException(Throwable th) {
        log(6, YouAPPi.class.getSimpleName(), Log.getStackTraceString(th));
    }

    public void logInternalNonCriticalException(Throwable th) {
        log(3, YouAPPi.class.getSimpleName(), Log.getStackTraceString(th));
    }

    public void setLogListener(LogListener logListener) {
        this._logListener = logListener;
    }

    public void setServerLogLevel(String str) {
        this._serverLogLevel = logLevelToInt(str);
    }

    public void setUserLogLevel(int i) {
        if (i < 2 || i > 7) {
            return;
        }
        this._userLogLevel = i;
    }

    public void setYouAPPiAPI(com.youappi.sdk.net.a aVar) {
        this._youAPPiAPI = aVar;
    }
}
