package com.crrepa.f;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public class m2 {

    /* renamed from: a, reason: collision with root package name */
    private static final String f12656a = "DFU";

    private m2() {
    }

    public static int a(byte[] bArr) {
        String str = new String(bArr);
        if (!str.contains(f12656a)) {
            return 0;
        }
        Matcher matcher = Pattern.compile("\\d+").matcher(str);
        ArrayList arrayList = new ArrayList();
        while (matcher.find()) {
            arrayList.add(Integer.valueOf(matcher.group(0)));
        }
        return (!arrayList.isEmpty() && ((Integer) arrayList.get(0)).intValue() > 0) ? 1 : 0;
    }
}
