package org.greenrobot.eventbus;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.logging.Level;

/* loaded from: classes5.dex */
public class c {
    public static String TAG = "EventBus";
    static volatile c defaultInstance;
    private final org.greenrobot.eventbus.a asyncPoster;
    private final org.greenrobot.eventbus.b backgroundPoster;
    private final ThreadLocal<C0398c> currentPostingThreadState;
    private final boolean eventInheritance;
    private final ExecutorService executorService;
    private final int indexCount;
    private final boolean logNoSubscriberMessages;
    private final boolean logSubscriberExceptions;
    private final f logger;
    private final k mainThreadPoster;
    private final g mainThreadSupport;
    private final boolean sendNoSubscriberEvent;
    private final boolean sendSubscriberExceptionEvent;
    private final Map<Class<?>, Object> stickyEvents;
    private final o subscriberMethodFinder;
    private final Map<Class<?>, CopyOnWriteArrayList<p>> subscriptionsByEventType;
    private final boolean throwSubscriberException;
    private final Map<Object, List<Class<?>>> typesBySubscriber;
    private static final d DEFAULT_BUILDER = new d();
    private static final Map<Class<?>, List<Class<?>>> eventTypesCache = new HashMap();

    class a extends ThreadLocal {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public C0398c initialValue() {
            return new C0398c();
        }
    }

