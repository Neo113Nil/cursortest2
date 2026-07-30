package cn.hutool.core.convert.impl;

import cn.hutool.core.convert.AbstractConverter;

/* loaded from: classes.dex */
public class CharacterConverter extends AbstractConverter<Character> {
    private static final long serialVersionUID = 1;

    @Override // cn.hutool.core.convert.AbstractConverter, cn.hutool.core.convert.f
    public /* bridge */ /* synthetic */ Object convertWithCheck(Object obj, Object obj2, boolean z7) {
        return cn.hutool.core.convert.e.a(this, obj, obj2, z7);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // cn.hutool.core.convert.AbstractConverter
    public Character convertInternal(Object obj) {
        if (obj instanceof Boolean) {
            return cn.hutool.core.util.i.toCharacter(((Boolean) obj).booleanValue());
        }
        String convertToStr = convertToStr(obj);
        if (cn.hutool.core.text.l.isNotBlank(convertToStr)) {
            return Character.valueOf(convertToStr.charAt(0));
        }
        return null;
    }
}
