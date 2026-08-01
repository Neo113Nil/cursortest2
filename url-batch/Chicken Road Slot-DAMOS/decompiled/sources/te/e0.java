package te;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class e0 extends d1 {

    /* renamed from: l, reason: collision with root package name */
    public final boolean f9369l;

    public e0(String str, f0 f0Var) {
        super(str, f0Var, 1);
        this.f9369l = true;
    }

    @Override // re.e
    public final boolean e() {
        return this.f9369l;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [hd.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [hd.g, java.lang.Object] */
    @Override // te.d1
    public final boolean equals(Object obj) {
        int i3;
        if (this == obj) {
            return true;
        }
        if (obj instanceof e0) {
            re.e eVar = (re.e) obj;
            if (Intrinsics.a(this.f9357a, eVar.a())) {
                e0 e0Var = (e0) obj;
                if (e0Var.f9369l && Arrays.equals((re.e[]) this.j.getValue(), (re.e[]) e0Var.j.getValue())) {
                    int c10 = eVar.c();
                    int i10 = this.f9359c;
                    if (i10 == c10) {
                        for (0; i3 < i10; i3 + 1) {
                            i3 = (Intrinsics.a(h(i3).a(), eVar.h(i3).a()) && Intrinsics.a(h(i3).b(), eVar.h(i3).b())) ? i3 + 1 : 0;
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // te.d1
    public final int hashCode() {
        return super.hashCode() * 31;
    }
}
