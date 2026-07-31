package p2;

import android.os.Bundle;
import r0.i;

/* loaded from: classes.dex */
public final class z implements r0.i {

    /* renamed from: j, reason: collision with root package name */
    public static final z f20104j = new z(0, 0);

    /* renamed from: k, reason: collision with root package name */
    public static final i.a<z> f20105k = new i.a() { // from class: p2.y
        @Override // r0.i.a
        public final r0.i a(Bundle bundle) {
            z c7;
            c7 = z.c(bundle);
            return c7;
        }
    };

    /* renamed from: f, reason: collision with root package name */
    public final int f20106f;

    /* renamed from: g, reason: collision with root package name */
    public final int f20107g;

    /* renamed from: h, reason: collision with root package name */
    public final int f20108h;

    /* renamed from: i, reason: collision with root package name */
    public final float f20109i;

    public z(int i7, int i8) {
        this(i7, i8, 0, 1.0f);
    }

    public z(int i7, int i8, int i9, float f7) {
        this.f20106f = i7;
        this.f20107g = i8;
        this.f20108h = i9;
        this.f20109i = f7;
    }

    private static String b(int i7) {
        return Integer.toString(i7, 36);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ z c(Bundle bundle) {
        return new z(bundle.getInt(b(0), 0), bundle.getInt(b(1), 0), bundle.getInt(b(2), 0), bundle.getFloat(b(3), 1.0f));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.f20106f == zVar.f20106f && this.f20107g == zVar.f20107g && this.f20108h == zVar.f20108h && this.f20109i == zVar.f20109i;
    }

    public int hashCode() {
        return ((((((217 + this.f20106f) * 31) + this.f20107g) * 31) + this.f20108h) * 31) + Float.floatToRawIntBits(this.f20109i);
    }
}
