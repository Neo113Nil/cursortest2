package com.crrepa.band.my.home.guidance.permission.dialog;

import android.content.Context;
import com.crrepa.band.aviator.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class e {
    private static final Map<String, String> PERMISSION_NAME_GROUP_MAP;

    static {
        HashMap hashMap = new HashMap();
        PERMISSION_NAME_GROUP_MAP = hashMap;
        hashMap.put("android.permission.CALL_PHONE", com.moyoung.dafit.module.common.utils.d.get().getString(R.string.permission_phone));
        hashMap.put("android.permission.READ_PHONE_STATE", com.moyoung.dafit.module.common.utils.d.get().getString(R.string.permission_phone));
        hashMap.put("android.permission.ANSWER_PHONE_CALLS", com.moyoung.dafit.module.common.utils.d.get().getString(R.string.permission_phone));
        hashMap.put("android.permission.READ_CALL_LOG", com.moyoung.dafit.module.common.utils.d.get().getString(R.string.permission_call_log));
        hashMap.put("android.permission.READ_CONTACTS", com.moyoung.dafit.module.common.utils.d.get().getString(R.string.permission_contacts));
        hashMap.put("android.permission.READ_SMS", com.moyoung.dafit.module.common.utils.d.get().getString(R.string.permission_sms));
        hashMap.put("android.permission.SEND_SMS", com.moyoung.dafit.module.common.utils.d.get().getString(R.string.permission_sms));
    }

    public static List<String> getNeedPermissionNames(Context context, String... strArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : strArr) {
            if (!q7.b.hasSelfPermissions(context, str)) {
                String str2 = PERMISSION_NAME_GROUP_MAP.get(str);
                if (str2 != null) {
                    linkedHashSet.add(str2);
                } else {
                    linkedHashSet.add(str.split("\\.")[r3.length - 1]);
                }
            }
        }
        return new ArrayList(linkedHashSet);
    }

    public static String getNeedPermissionString(Context context, String... strArr) {
        List<String> needPermissionNames = getNeedPermissionNames(context, strArr);
        StringBuilder sb = new StringBuilder();
        for (int i8 = 0; i8 < needPermissionNames.size(); i8++) {
            if (i8 != 0) {
                if (i8 == needPermissionNames.size() - 1) {
                    sb.append(context.getString(R.string.permission_conjunction));
                } else {
                    sb.append(context.getString(R.string.permission_delimiter));
                }
            }
            sb.append(needPermissionNames.get(i8));
        }
        return sb.toString();
    }
}
