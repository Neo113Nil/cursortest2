package com.baidu.android.bbalbs.common.util;

import android.content.Context;
import com.baidu.bbalbscesium.h;
import com.baidu.bbalbscesium.j.b;

/* loaded from: classes.dex */
public class InternalDeviceIdApis {

    public static class TargetPackageCuidV270Info {
        public String iscChannelCuid;
        public String upcChannelCuid;
    }

    private static h a(Context context) {
        DeviceId.getCUID(context);
        return DeviceId.a(context).b();
    }

    public static String getSelfC270Ids(Context context) {
        h.a b8 = a(context).b();
        if (b8 != null) {
            return b8.d();
        }
        return null;
    }

    public static TargetPackageCuidV270Info getTargetPackageCuid270Info(Context context, String str) {
        h a8 = a(context);
        TargetPackageCuidV270Info targetPackageCuidV270Info = new TargetPackageCuidV270Info();
        h.a a9 = a8.a(str, b.f3995c);
        if (a9 != null) {
            targetPackageCuidV270Info.upcChannelCuid = a9.d();
        }
        h.a a10 = a8.a(str, b.f3997e);
        if (a10 != null) {
            targetPackageCuidV270Info.iscChannelCuid = a10.d();
        }
        return targetPackageCuidV270Info;
    }
}
