package D2;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f395a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f396b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f397c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f398d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f399e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f400f;

    /* renamed from: g, reason: collision with root package name */
    private final String f401g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f402h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f403i;

    /* renamed from: j, reason: collision with root package name */
    private final String f404j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f405k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f406l;

    public g(boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, String prettyPrintIndent, boolean z10, boolean z11, String classDiscriminator, boolean z12, boolean z13, t tVar) {
        Intrinsics.checkNotNullParameter(prettyPrintIndent, "prettyPrintIndent");
        Intrinsics.checkNotNullParameter(classDiscriminator, "classDiscriminator");
        this.f395a = z4;
        this.f396b = z5;
        this.f397c = z6;
        this.f398d = z7;
        this.f399e = z8;
        this.f400f = z9;
        this.f401g = prettyPrintIndent;
        this.f402h = z10;
        this.f403i = z11;
        this.f404j = classDiscriminator;
        this.f405k = z12;
        this.f406l = z13;
    }

    public final boolean a() {
        return this.f405k;
    }

    public final boolean b() {
        return this.f398d;
    }

    public final String c() {
        return this.f404j;
    }

    public final boolean d() {
        return this.f402h;
    }

    public final boolean e() {
        return this.f395a;
    }

    public final boolean f() {
        return this.f400f;
    }

    public final boolean g() {
        return this.f396b;
    }

    public final t h() {
        return null;
    }

    public final boolean i() {
        return this.f399e;
    }

    public final String j() {
        return this.f401g;
    }

    public final boolean k() {
        return this.f406l;
    }

    public final boolean l() {
        return this.f403i;
    }

    public final boolean m() {
        return this.f397c;
    }

    public String toString() {
        return "JsonConfiguration(encodeDefaults=" + this.f395a + ", ignoreUnknownKeys=" + this.f396b + ", isLenient=" + this.f397c + ", allowStructuredMapKeys=" + this.f398d + ", prettyPrint=" + this.f399e + ", explicitNulls=" + this.f400f + ", prettyPrintIndent='" + this.f401g + "', coerceInputValues=" + this.f402h + ", useArrayPolymorphism=" + this.f403i + ", classDiscriminator='" + this.f404j + "', allowSpecialFloatingPointValues=" + this.f405k + ", useAlternativeNames=" + this.f406l + ", namingStrategy=" + ((Object) null) + ')';
    }

    public /* synthetic */ g(boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, String str, boolean z10, boolean z11, String str2, boolean z12, boolean z13, t tVar, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? false : z4, (i4 & 2) != 0 ? false : z5, (i4 & 4) != 0 ? false : z6, (i4 & 8) != 0 ? false : z7, (i4 & 16) != 0 ? false : z8, (i4 & 32) != 0 ? true : z9, (i4 & 64) != 0 ? "    " : str, (i4 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? false : z10, (i4 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? false : z11, (i4 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? "type" : str2, (i4 & 1024) == 0 ? z12 : false, (i4 & com.ironsource.mediationsdk.metadata.a.f17688n) == 0 ? z13 : true, (i4 & Base64Utils.IO_BUFFER_SIZE) != 0 ? null : tVar);
    }
}
