package okio;

import android.app.Application;
import android.content.pm.ApplicationInfo;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.squareup.cash.R;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.Closeable;
import kotlin.ExceptionsKt__ExceptionsKt;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Reflection;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.UnreadableResponseBody;
import papa.MainThreadMessageSpy;
import papa.SafeTrace;
import papa.internal.MainThreadTriggerTracer$$ExternalSyntheticLambda0;

/* loaded from: classes3.dex */
public abstract class Utf8 {
    public static volatile boolean enabled;
    public final /* synthetic */ int $r8$classId = 3;

    public static final void closeFinally(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                ExceptionsKt__ExceptionsKt.addSuppressed(th, th2);
            }
        }
    }

    public static void enableOnMainThread() {
        boolean z;
        if (enabled) {
            return;
        }
        Boolean bool = SafeTrace._isTraceable;
        boolean z2 = false;
        int i = 1;
        if (bool != null) {
            z = bool.booleanValue();
        } else if (TuplesKt.application != null) {
            Application application = TuplesKt.application;
            if (application == null) {
                Intrinsics.throwUninitializedPropertyAccessException("application");
                throw null;
            }
            ApplicationInfo applicationInfo = application.getApplicationInfo();
            z = (applicationInfo.flags & 2) != 0 || applicationInfo.isProfileableByShell();
            SafeTrace._isTraceable = Boolean.valueOf(z);
        } else {
            z = false;
        }
        if (z) {
            if (TuplesKt.application != null) {
                Application application2 = TuplesKt.application;
                if (application2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("application");
                    throw null;
                }
                z2 = application2.getResources().getBoolean(R.bool.papa_trace_main_thread);
            }
            if (z2) {
                enabled = true;
                MainThreadMessageSpy.addTracer(new MainThreadTriggerTracer$$ExternalSyntheticLambda0(i, new Ref$BooleanRef()));
            }
        }
    }

    public static final int indexSegment(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static long size$default(String str) {
        long j;
        int length = str.length();
        str.getClass();
        long j2 = 0;
        if (length < 0) {
            Path$$ExternalSyntheticBUOutline0.m$1((Object) Recorder$$ExternalSyntheticOutline2.m("endIndex < beginIndex: ", length, 0, " < "));
            return 0L;
        }
        if (length > str.length()) {
            Path$$ExternalSyntheticBUOutline0.m$1(str.length(), JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(length, "endIndex > string.length: ", " > "));
            return 0L;
        }
        int i = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt < 128) {
                j2++;
            } else {
                if (charAt < 2048) {
                    j = 2;
                } else if (charAt < 55296 || charAt > 57343) {
                    j = 3;
                } else {
                    int i2 = i + 1;
                    char charAt2 = i2 < length ? str.charAt(i2) : (char) 0;
                    if (charAt > 56319 || charAt2 < 56320 || charAt2 > 57343) {
                        j2++;
                        i = i2;
                    } else {
                        j2 += 4;
                        i += 2;
                    }
                }
                j2 += j;
            }
            i++;
        }
        return j2;
    }

    public static final Response stripBody(Response response) {
        response.getClass();
        Response.Builder newBuilder = response.newBuilder();
        ResponseBody responseBody = response.body;
        newBuilder.body = new UnreadableResponseBody(responseBody.contentType(), responseBody.contentLength());
        return newBuilder.build();
    }

    public int hashCode() {
        switch (this.$r8$classId) {
            case 3:
                return toString().hashCode();
            default:
                return super.hashCode();
        }
    }

    public String toString() {
        switch (this.$r8$classId) {
            case 3:
                String simpleName = Reflection.factory.getOrCreateKotlinClass(getClass()).getSimpleName();
                simpleName.getClass();
                return simpleName;
            default:
                return super.toString();
        }
    }
}
