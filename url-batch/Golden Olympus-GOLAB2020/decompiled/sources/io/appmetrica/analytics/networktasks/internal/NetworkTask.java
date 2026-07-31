package io.appmetrica.analytics.networktasks.internal;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy;
import io.appmetrica.analytics.networktasks.impl.e;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes3.dex */
public class NetworkTask {

    /* renamed from: a, reason: collision with root package name */
    private int f40613a = 1;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f40614b;

    /* renamed from: c, reason: collision with root package name */
    private final IExecutionPolicy f40615c;

    /* renamed from: d, reason: collision with root package name */
    private final ExponentialBackoffPolicy f40616d;

    /* renamed from: e, reason: collision with root package name */
    private final UnderlyingNetworkTask f40617e;

    /* renamed from: f, reason: collision with root package name */
    private final List f40618f;

    /* renamed from: g, reason: collision with root package name */
    private final String f40619g;

    public enum Method {
        GET,
        POST
    }

    public interface ShouldTryNextHostCondition {
        boolean shouldTryNextHost(int i4);
    }

    public NetworkTask(@NonNull Executor executor, @NonNull IExecutionPolicy iExecutionPolicy, @NonNull ExponentialBackoffPolicy exponentialBackoffPolicy, @NonNull UnderlyingNetworkTask underlyingNetworkTask, @NonNull List<ShouldTryNextHostCondition> list, @NonNull String str) {
        this.f40614b = executor;
        this.f40615c = iExecutionPolicy;
        this.f40616d = exponentialBackoffPolicy;
        this.f40617e = underlyingNetworkTask;
        this.f40618f = list;
        this.f40619g = str;
    }

    private synchronized boolean a(int i4) {
        if (!a(i4)) {
            return false;
        }
        this.f40613a = i4;
        return true;
    }

    @NonNull
    public String description() {
        return this.f40617e.description();
    }

    @NonNull
    public IExecutionPolicy getConnectionExecutionPolicy() {
        return this.f40615c;
    }

    @NonNull
    public Executor getExecutor() {
        return this.f40614b;
    }

    @NonNull
    public ExponentialBackoffPolicy getExponentialBackoffPolicy() {
        return this.f40616d;
    }

    @NonNull
    public RequestDataHolder getRequestDataHolder() {
        return this.f40617e.getRequestDataHolder();
    }

    @NonNull
    public ResponseDataHolder getResponseDataHolder() {
        return this.f40617e.getResponseDataHolder();
    }

    public RetryPolicyConfig getRetryPolicyConfig() {
        return this.f40617e.getRetryPolicyConfig();
    }

    public SSLSocketFactory getSslSocketFactory() {
        return this.f40617e.getSslSocketFactory();
    }

    @NonNull
    public UnderlyingNetworkTask getUnderlyingTask() {
        return this.f40617e;
    }

    public String getUrl() {
        return this.f40617e.getFullUrlFormer().getUrl();
    }

    @NonNull
    public String getUserAgent() {
        return this.f40619g;
    }

    public boolean isRemoved() {
        return this.f40613a == 9;
    }

    public boolean onCreateNetworkTask() {
        if (a(3)) {
            return this.f40617e.onCreateTask();
        }
        return false;
    }

    public boolean onPerformRequest() {
        boolean a4 = a(4);
        if (a4) {
            this.f40617e.getFullUrlFormer().incrementAttemptNumber();
            this.f40617e.getFullUrlFormer().buildAndSetFullHostUrl();
            this.f40617e.onPerformRequest();
        }
        return a4;
    }

