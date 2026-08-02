package O1;

import E1.AbstractC0033i;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final String f1205a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1206b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1207c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1208d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1209e;

    public p(String str, int i3, int i4, int i5, int i6) {
        if (!(i3 == -1 && i4 == -1) && (i3 < 0 || i4 < 0)) {
            throw new IndexOutOfBoundsException("invalid selection: (" + i3 + ", " + i4 + ")");
        }
        if (!(i5 == -1 && i6 == -1) && (i5 < 0 || i5 > i6)) {
            throw new IndexOutOfBoundsException("invalid composing range: (" + i5 + ", " + i6 + ")");
        }
        if (i6 > str.length()) {
            throw new IndexOutOfBoundsException(AbstractC0033i.h(i5, "invalid composing start: "));
        }
        if (i3 > str.length()) {
            throw new IndexOutOfBoundsException(AbstractC0033i.h(i3, "invalid selection start: "));
        }
        if (i4 > str.length()) {
            throw new IndexOutOfBoundsException(AbstractC0033i.h(i4, "invalid selection end: "));
        }
        this.f1205a = str;
        this.f1206b = i3;
        this.f1207c = i4;
        this.f1208d = i5;
        this.f1209e = i6;
    }

    public static p a(JSONObject jSONObject) {
        return new p(jSONObject.getString("text"), jSONObject.getInt("selectionBase"), jSONObject.getInt("selectionExtent"), jSONObject.getInt("composingBase"), jSONObject.getInt("composingExtent"));
    }
}
