package com.yanzhenjie.kalle.simple;

import android.text.TextUtils;
import com.yanzhenjie.kalle.RequestMethod;
import com.yanzhenjie.kalle.c;
import com.yanzhenjie.kalle.simple.cache.CacheMode;
import com.yanzhenjie.kalle.t;
import java.lang.reflect.Type;

/* loaded from: classes4.dex */
public class g extends com.yanzhenjie.kalle.c implements i {
    private final String mCacheKey;
    private final CacheMode mCacheMode;
    private final e mConverter;

    public static class b extends c.b {
        private String mCacheKey;
        private CacheMode mCacheMode;
        private e mConverter;

        public b cacheKey(String str) {
            this.mCacheKey = str;
            return this;
        }

        public b cacheMode(CacheMode cacheMode) {
            this.mCacheMode = cacheMode;
            return this;
        }

        public b converter(e eVar) {
            this.mConverter = eVar;
            return this;
        }

        public <S, F> j perform(Type type, Type type2) {
            return f.getInstance().perform(new g(this), type, type2);
        }

        private b(t tVar, RequestMethod requestMethod) {
            super(tVar, requestMethod);
        }

        public <S, F> com.yanzhenjie.kalle.e perform(d dVar) {
            return f.getInstance().perform(new g(this), dVar);
        }
    }

    public static b newApi(t tVar, RequestMethod requestMethod) {
        return new b(tVar, requestMethod);
    }

    @Override // com.yanzhenjie.kalle.simple.i
    public String cacheKey() {
        return this.mCacheKey;
    }

    @Override // com.yanzhenjie.kalle.simple.i
    public CacheMode cacheMode() {
        return this.mCacheMode;
    }

    @Override // com.yanzhenjie.kalle.simple.i
    public e converter() {
        return this.mConverter;
    }

    private g(b bVar) {
        super(bVar);
        this.mCacheMode = bVar.mCacheMode == null ? CacheMode.HTTP : bVar.mCacheMode;
        this.mCacheKey = TextUtils.isEmpty(bVar.mCacheKey) ? url().toString() : bVar.mCacheKey;
        this.mConverter = bVar.mConverter;
    }
}
