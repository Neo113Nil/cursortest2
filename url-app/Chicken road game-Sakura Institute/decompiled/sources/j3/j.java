package j3;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7198a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f7199b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f7200c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f7201d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f7202e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f7203f;

    /* renamed from: g, reason: collision with root package name */
    public final String f7204g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f7205h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f7206i;

    /* renamed from: j, reason: collision with root package name */
    public final String f7207j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f7208k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f7209l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f7210m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f7211n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f7212o;

    /* renamed from: p, reason: collision with root package name */
    public final EnumC0722a f7213p;

    public j(boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, String prettyPrintIndent, boolean z10, boolean z11, String classDiscriminator, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, EnumC0722a classDiscriminatorMode) {
        Intrinsics.checkNotNullParameter(prettyPrintIndent, "prettyPrintIndent");
        Intrinsics.checkNotNullParameter(classDiscriminator, "classDiscriminator");
        Intrinsics.checkNotNullParameter(classDiscriminatorMode, "classDiscriminatorMode");
        this.f7198a = z4;
        this.f7199b = z5;
        this.f7200c = z6;
        this.f7201d = z7;
        this.f7202e = z8;
        this.f7203f = z9;
        this.f7204g = prettyPrintIndent;
        this.f7205h = z10;
        this.f7206i = z11;
        this.f7207j = classDiscriminator;
        this.f7208k = z12;
        this.f7209l = z13;
        this.f7210m = z14;
        this.f7211n = z15;
        this.f7212o = z16;
        this.f7213p = classDiscriminatorMode;
    }

    public final String toString() {
        return "JsonConfiguration(encodeDefaults=" + this.f7198a + ", ignoreUnknownKeys=" + this.f7199b + ", isLenient=" + this.f7200c + ", allowStructuredMapKeys=" + this.f7201d + ", prettyPrint=" + this.f7202e + ", explicitNulls=" + this.f7203f + ", prettyPrintIndent='" + this.f7204g + "', coerceInputValues=" + this.f7205h + ", useArrayPolymorphism=" + this.f7206i + ", classDiscriminator='" + this.f7207j + "', allowSpecialFloatingPointValues=" + this.f7208k + ", useAlternativeNames=" + this.f7209l + ", namingStrategy=null, decodeEnumsCaseInsensitive=" + this.f7210m + ", allowTrailingComma=" + this.f7211n + ", allowComments=" + this.f7212o + ", classDiscriminatorMode=" + this.f7213p + ')';
    }
}
