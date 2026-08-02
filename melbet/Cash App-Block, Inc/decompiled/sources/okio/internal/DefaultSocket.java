package okio.internal;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.squareup.cash.arcade.components.ToastKt$Toast$8$1;
import com.squareup.cash.featureflags.AmplitudeExperiments$ClientNyMfaUnauthorizedUx;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.initialscreenloader.backend.RealForcedLogoutNotifier$notify$1;
import com.squareup.cash.initialscreenloader.backend.RealForcedLogoutNotifier$shouldShowNotification$1;
import com.squareup.cash.music.presenters.MusicPresenter$models$3$1;
import com.squareup.cash.notifications.AndroidNotificationManager;
import com.squareup.cash.notifications.CashNotification;
import com.squareup.cash.notifications.channels.MiscNotificationChannelContributor;
import com.squareup.cash.notifications.channels.NotificationChannelId;
import com.squareup.cash.notifications.channels.RealNotificationChannelMigrationManager;
import com.squareup.cash.notifications.channels.RealNotificationChannelsInitializer$identifyChannelId$1;
import com.squareup.cash.notifications.channels.RealNotificationChannelsInitializer$initializeChannels$1;
import com.squareup.cash.offers.views.UtilsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.preferences.KeyValue;
import com.squareup.util.android.AndroidToaster;
import com.squareup.util.android.Toaster$Length;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.TimeoutCancellationException;
import okio.Buffer;
import okio.Path$$ExternalSyntheticBUOutline0;
import okio.Segment;
import okio.SegmentPool;
import okio.Sink;
import okio.Socket;
import okio.Source;
import okio.Timeout;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes3.dex */
public final class DefaultSocket implements Socket {
    public final /* synthetic */ int $r8$classId;
    public final Object closeBits;
    public final Object sink;
    public final Object socket;
    public final Object source;

    public final class SocketSink implements Sink {
        public final OutputStream outputStream;
        public final SocketAsyncTimeout timeout;

        public SocketSink() {
            java.net.Socket socket = (java.net.Socket) DefaultSocket.this.socket;
            this.outputStream = socket.getOutputStream();
            this.timeout = new SocketAsyncTimeout(socket);
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            int i;
            OutputStream outputStream = this.outputStream;
            DefaultSocket defaultSocket = DefaultSocket.this;
            SocketAsyncTimeout socketAsyncTimeout = this.timeout;
            socketAsyncTimeout.enter();
            try {
                AtomicInteger atomicInteger = (AtomicInteger) defaultSocket.closeBits;
                java.net.Socket socket = (java.net.Socket) defaultSocket.socket;
                atomicInteger.getClass();
                while (true) {
                    int i2 = atomicInteger.get();
                    if ((i2 & 1) != 0) {
                        i = 0;
                        break;
                    }
                    int i3 = i2 | 1;
                    if (atomicInteger.compareAndSet(i2, i3)) {
                        i = i3;
                        break;
                    }
                }
                if (i != 0) {
                    if (i != 3) {
                        if (!socket.isClosed() && !socket.isOutputShutdown()) {
                            outputStream.flush();
                            try {
                                socket.shutdownOutput();
                            } catch (UnsupportedOperationException unused) {
                                outputStream.close();
                            }
                        }
                        return;
                    }
                    socket.close();
                    if (socketAsyncTimeout.exit()) {
                        throw socketAsyncTimeout.newTimeoutException(null);
                    }
                }
            } catch (IOException e) {
                if (!socketAsyncTimeout.exit()) {
                    throw e;
                }
                throw socketAsyncTimeout.newTimeoutException(e);
            } finally {
                socketAsyncTimeout.exit();
            }
        }

        @Override // okio.Sink, java.io.Flushable
        public final void flush() {
            SocketAsyncTimeout socketAsyncTimeout = this.timeout;
            socketAsyncTimeout.enter();
            try {
                this.outputStream.flush();
                if (socketAsyncTimeout.exit()) {
                    throw socketAsyncTimeout.newTimeoutException(null);
                }
            } catch (IOException e) {
                if (!socketAsyncTimeout.exit()) {
                    throw e;
                }
                throw socketAsyncTimeout.newTimeoutException(e);
            } finally {
                socketAsyncTimeout.exit();
            }
        }

