package M;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final String f396a;

    /* renamed from: b, reason: collision with root package name */
    public final int f397b;

    /* renamed from: c, reason: collision with root package name */
    public final int f398c;

    /* renamed from: d, reason: collision with root package name */
    public final int f399d;

    /* renamed from: e, reason: collision with root package name */
    public final int f400e;

    public p(String str, int i2, int i3, int i4, int i5) {
        if (!(i2 == -1 && i3 == -1) && (i2 < 0 || i3 < 0)) {
            throw new IndexOutOfBoundsException("invalid selection: (" + String.valueOf(i2) + ", " + String.valueOf(i3) + ")");
        }
        if (!(i4 == -1 && i5 == -1) && (i4 < 0 || i4 > i5)) {
            throw new IndexOutOfBoundsException("invalid composing range: (" + String.valueOf(i4) + ", " + String.valueOf(i5) + ")");
        }
        if (i5 > str.length()) {
            throw new IndexOutOfBoundsException("invalid composing start: " + String.valueOf(i4));
        }
        if (i2 > str.length()) {
            throw new IndexOutOfBoundsException("invalid selection start: " + String.valueOf(i2));
        }
        if (i3 > str.length()) {
            throw new IndexOutOfBoundsException("invalid selection end: " + String.valueOf(i3));
        }
        this.f396a = str;
        this.f397b = i2;
        this.f398c = i3;
        this.f399d = i4;
        this.f400e = i5;
    }

    public static p a(JSONObject jSONObject) {
        return new p(jSONObject.getString("text"), jSONObject.getInt("selectionBase"), jSONObject.getInt("selectionExtent"), jSONObject.getInt("composingBase"), jSONObject.getInt("composingExtent"));
    }
}
