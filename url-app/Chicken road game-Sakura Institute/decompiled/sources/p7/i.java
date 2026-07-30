package p7;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7223a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f7224b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f7225c;

    /* renamed from: d, reason: collision with root package name */
    public final String f7226d;

    /* renamed from: e, reason: collision with root package name */
    public final String f7227e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f7228f;

    /* renamed from: g, reason: collision with root package name */
    public final a f7229g;

    public i(boolean z8, boolean z9, boolean z10, String str, String str2, boolean z11, a aVar) {
        r6.k.f(str, "prettyPrintIndent");
        r6.k.f(str2, "classDiscriminator");
        r6.k.f(aVar, "classDiscriminatorMode");
        this.f7223a = z8;
        this.f7224b = z9;
        this.f7225c = z10;
        this.f7226d = str;
        this.f7227e = str2;
        this.f7228f = z11;
        this.f7229g = aVar;
    }

    public final String toString() {
        return "JsonConfiguration(encodeDefaults=false, ignoreUnknownKeys=" + this.f7223a + ", isLenient=" + this.f7224b + ", allowStructuredMapKeys=false, prettyPrint=false, explicitNulls=" + this.f7225c + ", prettyPrintIndent='" + this.f7226d + "', coerceInputValues=false, useArrayPolymorphism=false, classDiscriminator='" + this.f7227e + "', allowSpecialFloatingPointValues=false, useAlternativeNames=" + this.f7228f + ", namingStrategy=null, decodeEnumsCaseInsensitive=false, allowTrailingComma=false, allowComments=false, classDiscriminatorMode=" + this.f7229g + ')';
    }
}
