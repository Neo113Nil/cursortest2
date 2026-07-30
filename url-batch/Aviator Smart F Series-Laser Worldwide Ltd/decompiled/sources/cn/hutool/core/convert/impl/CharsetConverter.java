package cn.hutool.core.convert.impl;

import cn.hutool.core.convert.AbstractConverter;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public class CharsetConverter extends AbstractConverter<Charset> {
    private static final long serialVersionUID = 1;

    @Override // cn.hutool.core.convert.AbstractConverter, cn.hutool.core.convert.f
    public /* bridge */ /* synthetic */ Object convertWithCheck(Object obj, Object obj2, boolean z7) {
        return cn.hutool.core.convert.e.a(this, obj, obj2, z7);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cn.hutool.core.convert.AbstractConverter
    public Charset convertInternal(Object obj) {
        return cn.hutool.core.util.l.charset(convertToStr(obj));
    }
}
