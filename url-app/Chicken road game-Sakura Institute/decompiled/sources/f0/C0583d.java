package f0;

import java.util.ArrayList;
import java.util.List;

/* renamed from: f0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0583d {

    /* renamed from: a, reason: collision with root package name */
    public final String f6352a;

    /* renamed from: b, reason: collision with root package name */
    public final float f6353b;

    /* renamed from: c, reason: collision with root package name */
    public final float f6354c;

    /* renamed from: d, reason: collision with root package name */
    public final float f6355d;

    /* renamed from: e, reason: collision with root package name */
    public final float f6356e;

    /* renamed from: f, reason: collision with root package name */
    public final float f6357f;

    /* renamed from: g, reason: collision with root package name */
    public final float f6358g;

    /* renamed from: h, reason: collision with root package name */
    public final float f6359h;

    /* renamed from: i, reason: collision with root package name */
    public final List f6360i;

    /* renamed from: j, reason: collision with root package name */
    public final List f6361j;

    public C0583d(String str, float f4, float f5, float f6, float f7, float f8, float f9, float f10, List list, int i2) {
        str = (i2 & 1) != 0 ? "" : str;
        f4 = (i2 & 2) != 0 ? 0.0f : f4;
        f5 = (i2 & 4) != 0 ? 0.0f : f5;
        f6 = (i2 & 8) != 0 ? 0.0f : f6;
        f7 = (i2 & 16) != 0 ? 1.0f : f7;
        f8 = (i2 & 32) != 0 ? 1.0f : f8;
        f9 = (i2 & 64) != 0 ? 0.0f : f9;
        f10 = (i2 & 128) != 0 ? 0.0f : f10;
        list = (i2 & 256) != 0 ? AbstractC0576G.f6305a : list;
        ArrayList arrayList = new ArrayList();
        this.f6352a = str;
        this.f6353b = f4;
        this.f6354c = f5;
        this.f6355d = f6;
        this.f6356e = f7;
        this.f6357f = f8;
        this.f6358g = f9;
        this.f6359h = f10;
        this.f6360i = list;
        this.f6361j = arrayList;
    }
}
