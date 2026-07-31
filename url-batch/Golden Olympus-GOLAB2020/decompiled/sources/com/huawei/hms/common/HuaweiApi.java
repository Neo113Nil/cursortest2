package com.huawei.hms.common;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.huawei.hms.adapter.AvailableUtil;
import com.huawei.hms.adapter.BinderAdapter;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.Api.ApiOptions;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.common.internal.AnyClient;
import com.huawei.hms.common.internal.BaseHmsClient;
import com.huawei.hms.common.internal.BindResolveClients;
import com.huawei.hms.common.internal.ClientSettings;
import com.huawei.hms.common.internal.HmsClient;
import com.huawei.hms.common.internal.RequestHeader;
import com.huawei.hms.common.internal.RequestManager;
import com.huawei.hms.common.internal.ResolveClientBean;
import com.huawei.hms.common.internal.ResponseHeader;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.common.internal.TaskApiCallWrapper;
import com.huawei.hms.common.internal.TransactionIdCreater;
import com.huawei.hms.core.aidl.IAIDLInvoke;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.client.SubAppInfo;
import com.huawei.hms.support.api.entity.auth.Scope;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hms.support.hianalytics.HiAnalyticsInnerClient;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.Checker;
import com.huawei.hms.utils.HMSBIInitializer;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.Util;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import z0.i;
import z0.j;

/* loaded from: classes.dex */
public class HuaweiApi<TOption extends Api.ApiOptions> {

    /* renamed from: a, reason: collision with root package name */
    private Context f13997a;

    /* renamed from: b, reason: collision with root package name */
    private TOption f13998b;

    /* renamed from: c, reason: collision with root package name */
    private Context f13999c;

    /* renamed from: d, reason: collision with root package name */
    private AbstractClientBuilder<?, TOption> f14000d;

    /* renamed from: e, reason: collision with root package name */
    private String f14001e;

    /* renamed from: f, reason: collision with root package name */
    private String f14002f;

    /* renamed from: g, reason: collision with root package name */
    private SubAppInfo f14003g;

    /* renamed from: h, reason: collision with root package name */
    private WeakReference<Activity> f14004h;

    /* renamed from: i, reason: collision with root package name */
    private int f14005i;

    /* renamed from: j, reason: collision with root package name */
    private int f14006j = 1;

    /* renamed from: k, reason: collision with root package name */
    private boolean f14007k = false;

    /* renamed from: l, reason: collision with root package name */
    private String f14008l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f14009m;

    /* renamed from: n, reason: collision with root package name */
    private RequestManager f14010n;

    public static class RequestHandler<OptionsT extends Api.ApiOptions> implements BaseHmsClient.ConnectionCallbacks, BaseHmsClient.OnConnectionFailedListener {

        /* renamed from: b, reason: collision with root package name */
        private final AnyClient f14015b;

        /* renamed from: d, reason: collision with root package name */
        private final HuaweiApi<OptionsT> f14017d;

        /* renamed from: e, reason: collision with root package name */
        private ResolveClientBean f14018e;
        public final Queue<TaskApiCallbackWrapper> callbackWaitQueue = new LinkedList();

        /* renamed from: a, reason: collision with root package name */
        private final Queue<TaskApiCallbackWrapper> f14014a = new LinkedList();

        /* renamed from: c, reason: collision with root package name */
        private ConnectionResult f14016c = null;

        RequestHandler(HuaweiApi<OptionsT> huaweiApi) {
            this.f14017d = huaweiApi;
            this.f14015b = huaweiApi.getClient(RequestManager.getHandler().getLooper(), this);
        }

        public AnyClient getClient() {
            return this.f14015b;
        }

        @Override // com.huawei.hms.common.internal.BaseHmsClient.ConnectionCallbacks
        public void onConnected() {
            HMSLog.i("HuaweiApi", "onConnected");
            BindResolveClients.getInstance().unRegister(this.f14018e);
            this.f14018e = null;
            RequestManager.getHandler().post(new Runnable() { // from class: com.huawei.hms.common.HuaweiApi.RequestHandler.4
                @Override // java.lang.Runnable
                public void run() {
                    RequestHandler.this.b();
                }
            });
        }