    public boolean onRequestComplete() {
        boolean z4;
        boolean z5;
        synchronized (this) {
            try {
                if (a(5, 6)) {
                    z4 = this.f40617e.onRequestComplete();
                    if (z4) {
                        this.f40613a = 5;
                    } else {
                        this.f40613a = 6;
                    }
                    z5 = true;
                } else {
                    z4 = false;
                    z5 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z5) {
            this.f40617e.onPostRequestComplete(z4);
        }
        return z4;
    }

    public void onRequestError(Throwable th) {
        if (a(6)) {
            this.f40617e.onRequestError(th);
        }
    }

    public void onShouldNotExecute() {
        if (a(7)) {
            this.f40617e.onShouldNotExecute();
        }
    }

    public boolean onTaskAdded() {
        boolean a4 = a(2);
        if (a4) {
            this.f40617e.onTaskAdded();
        }
        return a4;
    }

    public void onTaskFinished() {
        int i4;
        boolean a4;
        synchronized (this) {
            i4 = this.f40613a;
            a4 = a(8);
        }
        if (a4) {
            this.f40617e.onTaskFinished();
            if (i4 == 5) {
                this.f40617e.onSuccessfulTaskFinished();
            } else if (i4 == 6 || i4 == 7) {
                this.f40617e.onUnsuccessfulTaskFinished();
            }
        }
    }

    public void onTaskRemoved() {
        if (a(9)) {
            this.f40617e.onTaskRemoved();
        }
    }

    public synchronized boolean shouldTryNextHost() {
        boolean hasMoreHosts;
        boolean z4;
        int i4;
        try {
            hasMoreHosts = this.f40617e.getFullUrlFormer().hasMoreHosts();
            int responseCode = this.f40617e.getResponseDataHolder().getResponseCode();
            Iterator it = this.f40618f.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z4 = true;
                    break;
                }
                if (!((ShouldTryNextHostCondition) it.next()).shouldTryNextHost(responseCode)) {
                    z4 = false;
                    break;
                }
            }
            i4 = this.f40613a;
        } catch (Throwable th) {
            throw th;
        }
        return i4 != 9 && i4 != 8 && hasMoreHosts && z4;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0065 A[Catch: all -> 0x001f, TryCatch #0 {all -> 0x001f, blocks: (B:3:0x0001, B:5:0x000a, B:6:0x0018, B:7:0x001b, B:8:0x0077, B:10:0x0081, B:22:0x002a, B:33:0x003f, B:34:0x0042, B:36:0x0047, B:38:0x004c, B:40:0x0051, B:46:0x005d, B:47:0x0060, B:49:0x0065, B:51:0x006a, B:54:0x0071, B:13:0x0084), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private synchronized boolean a(int... iArr) {
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        try {
            bool = Boolean.TRUE;
            int i4 = this.f40613a;
            int length = iArr.length;
            int i5 = 0;
            while (true) {
                if (i5 < length) {
                    boolean z4 = true;
                    switch (e.a(iArr[i5])) {
                        case 0:
                            bool3 = null;
                            break;
                        case 1:
                            if (i4 != 1) {
                                z4 = false;
                            }
                            bool3 = Boolean.valueOf(z4);
                            break;
                        case 2:
                            if (i4 == 2) {
                                if (i4 == 9) {
                                    bool3 = Boolean.FALSE;
                                    break;
                                }
                                bool3 = null;
                                break;
                            } else {
                                bool3 = Boolean.TRUE;
                                break;
                            }
                        case 3:
                            if (i4 != 3 && i4 != 5 && i4 != 6) {
                                if (i4 == 9) {
                                    bool3 = Boolean.FALSE;
                                    break;
                                }
                                bool3 = null;
                                break;
                            }
                            bool3 = Boolean.TRUE;
                        case 4:
                        case 5:
                            if (i4 != 4) {
                                if (i4 == 9) {
                                    bool3 = Boolean.FALSE;
                                    break;
                                }
                                bool3 = null;
                                break;
                            } else {
                                bool3 = Boolean.TRUE;
                                break;
                            }
                        case 6:
                            if (i4 == 3) {
                                bool3 = Boolean.TRUE;
                                break;
                            }
                            if (i4 == 2) {
                            }
                            break;
                        case 7:
                            if (i4 != 5 && i4 != 6 && i4 != 7 && i4 != 2 && i4 != 3 && i4 != 4) {
                                if (i4 == 9) {
                                    bool3 = Boolean.FALSE;
                                    break;
                                }
                                bool3 = null;
                                break;
                            }
                            bool3 = Boolean.TRUE;
                        case 8:
                            if (i4 != 1) {
                                if (i4 == 9) {
                                    z4 = false;
                                }
                                bool3 = Boolean.valueOf(z4);
                                break;
                            } else {
                                bool3 = null;
                                break;
                            }
                        default:
                            bool3 = Boolean.FALSE;
                            break;
                    }
                    if (Boolean.TRUE.equals(bool3)) {
                        i5++;
                    } else {
                        bool = bool3;
                    }
                }
            }
            bool2 = Boolean.TRUE;
            bool2.equals(bool);
        } catch (Throwable th) {
            throw th;
        }
        return bool2.equals(bool);
    }
}
