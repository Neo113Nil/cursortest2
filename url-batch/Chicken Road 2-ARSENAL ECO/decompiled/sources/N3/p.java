package N3;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final String f1748a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1749b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1750c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1751d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1752e;

    public p(String str, int i7, int i8, int i9, int i10) {
        if (!(i7 == -1 && i8 == -1) && (i7 < 0 || i8 < 0)) {
            throw new IndexOutOfBoundsException("invalid selection: (" + i7 + ", " + i8 + ")");
        }
        if (!(i9 == -1 && i10 == -1) && (i9 < 0 || i9 > i10)) {
            throw new IndexOutOfBoundsException("invalid composing range: (" + i9 + ", " + i10 + ")");
        }
        if (i10 > str.length()) {
            throw new IndexOutOfBoundsException(W4.o.c("invalid composing start: ", i9));
        }
        if (i7 > str.length()) {
            throw new IndexOutOfBoundsException(W4.o.c("invalid selection start: ", i7));
        }
        if (i8 > str.length()) {
            throw new IndexOutOfBoundsException(W4.o.c("invalid selection end: ", i8));
        }
        this.f1748a = str;
        this.f1749b = i7;
        this.f1750c = i8;
        this.f1751d = i9;
        this.f1752e = i10;
    }

    public static p a(JSONObject jSONObject) {
        return new p(jSONObject.getString("text"), jSONObject.getInt("selectionBase"), jSONObject.getInt("selectionExtent"), jSONObject.getInt("composingBase"), jSONObject.getInt("composingExtent"));
    }
}
