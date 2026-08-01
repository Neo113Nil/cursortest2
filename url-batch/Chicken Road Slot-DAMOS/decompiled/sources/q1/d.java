package q1;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f7817a;

    /* renamed from: b, reason: collision with root package name */
    public final float f7818b;

    /* renamed from: c, reason: collision with root package name */
    public final float f7819c;

    /* renamed from: d, reason: collision with root package name */
    public final float f7820d;

    /* renamed from: e, reason: collision with root package name */
    public final float f7821e;

    /* renamed from: f, reason: collision with root package name */
    public final float f7822f;
    public final float g;

    /* renamed from: h, reason: collision with root package name */
    public final float f7823h;

    /* renamed from: i, reason: collision with root package name */
    public final List f7824i;
    public final ArrayList j;

    public d(String str, float f3, float f10, float f11, float f12, float f13, float f14, float f15, List list, int i3) {
        str = (i3 & 1) != 0 ? "" : str;
        f3 = (i3 & 2) != 0 ? 0.0f : f3;
        f10 = (i3 & 4) != 0 ? 0.0f : f10;
        f11 = (i3 & 8) != 0 ? 0.0f : f11;
        f12 = (i3 & 16) != 0 ? 1.0f : f12;
        f13 = (i3 & 32) != 0 ? 1.0f : f13;
        f14 = (i3 & 64) != 0 ? 0.0f : f14;
        f15 = (i3 & 128) != 0 ? 0.0f : f15;
        list = (i3 & 256) != 0 ? g0.f7869a : list;
        ArrayList arrayList = new ArrayList();
        this.f7817a = str;
        this.f7818b = f3;
        this.f7819c = f10;
        this.f7820d = f11;
        this.f7821e = f12;
        this.f7822f = f13;
        this.g = f14;
        this.f7823h = f15;
        this.f7824i = list;
        this.j = arrayList;
    }
}
