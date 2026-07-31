package com.huawei.hms.adapter;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.huawei.hms.activity.BridgeActivity;
import com.huawei.hms.api.BindingFailedResolution;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.Util;

/* loaded from: classes.dex */
public class BinderAdapter implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    private final Context f13837a;

    /* renamed from: b, reason: collision with root package name */
    private final String f13838b;

    /* renamed from: c, reason: collision with root package name */
    private final String f13839c;

    /* renamed from: d, reason: collision with root package name */
    private BinderCallBack f13840d;

    /* renamed from: e, reason: collision with root package name */
    private IBinder f13841e;

    /* renamed from: f, reason: collision with root package name */
    private final Object f13842f = new Object();

    /* renamed from: g, reason: collision with root package name */
    private boolean f13843g = false;

    /* renamed from: h, reason: collision with root package name */
    private Handler f13844h = null;

    /* renamed from: i, reason: collision with root package name */
    private Handler f13845i = null;

    public interface BinderCallBack {
        void onBinderFailed(int i4);

        void onBinderFailed(int i4, Intent intent);

        void onNullBinding(ComponentName componentName);

        void onServiceConnected(ComponentName componentName, IBinder iBinder);

        void onServiceDisconnected(ComponentName componentName);

        void onTimedDisconnected();
    }

    public BinderAdapter(Context context, String str, String str2) {
        this.f13837a = context;
        this.f13838b = str;
        this.f13839c = str2;
    }

    private void c() {
        synchronized (this.f13842f) {
            try {
                Handler handler = this.f13844h;
                if (handler != null) {
                    handler.removeMessages(getConnTimeOut());
                    this.f13844h = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void d() {
        Handler handler = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.huawei.hms.adapter.BinderAdapter.2
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                if (message == null || message.what != BinderAdapter.this.getMsgDelayDisconnect()) {
                    return false;
                }
                HMSLog.i("BinderAdapter", "The serviceConnection has been bind for 1800s, need to unbind.");
                BinderAdapter.this.unBind();
                BinderCallBack f4 = BinderAdapter.this.f();
                if (f4 == null) {
                    return true;
                }
                f4.onTimedDisconnected();
                return true;
            }
        });
        this.f13845i = handler;
        handler.sendEmptyMessageDelayed(getMsgDelayDisconnect(), 1800000L);
    }

    private void e() {
        HMSLog.e("BinderAdapter", "In connect, bind core service fail");
        try {
            ComponentName componentName = new ComponentName(this.f13837a.getApplicationInfo().packageName, "com.huawei.hms.activity.BridgeActivity");
            Intent intent = new Intent();
            intent.setComponent(componentName);
            intent.putExtra(BridgeActivity.EXTRA_DELEGATE_CLASS_NAME, BindingFailedResolution.class.getName());
            BinderCallBack f4 = f();
            if (f4 != null) {
                f4.onBinderFailed(-1, intent);
            }
        } catch (RuntimeException e4) {
            HMSLog.e("BinderAdapter", "getBindFailPendingIntent failed " + e4.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public BinderCallBack f() {
        return this.f13840d;
    }

    private void g() {
        Handler handler = this.f13844h;
        if (handler != null) {
            handler.removeMessages(getConnTimeOut());
        } else {
            this.f13844h = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.huawei.hms.adapter.BinderAdapter.1
                @Override // android.os.Handler.Callback
                public boolean handleMessage(Message message) {
                    if (message == null || message.what != BinderAdapter.this.getConnTimeOut()) {
                        return false;
                    }
                    HMSLog.e("BinderAdapter", "In connect, bind core service time out");
                    BinderAdapter.this.b();
                    return true;
                }
            });
        }
        this.f13844h.sendEmptyMessageDelayed(getConnTimeOut(), 10000L);
    }

    private void h() {
        HMSLog.d("BinderAdapter", "removeDelayDisconnectTask.");
        synchronized (BinderAdapter.class) {
            try {
                Handler handler = this.f13845i;
                if (handler != null) {
                    handler.removeMessages(getMsgDelayDisconnect());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void binder(BinderCallBack binderCallBack) {
        if (binderCallBack == null) {
            return;
        }
        this.f13840d = binderCallBack;
        a();
    }

    protected int getConnTimeOut() {
        return 0;
    }

    protected int getMsgDelayDisconnect() {
        return 0;
    }

    public String getServiceAction() {
        return this.f13838b;
    }

    public IBinder getServiceBinder() {
        return this.f13841e;
    }

    @Override // android.content.ServiceConnection
    public void onNullBinding(ComponentName componentName) {
        HMSLog.e("BinderAdapter", "Enter onNullBinding, than unBind.");
        if (this.f13843g) {
            this.f13843g = false;
            return;
        }
        unBind();
        c();
        BinderCallBack f4 = f();
        if (f4 != null) {
            f4.onNullBinding(componentName);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        HMSLog.i("BinderAdapter", "BinderAdapter Enter onServiceConnected.");
        this.f13841e = iBinder;
        c();
        BinderCallBack f4 = f();
        if (f4 != null) {
            f4.onServiceConnected(componentName, iBinder);
        }
        d();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        HMSLog.i("BinderAdapter", "Enter onServiceDisconnected.");
        BinderCallBack f4 = f();
        if (f4 != null) {
            f4.onServiceDisconnected(componentName);
        }
        h();
    }

    public void unBind() {
        Util.unBindServiceCatchException(this.f13837a, this);
    }

    public void updateDelayTask() {
        HMSLog.d("BinderAdapter", "updateDelayTask.");
        synchronized (BinderAdapter.class) {
            try {
                Handler handler = this.f13845i;
                if (handler != null) {
                    handler.removeMessages(getMsgDelayDisconnect());
                    this.f13845i.sendEmptyMessageDelayed(getMsgDelayDisconnect(), 1800000L);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void a() {
        if (TextUtils.isEmpty(this.f13838b) || TextUtils.isEmpty(this.f13839c)) {
            e();
        }
        Intent intent = new Intent(this.f13838b);
        try {
            intent.setPackage(this.f13839c);
        } catch (IllegalArgumentException unused) {
            HMSLog.e("BinderAdapter", "IllegalArgumentException when bindCoreService intent.setPackage");
            e();
        }
        synchronized (this.f13842f) {
            try {
                if (this.f13837a.bindService(intent, this, 1)) {
                    g();
                } else {
                    this.f13843g = true;
                    e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        BinderCallBack f4 = f();
        if (f4 != null) {
            f4.onBinderFailed(-1);
        }
    }
}
