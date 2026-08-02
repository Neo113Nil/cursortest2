package defpackage;

import android.text.TextUtils;
import com.google.android.gms.common.data.DataHolder;
import j$.util.Objects;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cpf {
    public final DataHolder a;
    public int b;
    public int c;

    public cpf(DataHolder dataHolder, int i) {
        int length;
        this.a = dataHolder;
        int i2 = 0;
        oy.ap(i >= 0 && i < dataHolder.h);
        this.b = i;
        oy.ap(i >= 0 && i < dataHolder.h);
        while (true) {
            int[] iArr = dataHolder.g;
            length = iArr.length;
            if (i2 >= length) {
                break;
            }
            if (i < iArr[i2]) {
                i2--;
                break;
            }
            i2++;
        }
        this.c = i2 == length ? i2 - 1 : i2;
    }

    public final String a(String str) {
        int i = this.b;
        int i2 = this.c;
        DataHolder dataHolder = this.a;
        dataHolder.a(str, i);
        return dataHolder.d[i2].getString(i, dataHolder.c.getInt(str));
    }

    public final String b() {
        return dbe.a.a(a("avatar"));
    }

    public final String c() {
        return !TextUtils.isEmpty(a("display_name")) ? a("display_name") : a("account_name");
    }

    public final String d() {
        return f() ? a("family_name") : "null";
    }

    public final String e() {
        return g() ? a("given_name") : "null";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cpf) {
            cpf cpfVar = (cpf) obj;
            if (Objects.equals(Integer.valueOf(cpfVar.b), Integer.valueOf(this.b)) && Objects.equals(Integer.valueOf(cpfVar.c), Integer.valueOf(this.c)) && cpfVar.a == this.a) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        return !TextUtils.isEmpty(a("family_name"));
    }

    public final boolean g() {
        return !TextUtils.isEmpty(a("given_name"));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.c), this.a});
    }
}
