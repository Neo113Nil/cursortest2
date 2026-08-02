package com.stripe.android.uicore.image;

import android.content.Context;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.stripe.android.core.Logger$Companion;
import com.stripe.android.core.Logger$Companion$NOOP_LOGGER$1;
import com.stripe.android.uicore.image.DefaultStripeImageLoader$load$2;
import java.net.URL;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexImpl;
import net.idrnd.face.iad.capture.internal.o0;
import net.idrnd.misnap.iad.Payload;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class DefaultStripeImageLoader {
    public final o0 diskCache;
    public final ConcurrentHashMap imageLoadMutexes;
    public final Logger$Companion$NOOP_LOGGER$1 logger;
    public final Payload memoryCache;
    public final NetworkImageDecoder networkImageDecoder;

    public DefaultStripeImageLoader(Context context, int i) {
        Logger$Companion$NOOP_LOGGER$1 logger$Companion$NOOP_LOGGER$1 = (context.getApplicationInfo().flags & 2) != 0 ? Logger$Companion.REAL_LOGGER : Logger$Companion.NOOP_LOGGER;
        Payload payload = new Payload(8);
        NetworkImageDecoder networkImageDecoder = new NetworkImageDecoder();
        o0 o0Var = (i & 16) != 0 ? new o0(context, 10) : null;
        context.getClass();
        this.logger = logger$Companion$NOOP_LOGGER$1;
        this.memoryCache = payload;
        this.networkImageDecoder = networkImageDecoder;
        this.diskCache = o0Var;
        this.imageLoadMutexes = new ConcurrentHashMap();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(10:5|6|7|(1:(2:10|11)(2:28|29))(3:30|31|(1:33))|12|(5:14|(1:16)|17|(1:19)|20)|21|22|(1:24)|25))|36|6|7|(0)(0)|12|(0)|21|22|(0)|25) */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x002c, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0086, code lost:
    
        r8 = kotlin.Result.Companion;
        r4 = new kotlin.Result.Failure(r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0073 A[Catch: all -> 0x002c, TryCatch #0 {all -> 0x002c, blocks: (B:11:0x0028, B:12:0x006f, B:14:0x0073, B:16:0x0077, B:17:0x007a, B:19:0x007e, B:20:0x0081, B:21:0x0083, B:31:0x0037), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* renamed from: access$loadFromNetwork-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m4076access$loadFromNetworkBWLJW6A(DefaultStripeImageLoader defaultStripeImageLoader, String str, int i, int i2, ContinuationImpl continuationImpl) {
        DefaultStripeImageLoader$loadFromNetwork$1 defaultStripeImageLoader$loadFromNetwork$1;
        int i3;
        Throwable m4120exceptionOrNullimpl;
        LoadedImage loadedImage;
        if (continuationImpl instanceof DefaultStripeImageLoader$loadFromNetwork$1) {
            defaultStripeImageLoader$loadFromNetwork$1 = (DefaultStripeImageLoader$loadFromNetwork$1) continuationImpl;
            int i4 = defaultStripeImageLoader$loadFromNetwork$1.label;
            if ((i4 & PKIFailureInfo.systemUnavail) != 0) {
                defaultStripeImageLoader$loadFromNetwork$1.label = i4 - PKIFailureInfo.systemUnavail;
                Object obj = defaultStripeImageLoader$loadFromNetwork$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i3 = defaultStripeImageLoader$loadFromNetwork$1.label;
                Object obj2 = null;
                if (i3 != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Result.Companion companion = Result.Companion;
                    defaultStripeImageLoader.debug("Image " + str + " loading from internet (" + i + " x " + i2 + ")");
                    NetworkImageDecoder networkImageDecoder = defaultStripeImageLoader.networkImageDecoder;
                    URL url = new URL(str);
                    defaultStripeImageLoader$loadFromNetwork$1.L$0 = str;
                    defaultStripeImageLoader$loadFromNetwork$1.label = 1;
                    obj = networkImageDecoder.decode(url, i, i2, defaultStripeImageLoader$loadFromNetwork$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i3 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = defaultStripeImageLoader$loadFromNetwork$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                loadedImage = (LoadedImage) obj;
                if (loadedImage != null) {
                    o0 o0Var = defaultStripeImageLoader.diskCache;
                    if (o0Var != null) {
                        o0Var.put(str, loadedImage);
                    }
                    Payload payload = defaultStripeImageLoader.memoryCache;
                    if (payload != null) {
                        payload.put(str, loadedImage);
                    }
                    obj2 = loadedImage.bitmap;
                }
                Result.Companion companion2 = Result.Companion;
                m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(obj2);
                if (m4120exceptionOrNullimpl != null) {
                    defaultStripeImageLoader.logger.error("StripeImageLoader: Could not load image from network", m4120exceptionOrNullimpl);
                }
                return obj2;
            }
        }
        defaultStripeImageLoader$loadFromNetwork$1 = new DefaultStripeImageLoader$loadFromNetwork$1(defaultStripeImageLoader, continuationImpl);
        Object obj3 = defaultStripeImageLoader$loadFromNetwork$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i3 = defaultStripeImageLoader$loadFromNetwork$1.label;
        Object obj22 = null;
        if (i3 != 0) {
        }
        loadedImage = (LoadedImage) obj3;
        if (loadedImage != null) {
        }
        Result.Companion companion22 = Result.Companion;
        m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(obj22);
        if (m4120exceptionOrNullimpl != null) {
        }
        return obj22;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0071, code lost:
    
        if (r7.lock(r1) == r10) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$withMutexByUrlLock(DefaultStripeImageLoader defaultStripeImageLoader, String str, DefaultStripeImageLoader$load$2.AnonymousClass1 anonymousClass1, ContinuationImpl continuationImpl) {
        DefaultStripeImageLoader$withMutexByUrlLock$1 defaultStripeImageLoader$withMutexByUrlLock$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        Mutex mutex;
        int i2;
        Object putIfAbsent;
        Mutex mutex2;
        Throwable th;
        Object invoke;
        String str2;
        ConcurrentHashMap concurrentHashMap = defaultStripeImageLoader.imageLoadMutexes;
        try {
            if (continuationImpl instanceof DefaultStripeImageLoader$withMutexByUrlLock$1) {
                defaultStripeImageLoader$withMutexByUrlLock$1 = (DefaultStripeImageLoader$withMutexByUrlLock$1) continuationImpl;
                int i3 = defaultStripeImageLoader$withMutexByUrlLock$1.label;
                if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                    defaultStripeImageLoader$withMutexByUrlLock$1.label = i3 - PKIFailureInfo.systemUnavail;
                    Object obj = defaultStripeImageLoader$withMutexByUrlLock$1.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = defaultStripeImageLoader$withMutexByUrlLock$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        Object obj2 = concurrentHashMap.get(str);
                        if (obj2 == null && (putIfAbsent = concurrentHashMap.putIfAbsent(str, (obj2 = new MutexImpl()))) != null) {
                            obj2 = putIfAbsent;
                        }
                        mutex = (Mutex) obj2;
                        defaultStripeImageLoader$withMutexByUrlLock$1.L$0 = str;
                        defaultStripeImageLoader$withMutexByUrlLock$1.L$1 = anonymousClass1;
                        defaultStripeImageLoader$withMutexByUrlLock$1.L$2 = mutex;
                        i2 = 0;
                        defaultStripeImageLoader$withMutexByUrlLock$1.I$0 = 0;
                        defaultStripeImageLoader$withMutexByUrlLock$1.label = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            mutex2 = defaultStripeImageLoader$withMutexByUrlLock$1.L$2;
                            str2 = defaultStripeImageLoader$withMutexByUrlLock$1.L$0;
                            try {
                                SafeTrace.throwOnFailure(obj);
                                mutex2.unlock(null);
                                concurrentHashMap.remove(str2);
                                return obj;
                            } catch (Throwable th2) {
                                th = th2;
                                mutex2.unlock(null);
                                throw th;
                            }
                        }
                        int i4 = defaultStripeImageLoader$withMutexByUrlLock$1.I$0;
                        Mutex mutex3 = defaultStripeImageLoader$withMutexByUrlLock$1.L$2;
                        DefaultStripeImageLoader$load$2.AnonymousClass1 anonymousClass12 = defaultStripeImageLoader$withMutexByUrlLock$1.L$1;
                        String str3 = defaultStripeImageLoader$withMutexByUrlLock$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        mutex = mutex3;
                        anonymousClass1 = anonymousClass12;
                        i2 = i4;
                        str = str3;
                    }
                    defaultStripeImageLoader$withMutexByUrlLock$1.L$0 = str;
                    defaultStripeImageLoader$withMutexByUrlLock$1.L$1 = null;
                    defaultStripeImageLoader$withMutexByUrlLock$1.L$2 = mutex;
                    defaultStripeImageLoader$withMutexByUrlLock$1.I$0 = i2;
                    defaultStripeImageLoader$withMutexByUrlLock$1.label = 2;
                    invoke = anonymousClass1.invoke(defaultStripeImageLoader$withMutexByUrlLock$1);
                    if (invoke != coroutineSingletons) {
                        String str4 = str;
                        mutex2 = mutex;
                        obj = invoke;
                        str2 = str4;
                        mutex2.unlock(null);
                        concurrentHashMap.remove(str2);
                        return obj;
                    }
                    return coroutineSingletons;
                }
            }
            defaultStripeImageLoader$withMutexByUrlLock$1.L$0 = str;
            defaultStripeImageLoader$withMutexByUrlLock$1.L$1 = null;
            defaultStripeImageLoader$withMutexByUrlLock$1.L$2 = mutex;
            defaultStripeImageLoader$withMutexByUrlLock$1.I$0 = i2;
            defaultStripeImageLoader$withMutexByUrlLock$1.label = 2;
            invoke = anonymousClass1.invoke(defaultStripeImageLoader$withMutexByUrlLock$1);
            if (invoke != coroutineSingletons) {
            }
            return coroutineSingletons;
        } catch (Throwable th3) {
            mutex2 = mutex;
            th = th3;
            mutex2.unlock(null);
            throw th;
        }
        defaultStripeImageLoader$withMutexByUrlLock$1 = new DefaultStripeImageLoader$withMutexByUrlLock$1(defaultStripeImageLoader, continuationImpl);
        Object obj3 = defaultStripeImageLoader$withMutexByUrlLock$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = defaultStripeImageLoader$withMutexByUrlLock$1.label;
        if (i != 0) {
        }
    }

    public final void debug(String str) {
        this.logger.debug("StripeImageLoader: ".concat(str));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: load-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4077loadBWLJW6A(String str, int i, int i2, ContinuationImpl continuationImpl) {
        DefaultStripeImageLoader$load$1 defaultStripeImageLoader$load$1;
        int i3;
        if (continuationImpl instanceof DefaultStripeImageLoader$load$1) {
            defaultStripeImageLoader$load$1 = (DefaultStripeImageLoader$load$1) continuationImpl;
            int i4 = defaultStripeImageLoader$load$1.label;
            if ((i4 & PKIFailureInfo.systemUnavail) != 0) {
                defaultStripeImageLoader$load$1.label = i4 - PKIFailureInfo.systemUnavail;
                Object obj = defaultStripeImageLoader$load$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i3 = defaultStripeImageLoader$load$1.label;
                if (i3 != 0) {
                    SafeTrace.throwOnFailure(obj);
                    DefaultScheduler defaultScheduler = Dispatchers.Default;
                    DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.INSTANCE;
                    DefaultStripeImageLoader$load$2 defaultStripeImageLoader$load$2 = new DefaultStripeImageLoader$load$2(this, str, i, i2, null);
                    defaultStripeImageLoader$load$1.label = 1;
                    obj = JobKt.withContext(defaultIoScheduler, defaultStripeImageLoader$load$2, defaultStripeImageLoader$load$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i3 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return ((Result) obj).value;
            }
        }
        defaultStripeImageLoader$load$1 = new DefaultStripeImageLoader$load$1(this, continuationImpl);
        Object obj2 = defaultStripeImageLoader$load$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i3 = defaultStripeImageLoader$load$1.label;
        if (i3 != 0) {
        }
        return ((Result) obj2).value;
    }
}
