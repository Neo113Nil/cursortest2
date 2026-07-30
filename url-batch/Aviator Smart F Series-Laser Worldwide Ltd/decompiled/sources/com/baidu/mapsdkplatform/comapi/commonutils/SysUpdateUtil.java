package com.baidu.mapsdkplatform.comapi.commonutils;

import android.content.Context;
import android.text.TextUtils;
import com.baidu.mapapi.NetworkUtil;
import com.baidu.mapapi.common.SysOSUtil;
import com.baidu.mapsdkplatform.comapi.util.SyncSysInfo;
import com.baidu.mapsdkplatform.comapi.util.SysUpdateObserver;
import com.baidu.platform.comapi.util.e;
import com.baidu.platform.comjni.map.commonmemcache.NACommonMemCache;

/* loaded from: classes2.dex */
public class SysUpdateUtil implements SysUpdateObserver {

    /* renamed from: a, reason: collision with root package name */
    private static NACommonMemCache f7914a;

    public SysUpdateUtil() {
        f7914a = e.b();
    }

    @Override // com.baidu.mapsdkplatform.comapi.util.SysUpdateObserver
    public void init(String str) {
        if (f7914a != null) {
            if (TextUtils.isEmpty(str)) {
                str = SyncSysInfo.getPhoneInfoCache();
            }
            f7914a.b(str);
        }
    }

    @Override // com.baidu.mapsdkplatform.comapi.util.SysUpdateObserver
    public void updateCuid(String str) {
        NACommonMemCache nACommonMemCache = f7914a;
        if (nACommonMemCache != null) {
            nACommonMemCache.a("cuid", str);
        }
    }

    @Override // com.baidu.mapsdkplatform.comapi.util.SysUpdateObserver
    public void updateNetworkInfo(Context context) {
        NetworkUtil.updateNetworkProxy(context);
    }

    @Override // com.baidu.mapsdkplatform.comapi.util.SysUpdateObserver
    public void updateNetworkProxy(Context context) {
        com.baidu.platform.comapi.d.b.a().b(SysOSUtil.getNetType());
    }

    @Override // com.baidu.mapsdkplatform.comapi.util.SysUpdateObserver
    public void updatePhoneInfo(String str) {
        NACommonMemCache nACommonMemCache = f7914a;
        if (nACommonMemCache != null) {
            String a8 = nACommonMemCache.a("logstatistics");
            f7914a.b(str);
            f7914a.b("logstatistics", a8);
        }
    }

    @Override // com.baidu.mapsdkplatform.comapi.util.SysUpdateObserver
    public void updateZid(String str) {
        NACommonMemCache nACommonMemCache = f7914a;
        if (nACommonMemCache != null) {
            nACommonMemCache.a("zid", str);
        }
    }
}