        @Override // com.huawei.hms.common.internal.BaseHmsClient.OnConnectionFailedListener
        public void onConnectionFailed(final ConnectionResult connectionResult) {
            HMSLog.i("HuaweiApi", "onConnectionFailed");
            BindResolveClients.getInstance().unRegister(this.f14018e);
            this.f14018e = null;
            RequestManager.getHandler().post(new Runnable() { // from class: com.huawei.hms.common.HuaweiApi.RequestHandler.3
                @Override // java.lang.Runnable
                public void run() {
                    RequestHandler.this.b(connectionResult);
                }
            });
        }

        @Override // com.huawei.hms.common.internal.BaseHmsClient.ConnectionCallbacks
        public void onConnectionSuspended(int i4) {
            HMSLog.i("HuaweiApi", "onConnectionSuspended");
            BindResolveClients.getInstance().unRegister(this.f14018e);
            this.f14018e = null;
            RequestManager.getHandler().post(new Runnable() { // from class: com.huawei.hms.common.HuaweiApi.RequestHandler.5
                @Override // java.lang.Runnable
                public void run() {
                    RequestHandler.this.c();
                }
            });
        }

        public void postMessage(final TaskApiCallbackWrapper taskApiCallbackWrapper) {
            RequestManager.addToConnectedReqMap(taskApiCallbackWrapper.a().getTaskApiCall().getTransactionId(), this);
            this.f14014a.add(taskApiCallbackWrapper);
            String uri = taskApiCallbackWrapper.a().getTaskApiCall().getUri();
            String packageName = (((HuaweiApi) this.f14017d).f13999c == null ? this.f14017d.getContext() : ((HuaweiApi) this.f14017d).f13999c).getPackageName();
            if (((HuaweiApi) this.f14017d).f13999c != null) {
                HuaweiApi<OptionsT> huaweiApi = this.f14017d;
                huaweiApi.b(((HuaweiApi) huaweiApi).f13999c);
            }
            final RequestHeader requestHeader = new RequestHeader();
            requestHeader.setSrvName(uri.split("\\.")[0]);
            requestHeader.setApiName(uri);
            requestHeader.setAppID(this.f14017d.getAppID() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + this.f14017d.getSubAppID());
            requestHeader.setPkgName(packageName);
            requestHeader.setSessionId(this.f14015b.getSessionId());
            TaskApiCall taskApiCall = taskApiCallbackWrapper.a().getTaskApiCall();
            requestHeader.setTransactionId(a(taskApiCall.getTransactionId(), uri));
            requestHeader.setParcelable(taskApiCall.getParcelable());
            requestHeader.setKitSdkVersion(this.f14017d.getKitSdkVersion());
            requestHeader.setApiLevel(Math.max(this.f14017d.getApiLevel(), taskApiCall.getApiLevel()));
            this.f14015b.post(requestHeader, taskApiCall.getRequestJson(), new AnyClient.CallBack() { // from class: com.huawei.hms.common.HuaweiApi.RequestHandler.2
                @Override // com.huawei.hms.common.internal.AnyClient.CallBack
                public void onCallback(IMessageEntity iMessageEntity, String str) {
                    AnyClient.CallBack b4 = taskApiCallbackWrapper.b();
                    if (b4 != null) {
                        b4.onCallback(iMessageEntity, str);
                    }
                    RequestManager.removeReqByTransId(requestHeader.getTransactionId());
                    RequestManager.getHandler().post(new Runnable() { // from class: com.huawei.hms.common.HuaweiApi.RequestHandler.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            RequestHandler.this.f14014a.remove(taskApiCallbackWrapper);
                        }
                    });
                }
            });
        }

