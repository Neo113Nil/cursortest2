package com.squareup.cash.userjourneys.tracker;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import com.squareup.cash.userjourneys.tracker.UserJourneyResponseSignal;
import com.squareup.cash.userjourneys.tracker.UserJourneyTracker;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.http.RealInterceptorChain;

/* loaded from: classes.dex */
public final class UserJourneyInterceptor implements Interceptor {
    public final UserJourneySignalProcessor signalProcessor;
    public final UserJourneyTracker userJourneyTracker;

    public UserJourneyInterceptor(UserJourneyTracker userJourneyTracker, UserJourneySignalProcessor userJourneySignalProcessor, RealCdfJourneyMap realCdfJourneyMap) {
        this.userJourneyTracker = userJourneyTracker;
        this.signalProcessor = userJourneySignalProcessor;
    }

    public static UserJourneyResponseSignal getSignal(Exception exc, final String str) {
        if (exc instanceof SocketTimeoutException) {
            return new UserJourneyResponseSignal.Friction(UserJourney$Friction$Network$TimeoutNetworkError.INSTANCE);
        }
        if (exc instanceof UnknownHostException) {
            return new UserJourneyResponseSignal.Friction(UserJourney$Friction$Network$DnsNetworkError.INSTANCE);
        }
        if (exc instanceof SSLException) {
            return new UserJourneyResponseSignal.Friction(new UserJourney$Friction(str) { // from class: com.squareup.cash.userjourneys.tracker.UserJourney$Friction$Network$SslNetworkError
                public final String path;

                {
                    super("ssl-network-error-".concat(str));
                    this.path = str;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof UserJourney$Friction$Network$SslNetworkError) && Intrinsics.areEqual(this.path, ((UserJourney$Friction$Network$SslNetworkError) obj).path);
                }

                public final int hashCode() {
                    return this.path.hashCode();
                }

                public final String toString() {
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SslNetworkError(path=", this.path, ")");
                }
            });
        }
        if (exc instanceof InterruptedIOException) {
            return new UserJourneyResponseSignal.Friction(UserJourney$Friction$Network$CancelledNetworkError.INSTANCE);
        }
        if (exc instanceof ConnectException) {
            return new UserJourneyResponseSignal.Friction(UserJourney$Friction$Network$ConnectivityNetworkError.INSTANCE);
        }
        if (exc instanceof ProtocolException) {
            return new UserJourneyResponseSignal.Frustration(new UserJourney$Friction(str) { // from class: com.squareup.cash.userjourneys.tracker.UserJourney$Frustration$Network$ProtocolNetworkError
                public final String path;

                {
                    super("protocol-network-error-".concat(str));
                    this.path = str;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof UserJourney$Frustration$Network$ProtocolNetworkError) && Intrinsics.areEqual(this.path, ((UserJourney$Frustration$Network$ProtocolNetworkError) obj).path);
                }

                public final int hashCode() {
                    return this.path.hashCode();
                }

                public final String toString() {
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ProtocolNetworkError(path=", this.path, ")");
                }
            });
        }
        if (exc instanceof IOException) {
            final String simpleName = exc.getClass().getSimpleName();
            return new UserJourneyResponseSignal.Friction(new UserJourney$Friction(simpleName) { // from class: com.squareup.cash.userjourneys.tracker.UserJourney$Friction$Network$IONetworkError
                public final String name;

                {
                    super(simpleName.concat("-network-error"));
                    this.name = simpleName;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof UserJourney$Friction$Network$IONetworkError) && Intrinsics.areEqual(this.name, ((UserJourney$Friction$Network$IONetworkError) obj).name);
                }

                public final int hashCode() {
                    return this.name.hashCode();
                }

                public final String toString() {
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("IONetworkError(name=", this.name, ")");
                }
            });
        }
        String message = exc.getMessage();
        if (message == null) {
            message = "";
        }
        return StringsKt.contains((CharSequence) message, (CharSequence) "Unexpected call to beginMessage()", false) ? new UserJourneyResponseSignal.Frustration(new UserJourney$Friction(str) { // from class: com.squareup.cash.userjourneys.tracker.UserJourney$Frustration$Network$ProtoFormatNetworkError
            public final String path;

            {
                super("proto-format-network-error-".concat(str));
                this.path = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof UserJourney$Frustration$Network$ProtoFormatNetworkError) && Intrinsics.areEqual(this.path, ((UserJourney$Frustration$Network$ProtoFormatNetworkError) obj).path);
            }

            public final int hashCode() {
                return this.path.hashCode();
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ProtoFormatNetworkError(path=", this.path, ")");
            }
        }) : new UserJourneyResponseSignal.Frustration(new UserJourney$Friction(str) { // from class: com.squareup.cash.userjourneys.tracker.UserJourney$Frustration$Network$UnknownNetworkError
            public final String path;

            {
                super("unknown-network-error-".concat(str));
                this.path = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof UserJourney$Frustration$Network$UnknownNetworkError) && Intrinsics.areEqual(this.path, ((UserJourney$Frustration$Network$UnknownNetworkError) obj).path);
            }

            public final int hashCode() {
                return this.path.hashCode();
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("UnknownNetworkError(path=", this.path, ")");
            }
        });
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        Request request = realInterceptorChain.request;
        List activeUserJourneys = ((RealUserJourneySignalProcessor) this.signalProcessor).getActiveUserJourneys();
        if (!activeUserJourneys.isEmpty()) {
            request.getClass();
            HttpUrl httpUrl = request.url;
            String str = request.headers.get("Cash-Flow-Token");
            if (str == null || str.length() == 0) {
                List list = activeUserJourneys;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        List list2 = (List) RealCdfJourneyMap.relevantEndpoints.get(((ActiveUserJourney) it.next()).name);
                        if (list2 == null) {
                            list2 = EmptyList.INSTANCE;
                        }
                        if (list2.contains(httpUrl.encodedPath())) {
                        }
                    }
                }
            }
            Request.Builder newBuilder = request.newBuilder();
            String uuid = ((ActiveUserJourney) CollectionsKt.last(activeUserJourneys)).id.toString();
            uuid.getClass();
            newBuilder.addHeader("ot-baggage-uj_id", uuid);
            newBuilder.addHeader("ot-baggage-uj_name", ((ActiveUserJourney) CollectionsKt.last(activeUserJourneys)).name.getLabel());
            try {
                try {
                    Response proceed = ((RealInterceptorChain) chain).proceed(new Request(newBuilder));
                    UserJourneyResponseSignal signal = proceed.isSuccessful ? null : getSignal(proceed);
                    return proceed;
                } catch (Exception e) {
                    getSignal(e, httpUrl.encodedPath());
                    throw e;
                }
            } finally {
                if (0 != 0) {
                    reportSignal(null);
                }
            }
        }
        return realInterceptorChain.proceed(request);
    }

    public final void reportSignal(UserJourneyResponseSignal userJourneyResponseSignal) {
        boolean z = userJourneyResponseSignal instanceof UserJourneyResponseSignal.Friction;
        UserJourneyTracker userJourneyTracker = this.userJourneyTracker;
        if (z) {
            UserJourney$Friction friction = ((UserJourneyResponseSignal.Friction) userJourneyResponseSignal).getFriction();
            UserJourneyTracker.Companion companion = UserJourneyTracker.Companion;
            ((RealUserJourneyTracker) userJourneyTracker).addFrictionSignal(null, friction);
        } else {
            if (!(userJourneyResponseSignal instanceof UserJourneyResponseSignal.Frustration)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            UserJourney$Friction frustration = ((UserJourneyResponseSignal.Frustration) userJourneyResponseSignal).getFrustration();
            UserJourneyTracker.Companion companion2 = UserJourneyTracker.Companion;
            ((RealUserJourneyTracker) userJourneyTracker).addFrustrationSignal(null, frustration);
        }
    }

    public static UserJourneyResponseSignal getSignal(Response response) {
        String str;
        final String encodedPath = response.request.url.encodedPath();
        final int i = response.code;
        if (i != 400) {
            if (i != 401 && i != 408) {
                return new UserJourneyResponseSignal.Frustration(new UserJourney$Friction(encodedPath, i) { // from class: com.squareup.cash.userjourneys.tracker.UserJourney$Frustration$Network$HttpError
                    public final int httpStatusCode;
                    public final String path;

                    {
                        super(i + "-error-" + encodedPath);
                        this.path = encodedPath;
                        this.httpStatusCode = i;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof UserJourney$Frustration$Network$HttpError)) {
                            return false;
                        }
                        UserJourney$Frustration$Network$HttpError userJourney$Frustration$Network$HttpError = (UserJourney$Frustration$Network$HttpError) obj;
                        return Intrinsics.areEqual(this.path, userJourney$Frustration$Network$HttpError.path) && this.httpStatusCode == userJourney$Frustration$Network$HttpError.httpStatusCode;
                    }

                    public final int hashCode() {
                        return Integer.hashCode(this.httpStatusCode) + (this.path.hashCode() * 31);
                    }

                    public final String toString() {
                        return Recorder$$ExternalSyntheticOutline1.m("HttpError(path=", this.httpStatusCode, this.path, ", httpStatusCode=", ")");
                    }
                });
            }
            return new UserJourneyResponseSignal.Friction(new UserJourney$Friction(encodedPath, i) { // from class: com.squareup.cash.userjourneys.tracker.UserJourney$Friction$Network$HttpError
                public final int httpStatusCode;
                public final String path;

                {
                    super(i + "-error-" + encodedPath);
                    this.path = encodedPath;
                    this.httpStatusCode = i;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof UserJourney$Friction$Network$HttpError)) {
                        return false;
                    }
                    UserJourney$Friction$Network$HttpError userJourney$Friction$Network$HttpError = (UserJourney$Friction$Network$HttpError) obj;
                    return Intrinsics.areEqual(this.path, userJourney$Friction$Network$HttpError.path) && this.httpStatusCode == userJourney$Friction$Network$HttpError.httpStatusCode;
                }

                public final int hashCode() {
                    return Integer.hashCode(this.httpStatusCode) + (this.path.hashCode() * 31);
                }

                public final String toString() {
                    return Recorder$$ExternalSyntheticOutline1.m("HttpError(path=", this.httpStatusCode, this.path, ", httpStatusCode=", ")");
                }
            });
        }
        try {
            str = StringsKt.trim(response.peekBody(1024L).string()).toString();
        } catch (IOException unused) {
            str = null;
        }
        if (StringsKt__StringsJVMKt.equals(str, "session revoked", true)) {
            return new UserJourneyResponseSignal.Friction(new UserJourney$Friction(encodedPath) { // from class: com.squareup.cash.userjourneys.tracker.UserJourney$Friction$Network$SessionRevoked
                public final String path;

                {
                    super("session-revoked-".concat(encodedPath));
                    this.path = encodedPath;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof UserJourney$Friction$Network$SessionRevoked) && Intrinsics.areEqual(this.path, ((UserJourney$Friction$Network$SessionRevoked) obj).path);
                }

                public final int hashCode() {
                    return this.path.hashCode();
                }

                public final String toString() {
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SessionRevoked(path=", this.path, ")");
                }
            });
        }
        if (StringsKt__StringsJVMKt.equals(str, "session expired", true)) {
            return new UserJourneyResponseSignal.Friction(new UserJourney$Friction(encodedPath) { // from class: com.squareup.cash.userjourneys.tracker.UserJourney$Friction$Network$SessionExpired
                public final String path;

                {
                    super("session-expired-".concat(encodedPath));
                    this.path = encodedPath;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof UserJourney$Friction$Network$SessionExpired) && Intrinsics.areEqual(this.path, ((UserJourney$Friction$Network$SessionExpired) obj).path);
                }

                public final int hashCode() {
                    return this.path.hashCode();
                }

                public final String toString() {
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SessionExpired(path=", this.path, ")");
                }
            });
        }
        return new UserJourneyResponseSignal.Frustration(new UserJourney$Friction(encodedPath, i) { // from class: com.squareup.cash.userjourneys.tracker.UserJourney$Frustration$Network$HttpError
            public final int httpStatusCode;
            public final String path;

            {
                super(i + "-error-" + encodedPath);
                this.path = encodedPath;
                this.httpStatusCode = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof UserJourney$Frustration$Network$HttpError)) {
                    return false;
                }
                UserJourney$Frustration$Network$HttpError userJourney$Frustration$Network$HttpError = (UserJourney$Frustration$Network$HttpError) obj;
                return Intrinsics.areEqual(this.path, userJourney$Frustration$Network$HttpError.path) && this.httpStatusCode == userJourney$Frustration$Network$HttpError.httpStatusCode;
            }

            public final int hashCode() {
                return Integer.hashCode(this.httpStatusCode) + (this.path.hashCode() * 31);
            }

            public final String toString() {
                return Recorder$$ExternalSyntheticOutline1.m("HttpError(path=", this.httpStatusCode, this.path, ", httpStatusCode=", ")");
            }
        });
    }
}
