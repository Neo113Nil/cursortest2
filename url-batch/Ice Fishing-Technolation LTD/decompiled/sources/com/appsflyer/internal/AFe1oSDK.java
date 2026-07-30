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

/* loaded from: classes.dex */
public final class AFe1oSDK {
    final ExecutorService getRevenue;
    public Executor getCurrencyIso4217Code = Executors.newSingleThreadExecutor();
    final Timer getMonetizationNetwork = new Timer(true);
    public final List<AFe1qSDK> getMediationNetwork = new CopyOnWriteArrayList();
    final Set<AFe1pSDK> AFAdRevenueData = new CopyOnWriteArraySet();
    final Set<AFe1pSDK> component2 = Collections.newSetFromMap(new ConcurrentHashMap());
    final NavigableSet<AFe1mSDK<?>> areAllFieldsValid = new ConcurrentSkipListSet();
    final NavigableSet<AFe1mSDK<?>> component1 = new ConcurrentSkipListSet();
    final List<AFe1mSDK<?>> component3 = new ArrayList();
    final Set<AFe1mSDK<?>> component4 = Collections.newSetFromMap(new ConcurrentHashMap());

    public AFe1oSDK(ExecutorService executorService) {
        this.getRevenue = executorService;
    }

    /* renamed from: com.appsflyer.internal.AFe1oSDK$1, reason: invalid class name */
    public class AnonymousClass1 implements Runnable {
        private /* synthetic */ AFe1mSDK getRevenue;

        public AnonymousClass1(AFe1mSDK aFe1mSDK) {
            this.getRevenue = aFe1mSDK;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean add;
            synchronized (AFe1oSDK.this.areAllFieldsValid) {
                if (AFe1oSDK.this.component4.contains(this.getRevenue)) {
                    AFLogger.INSTANCE.d(AFg1cSDK.QUEUE, new StringBuilder("tried to add already running task: ").append(this.getRevenue).toString());
                    return;
                }
                if (!AFe1oSDK.this.areAllFieldsValid.contains(this.getRevenue) && !AFe1oSDK.this.component1.contains(this.getRevenue)) {
                    AFe1oSDK aFe1oSDK = AFe1oSDK.this;
                    AFe1mSDK aFe1mSDK = this.getRevenue;
                    for (AFe1pSDK aFe1pSDK : aFe1mSDK.getCurrencyIso4217Code) {
                        if (aFe1oSDK.component2.contains(aFe1pSDK)) {
                            aFe1mSDK.AFAdRevenueData.add(aFe1pSDK);
                        }
                    }
                    if (AFe1oSDK.this.getMonetizationNetwork(this.getRevenue)) {
                        add = AFe1oSDK.this.areAllFieldsValid.add(this.getRevenue);
                    } else {
                        add = AFe1oSDK.this.component1.add(this.getRevenue);
                        if (add) {
                            AFLogger.INSTANCE.d(AFg1cSDK.QUEUE, new StringBuilder("new task was blocked: ").append(this.getRevenue).toString());
                            this.getRevenue.getMediationNetwork();
                        }
                    }
                    if (add) {
                        AFe1oSDK.this.areAllFieldsValid.addAll(AFe1oSDK.this.component3);
                        AFe1oSDK.this.component3.clear();
                    } else {
                        AFLogger.INSTANCE.d(AFg1cSDK.QUEUE, new StringBuilder("task not added, it's already in the queue: ").append(this.getRevenue).toString());
                    }
                    if (add) {
                        AFe1oSDK.this.component2.add(this.getRevenue.getRevenue);
                        AFLogger.INSTANCE.d(AFg1cSDK.QUEUE, new StringBuilder("new task added: ").append(this.getRevenue).toString());
                        for (AFe1qSDK aFe1qSDK : AFe1oSDK.this.getMediationNetwork) {
                        }
                        AFe1oSDK aFe1oSDK2 = AFe1oSDK.this;
                        aFe1oSDK2.getRevenue.submit(aFe1oSDK2.new AnonymousClass2());
                        AFe1oSDK aFe1oSDK3 = AFe1oSDK.this;
                        synchronized (aFe1oSDK3.areAllFieldsValid) {
                            for (int size = (aFe1oSDK3.areAllFieldsValid.size() + aFe1oSDK3.component1.size()) - 40; size > 0; size--) {
                                boolean isEmpty = aFe1oSDK3.component1.isEmpty();
                                boolean isEmpty2 = aFe1oSDK3.areAllFieldsValid.isEmpty();
                                if (isEmpty2 || isEmpty) {
                                    if (!isEmpty2) {
                                        aFe1oSDK3.getMonetizationNetwork(aFe1oSDK3.areAllFieldsValid);
                                    } else if (!isEmpty) {
                                        aFe1oSDK3.getMonetizationNetwork(aFe1oSDK3.component1);
                                    }
                                } else if (aFe1oSDK3.areAllFieldsValid.first().compareTo(aFe1oSDK3.component1.first()) > 0) {
                                    aFe1oSDK3.getMonetizationNetwork(aFe1oSDK3.areAllFieldsValid);
                                } else {
                                    aFe1oSDK3.getMonetizationNetwork(aFe1oSDK3.component1);
                                }
                            }
                        }
                        return;
                    }
                    AFLogger.INSTANCE.w(AFg1cSDK.QUEUE, new StringBuilder("QUEUE: tried to add already pending task: ").append(this.getRevenue).toString());
                    return;
                }
                AFLogger.INSTANCE.d(AFg1cSDK.QUEUE, new StringBuilder("tried to add already scheduled task: ").append(this.getRevenue).toString());
            }
        }
    }

