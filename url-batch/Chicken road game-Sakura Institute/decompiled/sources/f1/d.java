package f1;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f3105a;

    /* renamed from: b, reason: collision with root package name */
    public final float f3106b;

    /* renamed from: c, reason: collision with root package name */
    public final float f3107c;

    /* renamed from: d, reason: collision with root package name */
    public final float f3108d;

    /* renamed from: e, reason: collision with root package name */
    public final float f3109e;

    /* renamed from: f, reason: collision with root package name */
    public final float f3110f;

    /* renamed from: g, reason: collision with root package name */
    public final float f3111g;

    /* renamed from: h, reason: collision with root package name */
    public final float f3112h;

    /* renamed from: i, reason: collision with root package name */
    public final List f3113i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f3114j;

    public d(String str, float f9, float f10, float f11, float f12, float f13, float f14, float f15, List list, int i7) {
        str = (i7 & 1) != 0 ? "" : str;
        f9 = (i7 & 2) != 0 ? 0.0f : f9;
        f10 = (i7 & 4) != 0 ? 0.0f : f10;
        f11 = (i7 & 8) != 0 ? 0.0f : f11;
        f12 = (i7 & 16) != 0 ? 1.0f : f12;
        f13 = (i7 & 32) != 0 ? 1.0f : f13;
        f14 = (i7 & 64) != 0 ? 0.0f : f14;
        f15 = (i7 & 128) != 0 ? 0.0f : f15;
        if ((i7 & 256) != 0) {
            int i8 = i0.f3188a;
            list = e6.u.f2826f;
        }
        ArrayList arrayList = new ArrayList();
        this.f3105a = str;
        this.f3106b = f9;
        this.f3107c = f10;
        this.f3108d = f11;
        this.f3109e = f12;
        this.f3110f = f13;
        this.f3111g = f14;
        this.f3112h = f15;
        this.f3113i = list;
        this.f3114j = arrayList;
    }
}
