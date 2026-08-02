package papa;

import android.view.Window;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import curtains.internal.WindowCallbackWrapper;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.lang.annotation.Annotation;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ClassBasedDeclarationContainer;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ConflatedBufferedChannel;
import okhttp3.CacheControl;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal._UtilCommonKt;
import okio.internal.DefaultSocket;

/* loaded from: classes3.dex */
public abstract class PapaEvent {

    public final class AppLaunch extends PapaEvent {
        public final long durationUptimeMillis;
        public final Long invisibleDurationRealtimeMillis;
        public final PreLaunchState preLaunchState;
        public final long startUptimeMillis;
        public final boolean trampolined;

        public AppLaunch(PreLaunchState preLaunchState, long j, boolean z, Long l, long j2) {
            this.preLaunchState = preLaunchState;
            this.durationUptimeMillis = j;
            this.trampolined = z;
            this.invisibleDurationRealtimeMillis = l;
            this.startUptimeMillis = j2;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AppLaunch(preLaunchState=");
            PreLaunchState preLaunchState = this.preLaunchState;
            sb.append(preLaunchState);
            sb.append(", duration=");
            long j = this.durationUptimeMillis;
            sb.append(j);
            sb.append(" ms, isSlowLaunch=");
            sb.append(j >= preLaunchState.launchType.slowThresholdMillis);
            sb.append(", trampolined=");
            sb.append(this.trampolined);
            sb.append(", backgroundDuration=");
            sb.append(this.invisibleDurationRealtimeMillis);
            sb.append(" ms, startUptimeMillis=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.startUptimeMillis, ')');
        }
    }

    /* loaded from: classes9.dex */
    public final class FrozenFrameOnTouch extends PapaEvent {
        public final String activityName;
        public final long deliverDurationUptimeMillis;
        public final long dislayDurationUptimeMillis;
        public final String pressedView;
        public final int repeatTouchDownCount;

        public FrozenFrameOnTouch(String str, int i, long j, long j2, String str2) {
            this.activityName = str;
            this.repeatTouchDownCount = i;
            this.deliverDurationUptimeMillis = j;
            this.dislayDurationUptimeMillis = j2;
            this.pressedView = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FrozenFrameOnTouch)) {
                return false;
            }
            FrozenFrameOnTouch frozenFrameOnTouch = (FrozenFrameOnTouch) obj;
            return this.activityName.equals(frozenFrameOnTouch.activityName) && this.repeatTouchDownCount == frozenFrameOnTouch.repeatTouchDownCount && this.deliverDurationUptimeMillis == frozenFrameOnTouch.deliverDurationUptimeMillis && this.dislayDurationUptimeMillis == frozenFrameOnTouch.dislayDurationUptimeMillis && Intrinsics.areEqual(this.pressedView, frozenFrameOnTouch.pressedView);
        }

        public final long getDeliverDurationUptimeMillis() {
            return this.deliverDurationUptimeMillis;
        }

        public final int getRepeatTouchDownCount() {
            return this.repeatTouchDownCount;
        }

