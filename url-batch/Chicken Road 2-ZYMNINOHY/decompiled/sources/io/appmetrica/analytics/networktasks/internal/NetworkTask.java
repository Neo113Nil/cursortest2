package io.appmetrica.analytics.networktasks.internal;

import io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy;
import io.appmetrica.analytics.networktasks.impl.e;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes.dex */
public class NetworkTask {

    /* renamed from: a, reason: collision with root package name */
    private int f13324a = 1;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f13325b;

    /* renamed from: c, reason: collision with root package name */
    private final IExecutionPolicy f13326c;

    /* renamed from: d, reason: collision with root package name */
    private final ExponentialBackoffPolicy f13327d;

    /* renamed from: e, reason: collision with root package name */
    private final UnderlyingNetworkTask f13328e;

    /* renamed from: f, reason: collision with root package name */
    private final List f13329f;

    /* renamed from: g, reason: collision with root package name */
    private final String f13330g;

    public enum Method {
        GET,
        POST
    }

    public interface ShouldTryNextHostCondition {
        boolean shouldTryNextHost(int i4);
    }

    public NetworkTask(Executor executor, IExecutionPolicy iExecutionPolicy, ExponentialBackoffPolicy exponentialBackoffPolicy, UnderlyingNetworkTask underlyingNetworkTask, List<ShouldTryNextHostCondition> list, String str) {
        this.f13325b = executor;
        this.f13326c = iExecutionPolicy;
        this.f13327d = exponentialBackoffPolicy;
        this.f13328e = underlyingNetworkTask;
        this.f13329f = list;
        this.f13330g = str;
    }

    private synchronized boolean a(int i4) {
        if (!a(i4)) {
            return false;
        }
        this.f13324a = i4;
        return true;
    }

    public String description() {
        return this.f13328e.description();
    }

    public IExecutionPolicy getConnectionExecutionPolicy() {
        return this.f13326c;
    }

    public Executor getExecutor() {
        return this.f13325b;
    }

    public ExponentialBackoffPolicy getExponentialBackoffPolicy() {
        return this.f13327d;
    }

    public RequestDataHolder getRequestDataHolder() {
        return this.f13328e.getRequestDataHolder();
    }

    public ResponseDataHolder getResponseDataHolder() {
        return this.f13328e.getResponseDataHolder();
    }

    public RetryPolicyConfig getRetryPolicyConfig() {
        return this.f13328e.getRetryPolicyConfig();
    }

    public SSLSocketFactory getSslSocketFactory() {
        return this.f13328e.getSslSocketFactory();
    }

    public UnderlyingNetworkTask getUnderlyingTask() {
        return this.f13328e;
    }

    public String getUrl() {
        return this.f13328e.getFullUrlFormer().getUrl();
    }

    public String getUserAgent() {
        return this.f13330g;
    }

    public boolean isRemoved() {
        return this.f13324a == 9;
    }

    public boolean onCreateNetworkTask() {
        if (a(3)) {
            return this.f13328e.onCreateTask();
        }
        return false;
    }

    public boolean onPerformRequest() {
        boolean a3 = a(4);
        if (a3) {
            this.f13328e.getFullUrlFormer().incrementAttemptNumber();
            this.f13328e.getFullUrlFormer().buildAndSetFullHostUrl();
            this.f13328e.onPerformRequest();
        }
        return a3;
    }

    public boolean onRequestComplete() {
        boolean z;
        boolean z4;
        synchronized (this) {
            try {
                if (a(5, 6)) {
                    z = this.f13328e.onRequestComplete();
                    if (z) {
                        this.f13324a = 5;
                    } else {
                        this.f13324a = 6;
                    }
                    z4 = true;
                } else {
                    z = false;
                    z4 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z4) {
            this.f13328e.onPostRequestComplete(z);
        }
        return z;
    }

    public void onRequestError(Throwable th) {
        if (a(6)) {
            this.f13328e.onRequestError(th);
        }
    }

    public void onShouldNotExecute() {
        if (a(7)) {
            this.f13328e.onShouldNotExecute();
        }
    }

    public boolean onTaskAdded() {
        boolean a3 = a(2);
        if (a3) {
            this.f13328e.onTaskAdded();
        }
        return a3;
    }

    public void onTaskFinished() {
        int i4;
        boolean a3;
        synchronized (this) {
            i4 = this.f13324a;
            a3 = a(8);
        }
        if (a3) {
            this.f13328e.onTaskFinished();
            if (i4 == 5) {
                this.f13328e.onSuccessfulTaskFinished();
            } else if (i4 == 6 || i4 == 7) {
                this.f13328e.onUnsuccessfulTaskFinished();
            }
        }
    }

    public void onTaskRemoved() {
        if (a(9)) {
            this.f13328e.onTaskRemoved();
        }
    }

    public synchronized boolean shouldTryNextHost() {
        boolean hasMoreHosts;
        boolean z;
        int i4;
        try {
            hasMoreHosts = this.f13328e.getFullUrlFormer().hasMoreHosts();
            int responseCode = this.f13328e.getResponseDataHolder().getResponseCode();
            Iterator it = this.f13329f.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = true;
                    break;
                }
                if (!((ShouldTryNextHostCondition) it.next()).shouldTryNextHost(responseCode)) {
                    z = false;
                    break;
                }
            }
            i4 = this.f13324a;
        } catch (Throwable th) {
            throw th;
        }
        return i4 != 9 && i4 != 8 && hasMoreHosts && z;
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
            int i4 = this.f13324a;
            int length = iArr.length;
            int i5 = 0;
            while (true) {
                if (i5 < length) {
                    boolean z = true;
                    switch (e.a(iArr[i5])) {
                        case 0:
                            bool3 = null;
                            break;
                        case 1:
                            if (i4 != 1) {
                                z = false;
                            }
                            bool3 = Boolean.valueOf(z);
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
                                    z = false;
                                }
                                bool3 = Boolean.valueOf(z);
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
