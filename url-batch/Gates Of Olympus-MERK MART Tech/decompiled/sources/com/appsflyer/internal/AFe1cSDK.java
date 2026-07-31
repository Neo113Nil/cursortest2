package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.Timer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class AFe1cSDK {
    public Executor AFInAppEventParameterName;
    final Set<AFe1eSDK> AFInAppEventType;
    final ExecutorService AFKeystoreWrapper;
    final Set<AFe1eSDK> AFLogger;
    final NavigableSet<AFe1dSDK<?>> d;
    final Set<AFe1dSDK<?>> e;
    final NavigableSet<AFe1dSDK<?>> registerClient;
    final List<AFe1dSDK<?>> unregisterClient;
    public final List<AFe1fSDK> valueOf;
    final Timer values;

    public AFe1cSDK(ExecutorService executorService) {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Intrinsics.checkNotNullExpressionValue(newSingleThreadExecutor, "");
        this.AFInAppEventParameterName = newSingleThreadExecutor;
        this.values = new Timer(true);
        this.valueOf = new CopyOnWriteArrayList();
        this.AFInAppEventType = new CopyOnWriteArraySet();
        this.AFLogger = Collections.newSetFromMap(new ConcurrentHashMap());
        this.d = new ConcurrentSkipListSet();
        this.registerClient = new ConcurrentSkipListSet();
        this.unregisterClient = new ArrayList();
        this.e = Collections.newSetFromMap(new ConcurrentHashMap());
        this.AFKeystoreWrapper = executorService;
    }

    /* renamed from: com.appsflyer.internal.AFe1cSDK$5, reason: invalid class name */
    public class AnonymousClass5 implements Runnable {
        private /* synthetic */ AFe1dSDK valueOf;

        public AnonymousClass5(AFe1dSDK aFe1dSDK) {
            this.valueOf = aFe1dSDK;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean add;
            synchronized (AFe1cSDK.this.d) {
                if (AFe1cSDK.this.e.contains(this.valueOf)) {
                    AFLogger.INSTANCE.d(AFg1jSDK.QUEUE, new StringBuilder("tried to add already running task: ").append(this.valueOf).toString());
                    return;
                }
                if (!AFe1cSDK.this.d.contains(this.valueOf) && !AFe1cSDK.this.registerClient.contains(this.valueOf)) {
                    AFe1cSDK aFe1cSDK = AFe1cSDK.this;
                    AFe1dSDK aFe1dSDK = this.valueOf;
                    for (AFe1eSDK aFe1eSDK : aFe1dSDK.valueOf) {
                        if (aFe1cSDK.AFLogger.contains(aFe1eSDK)) {
                            aFe1dSDK.AFInAppEventParameterName.add(aFe1eSDK);
                        }
                    }
                    if (AFe1cSDK.this.values(this.valueOf)) {
                        add = AFe1cSDK.this.d.add(this.valueOf);
                    } else {
                        add = AFe1cSDK.this.registerClient.add(this.valueOf);
                        if (add) {
                            AFLogger.INSTANCE.d(AFg1jSDK.QUEUE, new StringBuilder("new task was blocked: ").append(this.valueOf).toString());
                            this.valueOf.valueOf();
                        }
                    }
                    if (add) {
                        AFe1cSDK.this.d.addAll(AFe1cSDK.this.unregisterClient);
                        AFe1cSDK.this.unregisterClient.clear();
                    } else {
                        AFLogger.INSTANCE.d(AFg1jSDK.QUEUE, new StringBuilder("task not added, it's already in the queue: ").append(this.valueOf).toString());
                    }
                    if (add) {
                        AFe1cSDK.this.AFLogger.add(this.valueOf.AFInAppEventType);
                        AFLogger.INSTANCE.d(AFg1jSDK.QUEUE, new StringBuilder("new task added: ").append(this.valueOf).toString());
                        for (AFe1fSDK aFe1fSDK : AFe1cSDK.this.valueOf) {
                        }
                        AFe1cSDK aFe1cSDK2 = AFe1cSDK.this;
                        aFe1cSDK2.AFKeystoreWrapper.submit(aFe1cSDK2.new AnonymousClass1());
                        AFe1cSDK aFe1cSDK3 = AFe1cSDK.this;
                        synchronized (aFe1cSDK3.d) {
                            for (int size = (aFe1cSDK3.d.size() + aFe1cSDK3.registerClient.size()) - 40; size > 0; size--) {
                                boolean isEmpty = aFe1cSDK3.registerClient.isEmpty();
                                boolean isEmpty2 = aFe1cSDK3.d.isEmpty();
                                if (isEmpty2 || isEmpty) {
                                    if (!isEmpty2) {
                                        aFe1cSDK3.AFInAppEventType(aFe1cSDK3.d);
                                    } else if (!isEmpty) {
                                        aFe1cSDK3.AFInAppEventType(aFe1cSDK3.registerClient);
                                    }
                                } else if (aFe1cSDK3.d.first().compareTo(aFe1cSDK3.registerClient.first()) > 0) {
                                    aFe1cSDK3.AFInAppEventType(aFe1cSDK3.d);
                                } else {
                                    aFe1cSDK3.AFInAppEventType(aFe1cSDK3.registerClient);
                                }
                            }
                        }
                        return;
                    }
                    AFLogger.INSTANCE.w(AFg1jSDK.QUEUE, new StringBuilder("QUEUE: tried to add already pending task: ").append(this.valueOf).toString());
                    return;
                }
                AFLogger.INSTANCE.d(AFg1jSDK.QUEUE, new StringBuilder("tried to add already scheduled task: ").append(this.valueOf).toString());
            }
        }
    }

    /* renamed from: com.appsflyer.internal.AFe1cSDK$1, reason: invalid class name */
    final class AnonymousClass1 implements Runnable {
        AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (AFe1cSDK.this.d) {
                final AFe1dSDK<?> pollFirst = AFe1cSDK.this.d.pollFirst();
                if (pollFirst == null) {
                    return;
                }
                AFe1cSDK.this.e.add(pollFirst);
                long AFInAppEventParameterName = pollFirst.AFInAppEventParameterName();
                AFf1ySDK aFf1ySDK = new AFf1ySDK(Thread.currentThread());
                if (AFInAppEventParameterName > 0) {
                    AFe1cSDK.this.values.schedule(aFf1ySDK, AFInAppEventParameterName);
                }
                final AFe1cSDK aFe1cSDK = AFe1cSDK.this;
                aFe1cSDK.AFInAppEventParameterName.execute(new Runnable() { // from class: com.appsflyer.internal.AFe1cSDK.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        Iterator<AFe1fSDK> it = AFe1cSDK.this.valueOf.iterator();
                        while (it.hasNext()) {
                            it.next().AFKeystoreWrapper(pollFirst);
                        }
                    }
                });
                if (!AFe1cSDK.this.d.isEmpty()) {
                    AFe1cSDK aFe1cSDK2 = AFe1cSDK.this;
                    aFe1cSDK2.AFKeystoreWrapper.submit(aFe1cSDK2.new AnonymousClass1());
                }
                try {
                    AFLogger.INSTANCE.d(AFg1jSDK.QUEUE, "starting task execution: ".concat(String.valueOf(pollFirst)));
                    final AFe1bSDK call = pollFirst.call();
                    aFf1ySDK.cancel();
                    final AFe1cSDK aFe1cSDK3 = AFe1cSDK.this;
                    aFe1cSDK3.AFInAppEventParameterName.execute(new Runnable() { // from class: com.appsflyer.internal.AFe1cSDK.3
                        @Override // java.lang.Runnable
                        public final void run() {
                            AFLogger.INSTANCE.d(AFg1jSDK.QUEUE, new StringBuilder("execution finished for ").append(pollFirst).append(", result: ").append(call).toString());
                            AFe1cSDK.this.e.remove(pollFirst);
                            Iterator<AFe1fSDK> it = AFe1cSDK.this.valueOf.iterator();
                            while (it.hasNext()) {
                                it.next().valueOf(pollFirst, call);
                            }
                            if (call == AFe1bSDK.SUCCESS) {
                                AFe1cSDK.this.AFInAppEventType.add(pollFirst.AFInAppEventType);
                                AFe1cSDK.AFKeystoreWrapper(AFe1cSDK.this);
                                return;
                            }
                            if (pollFirst.AFKeystoreWrapper()) {
                                if (AFe1cSDK.valueOf(pollFirst)) {
                                    synchronized (AFe1cSDK.this.d) {
                                        AFe1cSDK.this.unregisterClient.add(pollFirst);
                                        for (AFe1fSDK aFe1fSDK : AFe1cSDK.this.valueOf) {
                                        }
                                    }
                                    return;
                                }
                                return;
                            }
                            AFe1cSDK.this.AFInAppEventType.add(pollFirst.AFInAppEventType);
                            AFe1cSDK.AFKeystoreWrapper(AFe1cSDK.this);
                        }
                    });
                } catch (InterruptedIOException | InterruptedException unused) {
                    AFLogger.INSTANCE.d(AFg1jSDK.QUEUE, "task was interrupted: ".concat(String.valueOf(pollFirst)));
                    pollFirst.AFKeystoreWrapper = AFe1bSDK.TIMEOUT;
                    final AFe1cSDK aFe1cSDK4 = AFe1cSDK.this;
                    final AFe1bSDK aFe1bSDK = AFe1bSDK.TIMEOUT;
                    aFe1cSDK4.AFInAppEventParameterName.execute(new Runnable() { // from class: com.appsflyer.internal.AFe1cSDK.3
                        @Override // java.lang.Runnable
                        public final void run() {
                            AFLogger.INSTANCE.d(AFg1jSDK.QUEUE, new StringBuilder("execution finished for ").append(pollFirst).append(", result: ").append(aFe1bSDK).toString());
                            AFe1cSDK.this.e.remove(pollFirst);
                            Iterator<AFe1fSDK> it = AFe1cSDK.this.valueOf.iterator();
                            while (it.hasNext()) {
                                it.next().valueOf(pollFirst, aFe1bSDK);
                            }
                            if (aFe1bSDK == AFe1bSDK.SUCCESS) {
                                AFe1cSDK.this.AFInAppEventType.add(pollFirst.AFInAppEventType);
                                AFe1cSDK.AFKeystoreWrapper(AFe1cSDK.this);
                                return;
                            }
                            if (pollFirst.AFKeystoreWrapper()) {
                                if (AFe1cSDK.valueOf(pollFirst)) {
                                    synchronized (AFe1cSDK.this.d) {
                                        AFe1cSDK.this.unregisterClient.add(pollFirst);
                                        for (AFe1fSDK aFe1fSDK : AFe1cSDK.this.valueOf) {
                                        }
                                    }
                                    return;
                                }
                                return;
                            }
                            AFe1cSDK.this.AFInAppEventType.add(pollFirst.AFInAppEventType);
                            AFe1cSDK.AFKeystoreWrapper(AFe1cSDK.this);
                        }
                    });
                } catch (Throwable unused2) {
                    aFf1ySDK.cancel();
                    final AFe1cSDK aFe1cSDK5 = AFe1cSDK.this;
                    final AFe1bSDK aFe1bSDK2 = AFe1bSDK.FAILURE;
                    aFe1cSDK5.AFInAppEventParameterName.execute(new Runnable() { // from class: com.appsflyer.internal.AFe1cSDK.3
                        @Override // java.lang.Runnable
                        public final void run() {
                            AFLogger.INSTANCE.d(AFg1jSDK.QUEUE, new StringBuilder("execution finished for ").append(pollFirst).append(", result: ").append(aFe1bSDK2).toString());
                            AFe1cSDK.this.e.remove(pollFirst);
                            Iterator<AFe1fSDK> it = AFe1cSDK.this.valueOf.iterator();
                            while (it.hasNext()) {
                                it.next().valueOf(pollFirst, aFe1bSDK2);
                            }
                            if (aFe1bSDK2 == AFe1bSDK.SUCCESS) {
                                AFe1cSDK.this.AFInAppEventType.add(pollFirst.AFInAppEventType);
                                AFe1cSDK.AFKeystoreWrapper(AFe1cSDK.this);
                                return;
                            }
                            if (pollFirst.AFKeystoreWrapper()) {
                                if (AFe1cSDK.valueOf(pollFirst)) {
                                    synchronized (AFe1cSDK.this.d) {
                                        AFe1cSDK.this.unregisterClient.add(pollFirst);
                                        for (AFe1fSDK aFe1fSDK : AFe1cSDK.this.valueOf) {
                                        }
                                    }
                                    return;
                                }
                                return;
                            }
                            AFe1cSDK.this.AFInAppEventType.add(pollFirst.AFInAppEventType);
                            AFe1cSDK.AFKeystoreWrapper(AFe1cSDK.this);
                        }
                    });
                }
            }
        }
    }

    final void AFInAppEventType(NavigableSet<AFe1dSDK<?>> navigableSet) {
        AFe1dSDK<?> pollFirst = navigableSet.pollFirst();
        this.AFInAppEventType.add(pollFirst.AFInAppEventType);
        Iterator<AFe1fSDK> it = this.valueOf.iterator();
        while (it.hasNext()) {
            it.next().valueOf(pollFirst);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean values(AFe1dSDK<?> aFe1dSDK) {
        return this.AFInAppEventType.containsAll(aFe1dSDK.AFInAppEventParameterName);
    }

    public static boolean valueOf(AFe1dSDK<?> aFe1dSDK) {
        return ((aFe1dSDK instanceof AFf1mSDK) && aFe1dSDK.AFInAppEventType == AFe1eSDK.ARS_VALIDATE) ? false : true;
    }

    static /* synthetic */ void AFKeystoreWrapper(AFe1cSDK aFe1cSDK) {
        synchronized (aFe1cSDK.d) {
            Iterator<AFe1dSDK<?>> it = aFe1cSDK.registerClient.iterator();
            boolean z = false;
            while (it.hasNext()) {
                AFe1dSDK<?> next = it.next();
                if (aFe1cSDK.values(next)) {
                    it.remove();
                    aFe1cSDK.d.add(next);
                    z = true;
                }
            }
            if (z) {
                aFe1cSDK.AFKeystoreWrapper.submit(aFe1cSDK.new AnonymousClass1());
            }
        }
    }
}
