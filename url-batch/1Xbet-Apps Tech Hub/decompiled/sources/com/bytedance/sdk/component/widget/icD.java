package com.bytedance.sdk.component.widget;

import com.bytedance.sdk.component.utils.Ju;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: ArbitrageUtils.java */
/* loaded from: classes.dex */
public class icD {
    public static boolean pvs(List<String> list, String str) {
        if (list != null && !list.isEmpty()) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                try {
                } catch (Throwable th) {
                    Ju.icD(th.toString());
                }
                if (Pattern.matches(it.next(), str)) {
                    return true;
                }
            }
        }
        return false;
    }
}
