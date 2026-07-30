package com.baidu.ar.base;

import android.content.Context;
import android.text.TextUtils;
import com.baidu.ar.ARController;
import com.baidu.ar.DuMixSource;
import com.baidu.ar.baidumap.MapDuMix;
import com.baidu.ar.bean.ARConfig;
import com.baidu.ar.m9;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class RequestController {

    /* renamed from: a, reason: collision with root package name */
    public MapDuMix f1838a;

    /* renamed from: b, reason: collision with root package name */
    public Context f1839b;

    /* renamed from: c, reason: collision with root package name */
    public DuMixSource f1840c;

    /* renamed from: d, reason: collision with root package name */
    public WeakReference<ARController> f1841d;

    public RequestController(Context context, ARController aRController, DuMixSource duMixSource) {
        this.f1839b = context;
        this.f1841d = new WeakReference<>(aRController);
        this.f1840c = duMixSource;
        if (this.f1838a == null && aRController != null) {
            this.f1838a = aRController.getMapDuMix();
        }
        DuMixSource duMixSource2 = this.f1840c;
        if (duMixSource2 != null) {
            ARConfig.setARKey(duMixSource2.getArKey());
        }
    }

    public void start() {
        if (TextUtils.isEmpty(ARConfig.getARKey())) {
            if (this.f1841d.get() != null) {
                this.f1841d.get().outputStateMessage(MsgField.MSG_NO_NETWORK_FOR_START_QUERY_RES, this);
            }
        } else if (!m9.e(this.f1839b)) {
            if (this.f1841d.get() != null) {
                this.f1841d.get().outputStateMessage(MsgField.MSG_NO_NETWORK_FOR_START_QUERY_RES, this);
            }
        } else if (m9.f(this.f1839b)) {
            startRequest();
        } else {
            if (!m9.d(this.f1839b) || this.f1841d.get() == null) {
                return;
            }
            this.f1841d.get().outputStateMessage(MsgField.MSG_MOBILE_NETWORK_FOR_START_QUERY_RES, this);
        }
    }

    public void startRequest() {
        this.f1838a.loadCase(this.f1840c.getArKey());
    }
}
