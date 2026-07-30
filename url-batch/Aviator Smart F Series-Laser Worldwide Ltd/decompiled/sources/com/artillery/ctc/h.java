package com.artillery.ctc;

import com.artillery.ctc.base.KeyResult;
import com.artillery.ctc.j;
import com.artillery.ctc.uitls.Base64Utils;
import com.artillery.ctc.uitls.PathUtils;
import com.baidu.ar.constants.HttpConstants;
import com.baidu.ar.util.SystemInfoUtil;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: d, reason: collision with root package name */
    public static final b f791d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    public static final y5.f f792e;

    /* renamed from: a, reason: collision with root package name */
    public KeyResult f793a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f794b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f795c;

    public static final class a extends Lambda implements f6.a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f796a = new a();

        public a() {
            super(0);
        }

        @Override // f6.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final h invoke() {
            return new h(null);
        }
    }

    public static final class b {
        public b() {
        }

        public /* synthetic */ b(o oVar) {
            this();
        }

        public final h a() {
            return b();
        }

        public final h b() {
            return (h) h.f792e.getValue();
        }
    }

    static {
        y5.f lazy;
        lazy = kotlin.b.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (f6.a) a.f796a);
        f792e = lazy;
    }

    public h() {
    }

    public /* synthetic */ h(o oVar) {
        this();
    }

    public final String b() {
        KeyResult c8 = c();
        String str = System.currentTimeMillis() + SystemInfoUtil.COMMA + HttpConstants.OS_TYPE_VALUE + SystemInfoUtil.COMMA + c8.getMac() + SystemInfoUtil.COMMA + c8.getChannel();
        kotlin.jvm.internal.s.checkNotNullExpressionValue(str, "StringBuilder().apply(builderAction).toString()");
        Base64Utils.Companion companion = Base64Utils.Companion;
        byte[] bytes = str.getBytes(kotlin.text.d.UTF_8);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        return companion.encodeToString(bytes);
    }

    public final KeyResult c() {
        if (d()) {
            return new KeyResult(null, "936ED33CAB3214575FD05078FEC2384D", "4o23zDKn19GyHIFMVoXLmaHkpZnGhMo7", "41587979", "OXTyMyngP8yBkR7X1ovZwrOPEnOoZ89t", "KzPnXSkfxgpxoWZ4VpEoYIqP9fXLWLqO", null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -63, 7, null);
        }
        KeyResult keyResult = this.f793a;
        return keyResult == null ? new KeyResult(null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 7, null) : keyResult;
    }

    public final boolean d() {
        return false;
    }

    public final boolean e() {
        return this.f795c;
    }

    public final boolean f() {
        return this.f794b;
    }

    public final void a(KeyResult result) {
        kotlin.jvm.internal.s.checkNotNullParameter(result, "result");
        this.f793a = result;
    }

    public final void a(boolean z7) {
        this.f795c = z7;
    }

    public final void b(boolean z7) {
        this.f794b = z7;
        j.d e8 = j.e();
        e8.a(PathUtils.getExternalAppCachePath());
        e8.a(false);
        e8.b("ChatApi");
        e8.a(3);
        e8.b(z7);
    }
}
