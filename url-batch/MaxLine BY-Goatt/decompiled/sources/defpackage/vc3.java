package defpackage;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Objects;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class vc3 {
    public static final vc3 f = new vc3((Boolean) null, 100, (Boolean) null, (String) null);
    public final int a;
    public final String b;
    public final Boolean c;
    public final String d;
    public final EnumMap e;

    public vc3(Boolean bool, int i, Boolean bool2, String str) {
        EnumMap enumMap = new EnumMap(vk3.class);
        this.e = enumMap;
        enumMap.put((EnumMap) vk3.AD_USER_DATA, (vk3) (bool == null ? sk3.UNINITIALIZED : bool.booleanValue() ? sk3.GRANTED : sk3.DENIED));
        this.a = i;
        this.b = d();
        this.c = bool2;
        this.d = str;
    }

    public static vc3 b(String str) {
        if (str == null || str.length() <= 0) {
            return f;
        }
        String[] split = str.split(":");
        int parseInt = Integer.parseInt(split[0]);
        EnumMap enumMap = new EnumMap(vk3.class);
        vk3[] vk3VarArr = uk3.DMA.m;
        int length = vk3VarArr.length;
        int i = 1;
        int i2 = 0;
        while (i2 < length) {
            enumMap.put((EnumMap) vk3VarArr[i2], (vk3) xk3.e(split[i].charAt(0)));
            i2++;
            i++;
        }
        return new vc3(enumMap, parseInt, (Boolean) null, (String) null);
    }

    public static vc3 c(int i, Bundle bundle) {
        if (bundle == null) {
            return new vc3((Boolean) null, i, (Boolean) null, (String) null);
        }
        EnumMap enumMap = new EnumMap(vk3.class);
        for (vk3 vk3Var : uk3.DMA.m) {
            enumMap.put((EnumMap) vk3Var, (vk3) xk3.d(bundle.getString(vk3Var.m)));
        }
        return new vc3(enumMap, i, bundle.containsKey("is_dma_region") ? Boolean.valueOf(bundle.getString("is_dma_region")) : null, bundle.getString("cps_display_str"));
    }

    public final sk3 a() {
        sk3 sk3Var = (sk3) this.e.get(vk3.AD_USER_DATA);
        return sk3Var == null ? sk3.UNINITIALIZED : sk3Var;
    }

    public final String d() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        for (vk3 vk3Var : uk3.DMA.m) {
            sb.append(":");
            sb.append(xk3.h((sk3) this.e.get(vk3Var)));
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof vc3)) {
            return false;
        }
        vc3 vc3Var = (vc3) obj;
        if (this.b.equalsIgnoreCase(vc3Var.b) && Objects.equals(this.c, vc3Var.c)) {
            return Objects.equals(this.d, vc3Var.d);
        }
        return false;
    }

    public final int hashCode() {
        Boolean bool = this.c;
        int i = bool == null ? 3 : true != bool.booleanValue() ? 13 : 7;
        String str = this.d;
        return ((str == null ? 17 : str.hashCode()) * 137) + this.b.hashCode() + (i * 29);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(xk3.a(this.a));
        for (vk3 vk3Var : uk3.DMA.m) {
            sb.append(",");
            sb.append(vk3Var.m);
            sb.append("=");
            sk3 sk3Var = (sk3) this.e.get(vk3Var);
            if (sk3Var == null) {
                sb.append("uninitialized");
            } else {
                int ordinal = sk3Var.ordinal();
                if (ordinal == 0) {
                    sb.append("uninitialized");
                } else if (ordinal == 1) {
                    sb.append("eu_consent_policy");
                } else if (ordinal == 2) {
                    sb.append("denied");
                } else if (ordinal == 3) {
                    sb.append("granted");
                }
            }
        }
        Boolean bool = this.c;
        if (bool != null) {
            sb.append(",isDmaRegion=");
            sb.append(bool);
        }
        String str = this.d;
        if (str != null) {
            sb.append(",cpsDisplayStr=");
            sb.append(str);
        }
        return sb.toString();
    }

    public vc3(EnumMap enumMap, int i, Boolean bool, String str) {
        EnumMap enumMap2 = new EnumMap(vk3.class);
        this.e = enumMap2;
        enumMap2.putAll(enumMap);
        this.a = i;
        this.b = d();
        this.c = bool;
        this.d = str;
    }
}
