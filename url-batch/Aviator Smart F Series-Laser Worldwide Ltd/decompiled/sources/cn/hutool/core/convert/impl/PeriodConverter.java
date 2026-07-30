package cn.hutool.core.convert.impl;

import cn.hutool.core.convert.AbstractConverter;
import java.time.Period;

/* loaded from: classes.dex */
public class PeriodConverter extends AbstractConverter<Period> {
    private static final long serialVersionUID = 1;

    @Override // cn.hutool.core.convert.AbstractConverter, cn.hutool.core.convert.f
    public /* bridge */ /* synthetic */ Object convertWithCheck(Object obj, Object obj2, boolean z7) {
        return cn.hutool.core.convert.e.a(this, obj, obj2, z7);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cn.hutool.core.convert.AbstractConverter
    public Period convertInternal(Object obj) {
        Period parse;
        Period ofDays;
        Period from;
        if (d.a(obj)) {
            from = Period.from(e.a(obj));
            return from;
        }
        if (obj instanceof Integer) {
            ofDays = Period.ofDays(((Integer) obj).intValue());
            return ofDays;
        }
        parse = Period.parse(convertToStr(obj));
        return parse;
    }
}
