package com.yanzhenjie.kalle.simple;

import com.yanzhenjie.kalle.q;
import java.lang.reflect.Type;

/* loaded from: classes4.dex */
public interface e {
    public static final e DEFAULT = new a();

    static class a implements e {
        a() {
        }

        @Override // com.yanzhenjie.kalle.simple.e
        public <S, F> j convert(Type type, Type type2, q qVar, boolean z7) {
            return j.newBuilder().code(qVar.code()).headers(qVar.headers()).fromCache(z7).succeed(type == String.class ? qVar.body().string() : null).build();
        }
    }

    <S, F> j convert(Type type, Type type2, q qVar, boolean z7);
}
