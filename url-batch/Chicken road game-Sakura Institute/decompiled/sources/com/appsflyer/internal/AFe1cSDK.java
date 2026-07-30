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
    public final List<AFe1fSDK> AFInAppEventParameterName;
    final Timer AFInAppEventType;
    final Set<AFf1zSDK> AFKeystoreWrapper;
    final List<AFe1dSDK<?>> AFLogger;
    final Set<AFf1zSDK> d;
    final NavigableSet<AFe1dSDK<?>> e;
    final Set<AFe1dSDK<?>> registerClient;
    final NavigableSet<AFe1dSDK<?>> unregisterClient;
    public Executor valueOf;
    final ExecutorService values;

    public AFe1cSDK(ExecutorService executorService) {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Intrinsics.checkNotNullExpressionValue(newSingleThreadExecutor, "");
        this.valueOf = newSingleThreadExecutor;
        this.AFInAppEventType = new Timer(true);
        this.AFInAppEventParameterName = new CopyOnWriteArrayList();
        this.AFKeystoreWrapper = new CopyOnWriteArraySet();
        this.d = Collections.newSetFromMap(new ConcurrentHashMap());
        this.e = new ConcurrentSkipListSet();
        this.unregisterClient = new ConcurrentSkipListSet();
        this.AFLogger = new ArrayList();
        this.registerClient = Collections.newSetFromMap(new ConcurrentHashMap());
        this.values = executorService;
    }

    /* renamed from: com.appsflyer.internal.AFe1cSDK$2, reason: invalid class name */
    public class AnonymousClass2 implements Runnable {
        private /* synthetic */ AFe1dSDK values;

        public AnonymousClass2(AFe1dSDK aFe1dSDK) {
            this.values = aFe1dSDK;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean add;
            synchronized (AFe1cSDK.this.e) {
                if (AFe1cSDK.this.registerClient.contains(this.values)) {
                    AFLogger.INSTANCE.d(AFg1aSDK.QUEUE, new StringBuilder("tried to add already running task: ").append(this.values).toString());
                    return;
                }
                if (!AFe1cSDK.this.e.contains(this.values) && !AFe1cSDK.this.unregisterClient.contains(this.values)) {
                    AFe1cSDK aFe1cSDK = AFe1cSDK.this;
                    AFe1dSDK aFe1dSDK = this.values;
                    for (AFf1zSDK aFf1zSDK : aFe1dSDK.AFInAppEventParameterName) {
                        if (aFe1cSDK.d.contains(aFf1zSDK)) {
                            aFe1dSDK.valueOf.add(aFf1zSDK);
                        }
                    }
                    if (AFe1cSDK.this.valueOf((AFe1dSDK<?>) this.values)) {
                        add = AFe1cSDK.this.e.add(this.values);
                    } else {
                        add = AFe1cSDK.this.unregisterClient.add(this.values);
                        if (add) {
                            AFLogger.INSTANCE.d(AFg1aSDK.QUEUE, new StringBuilder("new task was blocked: ").append(this.values).toString());
                            this.values.values();
                        }
                    }
                    if (add) {
                        AFe1cSDK.this.e.addAll(AFe1cSDK.this.AFLogger);
                        AFe1cSDK.this.AFLogger.clear();
                    } else {
                        AFLogger.INSTANCE.d(AFg1aSDK.QUEUE, new StringBuilder("task not added, it's already in the queue: ").append(this.values).toString());
                    }
                    if (add) {
                        AFe1cSDK.this.d.add(this.values.AFInAppEventType);
                        AFLogger.INSTANCE.d(AFg1aSDK.QUEUE, new StringBuilder("new task added: ").append(this.values).toString());
                        for (AFe1fSDK aFe1fSDK : AFe1cSDK.this.AFInAppEventParameterName) {
                        }
                        AFe1cSDK aFe1cSDK2 = AFe1cSDK.this;
                        aFe1cSDK2.values.submit(aFe1cSDK2.new AnonymousClass1());
                        AFe1cSDK aFe1cSDK3 = AFe1cSDK.this;
                        synchronized (aFe1cSDK3.e) {
                            for (int size = (aFe1cSDK3.e.size() + aFe1cSDK3.unregisterClient.size()) - 40; size > 0; size--) {
                                boolean z = !aFe1cSDK3.unregisterClient.isEmpty();
                                boolean z2 = !aFe1cSDK3.e.isEmpty();
                                if (z2 && z) {
                                    if (aFe1cSDK3.e.first().compareTo(aFe1cSDK3.unregisterClient.first()) > 0) {
                                        aFe1cSDK3.AFInAppEventParameterName(aFe1cSDK3.e);
                                    } else {
                                        aFe1cSDK3.AFInAppEventParameterName(aFe1cSDK3.unregisterClient);
                                    }
                                } else if (z2) {
                                    aFe1cSDK3.AFInAppEventParameterName(aFe1cSDK3.e);
                                } else if (z) {
                                    aFe1cSDK3.AFInAppEventParameterName(aFe1cSDK3.unregisterClient);
                                }
                            }
                        }
                        return;
                    }
                    AFLogger.INSTANCE.w(AFg1aSDK.QUEUE, new StringBuilder("QUEUE: tried to add already pending task: ").append(this.values).toString());
                    return;
                }
                AFLogger.INSTANCE.d(AFg1aSDK.QUEUE, new StringBuilder("tried to add already scheduled task: ").append(this.values).toString());
            }
        }
    }

    /* renamed from: com.appsflyer.internal.AFe1cSDK$1, reason: invalid class name */
    final class AnonymousClass1 implements Runnable {
        AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (AFe1cSDK.this.e) {
                final AFe1dSDK<?> pollFirst = AFe1cSDK.this.e.pollFirst();
                if (pollFirst == null) {
                    return;
                }
                AFe1cSDK.this.registerClient.add(pollFirst);
                long AFInAppEventParameterName = pollFirst.AFInAppEventParameterName();
                AFf1xSDK aFf1xSDK = new AFf1xSDK(Thread.currentThread());
                if (AFInAppEventParameterName > 0) {
                    AFe1cSDK.this.AFInAppEventType.schedule(aFf1xSDK, AFInAppEventParameterName);
                }
                final AFe1cSDK aFe1cSDK = AFe1cSDK.this;
                aFe1cSDK.valueOf.execute(new Runnable() { // from class: com.appsflyer.internal.AFe1cSDK.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        Iterator<AFe1fSDK> it = AFe1cSDK.this.AFInAppEventParameterName.iterator();
                        while (it.hasNext()) {
                            it.next().values(pollFirst);
                        }
                    }
                });
                if (!AFe1cSDK.this.e.isEmpty()) {
                    AFe1cSDK aFe1cSDK2 = AFe1cSDK.this;
                    aFe1cSDK2.values.submit(aFe1cSDK2.new AnonymousClass1());
                }
                try {
                    AFLogger.INSTANCE.d(AFg1aSDK.QUEUE, "starting task execution: ".concat(String.valueOf(pollFirst)));
                    final AFe1bSDK call = pollFirst.call();
                    aFf1xSDK.cancel();
                    final AFe1cSDK aFe1cSDK3 = AFe1cSDK.this;
                    aFe1cSDK3.valueOf.execute(new Runnable() { // from class: com.appsflyer.internal.AFe1cSDK.4
                        @Override // java.lang.Runnable
                        public final void run() {
                            AFLogger.INSTANCE.d(AFg1aSDK.QUEUE, new StringBuilder("execution finished for ").append(pollFirst).append(", result: ").append(call).toString());
                            AFe1cSDK.this.registerClient.remove(pollFirst);
                            Iterator<AFe1fSDK> it = AFe1cSDK.this.AFInAppEventParameterName.iterator();
                            while (it.hasNext()) {
                                it.next().values(pollFirst, call);
                            }
                            if (call == AFe1bSDK.SUCCESS) {
                                AFe1cSDK.this.AFKeystoreWrapper.add(pollFirst.AFInAppEventType);
                                AFe1cSDK.valueOf(AFe1cSDK.this);
                                return;
                            }
                            if (pollFirst.valueOf()) {
                                if (AFe1cSDK.AFInAppEventType(pollFirst)) {
                                    synchronized (AFe1cSDK.this.e) {
                                        AFe1cSDK.this.AFLogger.add(pollFirst);
                                        for (AFe1fSDK aFe1fSDK : AFe1cSDK.this.AFInAppEventParameterName) {
                                        }
                                    }
                                    return;
                                }
                                return;
                            }
                            AFe1cSDK.this.AFKeystoreWrapper.add(pollFirst.AFInAppEventType);
                            AFe1cSDK.valueOf(AFe1cSDK.this);
                        }
                    });
                } catch (InterruptedIOException | InterruptedException unused) {
                    AFLogger.INSTANCE.d(AFg1aSDK.QUEUE, "task was interrupted: ".concat(String.valueOf(pollFirst)));
                    pollFirst.values = AFe1bSDK.TIMEOUT;
                    final AFe1cSDK aFe1cSDK4 = AFe1cSDK.this;
                    final AFe1bSDK aFe1bSDK = AFe1bSDK.TIMEOUT;
                    aFe1cSDK4.valueOf.execute(new Runnable() { // from class: com.appsflyer.internal.AFe1cSDK.4
                        @Override // java.lang.Runnable
                        public final void run() {
                            AFLogger.INSTANCE.d(AFg1aSDK.QUEUE, new StringBuilder("execution finished for ").append(pollFirst).append(", result: ").append(aFe1bSDK).toString());
                            AFe1cSDK.this.registerClient.remove(pollFirst);
                            Iterator<AFe1fSDK> it = AFe1cSDK.this.AFInAppEventParameterName.iterator();
                            while (it.hasNext()) {
                                it.next().values(pollFirst, aFe1bSDK);
                            }
                            if (aFe1bSDK == AFe1bSDK.SUCCESS) {
                                AFe1cSDK.this.AFKeystoreWrapper.add(pollFirst.AFInAppEventType);
                                AFe1cSDK.valueOf(AFe1cSDK.this);
                                return;
                            }
                            if (pollFirst.valueOf()) {
                                if (AFe1cSDK.AFInAppEventType(pollFirst)) {
                                    synchronized (AFe1cSDK.this.e) {
                                        AFe1cSDK.this.AFLogger.add(pollFirst);
                                        for (AFe1fSDK aFe1fSDK : AFe1cSDK.this.AFInAppEventParameterName) {
                                        }
                                    }
                                    return;
                                }
                                return;
                            }
                            AFe1cSDK.this.AFKeystoreWrapper.add(pollFirst.AFInAppEventType);
                            AFe1cSDK.valueOf(AFe1cSDK.this);
                        }
                    });
                } catch (Throwable unused2) {
                    aFf1xSDK.cancel();
                    final AFe1cSDK aFe1cSDK5 = AFe1cSDK.this;
                    final AFe1bSDK aFe1bSDK2 = AFe1bSDK.FAILURE;
                    aFe1cSDK5.valueOf.execute(new Runnable() { // from class: com.appsflyer.internal.AFe1cSDK.4
                        @Override // java.lang.Runnable
                        public final void run() {
                            AFLogger.INSTANCE.d(AFg1aSDK.QUEUE, new StringBuilder("execution finished for ").append(pollFirst).append(", result: ").append(aFe1bSDK2).toString());
                            AFe1cSDK.this.registerClient.remove(pollFirst);
                            Iterator<AFe1fSDK> it = AFe1cSDK.this.AFInAppEventParameterName.iterator();
                            while (it.hasNext()) {
                                it.next().values(pollFirst, aFe1bSDK2);
                            }
                            if (aFe1bSDK2 == AFe1bSDK.SUCCESS) {
                                AFe1cSDK.this.AFKeystoreWrapper.add(pollFirst.AFInAppEventType);
                                AFe1cSDK.valueOf(AFe1cSDK.this);
                                return;
                            }
                            if (pollFirst.valueOf()) {
                                if (AFe1cSDK.AFInAppEventType(pollFirst)) {
                                    synchronized (AFe1cSDK.this.e) {
                                        AFe1cSDK.this.AFLogger.add(pollFirst);
                                        for (AFe1fSDK aFe1fSDK : AFe1cSDK.this.AFInAppEventParameterName) {
                                        }
                                    }
                                    return;
                                }
                                return;
                            }
                            AFe1cSDK.this.AFKeystoreWrapper.add(pollFirst.AFInAppEventType);
                            AFe1cSDK.valueOf(AFe1cSDK.this);
                        }
                    });
                }
            }
        }
    }

    final void AFInAppEventParameterName(NavigableSet<AFe1dSDK<?>> navigableSet) {
        AFe1dSDK<?> pollFirst = navigableSet.pollFirst();
        this.AFKeystoreWrapper.add(pollFirst.AFInAppEventType);
        Iterator<AFe1fSDK> it = this.AFInAppEventParameterName.iterator();
        while (it.hasNext()) {
            it.next().AFInAppEventType(pollFirst);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean valueOf(AFe1dSDK<?> aFe1dSDK) {
        return this.AFKeystoreWrapper.containsAll(aFe1dSDK.valueOf);
    }

    public static boolean AFInAppEventType(AFe1dSDK<?> aFe1dSDK) {
        return ((aFe1dSDK instanceof AFf1iSDK) && aFe1dSDK.AFInAppEventType == AFf1zSDK.ARS_VALIDATE) ? false : true;
    }

    static /* synthetic */ void valueOf(AFe1cSDK aFe1cSDK) {
        synchronized (aFe1cSDK.e) {
            Iterator<AFe1dSDK<?>> it = aFe1cSDK.unregisterClient.iterator();
            boolean z = false;
            while (it.hasNext()) {
                AFe1dSDK<?> next = it.next();
                if (aFe1cSDK.valueOf(next)) {
                    it.remove();
                    aFe1cSDK.e.add(next);
                    z = true;
                }
            }
            if (z) {
                aFe1cSDK.values.submit(aFe1cSDK.new AnonymousClass1());
            }
        }
    }
}
