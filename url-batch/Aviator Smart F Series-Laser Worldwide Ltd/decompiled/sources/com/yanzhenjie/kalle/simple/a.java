package com.yanzhenjie.kalle.simple;

import com.yanzhenjie.kalle.exception.NoCacheError;
import com.yanzhenjie.kalle.exception.ParseError;
import com.yanzhenjie.kalle.q;
import com.yanzhenjie.kalle.simple.cache.Cache;
import com.yanzhenjie.kalle.simple.cache.CacheMode;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
abstract class a implements Callable {
    private static final long MAX_EXPIRES = System.currentTimeMillis() + 3153600000000L;
    private final com.yanzhenjie.kalle.simple.cache.a mCacheStore = com.yanzhenjie.kalle.k.getConfig().getCacheStore();
    private final e mConverter;
    private final Type mFailed;
    private final i mRequest;
    private final Type mSucceed;

    /* renamed from: com.yanzhenjie.kalle.simple.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0346a {
        static final /* synthetic */ int[] $SwitchMap$com$yanzhenjie$kalle$simple$cache$CacheMode;

        static {
            int[] iArr = new int[CacheMode.values().length];
            $SwitchMap$com$yanzhenjie$kalle$simple$cache$CacheMode = iArr;
            try {
                iArr[CacheMode.HTTP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$yanzhenjie$kalle$simple$cache$CacheMode[CacheMode.HTTP_YES_THEN_WRITE_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$yanzhenjie$kalle$simple$cache$CacheMode[CacheMode.NETWORK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$yanzhenjie$kalle$simple$cache$CacheMode[CacheMode.NETWORK_YES_THEN_HTTP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$yanzhenjie$kalle$simple$cache$CacheMode[CacheMode.NETWORK_YES_THEN_WRITE_CACHE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$yanzhenjie$kalle$simple$cache$CacheMode[CacheMode.NETWORK_NO_THEN_READ_CACHE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$yanzhenjie$kalle$simple$cache$CacheMode[CacheMode.READ_CACHE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$yanzhenjie$kalle$simple$cache$CacheMode[CacheMode.READ_CACHE_NO_THEN_NETWORK.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$yanzhenjie$kalle$simple$cache$CacheMode[CacheMode.READ_CACHE_NO_THEN_HTTP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    a(i iVar, Type type, Type type2) {
        this.mRequest = iVar;
        this.mSucceed = type;
        this.mFailed = type2;
        this.mConverter = iVar.converter() == null ? com.yanzhenjie.kalle.k.getConfig().getConverter() : iVar.converter();
    }

    private void attachCache(com.yanzhenjie.kalle.i iVar) {
        com.yanzhenjie.kalle.i headers = this.mRequest.headers();
        String eTag = iVar.getETag();
        if (eTag != null) {
            headers.set("If-None-Match", eTag);
        }
        long lastModified = iVar.getLastModified();
        if (lastModified > 0) {
            headers.set("If-Modified-Since", com.yanzhenjie.kalle.i.formatMillisToGMT(lastModified));
        }
    }

    private q buildResponse(int i8, com.yanzhenjie.kalle.i iVar, byte[] bArr) {
        return q.newBuilder().code(i8).headers(iVar).body(new c(iVar.getContentType(), bArr)).build();
    }

    private j buildSimpleResponse(q qVar, boolean z7) {
        try {
            return this.mConverter.convert(this.mSucceed, this.mFailed, qVar, z7);
        } catch (IOException e8) {
            throw e8;
        } catch (Exception e9) {
            throw new ParseError("An exception occurred while parsing the data.", e9);
        }
    }

    private void detachCache(int i8, com.yanzhenjie.kalle.i iVar, byte[] bArr, long j8) {
        String cacheKey = this.mRequest.cacheKey();
        Cache cache = new Cache();
        cache.setKey(cacheKey);
        cache.setCode(i8);
        cache.setHeaders(iVar);
        cache.setBody(bArr);
        cache.setExpires(j8);
        this.mCacheStore.replace(cacheKey, cache);
    }

    private void tryAttachCache() {
        Cache cache;
        int i8 = C0346a.$SwitchMap$com$yanzhenjie$kalle$simple$cache$CacheMode[this.mRequest.cacheMode().ordinal()];
        if ((i8 == 1 || i8 == 2) && (cache = this.mCacheStore.get(this.mRequest.cacheKey())) != null) {
            attachCache(cache.getHeaders());
        }
    }

    private void tryDetachCache(int i8, com.yanzhenjie.kalle.i iVar, byte[] bArr) {
        int i9 = C0346a.$SwitchMap$com$yanzhenjie$kalle$simple$cache$CacheMode[this.mRequest.cacheMode().ordinal()];
        if (i9 == 1) {
            long analysisCacheExpires = com.yanzhenjie.kalle.i.analysisCacheExpires(iVar);
            if (analysisCacheExpires > 0 || iVar.getLastModified() > 0) {
                detachCache(i8, iVar, bArr, analysisCacheExpires);
                return;
            }
            return;
        }
        if (i9 == 2) {
            detachCache(i8, iVar, bArr, MAX_EXPIRES);
            return;
        }
        if (i9 == 4) {
            long analysisCacheExpires2 = com.yanzhenjie.kalle.i.analysisCacheExpires(iVar);
            if (analysisCacheExpires2 > 0 || iVar.getLastModified() > 0) {
                detachCache(i8, iVar, bArr, analysisCacheExpires2);
                return;
            }
            return;
        }
        if (i9 == 5) {
            detachCache(i8, iVar, bArr, MAX_EXPIRES);
            return;
        }
        if (i9 != 9) {
            return;
        }
        long analysisCacheExpires3 = com.yanzhenjie.kalle.i.analysisCacheExpires(iVar);
        if (analysisCacheExpires3 > 0 || iVar.getLastModified() > 0) {
            detachCache(i8, iVar, bArr, analysisCacheExpires3);
        }
    }

    private q tryReadCacheAfter(int i8) {
        Cache cache;
        Cache cache2;
        int i9 = C0346a.$SwitchMap$com$yanzhenjie$kalle$simple$cache$CacheMode[this.mRequest.cacheMode().ordinal()];
        if (i9 == 1 || i9 == 2) {
            if (i8 != 304 || (cache = this.mCacheStore.get(this.mRequest.cacheKey())) == null) {
                return null;
            }
            return buildResponse(cache.getCode(), cache.getHeaders(), cache.getBody());
        }
        if (i9 == 6) {
            Cache cache3 = this.mCacheStore.get(this.mRequest.cacheKey());
            if (cache3 != null) {
                return buildResponse(cache3.getCode(), cache3.getHeaders(), cache3.getBody());
            }
            return null;
        }
        if (i9 == 9 && i8 == 304 && (cache2 = this.mCacheStore.get(this.mRequest.cacheKey())) != null) {
            return buildResponse(cache2.getCode(), cache2.getHeaders(), cache2.getBody());
        }
        return null;
    }

    private q tryReadCacheBefore() {
        Cache cache;
        int i8 = C0346a.$SwitchMap$com$yanzhenjie$kalle$simple$cache$CacheMode[this.mRequest.cacheMode().ordinal()];
        if (i8 == 1) {
            Cache cache2 = this.mCacheStore.get(this.mRequest.cacheKey());
            if (cache2 != null && cache2.getExpires() > System.currentTimeMillis()) {
                return buildResponse(cache2.getCode(), cache2.getHeaders(), cache2.getBody());
            }
        } else {
            if (i8 == 7) {
                Cache cache3 = this.mCacheStore.get(this.mRequest.cacheKey());
                if (cache3 != null) {
                    return buildResponse(cache3.getCode(), cache3.getHeaders(), cache3.getBody());
                }
                throw new NoCacheError("No cache found.");
            }
            if ((i8 == 8 || i8 == 9) && (cache = this.mCacheStore.get(this.mRequest.cacheKey())) != null) {
                return buildResponse(cache.getCode(), cache.getHeaders(), cache.getBody());
            }
        }
        return null;
    }

    public abstract void cancel();

    protected abstract q requestNetwork(i iVar);

    @Override // java.util.concurrent.Callable
    public final j call() {
        q tryReadCacheBefore = tryReadCacheBefore();
        if (tryReadCacheBefore != null) {
            return buildSimpleResponse(tryReadCacheBefore, true);
        }
        tryAttachCache();
        try {
            try {
                q requestNetwork = requestNetwork(this.mRequest);
                int code = requestNetwork.code();
                if (code == 304) {
                    q tryReadCacheAfter = tryReadCacheAfter(-1);
                    if (tryReadCacheAfter != null) {
                        j buildSimpleResponse = buildSimpleResponse(tryReadCacheAfter, true);
                        com.yanzhenjie.kalle.util.a.closeQuietly(requestNetwork);
                        return buildSimpleResponse;
                    }
                    j buildSimpleResponse2 = buildSimpleResponse(requestNetwork, false);
                    com.yanzhenjie.kalle.util.a.closeQuietly(requestNetwork);
                    return buildSimpleResponse2;
                }
                com.yanzhenjie.kalle.i headers = requestNetwork.headers();
                byte[] bArr = new byte[0];
                if (code != 204) {
                    bArr = requestNetwork.body().byteArray();
                }
                com.yanzhenjie.kalle.util.a.closeQuietly(requestNetwork);
                tryDetachCache(code, headers, bArr);
                q buildResponse = buildResponse(code, headers, bArr);
                j buildSimpleResponse3 = buildSimpleResponse(buildResponse, false);
                com.yanzhenjie.kalle.util.a.closeQuietly(buildResponse);
                return buildSimpleResponse3;
            } catch (IOException e8) {
                q tryReadCacheAfter2 = tryReadCacheAfter(-1);
                if (tryReadCacheAfter2 == null) {
                    throw e8;
                }
                j buildSimpleResponse4 = buildSimpleResponse(tryReadCacheAfter2, true);
                com.yanzhenjie.kalle.util.a.closeQuietly(tryReadCacheBefore);
                return buildSimpleResponse4;
            }
        } catch (Throwable th) {
            com.yanzhenjie.kalle.util.a.closeQuietly(tryReadCacheBefore);
            throw th;
        }
    }
}
