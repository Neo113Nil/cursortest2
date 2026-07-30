package com.drake.net.interceptor;

import com.drake.net.NetConfig;
import com.drake.net.body.NetRequestBody;
import com.drake.net.cache.CacheMode;
import com.drake.net.exception.HttpFailureException;
import com.drake.net.exception.NetConnectException;
import com.drake.net.exception.NetException;
import com.drake.net.exception.NetSocketTimeoutException;
import com.drake.net.exception.NetUnknownHostException;
import com.drake.net.exception.NoCacheException;
import com.drake.net.tag.NetTag$DownloadListeners;
import com.drake.net.tag.NetTag$UploadListeners;
import java.lang.ref.WeakReference;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.jvm.internal.s;
import okhttp3.CacheControl;
import okhttp3.Call;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import y5.w;

/* loaded from: classes3.dex */
public final class NetOkHttpInterceptor implements Interceptor {
    public static final NetOkHttpInterceptor INSTANCE = new NetOkHttpInterceptor();

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CacheMode.values().length];
            iArr[CacheMode.READ.ordinal()] = 1;
            iArr[CacheMode.READ_THEN_REQUEST.ordinal()] = 2;
            iArr[CacheMode.REQUEST_THEN_READ.ordinal()] = 3;
            iArr[CacheMode.WRITE.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private NetOkHttpInterceptor() {
    }

    private final void appendRunningCall(Interceptor.Chain chain) {
        NetConfig.INSTANCE.getRunningCalls().add(new WeakReference<>(chain.call()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeRunningCall(Interceptor.Chain chain) {
        Iterator<WeakReference<Call>> it = NetConfig.INSTANCE.getRunningCalls().iterator();
        s.checkNotNullExpressionValue(it, "NetConfig.runningCalls.iterator()");
        while (it.hasNext()) {
            Call call = it.next().get();
            if (call == null) {
                it.remove();
            } else if (s.areEqual(call, chain.call())) {
                it.remove();
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // okhttp3.Interceptor
    public Response intercept(final Interceptor.Chain chain) {
        Response response;
        ConnectException connectException;
        Throwable th;
        Response proceed;
        s.checkNotNullParameter(chain, "chain");
        Request request = chain.request();
        RequestBody body = request.body();
        NetRequestBody netRequestBody = body != null ? com.drake.net.body.a.toNetRequestBody(body, (ConcurrentLinkedQueue) request.tag(NetTag$UploadListeners.class)) : null;
        com.drake.net.cache.a aVar = (com.drake.net.cache.a) request.tag(com.drake.net.cache.a.class);
        if (aVar == null) {
            aVar = NetConfig.INSTANCE.getForceCache$net_release();
        }
        CacheMode cacheMode = (CacheMode) request.tag(CacheMode.class);
        Request.Builder newBuilder = request.newBuilder();
        if (aVar != null && cacheMode != null) {
            newBuilder.cacheControl(new CacheControl.Builder().noCache().noStore().build());
        }
        Request build = newBuilder.method(request.method(), netRequestBody).build();
        try {
            try {
                try {
                    try {
                        appendRunningCall(chain);
                        if (aVar != null) {
                            int i8 = cacheMode == null ? -1 : a.$EnumSwitchMapping$0[cacheMode.ordinal()];
                            if (i8 == 1) {
                                proceed = aVar.get$net_release(build);
                                if (proceed == null) {
                                    throw new NoCacheException(build, null, null, 6, null);
                                }
                            } else if (i8 == 2) {
                                proceed = aVar.get$net_release(build);
                                if (proceed == null) {
                                    proceed = aVar.put$net_release(chain.proceed(build));
                                }
                            } else if (i8 != 3) {
                                proceed = i8 != 4 ? chain.proceed(build) : aVar.put$net_release(chain.proceed(build));
                            } else {
                                try {
                                    proceed = aVar.put$net_release(chain.proceed(build));
                                } catch (Exception unused) {
                                    proceed = aVar.get$net_release(build);
                                    if (proceed == null) {
                                        throw new NoCacheException(build, null, null, 6, null);
                                    }
                                }
                            }
                        } else {
                            proceed = chain.proceed(build);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    response = netRequestBody;
                    if ((response != 0 ? response.body() : null) == null) {
                        removeRunningCall(chain);
                    }
                    throw th;
                }
            } catch (NetException e8) {
                throw e8;
            } catch (ConnectException e9) {
                connectException = e9;
            } catch (SocketTimeoutException e10) {
                e = e10;
            } catch (UnknownHostException e11) {
                e = e11;
            }
            try {
                ResponseBody body2 = proceed.body();
                Response build2 = proceed.newBuilder().body(body2 != null ? com.drake.net.body.a.toNetResponseBody(body2, (ConcurrentLinkedQueue) build.tag(NetTag$DownloadListeners.class), new f6.a() { // from class: com.drake.net.interceptor.NetOkHttpInterceptor$intercept$respBody$1
                    {
                        super(0);
                    }

                    @Override // f6.a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m145invoke();
                        return w.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m145invoke() {
                        NetOkHttpInterceptor.INSTANCE.removeRunningCall(Interceptor.Chain.this);
                    }
                }) : null).build();
                if ((build2 != null ? build2.body() : null) == null) {
                    removeRunningCall(chain);
                }
                return build2;
            } catch (NetException e12) {
                throw e12;
            } catch (ConnectException e13) {
                connectException = e13;
                throw new NetConnectException(build, null, connectException, 2, null);
            } catch (SocketTimeoutException e14) {
                e = e14;
                throw new NetSocketTimeoutException(build, e.getMessage(), e);
            } catch (UnknownHostException e15) {
                e = e15;
                throw new NetUnknownHostException(build, e.getMessage(), null, 4, null);
            } catch (Throwable th4) {
                th = th4;
                throw new HttpFailureException(build, null, th, 2, null);
            }
        } catch (Throwable th5) {
            th = th5;
            response = aVar;
        }
    }
}
