package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Iterator;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class o9 implements Iterator, yb0 {
    public int d;
    public int e;
    public boolean g;
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o9(s9 s9Var, int i) {
        this(s9Var.g);
        this.h = i;
        switch (i) {
            case 1:
                this.i = s9Var;
                this(s9Var.g);
                break;
            default:
                this.i = s9Var;
                break;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.e < this.d;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object e;
        if (!hasNext()) {
            dd0.c();
            return null;
        }
        int i = this.e;
        int i2 = this.h;
        Object obj = this.i;
        switch (i2) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                e = ((s9) obj).e(i);
                break;
            case 1:
                e = ((s9) obj).h(i);
                break;
            default:
                e = ((t9) obj).e[i];
                break;
        }
        this.e++;
        this.g = true;
        return e;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.g) {
            dd0.j("Call next() before removing an element.");
            return;
        }
        int i = this.e - 1;
        this.e = i;
        int i2 = this.h;
        Object obj = this.i;
        switch (i2) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((s9) obj).f(i);
                break;
            case 1:
                ((s9) obj).f(i);
                break;
            default:
                ((t9) obj).a(i);
                break;
        }
        this.d--;
        this.g = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o9(t9 t9Var) {
        this(t9Var.g);
        this.h = 2;
        this.i = t9Var;
    }

    public o9(int i) {
        this.d = i;
    }
}
