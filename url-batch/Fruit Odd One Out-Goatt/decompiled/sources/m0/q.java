package m0;

import org.json.JSONObject;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final String f835a;

    /* renamed from: b, reason: collision with root package name */
    public final int f836b;

    /* renamed from: c, reason: collision with root package name */
    public final int f837c;

    /* renamed from: d, reason: collision with root package name */
    public final int f838d;

    /* renamed from: e, reason: collision with root package name */
    public final int f839e;

    public q(String str, int i2, int i3, int i4, int i5) {
        if (!(i2 == -1 && i3 == -1) && (i2 < 0 || i3 < 0)) {
            throw new IndexOutOfBoundsException("invalid selection: (" + i2 + ", " + i3 + ")");
        }
        if (!(i4 == -1 && i5 == -1) && (i4 < 0 || i4 > i5)) {
            throw new IndexOutOfBoundsException("invalid composing range: (" + i4 + ", " + i5 + ")");
        }
        if (i5 > str.length()) {
            f0.l.c("invalid composing start: ", i4);
            throw null;
        }
        if (i2 > str.length()) {
            f0.l.c("invalid selection start: ", i2);
            throw null;
        }
        if (i3 > str.length()) {
            f0.l.c("invalid selection end: ", i3);
            throw null;
        }
        this.f835a = str;
        this.f836b = i2;
        this.f837c = i3;
        this.f838d = i4;
        this.f839e = i5;
    }

    public static q a(JSONObject jSONObject) {
        return new q(jSONObject.getString("text"), jSONObject.getInt("selectionBase"), jSONObject.getInt("selectionExtent"), jSONObject.getInt("composingBase"), jSONObject.getInt("composingExtent"));
    }
}
