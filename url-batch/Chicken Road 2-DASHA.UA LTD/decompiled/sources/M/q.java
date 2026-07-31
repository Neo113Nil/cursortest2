package M;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final String f338a;

    /* renamed from: b, reason: collision with root package name */
    public final int f339b;

    /* renamed from: c, reason: collision with root package name */
    public final int f340c;

    /* renamed from: d, reason: collision with root package name */
    public final int f341d;

    /* renamed from: e, reason: collision with root package name */
    public final int f342e;

    public q(String str, int i2, int i3, int i4, int i5) {
        if (!(i2 == -1 && i3 == -1) && (i2 < 0 || i3 < 0)) {
            throw new IndexOutOfBoundsException("invalid selection: (" + i2 + ", " + i3 + ")");
        }
        if (!(i4 == -1 && i5 == -1) && (i4 < 0 || i4 > i5)) {
            throw new IndexOutOfBoundsException("invalid composing range: (" + i4 + ", " + i5 + ")");
        }
        if (i5 > str.length()) {
            throw new IndexOutOfBoundsException("invalid composing start: " + i4);
        }
        if (i2 > str.length()) {
            throw new IndexOutOfBoundsException("invalid selection start: " + i2);
        }
        if (i3 > str.length()) {
            throw new IndexOutOfBoundsException("invalid selection end: " + i3);
        }
        this.f338a = str;
        this.f339b = i2;
        this.f340c = i3;
        this.f341d = i4;
        this.f342e = i5;
    }

    public static q a(JSONObject jSONObject) {
        return new q(jSONObject.getString("text"), jSONObject.getInt("selectionBase"), jSONObject.getInt("selectionExtent"), jSONObject.getInt("composingBase"), jSONObject.getInt("composingExtent"));
    }
}
