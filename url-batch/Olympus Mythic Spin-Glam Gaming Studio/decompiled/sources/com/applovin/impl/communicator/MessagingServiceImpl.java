package com.applovin.impl.communicator;

import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorMessagingService;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes15.dex */
public class MessagingServiceImpl implements AppLovinCommunicatorMessagingService {
    private ScheduledThreadPoolExecutor a;
    private final Object b = new Object();
    private final Map c = new HashMap();
    private final Object d = new Object();

    private Queue a(String str) {
        LinkedList linkedList;
        synchronized (this.d) {
            try {
                Queue queue = (Queue) this.c.get(str);
                linkedList = queue != null ? new LinkedList(queue) : new LinkedList();
            } catch (Throwable th) {
                throw th;
            }
        }
        return linkedList;
    }

    private void b(CommunicatorMessageImpl communicatorMessageImpl) {
        if (communicatorMessageImpl.sticky) {
            synchronized (this.d) {
                try {
                    Queue queue = (Queue) this.c.get(communicatorMessageImpl.getTopic());
                    if (queue != null) {
                        queue.add(communicatorMessageImpl);
                        if (queue.size() > 10) {
                            queue.remove();
                        }
                    } else {
                        LinkedList linkedList = new LinkedList();
                        linkedList.add(communicatorMessageImpl);
                        this.c.put(communicatorMessageImpl.getTopic(), linkedList);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private void c(final CommunicatorMessageImpl communicatorMessageImpl) {
        ScheduledThreadPoolExecutor a = a();
        this.a = a;
        a.execute(new Runnable() { // from class: com.applovin.impl.communicator.MessagingServiceImpl$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                AppLovinBroadcastManager.sendBroadcastSync(CommunicatorMessageImpl.this, null);
            }
        });
    }

    public void maybeSendStickyMessages(String str) {
        Iterator it = a(str).iterator();
        while (it.hasNext()) {
            c((CommunicatorMessageImpl) it.next());
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorMessagingService
    public void publish(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        c(appLovinCommunicatorMessage);
        b(appLovinCommunicatorMessage);
    }

    public String toString() {
        return "MessagingServiceImpl{}";
    }

    private ScheduledThreadPoolExecutor a() {
        synchronized (this.b) {
            try {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.a;
                if (scheduledThreadPoolExecutor != null) {
                    return scheduledThreadPoolExecutor;
                }
                return new ScheduledThreadPoolExecutor(1, new ThreadFactory() { // from class: com.applovin.impl.communicator.MessagingServiceImpl$$ExternalSyntheticLambda0
                    @Override // java.util.concurrent.ThreadFactory
                    public final Thread newThread(Runnable runnable) {
                        Thread a;
                        a = MessagingServiceImpl.a(runnable);
                        return a;
                    }
                });
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Thread a(Runnable runnable) {
        Thread thread = new Thread(runnable, "AppLovinSdk:communicator");
        thread.setPriority(1);
        thread.setDaemon(true);
        return thread;
    }
}
