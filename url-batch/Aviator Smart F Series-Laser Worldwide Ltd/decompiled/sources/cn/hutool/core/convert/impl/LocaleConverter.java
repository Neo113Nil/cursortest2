package cn.hutool.core.convert.impl;

import cn.hutool.core.convert.AbstractConverter;
import java.util.Locale;

/* loaded from: classes.dex */
public class LocaleConverter extends AbstractConverter<Locale> {
    private static final long serialVersionUID = 1;

    @Override // cn.hutool.core.convert.AbstractConverter, cn.hutool.core.convert.f
    public /* bridge */ /* synthetic */ Object convertWithCheck(Object obj, Object obj2, boolean z7) {
        return cn.hutool.core.convert.e.a(this, obj, obj2, z7);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cn.hutool.core.convert.AbstractConverter
    public Locale convertInternal(Object obj) {
        try {
            String convertToStr = convertToStr(obj);
            if (cn.hutool.core.text.l.isEmpty(convertToStr)) {
                return null;
            }
            String[] split = convertToStr.split("_");
            return split.length == 1 ? new Locale(split[0]) : split.length == 2 ? new Locale(split[0], split[1]) : new Locale(split[0], split[1], split[2]);
        } catch (Exception unused) {
            return null;
        }
    }
}
