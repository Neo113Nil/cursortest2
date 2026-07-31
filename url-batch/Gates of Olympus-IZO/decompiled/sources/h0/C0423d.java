package h0;

import java.util.ArrayList;
import java.util.List;

/* renamed from: h0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0423d {

    /* renamed from: a, reason: collision with root package name */
    public final String f4938a;

    /* renamed from: b, reason: collision with root package name */
    public final float f4939b;

    /* renamed from: c, reason: collision with root package name */
    public final float f4940c;

    /* renamed from: d, reason: collision with root package name */
    public final float f4941d;

    /* renamed from: e, reason: collision with root package name */
    public final float f4942e;

    /* renamed from: f, reason: collision with root package name */
    public final float f4943f;

    /* renamed from: g, reason: collision with root package name */
    public final float f4944g;

    /* renamed from: h, reason: collision with root package name */
    public final float f4945h;

    /* renamed from: i, reason: collision with root package name */
    public final List f4946i;

    /* renamed from: j, reason: collision with root package name */
    public final List f4947j;

    public C0423d(String str, float f3, float f4, float f5, float f6, float f7, float f8, float f9, List list, int i3) {
        str = (i3 & 1) != 0 ? "" : str;
        f3 = (i3 & 2) != 0 ? 0.0f : f3;
        f4 = (i3 & 4) != 0 ? 0.0f : f4;
        f5 = (i3 & 8) != 0 ? 0.0f : f5;
        f6 = (i3 & 16) != 0 ? 1.0f : f6;
        f7 = (i3 & 32) != 0 ? 1.0f : f7;
        f8 = (i3 & 64) != 0 ? 0.0f : f8;
        f9 = (i3 & 128) != 0 ? 0.0f : f9;
        if ((i3 & 256) != 0) {
            int i4 = G.f4893a;
            list = M1.u.f2803d;
        }
        ArrayList arrayList = new ArrayList();
        this.f4938a = str;
        this.f4939b = f3;
        this.f4940c = f4;
        this.f4941d = f5;
        this.f4942e = f6;
        this.f4943f = f7;
        this.f4944g = f8;
        this.f4945h = f9;
        this.f4946i = list;
        this.f4947j = arrayList;
    }
}