    /* renamed from: com.appsflyer.internal.AFe1oSDK$2, reason: invalid class name */
    final class AnonymousClass2 implements Runnable {
        AnonymousClass2() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (AFe1oSDK.this.areAllFieldsValid) {
                final AFe1mSDK<?> pollFirst = AFe1oSDK.this.areAllFieldsValid.pollFirst();
                if (pollFirst == null) {
                    return;
                }
                AFe1oSDK.this.component4.add(pollFirst);
                long AFAdRevenueData = pollFirst.AFAdRevenueData();
                AFe1lSDK aFe1lSDK = new AFe1lSDK(Thread.currentThread());
                if (AFAdRevenueData > 0) {
                    AFe1oSDK.this.getMonetizationNetwork.schedule(aFe1lSDK, AFAdRevenueData);
                }
                final AFe1oSDK aFe1oSDK = AFe1oSDK.this;
                aFe1oSDK.getCurrencyIso4217Code.execute(new Runnable() { // from class: com.appsflyer.internal.AFe1oSDK.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        for (AFe1qSDK aFe1qSDK : AFe1oSDK.this.getMediationNetwork) {
                        }
                    }
                });
                if (!AFe1oSDK.this.areAllFieldsValid.isEmpty()) {
                    AFe1oSDK aFe1oSDK2 = AFe1oSDK.this;
                    aFe1oSDK2.getRevenue.submit(aFe1oSDK2.new AnonymousClass2());
                }
                try {
                    AFLogger.INSTANCE.d(AFg1cSDK.QUEUE, "starting task execution: ".concat(String.valueOf(pollFirst)));
                    final AFe1uSDK call = pollFirst.call();
                    aFe1lSDK.cancel();
                    final AFe1oSDK aFe1oSDK3 = AFe1oSDK.this;
                    aFe1oSDK3.getCurrencyIso4217Code.execute(new Runnable() { // from class: com.appsflyer.internal.AFe1oSDK.4
                        @Override // java.lang.Runnable
                        public final void run() {
                            AFLogger.INSTANCE.d(AFg1cSDK.QUEUE, new StringBuilder("execution finished for ").append(pollFirst).append(", result: ").append(call).toString());
                            AFe1oSDK.this.component4.remove(pollFirst);
                            Iterator<AFe1qSDK> it = AFe1oSDK.this.getMediationNetwork.iterator();
                            while (it.hasNext()) {
                                it.next().getRevenue(pollFirst, call);
                            }
                            if (call == AFe1uSDK.SUCCESS) {
                                AFe1oSDK.this.AFAdRevenueData.add(pollFirst.getRevenue);
                                AFe1oSDK.this.getRevenue();
                                return;
                            }
                            if (pollFirst.getMonetizationNetwork()) {
                                if (AFe1oSDK.AFAdRevenueData(pollFirst)) {
                                    synchronized (AFe1oSDK.this.areAllFieldsValid) {
                                        AFe1oSDK.this.component3.add(pollFirst);
                                        for (AFe1qSDK aFe1qSDK : AFe1oSDK.this.getMediationNetwork) {
                                        }
                                    }
                                    return;
                                }
                                return;
                            }
                            AFe1oSDK.this.AFAdRevenueData.add(pollFirst.getRevenue);
                            AFe1oSDK.this.getRevenue();
                        }
                    });
                } catch (InterruptedIOException | InterruptedException unused) {
                    AFLogger.INSTANCE.d(AFg1cSDK.QUEUE, "task was interrupted: ".concat(String.valueOf(pollFirst)));
                    pollFirst.getMonetizationNetwork = AFe1uSDK.TIMEOUT;
                    final AFe1oSDK aFe1oSDK4 = AFe1oSDK.this;
                    final AFe1uSDK aFe1uSDK = AFe1uSDK.TIMEOUT;
                    aFe1oSDK4.getCurrencyIso4217Code.execute(new Runnable() { // from class: com.appsflyer.internal.AFe1oSDK.4
                        @Override // java.lang.Runnable
                        public final void run() {
                            AFLogger.INSTANCE.d(AFg1cSDK.QUEUE, new StringBuilder("execution finished for ").append(pollFirst).append(", result: ").append(aFe1uSDK).toString());
                            AFe1oSDK.this.component4.remove(pollFirst);
                            Iterator<AFe1qSDK> it = AFe1oSDK.this.getMediationNetwork.iterator();
                            while (it.hasNext()) {
                                it.next().getRevenue(pollFirst, aFe1uSDK);
                            }
                            if (aFe1uSDK == AFe1uSDK.SUCCESS) {
                                AFe1oSDK.this.AFAdRevenueData.add(pollFirst.getRevenue);
                                AFe1oSDK.this.getRevenue();
                                return;
                            }
                            if (pollFirst.getMonetizationNetwork()) {
                                if (AFe1oSDK.AFAdRevenueData(pollFirst)) {
                                    synchronized (AFe1oSDK.this.areAllFieldsValid) {
                                        AFe1oSDK.this.component3.add(pollFirst);
                                        for (AFe1qSDK aFe1qSDK : AFe1oSDK.this.getMediationNetwork) {
                                        }
                                    }
                                    return;
                                }
                                return;
                            }
                            AFe1oSDK.this.AFAdRevenueData.add(pollFirst.getRevenue);
                            AFe1oSDK.this.getRevenue();
                        }
                    });
                } catch (Throwable unused2) {
                    aFe1lSDK.cancel();
                    final AFe1oSDK aFe1oSDK5 = AFe1oSDK.this;
                    final AFe1uSDK aFe1uSDK2 = AFe1uSDK.FAILURE;
                    aFe1oSDK5.getCurrencyIso4217Code.execute(new Runnable() { // from class: com.appsflyer.internal.AFe1oSDK.4
                        @Override // java.lang.Runnable
                        public final void run() {
                            AFLogger.INSTANCE.d(AFg1cSDK.QUEUE, new StringBuilder("execution finished for ").append(pollFirst).append(", result: ").append(aFe1uSDK2).toString());
                            AFe1oSDK.this.component4.remove(pollFirst);
                            Iterator<AFe1qSDK> it = AFe1oSDK.this.getMediationNetwork.iterator();
                            while (it.hasNext()) {
                                it.next().getRevenue(pollFirst, aFe1uSDK2);
                            }
                            if (aFe1uSDK2 == AFe1uSDK.SUCCESS) {
                                AFe1oSDK.this.AFAdRevenueData.add(pollFirst.getRevenue);
                                AFe1oSDK.this.getRevenue();
                                return;
                            }
                            if (pollFirst.getMonetizationNetwork()) {
                                if (AFe1oSDK.AFAdRevenueData(pollFirst)) {
                                    synchronized (AFe1oSDK.this.areAllFieldsValid) {
                                        AFe1oSDK.this.component3.add(pollFirst);
                                        for (AFe1qSDK aFe1qSDK : AFe1oSDK.this.getMediationNetwork) {
                                        }
                                    }
                                    return;
                                }
                                return;
                            }
                            AFe1oSDK.this.AFAdRevenueData.add(pollFirst.getRevenue);
                            AFe1oSDK.this.getRevenue();
                        }
                    });
                }
            }
        }
    }

    final void getRevenue() {
        synchronized (this.areAllFieldsValid) {
            Iterator<AFe1mSDK<?>> it = this.component1.iterator();
            boolean z = false;
            while (it.hasNext()) {
                AFe1mSDK<?> next = it.next();
                if (getMonetizationNetwork(next)) {
                    it.remove();
                    this.areAllFieldsValid.add(next);
                    z = true;
                }
            }
            if (z) {
                this.getRevenue.submit(new AnonymousClass2());
            }
        }
    }

    final void getMonetizationNetwork(NavigableSet<AFe1mSDK<?>> navigableSet) {
        AFe1mSDK<?> pollFirst = navigableSet.pollFirst();
        this.AFAdRevenueData.add(pollFirst.getRevenue);
        Iterator<AFe1qSDK> it = this.getMediationNetwork.iterator();
        while (it.hasNext()) {
            it.next().getCurrencyIso4217Code(pollFirst);
        }
    }

    final boolean getMonetizationNetwork(AFe1mSDK<?> aFe1mSDK) {
        return this.AFAdRevenueData.containsAll(aFe1mSDK.AFAdRevenueData);
    }

    public static boolean AFAdRevenueData(AFe1mSDK<?> aFe1mSDK) {
        return ((aFe1mSDK instanceof AFf1uSDK) && aFe1mSDK.getRevenue == AFe1pSDK.ARS_VALIDATE) ? false : true;
    }
}
