package r4;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final String f7522a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7523b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7524c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7525d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7526e;

    public q(int i2, int i5, int i7, int i8, String str) {
        if (!(i2 == -1 && i5 == -1) && (i2 < 0 || i5 < 0)) {
            throw new IndexOutOfBoundsException("invalid selection: (" + i2 + ", " + i5 + ")");
        }
        if (!(i7 == -1 && i8 == -1) && (i7 < 0 || i7 > i8)) {
            throw new IndexOutOfBoundsException("invalid composing range: (" + i7 + ", " + i8 + ")");
        }
        if (i8 > str.length()) {
            throw new IndexOutOfBoundsException(C4.p.g(i7, "invalid composing start: "));
        }
        if (i2 > str.length()) {
            throw new IndexOutOfBoundsException(C4.p.g(i2, "invalid selection start: "));
        }
        if (i5 > str.length()) {
            throw new IndexOutOfBoundsException(C4.p.g(i5, "invalid selection end: "));
        }
        this.f7522a = str;
        this.f7523b = i2;
        this.f7524c = i5;
        this.f7525d = i7;
        this.f7526e = i8;
    }

    public static q a(JSONObject jSONObject) {
        return new q(jSONObject.getInt("selectionBase"), jSONObject.getInt("selectionExtent"), jSONObject.getInt("composingBase"), jSONObject.getInt("composingExtent"), jSONObject.getString("text"));
    }
}