        private TaskApiCallbackWrapper b(final TaskApiCallWrapper taskApiCallWrapper) {
            return new TaskApiCallbackWrapper(taskApiCallWrapper, new AnyClient.CallBack() { // from class: com.huawei.hms.common.HuaweiApi.RequestHandler.1

                /* renamed from: a, reason: collision with root package name */
                private AtomicBoolean f14019a = new AtomicBoolean(true);

                @Override // com.huawei.hms.common.internal.AnyClient.CallBack
                public void onCallback(IMessageEntity iMessageEntity, String str) {
                    if (!(iMessageEntity instanceof ResponseHeader)) {
                        HMSLog.e("HuaweiApi", "header is not instance of ResponseHeader");
                        return;
                    }
                    ResponseHeader responseHeader = (ResponseHeader) iMessageEntity;
                    if (responseHeader.getErrorCode() == 11) {
                        RequestHandler.this.a();
                        HMSLog.i("HuaweiApi", "unbind service");
                    }
                    if (!TextUtils.isEmpty(responseHeader.getResolution())) {
                        HMSLog.e("HuaweiApi", "Response has resolution: " + responseHeader.getResolution());
                    }
                    if (this.f14019a.compareAndSet(true, false)) {
                        HiAnalyticsInnerClient.reportEntryExit(RequestHandler.this.f14017d.getContext(), responseHeader, String.valueOf(RequestHandler.this.f14017d.getKitSdkVersion()));
                    }
                    taskApiCallWrapper.getTaskApiCall().onResponse(RequestHandler.this.f14015b, responseHeader, str, taskApiCallWrapper.getTaskCompletionSource());
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c() {
            HMSLog.i("HuaweiApi", "wait queue size = " + this.callbackWaitQueue.size());
            HMSLog.i("HuaweiApi", "run queue size = " + this.f14014a.size());
            Iterator<TaskApiCallbackWrapper> it = this.callbackWaitQueue.iterator();
            while (it.hasNext()) {
                a(it.next());
            }
            Iterator<TaskApiCallbackWrapper> it2 = this.f14014a.iterator();
            while (it2.hasNext()) {
                a(it2.next());
            }
            this.callbackWaitQueue.clear();
            this.f14014a.clear();
            this.f14016c = null;
            this.f14015b.disconnect();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(ConnectionResult connectionResult) {
            this.f14016c = connectionResult;
            Iterator<TaskApiCallbackWrapper> it = this.callbackWaitQueue.iterator();
            boolean z4 = true;
            while (it.hasNext()) {
                TaskApiCallWrapper a4 = it.next().a();
                ResponseHeader responseHeader = new ResponseHeader(1, CommonCode.ErrorCode.CLIENT_API_INVALID, "Connection Failed:" + a(connectionResult) + "(" + connectionResult.getErrorCode() + ")");
                responseHeader.setTransactionId(a4.getTaskApiCall().getTransactionId());
                HiAnalyticsInnerClient.reportEntryExit(this.f14017d.getContext(), responseHeader, String.valueOf(this.f14017d.getKitSdkVersion()));
                if (this.f14016c.getResolution() != null && z4) {
                    responseHeader.setParcelable(this.f14016c.getResolution());
                    if (Util.isAvailableLibExist(this.f14017d.getContext()) && this.f14016c.getErrorCode() == 26) {
                        responseHeader.setResolution(CommonCode.Resolution.HAS_RESOLUTION);
                    }
                    z4 = false;
                }
                int errorCode = this.f14016c.getErrorCode();
                if (errorCode == 30 || errorCode == 31) {
                    responseHeader.setErrorCode(errorCode);
                }
                a4.getTaskApiCall().onResponse(this.f14015b, responseHeader, null, a4.getTaskCompletionSource());
            }
            this.callbackWaitQueue.clear();
            this.f14014a.clear();
            this.f14016c = null;
            this.f14015b.disconnect();
        }

        void a(TaskApiCallWrapper taskApiCallWrapper) {
            HMSLog.i("HuaweiApi", "sendRequest");
            TaskApiCallbackWrapper b4 = b(taskApiCallWrapper);
            if (HMSPackageManager.getInstance(this.f14017d.getContext()).isUpdateHmsForThirdPartyDevice()) {
                this.f14015b.disconnect();
            }
            int hmsVersionCode = HMSPackageManager.getInstance(((HuaweiApi) this.f14017d).f13997a).getHmsVersionCode();
            if (hmsVersionCode < 40000000 && hmsVersionCode > 0 && this.f14015b.isConnected() && !((HuaweiApi) this.f14017d).f14009m && ((BaseHmsClient) this.f14015b).getAdapter().getServiceAction().equals("com.huawei.hms.core.aidlservice")) {
                int requestHmsVersionCode = this.f14015b.getRequestHmsVersionCode();
                if (requestHmsVersionCode <= taskApiCallWrapper.getTaskApiCall().getMinApkVersion()) {
                    requestHmsVersionCode = taskApiCallWrapper.getTaskApiCall().getMinApkVersion();
                }
                if (requestHmsVersionCode > hmsVersionCode) {
                    this.f14015b.disconnect();
                }
            }
            if (this.f14015b.isConnected()) {
                HMSLog.i("HuaweiApi", "isConnected:true.");
                BinderAdapter adapter = ((BaseHmsClient) this.f14015b).getAdapter();
                adapter.updateDelayTask();
                ((HmsClient) this.f14015b).setService(IAIDLInvoke.Stub.asInterface(adapter.getServiceBinder()));
                postMessage(b4);
                return;
            }
            HMSLog.i("HuaweiApi", "isConnected:false.");
            this.callbackWaitQueue.add(b4);
            ConnectionResult connectionResult = this.f14016c;
            if (connectionResult != null && connectionResult.getErrorCode() != 0) {
                HMSLog.i("HuaweiApi", "onConnectionFailed, ErrorCode:" + this.f14016c.getErrorCode());
                onConnectionFailed(this.f14016c);
                return;
            }
            RequestManager.addRequestToQueue(this);
            Object obj = this.f14015b;
            if (obj instanceof BaseHmsClient) {
                ((BaseHmsClient) obj).setInternalRequest(this);
            }
            a(taskApiCallWrapper.getTaskApiCall().getMinApkVersion(), b4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b() {
            this.f14016c = null;
            this.f14014a.clear();
            Iterator<TaskApiCallbackWrapper> it = this.callbackWaitQueue.iterator();
            while (it.hasNext()) {
                postMessage(it.next());
            }
            this.callbackWaitQueue.clear();
        }

        private String a(String str, String str2) {
            return TextUtils.isEmpty(str) ? TransactionIdCreater.getId(this.f14017d.getAppID(), str2) : str;
        }

        synchronized void a(int i4, TaskApiCallbackWrapper taskApiCallbackWrapper) {
            if (this.f14015b.isConnected()) {
                HMSLog.d("HuaweiApi", "client is connected");
                return;
            }
            if (this.f14015b.isConnecting()) {
                HMSLog.d("HuaweiApi", "client is isConnecting");
                return;
            }
            if (this.f14017d.getActivity() != null) {
                if (this.f14018e == null) {
                    this.f14018e = new ResolveClientBean(this.f14015b, i4);
                }
                if (BindResolveClients.getInstance().isClientRegistered(this.f14018e)) {
                    HMSLog.i("HuaweiApi", "mResolveClientBean has already register, return!");
                    return;
                }
                BindResolveClients.getInstance().register(this.f14018e);
            }
            this.f14015b.connect(i4);
        }

        void a() {
            this.f14015b.disconnect();
        }

        private void a(TaskApiCallbackWrapper taskApiCallbackWrapper) {
            TaskApiCallWrapper a4 = taskApiCallbackWrapper.a();
            ResponseHeader responseHeader = new ResponseHeader(1, CommonCode.ErrorCode.CLIENT_API_INVALID, "Connection Suspended");
            responseHeader.setTransactionId(a4.getTaskApiCall().getTransactionId());
            a4.getTaskApiCall().onResponse(this.f14015b, responseHeader, null, a4.getTaskCompletionSource());
        }

        private String a(ConnectionResult connectionResult) {
            if (Util.isAvailableLibExist(this.f14017d.getContext())) {
                int errorCode = connectionResult.getErrorCode();
                if (errorCode == -1) {
                    return "get update result, but has other error codes";
                }
                if (errorCode == 3) {
                    return "HuaWei Mobile Service is disabled";
                }
                if (errorCode == 8) {
                    return "internal error";
                }
                if (errorCode == 10) {
                    return "application configuration error, please developer check configuration";
                }
                if (errorCode == 13) {
                    return "update cancelled";
                }
                if (errorCode != 21) {
                    switch (errorCode) {
                        case 25:
                            return "failed to get update result";
                        case 26:
                            return "update failed, because no activity incoming, can't pop update page";
                        case 27:
                            return "there is already an update popup at the front desk, but it hasn't been clicked or it is not effective for a while";
                        default:
                            return "unknown errorReason";
                    }
                }
                return "device is too old to be support";
            }
            int errorCode2 = connectionResult.getErrorCode();
            return errorCode2 != -1 ? errorCode2 != 8 ? errorCode2 != 10 ? "unknown errorReason" : "application configuration error, please developer check configuration" : "internal error" : "get update result, but has other error codes";
        }
    }

    public static class TaskApiCallbackWrapper {

        /* renamed from: a, reason: collision with root package name */
        private final TaskApiCallWrapper f14030a;

        /* renamed from: b, reason: collision with root package name */
        private final AnyClient.CallBack f14031b;

        TaskApiCallbackWrapper(TaskApiCallWrapper taskApiCallWrapper, AnyClient.CallBack callBack) {
            this.f14030a = taskApiCallWrapper;
            this.f14031b = callBack;
        }

        TaskApiCallWrapper a() {
            return this.f14030a;
        }

        AnyClient.CallBack b() {
            return this.f14031b;
        }
    }

    private static class a<OptionsT extends Api.ApiOptions> implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final HuaweiApi<OptionsT> f14032a;

        /* renamed from: b, reason: collision with root package name */
        private final TaskApiCallWrapper f14033b;

        public a(HuaweiApi<OptionsT> huaweiApi, TaskApiCallWrapper taskApiCallWrapper) {
            this.f14032a = huaweiApi;
            this.f14033b = taskApiCallWrapper;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0056 A[ADDED_TO_REGION] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private void a(RequestHandler requestHandler, Throwable th) {
            Throwable th2;
            AnyClient anyClient;
            String str;
            ResponseHeader responseHeader;
            j jVar;
            TaskApiCall taskApiCall = null;
            try {
                anyClient = requestHandler.getClient();
                try {
                    responseHeader = new ResponseHeader(1, CommonCode.ErrorCode.INTERNAL_ERROR, th.getMessage());
                    try {
                        str = new JSONObject().toString();
                        try {
                            jVar = this.f14033b.getTaskCompletionSource();
                            try {
                                taskApiCall = this.f14033b.getTaskApiCall();
                            } catch (Throwable th3) {
                                th2 = th3;
                                HMSLog.e("HuaweiApi", "<notifyCpException> " + th2.getMessage());
                                if (anyClient != null) {
                                }
                                HMSLog.e("HuaweiApi", "<notifyCpException> isNotify is false, Can not notify CP.");
                            }
                        } catch (Throwable th4) {
                            th2 = th4;
                            jVar = null;
                        }
                    } catch (Throwable th5) {
                        th2 = th5;
                        str = null;
                        jVar = null;
                    }
                } catch (Throwable th6) {
                    th2 = th6;
                    str = null;
                    responseHeader = null;
                    jVar = null;
                    HMSLog.e("HuaweiApi", "<notifyCpException> " + th2.getMessage());
                    if (anyClient != null) {
                    }
                    HMSLog.e("HuaweiApi", "<notifyCpException> isNotify is false, Can not notify CP.");
                }
            } catch (Throwable th7) {
                th2 = th7;
                anyClient = null;
            }
            if (anyClient != null || responseHeader == null || str == null || jVar == null || taskApiCall == null) {
                HMSLog.e("HuaweiApi", "<notifyCpException> isNotify is false, Can not notify CP.");
            } else {
                taskApiCall.onResponse(anyClient, responseHeader, str, jVar);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            RequestHandler requestHandler = new RequestHandler(this.f14032a);
            try {
                requestHandler.a(this.f14033b);
            } catch (Throwable th) {
                HMSLog.e("HuaweiApi", "sendRequest has exception", th);
                a(requestHandler, th);
            }
        }
    }

    public HuaweiApi(Activity activity, Api<TOption> api, TOption toption, AbstractClientBuilder abstractClientBuilder, int i4) {
        Checker.checkNonNull(activity, "Null activity is not permitted.");
        this.f14004h = new WeakReference<>(activity);
        a(activity, api, toption, abstractClientBuilder, i4, null);
    }

    @Deprecated
    public i disconnectService() {
        final j jVar = new j();
        RequestManager.getInstance();
        RequestManager.getHandler().post(new Runnable() { // from class: com.huawei.hms.common.HuaweiApi.1
            @Override // java.lang.Runnable
            public void run() {
                HuaweiApi.this.a((HuaweiApi<?>) this, jVar);
            }
        });
        return jVar.a();
    }

    public <TResult, TClient extends AnyClient> i doWrite(TaskApiCall<TClient, TResult> taskApiCall) {
        this.f14007k = true;
        if (taskApiCall == null) {
            HMSLog.e("HuaweiApi", "in doWrite:taskApiCall is null");
            j jVar = new j();
            jVar.b(new ApiException(Status.FAILURE));
            return jVar.a();
        }
        HiAnalyticsInnerClient.reportEntryClient(this.f13997a, taskApiCall.getUri(), TextUtils.isEmpty(this.f14003g.getSubAppID()) ? this.f14002f : this.f14003g.getSubAppID(), taskApiCall.getTransactionId(), String.valueOf(getKitSdkVersion()));
        if (this.f14010n == null) {
            this.f14010n = RequestManager.getInstance();
        }
        return a(taskApiCall);
    }

    public Activity getActivity() {
        WeakReference<Activity> weakReference = this.f14004h;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public int getApiLevel() {
        return this.f14006j;
    }

    public String getAppID() {
        return this.f14002f;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [com.huawei.hms.common.internal.AnyClient] */
    public AnyClient getClient(Looper looper, RequestHandler requestHandler) {
        return this.f14000d.buildClient(this.f13997a, getClientSetting(), requestHandler, requestHandler);
    }

    protected ClientSettings getClientSetting() {
        ClientSettings clientSettings = new ClientSettings(this.f13997a.getPackageName(), this.f13997a.getClass().getName(), getScopes(), this.f14001e, null, this.f14003g);
        if (!this.f14009m) {
            String hMSPackageNameForMultiService = HMSPackageManager.getInstance(this.f13997a).getHMSPackageNameForMultiService();
            if (TextUtils.isEmpty(hMSPackageNameForMultiService)) {
                hMSPackageNameForMultiService = "com.huawei.hwid";
            }
            this.f14008l = hMSPackageNameForMultiService;
            HMSLog.i("HuaweiApi", "No setInnerHms, hms pkg name is " + this.f14008l);
        }
        clientSettings.setInnerHmsPkg(this.f14008l);
        clientSettings.setUseInnerHms(this.f14009m);
        WeakReference<Activity> weakReference = this.f14004h;
        if (weakReference != null) {
            clientSettings.setCpActivity(weakReference.get());
        }
        return clientSettings;
    }

    public Context getContext() {
        return this.f13997a;
    }

    public int getKitSdkVersion() {
        return this.f14005i;
    }

    public TOption getOption() {
        return this.f13998b;
    }

    protected List<Scope> getScopes() {
        return Collections.EMPTY_LIST;
    }

    public String getSubAppID() {
        return this.f14003g.getSubAppID();
    }

    public void setApiLevel(int i4) {
        this.f14006j = i4;
    }

    public void setHostContext(Context context) {
        this.f13999c = context;
    }

    public void setInnerHms() {
        this.f14008l = this.f13997a.getPackageName();
        this.f14009m = true;
        HMSLog.i("HuaweiApi", "<setInnerHms> init inner hms pkg info:" + this.f14008l);
    }

    public void setKitSdkVersion(int i4) {
        this.f14005i = i4;
    }

    public void setSubAppId(String str) {
        if (!setSubAppInfo(new SubAppInfo(str))) {
            throw new ApiException(Status.FAILURE);
        }
    }

    @Deprecated
    public boolean setSubAppInfo(SubAppInfo subAppInfo) {
        HMSLog.i("HuaweiApi", "Enter setSubAppInfo");
        SubAppInfo subAppInfo2 = this.f14003g;
        if (subAppInfo2 != null && !TextUtils.isEmpty(subAppInfo2.getSubAppID())) {
            HMSLog.e("HuaweiApi", "subAppInfo is already set");
            return false;
        }
        if (subAppInfo == null) {
            HMSLog.e("HuaweiApi", "subAppInfo is null");
            return false;
        }
        String subAppID = subAppInfo.getSubAppID();
        if (TextUtils.isEmpty(subAppID)) {
            HMSLog.e("HuaweiApi", "subAppId is empty");
            return false;
        }
        if (subAppID.equals(this.f14001e)) {
            HMSLog.e("HuaweiApi", "subAppId is host appid");
            return false;
        }
        if (this.f14007k) {
            HMSLog.e("HuaweiApi", "Client has sent request to Huawei Mobile Services, setting subAppId is not allowed");
            return false;
        }
        this.f14003g = new SubAppInfo(subAppInfo);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Context context) {
        String appId = Util.getAppId(context);
        this.f14001e = appId;
        this.f14002f = appId;
    }

    private void a(Context context, Api<TOption> api, TOption toption, AbstractClientBuilder abstractClientBuilder, int i4, String str) {
        this.f13997a = context.getApplicationContext();
        this.f13998b = toption;
        this.f14000d = abstractClientBuilder;
        b(context);
        this.f14003g = new SubAppInfo("");
        this.f14005i = i4;
        if (!TextUtils.isEmpty(str)) {
            if (str.equals(this.f14001e)) {
                HMSLog.e("HuaweiApi", "subAppId is host appid");
            } else {
                HMSLog.i("HuaweiApi", "subAppId is " + str);
                this.f14003g = new SubAppInfo(str);
            }
        }
        a(context);
        if (Util.isAvailableLibExist(context)) {
            AvailableUtil.asyncCheckHmsUpdateInfo(context);
        }
    }

    public HuaweiApi(Activity activity, Api<TOption> api, TOption toption, AbstractClientBuilder abstractClientBuilder, int i4, String str) {
        Checker.checkNonNull(activity, "Null activity is not permitted.");
        this.f14004h = new WeakReference<>(activity);
        a(activity, api, toption, abstractClientBuilder, i4, str);
    }

    public HuaweiApi(Activity activity, Api<TOption> api, TOption toption, AbstractClientBuilder abstractClientBuilder) {
        Checker.checkNonNull(activity, "Null activity is not permitted.");
        this.f14004h = new WeakReference<>(activity);
        a(activity, api, toption, abstractClientBuilder, 0, null);
    }

    private void a(Context context) {
        HMSBIInitializer.getInstance(context).initBI();
    }

    public HuaweiApi(Context context, Api<TOption> api, TOption toption, AbstractClientBuilder abstractClientBuilder, int i4) {
        Checker.checkNonNull(context, "Null context is not permitted.");
        a(context, api, toption, abstractClientBuilder, i4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(HuaweiApi<?> huaweiApi, j jVar) {
        HMSLog.i("HuaweiApi", "innerDisconnect.");
        try {
            huaweiApi.getClient(RequestManager.getHandler().getLooper(), null).disconnect();
            jVar.c(Boolean.TRUE);
        } catch (Exception e4) {
            HMSLog.w("HuaweiApi", "disconnect the binder failed for:" + e4.getMessage());
        }
    }

    public HuaweiApi(Context context, Api<TOption> api, TOption toption, AbstractClientBuilder abstractClientBuilder, int i4, String str) {
        Checker.checkNonNull(context, "Null context is not permitted.");
        a(context, api, toption, abstractClientBuilder, i4, str);
    }

    private <TResult, TClient extends AnyClient> i a(TaskApiCall<TClient, TResult> taskApiCall) {
        taskApiCall.getToken();
        j jVar = new j();
        RequestManager.getHandler().post(new a(this, new TaskApiCallWrapper(taskApiCall, jVar)));
        return jVar.a();
    }

    public HuaweiApi(Context context, Api<TOption> api, TOption toption, AbstractClientBuilder abstractClientBuilder) {
        Checker.checkNonNull(context, "Null context is not permitted.");
        a(context, api, toption, abstractClientBuilder, 0, null);
    }
}
