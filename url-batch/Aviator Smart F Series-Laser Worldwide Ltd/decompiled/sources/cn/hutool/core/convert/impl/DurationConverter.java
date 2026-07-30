package cn.hutool.core.convert.impl;

import cn.hutool.core.convert.AbstractConverter;
import java.time.Duration;

/* loaded from: classes.dex */
public class DurationConverter extends AbstractConverter<Duration> {
    private static final long serialVersionUID = 1;

    @Override // cn.hutool.core.convert.AbstractConverter, cn.hutool.core.convert.f
    public /* bridge */ /* synthetic */ Object convertWithCheck(Object obj, Object obj2, boolean z7) {
        return cn.hutool.core.convert.e.a(this, obj, obj2, z7);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cn.hutool.core.convert.AbstractConverter
    public Duration convertInternal(Object obj) {
        Duration parse;
        Duration ofMillis;
        Duration from;
        if (d.a(obj)) {
            from = Duration.from(e.a(obj));
            return from;
        }
        if (obj instanceof Long) {
            ofMillis = Duration.ofMillis(((Long) obj).longValue());
            return ofMillis;
        }
        parse = Duration.parse(convertToStr(obj));
        return parse;
    }
}
