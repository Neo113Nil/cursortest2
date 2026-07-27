package G2;

import b2.AbstractC0279e;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final String f997a;

    /* renamed from: b, reason: collision with root package name */
    public final int f998b;

    /* renamed from: c, reason: collision with root package name */
    public final int f999c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1000d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1001e;

    public o(String str, int i2, int i3, int i6, int i7) {
        if (!(i2 == -1 && i3 == -1) && (i2 < 0 || i3 < 0)) {
            throw new IndexOutOfBoundsException("invalid selection: (" + i2 + ", " + i3 + ")");
        }
        if (!(i6 == -1 && i7 == -1) && (i6 < 0 || i6 > i7)) {
            throw new IndexOutOfBoundsException("invalid composing range: (" + i6 + ", " + i7 + ")");
        }
        if (i7 > str.length()) {
            throw new IndexOutOfBoundsException(AbstractC0279e.d(i6, "invalid composing start: "));
        }
        if (i2 > str.length()) {
            throw new IndexOutOfBoundsException(AbstractC0279e.d(i2, "invalid selection start: "));
        }
        if (i3 > str.length()) {
            throw new IndexOutOfBoundsException(AbstractC0279e.d(i3, "invalid selection end: "));
        }
        this.f997a = str;
        this.f998b = i2;
        this.f999c = i3;
        this.f1000d = i6;
        this.f1001e = i7;
    }

    public static o a(JSONObject jSONObject) {
        return new o(jSONObject.getString("text"), jSONObject.getInt("selectionBase"), jSONObject.getInt("selectionExtent"), jSONObject.getInt("composingBase"), jSONObject.getInt("composingExtent"));
    }
}