    static /* synthetic */ class b {
        static final /* synthetic */ int[] $SwitchMap$org$greenrobot$eventbus$ThreadMode;

        static {
            int[] iArr = new int[ThreadMode.values().length];
            $SwitchMap$org$greenrobot$eventbus$ThreadMode = iArr;
            try {
                iArr[ThreadMode.POSTING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$greenrobot$eventbus$ThreadMode[ThreadMode.MAIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$greenrobot$eventbus$ThreadMode[ThreadMode.MAIN_ORDERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$greenrobot$eventbus$ThreadMode[ThreadMode.BACKGROUND.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$greenrobot$eventbus$ThreadMode[ThreadMode.ASYNC.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* renamed from: org.greenrobot.eventbus.c$c, reason: collision with other inner class name */
    static final class C0398c {
        boolean canceled;
        Object event;
        final List<Object> eventQueue = new ArrayList();
        boolean isMainThread;
        boolean isPosting;
        p subscription;

        C0398c() {
        }
    }

    public c() {
        this(DEFAULT_BUILDER);
    }

    static void addInterfaces(List<Class<?>> list, Class<?>[] clsArr) {
        for (Class<?> cls : clsArr) {
            if (!list.contains(cls)) {
                list.add(cls);
                addInterfaces(list, cls.getInterfaces());
            }
        }
    }

    public static d builder() {
        return new d();
    }

    private void checkPostStickyEventToSubscription(p pVar, Object obj) {
        if (obj != null) {
            postToSubscription(pVar, obj, isMainThread());
        }
    }

    public static void clearCaches() {
        o.clearCaches();
        eventTypesCache.clear();
    }

    public static c getDefault() {
        c cVar = defaultInstance;
        if (cVar == null) {
            synchronized (c.class) {
                try {
                    cVar = defaultInstance;
                    if (cVar == null) {
                        cVar = new c();
                        defaultInstance = cVar;
                    }
                } finally {
                }
            }
        }
        return cVar;
    }

    private void handleSubscriberException(p pVar, Object obj, Throwable th) {
        if (!(obj instanceof m)) {
            if (this.throwSubscriberException) {
                throw new EventBusException("Invoking subscriber failed", th);
            }
            if (this.logSubscriberExceptions) {
                this.logger.log(Level.SEVERE, "Could not dispatch event: " + obj.getClass() + " to subscribing class " + pVar.subscriber.getClass(), th);
            }
            if (this.sendSubscriberExceptionEvent) {
                post(new m(this, th, obj, pVar.subscriber));
                return;
            }
            return;
        }
        if (this.logSubscriberExceptions) {
            f fVar = this.logger;
            Level level = Level.SEVERE;
            fVar.log(level, "SubscriberExceptionEvent subscriber " + pVar.subscriber.getClass() + " threw an exception", th);
            m mVar = (m) obj;
            this.logger.log(level, "Initial event " + mVar.causingEvent + " caused exception in " + mVar.causingSubscriber, mVar.throwable);
        }
    }

    private boolean isMainThread() {
        g gVar = this.mainThreadSupport;
        return gVar == null || gVar.isMainThread();
    }

    private static List<Class<?>> lookupAllEventTypes(Class<?> cls) {
        List<Class<?>> list;
        Map<Class<?>, List<Class<?>>> map = eventTypesCache;
        synchronized (map) {
            try {
                list = map.get(cls);
                if (list == null) {
                    list = new ArrayList<>();
                    for (Class<?> cls2 = cls; cls2 != null; cls2 = cls2.getSuperclass()) {
                        list.add(cls2);
                        addInterfaces(list, cls2.getInterfaces());
                    }
                    eventTypesCache.put(cls, list);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return list;
    }

    private void postSingleEvent(Object obj, C0398c c0398c) {
        boolean postSingleEventForEventType;
        Class<?> cls = obj.getClass();
        if (this.eventInheritance) {
            List<Class<?>> lookupAllEventTypes = lookupAllEventTypes(cls);
            int size = lookupAllEventTypes.size();
            postSingleEventForEventType = false;
            for (int i8 = 0; i8 < size; i8++) {
                postSingleEventForEventType |= postSingleEventForEventType(obj, c0398c, lookupAllEventTypes.get(i8));
            }
        } else {
            postSingleEventForEventType = postSingleEventForEventType(obj, c0398c, cls);
        }
        if (postSingleEventForEventType) {
            return;
        }
        if (this.logNoSubscriberMessages) {
            this.logger.log(Level.FINE, "No subscribers registered for event " + cls);
        }
        if (!this.sendNoSubscriberEvent || cls == h.class || cls == m.class) {
            return;
        }
        post(new h(this, obj));
    }

    private boolean postSingleEventForEventType(Object obj, C0398c c0398c, Class<?> cls) {
        CopyOnWriteArrayList<p> copyOnWriteArrayList;
        synchronized (this) {
            copyOnWriteArrayList = this.subscriptionsByEventType.get(cls);
        }
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        Iterator<p> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            p next = it.next();
            c0398c.event = obj;
            c0398c.subscription = next;
            try {
                postToSubscription(next, obj, c0398c.isMainThread);
                if (c0398c.canceled) {
                    return true;
                }
            } finally {
                c0398c.event = null;
                c0398c.subscription = null;
                c0398c.canceled = false;
            }
        }
        return true;
    }

    private void postToSubscription(p pVar, Object obj, boolean z7) {
        int i8 = b.$SwitchMap$org$greenrobot$eventbus$ThreadMode[pVar.subscriberMethod.threadMode.ordinal()];
        if (i8 == 1) {
            invokeSubscriber(pVar, obj);
            return;
        }
        if (i8 == 2) {
            if (z7) {
                invokeSubscriber(pVar, obj);
                return;
            } else {
                this.mainThreadPoster.enqueue(pVar, obj);
                return;
            }
        }
        if (i8 == 3) {
            k kVar = this.mainThreadPoster;
            if (kVar != null) {
                kVar.enqueue(pVar, obj);
                return;
            } else {
                invokeSubscriber(pVar, obj);
                return;
            }
        }
        if (i8 == 4) {
            if (z7) {
                this.backgroundPoster.enqueue(pVar, obj);
                return;
            } else {
                invokeSubscriber(pVar, obj);
                return;
            }
        }
        if (i8 == 5) {
            this.asyncPoster.enqueue(pVar, obj);
            return;
        }
        throw new IllegalStateException("Unknown thread mode: " + pVar.subscriberMethod.threadMode);
    }

    private void subscribe(Object obj, n nVar) {
        Class<?> cls = nVar.eventType;
        p pVar = new p(obj, nVar);
        CopyOnWriteArrayList<p> copyOnWriteArrayList = this.subscriptionsByEventType.get(cls);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            this.subscriptionsByEventType.put(cls, copyOnWriteArrayList);
        } else if (copyOnWriteArrayList.contains(pVar)) {
            throw new EventBusException("Subscriber " + obj.getClass() + " already registered to event " + cls);
        }
        int size = copyOnWriteArrayList.size();
        for (int i8 = 0; i8 <= size; i8++) {
            if (i8 == size || nVar.priority > copyOnWriteArrayList.get(i8).subscriberMethod.priority) {
                copyOnWriteArrayList.add(i8, pVar);
                break;
            }
        }
        List<Class<?>> list = this.typesBySubscriber.get(obj);
        if (list == null) {
            list = new ArrayList<>();
            this.typesBySubscriber.put(obj, list);
        }
        list.add(cls);
        if (nVar.sticky) {
            if (!this.eventInheritance) {
                checkPostStickyEventToSubscription(pVar, this.stickyEvents.get(cls));
                return;
            }
            for (Map.Entry<Class<?>, Object> entry : this.stickyEvents.entrySet()) {
                if (cls.isAssignableFrom(entry.getKey())) {
                    checkPostStickyEventToSubscription(pVar, entry.getValue());
                }
            }
        }
    }

    private void unsubscribeByEventType(Object obj, Class<?> cls) {
        CopyOnWriteArrayList<p> copyOnWriteArrayList = this.subscriptionsByEventType.get(cls);
        if (copyOnWriteArrayList != null) {
            int size = copyOnWriteArrayList.size();
            int i8 = 0;
            while (i8 < size) {
                p pVar = copyOnWriteArrayList.get(i8);
                if (pVar.subscriber == obj) {
                    pVar.active = false;
                    copyOnWriteArrayList.remove(i8);
                    i8--;
                    size--;
                }
                i8++;
            }
        }
    }

    public void cancelEventDelivery(Object obj) {
        C0398c c0398c = this.currentPostingThreadState.get();
        if (!c0398c.isPosting) {
            throw new EventBusException("This method may only be called from inside event handling methods on the posting thread");
        }
        if (obj == null) {
            throw new EventBusException("Event may not be null");
        }
        if (c0398c.event != obj) {
            throw new EventBusException("Only the currently handled event may be aborted");
        }
        if (c0398c.subscription.subscriberMethod.threadMode != ThreadMode.POSTING) {
            throw new EventBusException(" event handlers may only abort the incoming event");
        }
        c0398c.canceled = true;
    }

    ExecutorService getExecutorService() {
        return this.executorService;
    }

    public f getLogger() {
        return this.logger;
    }

    public <T> T getStickyEvent(Class<T> cls) {
        T cast;
        synchronized (this.stickyEvents) {
            cast = cls.cast(this.stickyEvents.get(cls));
        }
        return cast;
    }

    public boolean hasSubscriberForEvent(Class<?> cls) {
        CopyOnWriteArrayList<p> copyOnWriteArrayList;
        List<Class<?>> lookupAllEventTypes = lookupAllEventTypes(cls);
        if (lookupAllEventTypes != null) {
            int size = lookupAllEventTypes.size();
            for (int i8 = 0; i8 < size; i8++) {
                Class<?> cls2 = lookupAllEventTypes.get(i8);
                synchronized (this) {
                    copyOnWriteArrayList = this.subscriptionsByEventType.get(cls2);
                }
                if (copyOnWriteArrayList != null && !copyOnWriteArrayList.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    void invokeSubscriber(i iVar) {
        Object obj = iVar.event;
        p pVar = iVar.subscription;
        i.releasePendingPost(iVar);
        if (pVar.active) {
            invokeSubscriber(pVar, obj);
        }
    }

    public synchronized boolean isRegistered(Object obj) {
        return this.typesBySubscriber.containsKey(obj);
    }

    public void post(Object obj) {
        C0398c c0398c = this.currentPostingThreadState.get();
        List<Object> list = c0398c.eventQueue;
        list.add(obj);
        if (c0398c.isPosting) {
            return;
        }
        c0398c.isMainThread = isMainThread();
        c0398c.isPosting = true;
        if (c0398c.canceled) {
            throw new EventBusException("Internal error. Abort state was not reset");
        }
        while (true) {
            try {
                if (list.isEmpty()) {
                    return;
                } else {
                    postSingleEvent(list.remove(0), c0398c);
                }
            } finally {
                c0398c.isPosting = false;
                c0398c.isMainThread = false;
            }
        }
    }

    public void postSticky(Object obj) {
        synchronized (this.stickyEvents) {
            this.stickyEvents.put(obj.getClass(), obj);
        }
        post(obj);
    }

    public void register(Object obj) {
        if (m7.b.isAndroidSDKAvailable() && !m7.b.areAndroidComponentsAvailable()) {
            throw new RuntimeException("It looks like you are using EventBus on Android, make sure to add the \"eventbus\" Android library to your dependencies.");
        }
        List<n> findSubscriberMethods = this.subscriberMethodFinder.findSubscriberMethods(obj.getClass());
        synchronized (this) {
            try {
                Iterator<n> it = findSubscriberMethods.iterator();
                while (it.hasNext()) {
                    subscribe(obj, it.next());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void removeAllStickyEvents() {
        synchronized (this.stickyEvents) {
            this.stickyEvents.clear();
        }
    }

    public <T> T removeStickyEvent(Class<T> cls) {
        T cast;
        synchronized (this.stickyEvents) {
            cast = cls.cast(this.stickyEvents.remove(cls));
        }
        return cast;
    }

    public String toString() {
        return "EventBus[indexCount=" + this.indexCount + ", eventInheritance=" + this.eventInheritance + "]";
    }

    public synchronized void unregister(Object obj) {
        try {
            List<Class<?>> list = this.typesBySubscriber.get(obj);
            if (list != null) {
                Iterator<Class<?>> it = list.iterator();
                while (it.hasNext()) {
                    unsubscribeByEventType(obj, it.next());
                }
                this.typesBySubscriber.remove(obj);
            } else {
                this.logger.log(Level.WARNING, "Subscriber to unregister was not registered before: " + obj.getClass());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    c(d dVar) {
        this.currentPostingThreadState = new a();
        this.logger = dVar.getLogger();
        this.subscriptionsByEventType = new HashMap();
        this.typesBySubscriber = new HashMap();
        this.stickyEvents = new ConcurrentHashMap();
        g mainThreadSupport = dVar.getMainThreadSupport();
        this.mainThreadSupport = mainThreadSupport;
        this.mainThreadPoster = mainThreadSupport != null ? mainThreadSupport.createPoster(this) : null;
        this.backgroundPoster = new org.greenrobot.eventbus.b(this);
        this.asyncPoster = new org.greenrobot.eventbus.a(this);
        List<n7.b> list = dVar.subscriberInfoIndexes;
        this.indexCount = list != null ? list.size() : 0;
        this.subscriberMethodFinder = new o(dVar.subscriberInfoIndexes, dVar.strictMethodVerification, dVar.ignoreGeneratedIndex);
        this.logSubscriberExceptions = dVar.logSubscriberExceptions;
        this.logNoSubscriberMessages = dVar.logNoSubscriberMessages;
        this.sendSubscriberExceptionEvent = dVar.sendSubscriberExceptionEvent;
        this.sendNoSubscriberEvent = dVar.sendNoSubscriberEvent;
        this.throwSubscriberException = dVar.throwSubscriberException;
        this.eventInheritance = dVar.eventInheritance;
        this.executorService = dVar.executorService;
    }

    public boolean removeStickyEvent(Object obj) {
        synchronized (this.stickyEvents) {
            try {
                Class<?> cls = obj.getClass();
                if (!obj.equals(this.stickyEvents.get(cls))) {
                    return false;
                }
                this.stickyEvents.remove(cls);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void invokeSubscriber(p pVar, Object obj) {
        try {
            pVar.subscriberMethod.method.invoke(pVar.subscriber, obj);
        } catch (IllegalAccessException e8) {
            throw new IllegalStateException("Unexpected exception", e8);
        } catch (InvocationTargetException e9) {
            handleSubscriberException(pVar, obj, e9.getCause());
        }
    }
}
