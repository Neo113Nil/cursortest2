package s7;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Objects;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: f, reason: collision with root package name */
    public static final o f8886f = new o((Boolean) null, 100, (Boolean) null, (String) null);

    /* renamed from: a, reason: collision with root package name */
    public final int f8887a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8888b;

    /* renamed from: c, reason: collision with root package name */
    public final Boolean f8889c;

    /* renamed from: d, reason: collision with root package name */
    public final String f8890d;

    /* renamed from: e, reason: collision with root package name */
    public final EnumMap f8891e;

    public o(Boolean bool, int i3, Boolean bool2, String str) {
        EnumMap enumMap = new EnumMap(b2.class);
        this.f8891e = enumMap;
        enumMap.put((EnumMap) b2.AD_USER_DATA, (b2) (bool == null ? z1.UNINITIALIZED : bool.booleanValue() ? z1.GRANTED : z1.DENIED));
        this.f8887a = i3;
        this.f8888b = d();
        this.f8889c = bool2;
        this.f8890d = str;
    }

    public static o b(String str) {
        if (str == null || str.length() <= 0) {
            return f8886f;
        }
        String[] split = str.split(":");
        int parseInt = Integer.parseInt(split[0]);
        EnumMap enumMap = new EnumMap(b2.class);
        b2[] b2VarArr = a2.DMA.f8501d;
        int length = b2VarArr.length;
        int i3 = 1;
        int i10 = 0;
        while (i10 < length) {
            enumMap.put((EnumMap) b2VarArr[i10], (b2) c2.e(split[i3].charAt(0)));
            i10++;
            i3++;
        }
        return new o(enumMap, parseInt, (Boolean) null, (String) null);
    }

    public static o c(Bundle bundle, int i3) {
        if (bundle == null) {
            return new o((Boolean) null, i3, (Boolean) null, (String) null);
        }
        EnumMap enumMap = new EnumMap(b2.class);
        for (b2 b2Var : a2.DMA.f8501d) {
            enumMap.put((EnumMap) b2Var, (b2) c2.d(bundle.getString(b2Var.f8521d)));
        }
        return new o(enumMap, i3, bundle.containsKey("is_dma_region") ? Boolean.valueOf(bundle.getString("is_dma_region")) : null, bundle.getString("cps_display_str"));
    }

    public final z1 a() {
        z1 z1Var = (z1) this.f8891e.get(b2.AD_USER_DATA);
        return z1Var == null ? z1.UNINITIALIZED : z1Var;
    }

    public final String d() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f8887a);
        for (b2 b2Var : a2.DMA.f8501d) {
            sb2.append(":");
            sb2.append(c2.h((z1) this.f8891e.get(b2Var)));
        }
        return sb2.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (this.f8888b.equalsIgnoreCase(oVar.f8888b) && Objects.equals(this.f8889c, oVar.f8889c)) {
            return Objects.equals(this.f8890d, oVar.f8890d);
        }
        return false;
    }

    public final int hashCode() {
        Boolean bool = this.f8889c;
        int i3 = bool == null ? 3 : true != bool.booleanValue() ? 13 : 7;
        String str = this.f8890d;
        return ((str == null ? 17 : str.hashCode()) * 137) + this.f8888b.hashCode() + (i3 * 29);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("source=");
        sb2.append(c2.a(this.f8887a));
        for (b2 b2Var : a2.DMA.f8501d) {
            sb2.append(",");
            sb2.append(b2Var.f8521d);
            sb2.append("=");
            z1 z1Var = (z1) this.f8891e.get(b2Var);
            if (z1Var == null) {
                sb2.append("uninitialized");
            } else {
                int ordinal = z1Var.ordinal();
                if (ordinal == 0) {
                    sb2.append("uninitialized");
                } else if (ordinal == 1) {
                    sb2.append("eu_consent_policy");
                } else if (ordinal == 2) {
                    sb2.append("denied");
                } else if (ordinal == 3) {
                    sb2.append("granted");
                }
            }
        }
        Boolean bool = this.f8889c;
        if (bool != null) {
            sb2.append(",isDmaRegion=");
            sb2.append(bool);
        }
        String str = this.f8890d;
        if (str != null) {
            sb2.append(",cpsDisplayStr=");
            sb2.append(str);
        }
        return sb2.toString();
    }

    public o(EnumMap enumMap, int i3, Boolean bool, String str) {
        EnumMap enumMap2 = new EnumMap(b2.class);
        this.f8891e = enumMap2;
        enumMap2.putAll(enumMap);
        this.f8887a = i3;
        this.f8888b = d();
        this.f8889c = bool;
        this.f8890d = str;
    }
}
