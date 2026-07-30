package com.google.android.gms.internal.consent_sdk;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'v' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes2.dex */
public final class W2 {

    /* renamed from: v, reason: collision with root package name */
    public static final W2 f35791v;

    /* renamed from: w, reason: collision with root package name */
    public static final W2 f35792w;

    /* renamed from: x, reason: collision with root package name */
    public static final W2 f35793x;

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ W2[] f35794y;

    /* renamed from: n, reason: collision with root package name */
    public final X2 f35795n;

    /* renamed from: u, reason: collision with root package name */
    public final int f35796u;

    /* JADX INFO: Fake field, exist only in values array */
    W2 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    W2 EF2;

    static {
        W2 w22 = new W2("DOUBLE", 0, X2.f35803w, 1);
        W2 w23 = new W2("FLOAT", 1, X2.f35802v, 5);
        X2 x22 = X2.f35801u;
        W2 w24 = new W2("INT64", 2, x22, 0);
        f35791v = w24;
        W2 w25 = new W2("UINT64", 3, x22, 0);
        X2 x23 = X2.f35800n;
        W2 w26 = new W2("INT32", 4, x23, 0);
        W2 w27 = new W2("FIXED64", 5, x22, 1);
        W2 w28 = new W2("FIXED32", 6, x23, 5);
        W2 w29 = new W2("BOOL", 7, X2.f35804x, 0);
        W2 w210 = new W2("STRING", 8, X2.f35805y, 2);
        f35792w = w210;
        X2 x24 = X2.f35798B;
        W2 w211 = new W2("GROUP", 9, x24, 3);
        f35793x = w211;
        f35794y = new W2[]{w22, w23, w24, w25, w26, w27, w28, w29, w210, w211, new W2("MESSAGE", 10, x24, 2), new W2("BYTES", 11, X2.f35806z, 2), new W2("UINT32", 12, x23, 0), new W2("ENUM", 13, X2.f35797A, 0), new W2("SFIXED32", 14, x23, 5), new W2("SFIXED64", 15, x22, 1), new W2("SINT32", 16, x23, 0), new W2("SINT64", 17, x22, 0)};
    }

    public W2(String str, int i, X2 x22, int i4) {
        this.f35795n = x22;
        this.f35796u = i4;
    }

    public static W2[] values() {
        return (W2[]) f35794y.clone();
    }
}