        public final int hashCode() {
            int m = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.repeatTouchDownCount, this.activityName.hashCode() * 31, 31), 31, this.deliverDurationUptimeMillis), 31, this.dislayDurationUptimeMillis);
            String str = this.pressedView;
            return m + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FrozenFrameOnTouch(activityName='");
            sb.append(this.activityName);
            sb.append("', repeatTouchDownCount=");
            sb.append(this.repeatTouchDownCount);
            sb.append(", handledElapsed=");
            sb.append(this.deliverDurationUptimeMillis);
            sb.append(" ms, frameElapsed=");
            sb.append(this.dislayDurationUptimeMillis);
            sb.append(" ms, pressedView='");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.pressedView, "')");
        }
    }

    public static BufferedChannel Channel$default(int i, BufferOverflow bufferOverflow, Function1 function1, int i2) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        if ((i2 & 4) != 0) {
            function1 = null;
        }
        if (i == -2) {
            if (bufferOverflow != BufferOverflow.SUSPEND) {
                return new ConflatedBufferedChannel(1, bufferOverflow, function1);
            }
            Channel.Factory.getClass();
            return new BufferedChannel(Channel.Factory.CHANNEL_DEFAULT_CAPACITY, function1);
        }
        if (i != -1) {
            return i != 0 ? i != Integer.MAX_VALUE ? bufferOverflow == BufferOverflow.SUSPEND ? new BufferedChannel(i, function1) : new ConflatedBufferedChannel(i, bufferOverflow, function1) : new BufferedChannel(Integer.MAX_VALUE, function1) : bufferOverflow == BufferOverflow.SUSPEND ? new BufferedChannel(0, function1) : new ConflatedBufferedChannel(1, bufferOverflow, function1);
        }
        if (bufferOverflow == BufferOverflow.SUSPEND) {
            return new ConflatedBufferedChannel(1, BufferOverflow.DROP_OLDEST, function1);
        }
        a$$ExternalSyntheticBUOutline0.m$3("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        return null;
    }

    public static final KClass getAnnotationClass(Annotation annotation) {
        annotation.getClass();
        Class<? extends Annotation> annotationType = annotation.annotationType();
        annotationType.getClass();
        return Reflection.factory.getOrCreateKotlinClass(annotationType);
    }

    public static final Class getJavaClass(KClass kClass) {
        kClass.getClass();
        Class jClass = ((ClassBasedDeclarationContainer) kClass).getJClass();
        jClass.getClass();
        return jClass;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Class getJavaObjectType(KClass kClass) {
        kClass.getClass();
        Class jClass = ((ClassBasedDeclarationContainer) kClass).getJClass();
        if (!jClass.isPrimitive()) {
            return jClass;
        }
        String name = jClass.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (!name.equals("double")) {
                }
                break;
            case 104431:
                if (!name.equals("int")) {
                }
                break;
            case 3039496:
                if (!name.equals("byte")) {
                }
                break;
            case 3052374:
                if (!name.equals("char")) {
                }
                break;
            case 3327612:
                if (!name.equals("long")) {
                }
                break;
            case 3625364:
                if (!name.equals("void")) {
                }
                break;
            case 64711720:
                if (!name.equals(InquiryField.BooleanField.TYPE)) {
                }
                break;
            case 97526364:
                if (!name.equals(InquiryField.FloatField.TYPE)) {
                }
                break;
            case 109413500:
                if (!name.equals("short")) {
                }
                break;
        }
        return jClass;
    }

    public static final Class getJavaPrimitiveType(KClass kClass) {
        kClass.getClass();
        Class jClass = ((ClassBasedDeclarationContainer) kClass).getJClass();
        if (jClass.isPrimitive()) {
            return jClass;
        }
        String name = jClass.getName();
        switch (name.hashCode()) {
            case -2056817302:
                if (name.equals("java.lang.Integer")) {
                    return Integer.TYPE;
                }
                return null;
            case -527879800:
                if (name.equals("java.lang.Float")) {
                    return Float.TYPE;
                }
                return null;
            case -515992664:
                if (name.equals("java.lang.Short")) {
                    return Short.TYPE;
                }
                return null;
            case 155276373:
                if (name.equals("java.lang.Character")) {
                    return Character.TYPE;
                }
                return null;
            case 344809556:
                if (name.equals("java.lang.Boolean")) {
                    return Boolean.TYPE;
                }
                return null;
            case 398507100:
                if (name.equals("java.lang.Byte")) {
                    return Byte.TYPE;
                }
                return null;
            case 398795216:
                if (name.equals("java.lang.Long")) {
                    return Long.TYPE;
                }
                return null;
            case 399092968:
                if (name.equals("java.lang.Void")) {
                    return Void.TYPE;
                }
                return null;
            case 761287205:
                if (name.equals("java.lang.Double")) {
                    return Double.TYPE;
                }
                return null;
            default:
                return null;
        }
    }

    public static final KClass getKotlinClass(Class cls) {
        cls.getClass();
        return Reflection.factory.getOrCreateKotlinClass(cls);
    }

    public static DefaultSocket getListeners(Window window) {
        DefaultSocket defaultSocket;
        window.getClass();
        synchronized (WindowCallbackWrapper.listenersLock) {
            try {
                WeakHashMap weakHashMap = WindowCallbackWrapper.callbackCache;
                WeakReference weakReference = (WeakReference) weakHashMap.get(window);
                WindowCallbackWrapper windowCallbackWrapper = weakReference != null ? (WindowCallbackWrapper) weakReference.get() : null;
                if (windowCallbackWrapper != null) {
                    return windowCallbackWrapper.listeners$1;
                }
                Window.Callback callback = window.getCallback();
                if (callback == null) {
                    defaultSocket = new DefaultSocket();
                } else {
                    WindowCallbackWrapper windowCallbackWrapper2 = new WindowCallbackWrapper(callback);
                    window.setCallback(windowCallbackWrapper2);
                    weakHashMap.put(window, new WeakReference(windowCallbackWrapper2));
                    defaultSocket = windowCallbackWrapper2.listeners$1;
                }
                return defaultSocket;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean isCacheable(Request request, Response response) {
        int i = response.code;
        if (i != 200 && i != 410 && i != 414 && i != 501 && i != 203 && i != 204) {
            if (i != 307) {
                if (i != 308 && i != 404 && i != 405) {
                    switch (i) {
                        case SDK_ASSET_TRANSFER_ICON_CIRCLE_VALUE:
                        case SDK_ASSET_CASH_ICON_CIRCLE_VALUE:
                            break;
                        case SDK_ASSET_ANIMATION_MOBILE_AUTH_LOADING_VALUE:
                            break;
                        default:
                            return false;
                    }
                }
            }
            String str = response.headers.get("Expires");
            if (str == null) {
                str = null;
            }
            if (str == null && response.cacheControl().maxAgeSeconds == -1 && !response.cacheControl().isPublic && !response.cacheControl().isPrivate) {
                return false;
            }
        }
        if (response.cacheControl().noStore) {
            return false;
        }
        CacheControl cacheControl = request.lazyCacheControl;
        if (cacheControl == null) {
            int i2 = CacheControl.$r8$clinit;
            cacheControl = parse(request.headers);
            request.lazyCacheControl = cacheControl;
        }
        return !cacheControl.noStore;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static CacheControl parse(Headers headers) {
        int i;
        int i2;
        int length;
        String str;
        Headers headers2 = headers;
        headers2.getClass();
        int size = headers2.size();
        int i3 = 0;
        boolean z = true;
        String str2 = null;
        boolean z2 = false;
        boolean z3 = false;
        int i4 = -1;
        int i5 = -1;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        int i6 = -1;
        int i7 = -1;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        while (i3 < size) {
            String name = headers2.name(i3);
            String value = headers2.value(i3);
            if (name.equalsIgnoreCase("Cache-Control")) {
                if (str2 == null) {
                    str2 = value;
                    i = 0;
                    while (i < value.length()) {
                        int length2 = value.length();
                        int i8 = i;
                        while (true) {
                            if (i8 >= length2) {
                                i2 = size;
                                length = value.length();
                                break;
                            }
                            i2 = size;
                            int i9 = i8;
                            if (StringsKt.contains((CharSequence) "=,;", value.charAt(i8), false)) {
                                length = i9;
                                break;
                            }
                            i8 = i9 + 1;
                            size = i2;
                        }
                        String obj = StringsKt.trim(value.substring(i, length)).toString();
                        if (length == value.length() || value.charAt(length) == ',' || value.charAt(length) == ';') {
                            i = length + 1;
                            str = null;
                        } else {
                            int i10 = length + 1;
                            byte[] bArr = _UtilCommonKt.EMPTY_BYTE_ARRAY;
                            int length3 = value.length();
                            while (true) {
                                if (i10 < length3) {
                                    char charAt = value.charAt(i10);
                                    if (charAt != ' ' && charAt != '\t') {
                                        break;
                                    }
                                    i10++;
                                } else {
                                    i10 = value.length();
                                    break;
                                }
                            }
                            if (i10 >= value.length() || value.charAt(i10) != '\"') {
                                int length4 = value.length();
                                int i11 = i10;
                                while (true) {
                                    if (i11 >= length4) {
                                        i = value.length();
                                        break;
                                    }
                                    int i12 = length4;
                                    int i13 = i11;
                                    if (StringsKt.contains((CharSequence) ",;", value.charAt(i11), false)) {
                                        i = i13;
                                        break;
                                    }
                                    i11 = i13 + 1;
                                    length4 = i12;
                                }
                                str = StringsKt.trim(value.substring(i10, i)).toString();
                            } else {
                                int i14 = i10 + 1;
                                int indexOf$default = StringsKt.indexOf$default((CharSequence) value, '\"', i14, false, 4);
                                str = value.substring(i14, indexOf$default);
                                i = indexOf$default + 1;
                            }
                        }
                        if ("no-cache".equalsIgnoreCase(obj)) {
                            z2 = true;
                        } else if ("no-store".equalsIgnoreCase(obj)) {
                            z3 = true;
                        } else if ("max-age".equalsIgnoreCase(obj)) {
                            i4 = _UtilCommonKt.toNonNegativeInt(-1, str);
                        } else if ("s-maxage".equalsIgnoreCase(obj)) {
                            i5 = _UtilCommonKt.toNonNegativeInt(-1, str);
                        } else if ("private".equalsIgnoreCase(obj)) {
                            z4 = true;
                        } else if ("public".equalsIgnoreCase(obj)) {
                            z5 = true;
                        } else if ("must-revalidate".equalsIgnoreCase(obj)) {
                            z6 = true;
                        } else if ("max-stale".equalsIgnoreCase(obj)) {
                            i6 = _UtilCommonKt.toNonNegativeInt(Integer.MAX_VALUE, str);
                        } else if ("min-fresh".equalsIgnoreCase(obj)) {
                            i7 = _UtilCommonKt.toNonNegativeInt(-1, str);
                        } else if ("only-if-cached".equalsIgnoreCase(obj)) {
                            z7 = true;
                        } else if ("no-transform".equalsIgnoreCase(obj)) {
                            z8 = true;
                        } else if ("immutable".equalsIgnoreCase(obj)) {
                            z9 = true;
                        }
                        size = i2;
                    }
                    i3++;
                    headers2 = headers;
                    size = size;
                }
            } else if (!name.equalsIgnoreCase("Pragma")) {
                i3++;
                headers2 = headers;
                size = size;
            }
            z = false;
            i = 0;
            while (i < value.length()) {
            }
            i3++;
            headers2 = headers;
            size = size;
        }
        return new CacheControl(z2, z3, i4, i5, z4, z5, z6, i6, i7, z7, z8, z9, !z ? null : str2);
    }
}
