package com.huawei.hms.adapter;

import android.content.Context;
import com.huawei.hms.common.internal.Objects;
import com.huawei.hms.support.log.HMSLog;

/* loaded from: classes.dex */
public class OuterBinderAdapter extends BinderAdapter {

    /* renamed from: j, reason: collision with root package name */
    private static final Object f13850j = new Object();

    /* renamed from: k, reason: collision with root package name */
    private static BinderAdapter f13851k;

    /* renamed from: l, reason: collision with root package name */
    private static String f13852l;

    /* renamed from: m, reason: collision with root package name */
    private static String f13853m;

    private OuterBinderAdapter(Context context, String str, String str2) {
        super(context, str, str2);
    }

    public static BinderAdapter getInstance(Context context, String str, String str2) {
        BinderAdapter binderAdapter;
        HMSLog.i("OuterBinderAdapter", "OuterBinderAdapter getInstance.");
        synchronized (f13850j) {
            try {
                if (f13851k == null) {
                    f13852l = str;
                    f13853m = str2;
                    f13851k = new OuterBinderAdapter(context, str, str2);
                } else if (!Objects.equal(f13852l, str) || !Objects.equal(f13853m, str2)) {
                    HMSLog.i("OuterBinderAdapter", "OuterBinderAdapter getInstance refresh adapter");
                    f13852l = str;
                    f13853m = str2;
                    f13851k.unBind();
                    f13851k = new OuterBinderAdapter(context, str, str2);
                }
                binderAdapter = f13851k;
            } catch (Throwable th) {
                throw th;
            }
        }
        return binderAdapter;
    }

    @Override // com.huawei.hms.adapter.BinderAdapter
    protected int getConnTimeOut() {
        return 1001;
    }

    @Override // com.huawei.hms.adapter.BinderAdapter
    protected int getMsgDelayDisconnect() {
        return 1002;
    }
}
