package m0;

import org.json.JSONObject;

/* renamed from: m0.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0207q {

    /* renamed from: a, reason: collision with root package name */
    public final String f2774a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2775b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2776c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2777d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2778e;

    public C0207q(String str, int i2, int i3, int i4, int i5) {
        if (!(i2 == -1 && i3 == -1) && (i2 < 0 || i3 < 0)) {
            throw new IndexOutOfBoundsException("invalid selection: (" + i2 + ", " + i3 + ")");
        }
        if (!(i4 == -1 && i5 == -1) && (i4 < 0 || i4 > i5)) {
            throw new IndexOutOfBoundsException("invalid composing range: (" + i4 + ", " + i5 + ")");
        }
        if (i5 > str.length()) {
            throw new IndexOutOfBoundsException(F0.h.e("invalid composing start: ", i4));
        }
        if (i2 > str.length()) {
            throw new IndexOutOfBoundsException(F0.h.e("invalid selection start: ", i2));
        }
        if (i3 > str.length()) {
            throw new IndexOutOfBoundsException(F0.h.e("invalid selection end: ", i3));
        }
        this.f2774a = str;
        this.f2775b = i2;
        this.f2776c = i3;
        this.f2777d = i4;
        this.f2778e = i5;
    }

    public static C0207q a(JSONObject jSONObject) {
        return new C0207q(jSONObject.getString("text"), jSONObject.getInt("selectionBase"), jSONObject.getInt("selectionExtent"), jSONObject.getInt("composingBase"), jSONObject.getInt("composingExtent"));
    }
}
