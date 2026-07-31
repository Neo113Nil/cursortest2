package com.bytedance.sdk.component.bvs;

import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes6.dex */
public class fs {
    public static boolean zmn(List<String> list, String str) {
        if (list != null && !list.isEmpty()) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                if (Pattern.matches(it.next(), str)) {
                    return true;
                }
            }
        }
        return false;
    }
}
