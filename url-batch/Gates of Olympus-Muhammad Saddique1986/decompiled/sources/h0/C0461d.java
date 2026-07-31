package h0;

import java.util.ArrayList;
import java.util.List;

/* renamed from: h0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0461d {

    /* renamed from: a, reason: collision with root package name */
    public final String f5928a;

    /* renamed from: b, reason: collision with root package name */
    public final float f5929b;

    /* renamed from: c, reason: collision with root package name */
    public final float f5930c;

    /* renamed from: d, reason: collision with root package name */
    public final float f5931d;

    /* renamed from: e, reason: collision with root package name */
    public final float f5932e;

    /* renamed from: f, reason: collision with root package name */
    public final float f5933f;

    /* renamed from: g, reason: collision with root package name */
    public final float f5934g;

    /* renamed from: h, reason: collision with root package name */
    public final float f5935h;

    /* renamed from: i, reason: collision with root package name */
    public final List f5936i;

    /* renamed from: j, reason: collision with root package name */
    public final List f5937j;

    public C0461d(String str, float f3, float f4, float f5, float f6, float f7, float f8, float f9, List list, int i3) {
        str = (i3 & 1) != 0 ? "" : str;
        f3 = (i3 & 2) != 0 ? 0.0f : f3;
        f4 = (i3 & 4) != 0 ? 0.0f : f4;
        f5 = (i3 & 8) != 0 ? 0.0f : f5;
        f6 = (i3 & 16) != 0 ? 1.0f : f6;
        f7 = (i3 & 32) != 0 ? 1.0f : f7;
        f8 = (i3 & 64) != 0 ? 0.0f : f8;
        f9 = (i3 & 128) != 0 ? 0.0f : f9;
        if ((i3 & 256) != 0) {
            int i4 = AbstractC0454G.f5881a;
            list = S1.u.f4320d;
        }
        ArrayList arrayList = new ArrayList();
        this.f5928a = str;
        this.f5929b = f3;
        this.f5930c = f4;
        this.f5931d = f5;
        this.f5932e = f6;
        this.f5933f = f7;
        this.f5934g = f8;
        this.f5935h = f9;
        this.f5936i = list;
        this.f5937j = arrayList;
    }
}
