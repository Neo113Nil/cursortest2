package cn.hutool.core.convert.impl;

import cn.hutool.core.convert.AbstractConverter;
import java.util.Map;

/* loaded from: classes.dex */
public class StackTraceElementConverter extends AbstractConverter<StackTraceElement> {
    private static final long serialVersionUID = 1;

    @Override // cn.hutool.core.convert.AbstractConverter, cn.hutool.core.convert.f
    public /* bridge */ /* synthetic */ Object convertWithCheck(Object obj, Object obj2, boolean z7) {
        return cn.hutool.core.convert.e.a(this, obj, obj2, z7);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cn.hutool.core.convert.AbstractConverter
    public StackTraceElement convertInternal(Object obj) {
        if (!(obj instanceof Map)) {
            return null;
        }
        Map map = (Map) obj;
        return new StackTraceElement(cn.hutool.core.map.h1.getStr(map, "className"), cn.hutool.core.map.h1.getStr(map, "methodName"), cn.hutool.core.map.h1.getStr(map, "fileName"), ((Integer) cn.hutool.core.util.e0.defaultIfNull((int) cn.hutool.core.map.h1.getInt(map, "lineNumber"), 0)).intValue());
    }
}
