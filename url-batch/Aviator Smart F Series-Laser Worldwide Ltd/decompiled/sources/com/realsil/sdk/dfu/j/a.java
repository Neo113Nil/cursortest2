package com.realsil.sdk.dfu.j;

import android.content.Context;
import com.realsil.sdk.core.logger.ZLogger;
import com.realsil.sdk.dfu.internal.base.BaseDfuTask;
import com.realsil.sdk.dfu.internal.base.DfuThreadCallback;
import com.realsil.sdk.dfu.model.DfuConfig;
import com.realsil.sdk.dfu.p.e;
import com.realsil.sdk.dfu.p.f;
import com.realsil.sdk.dfu.s.g;
import com.realsil.sdk.dfu.s.i;
import com.realsil.sdk.dfu.v.d;
import com.realsil.sdk.dfu.x.m;
import com.realsil.sdk.dfu.x.o;
import com.realsil.sdk.dfu.x.p;
import com.realsil.sdk.dfu.x.q;

/* loaded from: classes4.dex */
public abstract class a {
    public static BaseDfuTask a(Context context, DfuConfig dfuConfig, DfuThreadCallback dfuThreadCallback) {
        StringBuilder sb;
        ZLogger.v("dfuTask:" + dfuConfig.toString());
        if (dfuConfig.getProtocolType() == 16) {
            return (dfuConfig.getOtaWorkMode() == 16 || dfuConfig.getOtaWorkMode() == 21 || dfuConfig.getOtaWorkMode() == 23) ? new g(context, dfuConfig, dfuThreadCallback) : new i(context, dfuConfig, dfuThreadCallback);
        }
        if (dfuConfig.getProtocolType() == 20) {
            return dfuConfig.getOtaWorkMode() == 16 ? new f(context, dfuConfig, dfuThreadCallback) : new e(context, dfuConfig, dfuThreadCallback);
        }
        if (dfuConfig.getProtocolType() == 21) {
            return dfuConfig.getOtaWorkMode() == 16 ? new com.realsil.sdk.dfu.q.f(context, dfuConfig, dfuThreadCallback) : new com.realsil.sdk.dfu.q.e(context, dfuConfig, dfuThreadCallback);
        }
        if (dfuConfig.getProtocolType() == 17) {
            if (dfuConfig.getChannelType() == 1) {
                return dfuConfig.getOtaWorkMode() == 19 ? new o(context, dfuConfig, dfuThreadCallback) : dfuConfig.getOtaWorkMode() == 21 ? new p(context, dfuConfig, dfuThreadCallback) : dfuConfig.getOtaWorkMode() == 23 ? new q(context, dfuConfig, dfuThreadCallback) : new m(context, dfuConfig, dfuThreadCallback);
            }
            sb = new StringBuilder();
        } else {
            if (dfuConfig.getProtocolType() == 22) {
                return dfuConfig.getOtaWorkMode() == 16 ? new d(context, dfuConfig, dfuThreadCallback) : new com.realsil.sdk.dfu.v.f(context, dfuConfig, dfuThreadCallback);
            }
            if (dfuConfig.getProtocolType() == 18) {
                return dfuConfig.getOtaWorkMode() == 16 ? new com.realsil.sdk.dfu.n.g(context, dfuConfig, dfuThreadCallback) : new com.realsil.sdk.dfu.n.f(context, dfuConfig, dfuThreadCallback);
            }
            if (dfuConfig.getProtocolType() == 19) {
                if (dfuConfig.getOtaWorkMode() != 0 && dfuConfig.getOtaWorkMode() == 16) {
                    return new com.realsil.sdk.dfu.o.d(context, dfuConfig, dfuThreadCallback);
                }
                return new com.realsil.sdk.dfu.o.c(context, dfuConfig, dfuThreadCallback);
            }
            if (dfuConfig.getChannelType() == 0) {
                return dfuConfig.getOtaWorkMode() == 0 ? new com.realsil.sdk.dfu.r.c(context, dfuConfig, dfuThreadCallback) : dfuConfig.getOtaWorkMode() == 17 ? new com.realsil.sdk.dfu.r.e(context, dfuConfig, dfuThreadCallback) : dfuConfig.getOtaWorkMode() == 16 ? new com.realsil.sdk.dfu.r.d(context, dfuConfig, dfuThreadCallback) : dfuConfig.getOtaWorkMode() == 18 ? new com.realsil.sdk.dfu.r.f(context, dfuConfig, dfuThreadCallback) : new com.realsil.sdk.dfu.r.c(context, dfuConfig, dfuThreadCallback);
            }
            if (dfuConfig.getChannelType() == 1) {
                return new com.realsil.sdk.dfu.w.c(context, dfuConfig, dfuThreadCallback);
            }
            if (dfuConfig.getChannelType() == 2) {
                return new com.realsil.sdk.dfu.y.d(context, dfuConfig, dfuThreadCallback);
            }
            sb = new StringBuilder();
        }
        sb.append("unknown channel:");
        sb.append(dfuConfig.getChannelType());
        ZLogger.d(sb.toString());
        return null;
    }
}
