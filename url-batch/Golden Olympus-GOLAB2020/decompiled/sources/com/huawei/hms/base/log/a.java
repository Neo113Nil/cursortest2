package com.huawei.hms.base.log;

import android.content.Context;
import com.huawei.hms.support.log.HMSExtLogger;

/* loaded from: classes.dex */
public class a implements d {

    /* renamed from: a, reason: collision with root package name */
    private final HMSExtLogger f13974a;

    /* renamed from: b, reason: collision with root package name */
    private d f13975b;

    public a(HMSExtLogger hMSExtLogger) {
        this.f13974a = hMSExtLogger;
    }

    @Override // com.huawei.hms.base.log.d
    public void a(Context context, String str) {
        d dVar = this.f13975b;
        if (dVar != null) {
            dVar.a(context, str);
        }
    }

    @Override // com.huawei.hms.base.log.d
    public void a(d dVar) {
        this.f13975b = dVar;
    }

    @Override // com.huawei.hms.base.log.d
    public void a(String str, int i4, String str2, String str3) {
        HMSExtLogger hMSExtLogger = this.f13974a;
        if (hMSExtLogger != null) {
            if (i4 == 3) {
                hMSExtLogger.d(str2, str3);
            } else if (i4 == 4) {
                hMSExtLogger.i(str2, str3);
            } else if (i4 != 5) {
                hMSExtLogger.e(str2, str3);
            } else {
                hMSExtLogger.w(str2, str3);
            }
        }
        d dVar = this.f13975b;
        if (dVar != null) {
            dVar.a(str, i4, str2, str3);
        }
    }
}
