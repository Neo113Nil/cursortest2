package com.artillery.ctc;

import com.artillery.ctc.base.KeyResult;
import com.artillery.ctc.base.StockQueryBody;
import com.drake.net.NetConfig;
import com.drake.net.exception.ConvertException;
import com.drake.net.exception.NetException;
import f6.l;
import java.util.concurrent.CancellationException;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.o;
import kotlin.reflect.TypesJVMKt;
import okhttp3.Response;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final b f675a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    public static final y5.f f676b;

    public static final class a extends Lambda implements f6.a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f677a = new a();

        public a() {
            super(0);
        }

        @Override // f6.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a0 invoke() {
            return new a0(null);
        }
    }

    public static final class b {
        public b() {
        }

        public /* synthetic */ b(o oVar) {
            this();
        }

        public final a0 a() {
            return b();
        }

        public final a0 b() {
            return (a0) a0.f676b.getValue();
        }
    }

    public static final class c extends Lambda implements l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ KeyResult f678a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ StockQueryBody f679b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(KeyResult keyResult, StockQueryBody stockQueryBody) {
            super(1);
            this.f678a = keyResult;
            this.f679b = stockQueryBody;
        }

        public final void a(r4.b post) {
            kotlin.jvm.internal.s.checkNotNullParameter(post, "$this$post");
            r4.a.addQuery$default(post, "ak", this.f678a.getAk(), false, 4, null);
            r4.a.addQuery$default(post, "sn", this.f678a.getDeviceId(), false, 4, null);
            post.json(y.g.a(this.f679b));
        }

        @Override // f6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((r4.b) obj);
            return y5.w.INSTANCE;
        }
    }

    public static final class d extends Lambda implements l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ KeyResult f680a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ StockQueryBody f681b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(KeyResult keyResult, StockQueryBody stockQueryBody) {
            super(1);
            this.f680a = keyResult;
            this.f681b = stockQueryBody;
        }

        public final void a(r4.b post) {
            kotlin.jvm.internal.s.checkNotNullParameter(post, "$this$post");
            r4.a.addQuery$default(post, "ak", this.f680a.getAk(), false, 4, null);
            r4.a.addQuery$default(post, "sn", this.f680a.getDeviceId(), false, 4, null);
            post.json(y.g.a(this.f681b));
        }

        @Override // f6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((r4.b) obj);
            return y5.w.INSTANCE;
        }
    }

    public static final class e extends Lambda implements l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ KeyResult f682a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ StockQueryBody f683b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(KeyResult keyResult, StockQueryBody stockQueryBody) {
            super(1);
            this.f682a = keyResult;
            this.f683b = stockQueryBody;
        }

        public final void a(r4.b post) {
            kotlin.jvm.internal.s.checkNotNullParameter(post, "$this$post");
            r4.a.addQuery$default(post, "ak", this.f682a.getAk(), false, 4, null);
            r4.a.addQuery$default(post, "sn", this.f682a.getDeviceId(), false, 4, null);
            post.json(y.g.a(this.f683b));
        }

        @Override // f6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((r4.b) obj);
            return y5.w.INSTANCE;
        }
    }

    static {
        y5.f lazy;
        lazy = kotlin.b.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (f6.a) a.f677a);
        f676b = lazy;
    }

    public a0() {
    }

    public /* synthetic */ a0(o oVar) {
        this();
    }

    public final String b(StockQueryBody body) {
        kotlin.jvm.internal.s.checkNotNullParameter(body, "body");
        try {
            r4.b post$default = com.drake.net.a.post$default(a("/thrid/stock/queryStock"), null, new d(h.f791d.a().c(), body), 2, null);
            NetConfig.INSTANCE.getRequestInterceptor();
            r4.d.setKType(post$default.getOkHttpRequest(), kotlin.jvm.internal.u.nullableTypeOf(String.class));
            Response execute = post$default.getOkHttpClient().newCall(post$default.buildRequest()).execute();
            try {
                try {
                    try {
                        return (String) r4.e.converter(execute.request()).onConvert(TypesJVMKt.getJavaType(kotlin.jvm.internal.u.nullableTypeOf(String.class)), execute);
                    } catch (CancellationException e8) {
                        throw e8;
                    }
                } catch (Throwable th) {
                    throw new ConvertException(execute, "An unexpected error occurred in the converter", th, null, 8, null);
                }
            } catch (NetException e9) {
                throw e9;
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public final String c(StockQueryBody body) {
        kotlin.jvm.internal.s.checkNotNullParameter(body, "body");
        try {
            r4.b post$default = com.drake.net.a.post$default(a("/thrid/stock/queryStockHis"), null, new e(h.f791d.a().c(), body), 2, null);
            NetConfig.INSTANCE.getRequestInterceptor();
            r4.d.setKType(post$default.getOkHttpRequest(), kotlin.jvm.internal.u.nullableTypeOf(String.class));
            Response execute = post$default.getOkHttpClient().newCall(post$default.buildRequest()).execute();
            try {
                try {
                    try {
                        return (String) r4.e.converter(execute.request()).onConvert(TypesJVMKt.getJavaType(kotlin.jvm.internal.u.nullableTypeOf(String.class)), execute);
                    } catch (CancellationException e8) {
                        throw e8;
                    }
                } catch (Throwable th) {
                    throw new ConvertException(execute, "An unexpected error occurred in the converter", th, null, 8, null);
                }
            } catch (NetException e9) {
                throw e9;
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public final String a(StockQueryBody body) {
        kotlin.jvm.internal.s.checkNotNullParameter(body, "body");
        try {
            r4.b post$default = com.drake.net.a.post$default(a("/thrid/stock/queryStockMessage"), null, new c(h.f791d.a().c(), body), 2, null);
            NetConfig.INSTANCE.getRequestInterceptor();
            r4.d.setKType(post$default.getOkHttpRequest(), kotlin.jvm.internal.u.nullableTypeOf(String.class));
            Response execute = post$default.getOkHttpClient().newCall(post$default.buildRequest()).execute();
            try {
                try {
                    try {
                        return (String) r4.e.converter(execute.request()).onConvert(TypesJVMKt.getJavaType(kotlin.jvm.internal.u.nullableTypeOf(String.class)), execute);
                    } catch (CancellationException e8) {
                        throw e8;
                    }
                } catch (Throwable th) {
                    throw new ConvertException(execute, "An unexpected error occurred in the converter", th, null, 8, null);
                }
            } catch (NetException e9) {
                throw e9;
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public final String a(String str) {
        if (!CtHelper.Companion.get().isGPTDebugEnable()) {
            return str;
        }
        return "http://test-api.lizheng.design" + str;
    }
}
