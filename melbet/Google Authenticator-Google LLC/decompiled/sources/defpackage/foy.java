package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.StateSet;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class foy implements fof {
    final int a;
    final fog b;
    final int[][] c;
    final fog[] d;

    public foy(fox foxVar) {
        this.a = foxVar.a;
        this.b = foxVar.b;
        this.c = foxVar.c;
        this.d = foxVar.d;
    }

    public static foy f(Context context, TypedArray typedArray, int i) {
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId != 0 && Objects.equals(context.getResources().getResourceTypeName(resourceId), "xml")) {
            return new fox(context, resourceId).a();
        }
        return null;
    }

    private final int g(int[] iArr) {
        for (int i = 0; i < this.a; i++) {
            if (StateSet.stateSetMatches(this.c[i], iArr)) {
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.fof
    public final fog a() {
        return this.b;
    }

    @Override // defpackage.fof
    public final fog b(int[] iArr) {
        int g = g(iArr);
        if (g < 0) {
            g = g(StateSet.WILD_CARD);
        }
        return this.d[g];
    }

    @Override // defpackage.fof
    public final fog c(float f) {
        return this.b.c(f);
    }

    @Override // defpackage.fof
    public final boolean d() {
        return this.a > 1;
    }

    @Override // defpackage.fof
    public final fog[] e() {
        return this.d;
    }
}
