package com.xsj.crasheye;

import com.xsj.crasheye.util.Utils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public class ScriptExceptionHanler {
    private static HashMap<String, Long> exceptions = new HashMap<>();

    public static synchronized void logScriptException(String str, String str2, String str3) {
        synchronized (ScriptExceptionHanler.class) {
            if (isSendReoprt(String.valueOf(str) + str2)) {
                new ActionScriptError(str, str2, str3, 1, null).send(new NetSender(), true);
            }
        }
    }

    private static boolean isSendReoprt(String str) {
        if (str.equals("") || str == null) {
            return false;
        }
        try {
            String MD5 = Utils.MD5(str);
            Iterator<Map.Entry<String, Long>> it = exceptions.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, Long> next = it.next();
                if (next.getKey().equals(MD5)) {
                    if (Utils.getTimeForLong() - next.getValue().longValue() < 600000) {
                        return false;
                    }
                    next.setValue(Long.valueOf(Utils.getTimeForLong()));
                    return true;
                }
                if (Utils.getTimeForLong() - next.getValue().longValue() >= 600000) {
                    it.remove();
                }
            }
            exceptions.put(MD5, Long.valueOf(Utils.getTimeForLong()));
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
