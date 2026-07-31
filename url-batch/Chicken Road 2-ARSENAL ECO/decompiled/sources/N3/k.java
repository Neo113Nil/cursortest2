package N3;

import U5.EnumC0214a;
import com.onesignal.inAppMessages.internal.display.impl.a;
import java.io.Serializable;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1720a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1721b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1722c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1723d;

    /* renamed from: e, reason: collision with root package name */
    public Serializable f1724e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f1725f;

    /* renamed from: g, reason: collision with root package name */
    public Object f1726g;

    public k(boolean z5, boolean z6, String prettyPrintIndent, String classDiscriminator, boolean z7, EnumC0214a classDiscriminatorMode) {
        kotlin.jvm.internal.i.e(prettyPrintIndent, "prettyPrintIndent");
        kotlin.jvm.internal.i.e(classDiscriminator, "classDiscriminator");
        kotlin.jvm.internal.i.e(classDiscriminatorMode, "classDiscriminatorMode");
        this.f1721b = z5;
        this.f1722c = z6;
        this.f1724e = prettyPrintIndent;
        this.f1725f = classDiscriminator;
        this.f1723d = z7;
        this.f1726g = classDiscriminatorMode;
    }

    public static HashMap a(byte[] bArr) {
        HashMap hashMap = new HashMap();
        hashMap.put("enabled", Boolean.TRUE);
        hashMap.put("data", bArr);
        return hashMap;
    }

    public String toString() {
        switch (this.f1720a) {
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                return "JsonConfiguration(encodeDefaults=false, ignoreUnknownKeys=" + this.f1721b + ", isLenient=false, allowStructuredMapKeys=false, prettyPrint=false, explicitNulls=" + this.f1722c + ", prettyPrintIndent='" + ((String) this.f1724e) + "', coerceInputValues=false, useArrayPolymorphism=false, classDiscriminator='" + ((String) this.f1725f) + "', allowSpecialFloatingPointValues=false, useAlternativeNames=" + this.f1723d + ", namingStrategy=null, decodeEnumsCaseInsensitive=false, allowTrailingComma=false, classDiscriminatorMode=" + ((EnumC0214a) this.f1726g) + ')';
            default:
                return super.toString();
        }
    }

    public k(F3.b bVar, boolean z5) {
        B0.c cVar = new B0.c((Object) bVar, "flutter/restoration", (Object) O3.m.f1774a, 12);
        this.f1722c = false;
        this.f1723d = false;
        J1.c cVar2 = new J1.c(18, this);
        this.f1725f = cVar;
        this.f1721b = z5;
        cVar.C(cVar2);
    }
}
