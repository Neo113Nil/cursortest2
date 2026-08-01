package p2;

import com.onesignal.core.activities.PermissionsActivity;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class s implements Comparable {

    /* renamed from: e, reason: collision with root package name */
    public static final s f7642e;

    /* renamed from: i, reason: collision with root package name */
    public static final s f7643i;

    /* renamed from: r, reason: collision with root package name */
    public static final s f7644r;

    /* renamed from: s, reason: collision with root package name */
    public static final s f7645s;

    /* renamed from: t, reason: collision with root package name */
    public static final s f7646t;

    /* renamed from: u, reason: collision with root package name */
    public static final s f7647u;

    /* renamed from: d, reason: collision with root package name */
    public final int f7648d;

    static {
        s sVar = new s(100);
        s sVar2 = new s(200);
        s sVar3 = new s(300);
        s sVar4 = new s(400);
        f7642e = sVar4;
        s sVar5 = new s(PermissionsActivity.DELAY_TIME_CALLBACK_CALL);
        f7643i = sVar5;
        s sVar6 = new s(600);
        f7644r = sVar6;
        s sVar7 = new s(700);
        s sVar8 = new s(800);
        s sVar9 = new s(900);
        f7645s = sVar4;
        f7646t = sVar5;
        f7647u = sVar7;
        kotlin.collections.y.f(sVar, sVar2, sVar3, sVar4, sVar5, sVar6, sVar7, sVar8, sVar9);
    }

    public s(int i3) {
        this.f7648d = i3;
        boolean z10 = false;
        if (1 <= i3 && i3 < 1001) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        r2.a.a("Font weight can be in range [1, 1000]. Current value: " + i3);
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(s sVar) {
        return Intrinsics.b(this.f7648d, sVar.f7648d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s) {
            return this.f7648d == ((s) obj).f7648d;
        }
        return false;
    }

    public final int hashCode() {
        return this.f7648d;
    }

    public final String toString() {
        return v4.a.m(new StringBuilder("FontWeight(weight="), this.f7648d, ')');
    }
}