        @Override // okio.Sink
        public final Timeout timeout() {
            return this.timeout;
        }

        public final String toString() {
            return "sink(" + ((java.net.Socket) DefaultSocket.this.socket) + ')';
        }

        @Override // okio.Sink
        public final void write(Buffer buffer, long j) {
            buffer.getClass();
            DurationKt.checkOffsetAndCount(buffer.size, 0L, j);
            while (j > 0) {
                SocketAsyncTimeout socketAsyncTimeout = this.timeout;
                socketAsyncTimeout.throwIfReached();
                Segment segment = buffer.head;
                segment.getClass();
                int min = (int) Math.min(j, segment.limit - segment.pos);
                socketAsyncTimeout.enter();
                try {
                    try {
                        this.outputStream.write(segment.data, segment.pos, min);
                        if (socketAsyncTimeout.exit()) {
                            throw socketAsyncTimeout.newTimeoutException(null);
                        }
                        int i = segment.pos + min;
                        segment.pos = i;
                        long j2 = min;
                        j -= j2;
                        buffer.size -= j2;
                        if (i == segment.limit) {
                            buffer.head = segment.pop();
                            SegmentPool.recycle(segment);
                        }
                    } catch (IOException e) {
                        if (!socketAsyncTimeout.exit()) {
                            throw e;
                        }
                        throw socketAsyncTimeout.newTimeoutException(e);
                    }
                } catch (Throwable th) {
                    socketAsyncTimeout.exit();
                    throw th;
                }
            }
        }
    }

    public final class SocketSource implements Source {
        public final InputStream inputStream;
        public final SocketAsyncTimeout timeout;

        public SocketSource() {
            java.net.Socket socket = (java.net.Socket) DefaultSocket.this.socket;
            this.inputStream = socket.getInputStream();
            this.timeout = new SocketAsyncTimeout(socket);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            int i;
            DefaultSocket defaultSocket = DefaultSocket.this;
            SocketAsyncTimeout socketAsyncTimeout = this.timeout;
            socketAsyncTimeout.enter();
            try {
                AtomicInteger atomicInteger = (AtomicInteger) defaultSocket.closeBits;
                java.net.Socket socket = (java.net.Socket) defaultSocket.socket;
                atomicInteger.getClass();
                while (true) {
                    int i2 = atomicInteger.get();
                    if ((i2 & 2) != 0) {
                        i = 0;
                        break;
                    }
                    int i3 = i2 | 2;
                    if (atomicInteger.compareAndSet(i2, i3)) {
                        i = i3;
                        break;
                    }
                }
                if (i != 0) {
                    if (i == 3) {
                        socket.close();
                    } else {
                        if (socket.isClosed() || socket.isInputShutdown()) {
                            return;
                        }
                        try {
                            socket.shutdownInput();
                        } catch (UnsupportedOperationException unused) {
                            this.inputStream.close();
                        }
                    }
                    if (socketAsyncTimeout.exit()) {
                        throw socketAsyncTimeout.newTimeoutException(null);
                    }
                }
            } catch (IOException e) {
                if (!socketAsyncTimeout.exit()) {
                    throw e;
                }
                throw socketAsyncTimeout.newTimeoutException(e);
            } finally {
                socketAsyncTimeout.exit();
            }
        }

