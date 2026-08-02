package papa.internal;

import android.content.SharedPreferences;
import android.graphics.Rect;
import android.os.Handler;
import android.os.SystemClock;
import androidx.compose.animation.core.MutatorMutex$mutate$2;
import androidx.paging.CachedPagingDataKt$cachedIn$2;
import androidx.tracing.Trace;
import androidx.work.impl.WorkLauncherImpl;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.appsflyer.AFLogger$$ExternalSyntheticLambda0;
import com.google.crypto.tink.KeyTemplate;
import com.google.crypto.tink.KeysetHandle;
import com.google.crypto.tink.KeysetHandle$Builder$Entry;
import com.google.crypto.tink.KeysetHandle$Builder$KeyIdStrategy;
import com.google.crypto.tink.Parameters;
import com.google.crypto.tink.internal.LegacyProtoParameters;
import com.google.crypto.tink.internal.MutableKeyCreationRegistry;
import com.google.crypto.tink.internal.MutableSerializationRegistry;
import com.google.crypto.tink.internal.Random;
import com.google.crypto.tink.internal.TinkBugException;
import com.google.crypto.tink.internal.Util;
import com.google.crypto.tink.proto.KeyStatusType;
import com.google.crypto.tink.proto.Keyset;
import com.google.crypto.tink.subtle.Hex;
import com.squareup.contour.ContourLayout$geometry$1;
import com.squareup.encryption.DecryptingKeysetReader;
import com.squareup.util.coroutines.PendingUndispatchedLaunch$launch$1;
import com.squareup.util.coroutines.SetupTeardown;
import com.squareup.util.coroutines.StateFlowKt;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.Charsets;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.selects.SelectKt$DUMMY_PROCESS_RESULT_FUNCTION$1;
import okhttp3.internal.http2.Huffman;
import okio.Okio;
import okio.RealBufferedSink;
import okio.RealBufferedSource;
import okio.Sink;
import okio.Socket;
import okio.Source;
import papa.Handlers;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class LaunchTracker implements Socket {
    public final Object appLaunchedCallback;
    public Object lastAppBecameInvisibleRealtimeMillis;
    public Object launchInProgress;

    public final class Launch {
        public final LaunchedActivityStartingTransition activityStartingTransition;
        public final long endUptimeMillis;
        public final Long invisibleDurationRealtimeMillis;
        public final long startRealtimeMillis;
        public final long startUptimeMillis;
        public final boolean trampoline;

        public Launch(boolean z, long j, long j2, long j3, Long l, LaunchedActivityStartingTransition launchedActivityStartingTransition) {
            this.trampoline = z;
            this.startUptimeMillis = j;
            this.startRealtimeMillis = j2;
            this.endUptimeMillis = j3;
            this.invisibleDurationRealtimeMillis = l;
            this.activityStartingTransition = launchedActivityStartingTransition;
        }
    }

    public final class LaunchInProgress {
        public final String activityHash;
        public final Long invisibleDurationRealtimeMillis;
        public Long lastLifecycleChangeDoneUptimeMillis;
        public final long startRealtimeMillis;
        public final long startUptimeMillis;
        public final AFLogger$$ExternalSyntheticLambda0 updateLastLifecycleChangeUptimeMillis = new AFLogger$$ExternalSyntheticLambda0(this, 15);

        public LaunchInProgress(long j, long j2, Long l, String str) {
            this.startUptimeMillis = j;
            this.startRealtimeMillis = j2;
            this.invisibleDurationRealtimeMillis = l;
            this.activityHash = str;
        }
    }

    public LaunchTracker(String str, SharedPreferences sharedPreferences, KeyTemplate keyTemplate) {
        str.getClass();
        keyTemplate.getClass();
        this.appLaunchedCallback = keyTemplate;
        this.lastAppBecameInvisibleRealtimeMillis = new DecryptingKeysetReader(sharedPreferences, str, 0);
        this.launchInProgress = new DecryptingKeysetReader(sharedPreferences, str, 1);
    }

    public static void launch$default(LaunchTracker launchTracker, CachedPagingDataKt$cachedIn$2 cachedPagingDataKt$cachedIn$2, int i) {
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        Function3 function3 = cachedPagingDataKt$cachedIn$2;
        if ((i & 2) != 0) {
            function3 = new PendingUndispatchedLaunch$launch$1(3, null);
        }
        emptyCoroutineContext.getClass();
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        StateFlowKt.launchUndispatchedWithRethrow((CoroutineScope) launchTracker.launchInProgress, emptyCoroutineContext, new MutatorMutex$mutate$2(launchTracker, ref$ObjectRef, function3, null));
        Object obj = ref$ObjectRef.element;
        obj.getClass();
        ((List) obj).get(0);
    }

    public void appMightBecomeVisible(String str) {
        Long l;
        if (((LaunchInProgress) this.launchInProgress) == null) {
            if (!Perfs.isTracingLaunch) {
                SafeTrace.beginAsyncSection("App Launch", 0);
                Perfs.isTracingLaunch = true;
            }
            Long l2 = (Long) this.lastAppBecameInvisibleRealtimeMillis;
            if (l2 != null) {
                l = Long.valueOf(SystemClock.elapsedRealtime() - l2.longValue());
            } else {
                l = null;
            }
            this.launchInProgress = new LaunchInProgress(SystemClock.uptimeMillis(), SystemClock.elapsedRealtime(), l, str);
        }
    }

    /* renamed from: bottom-h0YXg9w, reason: not valid java name */
    public int m4372bottomh0YXg9w() {
        return ((Huffman.Node) this.lastAppBecameInvisibleRealtimeMillis).resolve() - padding().bottom;
    }

    @Override // okio.Socket
    public void cancel() {
        ((Socket) this.appLaunchedCallback).cancel();
    }

    /* renamed from: centerY-h0YXg9w, reason: not valid java name */
    public int m4373centerYh0YXg9w() {
        return ((Huffman.Node) this.lastAppBecameInvisibleRealtimeMillis).resolve() / 2;
    }

    @Override // okio.Socket
    public Sink getSink() {
        return (RealBufferedSink) this.launchInProgress;
    }

    @Override // okio.Socket
    public Source getSource() {
        return (RealBufferedSource) this.lastAppBecameInvisibleRealtimeMillis;
    }

    public Rect padding() {
        return (Rect) ((ContourLayout$geometry$1) this.launchInProgress).invoke();
    }

    public void pushLaunchInProgressDeadline() {
        LaunchInProgress launchInProgress = (LaunchInProgress) this.launchInProgress;
        if (launchInProgress != null) {
            Long l = launchInProgress.lastLifecycleChangeDoneUptimeMillis;
            if (l != null) {
                if (SystemClock.uptimeMillis() - l.longValue() > 500) {
                    if (Perfs.isTracingLaunch) {
                        SafeTrace.endAsyncSection("App Launch", 0);
                        Perfs.isTracingLaunch = false;
                    }
                    this.launchInProgress = null;
                    return;
                }
            }
            launchInProgress.lastLifecycleChangeDoneUptimeMillis = null;
            Handler mainThreadHandler = Handlers.getMainThreadHandler();
            AFLogger$$ExternalSyntheticLambda0 aFLogger$$ExternalSyntheticLambda0 = launchInProgress.updateLastLifecycleChangeUptimeMillis;
            mainThreadHandler.removeCallbacks(aFLogger$$ExternalSyntheticLambda0);
            Handlers.getMainThreadHandler().post(aFLogger$$ExternalSyntheticLambda0);
        }
    }

    /* renamed from: right-blrYgr0, reason: not valid java name */
    public int m4374rightblrYgr0() {
        return ((Huffman.Node) this.appLaunchedCallback).resolve() - padding().right;
    }

    public KeysetHandle rotateKey() {
        int i;
        Parameters parameters = ((KeyTemplate) this.appLaunchedCallback).parameters;
        if (parameters == null) {
            try {
                parameters = Trace.parse((parameters instanceof LegacyProtoParameters ? (com.google.crypto.tink.proto.KeyTemplate) ((LegacyProtoParameters) parameters).serialization.workTaskExecutor : (com.google.crypto.tink.proto.KeyTemplate) ((WorkLauncherImpl) MutableSerializationRegistry.GLOBAL_INSTANCE.serializeParameters(parameters)).workTaskExecutor).toByteArray());
            } catch (GeneralSecurityException e) {
                throw new TinkBugException("Parsing parameters failed in getProto(). You probably want to call some Tink register function for " + parameters, e);
            }
        }
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        KeysetHandle$Builder$Entry keysetHandle$Builder$Entry = new KeysetHandle$Builder$Entry(parameters);
        KeysetHandle$Builder$KeyIdStrategy keysetHandle$Builder$KeyIdStrategy = KeysetHandle$Builder$KeyIdStrategy.RANDOM_ID;
        keysetHandle$Builder$Entry.strategy = keysetHandle$Builder$KeyIdStrategy;
        keysetHandle$Builder$Entry.isPrimary = true;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((KeysetHandle$Builder$Entry) it.next()).isPrimary = false;
        }
        arrayList.add(keysetHandle$Builder$Entry);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i2 = 0; i2 < arrayList.size() - 1; i2++) {
            if (((KeysetHandle$Builder$Entry) arrayList.get(i2)).strategy == keysetHandle$Builder$KeyIdStrategy && ((KeysetHandle$Builder$Entry) arrayList.get(i2 + 1)).strategy != keysetHandle$Builder$KeyIdStrategy) {
                a$$ExternalSyntheticBUOutline0.m$6("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
                return null;
            }
        }
        HashSet hashSet = new HashSet();
        Iterator it2 = arrayList.iterator();
        Integer num = null;
        while (it2.hasNext()) {
            KeysetHandle$Builder$Entry keysetHandle$Builder$Entry2 = (KeysetHandle$Builder$Entry) it2.next();
            keysetHandle$Builder$Entry2.getClass();
            Parameters parameters2 = keysetHandle$Builder$Entry2.parameters;
            KeysetHandle$Builder$KeyIdStrategy keysetHandle$Builder$KeyIdStrategy2 = keysetHandle$Builder$Entry2.strategy;
            if (keysetHandle$Builder$KeyIdStrategy2 == null) {
                a$$ExternalSyntheticBUOutline0.m$6("No ID was set (with withFixedId or withRandomId)");
                return null;
            }
            if (keysetHandle$Builder$KeyIdStrategy2 == keysetHandle$Builder$KeyIdStrategy) {
                int i3 = 0;
                while (true) {
                    if (i3 != 0 && !hashSet.contains(Integer.valueOf(i3))) {
                        break;
                    }
                    Charset charset = Util.UTF_8;
                    i3 = 0;
                    while (i3 == 0) {
                        byte[] randBytes = Random.randBytes(4);
                        i3 = (randBytes[3] & 255) | ((randBytes[0] & 255) << 24) | ((randBytes[1] & 255) << 16) | ((randBytes[2] & 255) << 8);
                    }
                }
                i = i3;
            } else {
                i = 0;
            }
            if (hashSet.contains(Integer.valueOf(i))) {
                throw new GeneralSecurityException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Id ", " is used twice in the keyset"));
            }
            hashSet.add(Integer.valueOf(i));
            KeysetHandle.Entry entry = new KeysetHandle.Entry(MutableKeyCreationRegistry.globalInstance.createKey(parameters2, parameters2.hasIdRequirement() ? Integer.valueOf(i) : null), KeyStatusType.ENABLED, i, keysetHandle$Builder$Entry2.isPrimary, false);
            int i4 = i;
            if (keysetHandle$Builder$Entry2.isPrimary) {
                if (num != null) {
                    a$$ExternalSyntheticBUOutline0.m$6("Two primaries were set");
                    return null;
                }
                num = Integer.valueOf(i4);
            }
            arrayList2.add(entry);
        }
        if (num == null) {
            a$$ExternalSyntheticBUOutline0.m$6("No primary was set");
            return null;
        }
        KeysetHandle keysetHandle = new KeysetHandle(arrayList2, hashMap);
        keysetHandle.getAnnotationsOrNull();
        DecryptingKeysetReader decryptingKeysetReader = (DecryptingKeysetReader) this.launchInProgress;
        Keyset keyset = keysetHandle.getKeyset();
        decryptingKeysetReader.getClass();
        SharedPreferences.Editor edit = decryptingKeysetReader.sharedPreferences.edit();
        Cipher cipher = Cipher.getInstance("Blowfish");
        String str = decryptingKeysetReader.password;
        str.getClass();
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        bytes.getClass();
        cipher.init(1, new SecretKeySpec(bytes, "Blowfish"));
        edit.putString("device_key", Hex.encode(cipher.doFinal(keyset.toByteArray())));
        if (edit.commit()) {
            return keysetHandle;
        }
        a$$ExternalSyntheticBUOutline0.m$4("failed to write to shared preferences");
        return null;
    }

    public LaunchTracker(Perfs$$ExternalSyntheticLambda3 perfs$$ExternalSyntheticLambda3) {
        this.appLaunchedCallback = perfs$$ExternalSyntheticLambda3;
    }

    public /* synthetic */ LaunchTracker(Object obj, Object obj2, Object obj3) {
        this.appLaunchedCallback = obj;
        this.lastAppBecameInvisibleRealtimeMillis = obj2;
        this.launchInProgress = obj3;
    }

    public LaunchTracker(Socket socket) {
        this.appLaunchedCallback = socket;
        this.lastAppBecameInvisibleRealtimeMillis = Okio.buffer(socket.getSource());
        this.launchInProgress = Okio.buffer(socket.getSink());
    }

    public LaunchTracker(Function1 function1, SetupTeardown setupTeardown, CoroutineScope coroutineScope) {
        coroutineScope.getClass();
        this.appLaunchedCallback = function1;
        this.lastAppBecameInvisibleRealtimeMillis = setupTeardown;
        this.launchInProgress = coroutineScope;
    }

    public LaunchTracker(JobSupport jobSupport, Function3 function3) {
        this.appLaunchedCallback = jobSupport;
        this.lastAppBecameInvisibleRealtimeMillis = function3;
        this.launchInProgress = SelectKt$DUMMY_PROCESS_RESULT_FUNCTION$1.INSTANCE;
    }
}
