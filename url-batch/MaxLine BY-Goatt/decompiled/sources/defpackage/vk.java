package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class vk {
    public final jk a;
    public final String b;
    public final List c;
    public final Map d;
    public final int e;
    public final int f;

    public vk(jk jkVar, String str, List list, Map map, int i, int i2) {
        str.getClass();
        list.getClass();
        map.getClass();
        this.a = jkVar;
        this.b = str;
        this.c = list;
        this.d = map;
        this.e = i;
        this.f = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vk)) {
            return false;
        }
        vk vkVar = (vk) obj;
        return this.a == vkVar.a && Intrinsics.b(this.b, vkVar.b) && Intrinsics.b(this.c, vkVar.c) && Intrinsics.b(this.d, vkVar.d) && this.e == vkVar.e && this.f == vkVar.f;
    }

    public final int hashCode() {
        jk jkVar = this.a;
        return Integer.hashCode(this.f) + q40.e(this.e, (this.d.hashCode() + ((this.c.hashCode() + in1.j(this.b, (jkVar == null ? 0 : jkVar.hashCode()) * 31, 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        return "AtlasUiState(kind=" + this.a + ", query=" + this.b + ", items=" + this.c + ", progress=" + this.d + ", studied=" + this.e + ", total=" + this.f + ")";
    }
}