        @Override // okio.Source
        public final long read(Buffer buffer, long j) {
            buffer.getClass();
            if (j == 0) {
                return 0L;
            }
            if (j < 0) {
                Path$$ExternalSyntheticBUOutline0.m$1((Object) Recorder$$ExternalSyntheticOutline2.m(j, "byteCount < 0: "));
                return 0L;
            }
            SocketAsyncTimeout socketAsyncTimeout = this.timeout;
            socketAsyncTimeout.throwIfReached();
            Segment writableSegment$okio = buffer.writableSegment$okio(1);
            int min = (int) Math.min(j, 8192 - writableSegment$okio.limit);
            try {
                socketAsyncTimeout.enter();
                try {
                    int read = this.inputStream.read(writableSegment$okio.data, writableSegment$okio.limit, min);
                    if (socketAsyncTimeout.exit()) {
                        throw socketAsyncTimeout.newTimeoutException(null);
                    }
                    if (read != -1) {
                        writableSegment$okio.limit += read;
                        long j2 = read;
                        buffer.size += j2;
                        return j2;
                    }
                    if (writableSegment$okio.pos != writableSegment$okio.limit) {
                        return -1L;
                    }
                    buffer.head = writableSegment$okio.pop();
                    SegmentPool.recycle(writableSegment$okio);
                    return -1L;
                } catch (IOException e) {
                    if (socketAsyncTimeout.exit()) {
                        throw socketAsyncTimeout.newTimeoutException(e);
                    }
                    throw e;
                } finally {
                    socketAsyncTimeout.exit();
                }
            } catch (AssertionError e2) {
                if (_JavaIoKt.isAndroidGetsocknameError(e2)) {
                    throw new IOException(e2);
                }
                throw e2;
            }
        }

        @Override // okio.Source
        public final Timeout timeout() {
            return this.timeout;
        }

        public final String toString() {
            return "source(" + ((java.net.Socket) DefaultSocket.this.socket) + ')';
        }
    }

    public DefaultSocket() {
        this.$r8$classId = 8;
        this.socket = new CopyOnWriteArrayList();
        this.closeBits = new CopyOnWriteArrayList();
        this.source = new CopyOnWriteArrayList();
        this.sink = new CopyOnWriteArrayList();
    }

    @Override // okio.Socket
    public void cancel() {
        ((java.net.Socket) this.socket).close();
    }

    @Override // okio.Socket
    public Sink getSink() {
        return (SocketSink) this.sink;
    }

