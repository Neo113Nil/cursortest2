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
    private int f8906a = 1;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f8907b;

    /* renamed from: c, reason: collision with root package name */
    private final IExecutionPolicy f8908c;

    /* renamed from: d, reason: collision with root package name */
    private final ExponentialBackoffPolicy f8909d;

    /* renamed from: e, reason: collision with root package name */
    private final UnderlyingNetworkTask f8910e;
    private final List f;

    /* renamed from: g, reason: collision with root package name */
    private final String f8911g;

    public enum Method {
        GET,
        POST
    }

    public interface ShouldTryNextHostCondition {
        boolean shouldTryNextHost(int i3);
    }

    public NetworkTask(Executor executor, IExecutionPolicy iExecutionPolicy, ExponentialBackoffPolicy exponentialBackoffPolicy, UnderlyingNetworkTask underlyingNetworkTask, List<ShouldTryNextHostCondition> list, String str) {
        this.f8907b = executor;
        this.f8908c = iExecutionPolicy;
        this.f8909d = exponentialBackoffPolicy;
        this.f8910e = underlyingNetworkTask;
        this.f = list;
        this.f8911g = str;
    }

    private synchronized boolean a(int i3) {
        if (!a(i3)) {
            return false;
        }
        this.f8906a = i3;
        return true;
    }

    public String description() {
        return this.f8910e.description();
    }

    public IExecutionPolicy getConnectionExecutionPolicy() {
        return this.f8908c;
    }

    public Executor getExecutor() {
        return this.f8907b;
    }

    public ExponentialBackoffPolicy getExponentialBackoffPolicy() {
        return this.f8909d;
    }

    public RequestDataHolder getRequestDataHolder() {
        return this.f8910e.getRequestDataHolder();
    }

    public ResponseDataHolder getResponseDataHolder() {
        return this.f8910e.getResponseDataHolder();
    }

    public RetryPolicyConfig getRetryPolicyConfig() {
        return this.f8910e.getRetryPolicyConfig();
    }

    public SSLSocketFactory getSslSocketFactory() {
        return this.f8910e.getSslSocketFactory();
    }

    public UnderlyingNetworkTask getUnderlyingTask() {
        return this.f8910e;
    }

    public String getUrl() {
        return this.f8910e.getFullUrlFormer().getUrl();
    }

    public String getUserAgent() {
        return this.f8911g;
    }

    public boolean isRemoved() {
        return this.f8906a == 9;
    }

    public boolean onCreateNetworkTask() {
        if (a(3)) {
            return this.f8910e.onCreateTask();
        }
        return false;
    }

    public boolean onPerformRequest() {
        boolean a3 = a(4);
        if (a3) {
            this.f8910e.getFullUrlFormer().incrementAttemptNumber();
            this.f8910e.getFullUrlFormer().buildAndSetFullHostUrl();
            this.f8910e.onPerformRequest();
        }
        return a3;
    }

    public boolean onRequestComplete() {
        boolean z;
        boolean z2;
        synchronized (this) {
            try {
                if (a(5, 6)) {
                    z = this.f8910e.onRequestComplete();
                    if (z) {
                        this.f8906a = 5;
                    } else {
                        this.f8906a = 6;
                    }
                    z2 = true;
                } else {
                    z = false;
                    z2 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2) {
            this.f8910e.onPostRequestComplete(z);
        }
        return z;
    }

    public void onRequestError(Throwable th) {
        if (a(6)) {
            this.f8910e.onRequestError(th);
        }
    }

    public void onShouldNotExecute() {
        if (a(7)) {
            this.f8910e.onShouldNotExecute();
        }
    }

    public boolean onTaskAdded() {
        boolean a3 = a(2);
        if (a3) {
            this.f8910e.onTaskAdded();
        }
        return a3;
    }

    public void onTaskFinished() {
        int i3;
        boolean a3;
        synchronized (this) {
            i3 = this.f8906a;
            a3 = a(8);
        }
        if (a3) {
            this.f8910e.onTaskFinished();
            if (i3 == 5) {
                this.f8910e.onSuccessfulTaskFinished();
            } else if (i3 == 6 || i3 == 7) {
                this.f8910e.onUnsuccessfulTaskFinished();
            }
        }
    }

    public void onTaskRemoved() {
        if (a(9)) {
            this.f8910e.onTaskRemoved();
        }
    }

    public synchronized boolean shouldTryNextHost() {
        boolean hasMoreHosts;
        boolean z;
        int i3;
        try {
            hasMoreHosts = this.f8910e.getFullUrlFormer().hasMoreHosts();
            int responseCode = this.f8910e.getResponseDataHolder().getResponseCode();
            Iterator it = this.f.iterator();
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
            i3 = this.f8906a;
        } catch (Throwable th) {
            throw th;
        }
        return i3 != 9 && i3 != 8 && hasMoreHosts && z;
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
            int i3 = this.f8906a;
            int length = iArr.length;
            int i4 = 0;
            while (true) {
                if (i4 < length) {
                    boolean z = true;
                    switch (e.a(iArr[i4])) {
                        case 0:
                            bool3 = null;
                            break;
                        case 1:
                            if (i3 != 1) {
                                z = false;
                            }
                            bool3 = Boolean.valueOf(z);
                            break;
                        case 2:
                            if (i3 == 2) {
                                if (i3 == 9) {
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
                            if (i3 != 3 && i3 != 5 && i3 != 6) {
                                if (i3 == 9) {
                                    bool3 = Boolean.FALSE;
                                    break;
                                }
                                bool3 = null;
                                break;
                            }
                            bool3 = Boolean.TRUE;
                        case 4:
                        case 5:
                            if (i3 != 4) {
                                if (i3 == 9) {
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
                            if (i3 == 3) {
                                bool3 = Boolean.TRUE;
                                break;
                            }
                            if (i3 == 2) {
                            }
                            break;
                        case 7:
                            if (i3 != 5 && i3 != 6 && i3 != 7 && i3 != 2 && i3 != 3 && i3 != 4) {
                                if (i3 == 9) {
                                    bool3 = Boolean.FALSE;
                                    break;
                                }
                                bool3 = null;
                                break;
                            }
                            bool3 = Boolean.TRUE;
                        case 8:
                            if (i3 != 1) {
                                if (i3 == 9) {
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
                        i4++;
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
