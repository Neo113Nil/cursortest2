package com.xsj.crasheye;

import com.aiming.mdt.utils.Constants;
import com.xsj.crasheye.log.Logger;
import com.xsj.crasheye.util.Utils;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.apache.a.b.b.g;
import org.apache.a.e.d;
import org.apache.a.f.b.h;
import org.apache.a.i.c;
import org.apache.a.i.e;
import org.apache.a.j;
import org.apache.a.r;

/* loaded from: classes2.dex */
class NetSender extends BaseExecutor implements InterfaceExecutor {
    NetSender() {
    }

    public synchronized void send(String str, boolean z) {
        send(str, z, false);
    }

    public synchronized void send(final String str, final boolean z, final boolean z2) {
        Thread newThread = new LowPriorityThreadFactory().newThread(new Runnable() { // from class: com.xsj.crasheye.NetSender.1
            @Override // java.lang.Runnable
            public void run() {
                NetSender.this.sendBlocking(str, z, z2);
            }
        });
        if (getExecutor() != null) {
            getExecutor().execute(newThread);
        }
    }

    public synchronized void send(String str, String str2, boolean z) {
        send(str, str2, z, false);
    }

    public synchronized void send(final String str, final String str2, final boolean z, final boolean z2) {
        Thread newThread = new LowPriorityThreadFactory().newThread(new Runnable() { // from class: com.xsj.crasheye.NetSender.2
            @Override // java.lang.Runnable
            public void run() {
                NetSender.this.sendBlocking(str, str2, z, z2);
            }
        });
        if (getExecutor() != null) {
            getExecutor().execute(newThread);
        }
    }

    public synchronized NetSenderResponse sendBlocking(String str, boolean z, boolean z2) {
        return sendBlocking(null, str, z, z2);
    }

    public synchronized NetSenderResponse sendBlocking(String str, boolean z) {
        return sendBlocking(str, z, false);
    }

    public synchronized NetSenderResponse sendBlocking(String str, String str2, boolean z) {
        return sendBlocking(str, str2, z, false);
    }

    public synchronized NetSenderResponse sendBlocking(String str, String str2, boolean z, boolean z2) {
        r rVar;
        Exception e;
        Error e2;
        d dVar;
        NetSenderResponse netSenderResponse = new NetSenderResponse(str, str2);
        if (str2 == null) {
            netSenderResponse.setException(new IllegalArgumentException("null data!"));
            if (Crasheye.crasheyeCallback != null) {
                Crasheye.crasheyeCallback.netSenderResponse(netSenderResponse);
            }
            Logger.logInfo(netSenderResponse.toString());
            return netSenderResponse;
        }
        String replaceAll = Properties.actionTypeRegx.matcher(str2).replaceAll("");
        byte[] gZipString = Utils.getGZipString(replaceAll);
        if (str == null) {
            EnumActionType findActionType = Properties.findActionType(str2);
            if (gZipString == null) {
                str = CrasheyeUrls.getURL(findActionType, replaceAll);
            } else {
                str = CrasheyeUrls.getURL(findActionType, gZipString);
            }
        }
        Logger.logInfo("NetSender: Sending data to url: " + str);
        Logger.logInfo("NetSender: Sending data value: " + str2);
        h hVar = new h();
        org.apache.a.i.d params = hVar.getParams();
        e.a(params, false);
        c.c(params, 20000);
        c.a(params, 20000);
        g gVar = new g(str);
        gVar.setHeader(Constants.KEY_CONTENT_TYPE, "application/x-gzip");
        gVar.setHeader("gzip", "true");
        try {
            if (gZipString == null) {
                dVar = new d(str2.getBytes());
            } else {
                dVar = new d(gZipString);
            }
            gVar.setEntity(dVar);
            rVar = hVar.execute(gVar);
        } catch (Error e3) {
            rVar = null;
            e2 = e3;
        } catch (Exception e4) {
            rVar = null;
            e = e4;
        }
        try {
            j b2 = rVar.b();
            int b3 = rVar.a().b();
            Logger.logInfo("net send status code " + b3);
            netSenderResponse.setResponseCode(b3);
            if (b2 == null && b3 >= 400) {
                netSenderResponse.setException(new Exception(rVar.a().c()));
                if (Crasheye.crasheyeCallback != null) {
                    Crasheye.crasheyeCallback.netSenderResponse(netSenderResponse);
                }
            } else {
                if (b2 != null) {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(b2.f()));
                    String readLine = bufferedReader.readLine();
                    Logger.logWarning("NetSender: Transmitting result " + readLine);
                    bufferedReader.close();
                    netSenderResponse.setServerResponse(readLine);
                }
                netSenderResponse.setSentSuccessfully(true);
            }
            if (Crasheye.crasheyeCallback == null) {
                return netSenderResponse;
            }
            if (Crasheye.crasheyeCallback != null) {
                Crasheye.crasheyeCallback.netSenderResponse(netSenderResponse);
            }
            return netSenderResponse;
        } catch (Error e5) {
            e2 = e5;
            Logger.logError("NetSender: Transmitting Error " + e2.getMessage());
            if (Crasheye.DEBUG) {
                e2.printStackTrace();
            }
            if (rVar != null) {
                netSenderResponse.setResponseCode(rVar.a().b());
            }
            netSenderResponse.setException(new Exception(e2.getMessage()));
            if (Crasheye.crasheyeCallback != null) {
                Crasheye.crasheyeCallback.netSenderResponse(netSenderResponse);
            }
            if (z) {
                Logger.logWarning("NetSender: Couldn't send data, saving...");
                new AsyncDataSaver().save(str2, z2 ? CrasheyeFileFilter.createSessionNewFile() : CrasheyeFileFilter.createNewFile());
            }
            return netSenderResponse;
        } catch (Exception e6) {
            e = e6;
            Logger.logError("NetSender: Transmitting Exception " + e.getMessage());
            if (Crasheye.DEBUG) {
                e.printStackTrace();
            }
            if (rVar != null) {
                netSenderResponse.setResponseCode(rVar.a().b());
            }
            netSenderResponse.setException(e);
            if (Crasheye.crasheyeCallback != null) {
                Crasheye.crasheyeCallback.netSenderResponse(netSenderResponse);
            }
            if (z) {
                Logger.logWarning("NetSender: Couldn't send data, saving...");
                new AsyncDataSaver().save(str2, z2 ? CrasheyeFileFilter.createSessionNewFile() : CrasheyeFileFilter.createNewFile());
            }
            return netSenderResponse;
        }
    }

    @Override // com.xsj.crasheye.InterfaceExecutor
    public ExecutorService getExecutor() {
        if (executor == null) {
            executor = Executors.newFixedThreadPool(2);
        }
        return executor;
    }
}