    @Override // okio.Socket
    public Source getSource() {
        return (SocketSource) this.source;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a2, code lost:
    
        r5.add((com.squareup.cash.notifications.channels.NotificationChannelId) r9);
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00fd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Enum identifyChannelId(CashNotification cashNotification, ContinuationImpl continuationImpl) {
        RealNotificationChannelsInitializer$identifyChannelId$1 realNotificationChannelsInitializer$identifyChannelId$1;
        int i;
        Object obj;
        NotificationChannelId notificationChannelId;
        UtilsKt$$ExternalSyntheticLambda0 utilsKt$$ExternalSyntheticLambda0;
        Object obj2;
        boolean equals;
        if (continuationImpl instanceof RealNotificationChannelsInitializer$identifyChannelId$1) {
            realNotificationChannelsInitializer$identifyChannelId$1 = (RealNotificationChannelsInitializer$identifyChannelId$1) continuationImpl;
            int i2 = realNotificationChannelsInitializer$identifyChannelId$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realNotificationChannelsInitializer$identifyChannelId$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj3 = realNotificationChannelsInitializer$identifyChannelId$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realNotificationChannelsInitializer$identifyChannelId$1.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj3);
                    RealNotificationChannelMigrationManager realNotificationChannelMigrationManager = (RealNotificationChannelMigrationManager) this.closeBits;
                    cashNotification.getClass();
                    List<MiscNotificationChannelContributor> list = realNotificationChannelMigrationManager.contributors;
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                    for (MiscNotificationChannelContributor miscNotificationChannelContributor : list) {
                        RealNotificationChannelMigrationManager.PushCategoryType pushCategoryType = realNotificationChannelMigrationManager.pushCategoryType;
                        miscNotificationChannelContributor.getClass();
                        pushCategoryType.getClass();
                        Iterator it = NotificationChannelId.getEntries().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it.next();
                            NotificationChannelId notificationChannelId2 = (NotificationChannelId) obj2;
                            int ordinal = pushCategoryType.ordinal();
                            if (ordinal == 0) {
                                equals = notificationChannelId2.getId().equals(cashNotification.getCategory());
                            } else {
                                if (ordinal != 1) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                                equals = notificationChannelId2.getId().equals(cashNotification.getNotificationCategory());
                            }
                            if (equals) {
                                break;
                            }
                        }
                    }
                    Iterator it2 = arrayList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it2.next();
                        if (((NotificationChannelId) obj) != null) {
                            break;
                        }
                    }
                    NotificationChannelId notificationChannelId3 = (NotificationChannelId) obj;
                    notificationChannelId = notificationChannelId3 == null ? NotificationChannelId.GeneralAndPromotions : notificationChannelId3;
                    UtilsKt$$ExternalSyntheticLambda0 utilsKt$$ExternalSyntheticLambda02 = new UtilsKt$$ExternalSyntheticLambda0(20, this, notificationChannelId);
                    if (!((Boolean) utilsKt$$ExternalSyntheticLambda02.invoke()).booleanValue()) {
                        JobKt.launch$default((CoroutineScope) this.sink, null, null, new MusicPresenter$models$3$1(this, continuation, 6), 3);
                        return notificationChannelId;
                    }
                    Duration.Companion companion = Duration.Companion;
                    long duration = DurationKt.toDuration(10, DurationUnit.SECONDS);
                    realNotificationChannelsInitializer$identifyChannelId$1.L$1 = notificationChannelId;
                    realNotificationChannelsInitializer$identifyChannelId$1.L$2 = utilsKt$$ExternalSyntheticLambda02;
                    realNotificationChannelsInitializer$identifyChannelId$1.label = 1;
                    if (m4350initializeChannelsVtjQ1oo(duration, realNotificationChannelsInitializer$identifyChannelId$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    utilsKt$$ExternalSyntheticLambda0 = utilsKt$$ExternalSyntheticLambda02;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    utilsKt$$ExternalSyntheticLambda0 = realNotificationChannelsInitializer$identifyChannelId$1.L$2;
                    notificationChannelId = realNotificationChannelsInitializer$identifyChannelId$1.L$1;
                    SafeTrace.throwOnFailure(obj3);
                }
                return !((Boolean) utilsKt$$ExternalSyntheticLambda0.invoke()).booleanValue() ? NotificationChannelId.GeneralAndPromotions : notificationChannelId;
            }
        }
        realNotificationChannelsInitializer$identifyChannelId$1 = new RealNotificationChannelsInitializer$identifyChannelId$1(this, continuationImpl);
        Object obj32 = realNotificationChannelsInitializer$identifyChannelId$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realNotificationChannelsInitializer$identifyChannelId$1.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        if (!((Boolean) utilsKt$$ExternalSyntheticLambda0.invoke()).booleanValue()) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:17|(1:18)|19|20|21|22|(1:24)(5:26|13|14|15|(2:33|34)(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a2, code lost:
    
        r5 = r6;
        r7 = r15;
        r8 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a9, code lost:
    
        timber.log.Timber.Forest.e(new java.lang.IllegalStateException("Timed out waiting for " + r8));
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x009c -> B:13:0x009f). Please report as a decompilation issue!!! */
    /* renamed from: initializeChannels-VtjQ1oo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m4350initializeChannelsVtjQ1oo(long j, ContinuationImpl continuationImpl) {
        RealNotificationChannelsInitializer$initializeChannels$1 realNotificationChannelsInitializer$initializeChannels$1;
        int i;
        Collection arrayList;
        Iterator it;
        long j2;
        int i2;
        int i3;
        DefaultSocket defaultSocket;
        RealNotificationChannelMigrationManager realNotificationChannelMigrationManager = (RealNotificationChannelMigrationManager) this.closeBits;
        if (continuationImpl instanceof RealNotificationChannelsInitializer$initializeChannels$1) {
            realNotificationChannelsInitializer$initializeChannels$1 = (RealNotificationChannelsInitializer$initializeChannels$1) continuationImpl;
            int i4 = realNotificationChannelsInitializer$initializeChannels$1.label;
            if ((i4 & PKIFailureInfo.systemUnavail) != 0) {
                realNotificationChannelsInitializer$initializeChannels$1.label = i4 - PKIFailureInfo.systemUnavail;
                Object obj = realNotificationChannelsInitializer$initializeChannels$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realNotificationChannelsInitializer$initializeChannels$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    realNotificationChannelMigrationManager.removeUnusedChannels();
                    List list = realNotificationChannelMigrationManager.contributors;
                    arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                    it = list.iterator();
                    j2 = j;
                    i2 = 0;
                    i3 = 0;
                    if (!it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = realNotificationChannelsInitializer$initializeChannels$1.I$1;
                    i3 = realNotificationChannelsInitializer$initializeChannels$1.I$0;
                    long j3 = realNotificationChannelsInitializer$initializeChannels$1.J$0;
                    arrayList = realNotificationChannelsInitializer$initializeChannels$1.L$6;
                    MiscNotificationChannelContributor miscNotificationChannelContributor = realNotificationChannelsInitializer$initializeChannels$1.L$5;
                    Iterator it2 = realNotificationChannelsInitializer$initializeChannels$1.L$3;
                    Collection collection = realNotificationChannelsInitializer$initializeChannels$1.L$2;
                    try {
                        SafeTrace.throwOnFailure(obj);
                        defaultSocket = this;
                    } catch (TimeoutCancellationException unused) {
                        defaultSocket = this;
                        Timber.Forest.e(new IllegalStateException("Timed out waiting for " + miscNotificationChannelContributor));
                    }
                    it = it2;
                    j2 = j3;
                    arrayList.add(Unit.INSTANCE);
                    arrayList = collection;
                    this = defaultSocket;
                    if (!it.hasNext()) {
                        MiscNotificationChannelContributor miscNotificationChannelContributor2 = (MiscNotificationChannelContributor) it.next();
                        try {
                        } catch (TimeoutCancellationException unused2) {
                            defaultSocket = this;
                        }
                        CoroutineContext coroutineContext = (CoroutineContext) this.source;
                        defaultSocket = this;
                        ToastKt$Toast$8$1 toastKt$Toast$8$1 = new ToastKt$Toast$8$1(j2, miscNotificationChannelContributor2, defaultSocket, (Continuation) null, 9);
                        realNotificationChannelsInitializer$initializeChannels$1.L$2 = arrayList;
                        realNotificationChannelsInitializer$initializeChannels$1.L$3 = it;
                        realNotificationChannelsInitializer$initializeChannels$1.L$5 = miscNotificationChannelContributor2;
                        realNotificationChannelsInitializer$initializeChannels$1.L$6 = arrayList;
                        realNotificationChannelsInitializer$initializeChannels$1.J$0 = j2;
                        realNotificationChannelsInitializer$initializeChannels$1.I$0 = i3;
                        realNotificationChannelsInitializer$initializeChannels$1.I$1 = i2;
                        realNotificationChannelsInitializer$initializeChannels$1.label = 1;
                        if (JobKt.withContext(coroutineContext, toastKt$Toast$8$1, realNotificationChannelsInitializer$initializeChannels$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        collection = arrayList;
                        j3 = j2;
                        it2 = it;
                        it = it2;
                        j2 = j3;
                        arrayList.add(Unit.INSTANCE);
                        arrayList = collection;
                        this = defaultSocket;
                        if (!it.hasNext()) {
                            return Unit.INSTANCE;
                        }
                    }
                }
            }
        }
        realNotificationChannelsInitializer$initializeChannels$1 = new RealNotificationChannelsInitializer$initializeChannels$1(this, continuationImpl);
        Object obj2 = realNotificationChannelsInitializer$initializeChannels$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realNotificationChannelsInitializer$initializeChannels$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
    
        if (r6 == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003e, code lost:
    
        if (r6 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object notify(ContinuationImpl continuationImpl) {
        RealForcedLogoutNotifier$notify$1 realForcedLogoutNotifier$notify$1;
        Object obj;
        int i;
        if (continuationImpl instanceof RealForcedLogoutNotifier$notify$1) {
            realForcedLogoutNotifier$notify$1 = (RealForcedLogoutNotifier$notify$1) continuationImpl;
            int i2 = realForcedLogoutNotifier$notify$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realForcedLogoutNotifier$notify$1.label = i2 - PKIFailureInfo.systemUnavail;
                obj = realForcedLogoutNotifier$notify$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realForcedLogoutNotifier$notify$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    realForcedLogoutNotifier$notify$1.label = 1;
                    obj = shouldShowNotification(realForcedLogoutNotifier$notify$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        ((AndroidToaster) this.closeBits).makeToast(((AndroidStringManager) this.source).get(R.string.session_expired_toast), Toaster$Length.SHORT);
                        return Unit.INSTANCE;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    realForcedLogoutNotifier$notify$1.label = 2;
                    Object obj3 = ((KeyValue) this.sink).set(Boolean.FALSE, realForcedLogoutNotifier$notify$1);
                    if (obj3 != obj2) {
                        obj3 = Unit.INSTANCE;
                    }
                }
                return Unit.INSTANCE;
            }
        }
        realForcedLogoutNotifier$notify$1 = new RealForcedLogoutNotifier$notify$1(this, continuationImpl);
        obj = realForcedLogoutNotifier$notify$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realForcedLogoutNotifier$notify$1.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object shouldShowNotification(ContinuationImpl continuationImpl) {
        RealForcedLogoutNotifier$shouldShowNotification$1 realForcedLogoutNotifier$shouldShowNotification$1;
        int i;
        boolean z;
        if (continuationImpl instanceof RealForcedLogoutNotifier$shouldShowNotification$1) {
            realForcedLogoutNotifier$shouldShowNotification$1 = (RealForcedLogoutNotifier$shouldShowNotification$1) continuationImpl;
            int i2 = realForcedLogoutNotifier$shouldShowNotification$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realForcedLogoutNotifier$shouldShowNotification$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realForcedLogoutNotifier$shouldShowNotification$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realForcedLogoutNotifier$shouldShowNotification$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    boolean enabled = ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) ((FeatureFlagManager) this.socket)).currentValue(AmplitudeExperiments$ClientNyMfaUnauthorizedUx.INSTANCE)).enabled();
                    KeyValue keyValue = (KeyValue) this.sink;
                    realForcedLogoutNotifier$shouldShowNotification$1.Z$0 = enabled;
                    realForcedLogoutNotifier$shouldShowNotification$1.label = 1;
                    Object obj2 = keyValue.get(realForcedLogoutNotifier$shouldShowNotification$1);
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = obj2;
                    z = enabled;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = realForcedLogoutNotifier$shouldShowNotification$1.Z$0;
                    SafeTrace.throwOnFailure(obj);
                }
                return Boolean.valueOf(!((Boolean) obj).booleanValue() && z);
            }
        }
        realForcedLogoutNotifier$shouldShowNotification$1 = new RealForcedLogoutNotifier$shouldShowNotification$1(this, continuationImpl);
        Object obj3 = realForcedLogoutNotifier$shouldShowNotification$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realForcedLogoutNotifier$shouldShowNotification$1.label;
        if (i != 0) {
        }
        return Boolean.valueOf(!((Boolean) obj3).booleanValue() && z);
    }

    public String toString() {
        switch (this.$r8$classId) {
            case 0:
                String socket = ((java.net.Socket) this.socket).toString();
                socket.getClass();
                return socket;
            default:
                return super.toString();
        }
    }

    public /* synthetic */ DefaultSocket(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$r8$classId = i;
        this.socket = obj;
        this.closeBits = obj2;
        this.source = obj3;
        this.sink = obj4;
    }

    public DefaultSocket(AndroidNotificationManager androidNotificationManager, RealNotificationChannelMigrationManager realNotificationChannelMigrationManager, CoroutineContext coroutineContext, CoroutineScope coroutineScope) {
        this.$r8$classId = 4;
        androidNotificationManager.getClass();
        coroutineContext.getClass();
        this.socket = androidNotificationManager;
        this.closeBits = realNotificationChannelMigrationManager;
        this.source = coroutineContext;
        this.sink = coroutineScope;
    }

    public DefaultSocket(java.net.Socket socket) {
        this.$r8$classId = 0;
        this.socket = socket;
        this.closeBits = new AtomicInteger();
        this.source = new SocketSource();
        this.sink = new SocketSink();
    }
}
