package v0;

import android.util.Base64;
import java.util.Arrays;
import s0.EnumC1186c;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f10554a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f10555b;

    /* renamed from: c, reason: collision with root package name */
    public final EnumC1186c f10556c;

    public i(String str, byte[] bArr, EnumC1186c enumC1186c) {
        this.f10554a = str;
        this.f10555b = bArr;
        this.f10556c = enumC1186c;
    }

    public static A0.f a() {
        A0.f fVar = new A0.f(23, false);
        fVar.f25d = EnumC1186c.f10290a;
        return fVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.f10554a.equals(iVar.f10554a) && Arrays.equals(this.f10555b, iVar.f10555b) && this.f10556c.equals(iVar.f10556c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f10554a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f10555b)) * 1000003) ^ this.f10556c.hashCode();
    }

    public final String toString() {
        byte[] bArr = this.f10555b;
        return "TransportContext(" + this.f10554a + ", " + this.f10556c + ", " + (bArr == null ? "" : Base64.encodeToString(bArr, 2)) + ")";
    }
}
