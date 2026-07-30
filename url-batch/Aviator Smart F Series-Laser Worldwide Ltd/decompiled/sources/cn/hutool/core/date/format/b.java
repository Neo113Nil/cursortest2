package cn.hutool.core.date.format;

import java.text.ParsePosition;

/* loaded from: classes.dex */
public abstract /* synthetic */ class b {
    public static Object a(c cVar, String str) {
        return cVar.parse(str);
    }

    public static Object b(c cVar, String str, ParsePosition parsePosition) {
        return cVar.parse(str, parsePosition);
    }
}
