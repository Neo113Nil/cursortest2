package com.stripe.android.uicore.image;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import androidx.camera.camera2.impl.DeferredUseCaseCameraRequestControl;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.lazy.LazyListMeasureResult;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.layout.LazyLayoutKt;
import androidx.compose.foundation.pager.PagerScrollScopeKt$LazyLayoutScrollScope$1;
import androidx.compose.ui.unit.Density;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.jakewharton.disklrucache.DiskLruCache;
import com.squareup.cash.initialscreenloader.backend.RealInitialScreenLoader;
import com.squareup.cash.initialscreenloader.backend.RealInitialScreenLoader$resetSandbox$2;
import com.squareup.cash.session.backend.RealOnSessionChangeActionsExecutor;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.storage.StorageLink;
import com.stripe.android.stripe3ds2.utils.ImageCache$Default$cache$1;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import net.idrnd.face.iad.capture.internal.o0;
import net.idrnd.misnap.iad.Payload;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class DefaultStripeImageLoader$load$2 extends SuspendLambda implements Function2 {
    public int $height;
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Object $url;
    public int $width;
    public int label;
    public /* synthetic */ Object this$0;

    /* renamed from: com.stripe.android.uicore.image.DefaultStripeImageLoader$load$2$1, reason: invalid class name */
    /* loaded from: classes8.dex */
    public final class AnonymousClass1 extends SuspendLambda implements Function1 {
        public final /* synthetic */ int $height;
        public final /* synthetic */ String $url;
        public final /* synthetic */ int $width;
        public int label;
        public final /* synthetic */ DefaultStripeImageLoader this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(DefaultStripeImageLoader defaultStripeImageLoader, String str, int i, int i2, Continuation continuation) {
            super(1, continuation);
            this.this$0 = defaultStripeImageLoader;
            this.$url = str;
            this.$width = i;
            this.$height = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$url, this.$width, this.$height, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return ((AnonymousClass1) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:38:0x00d9  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00e6  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00f8  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00fb  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x00df  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x00d2  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            LoadedImage loadedImage;
            Result result;
            LoadedImage loadedImage2;
            Object m4076access$loadFromNetworkBWLJW6A;
            DiskLruCache.Snapshot snapshot;
            DiskLruCache.Snapshot snapshot2;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            Result result2 = null;
            DiskLruCache.Snapshot snapshot3 = null;
            if (i == 0) {
                SafeTrace.throwOnFailure(obj);
                DefaultStripeImageLoader defaultStripeImageLoader = this.this$0;
                String str = this.$url;
                Payload payload = defaultStripeImageLoader.memoryCache;
                if (payload != null) {
                    str.getClass();
                    synchronized (payload) {
                        loadedImage = (LoadedImage) ((ImageCache$Default$cache$1) payload.a).get(String.valueOf(str.hashCode()));
                    }
                } else {
                    loadedImage = null;
                }
                if (loadedImage != null) {
                    defaultStripeImageLoader.debug("Image loaded from memory cache");
                } else {
                    defaultStripeImageLoader.debug("Image not found on memory cache");
                }
                if (loadedImage != null) {
                    o0 o0Var = defaultStripeImageLoader.diskCache;
                    if (o0Var != null) {
                        o0Var.put(str, loadedImage);
                    }
                    Result.Companion companion = Result.Companion;
                    result = new Result(loadedImage.bitmap);
                } else {
                    result = null;
                }
                if (result != null) {
                    m4076access$loadFromNetworkBWLJW6A = result.value;
                } else {
                    DefaultStripeImageLoader defaultStripeImageLoader2 = this.this$0;
                    String str2 = this.$url;
                    o0 o0Var2 = defaultStripeImageLoader2.diskCache;
                    if (o0Var2 != null) {
                        str2.getClass();
                        String valueOf = String.valueOf(str2.hashCode());
                        try {
                            DiskLruCache diskLruCache = (DiskLruCache) ((Lazy) o0Var2.a).getValue();
                            snapshot2 = diskLruCache != null ? diskLruCache.get(valueOf) : null;
                        } catch (IOException e) {
                            e = e;
                            snapshot = null;
                        } catch (Throwable th) {
                            th = th;
                        }
                        if (snapshot2 != null) {
                            try {
                                InputStream inputStream = snapshot2.ins[0];
                                inputStream.getClass();
                                String string2 = snapshot2.getString();
                                Bitmap decodeStream = BitmapFactory.decodeStream(new BufferedInputStream(inputStream, PKIFailureInfo.certRevoked));
                                string2.getClass();
                                decodeStream.getClass();
                                loadedImage2 = new LoadedImage(string2, decodeStream);
                                snapshot2.close();
                            } catch (IOException e2) {
                                snapshot = snapshot2;
                                e = e2;
                                try {
                                    Log.e("stripe_image_disk_cache", "error getting bitmap from cache", e);
                                    if (snapshot != null) {
                                        snapshot.close();
                                    }
                                    loadedImage2 = null;
                                    if (loadedImage2 != null) {
                                    }
                                    if (loadedImage2 != null) {
                                    }
                                    if (result2 != null) {
                                    }
                                    return new Result(m4076access$loadFromNetworkBWLJW6A);
                                } catch (Throwable th2) {
                                    th = th2;
                                    snapshot3 = snapshot;
                                    if (snapshot3 != null) {
                                        snapshot3.close();
                                    }
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                snapshot3 = snapshot2;
                                if (snapshot3 != null) {
                                }
                                throw th;
                            }
                            if (loadedImage2 != null) {
                                defaultStripeImageLoader2.debug("Image loaded from disk cache");
                            } else {
                                defaultStripeImageLoader2.debug("Image not found on disk cache");
                            }
                            if (loadedImage2 != null) {
                                Payload payload2 = defaultStripeImageLoader2.memoryCache;
                                if (payload2 != null) {
                                    payload2.put(str2, loadedImage2);
                                }
                                Result.Companion companion2 = Result.Companion;
                                result2 = new Result(loadedImage2.bitmap);
                            }
                            if (result2 != null) {
                                m4076access$loadFromNetworkBWLJW6A = result2.value;
                            } else {
                                DefaultStripeImageLoader defaultStripeImageLoader3 = this.this$0;
                                String str3 = this.$url;
                                int i2 = this.$width;
                                int i3 = this.$height;
                                this.label = 1;
                                m4076access$loadFromNetworkBWLJW6A = DefaultStripeImageLoader.m4076access$loadFromNetworkBWLJW6A(defaultStripeImageLoader3, str3, i2, i3, this);
                                if (m4076access$loadFromNetworkBWLJW6A == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                        }
                    }
                    loadedImage2 = null;
                    if (loadedImage2 != null) {
                    }
                    if (loadedImage2 != null) {
                    }
                    if (result2 != null) {
                    }
                }
            } else {
                if (i != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                m4076access$loadFromNetworkBWLJW6A = ((Result) obj).value;
            }
            return new Result(m4076access$loadFromNetworkBWLJW6A);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultStripeImageLoader$load$2(DeferredUseCaseCameraRequestControl deferredUseCaseCameraRequestControl, Continuation continuation, ArrayList arrayList, int i, int i2, int i3) {
        super(2, continuation);
        this.this$0 = deferredUseCaseCameraRequestControl;
        this.$url = arrayList;
        this.label = i;
        this.$width = i2;
        this.$height = i3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$url;
        switch (i) {
            case 0:
                return new DefaultStripeImageLoader$load$2((DefaultStripeImageLoader) this.this$0, (String) obj2, this.$width, this.$height, continuation);
            case 1:
                return new DefaultStripeImageLoader$load$2((DeferredUseCaseCameraRequestControl) this.this$0, continuation, (ArrayList) obj2, this.label, this.$width, this.$height);
            case 2:
                DefaultStripeImageLoader$load$2 defaultStripeImageLoader$load$2 = new DefaultStripeImageLoader$load$2((LazyListState) obj2, this.$width, this.$height, continuation);
                defaultStripeImageLoader$load$2.this$0 = obj;
                return defaultStripeImageLoader$load$2;
            default:
                return new DefaultStripeImageLoader$load$2((RealInitialScreenLoader) this.this$0, (Function2) obj2, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return ((DefaultStripeImageLoader$load$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 1:
                return ((DefaultStripeImageLoader$load$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 2:
                return ((DefaultStripeImageLoader$load$2) create((ScrollScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            default:
                return ((DefaultStripeImageLoader$load$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x009e, code lost:
    
        if (r0 != r7) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009c  */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v8, types: [int] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        int i2;
        int i3;
        ?? r1;
        Object withContext;
        int i4 = this.$r8$classId;
        Object obj2 = this.$url;
        int i5 = 1;
        Continuation continuation = null;
        switch (i4) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                if (i6 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    DefaultStripeImageLoader defaultStripeImageLoader = (DefaultStripeImageLoader) this.this$0;
                    String str = (String) obj2;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(defaultStripeImageLoader, str, this.$width, this.$height, null);
                    this.label = 1;
                    Object access$withMutexByUrlLock = DefaultStripeImageLoader.access$withMutexByUrlLock(defaultStripeImageLoader, str, anonymousClass1, this);
                    if (access$withMutexByUrlLock != coroutineSingletons) {
                        break;
                    }
                } else if (i6 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    break;
                }
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                break;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.label;
                if (i7 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    LazyListState lazyListState = (LazyListState) obj2;
                    PagerScrollScopeKt$LazyLayoutScrollScope$1 pagerScrollScopeKt$LazyLayoutScrollScope$1 = new PagerScrollScopeKt$LazyLayoutScrollScope$1((ScrollScope) this.this$0, lazyListState, i5);
                    int i8 = this.$width;
                    int i9 = this.$height;
                    Density density = ((LazyListMeasureResult) lazyListState.layoutInfoState.getValue()).density;
                    this.label = 1;
                    if (LazyLayoutKt.animateScrollToItem(pagerScrollScopeKt$LazyLayoutScrollScope$1, i8, i9, 100, density, this) == coroutineSingletons3) {
                        break;
                    }
                } else if (i7 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                RealInitialScreenLoader realInitialScreenLoader = (RealInitialScreenLoader) this.this$0;
                StorageLink storageLink = realInitialScreenLoader.storageLink;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.$height;
                int i11 = 0;
                if (i10 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    boolean z = storageLink instanceof StorageLink.Sandboxed;
                    i = (PlatformKt.activeAccountTokenOrNull(realInitialScreenLoader.sessionManager) == null || (z && realInitialScreenLoader.storageLinker.getLinkedAccountToken(storageLink) == null)) ? 1 : 0;
                    if (i == 0) {
                        if (z) {
                            realInitialScreenLoader.deferredDeepLinkEmitter.defer(null);
                            r1 = z;
                            this.label = r1;
                            this.$width = i;
                            this.$height = 3;
                            withContext = JobKt.withContext(realInitialScreenLoader.ioDispatcher, new RealInitialScreenLoader$resetSandbox$2(realInitialScreenLoader, continuation, i11), this);
                            if (withContext != coroutineSingletons4) {
                                withContext = Unit.INSTANCE;
                                break;
                            }
                        } else {
                            RealOnSessionChangeActionsExecutor realOnSessionChangeActionsExecutor = (RealOnSessionChangeActionsExecutor) realInitialScreenLoader.onSessionChangeActionsExecutorProvider.invoke();
                            SessionManager.DeletionMode deletionMode = SessionManager.DeletionMode.ALL;
                            this.label = z ? 1 : 0;
                            this.$width = i;
                            this.$height = 2;
                            if (realOnSessionChangeActionsExecutor.executeSignOut(deletionMode, this) != coroutineSingletons4) {
                                i2 = z ? 1 : 0;
                                i3 = i;
                            }
                        }
                    } else {
                        this.label = z ? 1 : 0;
                        this.$width = i;
                        this.$height = 1;
                        Object m3568clearDataAndInitiateSessionzO7DZzo = realInitialScreenLoader.m3568clearDataAndInitiateSessionzO7DZzo((Function2) obj2, false, this);
                        if (m3568clearDataAndInitiateSessionzO7DZzo != coroutineSingletons4) {
                        }
                    }
                    break;
                } else if (i10 == 1) {
                    SafeTrace.throwOnFailure(obj);
                    break;
                } else if (i10 == 2) {
                    i3 = this.$width;
                    i2 = this.label;
                    SafeTrace.throwOnFailure(obj);
                } else if (i10 != 3) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    break;
                }
                i = i3;
                r1 = i2;
                this.label = r1;
                this.$width = i;
                this.$height = 3;
                withContext = JobKt.withContext(realInitialScreenLoader.ioDispatcher, new RealInitialScreenLoader$resetSandbox$2(realInitialScreenLoader, continuation, i11), this);
                if (withContext != coroutineSingletons4) {
                }
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultStripeImageLoader$load$2(LazyListState lazyListState, int i, int i2, Continuation continuation) {
        super(2, continuation);
        this.$url = lazyListState;
        this.$width = i;
        this.$height = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultStripeImageLoader$load$2(RealInitialScreenLoader realInitialScreenLoader, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = realInitialScreenLoader;
        this.$url = function2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultStripeImageLoader$load$2(DefaultStripeImageLoader defaultStripeImageLoader, String str, int i, int i2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = defaultStripeImageLoader;
        this.$url = str;
        this.$width = i;
        this.$height = i2;
    }
}
