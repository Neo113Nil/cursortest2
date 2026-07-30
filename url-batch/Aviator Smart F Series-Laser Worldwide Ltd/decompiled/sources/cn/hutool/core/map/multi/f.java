package cn.hutool.core.map.multi;

import cn.hutool.core.builder.Builder;
import cn.hutool.core.map.h1;
import java.io.Serializable;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements Builder, Serializable {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f546h;

    public /* synthetic */ f(boolean z7) {
        this.f546h = z7;
    }

    @Override // cn.hutool.core.builder.Builder
    public final Object build() {
        Map newHashMap;
        newHashMap = h1.newHashMap(this.f546h);
        return newHashMap;
    }
}
